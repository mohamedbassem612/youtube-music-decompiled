package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vtl {
    public final int a;
    public final int b;

    public vtl(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vtl) {
            vtl vtlVar = (vtl) obj;
            if (this.a == vtlVar.a && this.b == vtlVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "EngagementPanelOffsets{xOffset=" + this.a + ", yOffset=" + this.b + '}';
    }

    public vtl() {
        throw null;
    }
}
