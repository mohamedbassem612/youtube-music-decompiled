package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class yte {
    public final String a;
    public final String b;

    public yte(String str, String str2) {
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null value");
        }
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yte) {
            yte yteVar = (yte) obj;
            if (this.a.equals(yteVar.a) && this.b.equals(yteVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "GenericKeyValuePair{key=" + this.a + ", value=" + this.b + '}';
    }

    public yte() {
        throw null;
    }
}
