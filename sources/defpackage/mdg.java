package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mdg {
    public final int a;
    private final long b;
    private final String c;
    private final String d;

    public mdg(int i, long j, String str, String str2) {
        this.a = i;
        this.b = j;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mdg) {
            mdg mdgVar = (mdg) obj;
            if (this.a == mdgVar.a && this.b == mdgVar.b && this.c.equals(mdgVar.c) && this.d.equals(mdgVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((((((this.a ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "ThreadIdentifier{tid=" + this.a + ", id=" + this.b + ", name=" + this.c + ", threadPoolName=" + this.d + '}';
    }

    public mdg() {
        throw null;
    }
}
