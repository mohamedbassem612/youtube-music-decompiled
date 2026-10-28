package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abbv implements ctl, abcc {
    public final int[] a;
    private final float[] b;
    private final Handler c;
    private final AtomicReference d;
    private int e = 2;
    private float f;
    private abcr g;
    private long h;
    private ByteBuffer i;

    public abbv(Handler handler) {
        int[] iArr = new int[3];
        this.a = iArr;
        this.c = handler;
        GLES20.glGenTextures(3, iArr, 0);
        for (int i = 0; i < 3; i++) {
            abbz.a(this.a[i]);
        }
        this.d = new AtomicReference();
        float[] fArr = new float[16];
        this.b = fArr;
        Matrix.setIdentityM(fArr, 0);
        fArr[5] = -1.0f;
        fArr[13] = 1.0f;
    }

    @Override // defpackage.abcc
    public final float a() {
        return this.f;
    }

    @Override // defpackage.abcc
    public final int b() {
        return this.e;
    }

    @Override // defpackage.abcc
    public final long c() {
        return this.h;
    }

    @Override // defpackage.abcc
    public final abcr d() {
        return this.g;
    }

    @Override // defpackage.abcc
    public final ByteBuffer e() {
        return this.i;
    }

    @Override // defpackage.abcc
    public final void f() {
        abcs abcsVar = (abcs) this.d.getAndSet(null);
        for (int i = 0; i < 3; i++) {
            GLES20.glActiveTexture(33984 + i);
            GLES20.glBindTexture(3553, this.a[i]);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            if (abcsVar != null) {
                int iA = abcsVar.a();
                if (i != 0) {
                    iA = (iA + 1) / 2;
                }
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, abcsVar.c()[i], iA, 0, 6409, 5121, abcsVar.b.yuvPlanes[i]);
            }
        }
        if (abcsVar != null) {
            VideoDecoderOutputBuffer videoDecoderOutputBuffer = abcsVar.b;
            this.e = videoDecoderOutputBuffer.colorspace;
            this.g = abcsVar.c;
            this.f = (videoDecoderOutputBuffer.width - 0.5f) / abcsVar.c()[0];
            VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = abcsVar.b;
            this.h = videoDecoderOutputBuffer2.timeUs;
            ByteBuffer byteBuffer = videoDecoderOutputBuffer2 != null ? videoDecoderOutputBuffer2.supplementalData : null;
            if (byteBuffer != null) {
                int iLimit = byteBuffer.limit();
                ByteBuffer byteBuffer2 = this.i;
                if (byteBuffer2 == null || byteBuffer2.capacity() < iLimit) {
                    this.i = ByteBuffer.allocate(iLimit);
                }
                this.i.clear();
                this.i.put(byteBuffer);
                this.i.flip();
            }
            abcsVar.b();
        }
    }

    @Override // defpackage.abcc
    public final void g() {
        this.c.obtainMessage(1, this).sendToTarget();
    }

    @Override // defpackage.abcc
    public final float[] i() {
        return this.b;
    }

    @Override // defpackage.abcc
    public final int j() {
        return 2;
    }

    @Override // defpackage.ctl
    public final synchronized void jL(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        abcs abcsVar = (abcs) abcs.a.a();
        if (abcsVar == null) {
            abcsVar = new abcs(videoDecoderOutputBuffer);
        }
        abcsVar.b = videoDecoderOutputBuffer;
        bru bruVar = videoDecoderOutputBuffer.format.G;
        if (bruVar != null) {
            abcsVar.c = new abcr(bruVar);
        } else {
            abcsVar.c = null;
        }
        k(abcsVar);
    }

    public final synchronized void k(abcs abcsVar) {
        abcs abcsVar2 = (abcs) this.d.getAndSet(abcsVar);
        if (abcsVar2 != null) {
            abcsVar2.b();
        }
    }

    @Override // defpackage.abcc
    public final void h() {
    }
}
