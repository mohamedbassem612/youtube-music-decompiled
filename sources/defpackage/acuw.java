package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acuw extends wnn {
    public final zwb c;
    public final wlp d;
    public final wnh e;
    public final vyo f;
    public final tqj g;
    public final agfr h;
    public final vxu i;
    public final vxz j;
    private final tgg k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acuw(wlp wlpVar, abxv abxvVar, zwb zwbVar, awmd awmdVar, awmd awmdVar2, vxu vxuVar, vyo vyoVar, vxz vxzVar, tqj tqjVar) {
        super(abxvVar, tqjVar.k(1073828825) ? (tgg) awmdVar2.io() : (tgg) awmdVar.io());
        int i = tqr.a;
        this.c = zwbVar;
        wlpVar.getClass();
        this.d = wlpVar;
        this.i = vxuVar;
        this.f = vyoVar;
        this.j = vxzVar;
        this.k = tqjVar.k(1073828825) ? (tgg) awmdVar2.io() : (tgg) awmdVar.io();
        this.g = tqjVar;
        int i2 = 17;
        this.h = aguu.al(new zaz(tqjVar, i2));
        this.e = f(alql.a, wlpVar, new ablq(7), new wvb(18));
        f(alqc.a, wlpVar, new ablq(8), new wvb(i2));
    }

    public final zwa a() {
        return this.c.e();
    }

    public final void b(acuv acuvVar, zza zzaVar) {
        wlt wltVarG;
        wlp wlpVar = this.d;
        ypp yppVarE = wlpVar.e();
        yppVarE.h = acuvVar;
        yppVarE.l(alqc.a);
        yppVarE.d = zzaVar;
        yppVarE.g = new ablq(9);
        yppVarE.f = new wvb(17);
        yppVarE.m(new agqj(new wna(1)));
        if (((Boolean) this.h.io()).booleanValue()) {
            vyo vyoVar = this.f;
            ahfi ahfiVarB = wlt.b(0L);
            ahfiVarB.a = new hyl(vyoVar, 5);
            ahfiVarB.i(new wix(13));
            wltVarG = ahfiVarB.g();
        } else {
            wltVarG = wlpVar.d();
        }
        yppVarE.i = wltVarG;
        this.k.b(yppVarE.k());
    }
}
