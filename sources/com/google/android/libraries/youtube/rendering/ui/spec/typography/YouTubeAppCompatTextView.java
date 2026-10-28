package com.google.android.libraries.youtube.rendering.ui.spec.typography;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.music.R;
import defpackage.adyu;
import defpackage.aedq;
import defpackage.aeds;
import defpackage.aedt;
import defpackage.aedv;
import defpackage.agrf;
import defpackage.tzk;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class YouTubeAppCompatTextView extends AppCompatTextView {
    public static final agrf g = agrf.h("com/google/android/libraries/youtube/rendering/ui/spec/typography/YouTubeAppCompatTextView");
    private boolean a;
    private int b;
    public boolean h;
    public boolean i;
    public int j;
    public aeds k;

    public YouTubeAppCompatTextView(Context context) {
        super(context);
        this.a = false;
        this.j = 0;
        b(context, null);
    }

    private final int a(int i, int i2) {
        aeds aedsVar = this.k;
        if (aedsVar == null || !aedsVar.b.G()) {
            return i2;
        }
        Optional optionalM = tzk.m(getContext(), i);
        if (true == optionalM.isPresent()) {
            optionalM = Optional.ofNullable(Integer.valueOf(((Float) optionalM.get()).intValue()));
        }
        return ((Integer) optionalM.orElse(Integer.valueOf(i2))).intValue();
    }

    private final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, aedq.a, 0, 0);
        this.i = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void d() {
        if (this.i) {
            CharSequence text = getText();
            if (!(text instanceof Spanned) || ((ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class)).length <= 0) {
                this.a = false;
                setMovementMethod(getDefaultMovementMethod());
            } else {
                this.a = true;
                boolean zIsLongClickable = isLongClickable();
                setMovementMethod(aedt.a);
                setLongClickable(zIsLongClickable);
            }
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        if (size > 0 && size != this.j) {
            this.j = size;
            aeds aedsVar = this.k;
            if (aedsVar != null) {
                int i3 = 3;
                if (aedsVar.c) {
                    Optional optional = aedsVar.a;
                    adyu adyuVar = new adyu(this, i3);
                    if (true == optional.isPresent()) {
                        Object obj = optional.get();
                        Object obj2 = adyuVar.a;
                        GradientDrawable gradientDrawable = (GradientDrawable) obj;
                        gradientDrawable.mutate();
                        gradientDrawable.setCornerRadius(((YouTubeAppCompatTextView) obj2).j / 2.0f);
                    }
                }
                Resources resources = getResources();
                int i4 = this.j;
                if (i4 <= a(R.attr.yt_sys_measurement_action_height_compact, resources.getDimensionPixelSize(R.dimen.button_size_small_height))) {
                    i3 = 2;
                } else if (i4 > a(R.attr.yt_sys_measurement_action_height_standard, resources.getDimensionPixelSize(R.dimen.button_size_medium_height))) {
                    i3 = i4 < a(R.attr.yt_sys_measurement_action_height_prominent, resources.getDimensionPixelSize(R.dimen.button_size_large_height)) ? 4 : 5;
                }
                if (i3 != this.b) {
                    this.b = i3;
                    this.k.d.B(aedv.b(4, i3), getContext(), this);
                }
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.a) {
            return super.onTouchEvent(motionEvent);
        }
        this.h = false;
        super.onTouchEvent(motionEvent);
        return this.h;
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        d();
    }

    public YouTubeAppCompatTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
        this.j = 0;
        b(context, attributeSet);
    }

    public YouTubeAppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = false;
        this.j = 0;
        b(context, attributeSet);
    }
}
