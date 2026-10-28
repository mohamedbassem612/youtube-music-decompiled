package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class vps extends qa {
    public RecyclerView a;
    public View b;
    public boolean c;
    private int d;
    private int e;
    private final AnimatorSet f;
    private boolean g;
    private int h;
    private final vxz i;

    public vps(vxz vxzVar) {
        super((byte[]) null);
        this.f = new AnimatorSet();
        this.i = vxzVar;
        this.d = 0;
        this.h = 3;
        this.e = 0;
    }

    private final int r(Resources resources) {
        double dA = this.i.a(0, 45418033L, 0.0d);
        return dA != 0.0d ? (int) TypedValue.applyDimension(1, (float) dA, resources.getDisplayMetrics()) : resources.getDimensionPixelSize(R.dimen.engagement_panel_filter_chip_bar_height);
    }

    private final void s(View view, float f, float f2, int i, int i2) {
        AnimatorSet animatorSet = this.f;
        animatorSet.removeAllListeners();
        animatorSet.cancel();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, f, f2);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.addUpdateListener(new pr(view, 18, null));
        animatorSet.playTogether(objectAnimatorOfFloat, valueAnimatorOfInt);
    }

    @Override // defpackage.qa
    public final void e(RecyclerView recyclerView, int i, int i2) {
        int i3;
        vxz vxzVar = this.i;
        if (!vxzVar.l(16, 45692907L, false) || this.g) {
            if (vxzVar.l(14, 45491557L, false)) {
                if (vxzVar.l(17, 45692908L, false) && this.e * i2 < 0) {
                    this.e = 0;
                }
                this.e += i2;
                return;
            }
            View view = this.b;
            if (view != null) {
                int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.engagement_panel_filter_chip_bar_scrolling_threshold);
                if (i2 >= dimensionPixelSize) {
                    i3 = 1;
                } else if (i2 <= (-dimensionPixelSize)) {
                    i3 = 2;
                } else if (i2 != 0) {
                    return;
                } else {
                    i3 = 3;
                }
                this.h = i3;
            }
        }
    }

    @Override // defpackage.qa
    public final void fO(RecyclerView recyclerView, int i) {
        View view;
        vxz vxzVar = this.i;
        if (vxzVar.l(16, 45692907L, false)) {
            if (i == 1) {
                this.g = true;
            } else if (i == 0) {
                this.g = false;
            }
        }
        if (vxzVar.l(14, 45491557L, false)) {
            if (i == 0 && (view = this.b) != null) {
                if (this.e >= view.getContext().getResources().getDimensionPixelSize(R.dimen.engagement_panel_filter_chip_bar_collapse_threshold)) {
                    m();
                } else if (this.e < 0) {
                    p();
                }
                this.e = 0;
            }
        } else if (this.d == 1 && i != 1) {
            int i2 = this.h;
            if (i2 == 1) {
                m();
            } else if (i2 == 2) {
                p();
            }
        }
        this.d = i;
    }

    public final void m() {
        o(new vpr());
    }

    public final void o(Animator.AnimatorListener animatorListener) {
        View view;
        if (q() || (view = this.b) == null) {
            return;
        }
        Resources resources = view.getContext().getResources();
        View view2 = this.b;
        view2.getClass();
        s(view2, 0.0f, -resources.getDimensionPixelSize(R.dimen.engagement_panel_filter_chip_bar_animation_distance), r(resources), 0);
        AnimatorSet animatorSet = this.f;
        animatorSet.addListener(animatorListener);
        animatorSet.start();
    }

    public final void p() {
        View view;
        if (!q() || (view = this.b) == null) {
            return;
        }
        Resources resources = view.getContext().getResources();
        View view2 = this.b;
        view2.getClass();
        s(view2, -resources.getDimensionPixelSize(R.dimen.engagement_panel_filter_chip_bar_animation_distance), 0.0f, 0, r(resources));
        this.f.start();
    }

    public final boolean q() {
        View view = this.b;
        return view != null && view.getMeasuredHeight() == 0;
    }
}
