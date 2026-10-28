package defpackage;

import internal.org.jni_zero.JniZero;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ayp implements boe {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ayp(ayq ayqVar, ayr ayrVar, int i) {
        this.$cid = i;
        this.a = ayqVar;
        this.b = ayrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [ayr, java.lang.Object] */
    @Override // defpackage.boe
    public final void a(bog bogVar, boa boaVar) {
        int i = this.$cid;
        if (i == 0) {
            if (boaVar == boa.ON_DESTROY) {
                ((ayq) this.a).d(this.b);
                return;
            }
            return;
        }
        if (i == 1) {
            qe.addObserverForBackInvoker$lambda$0((qv) this.b, (qe) this.a, bogVar, boaVar);
            return;
        }
        if (((awri) this.b).a && boaVar == boa.ON_RESUME) {
            return;
        }
        Object obj = this.a;
        int iOrdinal = boaVar.ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                ((adrf) obj).l();
                return;
            }
            if (iOrdinal != 4) {
                if (iOrdinal == 5) {
                    ((adrf) obj).i(false);
                    return;
                }
                return;
            }
            adrf adrfVar = (adrf) obj;
            adrfVar.n();
            adqt adqtVar = adrfVar.f;
            int iAc = acfz.ac(adqtVar);
            if (iAc == 0) {
                adqn adqnVar = (adqn) adqtVar;
                adqnVar.c.p(null);
                awrc.O(adqnVar.b);
                adrfVar.f = acfz.Z(adqnVar);
                return;
            }
            if (iAc != 1) {
                if (iAc != 2 && iAc != 3 && iAc != 4) {
                    throw new awmj();
                }
                return;
            }
            xir xirVar = adrfVar.g;
            if (xirVar != null) {
                xirVar.f(tau.ACTION_ABANDONED);
            }
            adrfVar.g = null;
            awrc.O(((adqp) adqtVar).c);
            adrfVar.f = adqo.a;
            return;
        }
        adrf adrfVar2 = (adrf) obj;
        if (adrfVar2.q) {
            adrfVar2.q = true;
            boc bocVarA = adrfVar2.a();
            if (bocVarA != null) {
                adqt adqtVar2 = adrfVar2.f;
                Objects.checkIndex(0, 6);
                if (adqtVar2 != null) {
                    if (adqtVar2 instanceof adqq) {
                        adrfVar2.g();
                        awut awutVarK = awrc.K(JniZero.u(new awwf(null), adrfVar2.b));
                        adqq adqqVar = (adqq) adqtVar2;
                        adrfVar2.f = adqqVar.a.a(awutVarK, adrfVar2.f(acfz.X(adqqVar), bocVarA, awutVarK));
                        return;
                    }
                    if (adqtVar2 instanceof adqn) {
                        adqn adqnVar2 = (adqn) adqtVar2;
                        if (adqnVar2.c.q() || !bocVarA.a().a(bob.e)) {
                            return;
                        }
                        adrfVar2.g();
                        adqc adqcVarX = acfz.X(adqnVar2);
                        awut awutVar = adqnVar2.b;
                        adrfVar2.f = new adqn(adqnVar2.a, awutVar, adrfVar2.f(adqcVarX, bocVarA, awutVar));
                        return;
                    }
                    if (adqtVar2 instanceof adqo) {
                        adqk adqkVar = adrfVar2.p;
                        if (adqkVar != null) {
                            awqg awqgVar = adqkVar.c;
                            adrfVar2.o(bocVarA, adqkVar.a, adqkVar.b, 0, null, true, awqgVar);
                            return;
                        }
                        return;
                    }
                    if ((adqtVar2 instanceof adqp) || (adqtVar2 instanceof adqr)) {
                        return;
                    }
                }
                throw new awmj();
            }
        }
    }

    public /* synthetic */ ayp(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
