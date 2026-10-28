package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class wdi {
    public final String a;
    private final String b;

    public wdi(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wdi) {
            wdi wdiVar = (wdi) obj;
            if (this.a.equals(wdiVar.a) && this.b.equals(wdiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "IndexFingerprint{indexName=" + this.a + ", rawCreateStatement=" + this.b + '}';
    }

    public wdi() {
        throw null;
    }
}
