package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class stj {
    private final agke a;
    private final agke b;

    public stj(agke agkeVar, agke agkeVar2) {
        if (agkeVar == null) {
            throw new NullPointerException("Null channelMentionSpans");
        }
        this.a = agkeVar;
        if (agkeVar2 == null) {
            throw new NullPointerException("Null interactions");
        }
        this.b = agkeVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof stj) {
            stj stjVar = (stj) obj;
            if (aguu.v(this.a, stjVar.a) && aguu.v(this.b, stjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        agke agkeVar = this.b;
        return "MentionSpansAndInteractions{channelMentionSpans=" + String.valueOf(this.a) + ", interactions=" + String.valueOf(agkeVar) + '}';
    }

    public stj() {
        throw null;
    }
}
