package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wbf {
    public final String a;
    public final wbe b;

    public wbf(String str, wbe wbeVar) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.a = str;
        this.b = wbeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wbf) {
            wbf wbfVar = (wbf) obj;
            if (this.a.equals(wbfVar.a) && this.b.equals(wbfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "PendingEdit{key=" + this.a + ", edit=" + this.b.toString() + '}';
    }

    public wbf() {
        throw null;
    }
}
