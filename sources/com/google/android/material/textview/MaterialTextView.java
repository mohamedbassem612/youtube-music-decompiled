package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.google.android.apps.youtube.music.R;
import defpackage.afba;
import defpackage.afeu;
import defpackage.afev;
import defpackage.azw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        super(afev.a(context, attributeSet, i, 0), attributeSet, i);
        c(attributeSet, i, 0);
    }

    private static int a(Context context, TypedArray typedArray, int... iArr) {
        int iE = -1;
        for (int i = 0; i < 2 && iE < 0; i++) {
            iE = afba.e(context, typedArray, iArr[i], -1);
        }
        return iE;
    }

    private final void b(Resources.Theme theme, int i) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, afeu.a);
        int iA = a(getContext(), typedArrayObtainStyledAttributes, 2, 4);
        typedArrayObtainStyledAttributes.recycle();
        if (iA >= 0) {
            azw.k(this, iA);
        }
    }

    private final void c(AttributeSet attributeSet, int i, int i2) {
        Context context = getContext();
        if (afba.w(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context.getTheme();
            int[] iArr = afeu.b;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int iA = a(context, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iA == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    b(theme, resourceId);
                }
            }
        }
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (afba.w(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            b(context.getTheme(), i);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public MaterialTextView(Context context) {
        this(context, null);
    }

    @Deprecated
    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(afev.a(context, attributeSet, i, i2), attributeSet, i);
        c(attributeSet, i, i2);
    }
}
