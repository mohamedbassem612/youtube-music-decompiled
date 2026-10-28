package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afio {
    public final Object a;
    public final afiu b;

    public afio(Object obj, afiu afiuVar) {
        this.a = obj;
        if (afiuVar == null) {
            throw new NullPointerException("Null accountData");
        }
        this.b = afiuVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afio) {
            afio afioVar = (afio) obj;
            if (aguu.q(this.a, afioVar.a) && this.b.equals(afioVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        return "ResultAndAccountData{result=" + aguu.n(this.a) + ", accountData=" + this.b.toString() + '}';
    }

    public afio() {
        throw null;
    }
}
