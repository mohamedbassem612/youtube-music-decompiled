package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.car.app.model.Alert;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ful {
    protected static final ColorStateList a;
    protected static final int b;
    protected static final Typeface c;
    public static final Path d;
    public static final Rect e;
    public static final RectF f;
    public static final Region g;
    public static final Region h;
    protected static final int i;
    private static final Typeface j;
    private static final int[][] k;
    private static final int[] l;

    static {
        Typeface typeface = Typeface.DEFAULT;
        j = typeface;
        int[][] iArr = {new int[]{0}};
        k = iArr;
        int[] iArr2 = {-16777216};
        l = iArr2;
        a = new ColorStateList(iArr, iArr2);
        b = typeface.getStyle();
        c = typeface;
        i = 1;
        d = new Path();
        e = new Rect();
        f = new RectF();
        g = new Region();
        h = new Region();
    }

    public static int a(Layout layout) {
        for (int i2 = 0; i2 < layout.getLineCount(); i2++) {
            if (layout.getEllipsisCount(i2) > 0) {
                return i2;
            }
        }
        return -1;
    }

    public static int b(Layout layout, int i2, Layout layout2) {
        if (layout2 == null) {
            return 0;
        }
        Rect rect = new Rect();
        layout.getLineBounds(i2, rect);
        int height = layout2.getHeight();
        CharSequence text = layout2.getText();
        if (text != null && text.length() >= 2 && text.charAt(0) == '1' && text.charAt(1) == '\n') {
            height -= layout2.getLineBottom(0);
        }
        return Math.max(0, height - rect.height());
    }

    public static void c(SpannableString spannableString, CharSequence charSequence, Class cls) {
        Object[] spans = spannableString.getSpans(0, spannableString.length(), cls);
        int length = spannableString.length() - charSequence.length();
        for (Object obj : spans) {
            int spanStart = spannableString.getSpanStart(obj);
            int spanEnd = spannableString.getSpanEnd(obj);
            if (spanStart > 0 && spanStart < length && spanEnd >= length) {
                spannableString.removeSpan(obj);
                spannableString.setSpan(obj, spanStart, length, true != fna.v ? 0 : 33);
            } else if (spanStart == 0 && spanEnd == length) {
                spannableString.setSpan(obj, 0, spannableString.length(), true != fna.v ? 0 : 33);
            } else if (spanStart == length) {
                spannableString.setSpan(obj, spanStart, spannableString.length(), true != fna.v ? 0 : 33);
            }
        }
    }

    public static int d(int i2) {
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public static axh e(fwl fwlVar) {
        return fwlVar == fwl.RTL ? axn.d : axn.c;
    }

    public static Layout f(fhd fhdVar, int i2, TextUtils.TruncateAt truncateAt, boolean z, int i3, float f2, float f3, float f4, int i4, CharSequence charSequence, ColorStateList colorStateList, int i5, int i6, float f5, int i7, Typeface typeface, int i8, fwl fwlVar, float f6, int i9) {
        int i10;
        Layout.Alignment alignment;
        fgm fgmVar = new fgm();
        fgmVar.g = false;
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i10 = 2;
        } else if (mode == 0) {
            i10 = 0;
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException("Unexpected size mode: " + View.MeasureSpec.getMode(i2));
            }
            i10 = 1;
        }
        fgl fglVar = fgmVar.e;
        if (fglVar.a.density != f6) {
            fglVar.a();
            fglVar.a.density = f6;
            fgmVar.f = null;
        }
        if (fglVar.n != truncateAt) {
            fglVar.n = truncateAt;
            fgmVar.f = null;
        }
        if (fglVar.o != i3) {
            fglVar.o = i3;
            fgmVar.f = null;
        }
        fglVar.a();
        fglVar.d = f2;
        fglVar.b = f3;
        fglVar.c = f4;
        fglVar.e = i4;
        fglVar.a.setShadowLayer(f2, f3, f4, i4);
        fgmVar.f = null;
        if (charSequence != fglVar.h) {
            if (charSequence instanceof SpannableStringBuilder) {
                try {
                    charSequence.hashCode();
                } catch (NullPointerException e2) {
                    throw new IllegalArgumentException("The given text contains a null span. Due to an Android framework bug, this will cause an exception later down the line.", e2);
                }
            }
            if (charSequence == null || !charSequence.equals(fgmVar.e.h)) {
                fgmVar.e.h = charSequence;
                fgmVar.f = null;
            }
        }
        int size = View.MeasureSpec.getSize(i2);
        fgl fglVar2 = fgmVar.e;
        if (fglVar2.f != size || fglVar2.g != i10) {
            fglVar2.f = size;
            fglVar2.g = i10;
            fgmVar.f = null;
        }
        if (fglVar2.l != z) {
            fglVar2.l = z;
            fgmVar.f = null;
        }
        if (fglVar2.k != f5) {
            fglVar2.k = f5;
            fgmVar.f = null;
        }
        if (fglVar2.j != 1.0f) {
            fglVar2.j = 1.0f;
            fgmVar.f = null;
        }
        if (fglVar2.a.linkColor != i5) {
            fglVar2.a();
            fglVar2.a.linkColor = i5;
            fgmVar.f = null;
        }
        if (fglVar2.r != i9) {
            fglVar2.r = i9;
            fgmVar.f = null;
        }
        if (i6 != -1) {
            fgmVar.b(i6);
        } else {
            fgmVar.b(fhdVar.k.A(14.0f));
        }
        if (fglVar2.a.getLetterSpacing() != 0.0f) {
            fglVar2.a();
            fglVar2.a.setLetterSpacing(0.0f);
            fgmVar.f = null;
        }
        fgmVar.b = 2;
        fgmVar.c = Alert.DURATION_SHOW_INDEFINITELY;
        fgmVar.d = 2;
        fglVar2.a();
        fglVar2.i = colorStateList;
        TextPaint textPaint = fglVar2.a;
        ColorStateList colorStateList2 = fglVar2.i;
        textPaint.setColor(colorStateList2 != null ? colorStateList2.getDefaultColor() : -16777216);
        fgmVar.f = null;
        if (j.equals(typeface)) {
            fgmVar.c(Typeface.defaultFromStyle(i7));
        } else {
            fgmVar.c(typeface);
        }
        axh axhVarE = e(fwlVar);
        if (fglVar2.q != axhVarE) {
            fglVar2.q = axhVarE;
            fgmVar.f = null;
        }
        switch (fuj.c[i8 - 1]) {
            case 3:
                if ((fwlVar == fwl.RTL) == axhVarE.a(charSequence, 0, charSequence.length())) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                    break;
                }
            case 2:
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                break;
            case 4:
                alignment = (fwlVar == fwl.RTL) != axhVarE.a(charSequence, 0, charSequence.length()) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                break;
            case 5:
                alignment = !axhVarE.a(charSequence, 0, charSequence.length()) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                break;
            case 6:
                alignment = !axhVarE.a(charSequence, 0, charSequence.length()) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                break;
            case 7:
                alignment = Layout.Alignment.ALIGN_CENTER;
                break;
            default:
                alignment = Layout.Alignment.ALIGN_NORMAL;
                break;
        }
        if (fglVar2.p != alignment) {
            fglVar2.p = alignment;
            fgmVar.f = null;
        }
        try {
            return fgmVar.a();
        } catch (ArrayIndexOutOfBoundsException e3) {
            throw new RuntimeException("text: ".concat(String.valueOf(charSequence.toString())), e3);
        }
    }
}
