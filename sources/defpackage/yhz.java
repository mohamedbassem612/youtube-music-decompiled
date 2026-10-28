package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class yhz {
    public final String a;
    public final String b;

    public yhz(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yhz) {
            yhz yhzVar = (yhz) obj;
            if (this.a.equals(yhzVar.a) && this.b.equals(yhzVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CtmpKeyValue{key=" + this.a + ", value=" + this.b + '}';
    }

    public yhz() {
        throw null;
    }
}
