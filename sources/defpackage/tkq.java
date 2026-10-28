package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tkq {
    public final byte[] a;
    public final ByteBuffer b;

    public tkq(byte[] bArr, ByteBuffer byteBuffer) {
        this.a = bArr;
        this.b = byteBuffer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tkq) {
            tkq tkqVar = (tkq) obj;
            if (awrc.c(this.a, tkqVar.a) && awrc.c(this.b, tkqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Dictionary(hash=" + Arrays.toString(this.a) + ", contents=" + this.b + ')';
    }
}
