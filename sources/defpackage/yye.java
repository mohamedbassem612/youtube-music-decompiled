package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yye {
    public final yza a;
    public volatile zah b;
    public final yzc c;
    public final zjr d;
    public final yos e;
    public final zkk f;
    public final agfr g;
    final yup h;
    public boolean i;
    public boolean j;
    public boolean k;
    public volatile zlm l;
    public volatile zcf m;
    public yyd n;
    public boolean o;
    public boolean p;
    public boolean q;
    public String r;
    public final tfq s;
    public final hed t;
    private final agfr u;
    private final yzm v;

    public yye(yza yzaVar, zah zahVar, yzc yzcVar, zjr zjrVar, tfq tfqVar, yos yosVar, zkk zkkVar, hed hedVar, yup yupVar, agfr agfrVar, agfr agfrVar2, yzm yzmVar) {
        this.a = yzaVar;
        this.b = zahVar;
        this.c = yzcVar;
        this.d = zjrVar;
        this.s = tfqVar;
        this.e = yosVar;
        this.f = zkkVar;
        this.t = hedVar;
        this.h = yupVar;
        this.g = agfrVar;
        this.u = agfrVar2;
        this.v = yzmVar;
    }

    public final wiu a() {
        zcf zcfVar = this.m;
        return zcfVar != null ? zcfVar.y : wiu.c;
    }

    public final ywj b() {
        zcf zcfVar = this.m;
        return zcfVar != null ? zcfVar.b : ywj.c;
    }

    final ywn c() {
        zcf zcfVar = this.m;
        return zcfVar != null ? zcfVar.Z : ywn.b;
    }

    public final agfr d(wiu wiuVar) {
        return wiuVar.aK() ? this.u : new ytj(10);
    }

    final void e(zcf zcfVar) {
        if (this.m != zcfVar) {
            if (this.m != null) {
                this.m.W = true;
            }
            this.m = zcfVar;
            if (zcfVar != null) {
                this.h.q(zcfVar.Z, this.d.dy(), zcfVar.y);
                this.v.d(zcfVar);
            }
            this.n = null;
        }
    }

    final boolean f() {
        return this.l != null;
    }
}
