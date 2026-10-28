package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qws {
    public static final qws a = new qws(1, 1, 1, false);
    public final int b;
    public final int c;
    public final boolean d;
    private final int e;

    public qws(int i, int i2, int i3, boolean z) {
        this.b = i;
        this.c = i2;
        this.e = i3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qws) {
            qws qwsVar = (qws) obj;
            if (this.b == qwsVar.b && this.c == qwsVar.c && this.e == qwsVar.e && this.d == qwsVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.e) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        return "Metadata{width=" + this.b + ", height=" + this.c + ", orientation=" + this.e + ", isGif=" + this.d + '}';
    }

    public qws() {
        throw null;
    }
}
