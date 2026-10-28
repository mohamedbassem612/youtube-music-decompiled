package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import defpackage.aetz;
import defpackage.afba;
import defpackage.afcs;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout implements afcs {
    public TextView a;
    public Button b;
    public int c;
    private final TimeInterpolator d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = afba.y(context, R.attr.motionEasingEmphasizedInterpolator, aetz.b);
    }

    private final boolean c(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.a.getPaddingTop() == i2 && this.a.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    @Override // defpackage.afcs
    public final void a(int i, int i2) {
        this.a.setAlpha(0.0f);
        long j = i2;
        ViewPropertyAnimator duration = this.a.animate().alpha(1.0f).setDuration(j);
        TimeInterpolator timeInterpolator = this.d;
        long j2 = i;
        duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(0.0f);
            this.b.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
        }
    }

    @Override // defpackage.afcs
    public final void b(int i) {
        this.a.setAlpha(1.0f);
        long j = i;
        ViewPropertyAnimator duration = this.a.animate().alpha(0.0f).setDuration(j);
        TimeInterpolator timeInterpolator = this.d;
        duration.setInterpolator(timeInterpolator).setStartDelay(0L).start();
        if (this.b.getVisibility() == 0) {
            this.b.setAlpha(1.0f);
            this.b.animate().alpha(0.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(0L).start();
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.snackbar_text);
        this.b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
            Layout layout = this.a.getLayout();
            boolean z = layout != null && layout.getLineCount() > 1;
            if (!z || this.c <= 0 || this.b.getMeasuredWidth() <= this.c) {
                if (true != z) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!c(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            } else if (!c(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                return;
            }
            super.onMeasure(i, i2);
        }
    }

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }
}
