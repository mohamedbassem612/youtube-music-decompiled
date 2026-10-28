package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import j$.util.Objects;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jun extends clg implements jum {
    boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private boolean e;
    private MediaFormat f;
    private boolean g;
    private boolean h;
    private boolean i;
    private volatile Surface j;
    private ctd k;
    private final boolean l;

    public jun(clk clkVar, Surface surface, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(clkVar);
        this.j = surface;
        this.e = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.l = z5;
        this.g = true;
    }

    private final void y() {
        if (!this.c || Build.VERSION.SDK_INT < 35) {
            return;
        }
        try {
            zhq zhqVar = zhq.ABR;
            super.l(null);
        } catch (IllegalArgumentException | IllegalStateException e) {
            zhr.e(zhq.CODEC_REUSE, "Failed to detach surface via setOutputSurface(null): %s", e.toString());
        }
    }

    @Override // defpackage.clg, defpackage.clk
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        if (this.a) {
            return -2;
        }
        return super.b(bufferInfo);
    }

    @Override // defpackage.clg, defpackage.clk
    public final synchronized MediaFormat c() {
        MediaFormat mediaFormatC;
        if (this.a) {
            this.a = false;
            mediaFormatC = this.f;
        } else {
            mediaFormatC = super.c();
            this.f = mediaFormatC;
        }
        return mediaFormatC;
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

    @Override // defpackage.clg, defpackage.clk
    public final ByteBuffer f(int i) {
        if (!this.l || this.j == null) {
            return super.f(i);
        }
        return null;
    }

    @Override // defpackage.clg, defpackage.clk
    public final synchronized void h() {
        if (this.d && this.h) {
            zhr.d(zhq.CODEC_REUSE, "Ignore flush because codec is released.");
            return;
        }
        try {
            super.h();
        } catch (IllegalStateException e) {
            zhr.c(zhq.CODEC_REUSE, e, "Flush failed, disabling caching.", new Object[0]);
            this.e = false;
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x0009, B:10:0x0011, B:13:0x0019, B:17:0x0026, B:19:0x0039, B:16:0x001f), top: B:30:0x0001, inners: #0 }] */
    @Override // defpackage.clg, defpackage.clk
    public final synchronized void i() {
        ctd ctdVar;
        if (!this.d || !this.h) {
            this.g = false;
            if (this.e) {
                try {
                    h();
                    this.a = this.f != null;
                    zhq zhqVar = zhq.ABR;
                    return;
                } catch (IllegalStateException unused) {
                    zhr.d(zhq.CODEC_REUSE, "Flush failed during release, releasing instead.");
                    zhr.d(zhq.CODEC_REUSE, "Codec Released.");
                    this.h = true;
                    y();
                    super.i();
                    ctdVar = this.k;
                    if (ctdVar != null) {
                        ctdVar.release();
                        return;
                    }
                }
            }
            zhr.d(zhq.CODEC_REUSE, "Codec Released.");
            this.h = true;
            y();
            super.i();
            ctdVar = this.k;
            if (ctdVar != null) {
                ctdVar.release();
                return;
            }
            throw th;
        }
    }

    @Override // defpackage.clg, defpackage.clk
    public final synchronized void l(Surface surface) {
        if (this.d && this.h) {
            zhr.d(zhq.CODEC_REUSE, "Ignore setOutputSurface because codec is released.");
            return;
        }
        if (!Objects.equals(this.j, surface)) {
            super.l(surface);
            this.j = surface;
            ctd ctdVar = this.k;
            if (ctdVar != null && (surface == null || !surface.equals(ctdVar))) {
                zhq zhqVar = zhq.ABR;
                this.k.release();
                this.k = null;
            }
        }
    }

    @Override // defpackage.clg, defpackage.clk
    public final boolean r() {
        return this.i;
    }

    @Override // defpackage.jum
    public final synchronized void v() {
        if (!this.d || !this.h) {
            if (this.g) {
                zhq zhqVar = zhq.ABR;
                this.e = false;
            } else {
                zhr.d(zhq.CODEC_REUSE, "Codec released via internal release.");
                this.h = true;
                y();
                super.i();
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
        this.g = true;
    }

    @Override // defpackage.jum
    public final synchronized boolean x() {
        return this.h;
    }

    @Override // defpackage.clg, defpackage.clk
    public final void g() {
    }
}
