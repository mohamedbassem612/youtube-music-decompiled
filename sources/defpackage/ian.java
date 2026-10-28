package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ian {
    public final wgi a;
    public final boolean b;

    public ian(wgi wgiVar, boolean z) {
        if (wgiVar == null) {
            throw new NullPointerException("Null response");
        }
        this.a = wgiVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ian) {
            ian ianVar = (ian) obj;
            if (this.a.equals(ianVar.a) && this.b == ianVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ResponseWithSource{response=" + this.a.toString() + ", isOnline=" + this.b + '}';
    }

    public ian() {
        throw null;
    }
}
