package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vzv {
    public final String a;
    public final int b;

    public vzv(String str, int i) {
        if (str == null) {
            throw new NullPointerException("Null fileGroupName");
        }
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vzv) {
            vzv vzvVar = (vzv) obj;
            if (this.a.equals(vzvVar.a) && this.b == vzvVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "Key{fileGroupName=" + this.a + ", accessType=" + Integer.toString(this.b - 1) + '}';
    }

    public vzv() {
        throw null;
    }
}
