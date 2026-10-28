package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vky {
    public final String a;
    public final float b;
    public final int c;
    public final int d;
    public final int e;

    public vky(String str, float f, int i, int i2, int i3) {
        if (str == null) {
            throw new NullPointerException("Null text");
        }
        this.a = str;
        this.b = f;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vky) {
            vky vkyVar = (vky) obj;
            if (this.a.equals(vkyVar.a)) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(vkyVar.b) && this.c == vkyVar.c && this.d == vkyVar.d && this.e == vkyVar.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public final String toString() {
        return "EditTextExtractedData{text=" + this.a + ", fontSize=" + this.b + ", foregroundColor=" + this.c + ", backgroundColor=" + this.d + ", alignment=" + this.e + '}';
    }

    public vky() {
        throw null;
    }
}
