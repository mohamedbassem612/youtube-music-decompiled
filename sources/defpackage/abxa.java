package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abxa implements abwy {
    private final /* synthetic */ int $cid;
    private final axsp a;
    private final avlh b;
    private final Object c;
    private final avmm d;
    private final awku e;
    private Object f;

    public abxa(axsp axspVar, avlh avlhVar, int i, char[] cArr) {
        this.$cid = i;
        axspVar.getClass();
        avlhVar.getClass();
        this.a = axspVar;
        this.b = avlhVar;
        this.c = new Object();
        avmm avmmVar = new avmm();
        this.d = avmmVar;
        abxo abxoVar = abxo.e;
        int i2 = awku.k;
        abxoVar.getClass();
        awku awkuVar = new awku(abxoVar);
        this.e = awkuVar;
        avmmVar.c(avlhVar.M(abxd.class).H(new vvb(new xzn(8), 12)).p().al(new abwz(new dmf(awkuVar, 8, (float[]) null), 3), new abwz(new xzn(9), 4)));
        this.f = abxoVar;
    }

    @Override // defpackage.abwy
    public final /* synthetic */ abxh a() {
        int i = this.$cid;
        if (i == 0) {
            abxk abxkVar = (abxk) this.e.aD();
            return abxkVar == null ? abxk.a : abxkVar;
        }
        awku awkuVar = this.e;
        if (i != 1) {
            abxo abxoVar = (abxo) awkuVar.aD();
            return abxoVar == null ? abxo.e : abxoVar;
        }
        abxi abxiVar = (abxi) awkuVar.aD();
        return abxiVar == null ? abxi.a : abxiVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [abxp, java.lang.Object] */
    @Override // defpackage.abwy
    public final /* synthetic */ abxp b() {
        int i = this.$cid;
        return this.f;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [abxp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [abxp, java.lang.Object] */
    @Override // defpackage.abwy
    public final /* synthetic */ void f(abxp abxpVar) {
        int i = this.$cid;
        if (i == 0) {
            abxk abxkVar = (abxk) abxpVar;
            abxkVar.getClass();
            synchronized (this.c) {
                if (!awrc.c(abxkVar, this.f)) {
                    Objects.toString(abxkVar);
                    this.f = abxkVar;
                    this.a.kk(new abxb(this.f));
                }
            }
            return;
        }
        boolean z = true;
        if (i != 1) {
            abxo abxoVar = (abxo) abxpVar;
            abxoVar.getClass();
            synchronized (this.c) {
                if (!awrc.c(abxoVar, this.f)) {
                    Objects.toString(abxoVar);
                    this.f = abxoVar;
                    this.a.kk(new abxb(this.f));
                }
            }
            return;
        }
        abxi abxiVar = (abxi) abxpVar;
        abxiVar.getClass();
        synchronized (this.c) {
            if (awrc.c(abxiVar, this.f)) {
                z = false;
            } else {
                Objects.toString(abxiVar);
                this.f = abxiVar;
            }
        }
        if (z) {
            this.a.kk(new abxb(abxiVar));
        }
    }

    public abxa(axsp axspVar, avlh avlhVar, int i) {
        this.$cid = i;
        axspVar.getClass();
        avlhVar.getClass();
        this.a = axspVar;
        this.b = avlhVar;
        this.c = new Object();
        avmm avmmVar = new avmm();
        this.d = avmmVar;
        abxk abxkVar = abxk.a;
        awku awkuVar = new awku(abxkVar);
        this.e = awkuVar;
        avmmVar.c(avlhVar.M(abxd.class).H(new vvb(new xzn(6), 11)).p().al(new abwz(new dmf(awkuVar, 7, (float[]) null), 0), new abwz(new xzn(7), 2)));
        this.f = abxkVar;
    }

    public abxa(axsp axspVar, avlh avlhVar, int i, byte[] bArr) {
        this.$cid = i;
        axspVar.getClass();
        avlhVar.getClass();
        this.a = axspVar;
        this.b = avlhVar;
        this.c = new Object();
        avmm avmmVar = new avmm();
        this.d = avmmVar;
        abxi abxiVar = abxi.a;
        awku awkuVar = new awku(abxiVar);
        this.e = awkuVar;
        avmmVar.c(avlhVar.M(abxd.class).H(new vvb(new xzn(2), 9)).p().al(new abtq(new dmf(awkuVar, 5, (float[]) null), 18), new abtq(new xzn(3), 19)));
        this.f = abxiVar;
    }
}
