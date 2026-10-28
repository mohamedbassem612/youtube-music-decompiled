package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.view.Surface;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class juj implements jum {
    private final MediaCodec a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private boolean e;
    private boolean f = true;
    private boolean g;
    private boolean h;
    private boolean i;
    private Surface j;
    private ctd k;

    public juj(MediaCodec mediaCodec, Surface surface, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = mediaCodec;
        this.j = surface;
        this.e = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    private final void y() {
        if (!this.c || Build.VERSION.SDK_INT < 35) {
            return;
        }
        try {
            zhq zhqVar = zhq.ABR;
            this.a.setOutputSurface(null);
        } catch (IllegalArgumentException | IllegalStateException e) {
            zhr.e(zhq.CODEC_REUSE, "Failed to detach surface via setOutputSurface(null): %s", e.toString());
        }
    }

    @Override // defpackage.clk
    public final int a() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // defpackage.clk
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        if (this.h) {
            this.h = false;
            return -2;
        }
        do {
            iDequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // defpackage.clk
    public final MediaFormat c() {
        return this.a.getOutputFormat();
    }

    @Override // defpackage.jum
    public final synchronized ctd d() {
        if (this.k == null) {
            this.k = ctd.b(this.b);
        }
        zhq zhqVar = zhq.ABR;
        l(this.k);
        return this.k;
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
    public final synchronized void h() {
        if (this.d && this.g) {
            zhr.d(zhq.CODEC_REUSE, "Ignore flush because codec is released.");
            return;
        }
        try {
            this.a.flush();
        } catch (IllegalStateException e) {
            zhr.c(zhq.CODEC_REUSE, e, "Flush failed, disabling caching.", new Object[0]);
            this.e = false;
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036 A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:10:0x0011, B:14:0x0021, B:16:0x0036, B:13:0x001a), top: B:27:0x0001, inners: #0 }] */
    @Override // defpackage.clk
    public final synchronized void i() {
        ctd ctdVar;
        if (!this.d || !this.g) {
            this.f = false;
            if (this.e) {
                try {
                    h();
                    this.h = true;
                    zhq zhqVar = zhq.ABR;
                    return;
                } catch (IllegalStateException unused) {
                    zhr.d(zhq.CODEC_REUSE, "Flush failed during release, releasing instead.");
                    zhr.d(zhq.CODEC_REUSE, "Codec Released.");
                    this.g = true;
                    y();
                    this.a.release();
                    ctdVar = this.k;
                    if (ctdVar != null) {
                        ctdVar.release();
                        return;
                    }
                }
            }
            zhr.d(zhq.CODEC_REUSE, "Codec Released.");
            this.g = true;
            y();
            this.a.release();
            ctdVar = this.k;
            if (ctdVar != null) {
                ctdVar.release();
                return;
            }
            throw th;
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
    public final synchronized void l(Surface surface) {
        if (this.d && this.g) {
            zhr.d(zhq.CODEC_REUSE, "Ignore setOutputSurface because codec is released.");
            return;
        }
        if (!Objects.equals(this.j, surface)) {
            this.a.setOutputSurface(surface);
            this.j = surface;
            ctd ctdVar = this.k;
            if (ctdVar != null && (surface == null || !surface.equals(ctdVar))) {
                zhq zhqVar = zhq.ABR;
                this.k.release();
                this.k = null;
            }
        }
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
        return this.i;
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

    @Override // defpackage.jum
    public final synchronized void v() {
        if (!this.d || !this.g) {
            if (this.f) {
                zhq zhqVar = zhq.ABR;
                this.e = false;
            } else {
                zhr.d(zhq.CODEC_REUSE, "Codec released via internal release.");
                this.g = true;
                y();
                this.a.release();
                ctd ctdVar = this.k;
                if (ctdVar != null) {
                    ctdVar.release();
                }
            }
        }
    }

    @Override // defpackage.jum
    public final synchronized void w() {
        this.i = true;
        this.f = true;
    }

    @Override // defpackage.jum
    public final synchronized boolean x() {
        return this.g;
    }

    @Override // defpackage.clk
    public final void g() {
    }
}
