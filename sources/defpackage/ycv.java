package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ycv {
    public final xvu a;
    public final xvy b;
    public final xvv c;
    public final xvh d;
    public final boolean e;
    public final String f;
    public final String g;

    public ycv(xvu xvuVar, xvy xvyVar, xvv xvvVar, xvh xvhVar, boolean z, String str, String str2) {
        this.a = xvuVar;
        this.b = xvyVar;
        this.c = xvvVar;
        this.d = xvhVar;
        this.e = z;
        this.f = str;
        this.g = str2;
    }

    public final boolean a() {
        return this.a != null;
    }

    public final boolean b() {
        return this.b != null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ycv) {
            ycv ycvVar = (ycv) obj;
            xvu xvuVar = this.a;
            if (xvuVar != null ? xvuVar.equals(ycvVar.a) : ycvVar.a == null) {
                xvy xvyVar = this.b;
                if (xvyVar != null ? xvyVar.equals(ycvVar.b) : ycvVar.b == null) {
                    xvv xvvVar = this.c;
                    if (xvvVar != null ? xvvVar.equals(ycvVar.c) : ycvVar.c == null) {
                        xvh xvhVar = this.d;
                        if (xvhVar != null ? xvhVar.equals(ycvVar.d) : ycvVar.d == null) {
                            if (this.e == ycvVar.e && this.f.equals(ycvVar.f) && this.g.equals(ycvVar.g)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        xvu xvuVar = this.a;
        int iHashCode = xvuVar == null ? 0 : xvuVar.hashCode();
        xvy xvyVar = this.b;
        int iHashCode2 = xvyVar == null ? 0 : xvyVar.hashCode();
        int i = iHashCode ^ 1000003;
        xvv xvvVar = this.c;
        int i2 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (xvvVar == null ? 0 : xvvVar.b)) * 1000003;
        xvh xvhVar = this.d;
        return ((((((i2 ^ (xvhVar != null ? xvhVar.hashCode() : 0)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        xvh xvhVar = this.d;
        xvv xvvVar = this.c;
        xvy xvyVar = this.b;
        return "ConnectionProperties{method=" + String.valueOf(this.a) + ", params=" + String.valueOf(xvyVar) + ", pairingInfo=" + String.valueOf(xvvVar) + ", loungeToken=" + String.valueOf(xvhVar) + ", userInitiated=" + this.e + ", magmaKey=" + this.f + ", browserChannelUrl=" + this.g + '}';
    }

    public ycv() {
        throw null;
    }
}
