package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adnn implements adnc {
    public adnj a;
    public float b;
    public float c;
    public ViewPropertyAnimator d;
    public ViewPropertyAnimator e;

    private static void e(View view) {
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public final void a() {
        adnj adnjVar = this.a;
        e(adnjVar.b.a());
        adnjVar.g.run();
    }

    @Override // defpackage.adnc
    public final void b() {
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        } else {
            d();
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.e;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        } else {
            a();
        }
    }

    @Override // defpackage.adnc
    public final void c() {
        adnj adnjVar = this.a;
        long j = adnjVar.c;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = adnjVar.a.a().animate();
        this.d = viewPropertyAnimatorAnimate;
        viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).translationX(this.b).translationY(this.c).setListener(new adnp(this, adnjVar)).start();
        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = adnjVar.b.a().animate();
        this.e = viewPropertyAnimatorAnimate2;
        viewPropertyAnimatorAnimate2.setDuration(j).alpha(1.0f).translationX(0.0f).translationY(0.0f).setListener(new adnq(this, adnjVar)).start();
    }

    public final void d() {
        adnj adnjVar = this.a;
        e(adnjVar.a.a());
        adnjVar.e.run();
    }
}
