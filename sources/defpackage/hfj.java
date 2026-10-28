package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hfj {
    private static final int[] d = {R.string.accessibility_like_video, R.string.accessibility_undo_like_video};
    private static final int[] e = {R.string.accessibility_dislike_video, R.string.accessibility_undo_dislike_video};
    protected final boolean a;
    protected final View b;
    protected final boolean c;

    public hfj(View view, boolean z) {
        View viewFindViewById = view.findViewById(z ? R.id.dislike_button : R.id.like_button);
        this.b = viewFindViewById;
        this.a = z;
        this.c = true;
        if (viewFindViewById instanceof ImageView) {
            ((ImageView) viewFindViewById).setImageResource(true != z ? R.drawable.ytlike_delhi : R.drawable.ytdislike_delhi);
        }
        viewFindViewById.setVisibility(4);
        bac.p(viewFindViewById, new hfi());
    }

    private final boolean g(amlg amlgVar) {
        boolean z = this.a;
        return (!z && amlgVar == amlg.LIKE) || (z && amlgVar == amlg.DISLIKE);
    }

    public final void a(CharSequence charSequence) {
        this.b.setContentDescription(charSequence);
    }

    public final void b(boolean z) {
        this.b.setEnabled(z);
    }

    public final void c(amlg amlgVar, boolean z) {
        e(amlgVar, z);
        a(this.b.getResources().getString(true != g(amlgVar) ? R.string.accessibility_save_to_library : R.string.accessibility_undo_add_to_library));
    }

    public final void d(int i) {
        this.b.setVisibility(i);
    }

    protected final void e(amlg amlgVar, boolean z) {
        if (this.a) {
            int iOrdinal = amlgVar.ordinal();
            View view = this.b;
            if (iOrdinal != 1) {
                view.setSelected(false);
                return;
            } else {
                view.setSelected(true);
                return;
            }
        }
        int iOrdinal2 = amlgVar.ordinal();
        if (iOrdinal2 != 0) {
            View view2 = this.b;
            if (iOrdinal2 == 1) {
                view2.setSelected(false);
                return;
            }
            view2.setSelected(false);
            if (z) {
                view2.clearAnimation();
                return;
            }
            return;
        }
        View view3 = this.b;
        view3.setSelected(true);
        if (z) {
            view3.clearAnimation();
            if (view3.getWidth() == 0 || view3.getHeight() == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view3, "scaleX", 1.25f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view3, "scaleY", 1.25f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
            animatorSet.setDuration(50L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view3, "scaleX", 1.0f), ObjectAnimator.ofFloat(view3, "scaleY", 1.0f));
            animatorSet2.setDuration(350L);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(animatorSet, animatorSet2);
            animatorSet3.start();
        }
    }

    public final void f(amlg amlgVar, boolean z) {
        e(amlgVar, z);
        int[] iArr = this.a ? e : d;
        Resources resources = this.b.getResources();
        a(g(amlgVar) ? resources.getString(iArr[1]) : resources.getString(iArr[0]));
    }
}
