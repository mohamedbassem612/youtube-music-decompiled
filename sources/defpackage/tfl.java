package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tfl {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    private final boolean g;

    public tfl(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, int i2) {
        this.g = z;
        this.a = z2;
        this.b = z3;
        this.c = z4;
        this.d = z5;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tfl) {
            tfl tflVar = (tfl) obj;
            if (this.g == tflVar.g && this.a == tflVar.a && this.b == tflVar.b && this.c == tflVar.c && this.d == tflVar.d && this.e == tflVar.e && this.f == tflVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((true == this.g ? 1231 : 1237) ^ 1000003) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e) * 1000003) ^ this.f;
    }

    public final String toString() {
        return "ConnectivityStatus{connectedOrConnecting=" + this.g + ", connected=" + this.a + ", temporarilyUnmetered=" + this.b + ", chargeable=" + this.c + ", dataSaverEnabled=" + this.d + ", connectionType=" + this.e + ", detailedNetworkType=" + Integer.toString(this.f - 1) + '}';
    }

    public tfl() {
        throw null;
    }
}
