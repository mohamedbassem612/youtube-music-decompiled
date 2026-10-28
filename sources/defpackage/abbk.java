package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abbk implements SurfaceTexture.OnFrameAvailableListener, abcc {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/player/features/gl/RgbVideoTexture");
    public final int b;
    public SurfaceTexture d;
    public boolean e;
    public long f;
    private final abby g;
    private final Handler i;
    private final Surface j;
    private final abbj h = new abbj(this, 0);
    public final float[] c = new float[16];

    public abbk(Handler handler, abby abbyVar) {
        this.i = handler;
        this.g = abbyVar;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        abbz.a(iArr[0]);
        int i = iArr[0];
        this.b = i;
        SurfaceTexture surfaceTexture = new SurfaceTexture(i);
        this.d = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
        this.j = new Surface(this.d);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
    }

    @Override // defpackage.abcc
    public final float a() {
        return 0.0f;
    }

    @Override // defpackage.abcc
    public final int b() {
        return 0;
    }

    @Override // defpackage.abcc
    public final long c() {
        return this.f;
    }

    @Override // defpackage.abcc
    public final abcr d() {
        return null;
    }

    @Override // defpackage.abcc
    public final /* synthetic */ ByteBuffer e() {
        return null;
    }

    @Override // defpackage.abcc
    public final void f() {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.b);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
    }

    @Override // defpackage.abcc
    public final void g() {
        this.i.obtainMessage(0, this.j).sendToTarget();
    }

    @Override // defpackage.abcc
    public final void h() {
        if (this.e) {
            this.e = false;
            onFrameAvailable(null);
        }
    }

    @Override // defpackage.abcc
    public final float[] i() {
        return this.c;
    }

    @Override // defpackage.abcc
    public final int j() {
        return 1;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.g.a(this.h);
    }
}
