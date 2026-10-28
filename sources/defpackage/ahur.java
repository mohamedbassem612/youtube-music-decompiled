package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahur {
    public final String a;

    public ahur(String str) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahur) {
            return this.a.equals(((ahur) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "HttpHeaderKey{key=" + this.a + '}';
    }

    public ahur() {
        throw null;
    }
}
