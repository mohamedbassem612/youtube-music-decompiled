package defpackage;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fez implements fev {
    private final /* synthetic */ int $cid;

    public fez(int i) {
        this.$cid = i;
    }

    @Override // defpackage.fev
    public final boolean a(Object obj, feu feuVar) {
        if (this.$cid == 0) {
            View viewO = feuVar.o();
            if (viewO != null) {
                viewO.clearAnimation();
                viewO.startAnimation(AnimationUtils.loadAnimation(viewO.getContext(), R.anim.fade_in_glide));
            }
        } else if (feuVar.o() != null) {
            View viewO2 = feuVar.o();
            agfr agfrVar = nqm.a;
            viewO2.clearAnimation();
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(viewO2.getContext(), R.anim.fade_in_elements);
            animationLoadAnimation.setAnimationListener(new nqi(viewO2));
            viewO2.startAnimation(animationLoadAnimation);
        }
        return false;
    }
}
