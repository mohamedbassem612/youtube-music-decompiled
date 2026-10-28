package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vut {
    public final vuy a;
    public final vun b;
    public final boolean c;

    public vut(vuy vuyVar, vun vunVar, boolean z) {
        if (vuyVar == null) {
            throw new NullPointerException("Null touchReleaseType");
        }
        this.a = vuyVar;
        this.b = vunVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vut) {
            vut vutVar = (vut) obj;
            if (this.a.equals(vutVar.a) && this.b.equals(vutVar.b) && this.c == vutVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        vun vunVar = this.b;
        return "TouchReleaseWithResultingSizeState{touchReleaseType=" + this.a.toString() + ", resultingSizeState=" + vunVar.toString() + ", hideIntercepted=" + this.c + '}';
    }

    public vut() {
        throw null;
    }
}
