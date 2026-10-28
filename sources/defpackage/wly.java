package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class wly {
    public final int a;
    public final agke b;

    public wly(int i, agke agkeVar) {
        this.a = i;
        this.b = agkeVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wly) {
            wly wlyVar = (wly) obj;
            if (this.a == wlyVar.a && aguu.v(this.b, wlyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "NetworkErrorResponseInfo{rpcStatusCode=" + this.a + ", rpcTypeUrls=" + String.valueOf(this.b) + '}';
    }

    public wly() {
        throw null;
    }
}
