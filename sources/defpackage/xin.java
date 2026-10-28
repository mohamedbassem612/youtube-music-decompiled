package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xin {
    private final String a;
    private final boolean b;
    private final int c;

    public xin(int i, String str, boolean z) {
        this.c = i;
        this.a = str;
        this.b = z;
    }

    public static xin a(int i, xis xisVar) {
        return new xin(i, xisVar.b, xisVar.c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xin) {
            xin xinVar = (xin) obj;
            if (this.c == xinVar.c && this.a.equals(xinVar.a) && this.b == xinVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.c ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "CacheKey{actionType=" + Integer.toString(this.c - 1) + ", actionDescriptor=" + this.a + ", isUniquePerActionType=" + this.b + '}';
    }

    public xin() {
        throw null;
    }
}
