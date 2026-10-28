package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class cc implements ComponentCallbacks, View.OnCreateContextMenuListener, bog, bpp, bny, dow {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    public boolean mAdded;
    by mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mBeingSaved;
    private boolean mCalled;
    public dd mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    private int mContentLayoutId;
    private final ca mContextAwareAttachListener;
    public final qy mContextAwareHelper;
    bpl mDefaultFactory;
    public boolean mDeferStart;
    boolean mDetached;
    public int mFragmentId;
    public dd mFragmentManager;
    public boolean mFromLayout;
    boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public ck mHost;
    public boolean mInDynamicContainer;
    public boolean mInLayout;
    public boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    boh mLifecycleRegistry;
    public bob mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList mOnPreAttachedListeners;
    public cc mParentFragment;
    public boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    private final ca mSavedStateAttachListener;
    public dov mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray mSavedViewState;
    public int mState;
    public String mTag;
    public cc mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    private final dl mTracer;
    public boolean mTransitioning;
    public boolean mUserVisibleHint;
    public View mView;
    public dw mViewLifecycleOwner;
    public bop mViewLifecycleOwnerLiveData;
    public String mWho;

    public cc() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new dd();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new bq(this, 11, null);
        this.mMaxState = bob.e;
        this.mContextAwareHelper = new qy();
        this.mViewLifecycleOwnerLiveData = new bop();
        this.mTracer = new dl();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList();
        this.mSavedStateAttachListener = new bu(this);
        this.mContextAwareAttachListener = new bv(this);
        initLifecycle();
    }

    private by ensureAnimationInfo() {
        by byVar = this.mAnimationInfo;
        if (byVar != null) {
            return byVar;
        }
        by byVar2 = new by();
        this.mAnimationInfo = byVar2;
        return byVar2;
    }

    private int getMinimumMaxLifecycleState() {
        bob bobVar = this.mMaxState;
        return (bobVar == bob.b || this.mParentFragment == null) ? bobVar.ordinal() : Math.min(bobVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private cc getTargetFragment(boolean z) {
        String str;
        if (z) {
            int i = bmy.a;
            bnc bncVar = new bnc(this);
            bmy.d(bncVar);
            bmx bmxVarB = bmy.b(this);
            if (bmxVarB.b.contains(bmw.h) && bmy.e(bmxVarB, getClass(), bncVar.getClass())) {
                bmy.c(bmxVarB, bncVar);
            }
        }
        cc ccVar = this.mTarget;
        if (ccVar != null) {
            return ccVar;
        }
        dd ddVar = this.mFragmentManager;
        if (ddVar == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return ddVar.e(str);
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new boh(this);
        this.mSavedStateRegistryController = api.h(this);
        this.mDefaultFactory = null;
        if (!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            registerOnPreAttachListener(this.mSavedStateAttachListener);
        }
        if (this.mOnPreAttachedListeners.contains(this.mContextAwareAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mContextAwareAttachListener);
    }

    @Deprecated
    public static cc instantiate(Context context, String str, Bundle bundle) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            int i = cj.a;
            try {
                cc ccVar = (cc) cj.a(classLoader, str).getConstructor(null).newInstance(null);
                if (bundle != null) {
                    bundle.setClassLoader(ccVar.getClass().getClassLoader());
                    ccVar.setArguments(bundle);
                }
                return ccVar;
            } catch (ClassCastException e) {
                throw new bz("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
            } catch (ClassNotFoundException e2) {
                throw new bz("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
            }
        } catch (IllegalAccessException e3) {
            throw new bz(a.bT(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (InstantiationException e4) {
            throw new bz(a.bT(str, "Unable to instantiate fragment ", ": make sure class name exists, is public, and has an empty constructor that is public"), e4);
        } catch (NoSuchMethodException e5) {
            throw new bz(a.bT(str, "Unable to instantiate fragment ", ": could not find Fragment constructor"), e5);
        } catch (InvocationTargetException e6) {
            throw new bz(a.bT(str, "Unable to instantiate fragment ", ": calling Fragment constructor caused an exception"), e6);
        }
    }

    private rc prepareCallInternal(rj rjVar, vx vxVar, rb rbVar) {
        if (this.mState > 1) {
            throw new IllegalStateException(a.bV(this, "Fragment ", " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new bs(this, vxVar, atomicReference, rjVar, rbVar));
        return new bt(atomicReference);
    }

    private void registerOnPreAttachListener(ca caVar) {
        if (this.mState >= 0) {
            caVar.a();
        } else {
            this.mOnPreAttachedListeners.add(caVar);
        }
    }

    public void addOnContextAvailableListener(qz qzVar) {
        this.mContextAwareHelper.a(qzVar);
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        dd ddVar;
        by byVar = this.mAnimationInfo;
        if (byVar != null) {
            byVar.u = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (ddVar = this.mFragmentManager) == null) {
            return;
        }
        dl dlVarAn = ddVar.an();
        dlVarAn.getClass();
        eb ebVarC = dl.c(viewGroup, dlVarAn);
        ebVarC.g();
        if (z) {
            this.mHost.d.post(new bh(ebVarC, 15, null));
        } else {
            ebVarC.e();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public ch createFragmentContainer() {
        return new bw(this);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        cc targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            bpy.a(this).b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ':');
        this.mChildFragmentManager.H(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public cc findFragmentByWho(String str) {
        return !str.equals(this.mWho) ? this.mChildFragmentManager.C.c(str) : this;
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final cf getActivity() {
        ck ckVar = this.mHost;
        if (ckVar == null) {
            return null;
        }
        return (cf) ckVar.b;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        by byVar = this.mAnimationInfo;
        if (byVar == null || (bool = byVar.p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        by byVar = this.mAnimationInfo;
        if (byVar == null || (bool = byVar.o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final dd getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(a.bV(this, "Fragment ", " has not been attached yet."));
    }

    public Context getContext() {
        ck ckVar = this.mHost;
        if (ckVar == null) {
            return null;
        }
        return ckVar.c;
    }

    public bpt getDefaultViewModelCreationExtras() {
        byte[] bArr;
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            bArr = null;
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && dd.aa(3)) {
            Objects.toString(requireContext().getApplicationContext());
        }
        bpv bpvVar = new bpv(bArr);
        if (application != null) {
            bpvVar.b(bpk.b, application);
        }
        bpvVar.b(bpd.a, this);
        bpvVar.b(bpd.b, this);
        if (getArguments() != null) {
            bpvVar.b(bpd.c, getArguments());
        }
        return bpvVar;
    }

    public bpl getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && dd.aa(3)) {
                Objects.toString(requireContext().getApplicationContext());
            }
            this.mDefaultFactory = new bpe(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        by byVar = this.mAnimationInfo;
        if (byVar == null) {
            return 0;
        }
        return byVar.b;
    }

    public Object getEnterTransition() {
        by byVar = this.mAnimationInfo;
        if (byVar == null) {
            return null;
        }
        return byVar.i;
    }

    public ave getEnterTransitionCallback() {
        by byVar = this.mAnimationInfo;
        if (byVar == null) {
            return null;
        }
        return byVar.q;
    }

    public int getExitAnim() {
        by byVar = this.mAnimationInfo;
        if (byVar == null) {
            return 0;
        }
        return byVar.c;
    }

    public Object getExitTransition() {
        by byVar = this.mAnimationInfo;
        if (byVar == null) {
            return null;
        }
        return byVar.k;
    }

    public ave getExitTransitionCallback() {
        by byVar = this.mAnimationInfo;
        if (byVar == null) {
            return null;
        }
        return byVar.r;
    }

    public View getFocusedView() {
        by byVar = this.mAnimationInfo;
        if (byVar == null) {
            return null;
        }
        return byVar.t;
    }

    @Deprecated
    public final dd getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        ck ckVar = this.mHost;
        if (ckVar == null) {
            return null;
        }
        return ckVar.d();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        ck ckVar = this.mHost;
        if (ckVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterC = ckVar.c();
        layoutInflaterC.setFactory2(this.mChildFragmentManager.d);
        return layoutInflaterC;
    }

    public boc getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public bpy getLoaderManager() {
        return bpy.a(this);
    }

    public int getNextTransition() {
        by byVar = this.mAnimationInfo;
        if (byVar == null) {
            return 0;
        }
        return byVar.f;
    }

    public final cc getParentFragment() {
        return this.mParentFragment;
    }

    public final dd getParentFragmentManager() {
        dd ddVar = this.mFragmentManager;
        if (ddVar != null) {
            return ddVar;
        }
        throw new IllegalStateException(a.bV(this, "Fragment ", " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        by byVar = this.mAnimationInfo;
        if (byVar == null) {
            return false;
        }
        return byVar.a;
    }

    public int getPopEnterAnim() {
        by byVar = this.mAnimationInfo;
        if (byVar == null) {
            return 0;
        }
        return byVar.d;
    }

    public int getPopExitAnim() {
        by byVar = this.mAnimationInfo;
        if (byVar == null) {
            return 0;
        }
        return byVar.e;
    }

    public float getPostOnViewCreatedAlpha() {
        by byVar = this.mAnimationInfo;
        if (byVar == null) {
            return 1.0f;
        }
        return byVar.s;
    }

    public Object getReenterTransition() {
        by byVar = this.mAnimationInfo;
        if (byVar == null) {
            return null;
        }
        Object obj = byVar.l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        int i = bmy.a;
        bna bnaVar = new bna(this);
        bmy.d(bnaVar);
        bmx bmxVarB = bmy.b(this);
        if (bmxVarB.b.contains(bmw.f) && bmy.e(bmxVarB, getClass(), bnaVar.getClass())) {
            bmy.c(bmxVarB, bnaVar);
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        by byVar = this.mAnimationInfo;
        if (byVar == null) {
            return null;
        }
        Object obj = byVar.j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // defpackage.dow
    public final dou getSavedStateRegistry() {
        return this.mSavedStateRegistryController.a();
    }

    public Object getSharedElementEnterTransition() {
        by byVar = this.mAnimationInfo;
        if (byVar == null) {
            return null;
        }
        return byVar.m;
    }

    public Object getSharedElementReturnTransition() {
        by byVar = this.mAnimationInfo;
        if (byVar == null) {
            return null;
        }
        Object obj = byVar.n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList getSharedElementSourceNames() {
        ArrayList arrayList;
        by byVar = this.mAnimationInfo;
        return (byVar == null || (arrayList = byVar.g) == null) ? new ArrayList() : arrayList;
    }

    public ArrayList getSharedElementTargetNames() {
        ArrayList arrayList;
        by byVar = this.mAnimationInfo;
        return (byVar == null || (arrayList = byVar.h) == null) ? new ArrayList() : arrayList;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final int getTargetRequestCode() {
        int i = bmy.a;
        bnb bnbVar = new bnb(this);
        bmy.d(bnbVar);
        bmx bmxVarB = bmy.b(this);
        if (bmxVarB.b.contains(bmw.h) && bmy.e(bmxVarB, getClass(), bnbVar.getClass())) {
            bmy.c(bmxVarB, bnbVar);
        }
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public bog getViewLifecycleOwner() {
        dw dwVar = this.mViewLifecycleOwner;
        if (dwVar != null) {
            return dwVar;
        }
        throw new IllegalStateException(a.bV(this, "Can't access the Fragment View's LifecycleOwner for ", " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public boo getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // defpackage.bpp
    public bpo getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() == bob.b.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.mFragmentManager.B.d;
        bpo bpoVar = (bpo) map.get(this.mWho);
        if (bpoVar != null) {
            return bpoVar;
        }
        bpo bpoVar2 = new bpo();
        map.put(this.mWho, bpoVar2);
        return bpoVar2;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new dd();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        cc ccVar;
        if (this.mHidden) {
            return true;
        }
        return (this.mFragmentManager == null || (ccVar = this.mParentFragment) == null || !ccVar.isHidden()) ? false : true;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        cc ccVar;
        if (this.mMenuVisible) {
            return this.mFragmentManager == null || (ccVar = this.mParentFragment) == null || ccVar.isMenuVisible();
        }
        return false;
    }

    public boolean isPostponed() {
        by byVar = this.mAnimationInfo;
        if (byVar == null) {
            return false;
        }
        return byVar.u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        dd ddVar = this.mFragmentManager;
        if (ddVar == null) {
            return false;
        }
        return ddVar.ad();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    /* JADX INFO: renamed from: lambda$performAttach$2$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m657lambda$performAttach$2$androidsupportv4appFragment() {
        onAttach(this.mHost.c);
    }

    /* JADX INFO: renamed from: lambda$performCreate$4$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m659lambda$performCreate$4$androidsupportv4appFragment() {
        this.mLifecycleRegistry.e(boa.ON_CREATE);
    }

    /* JADX INFO: renamed from: lambda$performCreateView$5$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m660lambda$performCreateView$5$androidsupportv4appFragment() {
        dw dwVar = this.mViewLifecycleOwner;
        dwVar.b.c(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    /* JADX INFO: renamed from: lambda$performCreateView$6$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m661lambda$performCreateView$6$androidsupportv4appFragment(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mView = onCreateView(layoutInflater, viewGroup, bundle);
    }

    /* JADX INFO: renamed from: lambda$performDestroy$19$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m662lambda$performDestroy$19$androidsupportv4appFragment() {
        this.mLifecycleRegistry.e(boa.ON_DESTROY);
    }

    /* JADX INFO: renamed from: lambda$performDestroyView$18$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m663lambda$performDestroyView$18$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(boa.ON_DESTROY);
    }

    /* JADX INFO: renamed from: lambda$performPause$14$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m664lambda$performPause$14$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(boa.ON_PAUSE);
    }

    /* JADX INFO: renamed from: lambda$performPause$15$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m665lambda$performPause$15$androidsupportv4appFragment() {
        this.mLifecycleRegistry.e(boa.ON_PAUSE);
    }

    /* JADX INFO: renamed from: lambda$performResume$11$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m666lambda$performResume$11$androidsupportv4appFragment() {
        this.mLifecycleRegistry.e(boa.ON_RESUME);
    }

    /* JADX INFO: renamed from: lambda$performResume$12$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m667lambda$performResume$12$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(boa.ON_RESUME);
    }

    /* JADX INFO: renamed from: lambda$performStart$10$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m669lambda$performStart$10$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(boa.ON_START);
    }

    /* JADX INFO: renamed from: lambda$performStart$9$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m670lambda$performStart$9$androidsupportv4appFragment() {
        this.mLifecycleRegistry.e(boa.ON_START);
    }

    /* JADX INFO: renamed from: lambda$performStop$16$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m671lambda$performStop$16$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(boa.ON_STOP);
    }

    /* JADX INFO: renamed from: lambda$performStop$17$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m672lambda$performStop$17$androidsupportv4appFragment() {
        this.mLifecycleRegistry.e(boa.ON_STOP);
    }

    /* JADX INFO: renamed from: lambda$performViewCreated$7$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m673lambda$performViewCreated$7$androidsupportv4appFragment(Bundle bundle) {
        onViewCreated(this.mView, bundle);
    }

    /* JADX INFO: renamed from: lambda$restoreViewState$1$android-support-v4-app-Fragment, reason: not valid java name */
    public /* synthetic */ void m675lambda$restoreViewState$1$androidsupportv4appFragment() {
        this.mViewLifecycleOwner.a(boa.ON_CREATE);
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.noteStateNotSaved();
    }

    @Deprecated
    /* JADX INFO: renamed from: onActivityCreated, reason: merged with bridge method [inline-methods] */
    public void m656lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (dd.aa(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        ck ckVar = this.mHost;
        Activity activity = ckVar == null ? null : ckVar.b;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    /* JADX INFO: renamed from: onCreate, reason: merged with bridge method [inline-methods] */
    public void m658lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        dd ddVar = this.mChildFragmentManager;
        if (ddVar.o <= 0) {
            ddVar.u();
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        ck ckVar = this.mHost;
        Activity activity = ckVar == null ? null : ckVar.b;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    /* JADX INFO: renamed from: onViewStateRestored, reason: merged with bridge method [inline-methods] */
    public void m674lambda$restoreViewState$0$androidsupportv4appFragment(Bundle bundle) {
        this.mCalled = true;
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.a;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 3;
        this.mCalled = false;
        dl.a("Fragment#onActivityCreated", new br(this, bundle, 1));
        if (!this.mCalled) {
            throw new ec(a.bV(this, "Fragment ", " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        this.mChildFragmentManager.s();
    }

    public void performAttach() {
        ArrayList arrayList = this.mOnPreAttachedListeners;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ((ca) arrayList.get(i2)).a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.o(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        dl.a("Fragment#onAttach", new bq(this, i));
        if (!this.mCalled) {
            throw new ec(a.bV(this, "Fragment ", " did not call through to super.onAttach()"));
        }
        Iterator it = this.mFragmentManager.n.iterator();
        while (it.hasNext()) {
            ((dh) it.next()).g(this);
        }
        dd ddVar = this.mChildFragmentManager;
        ddVar.y = false;
        ddVar.z = false;
        ddVar.B.g = false;
        ddVar.F(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.W(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.b(new pz(this, 1, null));
        dl.a("Fragment#onCreate", new br(this, bundle, 3));
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new ec(a.bV(this, "Fragment ", " did not call through to super.onCreate()"));
        }
        dl.a("FragmentLifecycle#handleLifecycleEvent(ON_CREATE)", new bq(this, 10));
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return z | this.mChildFragmentManager.X(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new dw(this, getViewModelStore(), new bq(this, 5));
        dl.a("Fragment#onCreateView", new tcv(this, layoutInflater, viewGroup, bundle, 1));
        View view = this.mView;
        dw dwVar = this.mViewLifecycleOwner;
        if (view == null) {
            if (dwVar.a != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        dwVar.b();
        if (dd.aa(3)) {
            Objects.toString(this.mView);
            toString();
        }
        View view2 = this.mView;
        dw dwVar2 = this.mViewLifecycleOwner;
        view2.getClass();
        view2.setTag(R.id.view_tree_lifecycle_owner, dwVar2);
        View view3 = this.mView;
        dw dwVar3 = this.mViewLifecycleOwner;
        view3.getClass();
        view3.setTag(R.id.view_tree_view_model_store_owner, dwVar3);
        View view4 = this.mView;
        dw dwVar4 = this.mViewLifecycleOwner;
        view4.getClass();
        view4.setTag(R.id.view_tree_saved_state_registry_owner, dwVar4);
        this.mViewLifecycleOwnerLiveData.h(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.v();
        dl.a("FragmentLifecycle#handleLifecycleEvent(ON_DESTROY)", new bh(this, 12));
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        dl.a("Fragment#onDestroy", new bh(this, 13));
        if (!this.mCalled) {
            throw new ec(a.bV(this, "Fragment ", " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.F(1);
        if (this.mView != null && ((boh) this.mViewLifecycleOwner.getLifecycle()).d.a(bob.c)) {
            dl.a("FragmentViewLifecycle#handleLifecycleEvent(ON_DESTROY)", new bh(this, 3));
        }
        this.mState = 1;
        this.mCalled = false;
        dl.a("Fragment#onDestroyView", new bh(this, 4));
        if (!this.mCalled) {
            throw new ec(a.bV(this, "Fragment ", " did not call through to super.onDestroyView()"));
        }
        ahb ahbVar = bpy.a(this).a.b;
        int iC = ahbVar.c();
        for (int i = 0; i < iC; i++) {
            ((bpz) ahbVar.d(i)).j();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        dl.a("Fragment#onDetach", new bh(this, 8));
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new ec(a.bV(this, "Fragment ", " did not call through to super.onDetach()"));
        }
        dd ddVar = this.mChildFragmentManager;
        if (ddVar.A) {
            return;
        }
        ddVar.v();
        this.mChildFragmentManager = new dd();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.Y(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.z(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.B();
        if (this.mView != null) {
            dl.a("FragmentViewLifecycle#handleLifecycleEvent(ON_PAUSE)", new bh(this, 9));
        }
        dl.a("FragmentLifecycle#handleLifecycleEvent(ON_PAUSE)", new bh(this, 10));
        this.mState = 6;
        this.mCalled = false;
        dl.a("Fragment#onPause", new bh(this, 11));
        if (!this.mCalled) {
            throw new ec(a.bV(this, "Fragment ", " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return z | this.mChildFragmentManager.Z(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean zAc = this.mFragmentManager.ac(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zAc) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zAc);
            onPrimaryNavigationFragmentChanged(zAc);
            dd ddVar = this.mChildFragmentManager;
            ddVar.V();
            ddVar.A(ddVar.s);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.am(true);
        int i = 7;
        this.mState = 7;
        this.mCalled = false;
        dl.a("Fragment#onResume", new bq(this, 6));
        if (!this.mCalled) {
            throw new ec(a.bV(this, "Fragment ", " did not call through to super.onResume()"));
        }
        dl.a("FragmentLifecycle#handleLifecycleEvent(ON_RESUME)", new bq(this, i));
        if (this.mView != null) {
            dl.a("FragmentViewLifecycle#handleLifecycleEvent(ON_RESUME)", new bq(this, 8));
        }
        this.mChildFragmentManager.D();
    }

    public void performSaveInstanceState(Bundle bundle) {
        dl.a("Fragment#onSaveInstanceState", new bg(this, bundle, 5));
    }

    public void performStart() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.am(true);
        this.mState = 5;
        this.mCalled = false;
        dl.a("Fragment#onStart", new bq(this, 2));
        if (!this.mCalled) {
            throw new ec(a.bV(this, "Fragment ", " did not call through to super.onStart()"));
        }
        dl.a("FragmentLifecycle#handleLifecycleEvent(ON_START)", new bq(this, 3));
        if (this.mView != null) {
            dl.a("FragmentViewLifecycle#handleLifecycleEvent(ON_START)", new bq(this, 4));
        }
        this.mChildFragmentManager.E();
    }

    public void performStop() {
        this.mChildFragmentManager.G();
        if (this.mView != null) {
            dl.a("FragmentViewLifecycle#handleLifecycleEvent(ON_STOP)", new bh(this, 5));
        }
        dl.a("FragmentLifecycle#handleLifecycleEvent(ON_STOP)", new bh(this, 6));
        this.mState = 4;
        this.mCalled = false;
        dl.a("Fragment#onStop", new bh(this, 7));
        if (!this.mCalled) {
            throw new ec(a.bV(this, "Fragment ", " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        dl.a("Fragment#onViewCreated", new br(this, bundle != null ? bundle.getBundle("savedInstanceState") : null, 2));
        this.mChildFragmentManager.F(2);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().u = true;
        Handler handler2 = this.mPostponedHandler;
        if (handler2 != null) {
            handler2.removeCallbacks(this.mPostponedDurationRunnable);
        }
        dd ddVar = this.mFragmentManager;
        if (ddVar != null) {
            handler = ddVar.p.d;
            this.mPostponedHandler = handler;
        } else {
            handler = new Handler(Looper.getMainLooper());
            this.mPostponedHandler = handler;
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final rc registerForActivityResult(rj rjVar, rb rbVar) {
        return prepareCallInternal(rjVar, new bx(this, 1), rbVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public void removeOnContextAvailableListener(qz qzVar) {
        this.mContextAwareHelper.d(qzVar);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost == null) {
            throw new IllegalStateException(a.bV(this, "Fragment ", " not attached to Activity"));
        }
        dd parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.v == null) {
            strArr.getClass();
            return;
        }
        parentFragmentManager.w.addLast(new cv(this.mWho, i));
        parentFragmentManager.v.b(strArr, null);
    }

    public final cf requireActivity() {
        cf activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(a.bV(this, "Fragment ", " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(a.bV(this, "Fragment ", " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(a.bV(this, "Fragment ", " not attached to a context."));
    }

    @Deprecated
    public final dd requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(a.bV(this, "Fragment ", " not attached to a host."));
    }

    public final cc requireParentFragment() {
        cc parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(a.bV(this, "Fragment ", " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(a.bV(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.Q(bundle);
        this.mChildFragmentManager.u();
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        dl.a("Fragment#onViewStateRestored", new br(this, bundle, 0));
        if (!this.mCalled) {
            throw new ec(a.bV(this, "Fragment ", " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            dl.a("FragmentViewLifecycle#handleLifecycleEvent(ON_CREATE)", new bq(this, 9));
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().p = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().o = Boolean.valueOf(z);
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else {
                    if (i4 == 0) {
                        return;
                    }
                    i2 = 0;
                    i3 = 0;
                }
            }
        }
        ensureAnimationInfo().b = i;
        ensureAnimationInfo().c = i2;
        ensureAnimationInfo().d = i3;
        ensureAnimationInfo().e = i4;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(ave aveVar) {
        ensureAnimationInfo().q = aveVar;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().i = obj;
    }

    public void setExitSharedElementCallback(ave aveVar) {
        ensureAnimationInfo().r = aveVar;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().t = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.e();
        }
    }

    public void setInitialSavedState(cb cbVar) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        Bundle bundle2 = null;
        if (cbVar != null && (bundle = cbVar.a) != null) {
            bundle2 = bundle;
        }
        this.mSavedFragmentState = bundle2;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.e();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo != null) {
            ensureAnimationInfo().a = z;
        }
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().s = f;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        int i = bmy.a;
        bne bneVar = new bne(this);
        bmy.d(bneVar);
        bmx bmxVarB = bmy.b(this);
        if (bmxVarB.b.contains(bmw.f) && bmy.e(bmxVarB, getClass(), bneVar.getClass())) {
            bmy.c(bmxVarB, bneVar);
        }
        this.mRetainInstance = z;
        dd ddVar = this.mFragmentManager;
        if (ddVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            ddVar.B.a(this);
        } else {
            ddVar.B.e(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().m = obj;
    }

    public void setSharedElementNames(ArrayList arrayList, ArrayList arrayList2) {
        ensureAnimationInfo();
        by byVar = this.mAnimationInfo;
        byVar.g = arrayList;
        byVar.h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().n = obj;
    }

    @Deprecated
    public void setTargetFragment(cc ccVar, int i) {
        if (ccVar != null) {
            int i2 = bmy.a;
            bnf bnfVar = new bnf(this, ccVar, i);
            bmy.d(bnfVar);
            bmx bmxVarB = bmy.b(this);
            if (bmxVarB.b.contains(bmw.h) && bmy.e(bmxVarB, getClass(), bnfVar.getClass())) {
                bmy.c(bmxVarB, bnfVar);
            }
        }
        dd ddVar = this.mFragmentManager;
        dd ddVar2 = ccVar != null ? ccVar.mFragmentManager : null;
        if (ddVar != null && ddVar2 != null && ddVar != ddVar2) {
            throw new IllegalArgumentException(a.bV(ccVar, "Fragment ", " must share the same FragmentManager to be set as a target fragment"));
        }
        for (cc targetFragment = ccVar; targetFragment != null; targetFragment = targetFragment.getTargetFragment(false)) {
            if (targetFragment.equals(this)) {
                throw new IllegalArgumentException(a.bW(this, ccVar, "Setting ", " as the target of ", " would create a target cycle"));
            }
        }
        if (ccVar != null) {
            if (this.mFragmentManager == null || ccVar.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = ccVar;
            } else {
                this.mTargetWho = ccVar.mWho;
            }
            this.mTargetRequestCode = i;
        }
        this.mTargetWho = null;
        this.mTarget = null;
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        dd ddVar;
        int i = bmy.a;
        bng bngVar = new bng(this, z);
        bmy.d(bngVar);
        bmx bmxVarB = bmy.b(this);
        if (bmxVarB.b.contains(bmw.g) && bmy.e(bmxVarB, getClass(), bngVar.getClass())) {
            bmy.c(bmxVarB, bngVar);
        }
        if (!this.mUserVisibleHint && z && this.mState < 5 && (ddVar = this.mFragmentManager) != null && isAdded() && this.mIsCreated) {
            ddVar.aq(ddVar.ap(this));
        }
        this.mUserVisibleHint = z;
        boolean z2 = false;
        if (this.mState < 5 && !z) {
            z2 = true;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        ck ckVar = this.mHost;
        if (ckVar != null) {
            return ckVar.f(str);
        }
        return false;
    }

    public void startActivity(Intent intent, Bundle bundle) {
        ck ckVar = this.mHost;
        if (ckVar == null) {
            throw new IllegalStateException(a.bV(this, "Fragment ", " not attached to Activity"));
        }
        ckVar.i(intent, -1, bundle);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(a.bV(this, "Fragment ", " not attached to Activity"));
        }
        dd parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.t == null) {
            parentFragmentManager.p.i(intent, i, bundle);
            return;
        }
        parentFragmentManager.w.addLast(new cv(this.mWho, i));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        parentFragmentManager.t.b(intent, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException(a.bV(this, "Fragment ", " not attached to Activity"));
        }
        if (dd.aa(2)) {
            toString();
            Objects.toString(intentSender);
            Objects.toString(intent);
            Objects.toString(bundle);
        }
        dd parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.u == null) {
            ck ckVar = parentFragmentManager.p;
            intentSender.getClass();
            if (i != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            ckVar.b.startIntentSenderForResult(intentSender, -1, intent, i2, i3, i4, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (dd.aa(2)) {
                Objects.toString(bundle);
                Objects.toString(intent);
                toString();
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        czs czsVar = new czs(intentSender);
        czsVar.c = intent;
        czsVar.b(i3, i2);
        ri riVarA = czsVar.a();
        parentFragmentManager.w.addLast(new cv(this.mWho, i));
        if (dd.aa(2)) {
            toString();
        }
        parentFragmentManager.u.b(riVarA, null);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().u) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().u = false;
        } else if (Looper.myLooper() != this.mHost.d.getLooper()) {
            this.mHost.d.postAtFrontOfQueue(new bh(this, 14, null));
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(SemanticState.Focused);
        sb.append(getClass().getSimpleName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(')');
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final rc registerForActivityResult(rj rjVar, rg rgVar, rb rbVar) {
        return prepareCallInternal(rjVar, new bx(rgVar, 0), rbVar);
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Deprecated
    public void onAttachFragment(cc ccVar) {
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    /* JADX INFO: renamed from: onSaveInstanceState, reason: merged with bridge method [inline-methods] */
    public void m668x22bc4f96(Bundle bundle) {
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().u = true;
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    private void restoreViewState() {
        if (dd.aa(3)) {
            toString();
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    @Deprecated
    public final cc getTargetFragment() {
        return getTargetFragment(true);
    }

    public cc(int i) {
        this();
        this.mContentLayoutId = i;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    @Deprecated
    public static cc instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }
}
