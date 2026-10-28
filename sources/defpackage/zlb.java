package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zlb implements GLSurfaceView.Renderer {
    zkw a;
    private final int[] b;
    private final SurfaceTexture c;

    public zlb(SurfaceTexture surfaceTexture, int[] iArr) {
        this.c = surfaceTexture;
        this.b = iArr;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        this.c.updateTexImage();
        GLES20.glClear(16384);
        zkw zkwVar = this.a;
        if (zkwVar != null) {
            GLES20.glUseProgram(zkwVar.a);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, zkwVar.b);
            float[] fArr = zkwVar.h;
            zkwVar.c.getTransformMatrix(fArr);
            GLES20.glUniformMatrix4fv(zkwVar.g, 1, false, fArr, 0);
            FloatBuffer floatBuffer = zkwVar.d;
            floatBuffer.position(0);
            int i = zkwVar.e;
            GLES20.glEnableVertexAttribArray(i);
            GLES20.glVertexAttribPointer(i, 3, 5126, false, 20, (Buffer) floatBuffer);
            floatBuffer.position(3);
            int i2 = zkwVar.f;
            GLES20.glEnableVertexAttribArray(i2);
            GLES20.glVertexAttribPointer(i2, 2, 5126, false, 20, (Buffer) floatBuffer);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(i);
            GLES20.glDisableVertexAttribArray(i2);
        }
        try {
            yno.ap("onDrawFrame");
        } catch (zlc e) {
            zhr.a(zhq.MLPLAYER, "onDrawFrame: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.a = new zkw(this.c, this.b[0]);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    }
}
