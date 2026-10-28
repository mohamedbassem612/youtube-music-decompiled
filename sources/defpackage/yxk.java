package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yxk {
    public final ywz a;
    public final long b;

    public yxk(ywz ywzVar, long j) {
        this.a = ywzVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yxk) {
            yxk yxkVar = (yxk) obj;
            if (this.a.equals(yxkVar.a) && this.b == yxkVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (iHashCode * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "QueueVideoParams{loadVideoParams=" + this.a.toString() + ", transitionPositionMs=" + this.b + '}';
    }

    public yxk() {
        throw null;
    }
}
