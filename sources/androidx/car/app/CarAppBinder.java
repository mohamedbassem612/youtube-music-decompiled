package androidx.car.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Binder;
import android.util.Log;
import defpackage.a;
import defpackage.aag;
import defpackage.adq;
import defpackage.aek;
import defpackage.aeq;
import defpackage.aex;
import defpackage.afi;
import defpackage.afj;
import defpackage.afk;
import defpackage.boa;
import defpackage.bob;
import defpackage.boc;
import defpackage.boh;
import defpackage.ww;
import defpackage.xk;
import defpackage.xr;
import defpackage.xv;
import defpackage.xx;
import defpackage.ya;
import defpackage.yb;
import defpackage.yd;
import java.security.InvalidParameterException;
import java.util.Deque;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class CarAppBinder extends ICarApp.Stub {
    private volatile int mAuthenticatedUid = -1;
    private volatile yd mCurrentSession;
    private final SessionInfo mCurrentSessionInfo;
    private HandshakeInfo mHandshakeInfo;
    private afj mHostValidator;
    private volatile xk mService;

    public CarAppBinder(xk xkVar, SessionInfo sessionInfo) {
        this.mService = xkVar;
        this.mCurrentSessionInfo = sessionInfo;
    }

    private boc getCurrentLifecycle() {
        yd ydVar = this.mCurrentSession;
        if (ydVar == null) {
            return null;
        }
        return ydVar.a;
    }

    private afj getHostValidator() {
        afj afjVar = this.mHostValidator;
        if (afjVar != null) {
            return afjVar;
        }
        xk xkVar = this.mService;
        xkVar.getClass();
        afj afjVarB = xkVar.b();
        this.mHostValidator = afjVarB;
        return afjVarB;
    }

    private boolean isValidCaller(int i) {
        return this.mAuthenticatedUid != -1 && i == this.mAuthenticatedUid;
    }

    private boolean isValidCallingUid(int i, String[] strArr) {
        if (strArr == null) {
            return false;
        }
        for (String str : strArr) {
            if (getHostValidator().a(new xx(str, i))) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidClaimedPackage(String str, String[] strArr) {
        if (strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private void onConfigurationChangedInternal(yd ydVar, Configuration configuration) {
        afi.a();
        xr xrVar = ydVar.b;
        xrVar.c(configuration);
        xrVar.getResources().getConfiguration();
    }

    private boolean onHandshakeAlreadyCompletedException(String str, IOnDoneCallback iOnDoneCallback, int i) {
        if (this.mAuthenticatedUid == -1 || i == this.mAuthenticatedUid) {
            return false;
        }
        aag.f(iOnDoneCallback, str, new SecurityException("Handshake already completed by another host"));
        return true;
    }

    private boolean onHostCallException(String str, IOnDoneCallback iOnDoneCallback, int i) {
        if (this.mService == null) {
            aag.f(iOnDoneCallback, str, new IllegalStateException("Service is null"));
            return true;
        }
        if (isValidCaller(i)) {
            return false;
        }
        aag.f(iOnDoneCallback, str, new SecurityException("Calling UID does not match authenticated UID"));
        return true;
    }

    private void onNewIntentInternal(yd ydVar, Intent intent) {
        afi.a();
    }

    private xx verifyHandshakeInfo(xk xkVar, int i, HandshakeInfo handshakeInfo) {
        String[] packagesForUid = xkVar.getPackageManager().getPackagesForUid(i);
        if (!isValidCallingUid(i, packagesForUid)) {
            throw new SecurityException(a.bR(i, "Unrecognized host with uid "));
        }
        String hostPackageName = handshakeInfo.getHostPackageName();
        if (!isValidClaimedPackage(hostPackageName, packagesForUid)) {
            throw new SecurityException(a.cg(i, hostPackageName, "Claimed host package name ", " does not match calling UID "));
        }
        xx xxVar = new xx(hostPackageName, i);
        if (!getHostValidator().a(xxVar)) {
            throw new SecurityException("The host is not allowed to call this service");
        }
        AppInfo appInfoA = xkVar.a();
        int minCarAppApiLevel = appInfoA.getMinCarAppApiLevel();
        int latestCarAppApiLevel = appInfoA.getLatestCarAppApiLevel();
        int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
        if (minCarAppApiLevel > hostCarAppApiLevel) {
            throw new IllegalArgumentException("Host API level (" + hostCarAppApiLevel + ") is less than the app's min API level (" + minCarAppApiLevel + ')');
        }
        if (latestCarAppApiLevel >= hostCarAppApiLevel) {
            return xxVar;
        }
        throw new IllegalArgumentException("Host API level (" + hostCarAppApiLevel + ") is greater than the app's max API level (" + latestCarAppApiLevel + ')');
    }

    public void destroy() {
        onDestroyLifecycle();
        this.mHostValidator = null;
        this.mHandshakeInfo = null;
        this.mService = null;
    }

    @Override // androidx.car.app.ICarApp
    public void getAppInfo(final IOnDoneCallback iOnDoneCallback) {
        afi.b(new Runnable() { // from class: xc
            @Override // java.lang.Runnable
            public final void run() {
                this.a.m134lambda$getAppInfo$8$androidxcarappCarAppBinder(iOnDoneCallback);
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void getAppTheme(IOnDoneCallback iOnDoneCallback) {
        aag.d(getCurrentLifecycle(), iOnDoneCallback, "getAppTheme", new aex() { // from class: wz
            @Override // defpackage.aex
            public final Object a() {
                return this.a.m135lambda$getAppTheme$9$androidxcarappCarAppBinder();
            }
        });
    }

    xk getCarAppService() {
        return this.mService;
    }

    yd getCurrentSession() {
        return this.mCurrentSession;
    }

    SessionInfo getCurrentSessionInfo() {
        return this.mCurrentSessionInfo;
    }

    public HandshakeInfo getHandshakeInfo() {
        return this.mHandshakeInfo;
    }

    @Override // androidx.car.app.ICarApp
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.ICarApp
    public void getManager(final String str, final IOnDoneCallback iOnDoneCallback) {
        if (onHostCallException("getManager", iOnDoneCallback, Binder.getCallingUid())) {
            return;
        }
        afi.b(new Runnable() { // from class: xg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.m136lambda$getManager$7$androidxcarappCarAppBinder(str, iOnDoneCallback);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getAppInfo$8$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ void m134lambda$getAppInfo$8$androidxcarappCarAppBinder(IOnDoneCallback iOnDoneCallback) {
        xk xkVar = this.mService;
        if (xkVar == null) {
            aag.f(iOnDoneCallback, "getAppInfo", new IllegalStateException("Service is null"));
            return;
        }
        try {
            aag.g(iOnDoneCallback, "getAppInfo", xkVar.a());
        } catch (RuntimeException e) {
            aag.f(iOnDoneCallback, "getAppInfo", e);
        }
    }

    /* JADX INFO: renamed from: lambda$getAppTheme$9$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m135lambda$getAppTheme$9$androidxcarappCarAppBinder() {
        xk xkVar = this.mService;
        return 0;
    }

    /* JADX INFO: renamed from: lambda$getManager$7$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ void m136lambda$getManager$7$androidxcarappCarAppBinder(String str, IOnDoneCallback iOnDoneCallback) {
        yd ydVar = this.mCurrentSession;
        ydVar.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 96801) {
            if (iHashCode == 1862666772 && str.equals("navigation")) {
                aag.g(iOnDoneCallback, "getManager", ((adq) ydVar.a().a(adq.class)).a);
                return;
            }
        } else if (str.equals("app")) {
            aag.g(iOnDoneCallback, "getManager", ((ww) ydVar.a().a(ww.class)).b);
            return;
        }
        Log.e("CarApp", String.valueOf(str).concat("%s is not a valid manager"));
        aag.f(iOnDoneCallback, "getManager", new InvalidParameterException(String.valueOf(str).concat(" is not a valid manager type")));
    }

    /* JADX INFO: renamed from: lambda$onAppCreate$0$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m137lambda$onAppCreate$0$androidxcarappCarAppBinder(ICarHost iCarHost, Configuration configuration, Intent intent) {
        xk xkVar = this.mService;
        xkVar.getClass();
        yd ydVarC = this.mCurrentSession;
        if (ydVarC == null || ydVarC.a.d == bob.a) {
            this.mCurrentSessionInfo.getClass();
            ydVarC = xkVar.c();
            this.mCurrentSession = ydVarC;
        }
        HandshakeInfo handshakeInfo = getHandshakeInfo();
        handshakeInfo.getClass();
        xkVar.b.getClass();
        xr xrVar = ydVarC.b;
        xrVar.d = handshakeInfo.getHostCarAppApiLevel();
        xrVar.b(xkVar, configuration);
        afi.a();
        iCarHost.getClass();
        afi.a();
        xv xvVar = xrVar.b;
        xvVar.b();
        xvVar.a = iCarHost;
        bob bobVar = ydVarC.a.d;
        int size = ((yb) ydVarC.a().a(yb.class)).a.size();
        if (bobVar.a(bob.c) && size > 0) {
            onNewIntentInternal(ydVarC, intent);
            return null;
        }
        ydVarC.b(boa.ON_CREATE);
        yb ybVar = (yb) ydVarC.a().a(yb.class);
        ya yaVar = new ya(ydVarC.a(), ydVarC.c.c);
        afi.a();
        boh bohVar = (boh) ybVar.c;
        bob bobVar2 = bohVar.d;
        bob bobVar3 = bob.a;
        if (bobVar2.equals(bobVar3)) {
            return null;
        }
        if (yaVar.b.d.equals(bobVar3)) {
            throw new IllegalStateException(String.format(Locale.US, "Failed to push screen (%s), because it has already been destroyed. Please note that screens are single-use, so a fresh instance is required every time you call screenManager.push().", yaVar));
        }
        Deque deque = ybVar.a;
        if (!deque.contains(yaVar)) {
            ya yaVar2 = (ya) deque.peek();
            ybVar.b(yaVar, true);
            if (!deque.contains(yaVar)) {
                return null;
            }
            if (yaVar2 != null) {
                yb.c(yaVar2, false);
            }
            if (!bohVar.d.a(bob.e)) {
                return null;
            }
            yaVar.a(boa.ON_RESUME);
            return null;
        }
        ya yaVar3 = (ya) deque.peek();
        if (yaVar3 == null || yaVar3 == yaVar) {
            return null;
        }
        deque.remove(yaVar);
        ybVar.b(yaVar, false);
        yb.c(yaVar3, false);
        if (!bohVar.d.a(bob.e)) {
            return null;
        }
        yaVar.a(boa.ON_RESUME);
        return null;
    }

    /* JADX INFO: renamed from: lambda$onAppPause$3$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m138lambda$onAppPause$3$androidxcarappCarAppBinder() {
        yd ydVar = this.mCurrentSession;
        ydVar.getClass();
        ydVar.b(boa.ON_PAUSE);
        return null;
    }

    /* JADX INFO: renamed from: lambda$onAppResume$2$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m139lambda$onAppResume$2$androidxcarappCarAppBinder() {
        yd ydVar = this.mCurrentSession;
        ydVar.getClass();
        ydVar.b(boa.ON_RESUME);
        return null;
    }

    /* JADX INFO: renamed from: lambda$onAppStart$1$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m140lambda$onAppStart$1$androidxcarappCarAppBinder() {
        yd ydVar = this.mCurrentSession;
        ydVar.getClass();
        ydVar.b(boa.ON_START);
        return null;
    }

    /* JADX INFO: renamed from: lambda$onAppStop$4$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m141lambda$onAppStop$4$androidxcarappCarAppBinder() {
        yd ydVar = this.mCurrentSession;
        ydVar.getClass();
        ydVar.b(boa.ON_STOP);
        return null;
    }

    /* JADX INFO: renamed from: lambda$onConfigurationChanged$6$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m142lambda$onConfigurationChanged$6$androidxcarappCarAppBinder(Configuration configuration) {
        yd ydVar = this.mCurrentSession;
        ydVar.getClass();
        onConfigurationChangedInternal(ydVar, configuration);
        return null;
    }

    /* JADX INFO: renamed from: lambda$onHandshakeCompleted$10$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ void m143lambda$onHandshakeCompleted$10$androidxcarappCarAppBinder(IOnDoneCallback iOnDoneCallback, int i, aek aekVar) {
        if (onHandshakeAlreadyCompletedException("onHandshakeCompleted", iOnDoneCallback, i)) {
            return;
        }
        xk xkVar = this.mService;
        if (xkVar == null) {
            aag.f(iOnDoneCallback, "onHandshakeCompleted", new IllegalStateException("Service is null"));
            return;
        }
        try {
            HandshakeInfo handshakeInfo = (HandshakeInfo) aekVar.a();
            if (handshakeInfo == null) {
                throw new IllegalArgumentException("Handshake info is null");
            }
            xkVar.b = verifyHandshakeInfo(xkVar, i, handshakeInfo);
            this.mHandshakeInfo = handshakeInfo;
            this.mAuthenticatedUid = i;
            aag.g(iOnDoneCallback, "onHandshakeCompleted", null);
        } catch (aeq | RuntimeException e) {
            xkVar.b = null;
            this.mAuthenticatedUid = -1;
            aag.f(iOnDoneCallback, "onHandshakeCompleted", e);
        }
    }

    /* JADX INFO: renamed from: lambda$onNewIntent$5$androidx-car-app-CarAppBinder, reason: not valid java name */
    public /* synthetic */ Object m144lambda$onNewIntent$5$androidxcarappCarAppBinder(Intent intent) {
        yd ydVar = this.mCurrentSession;
        ydVar.getClass();
        onNewIntentInternal(ydVar, intent);
        return null;
    }

    @Override // androidx.car.app.ICarApp
    public void onAppCreate(final ICarHost iCarHost, final Intent intent, final Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        if (onHostCallException("onAppCreate", iOnDoneCallback, Binder.getCallingUid())) {
            return;
        }
        aag.b(iOnDoneCallback, "onAppCreate", new aex() { // from class: xe
            @Override // defpackage.aex
            public final Object a() {
                this.a.m137lambda$onAppCreate$0$androidxcarappCarAppBinder(iCarHost, configuration, intent);
                return null;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppPause(IOnDoneCallback iOnDoneCallback) {
        if (onHostCallException("onAppPause", iOnDoneCallback, Binder.getCallingUid())) {
            return;
        }
        aag.d(getCurrentLifecycle(), iOnDoneCallback, "onAppPause", new aex() { // from class: xa
            @Override // defpackage.aex
            public final Object a() {
                this.a.m138lambda$onAppPause$3$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppResume(IOnDoneCallback iOnDoneCallback) {
        if (onHostCallException("onAppResume", iOnDoneCallback, Binder.getCallingUid())) {
            return;
        }
        aag.d(getCurrentLifecycle(), iOnDoneCallback, "onAppResume", new aex() { // from class: wy
            @Override // defpackage.aex
            public final Object a() {
                this.a.m139lambda$onAppResume$2$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStart(IOnDoneCallback iOnDoneCallback) {
        if (onHostCallException("onAppStart", iOnDoneCallback, Binder.getCallingUid())) {
            return;
        }
        aag.d(getCurrentLifecycle(), iOnDoneCallback, "onAppStart", new aex() { // from class: xb
            @Override // defpackage.aex
            public final Object a() {
                this.a.m140lambda$onAppStart$1$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onAppStop(IOnDoneCallback iOnDoneCallback) {
        if (onHostCallException("onAppStop", iOnDoneCallback, Binder.getCallingUid())) {
            return;
        }
        aag.d(getCurrentLifecycle(), iOnDoneCallback, "onAppStop", new aex() { // from class: xd
            @Override // defpackage.aex
            public final Object a() {
                this.a.m141lambda$onAppStop$4$androidxcarappCarAppBinder();
                return null;
            }
        });
    }

    public void onAutoDriveEnabled() {
        yd ydVar = this.mCurrentSession;
        if (ydVar != null) {
            afi.a();
            Log.w("CarApp.Nav", "NavigationManagerCallback not set, skipping onAutoDriveEnabled");
        }
    }

    @Override // androidx.car.app.ICarApp
    public void onConfigurationChanged(final Configuration configuration, IOnDoneCallback iOnDoneCallback) {
        if (onHostCallException("onConfigurationChanged", iOnDoneCallback, Binder.getCallingUid())) {
            return;
        }
        aag.d(getCurrentLifecycle(), iOnDoneCallback, "onConfigurationChanged", new aex() { // from class: wx
            @Override // defpackage.aex
            public final Object a() {
                this.a.m142lambda$onConfigurationChanged$6$androidxcarappCarAppBinder(configuration);
                return null;
            }
        });
    }

    public void onDestroyLifecycle() {
        yd ydVar = this.mCurrentSession;
        if (ydVar != null) {
            ydVar.b(boa.ON_DESTROY);
        }
        this.mCurrentSession = null;
    }

    @Override // androidx.car.app.ICarApp
    public void onHandshakeCompleted(final aek aekVar, final IOnDoneCallback iOnDoneCallback) {
        final int callingUid = Binder.getCallingUid();
        afi.b(new Runnable() { // from class: xf
            @Override // java.lang.Runnable
            public final void run() {
                this.a.m143lambda$onHandshakeCompleted$10$androidxcarappCarAppBinder(iOnDoneCallback, callingUid, aekVar);
            }
        });
    }

    @Override // androidx.car.app.ICarApp
    public void onNewIntent(final Intent intent, IOnDoneCallback iOnDoneCallback) {
        if (onHostCallException("onNewIntent", iOnDoneCallback, Binder.getCallingUid())) {
            return;
        }
        aag.d(getCurrentLifecycle(), iOnDoneCallback, "onNewIntent", new aex() { // from class: xh
            @Override // defpackage.aex
            public final Object a() {
                this.a.m144lambda$onNewIntent$5$androidxcarappCarAppBinder(intent);
                return null;
            }
        });
    }

    void setHandshakeInfo(HandshakeInfo handshakeInfo) {
        int hostCarAppApiLevel = handshakeInfo.getHostCarAppApiLevel();
        int i = afk.a;
        if (hostCarAppApiLevel <= 0 || hostCarAppApiLevel > afk.a()) {
            throw new IllegalArgumentException(a.bR(hostCarAppApiLevel, "Invalid Car App API level received: "));
        }
        this.mHandshakeInfo = handshakeInfo;
        this.mAuthenticatedUid = Binder.getCallingUid();
    }
}
