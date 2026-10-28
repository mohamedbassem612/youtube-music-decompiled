package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import defpackage.avy;
import defpackage.awg;
import defpackage.azw;
import defpackage.bme;
import defpackage.cd;
import defpackage.dl;
import defpackage.kf;
import defpackage.kz;
import defpackage.ld;
import defpackage.le;
import defpackage.lf;
import defpackage.lg;
import defpackage.lh;
import defpackage.nj;
import defpackage.ox;
import defpackage.pj;
import defpackage.pl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView {
    private final kf a;
    private final le b;
    private final kz c;
    private boolean d;
    private ld e;
    private lf f;
    private pj g;

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = false;
        this.f = null;
        ox.d(this, getContext());
        kf kfVar = new kf(this);
        this.a = kfVar;
        kfVar.b(attributeSet, i);
        le leVar = new le(this);
        this.b = leVar;
        leVar.h(attributeSet, i);
        leVar.e();
        this.c = new kz(this);
        a().i(attributeSet, i);
    }

    private final pj a() {
        pj pjVar = this.g;
        if (pjVar != null) {
            return pjVar;
        }
        pj pjVar2 = new pj(this);
        this.g = pjVar2;
        return pjVar2;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        kf kfVar = this.a;
        if (kfVar != null) {
            kfVar.a();
        }
        le leVar = this.b;
        if (leVar != null) {
            leVar.e();
        }
    }

    final ld g() {
        ld ldVar = this.e;
        if (ldVar != null) {
            return ldVar;
        }
        ld ldVar2 = new ld(this, new cd(this, 7));
        this.e = ldVar2;
        return ldVar2;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMaxTextSize() {
        if (pl.c) {
            return super.getAutoSizeMaxTextSize();
        }
        le leVar = this.b;
        if (leVar != null) {
            return leVar.a();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMinTextSize() {
        if (pl.c) {
            return super.getAutoSizeMinTextSize();
        }
        le leVar = this.b;
        if (leVar != null) {
            return leVar.b();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int getAutoSizeStepGranularity() {
        if (pl.c) {
            return super.getAutoSizeStepGranularity();
        }
        le leVar = this.b;
        if (leVar != null) {
            return leVar.c();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public final int[] getAutoSizeTextAvailableSizes() {
        if (pl.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        le leVar = this.b;
        return leVar != null ? leVar.p() : new int[0];
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        if (pl.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        le leVar = this.b;
        if (leVar != null) {
            return leVar.d();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return azw.g(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public final int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public final String getFontVariationSettings() {
        return g().b;
    }

    @Override // android.widget.TextView
    public final int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // android.widget.TextView
    public final TextClassifier getTextClassifier() {
        kz kzVar;
        return (Build.VERSION.SDK_INT >= 28 || (kzVar = this.c) == null) ? super.getTextClassifier() : kzVar.a();
    }

    @Override // android.widget.TextView
    public final Typeface getTypeface() {
        return g().a;
    }

    final lf l() {
        lf lgVar;
        if (this.f == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                lgVar = new lh(this);
            } else {
                lgVar = Build.VERSION.SDK_INT >= 28 ? new lg(this) : new lf(this);
            }
            this.f = lgVar;
        }
        return this.f;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        le.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        nj.b(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 30 || Build.VERSION.SDK_INT >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        le leVar = this.b;
        if (leVar != null) {
            leVar.q();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        le leVar = this.b;
        if (leVar == null || pl.c || !leVar.o()) {
            return;
        }
        leVar.g();
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a();
        bme bmeVar = bme.b;
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (pl.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        le leVar = this.b;
        if (leVar != null) {
            leVar.k(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (pl.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        le leVar = this.b;
        if (leVar != null) {
            leVar.l(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeWithDefaults(int i) {
        if (pl.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        le leVar = this.b;
        if (leVar != null) {
            leVar.m(i);
        }
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kf kfVar = this.a;
        if (kfVar != null) {
            kfVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kf kfVar = this.a;
        if (kfVar != null) {
            kfVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        le leVar = this.b;
        if (leVar != null) {
            leVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        le leVar = this.b;
        if (leVar != null) {
            leVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? dl.d(context, i) : null, i2 != 0 ? dl.d(context, i2) : null, i3 != 0 ? dl.d(context, i3) : null, i4 != 0 ? dl.d(context, i4) : null);
        le leVar = this.b;
        if (leVar != null) {
            leVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? dl.d(context, i) : null, i2 != 0 ? dl.d(context, i2) : null, i3 != 0 ? dl.d(context, i3) : null, i4 != 0 ? dl.d(context, i4) : null);
        le leVar = this.b;
        if (leVar != null) {
            leVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(azw.h(this, callback));
    }

    @Override // android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        a();
        bme bmeVar = bme.b;
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.TextView
    public final void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            l().a(i);
        } else {
            azw.i(this, i);
        }
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(String str) {
        return g().b(str);
    }

    @Override // android.widget.TextView
    public final void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            l().b(i);
        } else {
            azw.j(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            l().c(i, f);
        } else {
            azw.l(this, i, f);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        le leVar = this.b;
        if (leVar != null) {
            leVar.i(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(TextClassifier textClassifier) {
        kz kzVar;
        if (Build.VERSION.SDK_INT >= 28 || (kzVar = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            kzVar.a = textClassifier;
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        if (pl.c) {
            super.setTextSize(i, f);
            return;
        }
        le leVar = this.b;
        if (leVar != null) {
            leVar.n(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        if (this.d) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            awg awgVar = avy.a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface = Typeface.create(typeface, i);
        }
        this.d = true;
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.d = false;
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i) {
        azw.k(this, i);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface) {
        g().a(typeface);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        le leVar = this.b;
        if (leVar != null) {
            leVar.e();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        le leVar = this.b;
        if (leVar != null) {
            leVar.e();
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }
}
