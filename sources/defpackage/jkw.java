package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jkw {
    private final String a;
    private final int b;

    public jkw(String str, int i) {
        if (str == null) {
            throw new NullPointerException("Null permission");
        }
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jkw) {
            jkw jkwVar = (jkw) obj;
            if (this.a.equals(jkwVar.a) && this.b == jkwVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "PermissionRequest{permission=" + this.a + ", requestCode=" + this.b + '}';
    }

    public jkw() {
        throw null;
    }
}
