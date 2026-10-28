package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afdt extends afeg {
    public EditText a;
    private final int b;
    private final int c;
    private final TimeInterpolator d;
    private final TimeInterpolator i;
    private final View.OnClickListener j;
    private final View.OnFocusChangeListener k;
    private AnimatorSet l;
    private ValueAnimator m;

    public afdt(afef afefVar) {
        super(afefVar);
        this.j = new aefn(this, 10);
        this.k = new gxs(this, 5);
        this.b = afba.r(afefVar.getContext(), R.attr.motionDurationShort3, 100);
        this.c = afba.r(afefVar.getContext(), R.attr.motionDurationShort3, 150);
        this.d = afba.y(afefVar.getContext(), R.attr.motionEasingLinearInterpolator, aetz.a);
        this.i = afba.y(afefVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, aetz.d);
    }

    private final ValueAnimator m(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.d);
        valueAnimatorOfFloat.setDuration(this.b);
        valueAnimatorOfFloat.addUpdateListener(new adey(this, 12));
        return valueAnimatorOfFloat;
    }

    @Override // defpackage.afeg
    public final int a() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.afeg
    public final int b() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.afeg
    public final View.OnClickListener c() {
        return this.j;
    }

    @Override // defpackage.afeg
    public final View.OnFocusChangeListener d() {
        return this.k;
    }

    @Override // defpackage.afeg
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    public final void f(boolean z) {
        boolean zU = this.f.u();
        AnimatorSet animatorSet = this.l;
        if (!z) {
            animatorSet.cancel();
            this.m.start();
            if (zU) {
                return;
            }
            this.m.end();
            return;
        }
        if (animatorSet.isRunning()) {
            return;
        }
        this.m.cancel();
        this.l.start();
        if (zU) {
            this.l.end();
        }
    }

    @Override // defpackage.afeg
    public final void g(EditText editText) {
        this.a = editText;
        this.e.p(k());
    }

    @Override // defpackage.afeg
    public final void h(boolean z) {
        if (this.f.h != null) {
            f(z);
        }
    }

    @Override // defpackage.afeg
    public final void i() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.i);
        valueAnimatorOfFloat.setDuration(this.c);
        valueAnimatorOfFloat.addUpdateListener(new adey(this, 13));
        ValueAnimator valueAnimatorM = m(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorM);
        this.l.addListener(new afdr(this));
        ValueAnimator valueAnimatorM2 = m(1.0f, 0.0f);
        this.m = valueAnimatorM2;
        valueAnimatorM2.addListener(new afds(this));
    }

    @Override // defpackage.afeg
    public final void j() {
        EditText editText = this.a;
        if (editText != null) {
            editText.post(new aemk(this, 18, null));
        }
    }

    public final boolean k() {
        EditText editText = this.a;
        if (editText == null) {
            return false;
        }
        boolean z = editText.hasFocus() || this.h.hasFocus();
        int length = this.a.getText().length();
        CharSequence charSequence = this.f.h;
        if (z) {
            return length > 0 || charSequence != null;
        }
        return false;
    }

    @Override // defpackage.afeg
    public final void l() {
        if (this.f.h == null) {
            f(k());
        }
    }
}
