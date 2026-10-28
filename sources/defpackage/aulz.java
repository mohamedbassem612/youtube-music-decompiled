package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class aulz extends aumc implements fge {
    protected String a;
    protected boolean b;
    private long i;

    public aulz(String str) {
        this.a = str;
    }

    @Override // defpackage.fge
    public final long a() {
        return this.i;
    }

    @Override // defpackage.fge
    public final long b() {
        long jB = 0;
        for (int i = 0; i < f().size(); i++) {
            jB += ((fge) this.g.get(i)).b();
        }
        int i2 = 16;
        if (!this.b && 8 + jB < 4294967296L) {
            i2 = 8;
        }
        return jB + ((long) i2);
    }

    @Override // defpackage.fge
    public final String c() {
        return this.a;
    }

    @Override // defpackage.fge
    public final void d(aumd aumdVar, ByteBuffer byteBuffer, long j, fgd fgdVar) {
        this.i = aumdVar.b() - ((long) byteBuffer.remaining());
        this.b = byteBuffer.remaining() == 16;
        this.h = aumdVar;
        this.e = aumdVar.b();
        aumdVar.d(aumdVar.b() + j);
        this.f = aumdVar.b();
        this.c = fgdVar;
    }

    public aulz() {
        throw null;
    }
}
