package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class axpx {
    private final Object a;
    private final int b;

    public axpx(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof axpx)) {
            return false;
        }
        axpx axpxVar = (axpx) obj;
        return this.a == axpxVar.a && this.b == axpxVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
