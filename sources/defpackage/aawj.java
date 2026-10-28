package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aawj {
    private final mbc a;
    private final xit b;
    private boolean c;
    private long d;
    private agev e = agdf.a;
    private final dov f;

    public aawj(mbc mbcVar, xit xitVar, dov dovVar) {
        mbcVar.getClass();
        this.a = mbcVar;
        xitVar.getClass();
        this.b = xitVar;
        dovVar.getClass();
        this.f = dovVar;
    }

    public final void a(avlh avlhVar, avlh avlhVar2) {
        avmm avmmVar = new avmm();
        int i = 8;
        int i2 = 18;
        avmmVar.c(avlhVar2.p().W(new vvb(new aawe(7), i)).al(new aawi(this, 3), new jop(i2)));
        avmmVar.c(avlhVar2.p().W(new vvb(new aawe(10), i)).al(new aawi(this, 4), new jop(i2)));
        avmmVar.c(avlhVar2.p().W(new vvb(new aawe(11), i)).al(new aawi(this, 5), new jop(i2)));
        avmmVar.c(avlhVar2.p().W(new vvb(new aawe(i), i)).al(new aawi(this, 0), new jop(i2)));
        avmmVar.c(avlhVar.p().W(new vvb(new aawe(9), i)).ak(new aawi(this, 2)));
    }

    public final void b(aaxn aaxnVar) {
        if (this.c) {
            synchronized (this) {
                if (this.f.ae(0.0d, 1.0d) < 0.10000000149011612d) {
                    xit xitVar = this.b;
                    long j = this.d;
                    agev agevVar = this.e;
                    if (agevVar.g()) {
                        Object objC = agevVar.c();
                        xir xirVarO = xitVar.o(120);
                        xirVarO.l(j);
                        xirVarO.o(((tas) objC).d, ((aaxn) objC).a);
                        xirVarO.o(aaxnVar.d, aaxnVar.a);
                    }
                }
            }
            d();
        }
    }

    public final synchronized void c(aaxw aaxwVar) {
        if (this.c) {
            this.e = agev.i(aaxwVar);
        }
    }

    public final synchronized void d() {
        this.c = false;
        this.e = agdf.a;
    }

    public final synchronized void e() {
        long epochMilli = this.a.f().toEpochMilli();
        Long.valueOf(epochMilli).getClass();
        this.d = epochMilli;
        this.c = true;
    }
}
