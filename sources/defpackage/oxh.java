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
import app.rive.semantics.SemanticState;
import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.text.experimental.Paragraph;
import com.google.android.libraries.multiplatform.elements.uibuilder.DimensionUnitConverter;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oxh {
    static final Layout.Alignment a = o("ALIGN_LEFT", Layout.Alignment.ALIGN_NORMAL);
    static final Layout.Alignment b = o("ALIGN_RIGHT", Layout.Alignment.ALIGN_OPPOSITE);
    public static final String[] c = {" "};
    public static final CharSequence[] d = {" "};

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

    public static int b(int i) {
        if (i != 1) {
            return i != 2 ? 0 : 4;
        }
        return 3;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0029  */
    /* JADX WARN: Code duplicated, block: B:20:0x002b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0038 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x003a  */
    /* JADX WARN: Code duplicated, block: B:26:0x003c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:28:0x003f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:31:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (r9 == 1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
    
        if (r9 == 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (r7 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        if (r7 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:?, code lost:
    
        return android.text.Layout.Alignment.ALIGN_OPPOSITE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.Layout.Alignment c(int r6, java.lang.CharSequence r7, android.text.TextDirectionHeuristic r8, int r9) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            r2 = 6
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 >= r1) goto L26
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L26
            if (r6 == r5) goto L23
            if (r6 == r4) goto L20
            if (r6 == r3) goto L42
            r0 = 5
            if (r6 == r0) goto L1e
            if (r6 != r2) goto L26
            if (r9 != r5) goto L20
            goto L23
        L1e:
            if (r9 != r5) goto L23
        L20:
            android.text.Layout$Alignment r6 = defpackage.oxh.b
            goto L4f
        L23:
            android.text.Layout$Alignment r6 = defpackage.oxh.a
            goto L4f
        L26:
            r0 = 0
            if (r9 == r5) goto L2b
            r9 = r0
            goto L2c
        L2b:
            r9 = r5
        L2c:
            int r1 = r7.length()
            boolean r7 = r8.isRtl(r7, r0, r1)
            if (r6 == r5) goto L48
            if (r6 == r4) goto L45
            if (r6 == r3) goto L42
            if (r6 == r2) goto L3f
            if (r7 != r9) goto L4a
            goto L4d
        L3f:
            if (r7 != r9) goto L4d
            goto L4a
        L42:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L4f
        L45:
            if (r7 == 0) goto L4a
            goto L4d
        L48:
            if (r7 == 0) goto L4d
        L4a:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L4f
        L4d:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
        L4f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxh.c(int, java.lang.CharSequence, android.text.TextDirectionHeuristic, int):android.text.Layout$Alignment");
    }

    public static Layout d(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, TextDirectionHeuristic textDirectionHeuristic, Paragraph paragraph, ElementsServices elementsServices) {
        StaticLayout.Builder textDirection = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setAlignment(alignment).setTextDirection(textDirectionHeuristic);
        textDirection.setIncludePad(paragraph.l());
        textDirection.setLineSpacing(paragraph.a() * elementsServices.a(), 1.0f);
        return textDirection.build();
    }

    public static TextUtils.TruncateAt e(int i) {
        if (i == 3) {
            return TextUtils.TruncateAt.START;
        }
        if (i == 4) {
            return TextUtils.TruncateAt.END;
        }
        if (i == 5) {
            return TextUtils.TruncateAt.MIDDLE;
        }
        if (i != 6) {
            return null;
        }
        return TextUtils.TruncateAt.MARQUEE;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0150  */
    public static CharSequence f(int i, Layout layout, CharSequence charSequence, boolean z) {
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
                        HashSet hashSet = new HashSet();
                        Collections.addAll(hashSet, (CharacterStyle[]) spanned.getSpans(iMin, iMin, CharacterStyle.class));
                        ArrayList arrayList = new ArrayList(hashSet);
                        Collections.sort(arrayList, new fui(spanned, 6, null));
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            CharacterStyle characterStyle = (CharacterStyle) arrayList.get(i2);
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
            i(spannableString, charSequence, ClickableSpan.class);
            i(spannableString, charSequence, ForegroundColorSpan.class);
            i(spannableString, charSequence, AbsoluteSizeSpan.class);
            i(spannableString, charSequence, UnderlineSpan.class);
            return spannableString;
        }
        if (z) {
            i(spannableString, charSequence, ClickableSpan.class);
            i(spannableString, charSequence, ForegroundColorSpan.class);
            i(spannableString, charSequence, AbsoluteSizeSpan.class);
            i(spannableString, charSequence, UnderlineSpan.class);
        } else {
            CharSequence text2 = layout.getText();
            if (text2 instanceof Spanned) {
                Spanned spanned2 = (Spanned) text2;
                int length2 = spannableString.length() - charSequence.length();
                int iMin2 = Math.min(Math.max(i, 0), spanned2.length() - 1);
                int iMin3 = Math.min(Math.max(i + 1, 0), spanned2.length() - 1);
                if (iMin2 >= 0 && length2 >= 0) {
                    HashSet<CharacterStyle> hashSet2 = new HashSet();
                    Collections.addAll(hashSet2, (CharacterStyle[]) spanned2.getSpans(iMin2, iMin2, CharacterStyle.class));
                    Collections.addAll(hashSet2, (CharacterStyle[]) spanned2.getSpans(iMin3, iMin3, CharacterStyle.class));
                    for (CharacterStyle characterStyle2 : hashSet2) {
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
                i(spannableString, charSequence, ClickableSpan.class);
                i(spannableString, charSequence, ForegroundColorSpan.class);
                i(spannableString, charSequence, AbsoluteSizeSpan.class);
                i(spannableString, charSequence, UnderlineSpan.class);
            }
        }
        return spannableString;
    }

    public static void g(TextPaint textPaint, CharSequence charSequence, float f, float f2) {
        int iMin = (int) ((f2 * 14.0f) + 0.5f);
        if (charSequence instanceof Spannable) {
            for (AbsoluteSizeSpan absoluteSizeSpan : (AbsoluteSizeSpan[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), AbsoluteSizeSpan.class)) {
                boolean dip = absoluteSizeSpan.getDip();
                int size = absoluteSizeSpan.getSize();
                if (dip) {
                    size = (int) ((size * f) + 0.5f);
                }
                iMin = Math.min(size, iMin);
            }
        }
        textPaint.setTextSize(iMin);
    }

    public static void h(SpannableString spannableString, Object obj, int i, int i2) {
        int iMin;
        int iMin2 = i < 0 ? 0 : Math.min(i, spannableString.length());
        if (i2 <= 0 || iMin2 == (iMin = Math.min(i2 + iMin2, spannableString.length()))) {
            return;
        }
        spannableString.setSpan(obj, iMin2, iMin, 18);
    }

    public static void i(SpannableString spannableString, CharSequence charSequence, Class cls) {
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
                            spannableString.setSpan(new oxg(clickableSpan), spanStart, length, 33);
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

    public static CharSequence j(String str) {
        return TextUtils.isEmpty(str) ? "" : str;
    }

    public static void k(SpannableString spannableString, Object obj) {
        int iMin = Math.min(0, spannableString.length());
        int length = spannableString.length();
        if (iMin != length) {
            spannableString.setSpan(obj, iMin, length, 18);
        }
    }

    public static void l(SpannableString spannableString, Layout layout, int i) {
        ArrayList arrayList;
        if (layout.getText() instanceof Spanned) {
            Spanned spanned = (Spanned) layout.getText();
            boolean z = Memory.peekByte(FlagServices.b().c + 35) != 0;
            int iMin = z ? Math.min(Math.max(i - 1, 0), spanned.length() - 1) : Math.min(Math.max(i, 0), spanned.length() - 1);
            if (iMin >= 0) {
                HashSet hashSet = new HashSet();
                Collections.addAll(hashSet, (CharacterStyle[]) spanned.getSpans(iMin, iMin, CharacterStyle.class));
                if (z) {
                    arrayList = new ArrayList(hashSet);
                    Collections.sort(arrayList, new fui(spanned, 7, null));
                } else {
                    int iMin2 = Math.min(Math.max(i + 1, 0), spanned.length() - 1);
                    Collections.addAll(hashSet, (CharacterStyle[]) spanned.getSpans(iMin2, iMin2, CharacterStyle.class));
                    arrayList = new ArrayList(hashSet);
                }
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    CharacterStyle characterStyle = (CharacterStyle) arrayList.get(i2);
                    if (!(characterStyle instanceof oyb) && (!z || !(characterStyle instanceof ClickableSpan))) {
                        spannableString.setSpan(characterStyle, 0, spannableString.length(), spanned.getSpanFlags(characterStyle));
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:109:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:111:0x020b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0213  */
    /* JADX WARN: Code duplicated, block: B:114:0x0223  */
    /* JADX WARN: Code duplicated, block: B:116:0x022b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0237  */
    /* JADX WARN: Code duplicated, block: B:120:0x0246  */
    /* JADX WARN: Code duplicated, block: B:121:0x0249  */
    /* JADX WARN: Code duplicated, block: B:124:0x0259 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x026a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0271  */
    /* JADX WARN: Code duplicated, block: B:132:0x027a  */
    /* JADX WARN: Code duplicated, block: B:133:0x027d  */
    /* JADX WARN: Code duplicated, block: B:135:0x0280  */
    /* JADX WARN: Code duplicated, block: B:138:0x0288  */
    /* JADX WARN: Code duplicated, block: B:141:0x028e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0291  */
    /* JADX WARN: Code duplicated, block: B:147:0x029d A[Catch: all -> 0x02f9, TryCatch #2 {all -> 0x02f9, blocks: (B:145:0x0294, B:147:0x029d, B:149:0x02ac), top: B:383:0x0294 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x02ac A[Catch: all -> 0x02f9, TRY_LEAVE, TryCatch #2 {all -> 0x02f9, blocks: (B:145:0x0294, B:147:0x029d, B:149:0x02ac), top: B:383:0x0294 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x02da  */
    /* JADX WARN: Code duplicated, block: B:154:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:167:0x030a  */
    /* JADX WARN: Code duplicated, block: B:169:0x0310  */
    /* JADX WARN: Code duplicated, block: B:171:0x0316  */
    /* JADX WARN: Code duplicated, block: B:172:0x0321  */
    /* JADX WARN: Code duplicated, block: B:173:0x032d  */
    /* JADX WARN: Code duplicated, block: B:175:0x0335  */
    /* JADX WARN: Code duplicated, block: B:177:0x033f  */
    /* JADX WARN: Code duplicated, block: B:180:0x034f  */
    /* JADX WARN: Code duplicated, block: B:190:0x037e  */
    /* JADX WARN: Code duplicated, block: B:191:0x0389  */
    /* JADX WARN: Code duplicated, block: B:202:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:204:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:206:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:207:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:210:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:212:0x03de  */
    /* JADX WARN: Code duplicated, block: B:247:0x0535  */
    /* JADX WARN: Code duplicated, block: B:345:0x0786 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:356:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:381:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x0294 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x03e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:393:0x03e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:46:0x0110  */
    /* JADX WARN: Code duplicated, block: B:48:0x0116  */
    /* JADX WARN: Code duplicated, block: B:52:0x0122  */
    /* JADX WARN: Code duplicated, block: B:54:0x012b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0144  */
    /* JADX WARN: Code duplicated, block: B:56:0x0148  */
    /* JADX WARN: Code duplicated, block: B:62:0x015f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0165  */
    /* JADX WARN: Code duplicated, block: B:66:0x016b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0179 A[Catch: all -> 0x0186, DONT_GENERATE, TryCatch #1 {, blocks: (B:68:0x016e, B:70:0x0179, B:72:0x0182), top: B:381:0x016e }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0182 A[Catch: all -> 0x0186, DONT_GENERATE, TryCatch #1 {, blocks: (B:68:0x016e, B:70:0x0179, B:72:0x0182), top: B:381:0x016e }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0188  */
    /* JADX WARN: Code duplicated, block: B:80:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:96:0x01dd A[Catch: all -> 0x01e4, DONT_GENERATE, TryCatch #0 {, blocks: (B:94:0x01d2, B:96:0x01dd, B:98:0x01e0), top: B:379:0x01d2 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01e0 A[Catch: all -> 0x01e4, DONT_GENERATE, TryCatch #0 {, blocks: (B:94:0x01d2, B:96:0x01dd, B:98:0x01e0), top: B:379:0x01d2 }] */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object, oxr] */
    /* JADX WARN: Type inference failed for: r4v63, types: [java.lang.Object, nxl] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:386:? -> B:162:0x02fd). Please report as a decompilation issue!!! */
    public static CharSequence m(Context context, DisplayMetrics displayMetrics, Paragraph paragraph, CharSequence charSequence, orq orqVar, tld tldVar, oui ouiVar, Map map, owj owjVar, kjc kjcVar, int i) throws Throwable {
        Locale localeForLanguageTag;
        int iJniGetDimensionInPixel;
        int i2;
        int i3;
        int iIntBitsToFloat;
        int i4;
        int i5;
        int i6;
        float fJniGetSpanFontSize;
        float f;
        boolean z;
        int iJ;
        float f2;
        float f3;
        int iG;
        int i7;
        boolean zJniGetSpanItalic;
        int i8;
        int i9;
        String strJniGetSpanFontFamily;
        String strJniGetSpanFontVariationSettings;
        boolean z2;
        String str;
        oxk oxkVar;
        String str2;
        String str3;
        int iD;
        Typeface typefaceG;
        oxl oxlVar;
        oxl oxlVar2;
        String str4;
        boolean z3;
        Object obj;
        Object obj2;
        String strAe;
        oxl oxlVar3;
        int iHashCode;
        int i10;
        int iHashCode2;
        Object obj3;
        int i11;
        int iH;
        String str5;
        String str6;
        Object obj4;
        float fJniSpanGetLetterSpacing;
        int iJniSpanGetBaselineOffset;
        int iJniSpanGetStrikethrough;
        int iJniSpanGetUnderline;
        float f4;
        float f5;
        Context context2 = context;
        Paragraph paragraph2 = paragraph;
        if (TextUtils.isEmpty(charSequence) || TextUtils.isEmpty(charSequence)) {
            return "";
        }
        SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
        int i12 = paragraph2.a;
        if ((i12 & 64) != 0) {
            h(spannableStringValueOf, new ForegroundColorSpan(Paragraph.jniGetParagraphStyleFontColor(paragraph2.paragraphHandle)), 0, spannableStringValueOf.length());
        }
        if ((i12 & 1) != 0) {
            int iJniGetCommandRunCount = Paragraph.jniGetCommandRunCount(paragraph2.paragraphHandle);
            int i13 = 0;
            while (i13 < iJniGetCommandRunCount) {
                int iJniGetCommandRunStart = Paragraph.jniGetCommandRunStart(paragraph2.paragraphHandle, i13);
                int iJniGetCommandRunLength = Paragraph.jniGetCommandRunLength(paragraph2.paragraphHandle, i13);
                long jJniGetCommandRunOnTap = Paragraph.jniGetCommandRunOnTap(paragraph2.paragraphHandle, i13);
                mew mewVar = jJniGetCommandRunOnTap == 0 ? null : new mew(new UpbMessage(jJniGetCommandRunOnTap, atcm.a, paragraph2.b));
                long jJniGetCommandRunOnLongPress = Paragraph.jniGetCommandRunOnLongPress(paragraph2.paragraphHandle, i13);
                mew mewVar2 = jJniGetCommandRunOnLongPress == 0 ? null : new mew(new UpbMessage(jJniGetCommandRunOnLongPress, atcm.a, paragraph2.b));
                String strJniGetCommandRunAccessibilityLabel = Paragraph.jniGetCommandRunAccessibilityLabel(paragraph2.paragraphHandle, i13);
                if (mewVar != null || mewVar2 != null) {
                    h(spannableStringValueOf, new oxv(mewVar, mewVar2, strJniGetCommandRunAccessibilityLabel, orqVar), iJniGetCommandRunStart, iJniGetCommandRunLength);
                }
                i13++;
                iJniGetCommandRunCount = iJniGetCommandRunCount;
                i12 = i12;
            }
        }
        int i14 = i12;
        Resources resources = context2.getResources();
        float f6 = displayMetrics.density;
        float f7 = displayMetrics.scaledDensity;
        int i15 = 0;
        for (int iJniGetSpanCount = Paragraph.jniGetSpanCount(paragraph2.paragraphHandle); i15 < iJniGetSpanCount; iJniGetSpanCount = i9) {
            int i16 = paragraph2.i(i15);
            int iH2 = paragraph2.h(i15);
            if (paragraph2.n(i15)) {
                h(spannableStringValueOf, new ForegroundColorSpan(paragraph2.f(i15)), i16, iH2);
            }
            if (i != 0) {
                fJniGetSpanFontSize = i;
            } else {
                fJniGetSpanFontSize = Paragraph.jniGetSpanFontSize(paragraph2.paragraphHandle, i15);
                if (fJniGetSpanFontSize <= 0.0f) {
                    f = 0.0f;
                    z = false;
                }
                if (z) {
                    float f8 = f;
                    if (Paragraph.jniSpanGetFontSizeUnit(paragraph2.paragraphHandle, i15) == 1) {
                        f5 = f6;
                    } else {
                        f5 = f7;
                    }
                    f2 = f8 * f5;
                    h(spannableStringValueOf, new AbsoluteSizeSpan(Math.round(f2), false), i16, iH2);
                } else {
                    iJ = rpi.j(spannableStringValueOf, i16);
                    if (iJ <= 0) {
                        iJ = (int) ((14.0f * f7) + 0.5f);
                    }
                    f2 = iJ;
                }
                if ((i14 & 33554432) != 0) {
                    f4 = f2;
                    if (Paragraph.jniSpanHasBackgroundColor(paragraph2.paragraphHandle, i15)) {
                        f3 = f4;
                        h(spannableStringValueOf, new oxy(Paragraph.jniSpanGetBackgroundColor(paragraph2.paragraphHandle, i15), Paragraph.jniSpanGetBackgroundCornerRadius(paragraph2.paragraphHandle, i15), null), i16, iH2);
                    } else {
                        f3 = f4;
                    }
                } else {
                    f3 = f2;
                }
                if (paragraph2.g(i15) == 0 || paragraph2.b() != 0) {
                    iG = paragraph2.g(i15);
                    if (iG == 0) {
                        iG = paragraph2.b();
                    }
                    if (iG != 0) {
                        obj4 = tldVar.a;
                        synchronized (obj4) {
                            oxlVar3 = (oxl) ((aga) obj4).a(iG);
                            if (oxlVar3 != null) {
                                i9 = iJniGetSpanCount;
                                i7 = 3;
                            } else {
                                int iJniGetSpanFontWeight = Paragraph.jniGetSpanFontWeight(paragraph2.paragraphHandle, i15);
                                int i17 = iJniGetSpanCount;
                                i7 = 3;
                                zJniGetSpanItalic = Paragraph.jniGetSpanItalic(paragraph2.paragraphHandle, i15);
                                i8 = iJniGetSpanFontWeight;
                                i9 = i17;
                                strJniGetSpanFontFamily = Paragraph.jniGetSpanFontFamily(paragraph2.paragraphHandle, i15);
                                strJniGetSpanFontVariationSettings = Paragraph.jniGetSpanFontVariationSettings(paragraph2.paragraphHandle, i15);
                                if (iG != 0) {
                                    if (strJniGetSpanFontFamily == null) {
                                        iHashCode = 0;
                                    } else {
                                        iHashCode = strJniGetSpanFontFamily.hashCode();
                                    }
                                    int i18 = ((iHashCode + 31) * 31) + i8;
                                    if (true != zJniGetSpanItalic) {
                                        i10 = 1237;
                                    } else {
                                        i10 = 1231;
                                    }
                                    int i19 = ((i18 * 31) + i10) * 31;
                                    if (strJniGetSpanFontVariationSettings == null) {
                                        iHashCode2 = 0;
                                    } else {
                                        iHashCode2 = strJniGetSpanFontVariationSettings.hashCode();
                                    }
                                    iG = i19 + iHashCode2;
                                    obj3 = tldVar.a;
                                    synchronized (obj3) {
                                        oxlVar = (oxl) ((aga) obj3).a(iG);
                                        if (oxlVar != null) {
                                        }
                                    }
                                    oxlVar3 = oxlVar;
                                }
                                if (ahno.aa(strJniGetSpanFontFamily)) {
                                    z2 = zJniGetSpanItalic;
                                } else {
                                    strAe = ahno.ae(strJniGetSpanFontFamily);
                                    if (strAe.endsWith("-bold-italic")) {
                                        strJniGetSpanFontFamily = strJniGetSpanFontFamily.substring(0, strJniGetSpanFontFamily.length() - 12);
                                        i8 = 700;
                                    } else if (strAe.endsWith("-bold")) {
                                        strJniGetSpanFontFamily = strJniGetSpanFontFamily.substring(0, strJniGetSpanFontFamily.length() - 5);
                                        z2 = zJniGetSpanItalic;
                                        i8 = 700;
                                    } else if (strAe.endsWith("-italic")) {
                                        strJniGetSpanFontFamily = strJniGetSpanFontFamily.substring(0, strJniGetSpanFontFamily.length() - 7);
                                    } else {
                                        z2 = zJniGetSpanItalic;
                                    }
                                    z2 = true;
                                }
                                str = strJniGetSpanFontFamily;
                                if (true == ahno.aa(strJniGetSpanFontFamily)) {
                                    str2 = "default";
                                } else {
                                    str2 = str;
                                }
                                oxkVar = new oxk(str2, i8, z2);
                                str3 = oxkVar.a;
                                iD = tldVar.b.d(str3);
                                if (iD == 2 && strJniGetSpanFontVariationSettings == null) {
                                    oxlVar2 = null;
                                    Typeface typefaceG2 = tldVar.G(context2, oxkVar, null);
                                    oxlVar = typefaceG2 != null ? new oxl(typefaceG2, null, str3, false) : oxlVar2;
                                } else {
                                    typefaceG = tldVar.G(context2, oxkVar, null);
                                    if (typefaceG != null) {
                                        if (true != nya.a()) {
                                            str4 = strJniGetSpanFontVariationSettings;
                                        } else {
                                            str4 = null;
                                        }
                                        if (iD != 1 || nya.a()) {
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                        oxlVar2 = new oxl(typefaceG, str4, str3, z3);
                                    } else {
                                        oxlVar = null;
                                    }
                                }
                                if (oxlVar != null) {
                                    obj = tldVar.a;
                                    synchronized (obj) {
                                        try {
                                            if (((aga) obj).e >= 128) {
                                                ((aga) obj).e = 0;
                                                if (((aga) obj).a != agv.a) {
                                                    atqq.aZ(((aga) obj).a, -9187201950435737472L);
                                                    long[] jArr = ((aga) obj).a;
                                                    int i20 = ((aga) obj).d;
                                                    int i21 = i20 >> 3;
                                                    obj2 = obj;
                                                    long j = 255 << ((i20 & 7) << 3);
                                                    try {
                                                        jArr[i21] = (jArr[i21] & (~j)) | j;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        throw th;
                                                    }
                                                } else {
                                                    obj2 = obj;
                                                }
                                                atqq.bc(((aga) obj2).c, 0, ((aga) obj2).d);
                                                ((aga) obj2).f();
                                            } else {
                                                obj2 = obj;
                                            }
                                            ((aga) obj2).d(iG, oxlVar);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            obj2 = obj;
                                            throw th;
                                        }
                                    }
                                }
                                oxlVar3 = oxlVar;
                            }
                        }
                    } else {
                        int iJniGetSpanFontWeight2 = Paragraph.jniGetSpanFontWeight(paragraph2.paragraphHandle, i15);
                        int i110 = iJniGetSpanCount;
                        i7 = 3;
                        zJniGetSpanItalic = Paragraph.jniGetSpanItalic(paragraph2.paragraphHandle, i15);
                        i8 = iJniGetSpanFontWeight2;
                        i9 = i110;
                        strJniGetSpanFontFamily = Paragraph.jniGetSpanFontFamily(paragraph2.paragraphHandle, i15);
                        strJniGetSpanFontVariationSettings = Paragraph.jniGetSpanFontVariationSettings(paragraph2.paragraphHandle, i15);
                        if (iG != 0) {
                            if (strJniGetSpanFontFamily == null) {
                                iHashCode = 0;
                            } else {
                                iHashCode = strJniGetSpanFontFamily.hashCode();
                            }
                            int i111 = ((iHashCode + 31) * 31) + i8;
                            if (true != zJniGetSpanItalic) {
                                i10 = 1237;
                            } else {
                                i10 = 1231;
                            }
                            int i112 = ((i111 * 31) + i10) * 31;
                            if (strJniGetSpanFontVariationSettings == null) {
                                iHashCode2 = 0;
                            } else {
                                iHashCode2 = strJniGetSpanFontVariationSettings.hashCode();
                            }
                            iG = i112 + iHashCode2;
                            obj3 = tldVar.a;
                            synchronized (obj3) {
                                oxlVar = (oxl) ((aga) obj3).a(iG);
                                if (oxlVar != null) {
                                }
                                oxlVar3 = oxlVar;
                            }
                        }
                        if (ahno.aa(strJniGetSpanFontFamily)) {
                            strAe = ahno.ae(strJniGetSpanFontFamily);
                            if (strAe.endsWith("-bold-italic")) {
                                strJniGetSpanFontFamily = strJniGetSpanFontFamily.substring(0, strJniGetSpanFontFamily.length() - 12);
                                i8 = 700;
                            } else if (strAe.endsWith("-bold")) {
                                strJniGetSpanFontFamily = strJniGetSpanFontFamily.substring(0, strJniGetSpanFontFamily.length() - 5);
                                z2 = zJniGetSpanItalic;
                                i8 = 700;
                            } else if (strAe.endsWith("-italic")) {
                                strJniGetSpanFontFamily = strJniGetSpanFontFamily.substring(0, strJniGetSpanFontFamily.length() - 7);
                            } else {
                                z2 = zJniGetSpanItalic;
                            }
                            z2 = true;
                        } else {
                            z2 = zJniGetSpanItalic;
                        }
                        str = strJniGetSpanFontFamily;
                        if (true == ahno.aa(strJniGetSpanFontFamily)) {
                            str2 = "default";
                        } else {
                            str2 = str;
                        }
                        oxkVar = new oxk(str2, i8, z2);
                        str3 = oxkVar.a;
                        iD = tldVar.b.d(str3);
                        if (iD == 2) {
                            typefaceG = tldVar.G(context2, oxkVar, null);
                            if (typefaceG != null) {
                                if (true != nya.a()) {
                                    str4 = strJniGetSpanFontVariationSettings;
                                } else {
                                    str4 = null;
                                }
                                if (iD != 1) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                oxlVar2 = new oxl(typefaceG, str4, str3, z3);
                            } else {
                                oxlVar = null;
                            }
                        } else {
                            typefaceG = tldVar.G(context2, oxkVar, null);
                            if (typefaceG != null) {
                                if (true != nya.a()) {
                                    str4 = strJniGetSpanFontVariationSettings;
                                } else {
                                    str4 = null;
                                }
                                if (iD != 1) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                oxlVar2 = new oxl(typefaceG, str4, str3, z3);
                            } else {
                                oxlVar = null;
                            }
                        }
                        if (oxlVar != null) {
                            obj = tldVar.a;
                            synchronized (obj) {
                                if (((aga) obj).e >= 128) {
                                    ((aga) obj).e = 0;
                                    if (((aga) obj).a != agv.a) {
                                        atqq.aZ(((aga) obj).a, -9187201950435737472L);
                                        long[] jArr2 = ((aga) obj).a;
                                        int i22 = ((aga) obj).d;
                                        int i23 = i22 >> 3;
                                        obj2 = obj;
                                        long j2 = 255 << ((i22 & 7) << 3);
                                        jArr2[i23] = (jArr2[i23] & (~j2)) | j2;
                                    } else {
                                        obj2 = obj;
                                    }
                                    atqq.bc(((aga) obj2).c, 0, ((aga) obj2).d);
                                    ((aga) obj2).f();
                                } else {
                                    obj2 = obj;
                                }
                                ((aga) obj2).d(iG, oxlVar);
                            }
                        }
                        oxlVar3 = oxlVar;
                    }
                    i11 = paragraph2.i(i15);
                    iH = paragraph2.h(i15);
                    if (oxlVar3 != null) {
                        str5 = oxlVar3.b;
                        str6 = oxlVar3.c;
                        if (str5 != null) {
                            Typeface typeface = oxlVar3.a;
                            if (true != oxlVar3.d) {
                                str5 = null;
                            }
                            h(spannableStringValueOf, new nys(str6, typeface, str5), i11, iH);
                        } else if (Build.VERSION.SDK_INT >= 28) {
                            h(spannableStringValueOf, new TypefaceSpan(oxlVar3.a), i11, iH);
                        } else {
                            h(spannableStringValueOf, new nys(str6, oxlVar3.a, null), i11, iH);
                        }
                    } else {
                        ouiVar.a(aslh.LOG_TYPE_INTERNAL_ERROR, "Failed to resolve Typeface from foundryCache");
                    }
                } else {
                    i9 = iJniGetSpanCount;
                    f7 = f7;
                    i7 = 3;
                }
                if ((i14 & 2097152) == 0) {
                    f7 = f7;
                } else {
                    iJniSpanGetUnderline = Paragraph.jniSpanGetUnderline(paragraph2.paragraphHandle, i15);
                    if (iJniSpanGetUnderline != 2 || iJniSpanGetUnderline == i7) {
                        f7 = f7;
                        h(spannableStringValueOf, new UnderlineSpan(), i16, iH2);
                    } else if (iJniSpanGetUnderline == 4) {
                        DisplayMetrics displayMetrics2 = new DisplayMetrics();
                        displayMetrics2.density = f6;
                        f7 = f7;
                        displayMetrics2.scaledDensity = f7;
                        h(spannableStringValueOf, new mrp(displayMetrics2, paragraph2.n(i15) ? paragraph2.f(i15) : 0), i16, iH2);
                    } else {
                        f7 = f7;
                    }
                }
                if ((i14 & 4194304) != 0 && ((iJniSpanGetStrikethrough = Paragraph.jniSpanGetStrikethrough(paragraph2.paragraphHandle, i15)) == 2 || iJniSpanGetStrikethrough == 3 || iJniSpanGetStrikethrough == 4)) {
                    h(spannableStringValueOf, new StrikethroughSpan(), i16, iH2);
                }
                if ((i14 & 16777216) != 0) {
                    iJniSpanGetBaselineOffset = Paragraph.jniSpanGetBaselineOffset(paragraph2.paragraphHandle, i15);
                    if (iJniSpanGetBaselineOffset != 1) {
                        h(spannableStringValueOf, new oxu(1, f3), i16, iH2);
                    } else if (iJniSpanGetBaselineOffset == 2) {
                        h(spannableStringValueOf, new oxu(2, f3), i16, iH2);
                    }
                }
                if ((i14 & 8388608) != 0) {
                    fJniSpanGetLetterSpacing = Paragraph.jniSpanGetLetterSpacing(paragraph2.paragraphHandle, i15);
                    if (fJniSpanGetLetterSpacing != 0.0f) {
                        h(spannableStringValueOf, new nyt(fJniSpanGetLetterSpacing), i16, iH2);
                    }
                }
                i15++;
                context2 = context;
            }
            f = fJniGetSpanFontSize;
            z = true;
            if (z) {
                float f9 = f;
                if (Paragraph.jniSpanGetFontSizeUnit(paragraph2.paragraphHandle, i15) == 1) {
                    f5 = f6;
                } else {
                    f5 = f7;
                }
                f2 = f9 * f5;
                h(spannableStringValueOf, new AbsoluteSizeSpan(Math.round(f2), false), i16, iH2);
            } else {
                iJ = rpi.j(spannableStringValueOf, i16);
                if (iJ <= 0) {
                    iJ = (int) ((14.0f * f7) + 0.5f);
                }
                f2 = iJ;
            }
            if ((i14 & 33554432) != 0) {
                f4 = f2;
                if (Paragraph.jniSpanHasBackgroundColor(paragraph2.paragraphHandle, i15)) {
                    f3 = f4;
                    h(spannableStringValueOf, new oxy(Paragraph.jniSpanGetBackgroundColor(paragraph2.paragraphHandle, i15), Paragraph.jniSpanGetBackgroundCornerRadius(paragraph2.paragraphHandle, i15), null), i16, iH2);
                } else {
                    f3 = f4;
                }
            } else {
                f3 = f2;
            }
            if (paragraph2.g(i15) == 0) {
                iG = paragraph2.g(i15);
                if (iG == 0) {
                    iG = paragraph2.b();
                }
                if (iG != 0) {
                    obj4 = tldVar.a;
                    synchronized (obj4) {
                        oxlVar3 = (oxl) ((aga) obj4).a(iG);
                        if (oxlVar3 != null) {
                            i9 = iJniGetSpanCount;
                            i7 = 3;
                        } else {
                            int iJniGetSpanFontWeight3 = Paragraph.jniGetSpanFontWeight(paragraph2.paragraphHandle, i15);
                            int i113 = iJniGetSpanCount;
                            i7 = 3;
                            zJniGetSpanItalic = Paragraph.jniGetSpanItalic(paragraph2.paragraphHandle, i15);
                            i8 = iJniGetSpanFontWeight3;
                            i9 = i113;
                            strJniGetSpanFontFamily = Paragraph.jniGetSpanFontFamily(paragraph2.paragraphHandle, i15);
                            strJniGetSpanFontVariationSettings = Paragraph.jniGetSpanFontVariationSettings(paragraph2.paragraphHandle, i15);
                            if (iG != 0) {
                                if (strJniGetSpanFontFamily == null) {
                                    iHashCode = 0;
                                } else {
                                    iHashCode = strJniGetSpanFontFamily.hashCode();
                                }
                                int i114 = ((iHashCode + 31) * 31) + i8;
                                if (true != zJniGetSpanItalic) {
                                    i10 = 1237;
                                } else {
                                    i10 = 1231;
                                }
                                int i115 = ((i114 * 31) + i10) * 31;
                                if (strJniGetSpanFontVariationSettings == null) {
                                    iHashCode2 = 0;
                                } else {
                                    iHashCode2 = strJniGetSpanFontVariationSettings.hashCode();
                                }
                                iG = i115 + iHashCode2;
                                obj3 = tldVar.a;
                                synchronized (obj3) {
                                    oxlVar = (oxl) ((aga) obj3).a(iG);
                                    if (oxlVar != null) {
                                    }
                                    oxlVar3 = oxlVar;
                                }
                            }
                            if (ahno.aa(strJniGetSpanFontFamily)) {
                                strAe = ahno.ae(strJniGetSpanFontFamily);
                                if (strAe.endsWith("-bold-italic")) {
                                    strJniGetSpanFontFamily = strJniGetSpanFontFamily.substring(0, strJniGetSpanFontFamily.length() - 12);
                                    i8 = 700;
                                } else if (strAe.endsWith("-bold")) {
                                    strJniGetSpanFontFamily = strJniGetSpanFontFamily.substring(0, strJniGetSpanFontFamily.length() - 5);
                                    z2 = zJniGetSpanItalic;
                                    i8 = 700;
                                } else if (strAe.endsWith("-italic")) {
                                    strJniGetSpanFontFamily = strJniGetSpanFontFamily.substring(0, strJniGetSpanFontFamily.length() - 7);
                                } else {
                                    z2 = zJniGetSpanItalic;
                                }
                                z2 = true;
                            } else {
                                z2 = zJniGetSpanItalic;
                            }
                            str = strJniGetSpanFontFamily;
                            if (true == ahno.aa(strJniGetSpanFontFamily)) {
                                str2 = "default";
                            } else {
                                str2 = str;
                            }
                            oxkVar = new oxk(str2, i8, z2);
                            str3 = oxkVar.a;
                            iD = tldVar.b.d(str3);
                            if (iD == 2) {
                                typefaceG = tldVar.G(context2, oxkVar, null);
                                if (typefaceG != null) {
                                    if (true != nya.a()) {
                                        str4 = strJniGetSpanFontVariationSettings;
                                    } else {
                                        str4 = null;
                                    }
                                    if (iD != 1) {
                                        z3 = false;
                                    } else {
                                        z3 = false;
                                    }
                                    oxlVar2 = new oxl(typefaceG, str4, str3, z3);
                                } else {
                                    oxlVar = null;
                                }
                            } else {
                                typefaceG = tldVar.G(context2, oxkVar, null);
                                if (typefaceG != null) {
                                    if (true != nya.a()) {
                                        str4 = strJniGetSpanFontVariationSettings;
                                    } else {
                                        str4 = null;
                                    }
                                    if (iD != 1) {
                                        z3 = false;
                                    } else {
                                        z3 = false;
                                    }
                                    oxlVar2 = new oxl(typefaceG, str4, str3, z3);
                                } else {
                                    oxlVar = null;
                                }
                            }
                            if (oxlVar != null) {
                                obj = tldVar.a;
                                synchronized (obj) {
                                    if (((aga) obj).e >= 128) {
                                        ((aga) obj).e = 0;
                                        if (((aga) obj).a != agv.a) {
                                            atqq.aZ(((aga) obj).a, -9187201950435737472L);
                                            long[] jArr3 = ((aga) obj).a;
                                            int i24 = ((aga) obj).d;
                                            int i25 = i24 >> 3;
                                            obj2 = obj;
                                            long j3 = 255 << ((i24 & 7) << 3);
                                            jArr3[i25] = (jArr3[i25] & (~j3)) | j3;
                                        } else {
                                            obj2 = obj;
                                        }
                                        atqq.bc(((aga) obj2).c, 0, ((aga) obj2).d);
                                        ((aga) obj2).f();
                                    } else {
                                        obj2 = obj;
                                    }
                                    ((aga) obj2).d(iG, oxlVar);
                                }
                            }
                            oxlVar3 = oxlVar;
                        }
                    }
                } else {
                    int iJniGetSpanFontWeight4 = Paragraph.jniGetSpanFontWeight(paragraph2.paragraphHandle, i15);
                    int i116 = iJniGetSpanCount;
                    i7 = 3;
                    zJniGetSpanItalic = Paragraph.jniGetSpanItalic(paragraph2.paragraphHandle, i15);
                    i8 = iJniGetSpanFontWeight4;
                    i9 = i116;
                    strJniGetSpanFontFamily = Paragraph.jniGetSpanFontFamily(paragraph2.paragraphHandle, i15);
                    strJniGetSpanFontVariationSettings = Paragraph.jniGetSpanFontVariationSettings(paragraph2.paragraphHandle, i15);
                    if (iG != 0) {
                        if (strJniGetSpanFontFamily == null) {
                            iHashCode = 0;
                        } else {
                            iHashCode = strJniGetSpanFontFamily.hashCode();
                        }
                        int i117 = ((iHashCode + 31) * 31) + i8;
                        if (true != zJniGetSpanItalic) {
                            i10 = 1237;
                        } else {
                            i10 = 1231;
                        }
                        int i118 = ((i117 * 31) + i10) * 31;
                        if (strJniGetSpanFontVariationSettings == null) {
                            iHashCode2 = 0;
                        } else {
                            iHashCode2 = strJniGetSpanFontVariationSettings.hashCode();
                        }
                        iG = i118 + iHashCode2;
                        obj3 = tldVar.a;
                        synchronized (obj3) {
                            oxlVar = (oxl) ((aga) obj3).a(iG);
                            if (oxlVar != null) {
                            }
                            oxlVar3 = oxlVar;
                        }
                    }
                    if (ahno.aa(strJniGetSpanFontFamily)) {
                        strAe = ahno.ae(strJniGetSpanFontFamily);
                        if (strAe.endsWith("-bold-italic")) {
                            strJniGetSpanFontFamily = strJniGetSpanFontFamily.substring(0, strJniGetSpanFontFamily.length() - 12);
                            i8 = 700;
                        } else if (strAe.endsWith("-bold")) {
                            strJniGetSpanFontFamily = strJniGetSpanFontFamily.substring(0, strJniGetSpanFontFamily.length() - 5);
                            z2 = zJniGetSpanItalic;
                            i8 = 700;
                        } else if (strAe.endsWith("-italic")) {
                            strJniGetSpanFontFamily = strJniGetSpanFontFamily.substring(0, strJniGetSpanFontFamily.length() - 7);
                        } else {
                            z2 = zJniGetSpanItalic;
                        }
                        z2 = true;
                    } else {
                        z2 = zJniGetSpanItalic;
                    }
                    str = strJniGetSpanFontFamily;
                    if (true == ahno.aa(strJniGetSpanFontFamily)) {
                        str2 = "default";
                    } else {
                        str2 = str;
                    }
                    oxkVar = new oxk(str2, i8, z2);
                    str3 = oxkVar.a;
                    iD = tldVar.b.d(str3);
                    if (iD == 2) {
                        typefaceG = tldVar.G(context2, oxkVar, null);
                        if (typefaceG != null) {
                            if (true != nya.a()) {
                                str4 = strJniGetSpanFontVariationSettings;
                            } else {
                                str4 = null;
                            }
                            if (iD != 1) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            oxlVar2 = new oxl(typefaceG, str4, str3, z3);
                        } else {
                            oxlVar = null;
                        }
                    } else {
                        typefaceG = tldVar.G(context2, oxkVar, null);
                        if (typefaceG != null) {
                            if (true != nya.a()) {
                                str4 = strJniGetSpanFontVariationSettings;
                            } else {
                                str4 = null;
                            }
                            if (iD != 1) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            oxlVar2 = new oxl(typefaceG, str4, str3, z3);
                        } else {
                            oxlVar = null;
                        }
                    }
                    if (oxlVar != null) {
                        obj = tldVar.a;
                        synchronized (obj) {
                            if (((aga) obj).e >= 128) {
                                ((aga) obj).e = 0;
                                if (((aga) obj).a != agv.a) {
                                    atqq.aZ(((aga) obj).a, -9187201950435737472L);
                                    long[] jArr4 = ((aga) obj).a;
                                    int i26 = ((aga) obj).d;
                                    int i27 = i26 >> 3;
                                    obj2 = obj;
                                    long j4 = 255 << ((i26 & 7) << 3);
                                    jArr4[i27] = (jArr4[i27] & (~j4)) | j4;
                                } else {
                                    obj2 = obj;
                                }
                                atqq.bc(((aga) obj2).c, 0, ((aga) obj2).d);
                                ((aga) obj2).f();
                            } else {
                                obj2 = obj;
                            }
                            ((aga) obj2).d(iG, oxlVar);
                        }
                    }
                    oxlVar3 = oxlVar;
                }
                i11 = paragraph2.i(i15);
                iH = paragraph2.h(i15);
                if (oxlVar3 != null) {
                    str5 = oxlVar3.b;
                    str6 = oxlVar3.c;
                    if (str5 != null) {
                        Typeface typeface2 = oxlVar3.a;
                        if (true != oxlVar3.d) {
                            str5 = null;
                        }
                        h(spannableStringValueOf, new nys(str6, typeface2, str5), i11, iH);
                    } else if (Build.VERSION.SDK_INT >= 28) {
                        h(spannableStringValueOf, new TypefaceSpan(oxlVar3.a), i11, iH);
                    } else {
                        h(spannableStringValueOf, new nys(str6, oxlVar3.a, null), i11, iH);
                    }
                } else {
                    ouiVar.a(aslh.LOG_TYPE_INTERNAL_ERROR, "Failed to resolve Typeface from foundryCache");
                }
            } else {
                iG = paragraph2.g(i15);
                if (iG == 0) {
                    iG = paragraph2.b();
                }
                if (iG != 0) {
                    obj4 = tldVar.a;
                    synchronized (obj4) {
                        oxlVar3 = (oxl) ((aga) obj4).a(iG);
                        if (oxlVar3 != null) {
                            i9 = iJniGetSpanCount;
                            i7 = 3;
                        } else {
                            int iJniGetSpanFontWeight5 = Paragraph.jniGetSpanFontWeight(paragraph2.paragraphHandle, i15);
                            int i119 = iJniGetSpanCount;
                            i7 = 3;
                            zJniGetSpanItalic = Paragraph.jniGetSpanItalic(paragraph2.paragraphHandle, i15);
                            i8 = iJniGetSpanFontWeight5;
                            i9 = i119;
                            strJniGetSpanFontFamily = Paragraph.jniGetSpanFontFamily(paragraph2.paragraphHandle, i15);
                            strJniGetSpanFontVariationSettings = Paragraph.jniGetSpanFontVariationSettings(paragraph2.paragraphHandle, i15);
                            if (iG != 0) {
                                if (strJniGetSpanFontFamily == null) {
                                    iHashCode = 0;
                                } else {
                                    iHashCode = strJniGetSpanFontFamily.hashCode();
                                }
                                int i1110 = ((iHashCode + 31) * 31) + i8;
                                if (true != zJniGetSpanItalic) {
                                    i10 = 1237;
                                } else {
                                    i10 = 1231;
                                }
                                int i1111 = ((i1110 * 31) + i10) * 31;
                                if (strJniGetSpanFontVariationSettings == null) {
                                    iHashCode2 = 0;
                                } else {
                                    iHashCode2 = strJniGetSpanFontVariationSettings.hashCode();
                                }
                                iG = i1111 + iHashCode2;
                                obj3 = tldVar.a;
                                synchronized (obj3) {
                                    oxlVar = (oxl) ((aga) obj3).a(iG);
                                    if (oxlVar != null) {
                                    }
                                    oxlVar3 = oxlVar;
                                }
                            }
                            if (ahno.aa(strJniGetSpanFontFamily)) {
                                strAe = ahno.ae(strJniGetSpanFontFamily);
                                if (strAe.endsWith("-bold-italic")) {
                                    strJniGetSpanFontFamily = strJniGetSpanFontFamily.substring(0, strJniGetSpanFontFamily.length() - 12);
                                    i8 = 700;
                                } else if (strAe.endsWith("-bold")) {
                                    strJniGetSpanFontFamily = strJniGetSpanFontFamily.substring(0, strJniGetSpanFontFamily.length() - 5);
                                    z2 = zJniGetSpanItalic;
                                    i8 = 700;
                                } else if (strAe.endsWith("-italic")) {
                                    strJniGetSpanFontFamily = strJniGetSpanFontFamily.substring(0, strJniGetSpanFontFamily.length() - 7);
                                } else {
                                    z2 = zJniGetSpanItalic;
                                }
                                z2 = true;
                            } else {
                                z2 = zJniGetSpanItalic;
                            }
                            str = strJniGetSpanFontFamily;
                            if (true == ahno.aa(strJniGetSpanFontFamily)) {
                                str2 = "default";
                            } else {
                                str2 = str;
                            }
                            oxkVar = new oxk(str2, i8, z2);
                            str3 = oxkVar.a;
                            iD = tldVar.b.d(str3);
                            if (iD == 2) {
                                typefaceG = tldVar.G(context2, oxkVar, null);
                                if (typefaceG != null) {
                                    if (true != nya.a()) {
                                        str4 = strJniGetSpanFontVariationSettings;
                                    } else {
                                        str4 = null;
                                    }
                                    if (iD != 1) {
                                        z3 = false;
                                    } else {
                                        z3 = false;
                                    }
                                    oxlVar2 = new oxl(typefaceG, str4, str3, z3);
                                } else {
                                    oxlVar = null;
                                }
                            } else {
                                typefaceG = tldVar.G(context2, oxkVar, null);
                                if (typefaceG != null) {
                                    if (true != nya.a()) {
                                        str4 = strJniGetSpanFontVariationSettings;
                                    } else {
                                        str4 = null;
                                    }
                                    if (iD != 1) {
                                        z3 = false;
                                    } else {
                                        z3 = false;
                                    }
                                    oxlVar2 = new oxl(typefaceG, str4, str3, z3);
                                } else {
                                    oxlVar = null;
                                }
                            }
                            if (oxlVar != null) {
                                obj = tldVar.a;
                                synchronized (obj) {
                                    if (((aga) obj).e >= 128) {
                                        ((aga) obj).e = 0;
                                        if (((aga) obj).a != agv.a) {
                                            atqq.aZ(((aga) obj).a, -9187201950435737472L);
                                            long[] jArr5 = ((aga) obj).a;
                                            int i28 = ((aga) obj).d;
                                            int i29 = i28 >> 3;
                                            obj2 = obj;
                                            long j5 = 255 << ((i28 & 7) << 3);
                                            jArr5[i29] = (jArr5[i29] & (~j5)) | j5;
                                        } else {
                                            obj2 = obj;
                                        }
                                        atqq.bc(((aga) obj2).c, 0, ((aga) obj2).d);
                                        ((aga) obj2).f();
                                    } else {
                                        obj2 = obj;
                                    }
                                    ((aga) obj2).d(iG, oxlVar);
                                }
                            }
                            oxlVar3 = oxlVar;
                        }
                    }
                } else {
                    int iJniGetSpanFontWeight6 = Paragraph.jniGetSpanFontWeight(paragraph2.paragraphHandle, i15);
                    int i1112 = iJniGetSpanCount;
                    i7 = 3;
                    zJniGetSpanItalic = Paragraph.jniGetSpanItalic(paragraph2.paragraphHandle, i15);
                    i8 = iJniGetSpanFontWeight6;
                    i9 = i1112;
                    strJniGetSpanFontFamily = Paragraph.jniGetSpanFontFamily(paragraph2.paragraphHandle, i15);
                    strJniGetSpanFontVariationSettings = Paragraph.jniGetSpanFontVariationSettings(paragraph2.paragraphHandle, i15);
                    if (iG != 0) {
                        if (strJniGetSpanFontFamily == null) {
                            iHashCode = 0;
                        } else {
                            iHashCode = strJniGetSpanFontFamily.hashCode();
                        }
                        int i1113 = ((iHashCode + 31) * 31) + i8;
                        if (true != zJniGetSpanItalic) {
                            i10 = 1237;
                        } else {
                            i10 = 1231;
                        }
                        int i1114 = ((i1113 * 31) + i10) * 31;
                        if (strJniGetSpanFontVariationSettings == null) {
                            iHashCode2 = 0;
                        } else {
                            iHashCode2 = strJniGetSpanFontVariationSettings.hashCode();
                        }
                        iG = i1114 + iHashCode2;
                        obj3 = tldVar.a;
                        synchronized (obj3) {
                            oxlVar = (oxl) ((aga) obj3).a(iG);
                            if (oxlVar != null) {
                            }
                            oxlVar3 = oxlVar;
                        }
                    }
                    if (ahno.aa(strJniGetSpanFontFamily)) {
                        strAe = ahno.ae(strJniGetSpanFontFamily);
                        if (strAe.endsWith("-bold-italic")) {
                            strJniGetSpanFontFamily = strJniGetSpanFontFamily.substring(0, strJniGetSpanFontFamily.length() - 12);
                            i8 = 700;
                        } else if (strAe.endsWith("-bold")) {
                            strJniGetSpanFontFamily = strJniGetSpanFontFamily.substring(0, strJniGetSpanFontFamily.length() - 5);
                            z2 = zJniGetSpanItalic;
                            i8 = 700;
                        } else if (strAe.endsWith("-italic")) {
                            strJniGetSpanFontFamily = strJniGetSpanFontFamily.substring(0, strJniGetSpanFontFamily.length() - 7);
                        } else {
                            z2 = zJniGetSpanItalic;
                        }
                        z2 = true;
                    } else {
                        z2 = zJniGetSpanItalic;
                    }
                    str = strJniGetSpanFontFamily;
                    if (true == ahno.aa(strJniGetSpanFontFamily)) {
                        str2 = "default";
                    } else {
                        str2 = str;
                    }
                    oxkVar = new oxk(str2, i8, z2);
                    str3 = oxkVar.a;
                    iD = tldVar.b.d(str3);
                    if (iD == 2) {
                        typefaceG = tldVar.G(context2, oxkVar, null);
                        if (typefaceG != null) {
                            if (true != nya.a()) {
                                str4 = strJniGetSpanFontVariationSettings;
                            } else {
                                str4 = null;
                            }
                            if (iD != 1) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            oxlVar2 = new oxl(typefaceG, str4, str3, z3);
                        } else {
                            oxlVar = null;
                        }
                    } else {
                        typefaceG = tldVar.G(context2, oxkVar, null);
                        if (typefaceG != null) {
                            if (true != nya.a()) {
                                str4 = strJniGetSpanFontVariationSettings;
                            } else {
                                str4 = null;
                            }
                            if (iD != 1) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            oxlVar2 = new oxl(typefaceG, str4, str3, z3);
                        } else {
                            oxlVar = null;
                        }
                    }
                    if (oxlVar != null) {
                        obj = tldVar.a;
                        synchronized (obj) {
                            if (((aga) obj).e >= 128) {
                                ((aga) obj).e = 0;
                                if (((aga) obj).a != agv.a) {
                                    atqq.aZ(((aga) obj).a, -9187201950435737472L);
                                    long[] jArr6 = ((aga) obj).a;
                                    int i210 = ((aga) obj).d;
                                    int i211 = i210 >> 3;
                                    obj2 = obj;
                                    long j6 = 255 << ((i210 & 7) << 3);
                                    jArr6[i211] = (jArr6[i211] & (~j6)) | j6;
                                } else {
                                    obj2 = obj;
                                }
                                atqq.bc(((aga) obj2).c, 0, ((aga) obj2).d);
                                ((aga) obj2).f();
                            } else {
                                obj2 = obj;
                            }
                            ((aga) obj2).d(iG, oxlVar);
                        }
                    }
                    oxlVar3 = oxlVar;
                }
                i11 = paragraph2.i(i15);
                iH = paragraph2.h(i15);
                if (oxlVar3 != null) {
                    str5 = oxlVar3.b;
                    str6 = oxlVar3.c;
                    if (str5 != null) {
                        Typeface typeface3 = oxlVar3.a;
                        if (true != oxlVar3.d) {
                            str5 = null;
                        }
                        h(spannableStringValueOf, new nys(str6, typeface3, str5), i11, iH);
                    } else if (Build.VERSION.SDK_INT >= 28) {
                        h(spannableStringValueOf, new TypefaceSpan(oxlVar3.a), i11, iH);
                    } else {
                        h(spannableStringValueOf, new nys(str6, oxlVar3.a, null), i11, iH);
                    }
                } else {
                    ouiVar.a(aslh.LOG_TYPE_INTERNAL_ERROR, "Failed to resolve Typeface from foundryCache");
                }
            }
            if ((i14 & 2097152) == 0) {
                f7 = f7;
            } else {
                iJniSpanGetUnderline = Paragraph.jniSpanGetUnderline(paragraph2.paragraphHandle, i15);
                if (iJniSpanGetUnderline != 2) {
                    f7 = f7;
                    h(spannableStringValueOf, new UnderlineSpan(), i16, iH2);
                } else {
                    f7 = f7;
                    h(spannableStringValueOf, new UnderlineSpan(), i16, iH2);
                }
            }
            if ((i14 & 4194304) != 0) {
                h(spannableStringValueOf, new StrikethroughSpan(), i16, iH2);
            }
            if ((i14 & 16777216) != 0) {
                iJniSpanGetBaselineOffset = Paragraph.jniSpanGetBaselineOffset(paragraph2.paragraphHandle, i15);
                if (iJniSpanGetBaselineOffset != 1) {
                    h(spannableStringValueOf, new oxu(1, f3), i16, iH2);
                } else if (iJniSpanGetBaselineOffset == 2) {
                    h(spannableStringValueOf, new oxu(2, f3), i16, iH2);
                }
            }
            if ((i14 & 8388608) != 0) {
                fJniSpanGetLetterSpacing = Paragraph.jniSpanGetLetterSpacing(paragraph2.paragraphHandle, i15);
                if (fJniSpanGetLetterSpacing != 0.0f) {
                    h(spannableStringValueOf, new nyt(fJniSpanGetLetterSpacing), i16, iH2);
                }
            }
            i15++;
            context2 = context;
        }
        mew mewVar3 = null;
        if ((i14 & 8) != 0) {
            int iJniGetStyleRunExtensionRunCount = Paragraph.jniGetStyleRunExtensionRunCount(paragraph2.paragraphHandle);
            int i30 = 0;
            while (i30 < iJniGetStyleRunExtensionRunCount) {
                long jJniGetStyleRunExtensionRunExtensions = Paragraph.jniGetStyleRunExtensionRunExtensions(paragraph2.paragraphHandle, i30);
                mew mewVar4 = jJniGetStyleRunExtensionRunExtensions == 0 ? mewVar3 : new mew(new UpbMessage(jJniGetStyleRunExtensionRunExtensions, aszb.a, paragraph2.b));
                if (mewVar4 != null) {
                    int iJniGetStyleRunExtensionRunStart = Paragraph.jniGetStyleRunExtensionRunStart(paragraph2.paragraphHandle, i30);
                    int iJniGetStyleRunExtensionRunLength = Paragraph.jniGetStyleRunExtensionRunLength(paragraph2.paragraphHandle, i30);
                    int[] iArrAG = ksy.aG(mewVar4);
                    int length = iArrAG.length;
                    int i31 = 0;
                    while (i31 < length) {
                        qcb qcbVar = (qcb) map.get(Integer.valueOf(iArrAG[i31]));
                        if (qcbVar != null) {
                            ?? r15 = qcbVar.a;
                            i6 = iJniGetStyleRunExtensionRunCount;
                            mewVar4.d(r15.a());
                            mfc mfcVar = aszd.e;
                            asyz asyzVar = new asyz();
                            asyzVar.aT(iJniGetStyleRunExtensionRunStart);
                            asyzVar.aS(iJniGetStyleRunExtensionRunLength);
                            asyzVar.aU();
                            Object objB = r15.b();
                            if (objB != null) {
                                h(spannableStringValueOf, objB, iJniGetStyleRunExtensionRunStart, iJniGetStyleRunExtensionRunLength);
                            }
                        } else {
                            i6 = iJniGetStyleRunExtensionRunCount;
                        }
                        i31++;
                        iJniGetStyleRunExtensionRunCount = i6;
                    }
                }
                i30++;
                iJniGetStyleRunExtensionRunCount = iJniGetStyleRunExtensionRunCount;
                mewVar3 = null;
            }
        }
        if ((i14 & 4) != 0) {
            int iJniGetDecorationRunCount = Paragraph.jniGetDecorationRunCount(paragraph2.paragraphHandle);
            int i32 = 0;
            while (i32 < iJniGetDecorationRunCount) {
                int iJniGetDecorationRunStart = Paragraph.jniGetDecorationRunStart(paragraph2.paragraphHandle, i32);
                int iJniGetDecorationRunLength = Paragraph.jniGetDecorationRunLength(paragraph2.paragraphHandle, i32);
                long jJniGetDecorationRunDecoration = Paragraph.jniGetDecorationRunDecoration(paragraph2.paragraphHandle, i32);
                asxl asxlVar = jJniGetDecorationRunDecoration == 0 ? null : new asxl(new UpbMessage(jJniGetDecorationRunDecoration, asxk.a, paragraph2.b));
                if (asxlVar != null) {
                    if (asxlVar.aS()) {
                        mew mewVarAT = asxlVar.aT();
                        mep mepVar = athq.d;
                        if (mewVarAT.e(mepVar)) {
                            athq athqVar = (athq) asxlVar.aT().d(mepVar);
                            RectF rectF = new RectF(Float.intBitsToFloat(Memory.peekInt(athqVar.c + 28, false)) * f6, Float.intBitsToFloat(Memory.peekInt(athqVar.c + 36, false)) * f6, Float.intBitsToFloat(Memory.peekInt(athqVar.c + 32, false)) * f6, Float.intBitsToFloat(Memory.peekInt(athqVar.c + 40, false)) * f6);
                            long j7 = athqVar.c;
                            i5 = i32;
                            h(spannableStringValueOf, new oxy(Memory.peekInt(j7 + 20, false), Float.intBitsToFloat(Memory.peekInt(j7 + 24, false)) * f6, rectF), iJniGetDecorationRunStart, iJniGetDecorationRunLength);
                        } else {
                            i5 = i32;
                        }
                    } else {
                        i5 = i32;
                    }
                    if (asxlVar.aS()) {
                        mew mewVarAT2 = asxlVar.aT();
                        mep mepVar2 = athw.d;
                        if (mewVarAT2.e(mepVar2)) {
                            athw athwVar = (athw) asxlVar.aT().d(mepVar2);
                            k(spannableStringValueOf, new oxz(Float.intBitsToFloat(Memory.peekInt(athwVar.c + 12, false)) * f6, Float.intBitsToFloat(Memory.peekInt(athwVar.c + 16, false)) * f6));
                        }
                    }
                    if (asxlVar.aS()) {
                        mew mewVarAT3 = asxlVar.aT();
                        mep mepVar3 = atoi.d;
                        if (mewVarAT3.e(mepVar3)) {
                            atoi atoiVar = (atoi) asxlVar.aT().d(mepVar3);
                            k(spannableStringValueOf, new oyc(Float.intBitsToFloat(Memory.peekInt(atoiVar.c + 12, false)), Float.intBitsToFloat(Memory.peekInt(atoiVar.c + 16, false))));
                        }
                    }
                } else {
                    iJniGetDecorationRunCount = iJniGetDecorationRunCount;
                    i5 = i32;
                }
                i32 = i5 + 1;
                paragraph2 = paragraph;
                iJniGetDecorationRunCount = iJniGetDecorationRunCount;
            }
        }
        if ((i14 & 32) != 0) {
            int iJniGetParagraphStyleRunCount = Paragraph.jniGetParagraphStyleRunCount(paragraph.paragraphHandle);
            for (int i33 = 0; i33 < iJniGetParagraphStyleRunCount; i33++) {
                int iJniGetParagraphStyleRunStart = Paragraph.jniGetParagraphStyleRunStart(paragraph.paragraphHandle, i33);
                int iJniGetParagraphStyleRunLength = Paragraph.jniGetParagraphStyleRunLength(paragraph.paragraphHandle, i33);
                long jJniGetParagraphStyleRunStyle = Paragraph.jniGetParagraphStyleRunStyle(paragraph.paragraphHandle, i33);
                asyy asyyVar = jJniGetParagraphStyleRunStyle == 0 ? null : new asyy(new UpbMessage(jJniGetParagraphStyleRunStyle, asyx.a, paragraph.b));
                if (asyyVar != null && asyyVar.aS() && asyyVar.aT().aM() == 2) {
                    ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringValueOf.getSpans(iJniGetParagraphStyleRunStart, iJniGetParagraphStyleRunLength, ForegroundColorSpan.class);
                    h(spannableStringValueOf, foregroundColorSpanArr.length > 0 ? new BulletSpan(20, foregroundColorSpanArr[0].getForegroundColor()) : new BulletSpan(20), iJniGetParagraphStyleRunStart, iJniGetParagraphStyleRunLength);
                }
            }
        }
        if ((i14 & 2) != 0) {
            int iJniGetAttachmentRunCount = Paragraph.jniGetAttachmentRunCount(paragraph.paragraphHandle);
            int i34 = 0;
            while (i34 < iJniGetAttachmentRunCount) {
                int iJniGetAttachmentRunStart = Paragraph.jniGetAttachmentRunStart(paragraph.paragraphHandle, i34);
                int iJniGetAttachmentRunLength = Paragraph.jniGetAttachmentRunLength(paragraph.paragraphHandle, i34);
                long jJniGetAttachmentRunElement = Paragraph.jniGetAttachmentRunElement(paragraph.paragraphHandle, i34);
                atgg atggVar = jJniGetAttachmentRunElement == 0 ? null : new atgg(new UpbMessage(jJniGetAttachmentRunElement, atgf.a, paragraph.b));
                if (atggVar == null) {
                    iJniGetAttachmentRunCount = iJniGetAttachmentRunCount;
                    resources = resources;
                    f6 = f6;
                    i34 = i34;
                } else {
                    int iAV = a.aV(Paragraph.jniGetAttachmentRunAlignment(paragraph.paragraphHandle, i34));
                    if (iAV == 0) {
                        iAV = 1;
                    }
                    if (owjVar.equals(owj.a)) {
                        ouiVar.a(aslh.LOG_TYPE_CONFIGURATION_ERROR, "Has attachmentRuns but drawableRequester is missing.");
                    } else {
                        float f10 = f6 * 14.0f;
                        if (iJniGetAttachmentRunLength == 0) {
                            ouiVar.a(aslh.LOG_TYPE_INVALID_FIELD, "AttachmentRun with 0 length found. This probably means the AttributedString hasn't been adjusted to account for zero-length (inserted) AttachmentRun's.");
                        } else if (atggVar.aZ()) {
                            mew mewVarBb = atggVar.bb();
                            mep mepVar4 = atjc.d;
                            if (mewVarBb.e(mepVar4)) {
                                atjc atjcVar = (atjc) mewVarBb.d(mepVar4);
                                if (atjcVar.aU()) {
                                    atiq atiqVarBc = atjcVar.bc();
                                    atjt atjtVar = (atjt) atggVar.ba().d(atjt.d);
                                    atey ateyVarAT = atjtVar.cm() ? atjtVar.aT() : null;
                                    atey ateyVarAS = atjtVar.aR() ? atjtVar.aS() : null;
                                    if (ateyVarAT == null) {
                                        iJniGetDimensionInPixel = -1;
                                    } else {
                                        UpbMessage upbMessage = ateyVarAT.b;
                                        iJniGetDimensionInPixel = DimensionUnitConverter.jniGetDimensionInPixel(upbMessage.a, upbMessage.c.a, f6);
                                    }
                                    if (iJniGetDimensionInPixel <= 0) {
                                        float f11 = f10 + 0.5f;
                                        int iJ2 = rpi.j(spannableStringValueOf, iJniGetAttachmentRunStart);
                                        if (iJ2 <= 0) {
                                            iJniGetDimensionInPixel = (int) f11;
                                            i2 = iJniGetDimensionInPixel;
                                        } else {
                                            i2 = iJ2;
                                        }
                                    } else {
                                        i2 = iJniGetDimensionInPixel;
                                    }
                                    if (ateyVarAS != null) {
                                        long j8 = ateyVarAS.c + 8;
                                        i3 = iJniGetAttachmentRunStart;
                                        if ((Memory.peekByte(j8) & 1) != 0) {
                                            i4 = 2;
                                        } else {
                                            i4 = 2;
                                            if ((Memory.peekByte(j8) & 2) != 0) {
                                            }
                                            if (i2 >= 0 || iIntBitsToFloat < 0) {
                                                iJniGetAttachmentRunCount = iJniGetAttachmentRunCount;
                                                resources = resources;
                                                f6 = f6;
                                                i34 = i34;
                                                ouiVar.a(aslh.LOG_TYPE_INVALID_FIELD, "Attachment run requires widthDimension and heightDimension in LayoutProperties.");
                                            } else {
                                                oxp oxpVarB = oxp.b(resources, f6, i2, iIntBitsToFloat, atjtVar);
                                                owjVar.a(context, atiqVarBc, atjcVar.aS() ? atjcVar.ba() : null, atjcVar.aT() ? atjcVar.bb() : null, kjcVar, i2, iIntBitsToFloat, oxpVarB, ouiVar);
                                                h(spannableStringValueOf, new oxt(oxpVarB, iAV), i3, iJniGetAttachmentRunLength);
                                            }
                                        }
                                        int iAT = ateyVarAS.aT() - 1;
                                        if (iAT == 1) {
                                            float fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(ateyVarAS.c + 12, false)) * f6;
                                            iIntBitsToFloat = (int) (((double) fIntBitsToFloat) + (fIntBitsToFloat > 0.0f ? 0.5d : -0.5d));
                                        } else if (iAT != i4 || (iIntBitsToFloat = (int) (Float.intBitsToFloat(Memory.peekInt(ateyVarAS.c + 12, false)) * i2)) < 0) {
                                        }
                                        if (i2 >= 0) {
                                            iJniGetAttachmentRunCount = iJniGetAttachmentRunCount;
                                            resources = resources;
                                            f6 = f6;
                                            i34 = i34;
                                            ouiVar.a(aslh.LOG_TYPE_INVALID_FIELD, "Attachment run requires widthDimension and heightDimension in LayoutProperties.");
                                        } else {
                                            iJniGetAttachmentRunCount = iJniGetAttachmentRunCount;
                                            resources = resources;
                                            f6 = f6;
                                            i34 = i34;
                                            ouiVar.a(aslh.LOG_TYPE_INVALID_FIELD, "Attachment run requires widthDimension and heightDimension in LayoutProperties.");
                                        }
                                    } else {
                                        i3 = iJniGetAttachmentRunStart;
                                    }
                                    iIntBitsToFloat = i2;
                                    if (i2 >= 0) {
                                        iJniGetAttachmentRunCount = iJniGetAttachmentRunCount;
                                        resources = resources;
                                        f6 = f6;
                                        i34 = i34;
                                        ouiVar.a(aslh.LOG_TYPE_INVALID_FIELD, "Attachment run requires widthDimension and heightDimension in LayoutProperties.");
                                    } else {
                                        iJniGetAttachmentRunCount = iJniGetAttachmentRunCount;
                                        resources = resources;
                                        f6 = f6;
                                        i34 = i34;
                                        ouiVar.a(aslh.LOG_TYPE_INVALID_FIELD, "Attachment run requires widthDimension and heightDimension in LayoutProperties.");
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
                    }
                    iJniGetAttachmentRunCount = iJniGetAttachmentRunCount;
                    resources = resources;
                    f6 = f6;
                    i34 = i34;
                }
                iJniGetAttachmentRunCount = iJniGetAttachmentRunCount;
                i34++;
                resources = resources;
                f6 = f6;
            }
        }
        if ((i14 & 16) != 0) {
            int iJniGetMetadataRunCount = Paragraph.jniGetMetadataRunCount(paragraph.paragraphHandle);
            for (int i35 = 0; i35 < iJniGetMetadataRunCount; i35++) {
                int iJniGetMetadataRunStart = Paragraph.jniGetMetadataRunStart(paragraph.paragraphHandle, i35);
                int iJniGetMetadataRunLength = Paragraph.jniGetMetadataRunLength(paragraph.paragraphHandle, i35);
                String strJniGetMetadataRunLanguageHint = Paragraph.jniGetMetadataRunLanguageHint(paragraph.paragraphHandle, i35);
                if (!TextUtils.isEmpty(strJniGetMetadataRunLanguageHint) && (localeForLanguageTag = Locale.forLanguageTag(strJniGetMetadataRunLanguageHint)) != null) {
                    h(spannableStringValueOf, new LocaleSpan(localeForLanguageTag), iJniGetMetadataRunStart, iJniGetMetadataRunLength);
                }
            }
        }
        if ((i14 & SemanticState.Focused) != 0) {
            float fJniGetParagraphStyleLineHeightValue = Paragraph.jniGetParagraphStyleLineHeightValue(paragraph.paragraphHandle);
            if (fJniGetParagraphStyleLineHeightValue > 0.0f) {
                if (Paragraph.jniGetParagraphStyleLineHeightUnit(paragraph.paragraphHandle) == 2) {
                    h(spannableStringValueOf, new oxx(fJniGetParagraphStyleLineHeightValue, null), 0, spannableStringValueOf.length());
                } else {
                    h(spannableStringValueOf, new oxx(TypedValue.applyDimension(2, fJniGetParagraphStyleLineHeightValue, displayMetrics)), 0, spannableStringValueOf.length());
                }
            }
        }
        return spannableStringValueOf;
    }

    public static yvh n(Paragraph paragraph, CharSequence charSequence, int i, TextPaint textPaint, Layout.Alignment alignment, TextDirectionHeuristic textDirectionHeuristic, int i2, ElementsServices elementsServices, tld tldVar, oui ouiVar, kjc kjcVar, Map map, owj owjVar) throws Throwable {
        DisplayMetrics displayMetricsE = elementsServices.e();
        CharSequence charSequenceM = m(elementsServices.c(), displayMetricsE, paragraph, charSequence, elementsServices.l(), tldVar, ouiVar, map, owjVar, kjcVar, 0);
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
        g(textPaint2, charSequenceM, displayMetricsE.density, displayMetricsE.scaledDensity);
        Layout layoutD = d(charSequenceM, textPaint2, rpi.k(charSequenceM, textPaint2, i2), alignment, textDirectionHeuristic, paragraph, elementsServices);
        return layoutD.getLineCount() <= i ? new yvh(charSequenceM, textPaint2, i, layoutD) : new yvh(charSequenceM, textPaint2, i, (Layout) null);
    }

    private static Layout.Alignment o(String str, Layout.Alignment alignment) {
        try {
            return Layout.Alignment.valueOf(str);
        } catch (IllegalArgumentException | NullPointerException unused) {
            return alignment;
        }
    }
}
