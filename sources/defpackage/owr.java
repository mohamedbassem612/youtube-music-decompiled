package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class owr {
    private final String a;
    private final int b;

    public owr(String str, int i) {
        if (str == null) {
            throw new NullPointerException("Null fontName");
        }
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof owr) {
            owr owrVar = (owr) obj;
            if (this.a.equals(owrVar.a) && this.b == owrVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "LegacyFontKey{fontName=" + this.a + ", weightAdjustment=" + this.b + '}';
    }

    public owr() {
        throw null;
    }
}
