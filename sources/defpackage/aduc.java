package defpackage;

import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class aduc extends adtv {
    public final Object as;
    public final adtm at;
    public adtv au;
    public adtv av;

    public aduc(adxd adxdVar, wnf wnfVar, tbt tbtVar, Object obj, ttm ttmVar, xgn xgnVar, adtq adtqVar, Queue queue, awmd awmdVar) {
        super(adxdVar, wnfVar, tbtVar, obj, ttmVar, xgnVar, adtqVar, queue, awmdVar);
        this.as = obj;
        this.at = new adtm() { // from class: adub
            @Override // defpackage.adtm
            public final void p(toe toeVar, acjx acjxVar) {
                adtm adtmVar = this.a.an;
                if (adtmVar != null) {
                    adtmVar.p(toeVar, acjxVar);
                }
            }
        };
    }

    public static final boolean aM(adtv adtvVar) {
        return adtvVar.o(acjw.b) || adtvVar.o(acjw.c);
    }

    protected static final boolean aN(adtv adtvVar) {
        return adtvVar != null && aM(adtvVar) && adtvVar.hu();
    }

    private static final boolean ka(acjw acjwVar) {
        return acjwVar == acjw.b || acjwVar == acjw.c;
    }

    protected final boolean aL(adtv adtvVar) {
        adtv adtvVar2 = this.av;
        if (adtvVar2 != null && aM(adtvVar2)) {
            return false;
        }
        adtv adtvVar3 = this.au;
        if (adtvVar3 != null) {
            if (aM(adtvVar3)) {
                return false;
            }
        } else if ((super.o(acjw.b) || super.o(acjw.c)) && !aN(adtvVar)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.adtv
    public final Object ax() {
        return this.as;
    }

    @Override // defpackage.adtv
    public final acjx hQ(acjw acjwVar) {
        adtv adtvVar = this.av;
        if (adtvVar != null && ka(acjwVar) && adtvVar.o(acjwVar)) {
            return this.av.hQ(acjwVar);
        }
        adtv adtvVar2 = this.au;
        return (adtvVar2 == null || !ka(acjwVar)) ? super.hQ(acjwVar) : adtvVar2.hQ(acjwVar);
    }

    @Override // defpackage.adtv
    public final void hR(acjw acjwVar) {
        adtv adtvVar;
        adtv adtvVar2;
        if (ka(acjwVar) && (adtvVar2 = this.av) != null && adtvVar2.o(acjwVar)) {
            this.av.hR(acjwVar);
        }
        if (ka(acjwVar) && (adtvVar = this.au) != null && adtvVar.hQ(acjwVar) != null) {
            this.au.hR(acjwVar);
            if (!this.au.hu()) {
                return;
            }
        }
        super.hR(acjwVar);
    }

    @Override // defpackage.adtv
    public final boolean o(acjw acjwVar) {
        if (ka(acjwVar)) {
            adtv adtvVar = this.av;
            if (adtvVar != null && adtvVar.o(acjwVar)) {
                return true;
            }
            adtv adtvVar2 = this.au;
            if (adtvVar2 != null) {
                return adtvVar2.o(acjwVar);
            }
        }
        return super.o(acjwVar);
    }
}
