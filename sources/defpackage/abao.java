package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.cardboard.sdk.CardboardView;
import com.google.cardboard.sdk.CardboardViewApi;
import com.google.cardboard.sdk.HeadTransform;
import com.google.cardboard.sdk.Viewport;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abao implements abap {
    private static final agrf f = agrf.h("com/google/android/libraries/youtube/player/features/gl/GlAndroidView$GlSurfaceViewWrapper");
    public final HeadTransform a;
    public final CardboardView.Eye b;
    public final Viewport c;
    public CardboardView.Renderer d;
    public boolean e;
    private final GLSurfaceView g;
    private final ViewGroup h;

    public abao(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        aban abanVar = new aban(this, context);
        this.g = abanVar;
        abanVar.setEGLContextClientVersion(2);
        abanVar.setPreserveEGLContextOnPause(true);
        frameLayout.addView(abanVar);
        this.b = new CardboardView.Eye(2, new CardboardViewApi(context));
        this.a = new HeadTransform();
        this.c = new Viewport();
    }

    @Override // defpackage.abby
    public final void a(Runnable runnable) {
        this.g.queueEvent(runnable);
    }

    @Override // defpackage.abap
    public final ViewGroup b() {
        return this.h;
    }

    @Override // defpackage.abap
    public final void e(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        this.g.setEGLWindowSurfaceFactory(eGLWindowSurfaceFactory);
    }

    @Override // defpackage.abap
    public final void f(CardboardView.Renderer renderer) {
        this.d = renderer;
        this.g.setRenderer(new abam(this, renderer));
    }

    @Override // defpackage.abap
    public final void g() {
        taq.d();
        if (!this.e) {
            ((agrc) ((agrc) f.b()).k("com/google/android/libraries/youtube/player/features/gl/GlAndroidView$GlSurfaceViewWrapper", "shutdown", 165, "GlAndroidView.java")).t("The GlSurfaceViewWrapper cannot be shutdown if it's not attached.");
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        a(new abaq(this, countDownLatch, 1));
        try {
            countDownLatch.await(100L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            ((agrc) ((agrc) ((agrc) f.b()).j(e)).k("com/google/android/libraries/youtube/player/features/gl/GlAndroidView$GlSurfaceViewWrapper", "shutdown", (char) 188, "GlAndroidView.java")).t("Interrupted during shutdown");
        }
    }

    @Override // defpackage.abap
    public final void h(int i, int i2, int i3, int i4) {
        this.g.setEGLConfigChooser(i, i2, i3, i4, 16, 0);
    }

    @Override // defpackage.abap
    public final void j() {
        ((agrc) ((agrc) f.b()).k("com/google/android/libraries/youtube/player/features/gl/GlAndroidView$GlSurfaceViewWrapper", "setStereoModeEnabled", 115, "GlAndroidView.java")).t("Stereo mode (VR mode) not supported without CardboardView support");
    }

    @Override // defpackage.abap
    public final void c() {
    }

    @Override // defpackage.abap
    public final void d() {
    }

    @Override // defpackage.abap
    public final void i() {
    }

    @Override // defpackage.abap
    public final void k() {
    }
}
