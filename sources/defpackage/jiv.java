package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jiv {
    public final int a;
    public final int b;

    public jiv(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jiv) {
            jiv jivVar = (jiv) obj;
            if (this.a == jivVar.a && this.b == jivVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "GridMetadata{numColumns=" + this.a + ", pageMargins=" + this.b + '}';
    }

    public jiv() {
        throw null;
    }
}
