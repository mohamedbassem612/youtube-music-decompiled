package defpackage;

import android.opengl.GLSurfaceView;
import com.google.cardboard.sdk.CardboardView;
import com.google.cardboard.sdk.Viewport;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class abam implements GLSurfaceView.Renderer {
    final /* synthetic */ CardboardView.Renderer a;
    final /* synthetic */ abao b;

    public abam(abao abaoVar, CardboardView.Renderer renderer) {
        this.a = renderer;
        this.b = abaoVar;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        abao abaoVar = this.b;
        Viewport viewport = abaoVar.c;
        viewport.setGLViewport();
        CardboardView.Renderer renderer = this.a;
        renderer.onNewFrame(abaoVar.a);
        renderer.onDrawEye(abaoVar.b);
        renderer.onFinishFrame(viewport);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.b.c.setViewport(0, 0, i, i2);
        this.a.onSurfaceChanged(i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.a.onSurfaceCreated(eGLConfig);
    }
}
