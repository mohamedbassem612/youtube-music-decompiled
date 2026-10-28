package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class cf extends qe {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final boh mFragmentLifecycleRegistry;
    final ci mFragments;
    boolean mResumed;
    boolean mStopped;

    public cf() {
        this.mFragments = new ci(new ce(this), (byte[]) null);
        this.mFragmentLifecycleRegistry = new boh(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        int i = 1;
        getSavedStateRegistry().b(LIFECYCLE_TAG, new cn(this, i));
        addOnConfigurationChangedListener(new cd(this, i));
        addOnNewIntentListener(new cd(this, 0));
        addOnContextAvailableListener(new fw(this, i));
    }

    private static boolean markState(dd ddVar, bob bobVar) {
        boolean zMarkState = false;
        for (cc ccVar : ddVar.k()) {
            if (ccVar != null) {
                if (ccVar.getHost() != null) {
                    zMarkState |= markState(ccVar.getChildFragmentManager(), bobVar);
                }
                dw dwVar = ccVar.mViewLifecycleOwner;
                if (dwVar != null && ((boh) dwVar.getLifecycle()).d.a(bob.d)) {
                    ccVar.mViewLifecycleOwner.a.f(bobVar);
                    zMarkState = true;
                }
                if (ccVar.mLifecycleRegistry.d.a(bob.d)) {
                    ccVar.mLifecycleRegistry.f(bobVar);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return ((ck) this.mFragments.a).e.d.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String strConcat = String.valueOf(str).concat("  ");
            printWriter.print(strConcat);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                bpy.a(this).b(strConcat, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.a().H(str, fileDescriptor, printWriter, strArr);
        }
    }

    public dd getSupportFragmentManager() {
        return this.mFragments.a();
    }

    @Deprecated
    public bpy getSupportLoaderManager() {
        return bpy.a(this);
    }

    /* JADX INFO: renamed from: lambda$init$0$android-support-v4-app-FragmentActivity, reason: not valid java name */
    public /* synthetic */ Bundle m676lambda$init$0$androidsupportv4appFragmentActivity() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.e(boa.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: renamed from: lambda$init$1$android-support-v4-app-FragmentActivity, reason: not valid java name */
    public /* synthetic */ void m677lambda$init$1$androidsupportv4appFragmentActivity(Configuration configuration) {
        this.mFragments.b();
    }

    /* JADX INFO: renamed from: lambda$init$2$android-support-v4-app-FragmentActivity, reason: not valid java name */
    public /* synthetic */ void m678lambda$init$2$androidsupportv4appFragmentActivity(Intent intent) {
        this.mFragments.b();
    }

    /* JADX INFO: renamed from: lambda$init$3$android-support-v4-app-FragmentActivity, reason: not valid java name */
    public /* synthetic */ void m679lambda$init$3$androidsupportv4appFragmentActivity(Context context) {
        Object obj = this.mFragments.a;
        ck ckVar = (ck) obj;
        ckVar.e.o(ckVar, (ch) obj, null);
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), bob.c)) {
        }
    }

    @Override // defpackage.qe, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.b();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.qe, defpackage.ee, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(boa.ON_CREATE);
        ((ck) this.mFragments.a).e.u();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ((ck) this.mFragments.a).e.v();
        this.mFragmentLifecycleRegistry.e(boa.ON_DESTROY);
    }

    @Override // defpackage.qe, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((ck) this.mFragments.a).e.W(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        ((ck) this.mFragments.a).e.B();
        this.mFragmentLifecycleRegistry.e(boa.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // defpackage.qe, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.b();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mFragments.b();
        super.onResume();
        this.mResumed = true;
        this.mFragments.c();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(boa.ON_RESUME);
        ((ck) this.mFragments.a).e.D();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.b();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            ((ck) this.mFragments.a).e.s();
        }
        this.mFragments.c();
        this.mFragmentLifecycleRegistry.e(boa.ON_START);
        ((ck) this.mFragments.a).e.E();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.b();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        ((ck) this.mFragments.a).e.G();
        this.mFragmentLifecycleRegistry.e(boa.ON_STOP);
    }

    public void setEnterSharedElementCallback(ave aveVar) {
        setEnterSharedElementCallback(aveVar != null ? new ata() : null);
    }

    public void setExitSharedElementCallback(ave aveVar) {
        setExitSharedElementCallback(aveVar != null ? new ata() : null);
    }

    public void startActivityFromFragment(cc ccVar, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            ccVar.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(cc ccVar, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            startIntentSenderForResult(intentSender, -1, intent, i2, i3, i4, bundle);
        } else {
            ccVar.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    public void startActivityFromFragment(cc ccVar, Intent intent, int i) {
        startActivityFromFragment(ccVar, intent, i, (Bundle) null);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Deprecated
    public void onAttachFragment(cc ccVar) {
    }

    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public cf(int i) {
        super(i);
        this.mFragments = new ci(new ce(this), (byte[]) null);
        this.mFragmentLifecycleRegistry = new boh(this);
        this.mStopped = true;
        init();
    }
}
