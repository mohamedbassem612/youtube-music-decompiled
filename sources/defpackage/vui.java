package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vui {
    public final int a;
    public final int b;

    public vui(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vui) {
            vui vuiVar = (vui) obj;
            if (this.a == vuiVar.a && this.b == vuiVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "CumulativeDeltaForScreenClampedContext{resizeDelta=" + this.a + ", yOffsetForStaticState=" + this.b + '}';
    }

    public vui() {
        throw null;
    }
}
