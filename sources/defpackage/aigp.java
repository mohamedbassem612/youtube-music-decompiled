package defpackage;

import app.rive.semantics.SemanticState;
import com.google.protobuf.MessageLite;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aigp extends aigs {
    private final ByteBuffer b;
    private final ByteBuffer c;

    public aigp(ByteBuffer byteBuffer) {
        this.b = byteBuffer;
        this.c = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.position();
    }

    private final void g(String str) throws aigq {
        try {
            ByteBuffer byteBuffer = this.c;
            if (!byteBuffer.hasArray()) {
                ahng.aO(str, byteBuffer);
            } else {
                int iArrayOffset = byteBuffer.arrayOffset();
                byteBuffer.position(a.bx(str, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            }
        } catch (IndexOutOfBoundsException e) {
            throw new aigq(e);
        }
    }

    @Override // defpackage.aigs
    public final void A(long j) throws aigq {
        while (true) {
            long j2 = (-128) & j;
            try {
                ByteBuffer byteBuffer = this.c;
                if (j2 == 0) {
                    byteBuffer.put((byte) j);
                    return;
                } else {
                    byteBuffer.put((byte) (((int) j) | SemanticState.Focused));
                    j >>>= 7;
                }
            } catch (BufferOverflowException e) {
                throw new aigq(e);
            }
        }
    }

    @Override // defpackage.aigs
    public final void B(byte[] bArr, int i) throws aigq {
        y(i);
        f(bArr, 0, i);
    }

    @Override // defpackage.aigb
    public final void a(byte[] bArr, int i, int i2) throws aigq {
        f(bArr, i, i2);
    }

    @Override // defpackage.aigs
    public final int b() {
        throw null;
    }

    @Override // defpackage.aigs
    public final int c() {
        return this.c.remaining();
    }

    @Override // defpackage.aigs
    public final void d() {
        this.b.position(this.c.position());
    }

    @Override // defpackage.aigs
    public final void e(byte b) throws aigq {
        try {
            this.c.put(b);
        } catch (BufferOverflowException e) {
            ByteBuffer byteBuffer = this.c;
            throw new aigq(byteBuffer.position(), byteBuffer.limit(), 1, e);
        }
    }

    public final void f(byte[] bArr, int i, int i2) throws aigq {
        try {
            this.c.put(bArr, i, i2);
        } catch (IndexOutOfBoundsException e) {
            throw new aigq(e);
        } catch (BufferOverflowException e2) {
            throw new aigq(e2);
        }
    }

    @Override // defpackage.aigs
    public final void h(int i, boolean z) throws aigq {
        y(i << 3);
        e(z ? (byte) 1 : (byte) 0);
    }

    @Override // defpackage.aigs
    public final void i(int i, aigj aigjVar) throws aigq {
        y((i << 3) | 2);
        j(aigjVar);
    }

    @Override // defpackage.aigs
    public final void j(aigj aigjVar) throws aigq {
        y(aigjVar.d());
        aigjVar.l(this);
    }

    @Override // defpackage.aigs
    public final void k(int i, int i2) throws aigq {
        y((i << 3) | 5);
        l(i2);
    }

    @Override // defpackage.aigs
    public final void l(int i) throws aigq {
        try {
            this.c.putInt(i);
        } catch (BufferOverflowException e) {
            ByteBuffer byteBuffer = this.c;
            throw new aigq(byteBuffer.position(), byteBuffer.limit(), 4, e);
        }
    }

    @Override // defpackage.aigs
    public final void m(int i, long j) throws aigq {
        y((i << 3) | 1);
        n(j);
    }

    @Override // defpackage.aigs
    public final void n(long j) throws aigq {
        try {
            this.c.putLong(j);
        } catch (BufferOverflowException e) {
            ByteBuffer byteBuffer = this.c;
            throw new aigq(byteBuffer.position(), byteBuffer.limit(), 8, e);
        }
    }

    @Override // defpackage.aigs
    public final void o(int i, int i2) throws aigq {
        y(i << 3);
        p(i2);
    }

    @Override // defpackage.aigs
    public final void p(int i) throws aigq {
        if (i >= 0) {
            y(i);
        } else {
            A(i);
        }
    }

    @Override // defpackage.aigs
    public final void q(int i, MessageLite messageLite) {
        throw null;
    }

    @Override // defpackage.aigs
    public final void r(MessageLite messageLite) throws aigq {
        y(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    @Override // defpackage.aigs
    public final void s(int i, MessageLite messageLite) throws aigq {
        y(11);
        x(2, i);
        y(26);
        r(messageLite);
        y(12);
    }

    @Override // defpackage.aigs
    public final void t(int i, aigj aigjVar) throws aigq {
        y(11);
        x(2, i);
        i(3, aigjVar);
        y(12);
    }

    @Override // defpackage.aigs
    public final void u(int i, String str) throws aigq {
        y((i << 3) | 2);
        v(str);
    }

    @Override // defpackage.aigs
    public final void v(String str) throws aigq {
        ByteBuffer byteBuffer = this.c;
        int iPosition = byteBuffer.position();
        try {
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(str.length() * 3) * 9;
            int iNumberOfLeadingZeros2 = (352 - (Integer.numberOfLeadingZeros(str.length()) * 9)) >>> 6;
            if (iNumberOfLeadingZeros2 != ((352 - iNumberOfLeadingZeros) >>> 6)) {
                y(ahng.aN(str));
                g(str);
                return;
            }
            int iPosition2 = byteBuffer.position() + iNumberOfLeadingZeros2;
            byteBuffer.position(iPosition2);
            g(str);
            int iPosition3 = byteBuffer.position();
            byteBuffer.position(iPosition);
            y(iPosition3 - iPosition2);
            byteBuffer.position(iPosition3);
        } catch (IllegalArgumentException e) {
            throw new aigq(e);
        }
    }

    @Override // defpackage.aigs
    public final void w(int i, int i2) throws aigq {
        y((i << 3) | i2);
    }

    @Override // defpackage.aigs
    public final void x(int i, int i2) throws aigq {
        y(i << 3);
        y(i2);
    }

    @Override // defpackage.aigs
    public final void y(int i) throws aigq {
        while (true) {
            int i2 = i & (-128);
            try {
                ByteBuffer byteBuffer = this.c;
                if (i2 == 0) {
                    byteBuffer.put((byte) i);
                    return;
                } else {
                    byteBuffer.put((byte) (i | SemanticState.Focused));
                    i >>>= 7;
                }
            } catch (BufferOverflowException e) {
                throw new aigq(e);
            }
        }
    }

    @Override // defpackage.aigs
    public final void z(int i, long j) throws aigq {
        y(i << 3);
        A(j);
    }
}
