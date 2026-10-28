package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xrr {
    static final long a;
    public final Handler b;
    public final xeu c;
    public final tbt d;
    final xrq e;
    final xrp f;
    long g;
    public final abxv h;
    public final zik i;
    private final tfq j;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        a = 60000L;
    }

    public xrr(abxv abxvVar, xeu xeuVar, tfq tfqVar, tbt tbtVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        zik zikVar = new zik();
        this.g = 0L;
        abxvVar.getClass();
        this.h = abxvVar;
        xeuVar.getClass();
        this.c = xeuVar;
        this.b = handler;
        tfqVar.getClass();
        this.j = tfqVar;
        tbtVar.getClass();
        this.d = tbtVar;
        this.i = zikVar;
        this.e = new xrq(this);
        this.f = new xrp(this);
    }

    public final void a() {
        this.g = 0L;
        Handler handler = this.b;
        xrp xrpVar = this.f;
        handler.removeCallbacks(xrpVar);
        tfq tfqVar = this.j;
        if (tfqVar.i() && tfqVar.j(1)) {
            handler.postDelayed(xrpVar, a);
        }
    }
}
