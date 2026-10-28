package com.google.android.apps.youtube.music.ui.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import defpackage.jie;
import defpackage.jif;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class MusicAutoResizeTextView extends YouTubeTextView {
    private float a;
    private float f;
    private int g;
    private boolean h;
    private float i;
    private float j;

    public MusicAutoResizeTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = 0.0f;
        this.f = 0.0f;
        this.i = 1.0f;
        this.j = 0.0f;
        this.a = getTextSize();
        this.j = 0.0f;
        this.i = 1.0f;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jif.a);
            this.a = typedArrayObtainStyledAttributes.getDimension(0, getTextSize());
            this.f = typedArrayObtainStyledAttributes.getDimension(1, getTextSize());
            this.g = typedArrayObtainStyledAttributes.getInteger(2, getMaxLines());
            this.h = this.a != this.f;
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void a(int i) {
        CharSequence text = getText();
        if (!this.h || text == null || TextUtils.isEmpty(text)) {
            return;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(this.a);
        setTextSize(0, new StaticLayout(text, textPaint, i, Layout.Alignment.ALIGN_CENTER, this.i, this.j, true).getLineCount() >= this.g ? this.f : this.a);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            post(new jie(this, i3, i, 0));
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        this.j = f;
        this.i = f2;
    }

    @Override // com.google.android.libraries.youtube.common.ui.YouTubeTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        a((getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight());
    }

    public MusicAutoResizeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MusicAutoResizeTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MusicAutoResizeTextView(Context context) {
        this(context, null);
    }
}
