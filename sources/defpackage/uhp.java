package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uhp {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;

    public uhp(int i, int i2, int i3, int i4, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
    }

    public static uho a() {
        uho uhoVar = new uho();
        uhoVar.b(-1);
        uhoVar.c(-1);
        uhoVar.e(-1);
        uhoVar.f(-1);
        uhoVar.d(true);
        return uhoVar;
    }

    final boolean b() {
        return this.d != -1;
    }

    final boolean c() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uhp) {
            uhp uhpVar = (uhp) obj;
            if (this.a == uhpVar.a && this.b == uhpVar.b && this.c == uhpVar.c && this.d == uhpVar.d && this.e == uhpVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = true != this.e ? 1237 : 1231;
        int i2 = this.a;
        return ((((((((i2 ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ i;
    }

    public final String toString() {
        return "CloseConfirmationConfig{reshootIcon=" + this.a + ", reshootText=" + this.b + ", exitIcon=" + this.c + ", exitText=" + this.d + ", immersive=" + this.e + '}';
    }

    public uhp() {
        throw null;
    }
}
