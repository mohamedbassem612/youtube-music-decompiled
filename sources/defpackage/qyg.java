package defpackage;

import android.content.Context;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qyg extends chj {
    public boolean H;
    public final AtomicBoolean I;
    private final Runnable J;
    private final qua K;
    private final qcb L;

    public qyg(Context context, cli cliVar, clu cluVar, Handler handler, cfx cfxVar, cgf cgfVar, qcb qcbVar, Runnable runnable, qua quaVar, AtomicBoolean atomicBoolean) {
        super(context, cliVar, cluVar, true, handler, cfxVar, cgfVar);
        this.L = qcbVar;
        this.J = runnable;
        this.I = atomicBoolean;
        this.K = quaVar;
    }

    @Override // defpackage.cls
    protected final void aF(long j) {
        this.I.set(true);
        rip ripVar = ((qyh) this.L.a).e;
        rio rioVar = ripVar.a;
        if (rioVar.a() > 0) {
            rbc rbcVar = new rbc(ripVar.b, rbd.a);
            rbcVar.a = rioVar.c();
            rbcVar.c();
            rbcVar.a("Successfully recovered audio from ExoPlayer error, retryCount=%d!", Integer.valueOf(rioVar.a()));
        }
        rioVar.d();
        super.aF(j);
    }

    @Override // defpackage.chj, defpackage.cls
    protected final List al(clu cluVar, bse bseVar, boolean z) {
        return nqz.g(super.al(cluVar, bseVar, z), this.H, this.K);
    }

    @Override // defpackage.chj, defpackage.cls
    protected final boolean au(long j, long j2, clk clkVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, bse bseVar) {
        int iPosition = byteBuffer != null ? byteBuffer.position() : 0;
        boolean zAu = super.au(j, j2, clkVar, byteBuffer, i, i2, i3, j3, z, z2, bseVar);
        if (!zAu && (byteBuffer == null || byteBuffer.position() == iPosition)) {
            return false;
        }
        this.J.run();
        return zAu;
    }
}
