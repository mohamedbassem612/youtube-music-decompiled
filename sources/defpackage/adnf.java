package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adnf {
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public adnf(int i, int i2, int i3, int i4) {
        this.a = 250L;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adnf) {
            adnf adnfVar = (adnf) obj;
            if (this.a == adnfVar.a && this.b == adnfVar.b && this.c == adnfVar.c && this.d == adnfVar.d && this.e == adnfVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((int) this.a) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e;
    }

    public final String toString() {
        return "MoveAgainParameters{duration=" + this.a + ", fromX=" + this.b + ", fromY=" + this.c + ", toX=" + this.d + ", toY=" + this.e + '}';
    }

    public adnf() {
        throw null;
    }
}
