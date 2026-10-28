package defpackage;

import j$.util.Objects;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nwl {
    public static final ByteBuffer a;
    public static final nwl b;
    private final ByteBuffer c;
    private volatile ByteBuffer e = null;
    private final boolean d = false;

    static {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[0]);
        a = byteBufferWrap;
        b = new nwl(byteBufferWrap);
    }

    private nwl(ByteBuffer byteBuffer) {
        this.c = byteBuffer.duplicate();
    }

    public static nwl a(byte[] bArr) {
        return bArr == null ? b : new nwl(ByteBuffer.wrap(bArr));
    }

    public static nwl b(asnx asnxVar) {
        return a(asnxVar.toByteArray());
    }

    public final ByteBuffer c() {
        return this.c.duplicate();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nwl)) {
            return false;
        }
        nwl nwlVar = (nwl) obj;
        boolean z = nwlVar.d;
        return this.c.equals(nwlVar.c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.FALSE, this.c);
    }
}
