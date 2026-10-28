package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class lxk {
    private final Object a;
    private final int b;

    public lxk(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lxk)) {
            return false;
        }
        lxk lxkVar = (lxk) obj;
        return this.a == lxkVar.a && this.b == lxkVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
