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
public class ThreeLevelAutoResizeTextView extends YouTubeTextView {
    private float a;
    private float f;
    private float g;
    private boolean h;
    private float[] i;
    private int[] j;

    public ThreeLevelAutoResizeTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = getTextSize();
        this.g = 0.0f;
        this.f = 1.0f;
        if (attributeSet != null) {
            int minLines = getMinLines() > 0 ? getMinLines() : 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jif.b);
            this.a = typedArrayObtainStyledAttributes.getDimension(0, getTextSize());
            float dimension = typedArrayObtainStyledAttributes.getDimension(2, getTextSize());
            float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, getTextSize());
            int integer = typedArrayObtainStyledAttributes.getInteger(1, getMaxLines());
            int integer2 = typedArrayObtainStyledAttributes.getInteger(3, getMaxLines());
            float f = this.a;
            this.h = (f == dimension2 && f == dimension) ? false : true;
            this.i = new float[]{f, dimension, dimension2};
            this.j = new int[]{minLines, integer, integer2};
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void a(int i) {
        if (!this.h || TextUtils.isEmpty(getText())) {
            return;
        }
        TextPaint textPaint = new TextPaint(1);
        int i2 = 0;
        while (true) {
            float[] fArr = this.i;
            int length = fArr.length;
            if (i2 >= 2) {
                break;
            }
            textPaint.setTextSize(fArr[i2]);
            int i3 = i;
            if (new StaticLayout(getText(), textPaint, i3, Layout.Alignment.ALIGN_CENTER, this.f, this.g, true).getLineCount() <= this.j[i2]) {
                break;
            }
            i2++;
            i = i3;
        }
        setTextSize(0, this.i[i2]);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z) {
            post(new jie(this, i3, i, 2));
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setLineSpacing(float f, float f2) {
        super.setLineSpacing(f, f2);
        this.g = f;
        this.f = f2;
    }

    @Override // com.google.android.libraries.youtube.common.ui.YouTubeTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        a((getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight());
    }

    public ThreeLevelAutoResizeTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThreeLevelAutoResizeTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ThreeLevelAutoResizeTextView(Context context) {
        this(context, null);
    }
}
