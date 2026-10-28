package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kiq {
    public final int a;
    public final int b;

    public kiq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Deprecated
    public static kiq a(int i, int i2) {
        kro.c(i > 0);
        return new kiq(i, i2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kiq) {
            kiq kiqVar = (kiq) obj;
            if (this.a == kiqVar.a && this.b == kiqVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "ComplianceProductData{productId=" + this.a + ", productIdOrigin=" + Integer.toString(this.b - 1) + '}';
    }

    public kiq() {
        throw null;
    }
}
