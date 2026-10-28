package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vus {
    public final vun a;
    public final agev b;

    public vus(vun vunVar, agev agevVar) {
        if (vunVar == null) {
            throw new NullPointerException("Null sizeState");
        }
        this.a = vunVar;
        this.b = agevVar;
    }

    static vus a(vun vunVar, avlh avlhVar) {
        return new vus(vunVar, agev.h(avlhVar));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vus) {
            vus vusVar = (vus) obj;
            if (this.a.equals(vusVar.a) && this.b.equals(vusVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        agev agevVar = this.b;
        return "SizeStateRequest{sizeState=" + this.a.toString() + ", customAnimation=" + agevVar.toString() + '}';
    }

    public vus() {
        throw null;
    }
}
