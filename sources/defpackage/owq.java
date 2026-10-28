package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class owq {
    private final String a;
    private final int b;
    private final boolean c;
    private final String d;

    public owq(String str, int i, boolean z) {
        if (str == null) {
            throw new NullPointerException("Null fontName");
        }
        this.a = str;
        this.b = i;
        this.c = z;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof owq) {
            owq owqVar = (owq) obj;
            if (this.a.equals(owqVar.a) && this.b == owqVar.b && this.c == owqVar.c) {
                String str = owqVar.d;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
    }

    public final String toString() {
        return "FontKey{fontName=" + this.a + ", weight=" + this.b + ", italic=" + this.c + ", variationSettings=null}";
    }

    public owq() {
        throw null;
    }
}
