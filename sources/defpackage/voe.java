package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class voe implements tuu {
    public final float a;
    private ValueAnimator b;

    public voe(float f) {
        this.a = f;
    }

    @Override // defpackage.tuu
    public final void a(View view, long j, tut tutVar) {
        View viewFindViewById = view.findViewById(R.id.panel_header);
        View viewFindViewById2 = view.findViewById(R.id.panel_subheader);
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j);
        this.b.addUpdateListener(new vod(this, view, viewFindViewById, viewFindViewById2, 0));
        this.b.addListener(new tux(tutVar));
        this.b.start();
    }

    @Override // defpackage.tuu
    public final void b(View view, long j, tut tutVar) {
        View viewFindViewById = view.findViewById(R.id.panel_header);
        View viewFindViewById2 = view.findViewById(R.id.panel_subheader);
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j);
        this.b.addUpdateListener(new vod(this, view, viewFindViewById, viewFindViewById2, 1));
        this.b.addListener(new tux(tutVar));
        this.b.start();
    }

    @Override // defpackage.tuu
    public final void c(View view) {
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        view.setAlpha(1.0f);
        view.findViewById(R.id.panel_header).setTranslationX(0.0f);
        view.findViewById(R.id.panel_subheader).setTranslationX(0.0f);
        bac.x(view).o();
    }

    @Override // defpackage.tuu
    public final /* synthetic */ void d() {
    }
}
