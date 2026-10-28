package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abwx implements abwy {
    public static final String a = twu.b("PlaybackRateSettingControl");
    public final mbc b;
    public final vyo c;
    public long d;
    public boolean e;
    public abxj f;
    private final axsp g;
    private final avlh h;
    private final avlh i;
    private final abmt j;
    private final Object k;
    private final avmm l;
    private final awku m;

    public abwx(axsp axspVar, avlh avlhVar, avlh avlhVar2, mbc mbcVar, vyo vyoVar, vxu vxuVar, abmt abmtVar) {
        axspVar.getClass();
        avlhVar.getClass();
        avlhVar2.getClass();
        mbcVar.getClass();
        vyoVar.getClass();
        vxuVar.getClass();
        abmtVar.getClass();
        this.g = axspVar;
        this.h = avlhVar;
        this.i = avlhVar2;
        this.b = mbcVar;
        this.c = vyoVar;
        this.j = abmtVar;
        this.k = new Object();
        avmm avmmVar = new avmm();
        this.l = avmmVar;
        abxg abxgVar = abxg.a;
        int i = awku.k;
        abxgVar.getClass();
        awku awkuVar = new awku(abxgVar);
        this.m = awkuVar;
        this.d = -1L;
        avmmVar.c(avlhVar.M(abxe.class).y(new vvb(new xzn(4), 10)).M(abxg.class).p().al(new abtq(new dmf(awkuVar, 6, (float[]) null), 20), new abwz(new xzn(5), 1)));
        if (abmtVar.aA()) {
            avmmVar.c(avlhVar2.p().W(new vvb(new abfb(18), 8)).al(new absp(new abqf(this, 7), 11), new absp(new yta(14), 12)));
            avmmVar.c(avlhVar2.p().W(new vvb(new abfb(19), 8)).al(new absp(new abqf(this, 8), 13), new absp(new yta(15), 14)));
            avmmVar.c(avlhVar2.p().W(new vvb(new abfb(20), 8)).al(new absp(new abqf(this, 9), 15), new absp(new yta(16), 8)));
            avmmVar.c(avlhVar2.p().W(new vvb(new abfb(17), 8)).al(new aawl(new absp(this, 9), "PRSC", 0), new absp(new yta(13), 10)));
        }
        this.f = abxj.a;
    }

    @Override // defpackage.abwy
    public final /* bridge */ /* synthetic */ abxh a() {
        abxg abxgVar = (abxg) this.m.aD();
        return abxgVar == null ? abxg.a : abxgVar;
    }

    @Override // defpackage.abwy
    public final /* synthetic */ abxp b() {
        return this.f;
    }

    public final void c() {
        this.d = -1L;
        f(abxj.a);
    }

    public final void d() {
        this.d = this.b.b();
    }

    @Override // defpackage.abwy
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void f(abxj abxjVar) {
        abxjVar.getClass();
        synchronized (this.k) {
            abxj abxjVar2 = this.f;
            abxjVar2.getClass();
            float f = abxjVar.b;
            Float f2 = abxjVar.c;
            if (f2 == null) {
                f2 = abxjVar2.c;
            }
            abxj abxjVar3 = new abxj(f, f2);
            if (!awrc.c(abxjVar3, this.f)) {
                abxjVar3.toString();
                this.f = abxjVar3;
                this.g.kk(new abxb(this.f));
            }
        }
    }
}
