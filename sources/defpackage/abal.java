package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.ViewGroup;
import com.google.cardboard.sdk.CardboardView;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abal implements abap {
    private static final agrf c = agrf.h("com/google/android/libraries/youtube/player/features/gl/CardboardViewWrapper");
    private static final String d = "abal";
    public final CardboardView a;
    public CardboardView.Renderer b;
    private boolean e;

    public abal(Context context) {
        CardboardView.setUseCardboardGlSurfaceView(true);
        CardboardView cardboardView = new CardboardView(context);
        this.a = cardboardView;
        cardboardView.setOnSettingsButtonClick(new aadm(cardboardView, 19));
        cardboardView.setOnViewDetachedRunnable(new aadm(this, 20));
        this.b = null;
    }

    @Override // defpackage.abby
    public final void a(Runnable runnable) {
        this.a.queueEvent(runnable);
        ((agrc) ((agrc) c.c()).k("com/google/android/libraries/youtube/player/features/gl/CardboardViewWrapper", "queueEvent", 74, "CardboardViewWrapper.java")).w("%s: QE", d);
    }

    @Override // defpackage.abap
    public final ViewGroup b() {
        return this.a;
    }

    @Override // defpackage.abap
    public final void c() {
        this.a.onPause();
    }

    @Override // defpackage.abap
    public final void d() {
        this.a.onResume();
    }

    @Override // defpackage.abap
    public final void e(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        this.a.setEGLWindowSurfaceFactory(eGLWindowSurfaceFactory);
    }

    @Override // defpackage.abap
    public final void f(CardboardView.Renderer renderer) {
        this.b = renderer;
        this.a.setRenderer(renderer);
    }

    @Override // defpackage.abap
    public final void g() {
        agrc agrcVar = (agrc) ((agrc) c.c()).k("com/google/android/libraries/youtube/player/features/gl/CardboardViewWrapper", "shutdown", 171, "CardboardViewWrapper.java");
        CardboardView cardboardView = this.a;
        agrcVar.D("S | %b | %b", cardboardView.isGlViewAttached(), this.e);
        taq.d();
        if (!cardboardView.isGlViewAttached() || this.e) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        cardboardView.shutdownCalled();
        a(new aadw(this, countDownLatch, 20, (char[]) null));
        try {
            countDownLatch.await(100L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            ((agrc) ((agrc) ((agrc) c.b()).j(e)).k("com/google/android/libraries/youtube/player/features/gl/CardboardViewWrapper", "shutdown", (char) 206, "CardboardViewWrapper.java")).t("Interrupted during shutdown");
        }
        this.e = true;
    }

    @Override // defpackage.abap
    public final void h(int i, int i2, int i3, int i4) {
        this.a.setEGLConfigChooser(i, i2, i3, i4, 16, 0);
    }

    @Override // defpackage.abap
    public final void i() {
        this.a.setOnBackButtonClick(null);
    }

    @Override // defpackage.abap
    public final void j() {
        this.a.setStereoRenderMode(false);
    }

    @Override // defpackage.abap
    public final void k() {
        this.a.setOnTriggerEvent(null);
    }
}
