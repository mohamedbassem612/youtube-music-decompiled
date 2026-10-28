package com.google.android.libraries.youtube.media.player.exo2;

import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaFormat;
import android.opengl.EGLDisplay;
import android.opengl.Matrix;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import com.google.android.libraries.youtube.media.player.exo2.ImageReaderMediaGlRenderer;
import defpackage.ahbt;
import defpackage.bwn;
import defpackage.ctm;
import defpackage.yno;
import defpackage.ywn;
import defpackage.yxd;
import defpackage.yxf;
import defpackage.yya;
import defpackage.yzm;
import defpackage.zcf;
import defpackage.zhq;
import defpackage.zhr;
import defpackage.zhv;
import defpackage.zjr;
import defpackage.zle;
import defpackage.zlf;
import defpackage.zlg;
import defpackage.zlj;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class ImageReaderMediaGlRenderer implements yzm {
    final Handler a;
    public final zlg b;
    public final bwn c = new bwn();
    final Queue d;
    final Surface e;
    public final ImageReader f;
    int g;
    public volatile zcf h;
    public int i;
    public int j;
    public Surface k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final zle q;
    private yxf r;

    public ImageReaderMediaGlRenderer(Handler handler, zlg zlgVar, zle zleVar, ImageReader imageReader, zjr zjrVar) {
        this.a = handler;
        this.b = zlgVar;
        this.q = zleVar;
        this.f = imageReader;
        this.d = new ArrayDeque(Math.max(5, zjrVar.p()));
        this.e = imageReader.getSurface();
    }

    private static native void attachImageToExternalTexture(long j);

    private static native long createImage(HardwareBuffer hardwareBuffer, long j);

    private static native void destroyImage(long j, long j2);

    @Override // defpackage.yzm
    public final Surface a() {
        return this.e;
    }

    @Override // defpackage.yzm
    public final ctm b() {
        return new ctm() { // from class: yzi
            @Override // defpackage.ctm
            public final void c(long j, long j2, bse bseVar, MediaFormat mediaFormat) {
                this.a.c.e(j2, Long.valueOf(j));
            }
        };
    }

    @Override // defpackage.yzm
    public final void c(final Surface surface) {
        this.a.post(new Runnable() { // from class: yzf
            @Override // java.lang.Runnable
            public final void run() {
                ImageReaderMediaGlRenderer imageReaderMediaGlRenderer = this.a;
                try {
                    Surface surface2 = imageReaderMediaGlRenderer.k;
                    Surface surface3 = surface;
                    if (surface2 != surface3) {
                        imageReaderMediaGlRenderer.n = true;
                        imageReaderMediaGlRenderer.k = surface3;
                        if (surface3 == null) {
                            imageReaderMediaGlRenderer.q.c(null);
                        }
                        imageReaderMediaGlRenderer.g();
                    }
                } catch (Exception e) {
                    imageReaderMediaGlRenderer.h(e);
                }
            }
        });
    }

    @Override // defpackage.yzm
    public final void d(final zcf zcfVar) {
        this.a.post(new Runnable() { // from class: yzh
            @Override // java.lang.Runnable
            public final void run() {
                ImageReaderMediaGlRenderer imageReaderMediaGlRenderer = this.a;
                zcf zcfVar2 = zcfVar;
                try {
                    Image imageAcquireLatestImage = imageReaderMediaGlRenderer.f.acquireLatestImage();
                    if (imageAcquireLatestImage != null) {
                        imageAcquireLatestImage.close();
                    }
                    imageReaderMediaGlRenderer.h = zcfVar2;
                    imageReaderMediaGlRenderer.p = true;
                    imageReaderMediaGlRenderer.o = imageReaderMediaGlRenderer.b.c(zcfVar2.y);
                    imageReaderMediaGlRenderer.g();
                } catch (Exception e) {
                    imageReaderMediaGlRenderer.h(e);
                }
            }
        });
    }

    @Override // defpackage.yzm
    public final void e(final int i, final int i2) {
        this.a.post(new Runnable() { // from class: yzg
            @Override // java.lang.Runnable
            public final void run() {
                ImageReaderMediaGlRenderer imageReaderMediaGlRenderer = this.a;
                try {
                    int i3 = imageReaderMediaGlRenderer.j;
                    int i4 = i2;
                    int i5 = i;
                    if (i3 == i5 && imageReaderMediaGlRenderer.i == i4) {
                        return;
                    }
                    imageReaderMediaGlRenderer.j = i5;
                    imageReaderMediaGlRenderer.i = i4;
                    imageReaderMediaGlRenderer.m = true;
                    imageReaderMediaGlRenderer.g();
                } catch (Exception e) {
                    imageReaderMediaGlRenderer.h(e);
                }
            }
        });
    }

    @Override // defpackage.yzm
    public final boolean f() {
        return this.h != null && this.b.d(this.h.y);
    }

    public final void g() throws zlj {
        Queue queue;
        if (this.k != null) {
            zle zleVar = this.q;
            if (zleVar.a == null) {
                zleVar.b();
            }
            if (zleVar.b == null) {
                zleVar.f();
                zleVar.a();
                this.o = true;
            }
            if (this.n) {
                this.n = false;
                zleVar.c(this.k);
                zleVar.d();
                if (this.g == 0) {
                    this.g = yya.b();
                }
            }
            if (this.o) {
                this.o = false;
                this.b.b();
            }
            EGLDisplay eGLDisplay = zleVar.a;
            while (true) {
                queue = this.d;
                if (queue.size() <= 3) {
                    break;
                }
                Pair pair = (Pair) queue.remove();
                if (eGLDisplay != null) {
                    destroyImage(((Long) pair.first).longValue(), eGLDisplay.getNativeHandle());
                }
                ((Image) pair.second).close();
            }
            Image imageAcquireNextImage = this.f.acquireNextImage();
            if (imageAcquireNextImage != null) {
                HardwareBuffer hardwareBuffer = imageAcquireNextImage.getHardwareBuffer();
                if (hardwareBuffer == null) {
                    imageAcquireNextImage.close();
                    return;
                }
                if (!this.l || this.j <= 0 || this.i <= 0 || this.h == null) {
                    hardwareBuffer.close();
                    imageAcquireNextImage.close();
                    return;
                }
                zcf zcfVar = this.h;
                this.l = false;
                Long l = (Long) this.c.d(imageAcquireNextImage.getTimestamp());
                if (l == null) {
                    imageAcquireNextImage.close();
                    return;
                }
                yxd yxdVarA = zcfVar.ae.a(l.longValue());
                yxf yxfVarD = yxdVarA.d();
                zlf zlfVarA = this.b.a(yxfVarD);
                if (this.p || this.r != yxfVarD) {
                    this.p = false;
                    long jLongValue = l.longValue();
                    if (this.h != null) {
                        this.h.Z.l("gvs", String.format(Locale.US, "m.%s;s.%d", yno.cF(ahbt.b(jLongValue).toMillis()), Integer.valueOf(yxfVarD.g)));
                    }
                }
                if (this.m || this.r != yxfVarD) {
                    this.m = false;
                    this.r = yxfVarD;
                    zlfVarA.b(this.j, this.i);
                }
                EGLDisplay eGLDisplay2 = zleVar.a;
                if (eGLDisplay2 == null) {
                    throw new zlj("egl display should not be null");
                }
                long jCreateImage = createImage(hardwareBuffer, eGLDisplay2.getNativeHandle());
                queue.add(new Pair(Long.valueOf(jCreateImage), imageAcquireNextImage));
                float[] fArrD = zlfVarA.d();
                float width = imageAcquireNextImage.getWidth();
                float width2 = hardwareBuffer.getWidth();
                int i = -imageAcquireNextImage.getHeight();
                float height = hardwareBuffer.getHeight();
                Matrix.setIdentityM(fArrD, 0);
                Matrix.scaleM(fArrD, 0, width / width2, i / height, 1.0f);
                Matrix.translateM(fArrD, 0, 0.0f, -1.0f, 0.0f);
                hardwareBuffer.close();
                attachImageToExternalTexture(jCreateImage);
                zlfVarA.a(yxdVarA, this.g);
                zleVar.e();
            }
        }
    }

    public final void h(Exception exc) {
        if (this.h != null) {
            ywn ywnVar = this.h.Z;
            zhv zhvVar = new zhv("render");
            zhvVar.d();
            zhvVar.c = exc.getMessage();
            zhvVar.d = exc;
            ywnVar.k(zhvVar.a());
        }
        zhr.a(zhq.RENDER, exc);
    }
}
