package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xiz {
    public final String a;
    public final String b;

    public xiz(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xiz) {
            xiz xizVar = (xiz) obj;
            if (this.a.equals(xizVar.a) && this.b.equals(xizVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "TickInfo{tickName=" + this.a + ", actionNonce=" + this.b + '}';
    }

    public xiz() {
        throw null;
    }
}
