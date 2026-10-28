package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adnm extends adnk implements adnc {
    private final /* synthetic */ int $cid;
    public ViewPropertyAnimator a;
    public Object b;

    public adnm(int i) {
        this.$cid = i;
    }

    public static final boolean e(adnh adnhVar) {
        View viewF = f(adnhVar);
        if (viewF == null) {
            return false;
        }
        float translationX = (adnhVar.h - adnhVar.f) - viewF.getTranslationX();
        float translationY = (adnhVar.i - adnhVar.g) - viewF.getTranslationY();
        if (translationX == 0.0f && translationY == 0.0f) {
            viewF.setTranslationX(0.0f);
            viewF.setTranslationY(0.0f);
            return false;
        }
        viewF.setTranslationX(-translationX);
        viewF.setTranslationY(-translationY);
        return true;
    }

    private static View f(adnh adnhVar) {
        adma admaVar = adnhVar.a;
        if (admaVar != null) {
            return admaVar.a();
        }
        View view = adnhVar.b;
        if (view == null) {
            return null;
        }
        return view;
    }

    @Override // defpackage.adnc
    public final void b() {
        int i = this.$cid;
        ViewPropertyAnimator viewPropertyAnimator = this.a;
        if (i != 0) {
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                return;
            } else {
                d();
                return;
            }
        }
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        } else {
            d();
        }
    }

    @Override // defpackage.adnc
    public final void c() {
        int i = this.$cid;
        Object obj = this.b;
        if (i == 0) {
            adni adniVar = (adni) obj;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = adniVar.a.a().animate();
            this.a = viewPropertyAnimatorAnimate;
            viewPropertyAnimatorAnimate.alpha(0.0f).setDuration(adniVar.b).setListener(new adns(this, adniVar)).start();
            return;
        }
        adnh adnhVar = (adnh) obj;
        View viewF = f(adnhVar);
        if (viewF != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = viewF.animate();
            this.a = viewPropertyAnimatorAnimate2;
            viewPropertyAnimatorAnimate2.setDuration(adnhVar.c).translationX(0.0f).translationY(0.0f).setListener(new adnt(this, adnhVar)).start();
        }
    }

    public final void d() {
        int i = this.$cid;
        Object obj = this.b;
        if (i == 0) {
            adni adniVar = (adni) obj;
            adniVar.a.a().setAlpha(1.0f);
            adniVar.d.run();
            return;
        }
        adnh adnhVar = (adnh) obj;
        View viewF = f(adnhVar);
        if (viewF != null) {
            viewF.setTranslationX(0.0f);
            viewF.setTranslationY(0.0f);
            adnhVar.e.run();
        }
    }
}
