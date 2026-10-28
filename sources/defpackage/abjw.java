package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class abjw {
    public final agke a;
    public final int b;

    public abjw(agke agkeVar, int i) {
        if (agkeVar == null) {
            throw new NullPointerException("Null queue");
        }
        this.a = agkeVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abjw) {
            abjw abjwVar = (abjw) obj;
            if (aguu.v(this.a, abjwVar.a) && this.b == abjwVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "QueueListSnapshot{queue=" + this.a.toString() + ", playbackPosition=" + this.b + '}';
    }

    public abjw() {
        throw null;
    }
}
