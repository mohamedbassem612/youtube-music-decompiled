package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dfg {
    public long a;
    public final bug b;
    final /* synthetic */ dfh c;
    public final avbs d;
    public avbs e;

    public dfg(dfh dfhVar, bug bugVar, avbs avbsVar, long j) {
        this.c = dfhVar;
        this.b = bugVar;
        this.d = avbsVar;
        this.a = j;
        this.e = avbsVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    public final void a(ByteBuffer byteBuffer, long j) {
        ahno.F(((j > this.a ? 1 : (j == this.a ? 0 : -1)) ^ (-1)) >>> 31);
        byteBuffer.position(byteBuffer.position() + (((int) (j - this.a)) * this.b.e));
        this.a = j;
    }
}
