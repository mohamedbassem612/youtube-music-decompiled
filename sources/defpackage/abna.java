package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abna {
    public final zki a;
    public final boolean b;

    public abna(zki zkiVar, boolean z) {
        this.a = zkiVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abna) {
            abna abnaVar = (abna) obj;
            if (this.a.equals(abnaVar.a) && this.b == abnaVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "MediaViewAndParams{mediaView=" + String.valueOf(this.a) + ", broadcastMediaViewChangeImmediately=" + this.b + '}';
    }

    public abna() {
        throw null;
    }
}
