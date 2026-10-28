package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afut {
    public final afus a;
    public final afuy b;

    public afut(afus afusVar, afuy afuyVar) {
        if (afusVar == null) {
            throw new NullPointerException("Null span");
        }
        this.a = afusVar;
        if (afuyVar == null) {
            throw new NullPointerException("Null extras");
        }
        this.b = afuyVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afut) {
            afut afutVar = (afut) obj;
            if (this.a.equals(afutVar.a) && this.b.equals(afutVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        afuy afuyVar = this.b;
        return "SpanData{span=" + this.a.toString() + ", extras=" + afuyVar.toString() + '}';
    }

    public afut() {
        throw null;
    }
}
