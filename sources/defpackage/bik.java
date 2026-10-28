package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bik {
    private final Object a;
    private final int b;

    public bik(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bik)) {
            return false;
        }
        bik bikVar = (bik) obj;
        return this.a == bikVar.a && this.b == bikVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
