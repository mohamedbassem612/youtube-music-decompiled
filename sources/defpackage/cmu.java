package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class cmu implements coq {
    private final agke a;
    private long b;

    public cmu(List list, List list2) {
        agjz agjzVar = new agjz(4);
        ahno.F(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            agjzVar.h(new cmt((coq) list.get(i), (List) list2.get(i)));
        }
        this.a = agjzVar.g();
        this.b = -9223372036854775807L;
    }

    @Override // defpackage.coq
    public final long d() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            agke agkeVar = this.a;
            if (i >= ((agpi) agkeVar).d) {
                break;
            }
            long jD = ((cmt) agkeVar.get(i)).d();
            if (jD != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jD);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // defpackage.coq
    public final long gt() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            agke agkeVar = this.a;
            if (i >= ((agpi) agkeVar).d) {
                break;
            }
            cmt cmtVar = (cmt) agkeVar.get(i);
            long jGt = cmtVar.gt();
            agke agkeVar2 = cmtVar.a;
            if ((agkeVar2.contains(1) || agkeVar2.contains(2) || agkeVar2.contains(4)) && jGt != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jGt);
            }
            if (jGt != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jGt);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.b;
        return j == -9223372036854775807L ? jMin2 : j;
    }

    @Override // defpackage.coq
    public final void m(long j) {
        int i = 0;
        while (true) {
            agke agkeVar = this.a;
            if (i >= ((agpi) agkeVar).d) {
                return;
            }
            ((cmt) agkeVar.get(i)).m(j);
            i++;
        }
    }

    @Override // defpackage.coq
    public final boolean o(ccy ccyVar) {
        boolean zO;
        boolean z = false;
        do {
            long jD = d();
            if (jD == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            zO = false;
            while (true) {
                agke agkeVar = this.a;
                if (i >= ((agpi) agkeVar).d) {
                    break;
                }
                long jD2 = ((cmt) agkeVar.get(i)).d();
                boolean z2 = jD2 != Long.MIN_VALUE && jD2 <= ccyVar.a;
                if (jD2 == jD || z2) {
                    zO |= ((cmt) agkeVar.get(i)).o(ccyVar);
                }
                i++;
            }
            z |= zO;
        } while (zO);
        return z;
    }

    @Override // defpackage.coq
    public final boolean p() {
        int i = 0;
        while (true) {
            agke agkeVar = this.a;
            if (i >= ((agpi) agkeVar).d) {
                return false;
            }
            if (((cmt) agkeVar.get(i)).p()) {
                return true;
            }
            i++;
        }
    }

    @Deprecated
    public cmu(coq[] coqVarArr) {
        this(agke.p(coqVarArr), Collections.nCopies(coqVarArr.length, agke.q(-1)));
    }
}
