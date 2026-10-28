package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nzk {
    public final boolean a;
    public final int b;
    public final agke c;

    public nzk(boolean z, int i, agke agkeVar) {
        this.a = z;
        this.b = i;
        if (agkeVar == null) {
            throw new NullPointerException("Null collectionReasons");
        }
        this.c = agkeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nzk) {
            nzk nzkVar = (nzk) obj;
            if (this.a == nzkVar.a && this.b == nzkVar.b && aguu.v(this.c, nzkVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "Decision{shouldLog=" + this.a + ", collectionRate=" + this.b + ", collectionReasons=" + this.c.toString() + '}';
    }

    public nzk() {
        throw null;
    }
}
