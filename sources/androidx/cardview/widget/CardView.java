package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.afl;
import defpackage.afm;
import defpackage.afn;
import defpackage.afo;
import defpackage.bac;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] e = {R.attr.colorBackground};
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    private final afm f;

    public CardView(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.c = rect;
        this.d = new Rect();
        afm afmVar = new afm(this);
        this.f = afmVar;
        int[] iArr = afl.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, com.google.android.apps.youtube.music.R.style.CardView);
        bac.o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, com.google.android.apps.youtube.music.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(e);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.google.android.apps.youtube.music.R.color.cardview_light_background) : getResources().getColor(com.google.android.apps.youtube.music.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        afn afnVar = new afn(colorStateListValueOf, dimension);
        afmVar.a = afnVar;
        CardView cardView = afmVar.b;
        cardView.setBackgroundDrawable(afnVar);
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        Drawable drawable = afmVar.a;
        boolean zC = afmVar.c();
        boolean zB = afmVar.b();
        afn afnVar2 = (afn) drawable;
        if (dimension3 != afnVar2.b || afnVar2.c != zC || afnVar2.d != zB) {
            afnVar2.b = dimension3;
            afnVar2.c = zC;
            afnVar2.d = zB;
            afnVar2.a(null);
            afnVar2.invalidateSelf();
        }
        if (!afmVar.c()) {
            afmVar.a(0, 0, 0, 0);
            return;
        }
        afn afnVar3 = (afn) afmVar.a;
        float f = afnVar3.b;
        float f2 = afnVar3.a;
        int iCeil = (int) Math.ceil(afo.a(f, f2, afmVar.b()));
        int iCeil2 = (int) Math.ceil(afo.b(f, f2, afmVar.b()));
        afmVar.a(iCeil, iCeil2, iCeil, iCeil2);
    }

    public final void b(float f) {
        afn afnVar = (afn) this.f.a;
        if (f != afnVar.a) {
            afnVar.a = f;
            afnVar.a(null);
            afnVar.invalidateSelf();
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.youtube.music.R.attr.cardViewStyle);
    }

    public CardView(Context context) {
        this(context, null);
    }
}
