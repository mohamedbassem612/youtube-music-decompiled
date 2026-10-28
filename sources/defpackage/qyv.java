package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qyv {
    public final String a;
    public final String b;

    public qyv(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qyv) {
            qyv qyvVar = (qyv) obj;
            if (this.a.equals(qyvVar.a) && this.b.equals(qyvVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "LocalAndRemoteLocation{local=" + this.a + ", remote=" + this.b + '}';
    }

    public qyv() {
        throw null;
    }
}
