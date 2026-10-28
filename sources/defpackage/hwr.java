package defpackage;

import android.net.Uri;
import android.os.Handler;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hwr {
    public final hwc a;
    public final abvn b;
    public final awmd c;
    public final awmd d;
    public sxw g;
    public boolean h;
    public Uri i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final hwz o;
    public final axfd p;
    private final adhv q;
    private final awmd r;
    private final sxu s;
    public final avmm e = new avmm();
    public final hws n = new hws(this);
    public final hyy f = new hwp(this, 0);

    public hwr(hwc hwcVar, adhv adhvVar, axfd axfdVar, abvn abvnVar, hwz hwzVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3) {
        this.a = hwcVar;
        this.q = adhvVar;
        this.p = axfdVar;
        this.b = abvnVar;
        this.o = hwzVar;
        this.r = awmdVar;
        this.c = awmdVar2;
        this.d = awmdVar3;
        this.s = new syc(new Handler(), new hwq(this, hwcVar));
    }

    public final void a() {
        Uri uri;
        if (c()) {
            this.a.f();
            return;
        }
        if (!this.k && (uri = this.i) != null) {
            sxw sxwVar = new sxw(this.s);
            this.g = sxwVar;
            this.q.k(uri, sxwVar);
        }
        this.a.B();
        this.b.o().q();
    }

    public final void b(hyw hywVar) {
        abuz abuzVar = new abuz(hywVar.e());
        sxw sxwVar = this.g;
        if (sxwVar != null && !sxwVar.d()) {
            this.g.c();
            this.g = null;
        }
        d(abuzVar);
    }

    public final boolean c() {
        return this.h || (hwz.l(this.o.f()) && ((ycp) this.r.io()).e == null && this.j && !this.l);
    }

    public final void d(abuz abuzVar) {
        wgg wggVarI;
        hwc hwcVar = this.a;
        Uri uriA = (!abuzVar.m() || (wggVarI = abuzVar.i(hwcVar.getResources().getDisplayMetrics().widthPixels, hwcVar.getResources().getDisplayMetrics().heightPixels)) == null) ? null : wggVarI.a();
        if (uriA == null || !uriA.equals(this.i)) {
            this.k = false;
            this.i = null;
            hwcVar.x(null);
        }
        this.i = uriA;
        a();
    }
}
