package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ypb {
    public final int a;
    public final int b;
    public final boolean c;

    public ypb(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ypb) {
            ypb ypbVar = (ypb) obj;
            if (this.a == ypbVar.a && this.b == ypbVar.b && this.c == ypbVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "NetFetchConfig{httpConnectTimeoutMs=" + this.a + ", httpReadTimeoutMs=" + this.b + ", mapInternetDisconnectedToNetUnavailable=" + this.c + '}';
    }

    public ypb() {
        throw null;
    }
}
