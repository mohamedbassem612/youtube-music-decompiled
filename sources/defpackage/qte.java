package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qte {
    public final String a;
    public final Class b;

    public qte(String str, Class cls) {
        this.a = str;
        this.b = cls;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qte) {
            qte qteVar = (qte) obj;
            if (this.b == qteVar.b && this.a.equals(qteVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.format("(%s, %s)", this.a, this.b);
    }
}
