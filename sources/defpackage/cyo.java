package defpackage;

import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cyo {
    public static final /* synthetic */ int d = 0;
    public final long a;
    public final long b;
    public final int c;

    static {
        Comparator$EL.thenComparingInt(Comparator$EL.thenComparingLong(Comparator$CC.comparingLong(new cpt(2)), new cpt(3)), new ddc(1));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public cyo(long j, long j2, int i) {
        ahno.F((j > j2 ? 1 : (j == j2 ? 0 : -1)) >>> 31);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cyo cyoVar = (cyo) obj;
            if (this.a == cyoVar.a && this.b == cyoVar.b && this.c == cyoVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        return bwp.K("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }
}
