package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.CompoundButton;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jkf extends CompoundButton implements View.OnLayoutChangeListener {
    public adly a;
    public eqq b;
    private TransitionDrawable c;

    public jkf(Context context) {
        super(context);
        TransitionDrawable transitionDrawable = (TransitionDrawable) dl.d(context, R.drawable.genre_button);
        if (transitionDrawable != null) {
            this.c = transitionDrawable;
            setBackground(transitionDrawable);
        }
        setEnabled(true);
        setChecked(false);
        setClickable(true);
        addOnLayoutChangeListener(this);
        setTextColor(getResources().getColor(R.color.ytm_text_color_primary));
    }

    private final void b(int i) {
        if (this.c != null) {
            boolean zIsChecked = isChecked();
            TransitionDrawable transitionDrawable = this.c;
            if (zIsChecked) {
                transitionDrawable.startTransition(i);
            } else {
                transitionDrawable.reverseTransition(i);
            }
        }
    }

    public final void a() {
        setTextColor(getResources().getColor(true != isChecked() ? R.color.ytm_text_color_primary : R.color.ytm_color_black));
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        removeOnLayoutChangeListener(this);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        xgn xgnVar;
        super.setChecked(z);
        eqq eqqVar = this.b;
        if (eqqVar != null) {
            eqqVar.b = z;
            b(100);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "scaleX", 0.9f);
            objectAnimatorOfFloat.setDuration(100L);
            objectAnimatorOfFloat.addListener(new jkd(this));
            objectAnimatorOfFloat.start();
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 0.9f);
            objectAnimatorOfFloat2.setDuration(100L);
            objectAnimatorOfFloat2.addListener(new jke(this));
            objectAnimatorOfFloat2.start();
        } else {
            a();
            b(0);
        }
        adly adlyVar = this.a;
        if (adlyVar == null || (xgnVar = adlyVar.b) == null) {
            return;
        }
        anry anryVar = (anry) this.b.d;
        if ((anryVar.b & 32) != 0) {
            xgnVar.o(ameb.INTERACTION_LOGGING_GESTURE_TYPE_GENERIC_CLICK, new xgj(anryVar.g, (amud) null), null);
        }
    }
}
