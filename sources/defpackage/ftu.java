package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.ReplacementSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import java.text.BreakIterator;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ftu extends fkx {

    @fmt(a = 3)
    @fmu(a = fmv.j)
    public int A;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    final int B;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean C;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public Typeface D;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public int E;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    final int F;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    public heg G;

    @fmt(a = 3)
    @fmu(a = fmv.f)
    boolean a;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public int b;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean c;

    @fmt(a = 13)
    @fmu(a = fmv.b)
    public CharSequence d;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    TextUtils.TruncateAt e;

    @fmt(a = 3)
    @fmu(a = fmv.a)
    public boolean f;

    @fmt(a = 0)
    @fmu(a = fmv.i)
    public float g;

    @fmt(a = 3)
    @fmu(a = fmv.g)
    int q;

    @fmt(a = 3)
    @fmu(a = fmv.g)
    public int r;

    @fmt(a = 3)
    @fmu(a = fmv.d)
    public int s;

    @fmt(a = 3)
    @fmu(a = fmv.g)
    public int t;

    @fmt(a = 0)
    @fmu(a = fmv.i)
    public float u;

    @fmt(a = 0)
    @fmu(a = fmv.i)
    public float v;

    @fmt(a = 0)
    @fmu(a = fmv.i)
    public float w;

    @fmt(a = 3)
    @fmu(a = fmv.f)
    public boolean x;

    @fmt(a = 13)
    @fmu(a = fmv.b)
    public CharSequence y;

    @fmt(a = 13)
    @fmu(a = fmv.a)
    final ColorStateList z;

    public ftu() {
        super("Text");
        this.b = 0;
        this.c = true;
        this.r = -16776961;
        this.s = Alert.DURATION_SHOW_INDEFINITELY;
        this.t = -7829368;
        this.x = true;
        this.z = ful.a;
        this.A = -1;
        this.B = ful.b;
        this.D = ful.c;
        this.F = ful.i;
    }

    @Override // defpackage.fgy
    protected final Object C(Context context) {
        Path path = ful.d;
        return new ftx();
    }

    @Override // defpackage.fgy
    protected final void E(fiz fizVar, fiz fizVar2) {
        ftt fttVar = (ftt) fizVar;
        ftt fttVar2 = (ftt) fizVar2;
        fttVar.a = fttVar2.a;
        fttVar.b = fttVar2.b;
        fttVar.c = fttVar2.c;
        fttVar.d = fttVar2.d;
        fttVar.e = fttVar2.e;
        fttVar.f = fttVar2.f;
        fttVar.g = fttVar2.g;
        fttVar.h = fttVar2.h;
        fttVar.i = fttVar2.i;
        fttVar.j = fttVar2.j;
    }

    @Override // defpackage.fgy
    protected final void L(fhd fhdVar, Object obj, fiz fizVar) {
        ftx ftxVar = (ftx) obj;
        int i = this.q;
        boolean z = this.c;
        ftt fttVar = (ftt) fizVar;
        CharSequence charSequence = fttVar.h;
        heg hegVar = this.G;
        Layout layout = fttVar.i;
        Float f = fttVar.j;
        ClickableSpan[] clickableSpanArr = fttVar.a;
        ImageSpan[] imageSpanArr = fttVar.c;
        Path path = ful.d;
        float fFloatValue = f == null ? 0.0f : f.floatValue();
        String strN = fhdVar.n();
        ftxVar.a = layout;
        ftxVar.c = fFloatValue;
        ftxVar.d = z;
        ftxVar.f = charSequence;
        if (ftxVar.m == null && clickableSpanArr != null) {
            for (ClickableSpan clickableSpan : clickableSpanArr) {
                if (clickableSpan instanceof frp) {
                    ftxVar.m = new Handler();
                    break;
                }
            }
        }
        ftxVar.k = null;
        boolean z2 = clickableSpanArr != null && clickableSpanArr.length > 0;
        ColorStateList colorStateList = this.z;
        ftxVar.e = z2;
        ftxVar.i = i;
        ftxVar.p = hegVar;
        ftxVar.o = 0;
        if (colorStateList == null) {
            colorStateList = ful.a;
        }
        ftxVar.g = colorStateList;
        ftxVar.h = ftxVar.g.getDefaultColor();
        Layout layout2 = ftxVar.a;
        if (layout2 != null) {
            layout2.getPaint().setColor(ftxVar.g.getColorForState(ftxVar.getState(), ftxVar.h));
        }
        ftxVar.a(0, 0);
        if (imageSpanArr != null) {
            for (ImageSpan imageSpan : imageSpanArr) {
                Drawable drawable = imageSpan.getDrawable();
                drawable.setCallback(ftxVar);
                drawable.setVisible(true, false);
            }
        }
        ftxVar.j = imageSpanArr;
        ftxVar.n = strN;
        heg hegVar2 = ftxVar.p;
        if (hegVar2 != null) {
            hegVar2.v(ftxVar.a, ftxVar.f);
        }
        ftxVar.invalidateSelf();
        if (charSequence instanceof frq) {
            ((frq) charSequence).a();
        }
    }

    @Override // defpackage.fgy
    public final boolean O() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean T() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean U() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean Z() {
        return true;
    }

    @Override // defpackage.fgy
    public final boolean ab() {
        return true;
    }

    @Override // defpackage.fgy
    public final int af() {
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:101:0x0308  */
    /* JADX WARN: Code duplicated, block: B:105:0x0312  */
    /* JADX WARN: Code duplicated, block: B:137:0x03bb A[LOOP:2: B:133:0x03a9->B:137:0x03bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:183:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:185:0x051b  */
    /* JADX WARN: Code duplicated, block: B:79:0x028a  */
    /* JADX WARN: Code duplicated, block: B:83:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:84:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:87:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:89:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:91:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:92:0x02df  */
    /* JADX WARN: Code duplicated, block: B:95:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:97:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:99:0x02fd A[DONT_INVERT] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x0372 -> B:117:0x0359). Please report as a decompilation issue!!! */
    @Override // defpackage.fgy
    public final void ag(fhd fhdVar, fji fjiVar, fiz fizVar) {
        CharSequence charSequence;
        float f;
        TextUtils.TruncateAt truncateAt;
        Layout layoutF;
        int i;
        CharSequence charSequence2;
        int i2;
        Layout layout;
        TextUtils.TruncateAt truncateAt2;
        Layout layoutF2;
        TextUtils.TruncateAt truncateAt3;
        boolean z;
        CharSequence charSequence3;
        CharSequence charSequence4;
        float f2;
        Layout layout2;
        int i3;
        int i4;
        CharSequence charSequence5;
        Layout layout3;
        CharSequence charSequence6;
        boolean z2;
        CharSequence charSequence7;
        float f3;
        TextUtils.TruncateAt truncateAt4;
        Layout layoutF3;
        int iMin;
        CharSequence charSequence8;
        int i5;
        CharSequence charSequence9;
        ClickableSpan[] clickableSpanArr;
        ImageSpan[] imageSpanArr;
        Float f4;
        ftt fttVar;
        int i6;
        float f5;
        Layout.Alignment alignment;
        boolean zA;
        int i7;
        int i8;
        float lineWidth;
        float lineWidth2;
        CharSequence charSequence10;
        ColorStateList colorStateList;
        int i9;
        int i10;
        CharSequence charSequence11;
        int offsetForHorizontal;
        int iPreceding;
        int iMin2;
        int lineStart;
        int i11;
        int i12;
        int iFollowing;
        float f6;
        CharSequence charSequence12;
        CharSequence charSequence13;
        CharSequence charSequence14 = this.y;
        TextUtils.TruncateAt truncateAt5 = this.e;
        boolean z3 = this.x;
        int i13 = this.s;
        float f7 = this.w;
        float f8 = this.u;
        float f9 = this.v;
        int i14 = this.t;
        int i15 = this.r;
        int i16 = this.A;
        float f10 = this.g;
        Typeface typeface = this.D;
        int i17 = this.E;
        int i18 = this.b;
        CharSequence charSequence15 = this.d;
        boolean z4 = this.f;
        boolean z5 = this.C;
        ftt fttVar2 = (ftt) fizVar;
        Layout layout4 = fttVar2.b;
        Layout layout5 = fttVar2.d;
        Integer num = fttVar2.g;
        Integer num2 = fttVar2.e;
        Float f11 = fttVar2.f;
        Path path = ful.d;
        if (TextUtils.isEmpty(charSequence14)) {
            fttVar = fttVar2;
            f4 = null;
            clickableSpanArr = null;
            layoutF3 = null;
            imageSpanArr = null;
            charSequence13 = charSequence14;
        } else {
            int i19 = this.B;
            ColorStateList colorStateList2 = this.z;
            int iG = (fjiVar.g() - fjiVar.d()) - fjiVar.e();
            float fB = (fjiVar.b() - fjiVar.f()) - fjiVar.c();
            float f12 = iG;
            if (layout5 != null && num.intValue() == f12 && num2.intValue() == fB) {
                f = f12;
                layoutF = layout5;
                truncateAt = truncateAt5;
                charSequence = charSequence15;
            } else {
                charSequence = charSequence15;
                f = f12;
                truncateAt = truncateAt5;
                layoutF = ful.f(fhdVar, View.MeasureSpec.makeMeasureSpec((int) f12, 1073741824), truncateAt, z3, i13, f7, f8, f9, i14, charSequence14, colorStateList2, i15, i16, f10, i19, typeface, ful.d(i17), fjiVar.m(), fhdVar.a.getResources().getDisplayMetrics().density, i18);
            }
            int height = layoutF == null ? 0 : layoutF.getHeight();
            Layout layout6 = layoutF;
            int i20 = this.F;
            int[] iArr = fuj.a;
            if (i20 == 0) {
                throw null;
            }
            float f13 = height;
            int i21 = iArr[i20 - 1];
            TextUtils.TruncateAt truncateAt6 = truncateAt;
            Float fValueOf = i21 != 1 ? i21 != 2 ? Float.valueOf(0.0f) : Float.valueOf(fB - f13) : Float.valueOf((fB - f13) / 2.0f);
            CharSequence charSequence16 = (r19 == 0 || !TextUtils.isEmpty(charSequence)) ? charSequence : "…";
            if (TextUtils.isEmpty(charSequence16) || layout4 != null) {
                i = i13;
                charSequence2 = "…";
                i2 = 1;
                layout = layout6;
                truncateAt2 = truncateAt6;
                layoutF2 = r42;
            } else {
                truncateAt2 = truncateAt6;
                i = i13;
                layout = layout6;
                charSequence2 = "…";
                i2 = 1;
                layoutF2 = ful.f(fhdVar, View.MeasureSpec.makeMeasureSpec((int) f, 1073741824), truncateAt2, z3, Alert.DURATION_SHOW_INDEFINITELY, f7, f8, f9, i14, charSequence16, colorStateList2, i15, i16, f10, i19, typeface, ful.d(i17), fjiVar.m(), fhdVar.a.getResources().getDisplayMetrics().density, i18);
            }
            if (r18 != 0 && i == Integer.MAX_VALUE) {
                charSequence4 = charSequence2;
                if (charSequence16 != 0 && charSequence16.equals(charSequence4)) {
                    layoutF2 = null;
                }
                truncateAt3 = truncateAt2;
                float fB2 = fjiVar.b() + layout.getSpacingAdd();
                Rect rect = new Rect();
                int lineCount = layout.getLineCount();
                while (true) {
                    if (lineCount <= 0) {
                        z = z3;
                        charSequence3 = charSequence16;
                        Layout layout7 = layout;
                        f2 = f7;
                        layout2 = layout7;
                        i3 = i2;
                        break;
                    }
                    z = z3;
                    int i22 = lineCount - 1;
                    charSequence3 = charSequence16;
                    Layout layout8 = layout;
                    layout8.getLineBounds(i22, rect);
                    f2 = f7;
                    if (rect.bottom + ful.b(layout8, i22, layoutF2) <= fB2) {
                        int i23 = lineCount;
                        layout2 = layout8;
                        i3 = i23;
                        break;
                    } else {
                        lineCount = i22;
                        z3 = z;
                        f7 = f2;
                        layout = layout8;
                        charSequence16 = charSequence3;
                    }
                }
            } else {
                layoutF2 = layoutF2;
                truncateAt3 = truncateAt2;
                z = z3;
                charSequence3 = charSequence16;
                Layout layout9 = layout;
                charSequence4 = charSequence2;
                f2 = f7;
                layout2 = layout9;
                i3 = i;
            }
            int iA = ful.a(layout2);
            if (iA != -1) {
                i4 = iA;
            } else if (i3 < layout2.getLineCount()) {
                iA = i3 - 1;
                i4 = iA;
            } else {
                i4 = -1;
            }
            if (z4 && i == Integer.MAX_VALUE && i3 < layout2.getLineCount()) {
                TextUtils.TruncateAt truncateAt7 = truncateAt3;
                charSequence5 = charSequence4;
                layout3 = layoutF2;
                z2 = z;
                charSequence7 = charSequence3;
                f3 = f2;
                layoutF3 = ful.f(fhdVar, View.MeasureSpec.makeMeasureSpec((int) f6, 1073741824), truncateAt7, z2, i3, f3, f8, f9, i14, charSequence12, colorStateList2, i15, i16, f10, i19, typeface, ful.d(i17), fjiVar.m(), fhdVar.a.getResources().getDisplayMetrics().density, i18);
                if (fna.O) {
                    int iA2 = ful.a(layoutF3);
                    truncateAt4 = truncateAt7;
                    if (iA2 == -1 && layoutF3.getLineCount() > 0) {
                        f6 = f;
                        charSequence12 = charSequence14;
                        iA2 = layoutF3.getLineCount() - 1;
                    }
                    f6 = f;
                    charSequence12 = charSequence14;
                    f6 = f;
                    charSequence12 = charSequence14;
                    iMin = iA2;
                    layoutF3 = layoutF3;
                    charSequence8 = charSequence12;
                } else {
                    f6 = f;
                    charSequence12 = charSequence14;
                    truncateAt4 = truncateAt7;
                    charSequence6 = charSequence12;
                }
                if (fna.O) {
                    i5 = -1;
                } else if (layoutF3.getLineCount() > 0 || iMin < 0) {
                    i5 = -1;
                    iMin = -1;
                } else {
                    i5 = -1;
                    iMin = Math.min(iMin, layoutF3.getLineCount() - 1);
                }
                if (layout3 != null) {
                    i6 = i3;
                    if (iMin != i5) {
                        float f14 = f3;
                        f5 = f;
                        int i24 = (int) f5;
                        axh axhVarE = ful.e(fjiVar.m());
                        alignment = layout3.getAlignment();
                        zA = axhVarE.a(charSequence8, 0, charSequence8.length());
                        if (alignment == Layout.Alignment.ALIGN_NORMAL) {
                            i7 = i2;
                        } else {
                            i7 = 0;
                        }
                        i8 = i7 ^ (zA ? 1 : 0);
                        lineWidth = layout3.getLineWidth(layout3.getLineCount() - 1);
                        if (!zA) {
                            lineWidth2 = f5 - lineWidth;
                            if (i8 == 0) {
                                lineWidth2 += f5 - layoutF3.getLineWidth(iMin);
                            }
                        } else if (i8 != 0) {
                            lineWidth2 = lineWidth - (f5 - layoutF3.getLineWidth(iMin));
                        } else {
                            lineWidth2 = lineWidth;
                        }
                        charSequence10 = charSequence7;
                        if (charSequence10 != null || (offsetForHorizontal = layoutF3.getOffsetForHorizontal(iMin, lineWidth2)) <= 0) {
                            colorStateList = colorStateList2;
                            i9 = i15;
                            i10 = i16;
                            charSequence11 = charSequence8;
                        } else {
                            if (fna.v) {
                                TextPaint paint = layoutF3.getPaint();
                                int lineStart2 = layoutF3.getLineStart(iMin);
                                int lineEnd = layoutF3.getLineEnd(iMin);
                                colorStateList = colorStateList2;
                                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                                i9 = i15;
                                characterInstance.setText(charSequence8.toString());
                                if (!characterInstance.isBoundary(offsetForHorizontal)) {
                                    offsetForHorizontal = characterInstance.preceding(offsetForHorizontal);
                                }
                                while (true) {
                                    if (offsetForHorizontal <= lineStart2 || StaticLayout.getDesiredWidth(charSequence8, lineStart2, offsetForHorizontal, paint) + lineWidth <= f5) {
                                        i12 = -1;
                                        break;
                                    }
                                    offsetForHorizontal = characterInstance.preceding(offsetForHorizontal);
                                    i12 = -1;
                                    if (offsetForHorizontal == -1) {
                                        offsetForHorizontal = lineStart2;
                                        break;
                                    }
                                }
                                i10 = i16;
                                if (offsetForHorizontal < lineEnd || (iFollowing = characterInstance.following(offsetForHorizontal)) == i12 || iFollowing > lineEnd || StaticLayout.getDesiredWidth(charSequence8, lineStart2, iFollowing, paint) + lineWidth > f5) {
                                    iPreceding = offsetForHorizontal;
                                } else {
                                    offsetForHorizontal = iFollowing;
                                    i16 = i10;
                                    i12 = -1;
                                    i10 = i16;
                                    if (offsetForHorizontal < lineEnd) {
                                    }
                                    iPreceding = offsetForHorizontal;
                                }
                            } else {
                                colorStateList = colorStateList2;
                                i9 = i15;
                                i10 = i16;
                                BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                                characterInstance2.setText(charSequence8.toString());
                                iPreceding = characterInstance2.preceding(offsetForHorizontal);
                                if (iPreceding == -1) {
                                    iPreceding = 0;
                                }
                            }
                            if (z5) {
                                BreakIterator wordInstance = BreakIterator.getWordInstance();
                                wordInstance.setText(charSequence8.toString());
                                wordInstance.following(iPreceding);
                                int iPrevious = wordInstance.previous();
                                if (iPrevious <= layoutF3.getLineStart(iMin)) {
                                    iPreceding = iPrevious;
                                } else {
                                    iPreceding = i11;
                                }
                                while (true) {
                                    i11 = iPreceding - 1;
                                    if (!Character.isWhitespace(charSequence8.charAt(i11)) || i11 <= layoutF3.getLineStart(iMin)) {
                                        break;
                                    } else {
                                        iPreceding = i11;
                                    }
                                }
                            }
                            if (layoutF3.getEllipsisCount(iMin) > 0 && iPreceding > (lineStart = layoutF3.getLineStart(iMin) + layoutF3.getEllipsisStart(iMin))) {
                                iPreceding = lineStart;
                            }
                            if (iPreceding < 0) {
                                iPreceding = 0;
                            } else if (iPreceding > charSequence8.length()) {
                                iPreceding = charSequence8.length();
                            }
                            SpannableString spannableString = new SpannableString(charSequence10);
                            if (spannableString.length() > 0) {
                                spannableString.setSpan(new fur(), 0, spannableString.length(), 18);
                                if (fna.v && (charSequence8 instanceof Spanned)) {
                                    Spanned spanned = (Spanned) charSequence8;
                                    if ((TextUtils.equals(charSequence10, charSequence5) || TextUtils.equals(charSequence10, "...")) && (iMin2 = Math.min(Math.max(iPreceding - 1, 0), spanned.length() - 1)) >= 0) {
                                        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(iMin2, iMin2, CharacterStyle.class);
                                        Arrays.sort(characterStyleArr, new fui(spanned, 0));
                                        for (CharacterStyle characterStyle : characterStyleArr) {
                                            if (!(characterStyle instanceof ClickableSpan) && !(characterStyle instanceof fur)) {
                                                spannableString.setSpan(characterStyle, 0, spannableString.length(), spanned.getSpanFlags(characterStyle));
                                            }
                                        }
                                    }
                                }
                            }
                            CharSequence[] charSequenceArr = new CharSequence[2];
                            charSequenceArr[0] = charSequence8.subSequence(0, iPreceding);
                            charSequenceArr[i2] = spannableString;
                            SpannableString spannableString2 = new SpannableString(TextUtils.concat(charSequenceArr));
                            ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannableString2.getSpans(0, spannableString2.length(), ClickableSpan.class);
                            int length = spannableString2.length() - spannableString.length();
                            for (ClickableSpan clickableSpan : clickableSpanArr2) {
                                int spanStart = spannableString2.getSpanStart(clickableSpan);
                                int spanEnd = spannableString2.getSpanEnd(clickableSpan);
                                if (spanStart < length && spanEnd >= length) {
                                    spannableString2.removeSpan(clickableSpan);
                                    if (fna.v) {
                                        spannableString2.setSpan(new fuk(clickableSpan), spanStart, length, 0);
                                    } else {
                                        spannableString2.setSpan(clickableSpan, spanStart, length, 0);
                                    }
                                }
                            }
                            ful.c(spannableString2, spannableString, ForegroundColorSpan.class);
                            ful.c(spannableString2, spannableString, UnderlineSpan.class);
                            ful.c(spannableString2, spannableString, AbsoluteSizeSpan.class);
                            ful.c(spannableString2, spannableString, TypefaceSpan.class);
                            charSequence11 = spannableString2;
                        }
                        layoutF3 = ful.f(fhdVar, View.MeasureSpec.makeMeasureSpec(i24, 1073741824), truncateAt4, z2, i6, f14, f8, f9, i14, charSequence11, colorStateList, i9, i10, f10, i19, typeface, ful.d(i17), fjiVar.m(), fhdVar.a.getResources().getDisplayMetrics().density, i18);
                        charSequence9 = charSequence11;
                    } else {
                        charSequence9 = charSequence8;
                    }
                } else {
                    charSequence9 = charSequence8;
                }
                if (charSequence9 instanceof Spanned) {
                    Spanned spanned2 = (Spanned) charSequence9;
                    ClickableSpan[] clickableSpanArr3 = (ClickableSpan[]) spanned2.getSpans(0, charSequence9.length(), ClickableSpan.class);
                    imageSpanArr = (ImageSpan[]) spanned2.getSpans(0, charSequence9.length(), ImageSpan.class);
                    clickableSpanArr = clickableSpanArr3;
                } else {
                    clickableSpanArr = null;
                    imageSpanArr = null;
                }
                f4 = fValueOf;
                fttVar = fttVar2;
                charSequence13 = charSequence9;
            } else {
                charSequence5 = charSequence4;
                layout3 = layoutF2;
                charSequence6 = charSequence14;
                z2 = z;
                charSequence7 = charSequence3;
                f3 = f2;
                truncateAt4 = truncateAt3;
                layoutF3 = layout2;
            }
            iMin = i4;
            charSequence8 = charSequence6;
            if (fna.O) {
                i5 = -1;
            } else if (layoutF3.getLineCount() > 0) {
                i5 = -1;
                iMin = -1;
            } else {
                i5 = -1;
                iMin = -1;
            }
            if (layout3 != null) {
                i6 = i3;
                if (iMin != i5) {
                    float f15 = f3;
                    f5 = f;
                    int i25 = (int) f5;
                    axh axhVarE2 = ful.e(fjiVar.m());
                    alignment = layout3.getAlignment();
                    zA = axhVarE2.a(charSequence8, 0, charSequence8.length());
                    if (alignment == Layout.Alignment.ALIGN_NORMAL) {
                        i7 = i2;
                    } else {
                        i7 = 0;
                    }
                    i8 = i7 ^ (zA ? 1 : 0);
                    lineWidth = layout3.getLineWidth(layout3.getLineCount() - 1);
                    if (!zA) {
                        lineWidth2 = f5 - lineWidth;
                        if (i8 == 0) {
                            lineWidth2 += f5 - layoutF3.getLineWidth(iMin);
                        }
                    } else if (i8 != 0) {
                        lineWidth2 = lineWidth - (f5 - layoutF3.getLineWidth(iMin));
                    } else {
                        lineWidth2 = lineWidth;
                    }
                    charSequence10 = charSequence7;
                    if (charSequence10 != null) {
                        colorStateList = colorStateList2;
                        i9 = i15;
                        i10 = i16;
                        charSequence11 = charSequence8;
                    } else {
                        colorStateList = colorStateList2;
                        i9 = i15;
                        i10 = i16;
                        charSequence11 = charSequence8;
                    }
                    layoutF3 = ful.f(fhdVar, View.MeasureSpec.makeMeasureSpec(i25, 1073741824), truncateAt4, z2, i6, f15, f8, f9, i14, charSequence11, colorStateList, i9, i10, f10, i19, typeface, ful.d(i17), fjiVar.m(), fhdVar.a.getResources().getDisplayMetrics().density, i18);
                    charSequence9 = charSequence11;
                } else {
                    charSequence9 = charSequence8;
                }
            } else {
                charSequence9 = charSequence8;
            }
            if (charSequence9 instanceof Spanned) {
                Spanned spanned3 = (Spanned) charSequence9;
                ClickableSpan[] clickableSpanArr4 = (ClickableSpan[]) spanned3.getSpans(0, charSequence9.length(), ClickableSpan.class);
                imageSpanArr = (ImageSpan[]) spanned3.getSpans(0, charSequence9.length(), ImageSpan.class);
                clickableSpanArr = clickableSpanArr4;
            } else {
                clickableSpanArr = null;
                imageSpanArr = null;
            }
            f4 = fValueOf;
            fttVar = fttVar2;
            charSequence13 = charSequence9;
        }
        fttVar.h = charSequence13;
        fttVar.i = layoutF3;
        fttVar.j = f4;
        fttVar.a = clickableSpanArr;
        fttVar.c = imageSpanArr;
    }

    @Override // defpackage.fgy
    protected final void ah(fhd fhdVar, fji fjiVar, int i, int i2, fkw fkwVar, fiz fizVar) {
        Layout layoutF;
        Integer numValueOf;
        Float f;
        Integer num;
        Layout layout;
        int iA;
        int iMax;
        int iMax2;
        char c;
        CharSequence charSequence = this.y;
        TextUtils.TruncateAt truncateAt = this.e;
        boolean z = this.x;
        int i3 = this.s;
        float f2 = this.w;
        float f3 = this.u;
        float f4 = this.v;
        int i4 = this.t;
        int i5 = this.r;
        int i6 = this.A;
        CharSequence charSequence2 = this.d;
        float f5 = this.g;
        Typeface typeface = this.D;
        int i7 = this.E;
        int i8 = this.b;
        Path path = ful.d;
        Layout layout2 = null;
        if (TextUtils.isEmpty(charSequence)) {
            fkwVar.a = 0;
            fkwVar.b = 0;
            layout = null;
            num = null;
            numValueOf = null;
            f = null;
            layoutF = null;
        } else {
            boolean z2 = truncateAt == null && i3 != Integer.MAX_VALUE;
            int i9 = z2 ? i3 + 1 : i3;
            int i10 = i7 != 0 ? i7 : 1;
            int i11 = this.B;
            ColorStateList colorStateList = this.z;
            fwl fwlVarM = fjiVar.m();
            Context context = fhdVar.a;
            ColorStateList colorStateList2 = colorStateList;
            CharSequence charSequenceConcat = charSequence2;
            layoutF = ful.f(fhdVar, i, truncateAt, z, i9, f2, f3, f4, i4, charSequence, colorStateList2, i5, i6, f5, i11, typeface, i10, fwlVarM, context.getResources().getDisplayMetrics().density, i8);
            if (z2 && i3 > 0 && layoutF.getLineCount() > i3) {
                layoutF = ful.f(fhdVar, i, truncateAt, z, i3, f2, f3, f4, i4, charSequence.subSequence(0, layoutF.getLineEnd(i3 - 1)), colorStateList2, i5, i6, f5, i11, typeface, i7 != 0 ? i7 : 1, fjiVar.m(), context.getResources().getDisplayMetrics().density, i8);
                colorStateList2 = colorStateList2;
            }
            fkwVar.a = gzj.aU(i, layoutF.getWidth());
            int height = layoutF == null ? 0 : layoutF.getHeight();
            layoutF.getLineCount();
            Float fValueOf = Float.valueOf(layoutF.getPaint().descent());
            if (!TextUtils.isEmpty(charSequenceConcat) && (iA = ful.a(layoutF)) >= 0) {
                if (charSequenceConcat instanceof Spannable) {
                    iMax = 0;
                    for (AbsoluteSizeSpan absoluteSizeSpan : (AbsoluteSizeSpan[]) ((Spannable) charSequenceConcat).getSpans(0, charSequenceConcat.length(), AbsoluteSizeSpan.class)) {
                        iMax = Math.max(absoluteSizeSpan.getSize(), iMax);
                    }
                } else {
                    iMax = 0;
                }
                if (charSequence instanceof Spannable) {
                    int lineStart = layoutF.getLineStart(iA);
                    iMax2 = 0;
                    for (AbsoluteSizeSpan absoluteSizeSpan2 : (AbsoluteSizeSpan[]) ((Spannable) charSequence).getSpans(lineStart, (layoutF.getLineEnd(iA) - lineStart) + 1, AbsoluteSizeSpan.class)) {
                        iMax2 = Math.max(absoluteSizeSpan2.getSize(), iMax2);
                    }
                } else {
                    iMax2 = 0;
                }
                if (iMax > iMax2) {
                    c = 0;
                } else if (charSequenceConcat instanceof Spanned) {
                    c = 0;
                    if (((ReplacementSpan[]) ((Spanned) charSequenceConcat).getSpans(0, charSequenceConcat.length(), ReplacementSpan.class)).length > 0) {
                    }
                }
                if (iA > 0) {
                    CharSequence[] charSequenceArr = new CharSequence[2];
                    charSequenceArr[c] = "1\n";
                    charSequenceArr[1] = charSequenceConcat;
                    charSequenceConcat = TextUtils.concat(charSequenceArr);
                }
                Layout layoutF2 = ful.f(fhdVar, View.MeasureSpec.makeMeasureSpec(layoutF.getWidth(), 1073741824), truncateAt, z, Alert.DURATION_SHOW_INDEFINITELY, f2, f3, f4, i4, charSequenceConcat, colorStateList2, i5, i6, f5, i11, typeface, i7 != 0 ? i7 : 1, fjiVar.m(), context.getResources().getDisplayMetrics().density, i8);
                height += ful.b(layoutF, iA, layoutF2);
                layout2 = layoutF2;
            }
            int iAU = gzj.aU(i2, height);
            fkwVar.b = iAU;
            int i12 = fkwVar.a;
            if (i12 < 0 || iAU < 0) {
                fkwVar.a = Math.max(i12, 0);
                fkwVar.b = Math.max(fkwVar.b, 0);
                gzj.br(2, "Text layout measured to less than 0 pixels");
            }
            Integer numValueOf2 = Integer.valueOf(fkwVar.a);
            numValueOf = Integer.valueOf(fkwVar.b);
            f = fValueOf;
            num = numValueOf2;
            layout = layout2;
        }
        ftt fttVar = (ftt) fizVar;
        fttVar.d = layoutF;
        fttVar.b = layout;
        fttVar.g = num;
        fttVar.e = numValueOf;
        fttVar.f = f;
    }

    @Override // defpackage.fgy
    protected final int aj(int i, int i2, fiz fizVar) {
        CharSequence charSequence = this.y;
        ftt fttVar = (ftt) fizVar;
        CharSequence charSequence2 = fttVar.h;
        Layout layout = fttVar.i;
        ClickableSpan[] clickableSpanArr = fttVar.a;
        Path path = ful.d;
        if (!(charSequence instanceof Spanned)) {
            return Integer.MIN_VALUE;
        }
        Spanned spanned = (Spanned) charSequence;
        for (int i3 = 0; i3 < clickableSpanArr.length; i3++) {
            ClickableSpan clickableSpan = clickableSpanArr[i3];
            int spanStart = spanned.getSpanStart(clickableSpan);
            int spanEnd = spanned.getSpanEnd(clickableSpan);
            if (spanStart >= 0 && spanEnd >= 0) {
                Path path2 = ful.d;
                layout.getSelectionPath(spanStart, spanEnd, path2);
                RectF rectF = ful.f;
                path2.computeBounds(rectF, true);
                if (rectF.contains(i, i2)) {
                    return i3;
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.fgy
    protected final int ak(fiz fizVar) {
        boolean z = this.a;
        ClickableSpan[] clickableSpanArr = ((ftt) fizVar).a;
        Path path = ful.d;
        if (!z || clickableSpanArr == null) {
            return 0;
        }
        return clickableSpanArr.length;
    }

    @Override // defpackage.fgy
    protected final void ao(View view, bbz bbzVar) {
        CharSequence charSequence = this.y;
        Path path = ful.d;
        int i = bac.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        CharSequence charSequenceF = bbzVar.f();
        if (charSequence instanceof Spanned) {
            fwj[] fwjVarArr = (fwj[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), fwj.class);
            if (fwjVarArr.length != 0) {
                new SpannableStringBuilder(charSequence);
                fwj fwjVar = fwjVarArr[0];
                throw null;
            }
        }
        if (charSequenceF != null) {
            charSequence = charSequenceF;
        }
        bbzVar.O(charSequence);
        bbzVar.z(charSequence);
        bbzVar.j(SemanticState.Hidden);
        bbzVar.j(SemanticState.LiveRegion);
        bbzVar.a.setMovementGranularities(11);
        bbzVar.G(true);
    }

    @Override // defpackage.fgy
    protected final void ap(bbz bbzVar, int i, int i2, int i3, fiz fizVar) {
        ftt fttVar = (ftt) fizVar;
        CharSequence charSequence = fttVar.h;
        Layout layout = fttVar.i;
        ClickableSpan[] clickableSpanArr = fttVar.a;
        Path path = ful.d;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            ClickableSpan clickableSpan = clickableSpanArr[i];
            int spanStart = spanned.getSpanStart(clickableSpan);
            int spanEnd = spanned.getSpanEnd(clickableSpan);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineVisibleEnd = lineForOffset == layout.getLineForOffset(spanEnd) ? spanEnd : layout.getLineVisibleEnd(lineForOffset);
            Path path2 = ful.d;
            layout.getSelectionPath(spanStart, lineVisibleEnd, path2);
            RectF rectF = ful.f;
            path2.computeBounds(rectF, true);
            Rect rect = ful.e;
            rect.set(((int) rectF.left) + i2, ((int) rectF.top) + i3, i2 + ((int) rectF.right), i3 + ((int) rectF.bottom));
            if (rect.isEmpty()) {
                rect.set(0, 0, 1, 1);
                bbzVar.q(rect);
                bbzVar.z("");
                return;
            }
            bbzVar.q(rect);
            bbzVar.w(true);
            bbzVar.C(true);
            bbzVar.B(true);
            bbzVar.R(true);
            if (clickableSpan instanceof frp) {
                frp frpVar = (frp) clickableSpan;
                if (frpVar.a()) {
                    bbzVar.j(16);
                }
                if (frpVar.b()) {
                    bbzVar.j(32);
                }
            }
            bbzVar.O(spanned.subSequence(spanStart, spanEnd));
            if (!(clickableSpan instanceof fwi)) {
                bbzVar.v("android.widget.Button");
            } else {
                String str = ((fwi) clickableSpan).a;
                bbzVar.v("android.widget.Button");
            }
        }
    }

    @Override // defpackage.fgy
    protected final void ar(fhd fhdVar, Object obj) {
        Object obj2;
        ftx ftxVar = (ftx) obj;
        CharSequence charSequence = this.y;
        Path path = ful.d;
        ftxVar.a = null;
        ftxVar.c = 0.0f;
        ftxVar.f = null;
        ftxVar.e = false;
        ftxVar.i = 0;
        ftxVar.k = null;
        ftxVar.g = null;
        ftxVar.h = 0;
        ftxVar.o = 0;
        heg hegVar = ftxVar.p;
        if (hegVar != null && (obj2 = hegVar.a) != null) {
            int i = 0;
            while (true) {
                mrr[] mrrVarArr = (mrr[]) obj2;
                if (i >= mrrVarArr.length) {
                    break;
                }
                mrrVarArr[i].c();
                i++;
            }
            hegVar.a = null;
        }
        ftxVar.p = null;
        ImageSpan[] imageSpanArr = ftxVar.j;
        if (imageSpanArr != null) {
            for (int i2 = 0; i2 < imageSpanArr.length; i2++) {
                Drawable drawable = ftxVar.j[i2].getDrawable();
                drawable.setCallback(null);
                drawable.setVisible(false, false);
            }
            ftxVar.j = null;
        }
        if (charSequence instanceof frq) {
            ((frq) charSequence).b();
        }
    }

    @Override // defpackage.fgy
    public final boolean g(fgy fgyVar) {
        int i;
        CharSequence charSequence;
        TextUtils.TruncateAt truncateAt;
        CharSequence charSequence2;
        ColorStateList colorStateList;
        heg hegVar;
        Typeface typeface;
        if (this == fgyVar) {
            return true;
        }
        if (fgyVar != null && getClass() == fgyVar.getClass()) {
            ftu ftuVar = (ftu) fgyVar;
            if (this.a == ftuVar.a && ((i = this.E) == 0 ? ftuVar.E == 0 : i == ftuVar.E) && this.b == ftuVar.b && this.c == ftuVar.c && ((charSequence = this.d) == null ? ftuVar.d == null : charSequence.equals(ftuVar.d)) && ((truncateAt = this.e) == null ? ftuVar.e == null : truncateAt.equals(ftuVar.e)) && this.f == ftuVar.f && Float.compare(this.g, ftuVar.g) == 0 && this.q == ftuVar.q && this.r == ftuVar.r && this.s == ftuVar.s && this.t == ftuVar.t && Float.compare(this.u, ftuVar.u) == 0 && Float.compare(this.v, ftuVar.v) == 0 && Float.compare(this.w, ftuVar.w) == 0 && this.x == ftuVar.x && ((charSequence2 = this.y) == null ? ftuVar.y == null : charSequence2.equals(ftuVar.y)) && ((colorStateList = this.z) == null ? ftuVar.z == null : colorStateList.equals(ftuVar.z)) && ((hegVar = this.G) == null ? ftuVar.G == null : hegVar.equals(ftuVar.G)) && this.A == ftuVar.A && this.B == ftuVar.B && this.C == ftuVar.C && ((typeface = this.D) == null ? ftuVar.D == null : typeface.equals(ftuVar.D))) {
                if (this.F != 0) {
                    if (ftuVar.F == 1) {
                        return true;
                    }
                } else if (ftuVar.F == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.fgy
    protected final int h() {
        return 30;
    }

    @Override // defpackage.fgy
    public final /* bridge */ /* synthetic */ fgy l() {
        return (ftu) super.l();
    }

    @Override // defpackage.fgy
    protected final /* synthetic */ fiz r() {
        return new ftt();
    }
}
