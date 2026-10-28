package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class wmm {
    public final long a;
    public final long b;
    public final ByteBuffer c;

    public wmm(long j, long j2, ByteBuffer byteBuffer) {
        this.a = j;
        this.b = j2;
        this.c = byteBuffer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wmm) {
            wmm wmmVar = (wmm) obj;
            if (this.a == wmmVar.a && this.b == wmmVar.b && awrc.c(this.c, wmmVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ByteBuffer byteBuffer = this.c;
        return (((a.ak(this.a) * 31) + a.ak(this.b)) * 31) + (byteBuffer == null ? 0 : byteBuffer.hashCode());
    }

    public final String toString() {
        return "ReplacementRange(start=" + this.a + ", end=" + this.b + ", replacement=" + this.c + ')';
    }
}
