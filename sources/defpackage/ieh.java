package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ieh {
    public final agke a;
    public final agke b;

    public ieh(agke agkeVar, agke agkeVar2) {
        this.a = agkeVar;
        this.b = agkeVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ieh) {
            ieh iehVar = (ieh) obj;
            if (aguu.v(this.a, iehVar.a) && aguu.v(this.b, iehVar.b)) {
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
        return "QueueEmlResponsesSnapshot{watchNextResponsesWithPlaylistPanel=" + String.valueOf(this.a) + ", musicQueueResponses=" + String.valueOf(agkeVar) + '}';
    }

    public ieh() {
        throw null;
    }
}
