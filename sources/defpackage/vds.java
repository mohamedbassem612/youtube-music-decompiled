package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vds {
    public final auhs a;
    public final aufa b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    private final auhs f;
    private final aufa g;
    private final auft h;
    private final auft i;
    private final boolean j;

    /* JADX WARN: Code duplicated, block: B:93:0x00e6  */
    public vds(auhs auhsVar, auhs auhsVar2) {
        auft auftVar;
        auft auftVar2;
        boolean z;
        auhu auhuVar;
        aiie aiieVar;
        aiie aiieVar2;
        this.f = auhsVar;
        this.a = auhsVar2;
        auhu auhuVar2 = null;
        aufa aufaVarGm = auhsVar != null ? yno.gm(auhsVar) : null;
        this.g = aufaVarGm;
        aufa aufaVarGm2 = auhsVar2 != null ? yno.gm(auhsVar2) : null;
        this.b = aufaVarGm2;
        if (aufaVarGm == null || (aiieVar2 = aufaVarGm.k) == null) {
            auftVar = null;
        } else {
            aihl aihlVar = auft.b;
            aihlVar.getClass();
            auftVar = (auft) yno.gh(aiieVar2, aihlVar);
        }
        this.h = auftVar;
        if (aufaVarGm2 == null || (aiieVar = aufaVarGm2.k) == null) {
            auftVar2 = null;
        } else {
            aihl aihlVar2 = auft.b;
            aihlVar2.getClass();
            auftVar2 = (auft) yno.gh(aiieVar, aihlVar2);
        }
        this.i = auftVar2;
        boolean z2 = true;
        boolean z3 = aufaVarGm != null ? aufaVarGm2 == null : aufaVarGm2 != null;
        this.j = z3;
        if (z3) {
            z = true;
        } else {
            if (aufaVarGm != null && aufaVarGm2 != null) {
                if (awrc.c(aufaVarGm.c == 102 ? (auey) aufaVarGm.d : auey.a, aufaVarGm2.c == 102 ? (auey) aufaVarGm2.d : auey.a)) {
                    if (auftVar != null) {
                        auhuVar = auftVar.j;
                        if (auhuVar == null) {
                            auhuVar = auhu.a;
                        }
                    } else {
                        auhuVar = null;
                    }
                    if (auftVar2 != null && (auhuVar2 = auftVar2.j) == null) {
                        auhuVar2 = auhu.a;
                    }
                    if (!awrc.c(auhuVar, auhuVar2)) {
                    }
                }
                z = true;
            }
            z = false;
        }
        this.c = z;
        this.d = (auftVar == null || (auftVar.c & 2) == 0 || auftVar2 == null || (auftVar2.c & 2) != 0) ? false : true;
        if (!z3) {
            if (aufaVarGm == null || aufaVarGm2 == null) {
                z2 = false;
            } else {
                aigu aiguVar = aufaVarGm.f;
                aiguVar = aiguVar == null ? aigu.a : aiguVar;
                aigu aiguVar2 = aufaVarGm2.f;
                if (awrc.c(aiguVar, aiguVar2 == null ? aigu.a : aiguVar2)) {
                    aigu aiguVar3 = aufaVarGm.g;
                    aiguVar3 = aiguVar3 == null ? aigu.a : aiguVar3;
                    aigu aiguVar4 = aufaVarGm2.g;
                    if (awrc.c(aiguVar3, aiguVar4 == null ? aigu.a : aiguVar4)) {
                        aigu aiguVar5 = aufaVarGm.h;
                        aiguVar5 = aiguVar5 == null ? aigu.a : aiguVar5;
                        aigu aiguVar6 = aufaVarGm2.h;
                        if (awrc.c(aiguVar5, aiguVar6 == null ? aigu.a : aiguVar6)) {
                            z2 = false;
                        }
                    }
                }
            }
        }
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vds) {
            vds vdsVar = (vds) obj;
            if (awrc.c(this.f, vdsVar.f) && awrc.c(this.a, vdsVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        auhs auhsVar = this.f;
        int iHashCode = auhsVar == null ? 0 : auhsVar.hashCode();
        auhs auhsVar2 = this.a;
        return (iHashCode * 31) + (auhsVar2 != null ? auhsVar2.hashCode() : 0);
    }

    public final String toString() {
        return "CompositionDiff(previousComposition=" + this.f + ", currentComposition=" + this.a + ')';
    }
}
