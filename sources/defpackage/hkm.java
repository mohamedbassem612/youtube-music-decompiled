package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class hkm {
    public final int a;
    public final int b;

    public hkm(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hkm) {
            hkm hkmVar = (hkm) obj;
            if (this.a == hkmVar.a && this.b == hkmVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "PageAnimations(enter=" + this.a + ", exit=" + this.b + ')';
    }
}
