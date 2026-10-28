package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class wdj {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public wdj(String str, String str2, String str3, String str4) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null type");
        }
        this.b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null sql");
        }
        this.c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null tableName");
        }
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wdj) {
            wdj wdjVar = (wdj) obj;
            if (this.a.equals(wdjVar.a) && this.b.equals(wdjVar.b) && this.c.equals(wdjVar.c) && this.d.equals(wdjVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "MasterTableRow{name=" + this.a + ", type=" + this.b + ", sql=" + this.c + ", tableName=" + this.d + '}';
    }

    public wdj() {
        throw null;
    }
}
