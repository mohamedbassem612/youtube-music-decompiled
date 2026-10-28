package defpackage;

import android.app.Activity$ScreenCaptureCallback;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ink implements tdp {
    public volatile aclj a;
    private final cf b;
    private final Executor c;
    private final xeu d;
    private final aclk e;
    private Activity$ScreenCaptureCallback g;

    public ink(cf cfVar, Executor executor, xeu xeuVar, aclk aclkVar) {
        cfVar.getClass();
        executor.getClass();
        xeuVar.getClass();
        aclkVar.getClass();
        this.b = cfVar;
        this.c = executor;
        this.d = xeuVar;
        this.e = aclkVar;
        this.a = new aclj(1, null, 2);
    }

    private final void e() {
        Activity$ScreenCaptureCallback activity$ScreenCaptureCallback;
        if (Build.VERSION.SDK_INT < 34 || (activity$ScreenCaptureCallback = this.g) == null) {
            return;
        }
        this.b.unregisterScreenCaptureCallback(activity$ScreenCaptureCallback);
        this.g = null;
    }

    @Override // defpackage.tdh
    public final void a() {
        aclk aclkVar = this.e;
        aclkVar.a.add(this);
        d(aclkVar.b);
    }

    @Override // defpackage.tdp
    public final /* synthetic */ tdo c() {
        return tdo.b;
    }

    public final void d(aclj acljVar) {
        acljVar.getClass();
        this.a = acljVar;
        if (acljVar.b == 1) {
            e();
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || this.g != null) {
            return;
        }
        cf cfVar = this.b;
        if (avg.c(cfVar, "android.permission.DETECT_SCREEN_CAPTURE") == 0) {
            pbm pbmVar = new pbm(this, 1);
            xeu xeuVar = this.d;
            Executor executor = this.c;
            inj injVar = new inj(pbmVar, xeuVar);
            this.g = injVar;
            cfVar.registerScreenCaptureCallback(executor, injVar);
        }
    }

    @Override // defpackage.tdh
    public final void gY() {
        this.e.a.remove(this);
        e();
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onCreate(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onDestroy(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onPause(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onResume(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStart(bog bogVar) {
    }

    @Override // defpackage.bnu
    public final /* synthetic */ void onStop(bog bogVar) {
    }
}
