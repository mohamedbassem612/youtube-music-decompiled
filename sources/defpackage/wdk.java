package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class wdk {
    public final String a;
    public final agkz b;
    private final String c;

    public wdk(String str, String str2, agkz agkzVar) {
        this.c = str;
        this.a = str2;
        if (agkzVar == null) {
            throw new NullPointerException("Null indexFingerprints");
        }
        this.b = agkzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wdk) {
            wdk wdkVar = (wdk) obj;
            if (this.c.equals(wdkVar.c) && this.a.equals(wdkVar.a) && this.b.equals(wdkVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "TableFingerprint{tableName=" + this.c + ", rawCreateStatement=" + this.a + ", indexFingerprints=" + this.b.toString() + '}';
    }

    public wdk() {
        throw null;
    }
}
