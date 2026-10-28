package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class kpn {
    public final int a;
    public final int b;

    public kpn(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof kpn)) {
                return false;
            }
            kpn kpnVar = (kpn) obj;
            if (this.a != kpnVar.a || this.b != kpnVar.b) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a;
        return this.b ^ ((i << 16) | (i >>> 16));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('x');
        sb.append(this.b);
        return sb.toString();
    }
}
