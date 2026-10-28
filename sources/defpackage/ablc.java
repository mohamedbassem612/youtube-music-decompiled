package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ablc {
    private final abla a;
    private final abla b;

    public ablc(abla ablaVar, abla ablaVar2) {
        this.a = ablaVar;
        this.b = ablaVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ablc) {
            ablc ablcVar = (ablc) obj;
            if (this.a.equals(ablcVar.a) && this.b.equals(ablcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        abla ablaVar = this.b;
        return "WatchPageResponseContainer{watchNextResponseModel=" + this.a.toString() + ", playerResponseModel=" + ablaVar.toString() + '}';
    }

    public ablc() {
        throw null;
    }
}
