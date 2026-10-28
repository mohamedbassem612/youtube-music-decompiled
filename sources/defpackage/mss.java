package defpackage;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.util.TypedValue;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mss {
    public static final /* synthetic */ int b = 0;
    private static final String[] c = {" "};
    private static final CharSequence[] d = {" "};
    static final nso a = nxy.a;

    public static StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, mxc mxcVar) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
        e(builderObtain, mxcVar, alignment);
        return builderObtain.build();
    }

    public static TextPaint b(CharSequence charSequence, Resources resources, CharSequence charSequence2) {
        TextPaint textPaint = new TextPaint(1);
        int i = msf.a;
        textPaint.setTextSize(msf.c(charSequence2, msf.c(charSequence, rpi.p(TypedValue.applyDimension(2, 14.0f, resources.getDisplayMetrics())))));
        Typeface typefaceN = Typeface.DEFAULT;
        int iA = msf.a(resources);
        if (iA > 0) {
            typefaceN = iA == 300 ? Typeface.DEFAULT_BOLD : afxw.n(resources, Typeface.DEFAULT);
        }
        textPaint.setTypeface(typefaceN);
        return textPaint;
    }

    public static mxg c(mxc mxcVar) {
        for (int i = 0; i < mxcVar.m(); i++) {
            mxy mxyVarT = mxcVar.t(i);
            if (mxyVarT.u()) {
                mxg mxgVarO = mxyVarT.o();
                if (mxgVarO.l()) {
                    mxj mxjVarI = mxgVarO.i();
                    int iBZ = mxjVarI.bZ();
                    if (iBZ <= mxjVarI.bY() || iBZ > 0) {
                        return mxgVarO;
                    }
                } else if (mxgVarO.k()) {
                    if (mxgVarO.h().h() > 0) {
                        return mxgVarO;
                    }
                } else if (mxgVarO.j()) {
                    mxh mxhVarG = mxgVarO.g();
                    if (mxhVarG.j() == mxhVarG.h() && mxhVarG.j() > 0) {
                        return mxgVarO;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    public static CharSequence d(int i, StaticLayout staticLayout, CharSequence charSequence, CharSequence charSequence2, TextPaint textPaint, mxc mxcVar, Layout.Alignment alignment) {
        int lineCount = staticLayout.getLineCount();
        if (i <= 0 || lineCount <= i || charSequence.length() <= 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString(charSequence2);
        if (spannableString.length() > 0) {
            spannableString.setSpan(new fur(), 0, spannableString.length(), 18);
        }
        CharSequence charSequenceReplace = spannableString;
        while (TextUtils.indexOf(charSequenceReplace, " ") >= 0) {
            charSequenceReplace = TextUtils.replace(charSequenceReplace, c, d);
        }
        if (i == 1 && mxcVar.z()) {
            int iE = mxcVar.E() - 1;
            if (iE == 3) {
                int length = charSequence.length();
                int lineStart = staticLayout.getLineStart(lineCount - 2);
                return new SpannableString(TextUtils.concat(charSequenceReplace, charSequence.subSequence(i((lineStart + length) / 2, lineStart, length, charSequence, charSequenceReplace, textPaint, staticLayout.getWidth(), mxcVar, alignment), length)));
            }
            if (iE == 5) {
                int iMin = Math.min(charSequence.subSequence(0, staticLayout.getLineEnd(1)).length(), charSequence.subSequence(staticLayout.getLineStart(lineCount - 2), charSequence.length()).length());
                int iJ = j(iMin / 2, 0, iMin, charSequence, charSequenceReplace, textPaint, staticLayout.getWidth(), mxcVar, alignment);
                return new SpannableString(TextUtils.concat(charSequence.subSequence(0, iJ), charSequenceReplace, charSequence.subSequence(charSequence.length() - iJ, charSequence.length())));
            }
        }
        int lineEnd = staticLayout.getLineEnd(lineCount > i ? i : i - 1);
        int lineStart2 = staticLayout.getLineStart(i - 1);
        CharSequence charSequenceSubSequence = charSequence.subSequence(0, h((lineStart2 + lineEnd) / 2, lineStart2, lineEnd, charSequence, charSequenceReplace, textPaint, staticLayout.getWidth(), mxcVar, alignment, i));
        while (charSequenceSubSequence.length() > 0 && Character.isWhitespace(charSequenceSubSequence.charAt(charSequenceSubSequence.length() - 1)) && charSequenceSubSequence.length() - 1 > lineStart2) {
            charSequenceSubSequence = charSequenceSubSequence.subSequence(0, charSequenceSubSequence.length() - 1);
        }
        SpannableString spannableString2 = new SpannableString(TextUtils.concat(charSequenceSubSequence, charSequenceReplace));
        msf.b(spannableString2, charSequenceReplace, ClickableSpan.class);
        msf.b(spannableString2, charSequenceReplace, ForegroundColorSpan.class);
        msf.b(spannableString2, charSequenceReplace, AbsoluteSizeSpan.class);
        msf.b(spannableString2, charSequenceReplace, UnderlineSpan.class);
        return spannableString2;
    }

    static void e(StaticLayout.Builder builder, mxc mxcVar, Layout.Alignment alignment) {
        if (Build.VERSION.SDK_INT >= 28) {
            builder.setUseLineSpacingFromFallbacks(true);
        }
        builder.setAlignment(alignment).setEllipsize(null);
        if (mxcVar.B()) {
            builder.setLineSpacing(mxcVar.g(), 1.0f);
        }
        if (mxcVar.x()) {
            builder.setIncludePad(mxcVar.v());
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    static void f(Resources resources, mry mryVar, CharSequence charSequence, ner nerVar, float f, float f2, float f3, Integer num, boolean z, Boolean bool, fwl fwlVar) {
        axh axhVar;
        mryVar.setTextColor(-16777216);
        mryVar.setText(charSequence);
        int i = 0;
        mryVar.setShadowLayer(f, f2, f3, num == null ? 0 : num.intValue());
        Typeface typefaceN = Typeface.DEFAULT;
        int iA = msf.a(resources);
        if (iA > 0) {
            typefaceN = iA == 300 ? Typeface.DEFAULT_BOLD : afxw.n(resources, Typeface.DEFAULT);
        }
        mryVar.setTypeface(typefaceN);
        mryVar.setTextSize(0, msf.d(charSequence, resources));
        if (Build.VERSION.SDK_INT >= 29) {
            mryVar.setBreakStrategy(1);
        }
        if (nerVar.m()) {
            mxc mxcVarI = nerVar.i();
            if (mxcVarI.C()) {
                int iF = mxcVarI.F() - 1;
                if (iF == 1) {
                    i = 3;
                } else if (iF == 2) {
                    i = 4;
                }
                if (i == 0) {
                    if (fwlVar == fwl.RTL) {
                        i = 7;
                    } else {
                        i = 1;
                    }
                }
            } else if (fwlVar == fwl.RTL) {
                i = 7;
            } else {
                i = 1;
            }
            mryVar.setTextDirection(i);
            if (i == 4) {
                axhVar = axn.b;
            } else if (i == 3) {
                axhVar = axn.a;
            } else {
                axhVar = fwlVar == fwl.RTL ? axn.d : axn.c;
            }
            mryVar.setTextAlignment(qnl.bJ(qnl.bK(mxcVarI), axhVar, mryVar.getText(), fwlVar));
            if (mxcVarI.g() != 0.0f) {
                mryVar.setLineSpacing(mxcVarI.g(), 1.0f);
            }
            mryVar.setIncludeFontPadding(mxcVarI.v());
        }
        if (bool != null) {
            mryVar.setClipToOutline(bool.booleanValue());
        }
        if (nerVar.g() > 0) {
            mryVar.setHighlightColor(nerVar.g());
        } else {
            mryVar.setHighlightColor(436207616);
        }
        boolean zK = nerVar.k();
        mryVar.e = zK;
        mryVar.setTextIsSelectable(zK);
        if (zK) {
            mryVar.setCustomSelectionActionModeCallback(new mfq(mryVar));
        }
        mryVar.setFocusableInTouchMode(true);
        mryVar.setEllipsize(null);
        int i2 = msj.a;
        mryVar.setMovementMethod(msi.a);
        if (z) {
            bac.p(mryVar, new msb(mryVar));
        }
        mryVar.setSpannableFactory(mry.a);
        mryVar.setEditableFactory(mry.b);
    }

    public static CharSequence g(CharSequence charSequence, CharSequence charSequence2, mxc mxcVar, int i, int i2, Layout.Alignment alignment, StaticLayout staticLayout, TextPaint textPaint, fhd fhdVar, nry nryVar, nxl nxlVar, nuc nucVar, nsl nslVar, Map map, nte nteVar, omj omjVar, boolean z, boolean z2, boolean z3, boolean z4, mxg mxgVar) {
        CharSequence charSequence3;
        StaticLayout staticLayoutA;
        TextPaint textPaintB;
        int i3;
        if (mxgVar.j()) {
            mxh mxhVarG = mxgVar.g();
            charSequence3 = charSequence2;
            staticLayoutA = staticLayout;
            textPaintB = textPaint;
            int i4 = 0;
            while (i4 < mxhVarG.j()) {
                int i5 = mxhVarG.i(i4);
                mxh mxhVar = mxhVarG;
                int i6 = i4;
                CharSequence charSequenceI = msf.i(nslVar, fhdVar.a, mxcVar, nryVar, nxlVar, nucVar, map, nteVar, omjVar, z, z2, z3, z4, mxhVarG.g(i4));
                textPaintB = b(charSequenceI, fhdVar.c(), charSequence);
                staticLayoutA = a(charSequenceI, textPaintB, i2, alignment, mxcVar);
                if (staticLayoutA.getLineCount() <= i5) {
                    return charSequenceI;
                }
                i4 = i6 + 1;
                charSequence3 = charSequenceI;
                mxhVarG = mxhVar;
            }
        } else {
            charSequence3 = charSequence2;
            staticLayoutA = staticLayout;
            textPaintB = textPaint;
        }
        mxc mxcVar2 = mxcVar;
        Layout.Alignment alignment2 = alignment;
        if (i <= 0 || staticLayoutA.getLineCount() <= (i3 = i)) {
            return charSequence3;
        }
        if (mxgVar.k()) {
            mxi mxiVarH = mxgVar.h();
            int i7 = 0;
            while (i7 < mxiVarH.h()) {
                mxi mxiVar = mxiVarH;
                mxc mxcVar3 = mxcVar2;
                int i8 = i7;
                CharSequence charSequenceI2 = msf.i(nslVar, fhdVar.a, mxcVar3, nryVar, nxlVar, nucVar, map, nteVar, omjVar, z, z2, z3, z4, mxiVarH.g(i7));
                mxcVar2 = mxcVar3;
                textPaintB = b(charSequenceI2, fhdVar.c(), charSequence);
                alignment2 = alignment;
                staticLayoutA = a(charSequenceI2, textPaintB, i2, alignment2, mxcVar2);
                i3 = i;
                if (staticLayoutA.getLineCount() <= i3) {
                    return charSequenceI2;
                }
                i7 = i8 + 1;
                charSequence3 = charSequenceI2;
                mxiVarH = mxiVar;
            }
        } else if (mxgVar.l()) {
            mxj mxjVarI = mxgVar.i();
            int iBY = mxjVarI.bY();
            while (iBY >= mxjVarI.bZ()) {
                mxc mxcVar4 = mxcVar2;
                CharSequence charSequenceI3 = msf.i(nslVar, fhdVar.a, mxcVar4, nryVar, nxlVar, nucVar, map, nteVar, omjVar, z, z2, z3, z4, iBY);
                mxcVar2 = mxcVar4;
                textPaintB = b(charSequenceI3, fhdVar.c(), charSequence);
                alignment2 = alignment;
                staticLayoutA = a(charSequenceI3, textPaintB, i2, alignment2, mxcVar2);
                i3 = i;
                if (staticLayoutA.getLineCount() <= i3) {
                    return charSequenceI3;
                }
                iBY--;
                charSequence3 = charSequenceI3;
            }
        }
        return d(i3, staticLayoutA, charSequence3, charSequence, textPaintB, mxcVar2, alignment2);
    }

    private static int h(int i, int i2, int i3, CharSequence charSequence, CharSequence charSequence2, TextPaint textPaint, int i4, mxc mxcVar, Layout.Alignment alignment, int i5) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(0, i);
        if (charSequenceSubSequence.length() == 0) {
            return i;
        }
        StaticLayout staticLayoutA = a(TextUtils.concat(charSequenceSubSequence, charSequence2), textPaint, i4, alignment, mxcVar);
        if (i == i2 || i == i3) {
            return staticLayoutA.getLineCount() <= i5 ? i : i2;
        }
        return staticLayoutA.getLineCount() > i5 ? h((i2 + i) / 2, i2, i, charSequence, charSequence2, textPaint, i4, mxcVar, alignment, i5) : h((i3 + i) / 2, i, i3, charSequence, charSequence2, textPaint, i4, mxcVar, alignment, i5);
    }

    private static int i(int i, int i2, int i3, CharSequence charSequence, CharSequence charSequence2, TextPaint textPaint, int i4, mxc mxcVar, Layout.Alignment alignment) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i, charSequence.length());
        if (charSequenceSubSequence.length() == 0) {
            return i;
        }
        StaticLayout staticLayoutA = a(TextUtils.concat(charSequenceSubSequence, charSequence2), textPaint, i4, alignment, mxcVar);
        if (i == i2 || i == i3) {
            return staticLayoutA.getLineCount() <= 1 ? i : i3;
        }
        return staticLayoutA.getLineCount() > 1 ? i((i3 + i) / 2, i, i3, charSequence, charSequence2, textPaint, i4, mxcVar, alignment) : i((i2 + i) / 2, i2, i, charSequence, charSequence2, textPaint, i4, mxcVar, alignment);
    }

    private static int j(int i, int i2, int i3, CharSequence charSequence, CharSequence charSequence2, TextPaint textPaint, int i4, mxc mxcVar, Layout.Alignment alignment) {
        if (i <= 1) {
            return i;
        }
        StaticLayout staticLayoutA = a(TextUtils.concat(charSequence.subSequence(0, i), charSequence2, charSequence.subSequence(charSequence.length() - i, charSequence.length())), textPaint, i4, alignment, mxcVar);
        if (i == i2 || i == i3) {
            return staticLayoutA.getLineCount() <= 1 ? i : i2;
        }
        return staticLayoutA.getLineCount() > 1 ? j((i + i2) >> 1, i2, i, charSequence, charSequence2, textPaint, i4, mxcVar, alignment) : j((i + i3) / 2, i, i3, charSequence, charSequence2, textPaint, i4, mxcVar, alignment);
    }
}
