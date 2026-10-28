package defpackage;

import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class qe extends ee implements bog, bpp, bny, dow, qw, rh, avi, avj, auz, ava, ayn {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final qa Companion = new qa();
    private bpo _viewModelStore;
    private final rg activityResultRegistry;
    private int contentLayoutId;
    private final qy contextAwareHelper;
    private final awmi defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final awmi fullyDrawnReporter$delegate;
    private boolean hasPictureInPictureSystemFeature;
    private final awmi isExported$delegate;
    private final ayq menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final awmi onBackPressedDispatcher$delegate;
    private final awmi onBackPressedInput$delegate;
    private final CopyOnWriteArrayList onConfigurationChangedListeners;
    private final CopyOnWriteArrayList onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList onNewIntentListeners;
    private final CopyOnWriteArrayList onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList onPictureInPictureUiStateChangedListeners;
    private final CopyOnWriteArrayList onTrimMemoryListeners;
    private final CopyOnWriteArrayList onUserLeaveHintListeners;
    private final qb reportFullyDrawnExecutor;
    private final dov savedStateRegistryController;

    public qe() {
        this.contextAwareHelper = new qy();
        int i = 1;
        this.menuHostHelper = new ayq(new px(this, i));
        dov dovVarH = api.h(this);
        this.savedStateRegistryController = dovVarH;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter$delegate = new awmp(new py(this, i));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new rg(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList();
        this.onNewIntentListeners = new CopyOnWriteArrayList();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList();
        this.onPictureInPictureUiStateChangedListeners = new CopyOnWriteArrayList();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList();
        int i2 = 0;
        this.onBackPressedInput$delegate = new awmp(new py(this, i2));
        int i3 = 2;
        this.isExported$delegate = new awmp(new py(this, i3));
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().b(new pz(this, i2));
        getLifecycle().b(new pz(this, i3));
        int i4 = 3;
        getLifecycle().b(new pz(this, 3, null));
        dovVarH.b();
        bpd.b(this);
        getSavedStateRegistry().b(ACTIVITY_RESULT_TAG, new cn(this, i4));
        addOnContextAvailableListener(new fw(this, i3));
        this.defaultViewModelProviderFactory$delegate = new awmp(new py(this, i4));
        this.onBackPressedDispatcher$delegate = new awmp(new py(this, 4));
    }

    static final void _init_$lambda$1(qe qeVar, bog bogVar, boa boaVar) {
        Window window;
        View viewPeekDecorView;
        bogVar.getClass();
        boaVar.getClass();
        if (boaVar != boa.ON_STOP || (window = qeVar.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    static final void _init_$lambda$2(qe qeVar, bog bogVar, boa boaVar) {
        bogVar.getClass();
        boaVar.getClass();
        if (boaVar == boa.ON_DESTROY) {
            qeVar.contextAwareHelper.b();
            if (!qeVar.isChangingConfigurations()) {
                qeVar.getViewModelStore().a();
            }
            qeVar.reportFullyDrawnExecutor.a();
        }
    }

    public static final Bundle _init_$lambda$3(qe qeVar) {
        Bundle bundle = new Bundle();
        rg rgVar = qeVar.activityResultRegistry;
        Map map = rgVar.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(rgVar.c));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(rgVar.f));
        return bundle;
    }

    public static final void _init_$lambda$4(qe qeVar, Context context) {
        context.getClass();
        Bundle bundleA = qeVar.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            rg rgVar = qeVar.activityResultRegistry;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                rgVar.c.addAll(stringArrayList2);
            }
            Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle != null) {
                rgVar.f.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                Map map = rgVar.b;
                if (map.containsKey(str)) {
                    Integer num = (Integer) map.remove(str);
                    if (!rgVar.f.containsKey(str)) {
                        rgVar.a.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.getClass();
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                str2.getClass();
                rgVar.c(iIntValue, str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(qv qvVar) {
        getLifecycle().b(new ayp(qvVar, this, 1));
    }

    public static final void addObserverForBackInvoker$lambda$0(qv qvVar, qe qeVar, bog bogVar, boa boaVar) {
        bogVar.getClass();
        boaVar.getClass();
        if (boaVar == boa.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = qeVar.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            qvVar.e(onBackInvokedDispatcher);
        }
    }

    private final qb createFullyDrawnExecutor() {
        return new qc(this);
    }

    static final bpe defaultViewModelProviderFactory_delegate$lambda$0(qe qeVar) {
        return new bpe(qeVar.getApplication(), qeVar, qeVar.getDefaultViewModelArgs());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            ccu ccuVar = (ccu) getLastNonConfigurationInstance();
            if (ccuVar != null) {
                this._viewModelStore = (bpo) ccuVar.b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new bpo();
            }
        }
    }

    static final qp fullyDrawnReporter_delegate$lambda$0(qe qeVar) {
        return new qp(qeVar.reportFullyDrawnExecutor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final awmy fullyDrawnReporter_delegate$lambda$0$0(qe qeVar) throws Throwable {
        qeVar.reportFullyDrawn();
        return awmy.a;
    }

    private final djj getOnBackPressedInput() {
        return (djj) this.onBackPressedInput$delegate.a();
    }

    private final boolean isExported() {
        return ((Boolean) this.isExported$delegate.a()).booleanValue();
    }

    static final boolean isExported_delegate$lambda$0(qe qeVar) {
        try {
            ActivityInfo activityInfo = qeVar.getPackageManager().getActivityInfo(qeVar.getComponentName(), 786432);
            activityInfo.getClass();
            return activityInfo.exported;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    static final qv onBackPressedDispatcher_delegate$lambda$0(qe qeVar) {
        qv qvVar = new qv(new px(qeVar, 0));
        if (Build.VERSION.SDK_INT >= 33) {
            if (awrc.c(Looper.myLooper(), Looper.getMainLooper())) {
                qeVar.addObserverForBackInvoker(qvVar);
            } else {
                new Handler(Looper.getMainLooper()).post(new bg((Object) qeVar, (Object) qvVar, 12, (byte[]) null));
            }
        }
        return qvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressedDispatcher_delegate$lambda$0$0(qe qeVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!awrc.c(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!awrc.c(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    static final djj onBackPressedInput_delegate$lambda$0(qe qeVar) {
        djj djjVar = new djj();
        qeVar.getNavigationEventDispatcher().a(djjVar);
        return djjVar;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.reportFullyDrawnExecutor.b(decorView);
        super.addContentView(view, layoutParams);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public void addMenuProvider(ayr ayrVar, bog bogVar) {
        ayrVar.getClass();
        bogVar.getClass();
        ayq ayqVar = this.menuHostHelper;
        ayqVar.a(ayrVar);
        ?? r0 = ayqVar.c;
        boc lifecycle = bogVar.getLifecycle();
        zg zgVar = (zg) r0.remove(ayrVar);
        if (zgVar != null) {
            zgVar.d();
        }
        r0.put(ayrVar, new zg(lifecycle, new ayp(ayqVar, ayrVar, 0)));
    }

    @Override // defpackage.avi
    public final void addOnConfigurationChangedListener(axo axoVar) {
        axoVar.getClass();
        this.onConfigurationChangedListeners.add(axoVar);
    }

    public final void addOnContextAvailableListener(qz qzVar) {
        qzVar.getClass();
        this.contextAwareHelper.a(qzVar);
    }

    @Override // defpackage.auz
    public final void addOnMultiWindowModeChangedListener(axo axoVar) {
        axoVar.getClass();
        this.onMultiWindowModeChangedListeners.add(axoVar);
    }

    public final void addOnNewIntentListener(axo axoVar) {
        axoVar.getClass();
        this.onNewIntentListeners.add(axoVar);
    }

    @Override // defpackage.ava
    public final void addOnPictureInPictureModeChangedListener(axo axoVar) {
        axoVar.getClass();
        this.onPictureInPictureModeChangedListeners.add(axoVar);
    }

    public final void addOnPictureInPictureUiStateChangedListener(axo axoVar) {
        axoVar.getClass();
        this.onPictureInPictureUiStateChangedListeners.add(axoVar);
    }

    @Override // defpackage.avj
    public final void addOnTrimMemoryListener(axo axoVar) {
        axoVar.getClass();
        this.onTrimMemoryListeners.add(axoVar);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.add(runnable);
    }

    public final void enterPictureInPictureMode(avd avdVar) {
        avdVar.getClass();
        if (this.hasPictureInPictureSystemFeature) {
            throw null;
        }
    }

    @Override // defpackage.rh
    public final rg getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    public Bundle getDefaultViewModelArgs() {
        Intent intent;
        if (isExported() || (intent = getIntent()) == null) {
            return null;
        }
        return intent.getExtras();
    }

    @Override // defpackage.bny
    public bpt getDefaultViewModelCreationExtras() {
        bpv bpvVar = new bpv((byte[]) null);
        if (getApplication() != null) {
            bpvVar.b(bpk.b, getApplication());
        }
        bpvVar.b(bpd.a, this);
        bpvVar.b(bpd.b, this);
        Bundle defaultViewModelArgs = getDefaultViewModelArgs();
        if (defaultViewModelArgs != null) {
            bpvVar.b(bpd.c, defaultViewModelArgs);
        }
        return bpvVar;
    }

    public bpl getDefaultViewModelProviderFactory() {
        return (bpl) this.defaultViewModelProviderFactory$delegate.a();
    }

    public qp getFullyDrawnReporter() {
        return (qp) this.fullyDrawnReporter$delegate.a();
    }

    public Object getLastCustomNonConfigurationInstance() {
        ccu ccuVar = (ccu) getLastNonConfigurationInstance();
        if (ccuVar != null) {
            return ccuVar.a;
        }
        return null;
    }

    @Override // defpackage.ee, defpackage.bog
    public boc getLifecycle() {
        return super.getLifecycle();
    }

    public djl getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().b();
    }

    @Override // defpackage.qw
    public final qv getOnBackPressedDispatcher() {
        return (qv) this.onBackPressedDispatcher$delegate.a();
    }

    @Override // defpackage.dow
    public final dou getSavedStateRegistry() {
        return this.savedStateRegistryController.a();
    }

    @Override // defpackage.bpp
    public bpo getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        bpo bpoVar = this._viewModelStore;
        bpoVar.getClass();
        return bpoVar;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityResultRegistry.e(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        getOnBackPressedInput().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.onConfigurationChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((axo) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.ee, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.savedStateRegistryController.c(bundle);
        this.contextAwareHelper.c(this);
        super.onCreate(bundle);
        int i = bow.a;
        bnz.e(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
        this.hasPictureInPictureSystemFeature = getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(0, menu);
        this.menuHostHelper.b(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.menuHostHelper.e(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator it = this.onMultiWindowModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((axo) it.next()).accept(new acih(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.onNewIntentListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((axo) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.menuHostHelper.b).iterator();
        while (it.hasNext()) {
            ((ayr) it.next()).b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator it = this.onPictureInPictureModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((axo) it.next()).accept(new acih(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        att attVar;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        if (Build.VERSION.SDK_INT >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            attVar = new att();
        } else if (Build.VERSION.SDK_INT >= 31) {
            pictureInPictureUiState.isStashed();
            attVar = new att();
        } else {
            attVar = new att();
        }
        Iterator it = this.onPictureInPictureUiStateChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((axo) it.next()).accept(attVar);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(0, view, menu);
        this.menuHostHelper.c(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.activityResultRegistry.e(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        ccu ccuVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        Object obj = this._viewModelStore;
        if (obj == null && (ccuVar = (ccu) getLastNonConfigurationInstance()) != null) {
            obj = ccuVar.b;
        }
        if (obj == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        ccu ccuVar2 = new ccu();
        ccuVar2.a = objOnRetainCustomNonConfigurationInstance;
        ccuVar2.b = obj;
        return ccuVar2;
    }

    @Override // defpackage.ee, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (getLifecycle() instanceof boh) {
            boc lifecycle = getLifecycle();
            lifecycle.getClass();
            ((boh) lifecycle).f(bob.c);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.d(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.onTrimMemoryListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((axo) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.onUserLeaveHintListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.a;
    }

    public final rc registerForActivityResult(rj rjVar, rg rgVar, rb rbVar) {
        rjVar.getClass();
        rgVar.getClass();
        rbVar.getClass();
        return rgVar.b("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, rjVar, rbVar);
    }

    @Override // defpackage.ayn
    public void removeMenuProvider(ayr ayrVar) {
        ayrVar.getClass();
        this.menuHostHelper.d(ayrVar);
    }

    @Override // defpackage.avi
    public final void removeOnConfigurationChangedListener(axo axoVar) {
        axoVar.getClass();
        this.onConfigurationChangedListeners.remove(axoVar);
    }

    public final void removeOnContextAvailableListener(qz qzVar) {
        qzVar.getClass();
        this.contextAwareHelper.d(qzVar);
    }

    @Override // defpackage.auz
    public final void removeOnMultiWindowModeChangedListener(axo axoVar) {
        axoVar.getClass();
        this.onMultiWindowModeChangedListeners.remove(axoVar);
    }

    public final void removeOnNewIntentListener(axo axoVar) {
        axoVar.getClass();
        this.onNewIntentListeners.remove(axoVar);
    }

    @Override // defpackage.ava
    public final void removeOnPictureInPictureModeChangedListener(axo axoVar) {
        axoVar.getClass();
        this.onPictureInPictureModeChangedListeners.remove(axoVar);
    }

    public final void removeOnPictureInPictureUiStateChangedListener(axo axoVar) {
        axoVar.getClass();
        this.onPictureInPictureUiStateChangedListeners.remove(axoVar);
    }

    @Override // defpackage.avj
    public final void removeOnTrimMemoryListener(axo axoVar) {
        axoVar.getClass();
        this.onTrimMemoryListeners.remove(axoVar);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.remove(runnable);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    @Override // android.app.Activity
    public void reportFullyDrawn() throws Throwable {
        drb.a();
        super.reportFullyDrawn();
        qp fullyDrawnReporter = getFullyDrawnReporter();
        synchronized (fullyDrawnReporter.a) {
            fullyDrawnReporter.b = true;
            ?? r3 = fullyDrawnReporter.c;
            Iterator it = r3.iterator();
            while (it.hasNext()) {
                ((Function0) it.next()).invoke();
            }
            r3.clear();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.reportFullyDrawnExecutor.b(decorView);
        super.setContentView(i);
    }

    public final void setPictureInPictureParams(avd avdVar) {
        avdVar.getClass();
        if (this.hasPictureInPictureSystemFeature) {
            throw null;
        }
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.reportFullyDrawnExecutor.b(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.reportFullyDrawnExecutor.b(decorView);
        super.setContentView(view, layoutParams);
    }

    public final rc registerForActivityResult(rj rjVar, rb rbVar) {
        rjVar.getClass();
        rbVar.getClass();
        return registerForActivityResult(rjVar, this.activityResultRegistry, rbVar);
    }

    @Override // defpackage.ayn
    public void addMenuProvider(ayr ayrVar) {
        ayrVar.getClass();
        this.menuHostHelper.a(ayrVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public void addMenuProvider(final ayr ayrVar, bog bogVar, final bob bobVar) {
        ayrVar.getClass();
        bogVar.getClass();
        bobVar.getClass();
        final ayq ayqVar = this.menuHostHelper;
        ?? r0 = ayqVar.c;
        boc lifecycle = bogVar.getLifecycle();
        zg zgVar = (zg) r0.remove(ayrVar);
        if (zgVar != null) {
            zgVar.d();
        }
        r0.put(ayrVar, new zg(lifecycle, new boe() { // from class: ayo
            /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.lang.Runnable] */
            @Override // defpackage.boe
            public final void a(bog bogVar2, boa boaVar) {
                ayq ayqVar2 = ayqVar;
                ayr ayrVar2 = ayrVar;
                bob bobVar2 = bobVar;
                if (boaVar == bnz.c(bobVar2)) {
                    ayqVar2.a(ayrVar2);
                    return;
                }
                if (boaVar == boa.ON_DESTROY) {
                    ayqVar2.d(ayrVar2);
                } else if (boaVar == bnz.a(bobVar2)) {
                    ((CopyOnWriteArrayList) ayqVar2.b).remove(ayrVar2);
                    ayqVar2.a.run();
                }
            }
        }));
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator it = this.onMultiWindowModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((axo) it.next()).accept(new acih(z));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator it = this.onPictureInPictureModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((axo) it.next()).accept(new acih(z));
        }
    }

    public qe(int i) {
        this();
        this.contentLayoutId = i;
    }
}
