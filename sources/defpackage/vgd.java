package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class vgd {
    public final String a;
    public final String b;
    public final String c;

    public vgd(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null string");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null codePoint");
        }
        this.b = str2;
        this.c = str3;
    }

    final boolean a() {
        return this.c != null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vgd) {
            vgd vgdVar = (vgd) obj;
            if (this.a.equals(vgdVar.a) && this.b.equals(vgdVar.b)) {
                String str = this.c;
                if (str == null) {
                    if (vgdVar.c == null) {
                        return true;
                    }
                } else if (str.equals(vgdVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        String str = this.c;
        return (iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "EmojiDescriptor{string=" + this.a + ", codePoint=" + this.b + ", parentCodePoint=" + this.c + '}';
    }

    public vgd() {
        throw null;
    }
}
