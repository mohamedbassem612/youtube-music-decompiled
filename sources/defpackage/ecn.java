package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ecn {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public ecn(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ecn) {
            ecn ecnVar = (ecn) obj;
            if (this.a == ecnVar.a && this.b == ecnVar.b && this.c == ecnVar.c && this.d == ecnVar.d && this.e == ecnVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iAj = a.aj(this.a);
        boolean z = this.e;
        boolean z2 = this.d;
        return (((((((iAj * 31) + a.aj(this.b)) * 31) + a.aj(this.c)) * 31) + a.aj(z2)) * 31) + a.aj(z);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.a + ", isValidated=" + this.b + ", isMetered=" + this.c + ", isNotRoaming=" + this.d + ", isBlocked=" + this.e + ')';
    }
}
