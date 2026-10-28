package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ygt {
    public final String a;
    public final ygk b;

    public ygt(String str, ygk ygkVar) {
        if (str == null) {
            throw new NullPointerException("Null videoId");
        }
        this.a = str;
        if (ygkVar == null) {
            throw new NullPointerException("Null videoFormatKey");
        }
        this.b = ygkVar;
    }

    public static ygt a(String str) {
        return new ygt(zik.bx(str), ygk.b(zik.bp(str), zik.by(str), zik.bq(str)));
    }

    public final String b() {
        String str = this.a;
        ygk ygkVar = this.b;
        return zik.bu(str, ygkVar.a, ygkVar.b, ygkVar.c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ygt) {
            ygt ygtVar = (ygt) obj;
            if (this.a.equals(ygtVar.a) && this.b.equals(ygtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "YoutubeCacheKey{videoId=" + this.a + ", videoFormatKey=" + this.b.toString() + '}';
    }

    public ygt() {
        throw null;
    }
}
