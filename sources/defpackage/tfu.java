package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tfu {
    public static final tfu a = a().a();
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;

    public tfu(int i, int i2, boolean z, boolean z2) {
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public static tex a() {
        tex texVar = new tex();
        texVar.b(20000);
        texVar.d(20000);
        texVar.c(true);
        texVar.a = true;
        texVar.b = (byte) (texVar.b | 8);
        return texVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tfu) {
            tfu tfuVar = (tfu) obj;
            if (this.b == tfuVar.b && this.c == tfuVar.c && this.d == tfuVar.d && this.e == tfuVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.d ? 1237 : 1231;
        int i2 = this.b;
        return ((((((i2 ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ i) * 1000003) ^ (true == this.e ? 1231 : 1237);
    }

    public final String toString() {
        return "HttpClientConfig{connectionTimeoutMs=" + this.b + ", readTimeoutMs=" + this.c + ", installSecureRequestEnforcer=" + this.d + ", followRedirects=" + this.e + '}';
    }

    public tfu() {
        throw null;
    }
}
