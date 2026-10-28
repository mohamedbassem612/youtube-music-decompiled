package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ysq {
    public final long a;
    public final long b;

    public ysq(byte[] bArr) {
        this.a = -1L;
        this.b = -1L;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ysq) {
            ysq ysqVar = (ysq) obj;
            if (this.a == ysqVar.a && this.b == ysqVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((((int) ((j2 >>> 32) ^ j2)) ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "ByteRange{start=" + this.a + ", end=" + this.b + '}';
    }

    public ysq() {
        throw null;
    }
}
