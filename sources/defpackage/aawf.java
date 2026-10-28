package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aawf {
    public final aawh a;
    public final abmt b;
    public tyy c = new aavp(3);
    public aayq d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final abnc h;
    private final awmd i;

    public aawf(zho zhoVar, abnc abncVar, abmt abmtVar, awmd awmdVar) {
        this.h = abncVar;
        this.b = abmtVar;
        this.i = awmdVar;
        aawh aawhVar = new aawh();
        this.a = aawhVar;
        zhoVar.d(aawhVar);
    }

    public final xir a() {
        return (xir) this.c.a();
    }

    public final void b(avlh avlhVar, avlh avlhVar2, avlh avlhVar3) {
        avmm avmmVar = new avmm();
        avmmVar.c(avlhVar.ak(new aapk(this, 16)));
        int i = 17;
        avmmVar.c(avlhVar3.al(new aapk(this, 11), new jop(i)));
        int i2 = 1;
        int i3 = 8;
        avmmVar.c(avlhVar2.p().W(new vvb(new aawe(i2), i3)).ak(new aawl(new aapk(this, 15), "CSIC", 1)));
        avmmVar.c(avlhVar3.p().W(new vvb(new aawe(0), i3)).al(new aapk(this, i), new jop(i)));
        avmmVar.c(avlhVar3.p().W(new vvb(new aawe(2), i3)).al(new aapk(this, 18), new jop(i)));
        int i4 = 19;
        avmmVar.c(avlhVar3.p().W(new vvb(new aawe(3), i3)).al(new aapk(this, i4), new jop(i)));
        int i5 = 20;
        avmmVar.c(avlhVar2.p().W(new vvb(new aawe(4), i3)).ak(new aapk(this, i5)));
        avmmVar.c(avlhVar2.p().W(new vvb(new aawe(5), i3)).ak(new aawi(this, i2)));
        avmmVar.c(avlhVar2.p().W(new vvb(new aawe(6), i3)).ak(new aapk(this, 10)));
        int i6 = 12;
        avmmVar.c(avlhVar3.p().W(new vvb(new wvk(i4), i3)).al(new aapk(this, i6), new jop(i)));
        avmmVar.c(avlhVar3.p().W(new vvb(new wvk(i5), i3)).al(new aapk(this, 13), new jop(i)));
        avmmVar.c(avlhVar2.p().X(new xee(i6)).ak(new aapk(this, 14)));
    }

    public final void c() {
        xir xirVarA = a();
        if (xirVarA != null) {
            xirVarA.n("pl_int");
            e();
        }
    }

    public final void d(aaxn aaxnVar) {
        xir xirVarA = a();
        if (xirVarA != null) {
            long j = aaxnVar.a;
            if (j > 0) {
                xirVarA.o(aaxnVar.d, j);
            } else {
                xirVarA.n(aaxnVar.d);
            }
        }
        if (this.b.q.l(162, 45726649L, false)) {
            ((rnj) this.i.io()).f(aaxnVar.d);
        }
    }

    public final void e() {
        xir xirVarA = a();
        if (xirVarA != null) {
            xirVarA.n("aa");
            tyy tyyVar = this.c;
            if (tyyVar instanceof abmu) {
                ((abmu) tyyVar).a = null;
            }
            this.e = false;
            this.f = false;
            this.g = false;
        }
    }
}
