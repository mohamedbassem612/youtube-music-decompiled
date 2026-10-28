package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acgf implements Comparator, Serializable {
    private final abmt a;

    public acgf(abmt abmtVar) {
        this.a = abmtVar;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compare(acgc acgcVar, acgc acgcVar2) {
        int iA;
        int iA2;
        long j = acgcVar.b;
        long j2 = acgcVar2.b;
        if (j != j2) {
            return j < j2 ? -1 : 1;
        }
        if (acgcVar.a() == acgcVar2.a()) {
            acgd acgdVar = acgcVar.a;
            int iOrdinal = acgdVar.ordinal();
            acgd acgdVar2 = acgcVar2.a;
            if (iOrdinal == acgdVar2.ordinal()) {
                return acgcVar.b().compareTo(acgcVar2.b());
            }
            if (this.a.g.l(307, 45738954L, false)) {
                iA = acgdVar2.ordinal();
                iA2 = acgdVar.ordinal();
            } else {
                iA = acgdVar.ordinal();
                iA2 = acgdVar2.ordinal();
            }
        } else {
            iA = acgcVar2.a();
            iA2 = acgcVar.a();
        }
        return iA - iA2;
    }
}
