package androidx.car.app;

import android.content.pm.PackageManager;
import android.location.LocationManager;
import defpackage.aag;
import defpackage.wv;
import defpackage.ww;
import defpackage.xr;
import defpackage.yb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class AppManager$1 extends IAppManager.Stub {
    final /* synthetic */ ww this$0;
    final /* synthetic */ xr val$carContext;

    public AppManager$1(ww wwVar, xr xrVar) {
        this.this$0 = wwVar;
        this.val$carContext = xrVar;
    }

    public static /* synthetic */ Object lambda$onBackPressed$0(xr xrVar) {
        xrVar.a.d();
        return null;
    }

    public static /* synthetic */ Object lambda$startLocationUpdates$1(xr xrVar) {
        ww wwVar = (ww) xrVar.a(ww.class);
        wwVar.b();
        ((LocationManager) wwVar.a.getSystemService("location")).requestLocationUpdates("fused", 1000L, 1.0f, wwVar.f, wwVar.e.getLooper());
        return null;
    }

    public static /* synthetic */ Object lambda$stopLocationUpdates$2(xr xrVar) {
        ((ww) xrVar.a(ww.class)).b();
        return null;
    }

    @Override // androidx.car.app.IAppManager
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.IAppManager
    public void getTemplate(IOnDoneCallback iOnDoneCallback) {
        yb ybVar = (yb) this.val$carContext.a(yb.class);
        ybVar.getClass();
        aag.d(this.this$0.d, iOnDoneCallback, "getTemplate", new wv(ybVar, 0));
    }

    @Override // androidx.car.app.IAppManager
    public void onBackPressed(IOnDoneCallback iOnDoneCallback) {
        aag.d(this.this$0.d, iOnDoneCallback, "onBackPressed", new wv(this.val$carContext, 1));
    }

    @Override // androidx.car.app.IAppManager
    public void startLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        xr xrVar = this.val$carContext;
        PackageManager packageManager = xrVar.getPackageManager();
        int iCheckPermission = packageManager.checkPermission("android.permission.ACCESS_FINE_LOCATION", xrVar.getPackageName());
        int iCheckPermission2 = packageManager.checkPermission("android.permission.ACCESS_COARSE_LOCATION", this.val$carContext.getPackageName());
        if (iCheckPermission == -1 && iCheckPermission2 == -1) {
            aag.f(iOnDoneCallback, "startLocationUpdates", new SecurityException("Location permission(s) not granted."));
        }
        ww wwVar = this.this$0;
        aag.d(wwVar.d, iOnDoneCallback, "startLocationUpdates", new wv(this.val$carContext, 3));
    }

    @Override // androidx.car.app.IAppManager
    public void stopLocationUpdates(IOnDoneCallback iOnDoneCallback) {
        aag.d(this.this$0.d, iOnDoneCallback, "stopLocationUpdates", new wv(this.val$carContext, 2));
    }
}
