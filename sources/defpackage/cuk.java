package defpackage;

import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cuk implements GLSurfaceView.Renderer, cuf {
    final /* synthetic */ cul a;
    private final cuj b;
    private final float[] e;
    private final float[] f;
    private final float[] g;
    private float h;
    private float i;
    private final float[] c = new float[16];
    private final float[] d = new float[16];
    private final float[] j = new float[16];
    private final float[] k = new float[16];

    public cuk(cul culVar, cuj cujVar) {
        this.a = culVar;
        float[] fArr = new float[16];
        this.e = fArr;
        float[] fArr2 = new float[16];
        this.f = fArr2;
        float[] fArr3 = new float[16];
        this.g = fArr3;
        this.b = cujVar;
        int[] iArr = bvo.a;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.i = 3.1415927f;
    }

    private final void c() {
        Matrix.setRotateM(this.f, 0, -this.h, (float) Math.cos(this.i), (float) Math.sin(this.i), 0.0f);
    }

    @Override // defpackage.cuf
    public final synchronized void a(float[] fArr, float f) {
        System.arraycopy(fArr, 0, this.e, 0, 16);
        this.i = -f;
        c();
    }

    public final synchronized void b(PointF pointF) {
        this.h = pointF.y;
        c();
        Matrix.setRotateM(this.g, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        float[] fArr;
        synchronized (this) {
            float[] fArr2 = this.k;
            Matrix.multiplyMM(fArr2, 0, this.e, 0, this.g, 0);
            Matrix.multiplyMM(this.j, 0, this.f, 0, fArr2, 0);
        }
        float[] fArr3 = this.d;
        Matrix.multiplyMM(fArr3, 0, this.c, 0, this.j, 0);
        cuj cujVar = this.b;
        GLES20.glClear(16384);
        try {
            bvo.f();
        } catch (bvn e) {
            bvx.d("SceneRenderer", "Failed to draw a frame", e);
        }
        if (cujVar.a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = cujVar.i;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                bvo.f();
            } catch (bvn e2) {
                bvx.d("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (cujVar.b.compareAndSet(true, false)) {
                float[] fArr4 = cujVar.f;
                int[] iArr = bvo.a;
                Matrix.setIdentityM(fArr4, 0);
            }
            long timestamp = cujVar.i.getTimestamp();
            Long l = (Long) cujVar.d.b(timestamp);
            if (l != null) {
                eqq eqqVar = cujVar.j;
                float[] fArr5 = cujVar.f;
                float[] fArr6 = (float[]) ((bwn) eqqVar.c).d(l.longValue());
                if (fArr6 != null) {
                    Object obj = eqqVar.a;
                    float f = fArr6[0];
                    float f2 = -fArr6[1];
                    float f3 = -fArr6[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != 0.0f) {
                        Matrix.setRotateM((float[]) obj, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        int[] iArr2 = bvo.a;
                        Matrix.setIdentityM((float[]) obj, 0);
                    }
                    if (!eqqVar.b) {
                        eqq.b((float[]) eqqVar.d, (float[]) obj);
                        eqqVar.b = true;
                    }
                    Matrix.multiplyMM(fArr5, 0, (float[]) eqqVar.d, 0, (float[]) obj, 0);
                }
            }
            ekr ekrVar = (ekr) cujVar.e.d(timestamp);
            if (ekrVar != null) {
                cui cuiVar = cujVar.c;
                if (cui.b(ekrVar)) {
                    cuiVar.d = ekrVar.b;
                    cuiVar.j = new erb(((zs) ekrVar.d).p());
                    if (!ekrVar.a) {
                        new erb(((zs) ekrVar.c).p());
                    }
                }
            }
        }
        float[] fArr7 = cujVar.g;
        Matrix.multiplyMM(fArr7, 0, fArr3, 0, cujVar.f, 0);
        cui cuiVar2 = cujVar.c;
        int i = cujVar.h;
        erb erbVar = cuiVar2.j;
        if (erbVar != null) {
            int i2 = cuiVar2.d;
            if (i2 == 1) {
                fArr = cui.b;
            } else {
                fArr = i2 == 2 ? cui.c : cui.a;
            }
            GLES20.glUniformMatrix3fv(cuiVar2.f, 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(cuiVar2.e, 1, false, fArr7, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i);
            GLES20.glUniform1i(cuiVar2.i, 0);
            try {
                bvo.f();
            } catch (bvn e3) {
                bvx.d("ProjectionRenderer", "Failed to bind uniforms", e3);
            }
            GLES20.glVertexAttribPointer(cuiVar2.g, 3, 5126, false, 12, (Buffer) erbVar.d);
            try {
                bvo.f();
            } catch (bvn e4) {
                bvx.d("ProjectionRenderer", "Failed to load position data", e4);
            }
            GLES20.glVertexAttribPointer(cuiVar2.h, 2, 5126, false, 8, (Buffer) erbVar.c);
            try {
                bvo.f();
            } catch (bvn e5) {
                bvx.d("ProjectionRenderer", "Failed to load texture data", e5);
            }
            GLES20.glDrawArrays(erbVar.b, 0, erbVar.a);
            try {
                bvo.f();
            } catch (bvn e6) {
                bvx.d("ProjectionRenderer", "Failed to render", e6);
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        float f;
        GLES20.glViewport(0, 0, i, i2);
        float f2 = i / i2;
        if (f2 > 1.0f) {
            double degrees = Math.toDegrees(Math.atan(0.9999999999999999d / ((double) f2)));
            f = (float) (degrees + degrees);
        } else {
            f = 90.0f;
        }
        Matrix.perspectiveM(this.c, 0, f, f2, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        cuj cujVar = this.b;
        int i = 1;
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            bvo.f();
            cujVar.c.a();
            bvo.f();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            bvo.f();
            int i2 = iArr[0];
            bvo.m(36197, i2);
            cujVar.h = i2;
        } catch (bvn e) {
            bvx.d("SceneRenderer", "Failed to initialize the renderer", e);
        }
        cul culVar = this.a;
        cujVar.i = new SurfaceTexture(cujVar.h);
        cujVar.i.setOnFrameAvailableListener(new zko(cujVar, 1));
        culVar.b.post(new dhr((Object) culVar, (Object) cujVar.i, i, (byte[]) null));
    }
}
