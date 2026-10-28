package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tmq {
    public final Object a;
    public final int b;

    public tmq(Object obj, int i) {
        if (obj == null) {
            throw new NullPointerException("Null value");
        }
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tmq) {
            tmq tmqVar = (tmq) obj;
            if (this.a.equals(tmqVar.a) && this.b == tmqVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "Parsed{value=" + this.a.toString() + ", size=" + this.b + '}';
    }

    public tmq() {
        throw null;
    }
}
