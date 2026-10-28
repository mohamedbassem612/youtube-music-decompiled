package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tqv {
    public final awli a;
    public volatile int b;
    public final Context c;
    private final tqu e = new tqu(this);
    private volatile int d = 0;

    public tqv(Context context) {
        this.c = context;
        this.b = tzk.v(0, 130, 2);
        this.b = tzk.v(this.b, 143, 2);
        int i = this.b;
        this.a = new awli(Long.valueOf((((long) this.b) << 32) | ((long) i)));
    }

    public final void a() {
        tqu tquVar = this.e;
        tquVar.a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(tquVar);
        Context context = tquVar.b.c;
        if (context instanceof Application) {
            context.registerComponentCallbacks(tquVar);
        }
        Looper.getMainLooper().getQueue().addIdleHandler(tquVar);
    }

    public final synchronized void b(int i, int i2, Function function) {
        int iV;
        int i3;
        int iV2;
        long jW;
        if (i != 267) {
            iV = tzk.v(this.b, i, i2);
            if (i == 267) {
                iV = tzk.v(iV, 130, 2);
            }
            i3 = 1;
            if ((iV & 3) == 0) {
                i3 = 0;
            }
            this.d = i3;
            iV2 = tzk.v(iV, 74, this.d);
            jW = tzk.w(iV2, this.b);
            if (function == null) {
                this.b = iV2;
                this.a.kk(Long.valueOf(jW));
                return;
            } else {
                this.b = iV2;
                this.a.kk(Long.valueOf(jW));
                return;
            }
            return;
        }
        i2 |= (this.b >> 11) & 15;
        iV = tzk.v(this.b, i, i2);
        if (i == 267 && ((iV >> 11) & 10) == 8) {
            iV = tzk.v(iV, 130, 2);
        }
        i3 = 1;
        if ((iV & 3) == 0 && ((iV >> 2) & 3) != 0) {
            i3 = 0;
        }
        this.d = i3;
        iV2 = tzk.v(iV, 74, this.d);
        jW = tzk.w(iV2, this.b);
        if ((function == null && !((Boolean) function.apply(Long.valueOf(jW))).booleanValue()) || (this.b & 3) == 3 || this.b == iV2) {
            return;
        }
        this.b = iV2;
        this.a.kk(Long.valueOf(jW));
        return;
        throw th;
    }

    public final int c() {
        return (this.b >> 2) & 3;
    }
}
