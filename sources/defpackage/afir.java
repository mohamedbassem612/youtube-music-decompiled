package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afir {
    private final String a;
    private final String b;

    public afir(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afir) {
            afir afirVar = (afir) obj;
            if (this.a.equals(afirVar.a) && this.b.equals(afirVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "TypeAndUserId{type=" + this.a + ", userId=" + this.b + '}';
    }

    public afir() {
        throw null;
    }
}
