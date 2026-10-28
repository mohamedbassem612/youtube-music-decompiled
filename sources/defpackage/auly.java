package defpackage;

import internal.org.jni_zero.CommonApis;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class auly implements fge {
    private static final aumi a = aumi.b(auly.class);
    protected final String b;
    long e;
    long f;
    aumd h;
    private ByteBuffer i;
    long g = -1;
    private ByteBuffer j = null;
    boolean d = true;
    boolean c = true;

    protected auly(String str) {
        this.b = str;
    }

    private final synchronized void h() {
        if (this.d) {
            return;
        }
        try {
            aumi aumiVar = a;
            String str = this.b;
            aumiVar.a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
            aumd aumdVar = this.h;
            long j = this.e;
            long j2 = this.g;
            ByteBuffer byteBuffer = aumdVar.a;
            int iPosition = byteBuffer.position();
            byteBuffer.position(CommonApis.p(j));
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.limit(CommonApis.p(j2));
            byteBuffer.position(iPosition);
            this.i = byteBufferSlice;
            this.d = true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.fge
    public final long a() {
        return this.f;
    }

    @Override // defpackage.fge
    public final long b() {
        long jLimit;
        if (!this.d) {
            jLimit = this.g;
        } else if (this.c) {
            jLimit = e();
        } else {
            ByteBuffer byteBuffer = this.i;
            jLimit = byteBuffer != null ? byteBuffer.limit() : 0;
        }
        int i = (jLimit >= 4294967288L ? 8 : 0) + 8;
        int i2 = true != "uuid".equals(this.b) ? 0 : 16;
        ByteBuffer byteBuffer2 = this.j;
        return jLimit + ((long) (i + i2)) + ((long) (byteBuffer2 != null ? byteBuffer2.limit() : 0));
    }

    @Override // defpackage.fge
    public final String c() {
        return this.b;
    }

    @Override // defpackage.fge
    public final void d(aumd aumdVar, ByteBuffer byteBuffer, long j, fgd fgdVar) {
        long jB = aumdVar.b();
        this.e = jB;
        this.f = jB - ((long) byteBuffer.remaining());
        this.g = j;
        this.h = aumdVar;
        aumdVar.d(aumdVar.b() + j);
        this.d = false;
        this.c = false;
        g();
    }

    protected abstract long e();

    protected abstract void f(ByteBuffer byteBuffer);

    public final synchronized void g() {
        h();
        aumi aumiVar = a;
        String str = this.b;
        aumiVar.a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
        ByteBuffer byteBuffer = this.i;
        if (byteBuffer != null) {
            this.c = true;
            byteBuffer.rewind();
            f(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.j = byteBuffer.slice();
            }
            this.i = null;
        }
    }
}
