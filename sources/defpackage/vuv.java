package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vuv {
    public final vun a;
    public final boolean b;

    public vuv(vun vunVar, boolean z) {
        if (vunVar == null) {
            throw new NullPointerException("Null sizeState");
        }
        this.a = vunVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vuv) {
            vuv vuvVar = (vuv) obj;
            if (this.a.equals(vuvVar.a) && this.b == vuvVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "SizeStateResult{sizeState=" + this.a.toString() + ", hideIntercepted=" + this.b + '}';
    }

    public vuv() {
        throw null;
    }
}
