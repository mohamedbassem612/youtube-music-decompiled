package defpackage;

import java.nio.ByteBuffer;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class fgk implements fge {
    private long a;
    private long b;

    static {
        Logger.getLogger(fgk.class.getName());
    }

    @Override // defpackage.fge
    public final long a() {
        return this.a;
    }

    @Override // defpackage.fge
    public final long b() {
        return this.b;
    }

    @Override // defpackage.fge
    public final String c() {
        return "mdat";
    }

    @Override // defpackage.fge
    public final void d(aumd aumdVar, ByteBuffer byteBuffer, long j, fgd fgdVar) {
        this.a = aumdVar.b() - ((long) byteBuffer.remaining());
        this.b = ((long) byteBuffer.remaining()) + j;
        aumdVar.d(aumdVar.b() + j);
    }

    public final String toString() {
        long j = this.b;
        StringBuilder sb = new StringBuilder(39);
        sb.append("MediaDataBox{size=");
        sb.append(j);
        sb.append('}');
        return sb.toString();
    }
}
