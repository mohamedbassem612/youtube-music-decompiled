package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acqi extends qa {
    public final AtomicInteger a;
    private final acqh b;
    private final acqz c;
    private final abur d;
    private final hno e;

    public acqi(abur aburVar, hno hnoVar, acqh acqhVar, acqz acqzVar) {
        super((byte[]) null);
        this.a = new AtomicInteger(0);
        this.d = aburVar;
        this.e = hnoVar;
        this.b = acqhVar;
        this.c = acqzVar;
    }

    @Override // defpackage.qa
    public final void A(int i, int i2) {
        m();
    }

    @Override // defpackage.qa
    public final void fQ() {
        m();
    }

    @Override // defpackage.qa
    public final void fR(int i, int i2, Object obj) {
        m();
        m();
    }

    @Override // defpackage.qa
    public final void fS(int i, int i2) {
        m();
    }

    @Override // defpackage.qa
    public final void fT(int i, int i2) {
        m();
    }

    @Override // defpackage.qa
    public final void fU(int i, int i2) {
        m();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    public final void m() {
        if (this.a.get() <= 0) {
            acqz acqzVar = this.c;
            acqh acqhVar = this.b;
            long j = acqzVar.M;
            int iA = acqhVar.A(j);
            if (j == Long.MIN_VALUE || iA < 0) {
                return;
            }
            agke agkeVarM = acqhVar.M(Long.MIN_VALUE, null);
            if (agkeVarM.isEmpty()) {
                return;
            }
            hno hnoVar = this.e;
            if (hnoVar.m() && acqzVar.am) {
                ArrayList arrayList = new ArrayList(agkeVarM.size());
                int size = agkeVarM.size();
                for (int i = 0; i < size; i++) {
                    abun abunVar = (abun) agkeVarM.get(i);
                    if (abunVar instanceof abuu) {
                        abuu abuuVar = (abuu) abunVar;
                        abnl abnlVar = abuuVar.a;
                        ajwo ajwoVar = abnlVar.b;
                        if (ajwoVar != null) {
                            aihl aihlVarCheckIsLite = aihn.checkIsLite(apfp.b);
                            ajwoVar.c(aihlVarCheckIsLite);
                            if (ajwoVar.j.n(aihlVarCheckIsLite.d)) {
                                aihl aihlVarCheckIsLite2 = aihn.checkIsLite(apfp.b);
                                ajwoVar.c(aihlVarCheckIsLite2);
                                Object objK = ajwoVar.j.k(aihlVarCheckIsLite2.d);
                                apdw apdwVarA = apdw.a(((apfp) (objK == null ? aihlVarCheckIsLite2.b : aihlVarCheckIsLite2.c(objK))).Y);
                                if (apdwVarA == null) {
                                    apdwVarA = apdw.REEL_LOOP_BEHAVIOR_UNKNOWN;
                                }
                                if (apdwVarA == apdw.REEL_LOOP_BEHAVIOR_AUTO_ADVANCE) {
                                    abnk abnkVarF = abnlVar.f();
                                    abnkVarF.b = true;
                                    abnkVarF.c = true;
                                    abnl abnlVarA = abnkVarF.a();
                                    abut abutVarI = abuu.i(abuuVar);
                                    abutVarI.b(abnlVarA);
                                    arrayList.add(abutVarI.a());
                                } else {
                                    arrayList.add(abunVar);
                                }
                            } else {
                                arrayList.add(abunVar);
                            }
                        } else {
                            arrayList.add(abunVar);
                        }
                    } else {
                        arrayList.add(abunVar);
                    }
                }
                agkeVarM = agke.n(arrayList);
            }
            if (iA >= agkeVarM.size()) {
                agkeVarM.size();
                return;
            }
            agkeVarM.size();
            abuj abujVar = hnoVar.i() >= 2 ? abuj.d : abuj.b;
            abui abuiVarT = abuk.t();
            abuiVarT.b = abujVar;
            abuk abukVarA = abuiVarT.a();
            zj zjVarT = abuc.t();
            zjVarT.h(iA);
            this.d.c(agkeVarM, abukVarA, zjVarT.f());
        }
    }
}
