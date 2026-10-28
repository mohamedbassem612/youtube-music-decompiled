package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yvw {
    public final long a;
    public final long b;
    public final long c;

    public yvw(long j, long j2, long j3) {
        this.a = j;
        this.b = Math.max(0L, j2);
        this.c = Math.max(0L, j3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yvw)) {
            return false;
        }
        if (obj != this) {
            yvw yvwVar = (yvw) obj;
            if (this.a != yvwVar.a || this.b != yvwVar.b || this.c != yvwVar.c) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        long j = this.b;
        String strBS = j != 0 ? a.bS(j, " snapToKeyframeToleranceBeforeMillis=") : "";
        long j2 = this.c;
        String strBS2 = j2 != 0 ? a.bS(j2, " snapToKeyframeToleranceAfterMillis=") : "";
        return "Position(positionMillis=" + this.a + strBS + strBS2 + ')';
    }
}
