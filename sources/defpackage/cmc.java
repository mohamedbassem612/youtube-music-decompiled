package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cmc implements clk {
    private final MediaCodec a;
    private final mgk b;

    public cmc(MediaCodec mediaCodec, mgk mgkVar) {
        this.a = mediaCodec;
        this.b = mgkVar;
        if (Build.VERSION.SDK_INT < 35 || mgkVar == null) {
            return;
        }
        mgkVar.e(mediaCodec);
    }

    @Override // defpackage.clk
    public final int a() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // defpackage.clk
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // defpackage.clk
    public final MediaFormat c() {
        return this.a.getOutputFormat();
    }

    @Override // defpackage.clk
    public final ByteBuffer e(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.clk
    public final ByteBuffer f(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.clk
    public final void g() {
        this.a.detachOutputSurface();
    }

    @Override // defpackage.clk
    public final void h() {
        this.a.flush();
    }

    @Override // defpackage.clk
    public final void i() {
        mgk mgkVar;
        try {
            if (Build.VERSION.SDK_INT >= 30 && Build.VERSION.SDK_INT < 33) {
                this.a.stop();
            }
        } finally {
            if (Build.VERSION.SDK_INT >= 35 && (mgkVar = this.b) != null) {
                mgkVar.f(this.a);
            }
            this.a.release();
        }
    }

    @Override // defpackage.clk
    public final void j(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.clk
    public final void k(int i, boolean z) {
        this.a.releaseOutputBuffer(i, z);
    }

    @Override // defpackage.clk
    public final void l(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.clk
    public final void m(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // defpackage.clk
    public final void n(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.clk
    public final void o(List list) {
        this.a.subscribeToVendorParameters(list);
    }

    @Override // defpackage.clk
    public final void p(List list) {
        this.a.unsubscribeFromVendorParameters(list);
    }

    @Override // defpackage.clk
    public final /* synthetic */ void q(bwm bwmVar) {
        bwmVar.a();
    }

    @Override // defpackage.clk
    public final boolean r() {
        return false;
    }

    @Override // defpackage.clk
    public final /* synthetic */ boolean s(clj cljVar) {
        return false;
    }

    @Override // defpackage.clk
    public final void t(int i, int i2, long j, int i3) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.clk
    public final void u(int i, cak cakVar, long j, int i2) {
        this.a.queueSecureInputBuffer(i, 0, cakVar.i, j, i2);
    }
}
