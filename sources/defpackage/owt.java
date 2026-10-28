package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BulletSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.jni.UnsafeMemory;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.uibuilder.DimensionUnitConverter;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class owt {
    public static final /* synthetic */ int c = 0;
    static final Layout.Alignment a = r("ALIGN_LEFT", Layout.Alignment.ALIGN_NORMAL);
    static final Layout.Alignment b = r("ALIGN_RIGHT", Layout.Alignment.ALIGN_OPPOSITE);
    private static final String[] d = {" "};
    private static final CharSequence[] e = {" "};
    private static final Map f = new HashMap();
    private static final Map g = new HashMap();

    public static int a(int i, Layout layout, CharSequence charSequence, TextPaint textPaint, boolean z, Locale locale) {
        CharSequence text = layout.getText();
        float width = layout.getWidth();
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        float desiredWidth = Layout.getDesiredWidth(charSequence, textPaint);
        int i2 = 0;
        int iMax = Math.max(0, layout.getOffsetForHorizontal(i, layout.getParagraphDirection(i) == -1 ? desiredWidth : width - desiredWidth));
        if ((lineEnd <= 0 || text.charAt(lineEnd - 1) != '\n') && (lineEnd = TextUtils.indexOf(text, '\n', lineEnd)) == -1) {
            lineEnd = text.length();
        }
        BreakIterator wordInstance = z ? BreakIterator.getWordInstance(locale) : BreakIterator.getCharacterInstance(locale);
        wordInstance.setText(text.toString());
        if (!wordInstance.isBoundary(iMax)) {
            iMax = wordInstance.preceding(iMax);
        }
        int iMax2 = Math.max(lineStart, Math.min(iMax, lineEnd));
        if (StaticLayout.getDesiredWidth(text, lineStart, iMax2, textPaint) + desiredWidth > width) {
            lineEnd = iMax2;
            iMax2 = lineStart;
        }
        int[] iArrN = rpi.n(wordInstance, iMax2, lineEnd);
        int length = iArrN.length - 1;
        while (i2 <= length) {
            int i3 = (i2 + length) / 2;
            int i4 = iArrN[i3];
            if (StaticLayout.getDesiredWidth(text, lineStart, i4, textPaint) + desiredWidth <= width) {
                i2 = i3 + 1;
                iMax2 = i4;
            } else {
                length = i3 - 1;
            }
        }
        if (z && iMax2 == lineStart) {
            return a(i, layout, charSequence, textPaint, false, locale);
        }
        while (iMax2 > lineStart) {
            int i5 = iMax2 - 1;
            if (!Character.isWhitespace(text.charAt(i5))) {
                break;
            }
            iMax2 = i5;
        }
        return iMax2;
    }

    public static int b(DisplayMetrics displayMetrics) {
        return Math.round(TypedValue.applyDimension(2, 14.0f, displayMetrics));
    }

    public static int c(Resources resources) {
        int i;
        if (Build.VERSION.SDK_INT < 31 || (i = resources.getConfiguration().fontWeightAdjustment) == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0135  */
    static CharSequence d(int i, Layout layout, CharSequence charSequence, boolean z) {
        boolean z2 = true;
        SpannableString spannableString = new SpannableString(TextUtils.concat(layout.getText().subSequence(0, Math.max(i, 0)), charSequence));
        if (Memory.peekByte(FlagServices.b().c + 35) != 0) {
            if (!TextUtils.equals(charSequence, "…") && !TextUtils.equals(charSequence, "...")) {
                z2 = false;
            }
            if (!z || z2) {
                CharSequence text = layout.getText();
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    int length = spannableString.length() - charSequence.length();
                    int iMin = Math.min(Math.max(i - 1, 0), spanned.length() - 1);
                    if (iMin >= 0 && length >= 0) {
                        CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(iMin, iMin, CharacterStyle.class);
                        s(characterStyleArr, spanned);
                        for (CharacterStyle characterStyle : characterStyleArr) {
                            if (!(characterStyle instanceof oyb) && !(characterStyle instanceof ClickableSpan)) {
                                int spanStart = spannableString.getSpanStart(characterStyle);
                                if (spanStart >= 0) {
                                    spannableString.setSpan(characterStyle, spanStart, spannableString.length(), spannableString.getSpanFlags(characterStyle));
                                } else {
                                    spannableString.setSpan(characterStyle, length, spannableString.length(), spanned.getSpanFlags(characterStyle));
                                }
                            }
                        }
                    }
                }
            }
            g(spannableString, charSequence, ClickableSpan.class);
            g(spannableString, charSequence, ForegroundColorSpan.class);
            g(spannableString, charSequence, AbsoluteSizeSpan.class);
            g(spannableString, charSequence, UnderlineSpan.class);
            return spannableString;
        }
        if (z) {
            g(spannableString, charSequence, ClickableSpan.class);
            g(spannableString, charSequence, ForegroundColorSpan.class);
            g(spannableString, charSequence, AbsoluteSizeSpan.class);
            g(spannableString, charSequence, UnderlineSpan.class);
        } else {
            CharSequence text2 = layout.getText();
            if (text2 instanceof Spanned) {
                Spanned spanned2 = (Spanned) text2;
                int length2 = spannableString.length() - charSequence.length();
                int iMin2 = Math.min(Math.max(i, 0), spanned2.length() - 1);
                int iMin3 = Math.min(Math.max(i + 1, 0), spanned2.length() - 1);
                if (iMin2 >= 0 && length2 >= 0) {
                    HashSet<CharacterStyle> hashSet = new HashSet();
                    Collections.addAll(hashSet, (CharacterStyle[]) spanned2.getSpans(iMin2, iMin2, CharacterStyle.class));
                    Collections.addAll(hashSet, (CharacterStyle[]) spanned2.getSpans(iMin3, iMin3, CharacterStyle.class));
                    for (CharacterStyle characterStyle2 : hashSet) {
                        if (!(characterStyle2 instanceof oyb)) {
                            int spanStart2 = spannableString.getSpanStart(characterStyle2);
                            if (spanStart2 >= 0) {
                                spannableString.setSpan(characterStyle2, spanStart2, spannableString.length(), spannableString.getSpanFlags(characterStyle2));
                            } else {
                                spannableString.setSpan(characterStyle2, length2, spannableString.length(), spanned2.getSpanFlags(characterStyle2));
                            }
                        }
                    }
                }
            } else {
                g(spannableString, charSequence, ClickableSpan.class);
                g(spannableString, charSequence, ForegroundColorSpan.class);
                g(spannableString, charSequence, AbsoluteSizeSpan.class);
                g(spannableString, charSequence, UnderlineSpan.class);
            }
        }
        return spannableString;
    }

    public static CharSequence e(int i, Layout layout, CharSequence charSequence, boolean z, TextPaint textPaint, boolean z2, Locale locale, boolean z3, boolean z4) {
        SpannableString spannableString;
        SpannableString spannableString2;
        SpannableString spannableString3;
        SpannableString spannableString4 = new SpannableString(charSequence);
        boolean z5 = false;
        if (spannableString4.length() > 0) {
            spannableString4.setSpan(new oyb(z), 0, spannableString4.length(), 18);
        }
        while (true) {
            spannableString = spannableString4;
            if (TextUtils.indexOf((CharSequence) spannableString, ' ', 0, spannableString.length()) < 0) {
                break;
            }
            spannableString4 = new SpannableString(TextUtils.replace(spannableString, d, e));
        }
        int i2 = i - 1;
        if (z3) {
            int iA = a(i2, layout, spannableString, textPaint, z2, locale);
            if (!z) {
                float desiredWidth = Layout.getDesiredWidth(spannableString, textPaint);
                spannableString3 = new SpannableString(spannableString);
                t(spannableString3, layout, iA);
                if (Layout.getDesiredWidth(spannableString3, textPaint) > desiredWidth + 0.5f) {
                    iA = a(i2, layout, spannableString3, textPaint, z2, locale);
                }
                return d(iA, layout, spannableString3, z5);
            }
            z5 = true;
            spannableString3 = spannableString;
            return d(iA, layout, spannableString3, z5);
        }
        float desiredWidth2 = Layout.getDesiredWidth(spannableString, textPaint);
        float width = z4 ? desiredWidth2 : layout.getWidth() - desiredWidth2;
        int i3 = rpi.i(i, layout, width, layout.getOffsetForHorizontal(i2, width));
        if (!z) {
            SpannableString spannableString5 = new SpannableString(spannableString);
            t(spannableString5, layout, i3);
            float desiredWidth3 = Layout.getDesiredWidth(spannableString5, textPaint);
            if (desiredWidth3 > desiredWidth2 + 0.5f) {
                if (!z4) {
                    desiredWidth3 = layout.getWidth() - desiredWidth3;
                }
                i3 = rpi.i(i, layout, desiredWidth3, layout.getOffsetForHorizontal(i2, desiredWidth3));
                spannableString2 = spannableString5;
            }
            return d(i3, layout, spannableString2, z5);
        }
        z5 = true;
        spannableString2 = spannableString;
        return d(i3, layout, spannableString2, z5);
    }

    public static void f(TextPaint textPaint, CharSequence charSequence, Resources resources) {
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int iP = rpi.p(TypedValue.applyDimension(2, 14.0f, displayMetrics));
        if (charSequence instanceof Spannable) {
            for (AbsoluteSizeSpan absoluteSizeSpan : (AbsoluteSizeSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), AbsoluteSizeSpan.class)) {
                iP = Math.min(absoluteSizeSpan.getDip() ? rpi.p(TypedValue.applyDimension(1, absoluteSizeSpan.getSize(), displayMetrics)) : absoluteSizeSpan.getSize(), iP);
            }
        }
        textPaint.setTextSize(iP);
        if (c(resources) > 0) {
            Typeface typeface = textPaint.getTypeface();
            if (typeface == null) {
                typeface = Typeface.DEFAULT;
            }
            textPaint.setTypeface(afxw.n(resources, typeface));
        }
    }

    public static void g(SpannableString spannableString, CharSequence charSequence, Class cls) {
        Object[] spans = spannableString.getSpans(0, spannableString.length(), cls);
        int length = spannableString.length() - charSequence.length();
        for (Object obj : spans) {
            int spanStart = spannableString.getSpanStart(obj);
            int spanEnd = spannableString.getSpanEnd(obj);
            if (Memory.peekByte(FlagServices.b().c + 35) != 0) {
                if (spanStart < length && spanEnd >= length) {
                    if (cls == ClickableSpan.class) {
                        spannableString.removeSpan(obj);
                        ClickableSpan clickableSpan = (ClickableSpan) obj;
                        if (clickableSpan != null) {
                            spannableString.setSpan(new ows(clickableSpan), spanStart, length, 33);
                        }
                    } else if (spanStart > 0) {
                        spannableString.removeSpan(obj);
                        spannableString.setSpan(obj, spanStart, length, 33);
                    }
                }
            } else if ((cls == ClickableSpan.class || spanStart > 0) && spanStart < length && spanEnd >= length) {
                spannableString.removeSpan(obj);
                spannableString.setSpan(obj, spanStart, length, 0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    /* JADX WARN: Code duplicated, block: B:18:0x002c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0030 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0039 A[DONT_INVERT] */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r6 == r8) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        if (r6 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
    
        if (r6 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        return android.text.Layout.Alignment.ALIGN_NORMAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        return android.text.Layout.Alignment.ALIGN_OPPOSITE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r8 == 1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.Layout.Alignment h(int r5, java.lang.CharSequence r6, android.text.TextDirectionHeuristic r7, int r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            int r5 = r5 + (-1)
            r1 = 28
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 < r1) goto L1c
            if (r5 == r4) goto L19
            if (r5 == r3) goto L16
            if (r5 == r2) goto L33
            r0 = 5
            if (r5 != r0) goto L1c
            if (r8 != r4) goto L19
        L16:
            android.text.Layout$Alignment r5 = defpackage.owt.b
            goto L40
        L19:
            android.text.Layout$Alignment r5 = defpackage.owt.a
            goto L40
        L1c:
            r0 = 0
            if (r8 == r4) goto L21
            r8 = r0
            goto L22
        L21:
            r8 = r4
        L22:
            int r1 = r6.length()
            boolean r6 = r7.isRtl(r6, r0, r1)
            if (r5 == r4) goto L39
            if (r5 == r3) goto L36
            if (r5 == r2) goto L33
            if (r6 != r8) goto L3b
            goto L3e
        L33:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L40
        L36:
            if (r6 == 0) goto L3b
            goto L3e
        L39:
            if (r6 == 0) goto L3e
        L3b:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L40
        L3e:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
        L40:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.owt.h(int, java.lang.CharSequence, android.text.TextDirectionHeuristic, int):android.text.Layout$Alignment");
    }

    public static TextUtils.TruncateAt i(int i) {
        int i2 = i - 1;
        if (i2 == 3) {
            return TextUtils.TruncateAt.START;
        }
        if (i2 != 5) {
            return i2 != 6 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.MARQUEE;
        }
        return TextUtils.TruncateAt.MIDDLE;
    }

    public static Layout j(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, TextDirectionHeuristic textDirectionHeuristic, asxe asxeVar, ElementsServices elementsServices) {
        StaticLayout.Builder textDirection = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setAlignment(alignment).setTextDirection(textDirectionHeuristic);
        if (asxeVar != null) {
            textDirection.setIncludePad((Memory.peekByte(asxeVar.c + 8) & 16) == 0 || Memory.peekByte(asxeVar.c + 10) != 0);
        }
        l(textDirection, asxeVar, elementsServices);
        return textDirection.build();
    }

    public static TextDirectionHeuristic k(asxe asxeVar, int i, CharSequence charSequence) {
        int i2;
        int i3 = 2;
        if ((Memory.peekByte(asxeVar.c + 9) & 1) != 0) {
            int iPeekInt = Memory.peekInt(asxeVar.c + (true != asxe.a ? 60L : 28L), false);
            if (iPeekInt == 0) {
                i2 = 1;
            } else if (iPeekInt != 1) {
                i2 = iPeekInt != 2 ? 0 : 3;
            } else {
                i2 = 2;
            }
            if (i2 == 0) {
                i2 = 1;
            }
            int i4 = i2 - 1;
            if (i4 != 1) {
                i3 = i4 != 2 ? 0 : 4;
            } else {
                i3 = 3;
            }
        } else if (i == 1) {
            i = 1;
        } else {
            i3 = 1;
        }
        TextDirectionHeuristic textDirectionHeuristicM = rpi.m(i3, i);
        if (Build.VERSION.SDK_INT >= 28 || (Memory.peekByte(asxeVar.c + 9) & 1) != 0) {
            return textDirectionHeuristicM;
        }
        return textDirectionHeuristicM.isRtl(charSequence, 0, charSequence.length()) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }

    public static void l(StaticLayout.Builder builder, asxe asxeVar, ElementsServices elementsServices) {
        if (asxeVar == null || (Memory.peekByte(asxeVar.c + 8) & 2) == 0) {
            return;
        }
        builder.setLineSpacing(Float.intBitsToFloat(Memory.peekInt(asxeVar.c + 12, false)) * elementsServices.a(), 1.0f);
    }

    public static CharSequence m(asxe asxeVar) {
        if (asxeVar != null) {
            String strBi = asxeVar.bi();
            if (!TextUtils.isEmpty(strBi)) {
                return strBi;
            }
        }
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a1 A[Catch: all -> 0x0118, TryCatch #3 {, blocks: (B:42:0x0099, B:44:0x00a1, B:46:0x00b3), top: B:70:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static Typeface n(final Context context, Resources resources, final String str, aszd aszdVar, final nxl nxlVar, oui ouiVar) {
        int iO;
        final int iO2;
        final boolean z;
        owq owqVar;
        Map map;
        FutureTask futureTask;
        FutureTask futureTask2;
        boolean z2 = aszd.a;
        long j = aszdVar.c + ((long) (true != z2 ? 76 : 56));
        long j2 = 1 + j;
        byte bPeekByte = Memory.peekByte(j);
        byte bPeekByte2 = Memory.peekByte(j2);
        boolean z3 = UnsafeMemory.a;
        byte b2 = true != z3 ? bPeekByte2 : bPeekByte;
        if (true == z3) {
            bPeekByte = bPeekByte2;
        }
        if (((short) ((b2 << 8) | (bPeekByte & 255))) == 7) {
            byte bPeekByte3 = Memory.peekByte(j);
            byte bPeekByte4 = Memory.peekByte(j2);
            byte b3 = true != z3 ? bPeekByte4 : bPeekByte3;
            if (true == z3) {
                bPeekByte3 = bPeekByte4;
            }
            if (((short) ((b3 << 8) | (bPeekByte3 & 255))) == 7) {
                iO = Memory.peekInt(aszdVar.c + (true != z2 ? 80L : 60L), false);
            } else {
                iO = 0;
            }
            iO2 = rpi.o(resources, iO);
            if (Memory.peekByte(aszdVar.c + 11) != 0) {
                z = true;
            } else {
                z = false;
            }
            owqVar = new owq(str, iO2, z);
            map = g;
            synchronized (map) {
                futureTask = (FutureTask) map.get(owqVar);
                if (futureTask == null) {
                    futureTask2 = new FutureTask(new Callable() { // from class: owp
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int i = owt.c;
                            nxl nxlVar2 = nxlVar;
                            Context context2 = context;
                            String str2 = str;
                            int i2 = iO2;
                            boolean z4 = z;
                            Typeface typefaceB = nxlVar2.b(context2, str2, i2, z4);
                            return typefaceB == null ? rpi.q(str2, i2, z4) : typefaceB;
                        }
                    });
                    map.put(owqVar, futureTask2);
                } else {
                    futureTask2 = futureTask;
                }
            }
            futureTask2.run();
            try {
                return (Typeface) futureTask2.get();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                ouiVar.c(aslh.LOG_TYPE_INTERNAL_ERROR, "Font fetching future task interrupted: " + str + '/' + iO2 + '/' + z, e2);
                return null;
            } catch (ExecutionException e3) {
                Map map2 = g;
                synchronized (map2) {
                    j$.util.Map.EL.remove(map2, owqVar, futureTask2);
                    ouiVar.c(aslh.LOG_TYPE_INTERNAL_ERROR, "Font fetching future task failed: " + str + '/' + iO2 + '/' + z, e3);
                    return null;
                }
            }
        }
        if (aszdVar.cl()) {
            int iBi = a.bi(Memory.peekInt(aszdVar.c + (true != z2 ? 80L : 60L), false));
            if (iBi == 0) {
                iBi = 1;
            }
            iO = afxw.o(iBi);
        } else {
            iO = 400;
        }
        iO2 = rpi.o(resources, iO);
        if (Memory.peekByte(aszdVar.c + 11) != 0) {
            z = true;
        } else {
            z = false;
        }
        owqVar = new owq(str, iO2, z);
        map = g;
        synchronized (map) {
            futureTask = (FutureTask) map.get(owqVar);
            if (futureTask == null) {
                futureTask2 = new FutureTask(new Callable() { // from class: owp
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i = owt.c;
                        nxl nxlVar2 = nxlVar;
                        Context context2 = context;
                        String str2 = str;
                        int i2 = iO2;
                        boolean z4 = z;
                        Typeface typefaceB = nxlVar2.b(context2, str2, i2, z4);
                        return typefaceB == null ? rpi.q(str2, i2, z4) : typefaceB;
                    }
                });
                map.put(owqVar, futureTask2);
            } else {
                futureTask2 = futureTask;
            }
            futureTask2.run();
            return (Typeface) futureTask2.get();
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0250  */
    /* JADX WARN: Code duplicated, block: B:159:0x0379  */
    /* JADX WARN: Code duplicated, block: B:161:0x0386  */
    /* JADX WARN: Code duplicated, block: B:162:0x038b  */
    /* JADX WARN: Code duplicated, block: B:165:0x039a  */
    /* JADX WARN: Code duplicated, block: B:295:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:299:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:300:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:303:0x05eb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:309:0x061a  */
    /* JADX WARN: Code duplicated, block: B:311:0x0638  */
    /* JADX WARN: Code duplicated, block: B:312:0x063a  */
    /* JADX WARN: Code duplicated, block: B:316:0x0652  */
    /* JADX WARN: Code duplicated, block: B:329:0x0691  */
    /* JADX WARN: Code duplicated, block: B:331:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:332:0x06af  */
    /* JADX WARN: Code duplicated, block: B:336:0x06be  */
    /* JADX WARN: Code duplicated, block: B:339:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:347:0x06da  */
    /* JADX WARN: Code duplicated, block: B:349:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:350:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:354:0x070a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:355:0x070c  */
    /* JADX WARN: Code duplicated, block: B:357:0x072a  */
    /* JADX WARN: Code duplicated, block: B:358:0x072c  */
    /* JADX WARN: Code duplicated, block: B:360:0x0739  */
    /* JADX WARN: Code duplicated, block: B:362:0x0756  */
    /* JADX WARN: Code duplicated, block: B:363:0x0758  */
    /* JADX WARN: Code duplicated, block: B:369:0x0773  */
    /* JADX WARN: Code duplicated, block: B:371:0x0777  */
    /* JADX WARN: Code duplicated, block: B:375:0x0786  */
    /* JADX WARN: Code duplicated, block: B:376:0x0789  */
    /* JADX WARN: Code duplicated, block: B:380:0x079c  */
    /* JADX WARN: Code duplicated, block: B:381:0x079f  */
    /* JADX WARN: Code duplicated, block: B:384:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:386:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:388:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:390:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:392:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:393:0x07f9  */
    /* JADX WARN: Code duplicated, block: B:398:0x080d  */
    /* JADX WARN: Code duplicated, block: B:401:0x0820  */
    /* JADX WARN: Code duplicated, block: B:403:0x0847  */
    /* JADX WARN: Code duplicated, block: B:404:0x0849  */
    /* JADX WARN: Code duplicated, block: B:417:0x0905  */
    /* JADX WARN: Code duplicated, block: B:500:0x0b1b  */
    /* JADX WARN: Code duplicated, block: B:527:0x0bba  */
    /* JADX WARN: Code duplicated, block: B:564:0x0853 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0160  */
    /* JADX WARN: Code duplicated, block: B:61:0x0168  */
    /* JADX WARN: Code duplicated, block: B:62:0x016a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0197  */
    /* JADX WARN: Code duplicated, block: B:66:0x0199  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x020f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0211  */
    /* JADX WARN: Code duplicated, block: B:88:0x021d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0231  */
    /* JADX WARN: Code duplicated, block: B:93:0x0234  */
    /* JADX WARN: Code duplicated, block: B:94:0x0237  */
    /* JADX WARN: Code duplicated, block: B:97:0x024b  */
    /* JADX WARN: Code duplicated, block: B:98:0x024d  */
    public static CharSequence o(Context context, DisplayMetrics displayMetrics, asxe asxeVar, CharSequence charSequence, orq orqVar, nxl nxlVar, oui ouiVar, Map map, owj owjVar, kjc kjcVar, int i) {
        int i2;
        int i3;
        String strAR;
        int iJniGetDimensionInPixel;
        int i4;
        int iIntBitsToFloat;
        int i5;
        atiq atiqVarBb;
        double d2;
        boolean z;
        Float f2;
        Float fValueOf;
        int iJ;
        float fApplyDimension;
        float f3;
        long j;
        boolean z2;
        long j2;
        long j3;
        aszd aszdVar;
        long j4;
        Resources resources;
        String strAV;
        int iD;
        Resources resources2;
        aszd aszdVar2;
        int i6;
        String strA;
        int i7;
        String str;
        Typeface typefaceN;
        int i8;
        boolean z3;
        boolean z4;
        float fO;
        float f4;
        int i9;
        float fIntBitsToFloat;
        boolean z5;
        float fIntBitsToFloat2;
        float f5;
        float fFloatValue;
        int iBc;
        int i10;
        boolean z6;
        boolean z7;
        int iBc2;
        int i11;
        int i12;
        boolean z8;
        int iAY;
        boolean z9;
        mew mewVar;
        int[] iArrAG;
        int length;
        int i13;
        int i14;
        oxr oxrVar;
        Object objB;
        int[] iArr;
        int i15;
        boolean z10;
        int i16;
        long j5;
        boolean z11;
        boolean z12;
        int i17;
        byte bPeekByte;
        byte bPeekByte2;
        boolean z13;
        byte b2;
        String str2;
        FutureTask futureTask;
        Typeface typeface;
        long j6;
        boolean z14;
        int i18;
        boolean z15;
        SpannableString spannableString;
        asxe asxeVar2 = asxeVar;
        if (TextUtils.isEmpty(charSequence)) {
            return "";
        }
        int iBh = asxeVar2.bh();
        int iBd = asxeVar2.bd();
        int iBg = asxeVar2.bg();
        int iBc3 = asxeVar2.bc();
        int iBe = asxeVar2.be();
        int iBf = asxeVar2.bf();
        if (iBh == 0) {
            if (iBd == 0) {
                if (iBg != 0) {
                    iBd = 0;
                } else if (iBc3 != 0) {
                    iBc3 = iBc3;
                    iBe = iBe;
                    iBd = 0;
                    i2 = 0;
                    iBg = 0;
                } else if (iBe == 0) {
                    if (iBf != 0) {
                        iBd = 0;
                    } else {
                        if (!asxeVar2.bp()) {
                            return charSequence;
                        }
                        iBd = 0;
                        iBf = 0;
                    }
                    i2 = 0;
                    iBg = 0;
                    iBc3 = 0;
                    iBe = 0;
                } else {
                    iBe = iBe;
                    iBd = 0;
                    i2 = 0;
                    iBg = 0;
                    iBc3 = 0;
                }
            }
            i2 = 0;
        } else {
            i2 = iBh;
            iBg = iBg;
            iBc3 = iBc3;
            iBe = iBe;
        }
        SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
        int i19 = 0;
        while (i19 < iBd) {
            asxi asxiVarBu = asxeVar2.bu(i19);
            if (asxiVarBu.aU() || asxiVarBu.aT()) {
                oxv oxvVar = new oxv(asxiVarBu, orqVar);
                long j7 = asxiVarBu.c;
                spannableString = spannableStringValueOf;
                rpi.s(spannableString, oxvVar, Memory.peekInt(j7 + 12, false), (Memory.peekByte(asxiVarBu.c + 8) & 2) != 0, Memory.peekInt(j7 + 16, false));
            } else {
                spannableString = spannableStringValueOf;
            }
            i19++;
            spannableStringValueOf = spannableString;
            iBc3 = iBc3;
            iBf = iBf;
            iBd = iBd;
        }
        int i20 = iBf;
        int i21 = iBc3;
        int i22 = 2;
        SpannableString spannableString2 = spannableStringValueOf;
        Resources resources3 = context.getResources();
        float f6 = displayMetrics.density;
        int i23 = 0;
        while (true) {
            if (i23 < i2) {
                aszd aszdVarBz = asxeVar2.bz(i23);
                if (Memory.peekInt(aszdVarBz.c + 24, false) != 0) {
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Memory.peekInt(aszdVarBz.c + 24, false));
                    long j8 = aszdVarBz.c;
                    z = false;
                    rpi.s(spannableString2, foregroundColorSpan, Memory.peekInt(j8 + 12, false), (Memory.peekByte(aszdVarBz.c + 8) & 2) != 0, Memory.peekInt(j8 + 16, false));
                } else {
                    z = false;
                }
                if (i != 0) {
                    fValueOf = Float.valueOf(i);
                } else {
                    if (Float.intBitsToFloat(Memory.peekInt(aszdVarBz.c + 20, z)) != 0.0f) {
                        fValueOf = Float.valueOf(Float.intBitsToFloat(Memory.peekInt(aszdVarBz.c + 20, z)));
                    } else {
                        f2 = null;
                    }
                    if (f2 != null) {
                        if (aszdVarBz.aX() == i22) {
                            i18 = 1;
                        } else {
                            i18 = 2;
                        }
                        fApplyDimension = TypedValue.applyDimension(i18, f2.floatValue(), displayMetrics);
                        AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan(Math.round(fApplyDimension), false);
                        long j9 = aszdVarBz.c;
                        int iPeekInt = Memory.peekInt(j9 + 12, false);
                        if ((Memory.peekByte(aszdVarBz.c + 8) & 2) != 0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        rpi.s(spannableString2, absoluteSizeSpan, iPeekInt, z15, Memory.peekInt(j9 + 16, false));
                    } else {
                        iJ = rpi.j(spannableString2, Memory.peekInt(aszdVarBz.c + 12, false));
                        if (iJ <= 0) {
                            iJ = b(displayMetrics);
                        }
                        fApplyDimension = iJ;
                    }
                    f3 = fApplyDimension;
                    j = aszdVarBz.c;
                    z2 = aszd.a;
                    if (true != z2) {
                        j2 = 48;
                    } else {
                        j2 = 44;
                    }
                    j3 = j + j2;
                    Float f7 = f2;
                    if (Memory.peekInt(j3, false) != 0) {
                        int iPeekInt2 = Memory.peekInt(j3, false);
                        if (true != z2) {
                            j6 = 52;
                        } else {
                            j6 = 48;
                        }
                        oxy oxyVar = new oxy(iPeekInt2, Float.intBitsToFloat(Memory.peekInt(j + j6, false)), null);
                        aszdVar = aszdVarBz;
                        long j10 = aszdVar.c;
                        int iPeekInt3 = Memory.peekInt(j10 + 12, false);
                        if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        rpi.s(spannableString2, oxyVar, iPeekInt3, z14, Memory.peekInt(j10 + 16, false));
                    } else {
                        aszdVar = aszdVarBz;
                    }
                    j4 = aszdVar.c;
                    if ((Memory.peekByte(j4 + 9) & 8) != 0) {
                        resources = resources3;
                        if ((Memory.peekByte(aszdVar.c + 9) & 8) != 0) {
                            strAV = aszdVar.aV();
                        } else {
                            strAV = "default";
                        }
                        iD = nxlVar.d(strAV);
                        if (!nya.a() || iD == 1 || (Memory.peekByte(aszdVar.c + 9) & 8) == 0) {
                            resources2 = resources;
                            aszdVar2 = aszdVar;
                            spannableString2 = spannableString2;
                        } else {
                            if (aszdVar.aW()) {
                                if (aszdVar.i == null && (Memory.peekByte(aszdVar.c + 10) & 2) != 0) {
                                    aszdVar.i = new asya(aszdVar.cp(true != z2 ? 68 : 136, asxz.a));
                                }
                                asya asyaVar = aszdVar.i == null ? asxy.a : aszdVar.i;
                                long j11 = asyaVar.c;
                                long j12 = j11 + 28;
                                byte bPeekByte3 = Memory.peekByte(j12);
                                long j13 = j11 + 29;
                                byte bPeekByte4 = Memory.peekByte(j13);
                                boolean z16 = UnsafeMemory.a;
                                aszdVar2 = aszdVar;
                                if (((short) (((true != z16 ? bPeekByte4 : bPeekByte3) << 8) | ((true == z16 ? bPeekByte4 : bPeekByte3) & 255))) == 1) {
                                    byte bPeekByte5 = Memory.peekByte(j12);
                                    byte bPeekByte6 = Memory.peekByte(j13);
                                    byte b3 = true != z16 ? bPeekByte6 : bPeekByte5;
                                    if (true == z16) {
                                        bPeekByte5 = bPeekByte6;
                                    }
                                    fO = ((short) ((b3 << 8) | (bPeekByte5 & 255))) == 1 ? Float.intBitsToFloat(Memory.peekInt(asyaVar.c + 32, false)) : 0.0f;
                                } else {
                                    byte bPeekByte7 = Memory.peekByte(j12);
                                    byte bPeekByte8 = Memory.peekByte(j13);
                                    byte b4 = true != z16 ? bPeekByte8 : bPeekByte7;
                                    if (true == z16) {
                                        bPeekByte7 = bPeekByte8;
                                    }
                                    if (((short) ((b4 << 8) | (bPeekByte7 & 255))) == 2) {
                                        int iBi = a.bi(Memory.peekInt(asyaVar.c + 32, false));
                                        if (iBi == 0) {
                                            iBi = 1;
                                        }
                                        fO = afxw.o(iBi);
                                    } else {
                                        fO = 400.0f;
                                    }
                                }
                                float fO2 = rpi.o(resources, (int) fO);
                                long j14 = asyaVar.c;
                                long j15 = j14 + 36;
                                long j16 = j14 + 37;
                                byte bPeekByte9 = Memory.peekByte(j15);
                                byte bPeekByte10 = Memory.peekByte(j16);
                                resources2 = resources;
                                byte b5 = true != z16 ? bPeekByte10 : bPeekByte9;
                                if (true == z16) {
                                    bPeekByte9 = bPeekByte10;
                                }
                                if (((short) ((b5 << 8) | (bPeekByte9 & 255))) == 3) {
                                    byte bPeekByte11 = Memory.peekByte(j15);
                                    byte bPeekByte12 = Memory.peekByte(j16);
                                    byte b6 = true != z16 ? bPeekByte12 : bPeekByte11;
                                    if (true == z16) {
                                        bPeekByte11 = bPeekByte12;
                                    }
                                    if (((short) ((b6 << 8) | (bPeekByte11 & 255))) == 3) {
                                        fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(asyaVar.c + 40, false));
                                        f4 = fIntBitsToFloat;
                                    } else {
                                        f4 = 0.0f;
                                    }
                                } else {
                                    byte bPeekByte13 = Memory.peekByte(j15);
                                    byte bPeekByte14 = Memory.peekByte(j16);
                                    byte b7 = true != z16 ? bPeekByte14 : bPeekByte13;
                                    if (true == z16) {
                                        bPeekByte13 = bPeekByte14;
                                    }
                                    if (((short) ((b7 << 8) | (bPeekByte13 & 255))) == 4) {
                                        switch (Memory.peekInt(asyaVar.c + 40, false)) {
                                            case 0:
                                                i9 = 1;
                                                break;
                                            case 1:
                                                i9 = 2;
                                                break;
                                            case 2:
                                                i9 = 3;
                                                break;
                                            case 3:
                                                i9 = 4;
                                                break;
                                            case 4:
                                                i9 = 5;
                                                break;
                                            case 5:
                                                i9 = 6;
                                                break;
                                            case 6:
                                                i9 = 7;
                                                break;
                                            case 7:
                                                i9 = 8;
                                                break;
                                            case 8:
                                                i9 = 9;
                                                break;
                                            case 9:
                                                i9 = 10;
                                                break;
                                            default:
                                                i9 = 0;
                                                break;
                                        }
                                        if (i9 == 0) {
                                            i9 = 1;
                                        }
                                        switch (i9 - 1) {
                                            case 1:
                                                fIntBitsToFloat = 50.0f;
                                                f4 = fIntBitsToFloat;
                                                break;
                                            case 2:
                                                fIntBitsToFloat = 62.5f;
                                                f4 = fIntBitsToFloat;
                                                break;
                                            case 3:
                                                fIntBitsToFloat = 75.0f;
                                                f4 = fIntBitsToFloat;
                                                break;
                                            case 4:
                                                fIntBitsToFloat = 87.5f;
                                                f4 = fIntBitsToFloat;
                                                break;
                                            case 6:
                                                fIntBitsToFloat = 112.5f;
                                                f4 = fIntBitsToFloat;
                                                break;
                                            case 7:
                                                fIntBitsToFloat = 125.0f;
                                                f4 = fIntBitsToFloat;
                                                break;
                                            case 8:
                                                fIntBitsToFloat = 150.0f;
                                                f4 = fIntBitsToFloat;
                                                break;
                                            case 9:
                                                fIntBitsToFloat = 200.0f;
                                                f4 = fIntBitsToFloat;
                                                break;
                                        }
                                    }
                                    f4 = 100.0f;
                                }
                                if ((Memory.peekByte(asyaVar.c + 8) & 1) != 0) {
                                    z5 = false;
                                    fIntBitsToFloat2 = Float.intBitsToFloat(Memory.peekInt(asyaVar.c + 12, false));
                                } else {
                                    z5 = false;
                                    fIntBitsToFloat2 = 0.0f;
                                }
                                float fIntBitsToFloat3 = (Memory.peekByte(asyaVar.c + 8) & 2) != 0 ? Float.intBitsToFloat(Memory.peekInt(asyaVar.c + 16, z5)) : 0.0f;
                                float fIntBitsToFloat4 = (Memory.peekByte(asyaVar.c + 8) & 4) != 0 ? Float.intBitsToFloat(Memory.peekInt(asyaVar.c + 20, z5)) : 0.0f;
                                if ((Memory.peekByte(asyaVar.c + 8) & 8) != 0) {
                                    fFloatValue = Float.intBitsToFloat(Memory.peekInt(asyaVar.c + 24, z5));
                                } else {
                                    if (f7 != null) {
                                        fFloatValue = f7.floatValue();
                                    } else {
                                        f5 = 0.0f;
                                    }
                                    strA = oxq.b(fO2, f4, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, f5);
                                }
                                f5 = fFloatValue;
                                strA = oxq.b(fO2, f4, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, f5);
                            } else {
                                resources2 = resources;
                                aszdVar2 = aszdVar;
                                spannableString2 = spannableString2;
                                if (f7 != null) {
                                    strA = oxq.a(f7.floatValue());
                                }
                                i7 = i6;
                                if (iD != i6) {
                                    str = null;
                                } else {
                                    str = strA;
                                }
                                spannableString2 = spannableString2;
                                Resources resources4 = resources2;
                                aszdVar = aszdVar2;
                                typefaceN = n(context, resources4, strAV, aszdVar, nxlVar, ouiVar);
                                resources3 = resources4;
                                if (typefaceN == null || str != null) {
                                    i8 = i7;
                                    z3 = false;
                                    nys nysVar = new nys(strAV, typefaceN, str);
                                    long j17 = aszdVar.c;
                                    int iPeekInt4 = Memory.peekInt(j17 + 12, false);
                                    if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    rpi.s(spannableString2, nysVar, iPeekInt4, z4, Memory.peekInt(j17 + 16, false));
                                } else {
                                    TypefaceSpan typefaceSpan = new TypefaceSpan(strAV);
                                    long j18 = aszdVar.c;
                                    i8 = i7;
                                    z3 = false;
                                    spannableString2 = spannableString2;
                                    rpi.s(spannableString2, typefaceSpan, Memory.peekInt(j18 + 12, false), (Memory.peekByte(aszdVar.c + 8) & 2) != 0, Memory.peekInt(j18 + 16, false));
                                }
                            }
                            i6 = 2;
                            i7 = i6;
                            if (iD != i6) {
                                str = null;
                            } else {
                                str = strA;
                            }
                            spannableString2 = spannableString2;
                            Resources resources5 = resources2;
                            aszdVar = aszdVar2;
                            typefaceN = n(context, resources5, strAV, aszdVar, nxlVar, ouiVar);
                            resources3 = resources5;
                            if (typefaceN == null) {
                                i8 = i7;
                                z3 = false;
                                nys nysVar2 = new nys(strAV, typefaceN, str);
                                long j19 = aszdVar.c;
                                int iPeekInt5 = Memory.peekInt(j19 + 12, false);
                                if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                rpi.s(spannableString2, nysVar2, iPeekInt5, z4, Memory.peekInt(j19 + 16, false));
                            } else {
                                i8 = i7;
                                z3 = false;
                                nys nysVar3 = new nys(strAV, typefaceN, str);
                                long j110 = aszdVar.c;
                                int iPeekInt6 = Memory.peekInt(j110 + 12, false);
                                if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                rpi.s(spannableString2, nysVar3, iPeekInt6, z4, Memory.peekInt(j110 + 16, false));
                            }
                        }
                        i6 = 2;
                        strA = null;
                        i7 = i6;
                        if (iD != i6) {
                            str = null;
                        } else {
                            str = strA;
                        }
                        spannableString2 = spannableString2;
                        Resources resources6 = resources2;
                        aszdVar = aszdVar2;
                        typefaceN = n(context, resources6, strAV, aszdVar, nxlVar, ouiVar);
                        resources3 = resources6;
                        if (typefaceN == null) {
                            i8 = i7;
                            z3 = false;
                            nys nysVar4 = new nys(strAV, typefaceN, str);
                            long j111 = aszdVar.c;
                            int iPeekInt7 = Memory.peekInt(j111 + 12, false);
                            if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            rpi.s(spannableString2, nysVar4, iPeekInt7, z4, Memory.peekInt(j111 + 16, false));
                        } else {
                            i8 = i7;
                            z3 = false;
                            nys nysVar5 = new nys(strAV, typefaceN, str);
                            long j112 = aszdVar.c;
                            int iPeekInt8 = Memory.peekInt(j112 + 12, false);
                            if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            rpi.s(spannableString2, nysVar5, iPeekInt8, z4, Memory.peekInt(j112 + 16, false));
                        }
                    } else {
                        if (true != z2) {
                            i17 = 76;
                        } else {
                            i17 = 56;
                        }
                        long j20 = j4 + ((long) i17);
                        bPeekByte = Memory.peekByte(j20);
                        bPeekByte2 = Memory.peekByte(1 + j20);
                        z13 = UnsafeMemory.a;
                        if (true != z13) {
                            b2 = bPeekByte2;
                        } else {
                            b2 = bPeekByte;
                        }
                        if (true == z13) {
                            bPeekByte = bPeekByte2;
                        }
                        if (((short) ((b2 << 8) | (bPeekByte & 255))) != 7 || aszdVar.cl() || Memory.peekByte(aszdVar.c + 11) != 0 || aszdVar.aW()) {
                            resources = resources3;
                            if ((Memory.peekByte(aszdVar.c + 9) & 8) != 0) {
                                strAV = aszdVar.aV();
                            } else {
                                strAV = "default";
                            }
                            iD = nxlVar.d(strAV);
                            if (nya.a()) {
                                resources2 = resources;
                                aszdVar2 = aszdVar;
                                spannableString2 = spannableString2;
                                i6 = 2;
                                strA = null;
                            } else {
                                resources2 = resources;
                                aszdVar2 = aszdVar;
                                spannableString2 = spannableString2;
                                i6 = 2;
                                strA = null;
                            }
                            i7 = i6;
                            if (iD != i6) {
                                str = null;
                            } else {
                                str = strA;
                            }
                            spannableString2 = spannableString2;
                            Resources resources7 = resources2;
                            aszdVar = aszdVar2;
                            typefaceN = n(context, resources7, strAV, aszdVar, nxlVar, ouiVar);
                            resources3 = resources7;
                            if (typefaceN == null) {
                                i8 = i7;
                                z3 = false;
                                nys nysVar6 = new nys(strAV, typefaceN, str);
                                long j113 = aszdVar.c;
                                int iPeekInt9 = Memory.peekInt(j113 + 12, false);
                                if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                rpi.s(spannableString2, nysVar6, iPeekInt9, z4, Memory.peekInt(j113 + 16, false));
                            } else {
                                i8 = i7;
                                z3 = false;
                                nys nysVar7 = new nys(strAV, typefaceN, str);
                                long j114 = aszdVar.c;
                                int iPeekInt10 = Memory.peekInt(j114 + 12, false);
                                if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                rpi.s(spannableString2, nysVar7, iPeekInt10, z4, Memory.peekInt(j114 + 16, false));
                            }
                        } else {
                            if ((Memory.peekByte(aszdVar.c + 8) & 4) != 0) {
                                if (aszdVar.g == null) {
                                    if ((Memory.peekByte(aszdVar.c + 8) & 4) != 0) {
                                        aszdVar.g = aszdVar.cq(aszd.e.b);
                                    } else {
                                        aszdVar.g = "";
                                    }
                                }
                                String str3 = aszdVar.g;
                                owr owrVar = new owr(str3, c(resources3));
                                Map map2 = f;
                                synchronized (map2) {
                                    FutureTask futureTask2 = (FutureTask) map2.get(owrVar);
                                    if (futureTask2 == null) {
                                        str2 = str3;
                                        futureTask2 = new FutureTask(new hlm(nxlVar, context, str3, resources3, 8));
                                        map2.put(owrVar, futureTask2);
                                    } else {
                                        str2 = str3;
                                    }
                                    futureTask = futureTask2;
                                }
                                futureTask.run();
                                try {
                                    typeface = (Typeface) futureTask.get();
                                } catch (InterruptedException e2) {
                                    Thread.currentThread().interrupt();
                                    ouiVar.c(aslh.LOG_TYPE_INTERNAL_ERROR, "Font fetching future task interrupted: ".concat(String.valueOf(str2)), e2);
                                    typeface = null;
                                } catch (ExecutionException e3) {
                                    Map map3 = f;
                                    synchronized (map3) {
                                        j$.util.Map.EL.remove(map3, owrVar, futureTask);
                                        ouiVar.c(aslh.LOG_TYPE_INTERNAL_ERROR, "Font fetching future task failed: ".concat(String.valueOf(str2)), e3);
                                        typeface = null;
                                    }
                                }
                                if (typeface == null) {
                                    TypefaceSpan typefaceSpan2 = new TypefaceSpan(str2);
                                    long j21 = aszdVar.c;
                                    rpi.s(spannableString2, typefaceSpan2, Memory.peekInt(j21 + 12, false), (Memory.peekByte(aszdVar.c + 8) & 2) != 0, Memory.peekInt(j21 + 16, false));
                                    z3 = false;
                                } else {
                                    nys nysVar8 = new nys(str2, typeface, null);
                                    long j22 = aszdVar.c;
                                    rpi.s(spannableString2, nysVar8, Memory.peekInt(j22 + 12, false), (Memory.peekByte(aszdVar.c + 8) & 2) != 0, Memory.peekInt(j22 + 16, false));
                                }
                                i8 = 2;
                            } else {
                                resources3 = resources3;
                            }
                            z3 = false;
                            i8 = 2;
                        }
                    }
                    long j23 = aszdVar.c;
                    iBc = a.bc(Memory.peekInt(j23 + 28, z3));
                    if (iBc == 0) {
                        iBc = 1;
                    }
                    i10 = iBc - 1;
                    if (i10 != i8 || i10 == 3) {
                        z6 = false;
                        UnderlineSpan underlineSpan = new UnderlineSpan();
                        long j24 = aszdVar.c;
                        int iPeekInt11 = Memory.peekInt(j24 + 12, false);
                        if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        rpi.s(spannableString2, underlineSpan, iPeekInt11, z7, Memory.peekInt(j24 + 16, false));
                    } else if (i10 != 4) {
                        z6 = false;
                    } else {
                        mrp mrpVar = new mrp(displayMetrics, Memory.peekInt(j23 + 24, false));
                        long j25 = aszdVar.c;
                        z6 = false;
                        rpi.s(spannableString2, mrpVar, Memory.peekInt(j25 + 12, false), (Memory.peekByte(aszdVar.c + 8) & 2) != 0, Memory.peekInt(j25 + 16, false));
                    }
                    iBc2 = a.bc(Memory.peekInt(aszdVar.c + (true == z2 ? 36L : 40L), z6));
                    if (iBc2 == 0) {
                        iBc2 = 1;
                    }
                    i11 = iBc2 - 1;
                    if (i11 != 2 || i11 == 3 || i11 == 4) {
                        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
                        long j26 = aszdVar.c;
                        int iPeekInt12 = Memory.peekInt(j26 + 12, false);
                        i12 = 2;
                        if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        rpi.s(spannableString2, strikethroughSpan, iPeekInt12, z8, Memory.peekInt(j26 + 16, false));
                    } else {
                        i12 = 2;
                    }
                    iAY = aszdVar.aY() - 1;
                    if (iAY != 1) {
                        oxu oxuVar = new oxu(1, f3);
                        long j27 = aszdVar.c;
                        int iPeekInt13 = Memory.peekInt(j27 + 12, false);
                        if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        rpi.s(spannableString2, oxuVar, iPeekInt13, z9, Memory.peekInt(j27 + 16, false));
                    } else if (iAY == i12) {
                        oxu oxuVar2 = new oxu(i12, f3);
                        long j28 = aszdVar.c;
                        int iPeekInt14 = Memory.peekInt(j28 + 12, false);
                        SpannableString spannableString3 = spannableString2;
                        if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        spannableString2 = spannableString3;
                        rpi.s(spannableString2, oxuVar2, iPeekInt14, z12, Memory.peekInt(j28 + 16, false));
                    }
                    if (aszdVar.k == null || (Memory.peekByte(aszdVar.c + 8) & 128) != 0) {
                        if (aszdVar.k == null && (Memory.peekByte(aszdVar.c + 8) & 128) != 0) {
                            if (true != z2) {
                                i16 = 32;
                            } else {
                                i16 = 112;
                            }
                            aszdVar.k = new mew(aszdVar.cp(i16, aszb.a));
                        }
                        if (aszdVar.k == null) {
                            mewVar = asza.a;
                        } else {
                            mewVar = aszdVar.k;
                        }
                        iArrAG = ksy.aG(mewVar);
                        i13 = 0;
                        for (length = iArrAG.length; i13 < length; length = i15) {
                            i14 = iArrAG[i13];
                            oxrVar = (oxr) map.get(Integer.valueOf(i14));
                            if (oxrVar == null) {
                                ouiVar.a(aslh.LOG_TYPE_UNKNOWN_EXTENSION, a.bR(i14, "TextComponentSpec: No converter for extension "));
                                iArr = iArrAG;
                                i15 = length;
                            } else {
                                mewVar.d(oxrVar.a());
                                objB = oxrVar.b();
                                iArr = iArrAG;
                                i15 = length;
                                if (objB != null) {
                                    long j29 = aszdVar.c;
                                    int iPeekInt15 = Memory.peekInt(j29 + 12, false);
                                    if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    rpi.s(spannableString2, objB, iPeekInt15, z10, Memory.peekInt(j29 + 16, false));
                                }
                                i13++;
                                iArrAG = iArr;
                            }
                            i13++;
                            iArrAG = iArr;
                        }
                    }
                    j5 = true != z2 ? 36L : 32L;
                    if (Float.intBitsToFloat(Memory.peekInt(aszdVar.c + j5, false)) != 0.0f) {
                        nyt nytVar = new nyt(Float.intBitsToFloat(Memory.peekInt(aszdVar.c + j5, false)));
                        long j30 = aszdVar.c;
                        int iPeekInt16 = Memory.peekInt(j30 + 12, false);
                        if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        rpi.s(spannableString2, nytVar, iPeekInt16, z11, Memory.peekInt(j30 + 16, false));
                    }
                    resources3 = resources3;
                    i2 = i2;
                    iBg = iBg;
                    f6 = f6;
                    i22 = 2;
                    i23++;
                }
                f2 = fValueOf;
                if (f2 != null) {
                    if (aszdVarBz.aX() == i22) {
                        i18 = 1;
                    } else {
                        i18 = 2;
                    }
                    fApplyDimension = TypedValue.applyDimension(i18, f2.floatValue(), displayMetrics);
                    AbsoluteSizeSpan absoluteSizeSpan2 = new AbsoluteSizeSpan(Math.round(fApplyDimension), false);
                    long j31 = aszdVarBz.c;
                    int iPeekInt17 = Memory.peekInt(j31 + 12, false);
                    if ((Memory.peekByte(aszdVarBz.c + 8) & 2) != 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    rpi.s(spannableString2, absoluteSizeSpan2, iPeekInt17, z15, Memory.peekInt(j31 + 16, false));
                } else {
                    iJ = rpi.j(spannableString2, Memory.peekInt(aszdVarBz.c + 12, false));
                    if (iJ <= 0) {
                        iJ = b(displayMetrics);
                    }
                    fApplyDimension = iJ;
                }
                f3 = fApplyDimension;
                j = aszdVarBz.c;
                z2 = aszd.a;
                if (true != z2) {
                    j2 = 48;
                } else {
                    j2 = 44;
                }
                j3 = j + j2;
                Float f8 = f2;
                if (Memory.peekInt(j3, false) != 0) {
                    int iPeekInt18 = Memory.peekInt(j3, false);
                    if (true != z2) {
                        j6 = 52;
                    } else {
                        j6 = 48;
                    }
                    oxy oxyVar2 = new oxy(iPeekInt18, Float.intBitsToFloat(Memory.peekInt(j + j6, false)), null);
                    aszdVar = aszdVarBz;
                    long j115 = aszdVar.c;
                    int iPeekInt19 = Memory.peekInt(j115 + 12, false);
                    if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    rpi.s(spannableString2, oxyVar2, iPeekInt19, z14, Memory.peekInt(j115 + 16, false));
                } else {
                    aszdVar = aszdVarBz;
                }
                j4 = aszdVar.c;
                if ((Memory.peekByte(j4 + 9) & 8) != 0) {
                    resources = resources3;
                    if ((Memory.peekByte(aszdVar.c + 9) & 8) != 0) {
                        strAV = aszdVar.aV();
                    } else {
                        strAV = "default";
                    }
                    iD = nxlVar.d(strAV);
                    if (nya.a()) {
                        resources2 = resources;
                        aszdVar2 = aszdVar;
                        spannableString2 = spannableString2;
                        i6 = 2;
                        strA = null;
                    } else {
                        resources2 = resources;
                        aszdVar2 = aszdVar;
                        spannableString2 = spannableString2;
                        i6 = 2;
                        strA = null;
                    }
                    i7 = i6;
                    if (iD != i6) {
                        str = null;
                    } else {
                        str = strA;
                    }
                    spannableString2 = spannableString2;
                    Resources resources8 = resources2;
                    aszdVar = aszdVar2;
                    typefaceN = n(context, resources8, strAV, aszdVar, nxlVar, ouiVar);
                    resources3 = resources8;
                    if (typefaceN == null) {
                        i8 = i7;
                        z3 = false;
                        nys nysVar9 = new nys(strAV, typefaceN, str);
                        long j116 = aszdVar.c;
                        int iPeekInt110 = Memory.peekInt(j116 + 12, false);
                        if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        rpi.s(spannableString2, nysVar9, iPeekInt110, z4, Memory.peekInt(j116 + 16, false));
                    } else {
                        i8 = i7;
                        z3 = false;
                        nys nysVar10 = new nys(strAV, typefaceN, str);
                        long j117 = aszdVar.c;
                        int iPeekInt111 = Memory.peekInt(j117 + 12, false);
                        if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        rpi.s(spannableString2, nysVar10, iPeekInt111, z4, Memory.peekInt(j117 + 16, false));
                    }
                } else {
                    if (true != z2) {
                        i17 = 76;
                    } else {
                        i17 = 56;
                    }
                    long j210 = j4 + ((long) i17);
                    bPeekByte = Memory.peekByte(j210);
                    bPeekByte2 = Memory.peekByte(1 + j210);
                    z13 = UnsafeMemory.a;
                    if (true != z13) {
                        b2 = bPeekByte2;
                    } else {
                        b2 = bPeekByte;
                    }
                    if (true == z13) {
                        bPeekByte = bPeekByte2;
                    }
                    if (((short) ((b2 << 8) | (bPeekByte & 255))) != 7) {
                        resources = resources3;
                        if ((Memory.peekByte(aszdVar.c + 9) & 8) != 0) {
                            strAV = aszdVar.aV();
                        } else {
                            strAV = "default";
                        }
                        iD = nxlVar.d(strAV);
                        if (nya.a()) {
                            resources2 = resources;
                            aszdVar2 = aszdVar;
                            spannableString2 = spannableString2;
                            i6 = 2;
                            strA = null;
                        } else {
                            resources2 = resources;
                            aszdVar2 = aszdVar;
                            spannableString2 = spannableString2;
                            i6 = 2;
                            strA = null;
                        }
                        i7 = i6;
                        if (iD != i6) {
                            str = null;
                        } else {
                            str = strA;
                        }
                        spannableString2 = spannableString2;
                        Resources resources9 = resources2;
                        aszdVar = aszdVar2;
                        typefaceN = n(context, resources9, strAV, aszdVar, nxlVar, ouiVar);
                        resources3 = resources9;
                        if (typefaceN == null) {
                            i8 = i7;
                            z3 = false;
                            nys nysVar11 = new nys(strAV, typefaceN, str);
                            long j118 = aszdVar.c;
                            int iPeekInt112 = Memory.peekInt(j118 + 12, false);
                            if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            rpi.s(spannableString2, nysVar11, iPeekInt112, z4, Memory.peekInt(j118 + 16, false));
                        } else {
                            i8 = i7;
                            z3 = false;
                            nys nysVar12 = new nys(strAV, typefaceN, str);
                            long j119 = aszdVar.c;
                            int iPeekInt113 = Memory.peekInt(j119 + 12, false);
                            if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            rpi.s(spannableString2, nysVar12, iPeekInt113, z4, Memory.peekInt(j119 + 16, false));
                        }
                    } else {
                        resources = resources3;
                        if ((Memory.peekByte(aszdVar.c + 9) & 8) != 0) {
                            strAV = aszdVar.aV();
                        } else {
                            strAV = "default";
                        }
                        iD = nxlVar.d(strAV);
                        if (nya.a()) {
                            resources2 = resources;
                            aszdVar2 = aszdVar;
                            spannableString2 = spannableString2;
                            i6 = 2;
                            strA = null;
                        } else {
                            resources2 = resources;
                            aszdVar2 = aszdVar;
                            spannableString2 = spannableString2;
                            i6 = 2;
                            strA = null;
                        }
                        i7 = i6;
                        if (iD != i6) {
                            str = null;
                        } else {
                            str = strA;
                        }
                        spannableString2 = spannableString2;
                        Resources resources10 = resources2;
                        aszdVar = aszdVar2;
                        typefaceN = n(context, resources10, strAV, aszdVar, nxlVar, ouiVar);
                        resources3 = resources10;
                        if (typefaceN == null) {
                            i8 = i7;
                            z3 = false;
                            nys nysVar13 = new nys(strAV, typefaceN, str);
                            long j1110 = aszdVar.c;
                            int iPeekInt114 = Memory.peekInt(j1110 + 12, false);
                            if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            rpi.s(spannableString2, nysVar13, iPeekInt114, z4, Memory.peekInt(j1110 + 16, false));
                        } else {
                            i8 = i7;
                            z3 = false;
                            nys nysVar14 = new nys(strAV, typefaceN, str);
                            long j1111 = aszdVar.c;
                            int iPeekInt115 = Memory.peekInt(j1111 + 12, false);
                            if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            rpi.s(spannableString2, nysVar14, iPeekInt115, z4, Memory.peekInt(j1111 + 16, false));
                        }
                    }
                }
                long j211 = aszdVar.c;
                iBc = a.bc(Memory.peekInt(j211 + 28, z3));
                if (iBc == 0) {
                    iBc = 1;
                }
                i10 = iBc - 1;
                if (i10 != i8) {
                    z6 = false;
                    UnderlineSpan underlineSpan2 = new UnderlineSpan();
                    long j212 = aszdVar.c;
                    int iPeekInt116 = Memory.peekInt(j212 + 12, false);
                    if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    rpi.s(spannableString2, underlineSpan2, iPeekInt116, z7, Memory.peekInt(j212 + 16, false));
                } else {
                    z6 = false;
                    UnderlineSpan underlineSpan3 = new UnderlineSpan();
                    long j213 = aszdVar.c;
                    int iPeekInt117 = Memory.peekInt(j213 + 12, false);
                    if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    rpi.s(spannableString2, underlineSpan3, iPeekInt117, z7, Memory.peekInt(j213 + 16, false));
                }
                iBc2 = a.bc(Memory.peekInt(aszdVar.c + (true == z2 ? 36L : 40L), z6));
                if (iBc2 == 0) {
                    iBc2 = 1;
                }
                i11 = iBc2 - 1;
                if (i11 != 2) {
                    StrikethroughSpan strikethroughSpan2 = new StrikethroughSpan();
                    long j214 = aszdVar.c;
                    int iPeekInt118 = Memory.peekInt(j214 + 12, false);
                    i12 = 2;
                    if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    rpi.s(spannableString2, strikethroughSpan2, iPeekInt118, z8, Memory.peekInt(j214 + 16, false));
                } else {
                    StrikethroughSpan strikethroughSpan3 = new StrikethroughSpan();
                    long j215 = aszdVar.c;
                    int iPeekInt119 = Memory.peekInt(j215 + 12, false);
                    i12 = 2;
                    if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    rpi.s(spannableString2, strikethroughSpan3, iPeekInt119, z8, Memory.peekInt(j215 + 16, false));
                }
                iAY = aszdVar.aY() - 1;
                if (iAY != 1) {
                    oxu oxuVar3 = new oxu(1, f3);
                    long j216 = aszdVar.c;
                    int iPeekInt120 = Memory.peekInt(j216 + 12, false);
                    if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    rpi.s(spannableString2, oxuVar3, iPeekInt120, z9, Memory.peekInt(j216 + 16, false));
                } else if (iAY == i12) {
                    oxu oxuVar4 = new oxu(i12, f3);
                    long j217 = aszdVar.c;
                    int iPeekInt121 = Memory.peekInt(j217 + 12, false);
                    SpannableString spannableString4 = spannableString2;
                    if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    spannableString2 = spannableString4;
                    rpi.s(spannableString2, oxuVar4, iPeekInt121, z12, Memory.peekInt(j217 + 16, false));
                }
                if (aszdVar.k == null) {
                    if (aszdVar.k == null) {
                        if (true != z2) {
                            i16 = 32;
                        } else {
                            i16 = 112;
                        }
                        aszdVar.k = new mew(aszdVar.cp(i16, aszb.a));
                    }
                    if (aszdVar.k == null) {
                        mewVar = asza.a;
                    } else {
                        mewVar = aszdVar.k;
                    }
                    iArrAG = ksy.aG(mewVar);
                    i13 = 0;
                    while (i13 < length) {
                        i14 = iArrAG[i13];
                        oxrVar = (oxr) map.get(Integer.valueOf(i14));
                        if (oxrVar == null) {
                            ouiVar.a(aslh.LOG_TYPE_UNKNOWN_EXTENSION, a.bR(i14, "TextComponentSpec: No converter for extension "));
                            iArr = iArrAG;
                            i15 = length;
                        } else {
                            mewVar.d(oxrVar.a());
                            objB = oxrVar.b();
                            iArr = iArrAG;
                            i15 = length;
                            if (objB != null) {
                                long j218 = aszdVar.c;
                                int iPeekInt122 = Memory.peekInt(j218 + 12, false);
                                if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                rpi.s(spannableString2, objB, iPeekInt122, z10, Memory.peekInt(j218 + 16, false));
                            }
                            i13++;
                            iArrAG = iArr;
                        }
                        i13++;
                        iArrAG = iArr;
                    }
                } else {
                    if (aszdVar.k == null) {
                        if (true != z2) {
                            i16 = 32;
                        } else {
                            i16 = 112;
                        }
                        aszdVar.k = new mew(aszdVar.cp(i16, aszb.a));
                    }
                    if (aszdVar.k == null) {
                        mewVar = asza.a;
                    } else {
                        mewVar = aszdVar.k;
                    }
                    iArrAG = ksy.aG(mewVar);
                    i13 = 0;
                    while (i13 < length) {
                        i14 = iArrAG[i13];
                        oxrVar = (oxr) map.get(Integer.valueOf(i14));
                        if (oxrVar == null) {
                            ouiVar.a(aslh.LOG_TYPE_UNKNOWN_EXTENSION, a.bR(i14, "TextComponentSpec: No converter for extension "));
                            iArr = iArrAG;
                            i15 = length;
                        } else {
                            mewVar.d(oxrVar.a());
                            objB = oxrVar.b();
                            iArr = iArrAG;
                            i15 = length;
                            if (objB != null) {
                                long j219 = aszdVar.c;
                                int iPeekInt123 = Memory.peekInt(j219 + 12, false);
                                if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                rpi.s(spannableString2, objB, iPeekInt123, z10, Memory.peekInt(j219 + 16, false));
                            }
                            i13++;
                            iArrAG = iArr;
                        }
                        i13++;
                        iArrAG = iArr;
                    }
                }
                if (true != z2) {
                }
                if (Float.intBitsToFloat(Memory.peekInt(aszdVar.c + j5, false)) != 0.0f) {
                    nyt nytVar2 = new nyt(Float.intBitsToFloat(Memory.peekInt(aszdVar.c + j5, false)));
                    long j32 = aszdVar.c;
                    int iPeekInt124 = Memory.peekInt(j32 + 12, false);
                    if ((Memory.peekByte(aszdVar.c + 8) & 2) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    rpi.s(spannableString2, nytVar2, iPeekInt124, z11, Memory.peekInt(j32 + 16, false));
                }
                resources3 = resources3;
                i2 = i2;
                iBg = iBg;
                f6 = f6;
                i22 = 2;
                i23++;
            } else {
                int i24 = iBg;
                float f9 = f6;
                int i25 = 0;
                while (true) {
                    resources3 = resources3;
                    if (i25 < iBe) {
                        asxl asxlVarBv = asxeVar2.bv(i25);
                        if (asxlVarBv != null) {
                            if (asxlVarBv.aS()) {
                                mew mewVarAT = asxlVarBv.aT();
                                mep mepVar = athq.d;
                                if (mewVarAT.e(mepVar)) {
                                    athq athqVar = (athq) asxlVarBv.aT().d(mepVar);
                                    RectF rectF = new RectF(Float.intBitsToFloat(Memory.peekInt(athqVar.c + 28, false)) * f9, Float.intBitsToFloat(Memory.peekInt(athqVar.c + 36, false)) * f9, Float.intBitsToFloat(Memory.peekInt(athqVar.c + 32, false)) * f9, Float.intBitsToFloat(Memory.peekInt(athqVar.c + 40, false)) * f9);
                                    long j33 = athqVar.c;
                                    oxy oxyVar3 = new oxy(Memory.peekInt(j33 + 20, false), Float.intBitsToFloat(Memory.peekInt(j33 + 24, false)) * f9, rectF);
                                    long j34 = athqVar.c;
                                    rpi.s(spannableString2, oxyVar3, Memory.peekInt(j34 + 12, false), true, Memory.peekInt(j34 + 16, false));
                                }
                            }
                            if (asxlVarBv.aS()) {
                                mew mewVarAT2 = asxlVarBv.aT();
                                mep mepVar2 = athw.d;
                                if (mewVarAT2.e(mepVar2)) {
                                    athw athwVar = (athw) asxlVarBv.aT().d(mepVar2);
                                    rpi.s(spannableString2, new oxz(Float.intBitsToFloat(Memory.peekInt(athwVar.c + 12, false)) * f9, Float.intBitsToFloat(Memory.peekInt(athwVar.c + 16, false)) * f9), 0, false, 0);
                                }
                            }
                            if (asxlVarBv.aS()) {
                                mew mewVarAT3 = asxlVarBv.aT();
                                mep mepVar3 = atoi.d;
                                if (mewVarAT3.e(mepVar3)) {
                                    atoi atoiVar = (atoi) asxlVarBv.aT().d(mepVar3);
                                    rpi.s(spannableString2, new oyc(Float.intBitsToFloat(Memory.peekInt(atoiVar.c + 12, false)), Float.intBitsToFloat(Memory.peekInt(atoiVar.c + 16, false))), 0, false, 0);
                                }
                            }
                        } else {
                            resources3 = resources3;
                        }
                        i25++;
                    } else {
                        Resources resources11 = resources3;
                        for (int i26 = 0; i26 < i24; i26++) {
                            asyy asyyVarBy = asxeVar2.by(i26);
                            if (asyyVarBy.aS() && asyyVarBy.aT().aM() == 2) {
                                long j35 = asyyVarBy.c;
                                ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableString2.getSpans(Memory.peekInt(j35 + 12, false), Memory.peekInt(j35 + 16, false), ForegroundColorSpan.class);
                                BulletSpan bulletSpan = foregroundColorSpanArr.length > 0 ? new BulletSpan(20, foregroundColorSpanArr[0].getForegroundColor()) : new BulletSpan(20);
                                long j36 = asyyVarBy.c;
                                rpi.s(spannableString2, bulletSpan, Memory.peekInt(j36 + 12, false), (Memory.peekByte(asyyVarBy.c + 8) & 2) != 0, Memory.peekInt(j36 + 16, false));
                            }
                        }
                        int i27 = 0;
                        while (true) {
                            i21 = i21;
                            if (i27 >= i21) {
                                int i28 = i20;
                                String strBi = asxeVar.bi();
                                if (asxeVar.bp() && Float.intBitsToFloat(Memory.peekInt(asxeVar.bw().c + 12, false)) > 0.0f) {
                                    rpi.s(spannableString2, new oxx(TypedValue.applyDimension(2, Float.intBitsToFloat(Memory.peekInt(asxeVar.bw().c + 12, false)), displayMetrics)), 0, true, strBi.length());
                                }
                                for (int i29 = 0; i29 < i28; i29++) {
                                    asyu asyuVarBx = asxeVar.bx(i29);
                                    if ((Memory.peekByte(asyuVarBx.c + 8) & 4) != 0) {
                                        if (asyuVarBx.f == null) {
                                            if ((Memory.peekByte(asyuVarBx.c + 8) & 4) != 0) {
                                                asyuVarBx.f = asyuVarBx.cq(asyu.e.b);
                                            } else {
                                                asyuVarBx.f = "";
                                            }
                                        }
                                        LocaleSpan localeSpan = new LocaleSpan(Locale.forLanguageTag(asyuVarBx.f));
                                        long j37 = asyuVarBx.c;
                                        long j38 = j37 + 12;
                                        spannableString2.setSpan(localeSpan, Memory.peekInt(j38, false), Memory.peekInt(j38, false) + Memory.peekInt(j37 + 16, false), 17);
                                    }
                                }
                                return spannableString2;
                            }
                            asxa asxaVarBt = asxeVar2.bt(i27);
                            if (owjVar == 0 || owjVar.equals(owj.a)) {
                                i3 = i27;
                                if (asxaVarBt == null || !asxaVarBt.aT()) {
                                    strAR = null;
                                } else {
                                    atgg atggVarAV = asxaVarBt.aV();
                                    if (atggVarAV.aZ()) {
                                        mew mewVarBb = atggVarAV.bb();
                                        mep mepVar4 = atjc.d;
                                        if (mewVarBb.e(mepVar4)) {
                                            atjc atjcVar = (atjc) mewVarBb.d(mepVar4);
                                            if (atjcVar.aU()) {
                                                atiq atiqVarBc = atjcVar.bc();
                                                if (atiqVarBc.aS() > 0) {
                                                    strAR = atiqVarBc.aY(0).aR();
                                                } else {
                                                    strAR = null;
                                                }
                                            } else {
                                                strAR = null;
                                            }
                                        } else {
                                            strAR = null;
                                        }
                                    } else {
                                        strAR = null;
                                    }
                                }
                                ouiVar.a(aslh.LOG_TYPE_CONFIGURATION_ERROR, strAR != null ? a.bT(strAR, "Has attachmentRuns with URL '", "' but drawableRequester is missing.") : "Has attachmentRuns but drawableRequester is missing.");
                            } else {
                                int iB = b(displayMetrics);
                                long j39 = asxaVarBt.c;
                                int iPeekInt20 = Memory.peekInt(j39 + 12, false);
                                int iPeekInt21 = Memory.peekInt(j39 + 16, false);
                                if (iPeekInt21 == 0) {
                                    ouiVar.a(aslh.LOG_TYPE_INVALID_FIELD, "AttachmentRun with 0 length found. This probably means the AttributedString hasn't been adjusted to account for zero-length (inserted) AttachmentRun's.");
                                } else if (asxaVarBt.aT()) {
                                    atgg atggVarAV2 = asxaVarBt.aV();
                                    if (atggVarAV2.aZ()) {
                                        mew mewVarBb2 = atggVarAV2.bb();
                                        mep mepVar5 = atjc.d;
                                        if (mewVarBb2.e(mepVar5)) {
                                            atjc atjcVar2 = (atjc) mewVarBb2.d(mepVar5);
                                            int iAU = asxaVarBt.aU();
                                            if (atjcVar2.aU()) {
                                                atiq atiqVarBc2 = atjcVar2.bc();
                                                atjt atjtVar = (atjt) atggVarAV2.ba().d(atjt.d);
                                                atey ateyVarAT = atjtVar.cm() ? atjtVar.aT() : null;
                                                atey ateyVarAS = atjtVar.aR() ? atjtVar.aS() : null;
                                                i3 = i27;
                                                float f10 = displayMetrics.density;
                                                if (ateyVarAT == null) {
                                                    iJniGetDimensionInPixel = -1;
                                                } else {
                                                    UpbMessage upbMessage = ateyVarAT.b;
                                                    iJniGetDimensionInPixel = DimensionUnitConverter.jniGetDimensionInPixel(upbMessage.a, upbMessage.c.a, f10);
                                                }
                                                if (iJniGetDimensionInPixel > 0 || (iJniGetDimensionInPixel = rpi.j(spannableString2, iPeekInt20)) > 0) {
                                                    i4 = iJniGetDimensionInPixel;
                                                }
                                                if (ateyVarAS == null || !DimensionUnitConverter.c(ateyVarAS)) {
                                                    i4 = iB;
                                                    i4 = iB;
                                                    i4 = iB;
                                                    i4 = iB;
                                                    iIntBitsToFloat = i4;
                                                } else {
                                                    int iAT = ateyVarAS.aT() - 1;
                                                    if (iAT == 1) {
                                                        float fIntBitsToFloat5 = Float.intBitsToFloat(Memory.peekInt(ateyVarAS.c + 12, false)) * f10;
                                                        double d3 = fIntBitsToFloat5;
                                                        if (fIntBitsToFloat5 > 0.0f) {
                                                            i4 = iB;
                                                            d2 = 0.5d;
                                                        } else {
                                                            i4 = iB;
                                                            d2 = -0.5d;
                                                        }
                                                        iIntBitsToFloat = (int) (d3 + d2);
                                                    } else if (iAT != 2 || (iIntBitsToFloat = (int) (Float.intBitsToFloat(Memory.peekInt(ateyVarAS.c + 12, false)) * i4)) < 0) {
                                                        i4 = iB;
                                                        i4 = iB;
                                                        i4 = iB;
                                                        i4 = iB;
                                                        iIntBitsToFloat = i4;
                                                    }
                                                }
                                                if (i4 < 0 || iIntBitsToFloat < 0) {
                                                    ouiVar.a(aslh.LOG_TYPE_INVALID_FIELD, "Attachment run requires widthDimension and heightDimension in LayoutProperties.");
                                                } else {
                                                    Resources resources12 = resources11;
                                                    oxp oxpVarB = oxp.b(resources12, f10, i4, iIntBitsToFloat, atjtVar);
                                                    atiq atiqVarBa = atjcVar2.aS() ? atjcVar2.ba() : null;
                                                    if (atjcVar2.aT()) {
                                                        int i30 = iIntBitsToFloat;
                                                        atiqVarBb = atjcVar2.bb();
                                                        i5 = i30;
                                                    } else {
                                                        i5 = iIntBitsToFloat;
                                                        atiqVarBb = null;
                                                    }
                                                    resources11 = resources12;
                                                    owjVar.a(context, atiqVarBc2, atiqVarBa, atiqVarBb, kjcVar, i4, i5, oxpVarB, ouiVar);
                                                    rpi.s(spannableString2, new oxt(oxpVarB, iAU), iPeekInt20, true, iPeekInt21);
                                                }
                                            } else {
                                                ouiVar.a(aslh.LOG_TYPE_MISSING_FIELD, "Image of ImageType missing in Attachment");
                                            }
                                        } else {
                                            ouiVar.a(aslh.LOG_TYPE_INVALID_FIELD, "Attachment run doesn't contain ImageType extension");
                                        }
                                    } else {
                                        ouiVar.a(aslh.LOG_TYPE_MISSING_FIELD, "AttachmentRun contains element with no type");
                                    }
                                } else {
                                    ouiVar.a(aslh.LOG_TYPE_MISSING_FIELD, "Element missing in AttachmentRun");
                                }
                                i3 = i27;
                            }
                            i27 = i3 + 1;
                            i20 = i20;
                            asxeVar2 = asxeVar;
                        }
                    }
                }
            }
        }
    }

    public static CharSequence p(Context context, DisplayMetrics displayMetrics, asxe asxeVar, orq orqVar, nxl nxlVar, oui ouiVar, Map map, owj owjVar, kjc kjcVar) {
        return asxeVar == null ? "" : o(context, displayMetrics, asxeVar, m(asxeVar), orqVar, nxlVar, ouiVar, map, owjVar, kjcVar, 0);
    }

    public static yvh q(asxe asxeVar, CharSequence charSequence, int i, TextPaint textPaint, Layout.Alignment alignment, TextDirectionHeuristic textDirectionHeuristic, int i2, ElementsServices elementsServices, nxl nxlVar, oui ouiVar, kjc kjcVar, Map map, owj owjVar) {
        CharSequence charSequenceO = o(elementsServices.c(), elementsServices.e(), asxeVar, charSequence, elementsServices.l(), nxlVar, ouiVar, map, owjVar, kjcVar, 0);
        TextPaint textPaint2 = new TextPaint(textPaint);
        textPaint2.bgColor = textPaint.bgColor;
        textPaint2.baselineShift = textPaint.baselineShift;
        textPaint2.linkColor = textPaint.linkColor;
        textPaint2.drawableState = textPaint.drawableState;
        textPaint2.density = textPaint.density;
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint2.underlineColor = textPaint.underlineColor;
            textPaint2.underlineThickness = textPaint.underlineThickness;
        }
        f(textPaint2, charSequenceO, elementsServices.d());
        Layout layoutJ = j(charSequenceO, textPaint2, rpi.k(charSequenceO, textPaint2, i2), alignment, textDirectionHeuristic, asxeVar, elementsServices);
        return (i == Integer.MAX_VALUE || layoutJ.getLineCount() <= i) ? new yvh(charSequenceO, textPaint2, i, layoutJ) : new yvh(charSequenceO, textPaint2, i, (Layout) null);
    }

    private static Layout.Alignment r(String str, Layout.Alignment alignment) {
        try {
            return Layout.Alignment.valueOf(str);
        } catch (IllegalArgumentException | NullPointerException unused) {
            return alignment;
        }
    }

    private static void s(CharacterStyle[] characterStyleArr, Spanned spanned) {
        Arrays.sort(characterStyleArr, new fui(spanned, 5, null));
    }

    private static void t(SpannableString spannableString, Layout layout, int i) {
        if (layout.getText() instanceof Spanned) {
            Spanned spanned = (Spanned) layout.getText();
            boolean z = Memory.peekByte(FlagServices.b().c + 35) != 0;
            int iMin = z ? Math.min(Math.max(i - 1, 0), spanned.length() - 1) : Math.min(Math.max(i, 0), spanned.length() - 1);
            if (iMin >= 0) {
                if (!z) {
                    HashSet<Object> hashSet = new HashSet();
                    Collections.addAll(hashSet, (CharacterStyle[]) spanned.getSpans(iMin, iMin, CharacterStyle.class));
                    int iMin2 = Math.min(Math.max(i + 1, 0), spanned.length() - 1);
                    Collections.addAll(hashSet, (CharacterStyle[]) spanned.getSpans(iMin2, iMin2, CharacterStyle.class));
                    for (Object obj : hashSet) {
                        if (!(obj instanceof oyb)) {
                            spannableString.setSpan(obj, 0, spannableString.length(), spanned.getSpanFlags(obj));
                        }
                    }
                    return;
                }
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(iMin, iMin, CharacterStyle.class);
                s(characterStyleArr, spanned);
                for (CharacterStyle characterStyle : characterStyleArr) {
                    if (!(characterStyle instanceof oyb) && !(characterStyle instanceof ClickableSpan)) {
                        spannableString.setSpan(characterStyle, 0, spannableString.length(), spanned.getSpanFlags(characterStyle));
                    }
                }
            }
        }
    }
}
