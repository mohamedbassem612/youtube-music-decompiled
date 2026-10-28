package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kow {
    public final Object a;
    private final String b;

    public kow(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kow) {
            kow kowVar = (kow) obj;
            if (this.a == kowVar.a && this.b.equals(kowVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 31) + this.b.hashCode();
    }
}
