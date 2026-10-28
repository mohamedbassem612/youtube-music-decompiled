package defpackage;

import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adnl implements adnc {
    public adnb a;
    public ViewPropertyAnimator b;

    public final void a() {
        adnb adnbVar = this.a;
        adnbVar.a.a().setAlpha(1.0f);
        adnbVar.d.run();
    }

    @Override // defpackage.adnc
    public final void b() {
        ViewPropertyAnimator viewPropertyAnimator = this.b;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        } else {
            a();
        }
    }

    @Override // defpackage.adnc
    public final void c() {
        adnb adnbVar = this.a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = adnbVar.a.a().animate();
        this.b = viewPropertyAnimatorAnimate;
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(adnbVar.b).setListener(new adnr(this, adnbVar)).start();
    }
}
