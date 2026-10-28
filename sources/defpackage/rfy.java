package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.util.Size;
import com.google.android.libraries.video.mediaengine.textures.TonemapLutGenerator;
import j$.util.Optional;
import java.util.UUID;
import java.util.concurrent.Semaphore;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rfy extends rfo implements SurfaceTexture.OnFrameAvailableListener {
    public rgf a;
    public int b;
    public int c;
    public long d;
    public long e;
    public UUID f;
    public bru g;
    public Optional h;
    public Optional i;
    public volatile SurfaceTexture j;
    private final rfn k;
    private final rgh p;
    private final rbn q;
    private final qug r;
    private final Semaphore s;
    private final Semaphore t;
    private int[] u;
    private rft v;

    public rfy(rfn rfnVar, Semaphore semaphore, Semaphore semaphore2, rgh rghVar, rbn rbnVar, qug qugVar) {
        super(rfnVar.b());
        this.u = null;
        this.b = 1;
        this.c = 1;
        this.d = 0L;
        this.e = 0L;
        this.g = bru.a;
        this.h = Optional.empty();
        this.i = Optional.empty();
        this.j = null;
        this.k = rfnVar;
        this.p = rghVar;
        this.s = semaphore;
        this.t = semaphore2;
        this.q = rbnVar;
        this.r = qugVar;
    }

    public final synchronized void a(rfs rfsVar) {
        if (this.v != null) {
            this.q.c();
            this.v.a(rfsVar);
        } else {
            if (!rfsVar.B()) {
                this.q.a();
                rfsVar.release();
            }
        }
    }

    final synchronized void b(rft rftVar) {
        this.v = rftVar;
    }

    @Override // defpackage.rfo
    public final void c() {
        super.c();
        rfn rfnVar = this.k;
        this.a = rfnVar.c(this.m, this.b, this.c);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        this.p.d(rfnVar.a());
        int[] iArr = new int[1];
        this.u = iArr;
        GLES20.glGenTextures(1, iArr, 0);
        this.j = new SurfaceTexture(this.u[0]);
        this.j.setOnFrameAvailableListener(this, this.m);
    }

    @Override // defpackage.rfo
    public final void d() {
        if (this.j != null) {
            this.j.release();
            this.j = null;
        }
        rgf rgfVar = this.a;
        if (rgfVar != null) {
            rgfVar.c();
        }
        int[] iArr = this.u;
        if (iArr != null) {
            GLES20.glDeleteTextures(1, iArr, 0);
        }
        this.p.e();
        super.d();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044 A[Catch: RuntimeException -> 0x0236, bvn -> 0x0238, TryCatch #4 {bvn -> 0x0238, RuntimeException -> 0x0236, blocks: (B:4:0x0015, B:6:0x0033, B:8:0x0039, B:10:0x003d, B:16:0x005d, B:18:0x0099, B:20:0x009d, B:21:0x00a6, B:23:0x0117, B:25:0x0127, B:26:0x012e, B:27:0x012f, B:30:0x0153, B:33:0x015b, B:35:0x0163, B:36:0x0171, B:43:0x01ac, B:45:0x01c1, B:47:0x01c5, B:49:0x01ca, B:48:0x01c8, B:57:0x01f1, B:59:0x0227, B:37:0x017e, B:38:0x0189, B:39:0x018a, B:41:0x0192, B:42:0x01a0, B:50:0x01ce, B:52:0x01d2, B:54:0x01e9, B:56:0x01ee, B:55:0x01ec, B:13:0x0044, B:11:0x0040, B:14:0x0058, B:15:0x005b), top: B:85:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0256  */
    /* JADX WARN: Code duplicated, block: B:74:0x0262  */
    /* JADX WARN: Code duplicated, block: B:77:0x0269  */
    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        rfq rfqVarA;
        Semaphore semaphore;
        rfq rfqVar;
        rgg rggVar;
        int iIntValue;
        this.q.d(ahbt.b(this.d));
        try {
            rfqVarA = this.a.a();
            try {
                g(rfqVarA.getTextureName(), this.b, this.c);
                rgh rghVar = this.p;
                SurfaceTexture surfaceTexture2 = this.j;
                int i = this.u[0];
                bru bruVar = this.g;
                Optional optional = this.i;
                if (!bru.i(bruVar)) {
                    rggVar = rgg.EXTERNAL;
                } else if (rghVar.f.ab) {
                    if (rghVar.h >= 3) {
                        rggVar = rgg.EXTERNAL_HDR_VIDINFRA;
                    } else {
                        rbc rbcVar = new rbc(rgh.i, rbd.d);
                        rbcVar.c();
                        rbcVar.a("HDR input is not supported on this device, interpreting it as an RGB texture.", new Object[0]);
                        rggVar = rgg.EXTERNAL;
                    }
                } else if (rghVar.g) {
                    rggVar = rgg.EXTERNAL_HDR;
                } else {
                    rbc rbcVar2 = new rbc(rgh.i, rbd.d);
                    rbcVar2.c();
                    rbcVar2.a("HDR input is not supported on this device, interpreting it as an RGB texture.", new Object[0]);
                    rggVar = rgg.EXTERNAL;
                }
                bvm bvmVarA = rghVar.a(rggVar);
                bvmVarA.i();
                GLES20.glClear(16384);
                GLES20.glActiveTexture(33984);
                surfaceTexture2.updateTexImage();
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                rgi.c("glTexParameteri");
                if (rghVar.f.E && rghVar.h >= 3) {
                    GLES30.glVertexAttribDivisor(bvmVarA.a("aFramePosition"), 0);
                }
                bvmVarA.h("uTexSampler", i, 0);
                float[] fArr = new float[16];
                surfaceTexture2.getTransformMatrix(fArr);
                Matrix matrix = new Matrix();
                int i2 = 9;
                matrix.setValues(new float[]{fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]});
                Matrix matrix2 = new Matrix();
                matrix2.preScale(0.5f, 0.5f);
                matrix2.preTranslate(1.0f, 1.0f);
                matrix2.postConcat(matrix);
                matrix2.postTranslate(-0.5f, -0.5f);
                matrix2.postScale(2.0f, 2.0f);
                if (optional.isPresent() && !matrix2.preConcat(nra.m((RectF) optional.get()))) {
                    throw new bvn("Failed to preconcat the crop matrix.");
                }
                bvmVarA.f("uTexTransformationMatrix", nra.q(matrix2));
                bvmVarA.j(bvo.l());
                bvmVarA.f("uTransformationMatrix", nra.q(new Matrix()));
                if (rggVar == rgg.EXTERNAL_HDR_VIDINFRA) {
                    TonemapLutGenerator tonemapLutGenerator = rghVar.e;
                    int i3 = bruVar.d;
                    if (i3 == 6) {
                        if (tonemapLutGenerator.b.isEmpty()) {
                            tonemapLutGenerator.b = Optional.of(Integer.valueOf(TonemapLutGenerator.a(6)));
                        }
                        iIntValue = ((Integer) tonemapLutGenerator.b.get()).intValue();
                    } else {
                        if (i3 != 7) {
                            throw new IllegalArgumentException(a.bR(i3, "Unsupported color transfer for LUT generation: "));
                        }
                        if (tonemapLutGenerator.a.isEmpty()) {
                            tonemapLutGenerator.a = Optional.of(Integer.valueOf(TonemapLutGenerator.a(7)));
                        }
                        iIntValue = ((Integer) tonemapLutGenerator.a.get()).intValue();
                    }
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(32879, iIntValue);
                    bvmVarA.h("uColorSpaceConversionLut", iIntValue, 1);
                    if (rghVar.g) {
                        bvmVarA.f("uYuvToRgbColorTransform", bruVar.c == 1 ? rgh.d : rgh.c);
                    }
                } else if (rggVar == rgg.EXTERNAL_HDR) {
                    bvmVarA.g("uInputColorTransfer", bruVar.d);
                    bvmVarA.g("uApplyHdrToSdrToneMapping", 1);
                    bvmVarA.g("uOutputColorTransfer", 10);
                    bvmVarA.f("uYuvToRgbColorTransform", bruVar.c == 1 ? rgh.a : rgh.b);
                }
                bvmVarA.d();
                GLES20.glDrawArrays(5, 0, 4);
                rgi.c("applyTransformAndDraw");
                GLES20.glBindTexture(36197, 0);
                GLES20.glFinish();
                rgi.g();
                rfqVarA.e = this.e;
                rfqVarA.a(this.d);
                rfqVarA.v(this.f);
                Optional optional2 = this.h;
                rbj rbjVar = new rbj(rfqVarA, i2);
                if (true == optional2.isPresent()) {
                    ((rfs) rbjVar.a).u((Size) optional2.get());
                }
                rfqVar = rfqVarA;
                if (rfqVar != null) {
                    a(rfqVar);
                }
                Semaphore semaphore2 = this.s;
                if (semaphore2 != null) {
                    semaphore2.release();
                }
            } catch (bvn e) {
                e = e;
                rbc rbcVar3 = new rbc(rfz.c, rbd.e);
                rbcVar3.a = e;
                rbcVar3.c();
                rbcVar3.a("Exception thrown while processing a frame from the surface texture.", new Object[0]);
                if (rfqVarA != null) {
                    this.q.b();
                    rfqVarA.release();
                }
                semaphore = this.t;
                if (semaphore != null) {
                    semaphore.release();
                }
                if (this.f != null) {
                    qug qugVar = this.r;
                    tge tgeVarA = quk.a();
                    tgeVarA.b = e;
                    tgeVarA.c = new quh(this.f, 4);
                    qugVar.a(tgeVarA.e());
                }
                rfqVar = null;
            } catch (RuntimeException e2) {
                e = e2;
                rbc rbcVar4 = new rbc(rfz.c, rbd.e);
                rbcVar4.a = e;
                rbcVar4.c();
                rbcVar4.a("Exception thrown while processing a frame from the surface texture.", new Object[0]);
                if (rfqVarA != null) {
                    this.q.b();
                    rfqVarA.release();
                }
                semaphore = this.t;
                if (semaphore != null) {
                    semaphore.release();
                }
                if (this.f != null) {
                    qug qugVar2 = this.r;
                    tge tgeVarA2 = quk.a();
                    tgeVarA2.b = e;
                    tgeVarA2.c = new quh(this.f, 4);
                    qugVar2.a(tgeVarA2.e());
                }
                rfqVar = null;
            }
        } catch (bvn | RuntimeException e3) {
            e = e3;
            rfqVarA = null;
        }
    }
}
