package defpackage;

import android.os.Handler;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import androidx.media3.decoder.vp9.LibvpxVideoRenderer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class yzr extends LibvpxVideoRenderer {
    public final yzc l;
    private yxu m;
    private final Handler n;
    private boolean o;
    private final long p;
    private long q;
    private final yye r;

    public yzr(Handler handler, cty ctyVar, int i, int i2, int i3, yzc yzcVar, long j, yye yyeVar) {
        super(5000L, handler, ctyVar, 10, i, i2, i3);
        this.m = yxu.a;
        this.l = yzcVar;
        this.n = handler;
        this.p = j;
        this.r = yyeVar;
    }

    @Override // defpackage.csq, defpackage.cav, defpackage.cdm
    public final void A(int i, Object obj) {
        if (i != 10001) {
            super.A(i, obj);
            return;
        }
        yxu yxuVar = (yxu) obj;
        if (yxuVar == null) {
            yxuVar = yxu.a;
        }
        this.m = yxuVar;
    }

    @Override // defpackage.csq, defpackage.cav
    protected final void G(long j, boolean z, boolean z2) {
        super.G(j, z, z2);
        this.q = 0L;
    }

    @Override // defpackage.csq, defpackage.cav
    public final void K() {
        super.K();
        this.m.d();
        this.o = false;
        zcf zcfVar = this.r.m;
        if (zcfVar != null) {
            zcfVar.Z.h(zhc.b("video/x-vnd.on2.vp9", true, "LibvpxVideoRenderer"));
        }
    }

    @Override // defpackage.csq, defpackage.cdp
    public final boolean ah() {
        if (!super.ah()) {
            return false;
        }
        this.m.c();
        return true;
    }

    @Override // defpackage.csq
    protected final void am(VideoDecoderOutputBuffer videoDecoderOutputBuffer, long j, bse bseVar) {
        if (!this.o && videoDecoderOutputBuffer.hasSupplementalData()) {
            this.o = true;
            this.n.post(new ywt(this, 8));
        }
        super.am(videoDecoderOutputBuffer, j, bseVar);
    }

    @Override // defpackage.csq
    protected final boolean aq(long j, long j2) {
        long j3 = this.p;
        if ((j3 <= 0 || j2 - this.q <= j3) && csq.ap(j)) {
            return true;
        }
        this.q = j2;
        return false;
    }
}
