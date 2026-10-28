package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gfj {
    public final hzc a;
    public final aazn b;

    public gfj(hzc hzcVar, aazn aaznVar) {
        if (hzcVar == null) {
            throw new NullPointerException("Null playbackItemChangedEvent");
        }
        this.a = hzcVar;
        if (aaznVar == null) {
            throw new NullPointerException("Null playerStateEvent");
        }
        this.b = aaznVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gfj) {
            gfj gfjVar = (gfj) obj;
            if (this.a.equals(gfjVar.a) && this.b.equals(gfjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        aazn aaznVar = this.b;
        return "PlayerEvents{playbackItemChangedEvent=" + this.a.toString() + ", playerStateEvent=" + aaznVar.toString() + '}';
    }

    public gfj() {
        throw null;
    }
}
