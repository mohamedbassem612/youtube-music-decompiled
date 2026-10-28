package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class le {
    public Typeface b;
    public boolean c;
    private final TextView d;
    private oz e;
    private oz f;
    private oz g;
    private oz h;
    private oz i;
    private oz j;
    private final lj k;
    public int a = 0;
    private int l = -1;
    private String m = null;

    public le(TextView textView) {
        this.d = textView;
        this.k = new lj(textView);
    }

    public static void f(TextView textView, Typeface typeface, int i) {
        agm agmVar = lc.a;
        String fontVariationSettings = textView.getFontVariationSettings();
        if (!TextUtils.isEmpty(fontVariationSettings)) {
            lc.b(textView, null);
        }
        textView.setTypeface(typeface, i);
        if (TextUtils.isEmpty(fontVariationSettings)) {
            return;
        }
        lc.b(textView, fontVariationSettings);
    }

    public static final void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (Build.VERSION.SDK_INT >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        azs.l(text);
        if (Build.VERSION.SDK_INT >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        int i = editorInfo.initialSelStart > editorInfo.initialSelEnd ? editorInfo.initialSelEnd : editorInfo.initialSelStart;
        int i2 = editorInfo.initialSelStart > editorInfo.initialSelEnd ? editorInfo.initialSelStart : editorInfo.initialSelEnd;
        int length = text.length();
        if (i < 0 || i2 > length) {
            bco.b(editorInfo, null, 0, 0);
            return;
        }
        int i3 = editorInfo.inputType & 4095;
        if (i3 == 129 || i3 == 225 || i3 == 18) {
            bco.b(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            bco.b(editorInfo, text, i, i2);
            return;
        }
        int i4 = i2 - i;
        int length2 = text.length() - i2;
        int i5 = i4 > 1024 ? 0 : i4;
        int i6 = 2048 - i5;
        int iMin = Math.min(length2, i6 - Math.min(i, (int) (((double) i6) * 0.8d)));
        int iMin2 = Math.min(i, i6 - iMin);
        int i7 = i - iMin2;
        if (bco.c(text, i7, 0)) {
            i7++;
            iMin2--;
        }
        if (bco.c(text, (i2 + iMin) - 1, 1)) {
            iMin--;
        }
        int i8 = iMin2 + i5;
        bco.b(editorInfo, i5 != i4 ? TextUtils.concat(text.subSequence(i7, i7 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i7, iMin + i8 + i7), iMin2, i8);
    }

    private static oz s(Context context, kl klVar, int i) {
        ColorStateList colorStateListA = klVar.a(context, i);
        if (colorStateListA == null) {
            return null;
        }
        oz ozVar = new oz();
        ozVar.d = true;
        ozVar.a = colorStateListA;
        return ozVar;
    }

    private final void t(Drawable drawable, oz ozVar) {
        if (drawable == null || ozVar == null) {
            return;
        }
        ok.g(drawable, ozVar, this.d.getDrawableState());
    }

    private final void u(boolean z) {
        Typeface typeface = this.b;
        if (typeface != null) {
            int i = this.l;
            TextView textView = this.d;
            if (i == -1) {
                textView.setTypeface(typeface, this.a);
            } else {
                textView.setTypeface(typeface);
            }
        } else if (z) {
            this.d.setTypeface(null);
        }
        String str = this.m;
        if (str != null) {
            lc.b(this.d, str);
        }
    }

    private final boolean v(Context context, ahto ahtoVar) {
        String strE;
        int i;
        Typeface typeface;
        Typeface typeface2;
        int[] iArr = he.a;
        this.a = ahtoVar.w(2, this.a);
        if (Build.VERSION.SDK_INT >= 28) {
            int iW = ahtoVar.w(11, -1);
            this.l = iW;
            if (iW != -1) {
                this.a &= 2;
            }
        }
        if (ahtoVar.H(13)) {
            this.m = ahtoVar.E(13);
        }
        if (ahtoVar.H(10) || ahtoVar.H(12)) {
            Typeface typefaceE = null;
            this.b = null;
            int i2 = true == ahtoVar.H(12) ? 12 : 10;
            int i3 = this.l;
            int i4 = this.a;
            if (!context.isRestricted()) {
                la laVar = new la(this, i3, i4, new WeakReference(this.d));
                try {
                    int i5 = this.a;
                    int resourceId = ((TypedArray) ahtoVar.b).getResourceId(i2, 0);
                    if (resourceId != 0) {
                        if (ahtoVar.c == null) {
                            ahtoVar.c = new TypedValue();
                        }
                        Object obj = ahtoVar.a;
                        Object obj2 = ahtoVar.c;
                        int i6 = avt.a;
                        if (!((Context) obj).isRestricted()) {
                            typefaceE = avt.e((Context) obj, resourceId, (TypedValue) obj2, i5, laVar, true, false);
                        }
                    }
                    if (typefaceE != null) {
                        if (Build.VERSION.SDK_INT < 28 || this.l == -1) {
                            this.b = typefaceE;
                        } else {
                            this.b = Typeface.create(Typeface.create(typefaceE, 0), this.l, (this.a & 2) != 0);
                        }
                    }
                    this.c = this.b == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.b == null && (strE = ahtoVar.E(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.l == -1) {
                    this.b = Typeface.create(strE, this.a);
                } else {
                    this.b = Typeface.create(Typeface.create(strE, 0), this.l, (this.a & 2) != 0);
                }
            }
        } else if (ahtoVar.H(1)) {
            this.c = false;
            int iW2 = ahtoVar.w(1, 1);
            if (iW2 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (iW2 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (iW2 == 3) {
                typeface2 = Typeface.MONOSPACE;
            }
            this.b = typeface2;
        } else {
            if (Build.VERSION.SDK_INT < 28 || (i = this.l) == -1 || (typeface = this.b) == null) {
                return false;
            }
            this.b = Typeface.create(typeface, i, (this.a & 2) != 0);
        }
        return true;
    }

    public final int a() {
        return this.k.a();
    }

    public final int b() {
        return this.k.b();
    }

    public final int c() {
        return this.k.c();
    }

    public final int d() {
        return this.k.a;
    }

    public final void e() {
        if (this.e != null || this.f != null || this.g != null || this.h != null) {
            Drawable[] compoundDrawables = this.d.getCompoundDrawables();
            t(compoundDrawables[0], this.e);
            t(compoundDrawables[1], this.f);
            t(compoundDrawables[2], this.g);
            t(compoundDrawables[3], this.h);
        }
        if (this.i == null && this.j == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        t(compoundDrawablesRelative[0], this.i);
        t(compoundDrawablesRelative[2], this.j);
    }

    public final void g() {
        this.k.e();
    }

    /* JADX WARN: Code duplicated, block: B:163:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:164:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:167:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:170:0x02db  */
    /* JADX WARN: Code duplicated, block: B:172:0x02df  */
    /* JADX WARN: Code duplicated, block: B:174:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:194:0x0354  */
    /* JADX WARN: Code duplicated, block: B:196:0x0359  */
    /* JADX WARN: Code duplicated, block: B:199:0x0360 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:200:0x0362  */
    /* JADX WARN: Code duplicated, block: B:201:0x0367  */
    /* JADX WARN: Code duplicated, block: B:204:? A[RETURN, SYNTHETIC] */
    public final void h(AttributeSet attributeSet, int i) {
        boolean zG;
        boolean z;
        String strE;
        boolean z2;
        int i2;
        float fV;
        int i3;
        Drawable[] compoundDrawablesRelative;
        int i4;
        int resourceId;
        TextView textView = this.d;
        Context context = textView.getContext();
        kl klVarD = kl.d();
        int[] iArr = he.h;
        ahto ahtoVar = new ahto(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
        bac.o(textView, textView.getContext(), iArr, attributeSet, (TypedArray) ahtoVar.b, i, 0);
        int iZ = ahtoVar.z(0, -1);
        if (ahtoVar.H(3)) {
            this.e = s(context, klVarD, ahtoVar.z(3, 0));
        }
        if (ahtoVar.H(1)) {
            this.f = s(context, klVarD, ahtoVar.z(1, 0));
        }
        if (ahtoVar.H(4)) {
            this.g = s(context, klVarD, ahtoVar.z(4, 0));
        }
        if (ahtoVar.H(2)) {
            this.h = s(context, klVarD, ahtoVar.z(2, 0));
        }
        if (ahtoVar.H(5)) {
            this.i = s(context, klVarD, ahtoVar.z(5, 0));
        }
        if (ahtoVar.H(6)) {
            this.j = s(context, klVarD, ahtoVar.z(6, 0));
        }
        ahtoVar.F();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iZ != -1) {
            ahto ahtoVar2 = new ahto(context, context.obtainStyledAttributes(iZ, he.w));
            if (z3 || !ahtoVar2.H(14)) {
                zG = false;
                z = false;
            } else {
                zG = ahtoVar2.G(14, false);
                z = true;
            }
            v(context, ahtoVar2);
            strE = ahtoVar2.H(15) ? ahtoVar2.E(15) : null;
            ahtoVar2.F();
        } else {
            zG = false;
            z = false;
            strE = null;
        }
        ahto ahtoVar3 = new ahto(context, context.obtainStyledAttributes(attributeSet, he.w, i, 0));
        if (!z3 && ahtoVar3.H(14)) {
            zG = ahtoVar3.G(14, false);
            z = true;
        }
        if (ahtoVar3.H(15)) {
            strE = ahtoVar3.E(15);
        }
        if (Build.VERSION.SDK_INT >= 28 && ahtoVar3.H(0) && ahtoVar3.v(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        v(context, ahtoVar3);
        ahtoVar3.F();
        if (!z3 && z) {
            j(zG);
        }
        u(false);
        if (strE != null) {
            textView.setTextLocales(LocaleList.forLanguageTags(strE));
        }
        lj ljVar = this.k;
        Context context2 = ljVar.i;
        int[] iArr2 = he.i;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        TextView textView2 = ljVar.h;
        bac.o(textView2, textView2.getContext(), iArr2, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            ljVar.a = typedArrayObtainStyledAttributes.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(4) ? typedArrayObtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(2) ? typedArrayObtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(1) ? typedArrayObtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(3) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i5 = 0; i5 < length; i5++) {
                    iArr3[i5] = typedArrayObtainTypedArray.getDimensionPixelSize(i5, -1);
                }
                ljVar.f = lj.l(iArr3);
                ljVar.j();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!ljVar.k()) {
            ljVar.a = 0;
        } else if (ljVar.a == 1) {
            if (!ljVar.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i4 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                ljVar.g(dimension2, dimension3, dimension);
            }
            ljVar.i();
        }
        if (pl.c && ljVar.a != 0) {
            int[] iArr4 = ljVar.f;
            if (iArr4.length > 0) {
                agm agmVar = lc.a;
                if (textView.getAutoSizeStepGranularity() != -1.0f) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(ljVar.b(), ljVar.a(), ljVar.c(), 0);
                } else {
                    textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                }
            }
        }
        ahto ahtoVar4 = new ahto(context, context.obtainStyledAttributes(attributeSet, iArr2));
        int iZ2 = ahtoVar4.z(8, -1);
        Drawable drawableC = iZ2 != -1 ? klVarD.c(context, iZ2) : null;
        int iZ3 = ahtoVar4.z(13, -1);
        Drawable drawableC2 = iZ3 != -1 ? klVarD.c(context, iZ3) : null;
        int iZ4 = ahtoVar4.z(9, -1);
        Drawable drawableC3 = iZ4 != -1 ? klVarD.c(context, iZ4) : null;
        int iZ5 = ahtoVar4.z(6, -1);
        Drawable drawableC4 = iZ5 != -1 ? klVarD.c(context, iZ5) : null;
        int iZ6 = ahtoVar4.z(10, -1);
        Drawable drawableC5 = iZ6 != -1 ? klVarD.c(context, iZ6) : null;
        int iZ7 = ahtoVar4.z(7, -1);
        Drawable drawableC6 = iZ7 != -1 ? klVarD.c(context, iZ7) : null;
        if (drawableC5 != null) {
            if (drawableC4 != null) {
                z2 = false;
            } else {
                z2 = true;
            }
            compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableC5 == null) {
                drawableC5 = compoundDrawablesRelative[0];
            }
            if (drawableC2 == null) {
                drawableC2 = compoundDrawablesRelative[1];
            }
            if (drawableC6 == null) {
                drawableC6 = compoundDrawablesRelative[2];
            }
            if (true == z2) {
                drawableC4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableC5, drawableC2, drawableC6, drawableC4);
        } else if (drawableC6 != null) {
            if (drawableC4 != null) {
                z2 = false;
            } else {
                z2 = true;
            }
            compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableC5 == null) {
                drawableC5 = compoundDrawablesRelative[0];
            }
            if (drawableC2 == null) {
                drawableC2 = compoundDrawablesRelative[1];
            }
            if (drawableC6 == null) {
                drawableC6 = compoundDrawablesRelative[2];
            }
            if (true == z2) {
                drawableC4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableC5, drawableC2, drawableC6, drawableC4);
        } else if (drawableC != null || drawableC2 != null || drawableC3 != null || drawableC4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableC == null) {
                    drawableC = compoundDrawables[0];
                }
                if (drawableC2 == null) {
                    drawableC2 = compoundDrawables[1];
                }
                if (drawableC3 == null) {
                    drawableC3 = compoundDrawables[2];
                }
                if (drawableC4 == null) {
                    drawableC4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableC, drawableC2, drawableC3, drawableC4);
            } else {
                if (drawableC2 == null) {
                    drawableC2 = compoundDrawablesRelative2[1];
                }
                if (drawableC4 == null) {
                    drawableC4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableC2, compoundDrawablesRelative2[2], drawableC4);
            }
        }
        if (ahtoVar4.H(11)) {
            textView.setCompoundDrawableTintList(ahtoVar4.A(11));
        }
        if (ahtoVar4.H(12)) {
            int iW = ahtoVar4.w(12, -1);
            Rect rect = lx.a;
            textView.setCompoundDrawableTintMode(a.l(iW, null));
        }
        int iV = ahtoVar4.v(15, -1);
        int iV2 = ahtoVar4.v(18, -1);
        if (ahtoVar4.H(19)) {
            TypedValue typedValuePeekValue = ((TypedArray) ahtoVar4.b).peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                i2 = -1;
                fV = ahtoVar4.v(19, -1);
            } else {
                int i6 = typedValuePeekValue.data & 15;
                fV = TypedValue.complexToFloat(typedValuePeekValue.data);
                i3 = i6;
                i2 = -1;
            }
            ahtoVar4.F();
            if (iV != i2) {
                azw.i(textView, iV);
            }
            if (iV2 != i2) {
                azw.j(textView, iV2);
            }
            if (fV != -1.0f) {
                if (i3 == i2) {
                    azw.k(textView, (int) fV);
                } else {
                    azw.l(textView, i3, fV);
                }
            }
        }
        i2 = -1;
        fV = -1.0f;
        i3 = i2;
        ahtoVar4.F();
        if (iV != i2) {
            azw.i(textView, iV);
        }
        if (iV2 != i2) {
            azw.j(textView, iV2);
        }
        if (fV != -1.0f) {
            if (i3 == i2) {
                azw.k(textView, (int) fV);
            } else {
                azw.l(textView, i3, fV);
            }
        }
    }

    public final void i(Context context, int i) {
        ahto ahtoVar = new ahto(context, context.obtainStyledAttributes(i, he.w));
        if (ahtoVar.H(14)) {
            j(ahtoVar.G(14, false));
        }
        if (ahtoVar.H(0) && ahtoVar.v(0, -1) == 0) {
            this.d.setTextSize(0, 0.0f);
        }
        boolean zV = v(context, ahtoVar);
        ahtoVar.F();
        u(zV);
    }

    final void j(boolean z) {
        this.d.setAllCaps(z);
    }

    public final void k(int i, int i2, int i3, int i4) {
        lj ljVar = this.k;
        if (ljVar.k()) {
            DisplayMetrics displayMetrics = ljVar.i.getResources().getDisplayMetrics();
            ljVar.g(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (ljVar.i()) {
                ljVar.e();
            }
        }
    }

    public final void l(int[] iArr, int i) {
        lj ljVar = this.k;
        if (ljVar.k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = ljVar.i.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                ljVar.f = lj.l(iArrCopyOf);
                if (!ljVar.j()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: ".concat(String.valueOf(Arrays.toString(iArr))));
                }
            } else {
                ljVar.g = false;
            }
            if (ljVar.i()) {
                ljVar.e();
            }
        }
    }

    public final void m(int i) {
        lj ljVar = this.k;
        if (ljVar.k()) {
            if (i == 0) {
                ljVar.a = 0;
                ljVar.d = -1.0f;
                ljVar.e = -1.0f;
                ljVar.c = -1.0f;
                ljVar.f = new int[0];
                ljVar.b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(a.bR(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = ljVar.i.getResources().getDisplayMetrics();
            ljVar.g(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (ljVar.i()) {
                ljVar.e();
            }
        }
    }

    public final void n(int i, float f) {
        if (pl.c || o()) {
            return;
        }
        this.k.f(i, f);
    }

    public final boolean o() {
        return this.k.h();
    }

    public final int[] p() {
        return this.k.f;
    }

    public final void q() {
        if (pl.c) {
            return;
        }
        g();
    }
}
