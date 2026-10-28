package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.car.app.model.Alert;
import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cbt {
    public static final int a;
    public boolean A;
    String B;
    cdx C;
    boolean D;
    cba E;
    afts F;
    final Context b;
    bvd c;
    agfr d;
    agfr e;
    agfr f;
    agfr g;
    agfr h;
    agek i;
    Looper j;
    public int k;
    public brq l;
    int m;
    boolean n;
    int o;
    boolean p;
    cdv q;
    cdu r;
    long s;
    long t;
    public int u;
    int v;
    int w;
    public int x;
    boolean y;
    public boolean z;

    static {
        int i = bwp.a;
        String strAe = ahno.ae(Build.DEVICE);
        int i2 = 30000;
        if (!strAe.contains("emulator") && !strAe.contains("emu64a") && !strAe.contains("emu64x") && !strAe.contains("generic") && !strAe.contains("vsoc")) {
            i2 = 10000;
        }
        a = i2;
    }

    private cbt(Context context, agfr agfrVar, agfr agfrVar2, agfr agfrVar3, agfr agfrVar4, agfr agfrVar5, agek agekVar) {
        context.getClass();
        this.b = context;
        this.d = agfrVar;
        this.e = agfrVar2;
        this.f = agfrVar3;
        this.g = agfrVar4;
        this.h = agfrVar5;
        this.i = agekVar;
        int i = bwp.a;
        Looper looperMyLooper = Looper.myLooper();
        this.j = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.l = brq.a;
        this.m = 0;
        this.o = 1;
        this.p = true;
        this.q = cdv.c;
        this.r = cdu.a;
        this.E = new cba();
        this.c = bvd.a;
        this.s = 500L;
        this.t = 2000L;
        this.u = 600000;
        boolean zC = bsc.c(4);
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        this.v = zC ? a : Integer.MAX_VALUE;
        this.w = true == bsc.c(4) ? 60000 : i2;
        this.x = 600000;
        this.y = true;
        this.B = "";
        this.k = -1000;
        this.C = new cbn();
        this.D = true;
    }

    public final ExoPlayer a() {
        if (this.z) {
            throw new IllegalStateException();
        }
        this.z = true;
        return new ccm(this);
    }

    public final void b(long j) {
        ahno.O(!this.z);
        this.t = j;
    }

    public final void c(ccw ccwVar) {
        ahno.O(!this.z);
        this.g = new cbq(ccwVar, 1);
    }

    public final void d(Looper looper) {
        if (this.z) {
            throw new IllegalStateException();
        }
        looper.getClass();
        this.j = looper;
    }

    public final void e(cnl cnlVar) {
        ahno.O(!this.z);
        this.e = new cbq(cnlVar, 8);
    }

    public final void f(Looper looper) {
        boolean z = false;
        if (!this.z && looper != Looper.getMainLooper()) {
            z = true;
        }
        ahno.O(z);
        this.F = new afts(looper);
    }

    public final void g(long j) {
        if (this.z) {
            throw new IllegalStateException();
        }
        this.s = j;
    }

    public final void h(cdt cdtVar) {
        ahno.O(!this.z);
        this.d = new cbq(cdtVar, 3);
    }

    public final void i(int i) {
        if (this.z) {
            throw new IllegalStateException();
        }
        if (i <= 0) {
            throw new IllegalArgumentException();
        }
        this.v = i;
    }

    public final void j(int i) {
        if (this.z) {
            throw new IllegalStateException();
        }
        if (i <= 0) {
            throw new IllegalArgumentException();
        }
        this.w = i;
    }

    public final void k(int i) {
        ahno.O(!this.z);
        this.m = i;
        this.n = true;
    }

    public cbt(Context context, cdt cdtVar, cnl cnlVar, cqz cqzVar, ccw ccwVar, crd crdVar, ces cesVar) {
        this(context, new cbr(cdtVar, 0), new cbr(cnlVar, 2), new cbr(cqzVar, 3), new cbr(ccwVar, 4), new cbr(crdVar, 5), new gqq(cesVar, 1));
        cnlVar.getClass();
        cqzVar.getClass();
        crdVar.getClass();
        cesVar.getClass();
    }

    public cbt(Context context, agfr agfrVar, agfr agfrVar2) {
        this(context, agfrVar, agfrVar2, new cbq(context, 4), new cln(1), new cbq(context, 5), new cbs(0));
    }

    public cbt(Context context) {
        this(context, new cbq(context, 0), new cbq(context, 2));
    }
}
