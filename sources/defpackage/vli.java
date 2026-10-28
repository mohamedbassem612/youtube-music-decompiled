package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class vli {
    public final long a;
    public final String b;

    public vli(long j, String str) {
        this.a = j;
        if (str == null) {
            throw new NullPointerException("Null cpid");
        }
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vli) {
            vli vliVar = (vli) obj;
            if (this.a == vliVar.a && this.b.equals(vliVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "DataPlanIdentifier{carrierId=" + this.a + ", cpid=" + this.b + '}';
    }

    public vli() {
        throw null;
    }
}
