package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.car.app.model.Alert;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.text.experimental.Paragraph;
import com.google.protos.youtube.elements.upb.TextTypeOuterClass$TextType;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oxj extends owu {
    public static final /* synthetic */ int e = 0;
    private static final ThreadLocal f = new oxi();
    private final Map g;
    private final tld h;

    public oxj(nxl nxlVar, oui ouiVar, kjc kjcVar, Map map) {
        super(nxlVar, ouiVar, kjcVar, map);
        this.h = new tld(nxlVar);
        this.g = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            this.g.put((Integer) entry.getKey(), new qcb((oxr) entry.getValue()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:197:0x0700  */
    /* JADX WARN: Code duplicated, block: B:217:0x0752 A[PHI: r1 r14
      0x0752: PHI (r1v40 android.text.Layout) = (r1v39 android.text.Layout), (r1v45 android.text.Layout) binds: [B:216:0x0750, B:213:0x074b] A[DONT_GENERATE, DONT_INLINE]
      0x0752: PHI (r14v6 int) = (r14v5 int), (r14v8 int) binds: [B:216:0x0750, B:213:0x074b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:224:0x077d  */
    /* JADX WARN: Code duplicated, block: B:227:0x0786  */
    /* JADX WARN: Code duplicated, block: B:228:0x0789  */
    /* JADX WARN: Code duplicated, block: B:231:0x0795  */
    /* JADX WARN: Code duplicated, block: B:232:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:235:0x07b4 A[LOOP:1: B:233:0x07a8->B:235:0x07b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:238:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:240:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:242:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:243:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:244:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:246:0x0805  */
    /* JADX WARN: Code duplicated, block: B:248:0x080e  */
    /* JADX WARN: Code duplicated, block: B:249:0x0810  */
    /* JADX WARN: Code duplicated, block: B:252:0x0820  */
    /* JADX WARN: Code duplicated, block: B:254:0x0831 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:255:0x0833  */
    /* JADX WARN: Code duplicated, block: B:257:0x0845  */
    /* JADX WARN: Code duplicated, block: B:258:0x0847  */
    /* JADX WARN: Code duplicated, block: B:263:0x0853  */
    /* JADX WARN: Code duplicated, block: B:41:0x0085  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r10v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v4, types: [android.text.TextDirectionHeuristic] */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v47 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v95 */
    /* JADX WARN: Type inference failed for: r1v96 */
    /* JADX WARN: Type inference failed for: r1v97 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r3v58, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v88 */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.text.TextDirectionHeuristic] */
    /* JADX WARN: Type inference failed for: r4v15, types: [android.text.TextDirectionHeuristic] */
    /* JADX WARN: Type inference failed for: r4v22, types: [android.text.TextDirectionHeuristic] */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    private final Layout d(Paragraph paragraph, int i, owj owjVar, int i2, int i3, ElementsServices elementsServices, boolean z) throws Throwable {
        boolean z2;
        asxo asxoVar;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        oxj oxjVar;
        int i8;
        Object obj;
        Object obj2;
        Object obj3;
        int i9;
        int iB;
        ?? r7;
        int i10;
        int i11;
        Paragraph paragraph2;
        ?? r24;
        Layout.Alignment alignment;
        TextUtils.TruncateAt truncateAt;
        boolean z4;
        boolean z5;
        int i12;
        Layout layout;
        int i13;
        CharSequence charSequence;
        int i14;
        Locale locale;
        byte bPeekByte;
        ?? r32;
        int i15;
        SpannableString spannableString;
        boolean z6;
        Layout layout2;
        TextPaint textPaint;
        float desiredWidth;
        float width;
        int i16;
        ?? r2;
        SpannableString spannableString2;
        float desiredWidth2;
        CharSequence charSequenceF;
        TextUtils.TruncateAt truncateAt2;
        Layout layout3;
        int iA;
        ?? r3;
        float desiredWidth3;
        SpannableString spannableString3;
        Paragraph paragraph3;
        Paragraph paragraph4;
        ?? r1;
        int i17;
        int iB2;
        yvh yvhVarN;
        int i18;
        Map map;
        CharSequence charSequence2;
        CharSequence charSequence3;
        int i19;
        int i20;
        int i21 = i2;
        TextPaint textPaint2 = (TextPaint) elementsServices.w().io();
        long j = FlagServices.b().c + 29;
        int i22 = paragraph.a;
        int i23 = i22 & 16384;
        byte bPeekByte2 = Memory.peekByte(j);
        int iJniGetParagraphStyleTruncationMode = i23 == 0 ? 0 : Paragraph.jniGetParagraphStyleTruncationMode(paragraph.paragraphHandle);
        boolean z7 = bPeekByte2 != 0;
        boolean z8 = z7 && iJniGetParagraphStyleTruncationMode == 5;
        int iD = paragraph.d();
        int i24 = i22 & 1048576;
        if (z7 && iD == 1) {
            iD = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        int i25 = i <= 0 ? Integer.MAX_VALUE : i;
        boolean z9 = i25 < Integer.MAX_VALUE && (z2 || paragraph.m() || z8);
        boolean z10 = z9 || (i25 < Integer.MAX_VALUE && (i22 & SemanticState.Modal) != 0);
        if ((i22 & SemanticState.LiveRegion) != 0) {
            long jJniGetFirstDynamicTextConfig = Paragraph.jniGetFirstDynamicTextConfig(paragraph.paragraphHandle);
            if (jJniGetFirstDynamicTextConfig == 0) {
                asxoVar = null;
            } else {
                asxoVar = new asxo(new UpbMessage(jJniGetFirstDynamicTextConfig, asxn.a, paragraph.b));
            }
        } else {
            asxoVar = null;
        }
        CharSequence charSequence4 = "";
        if (asxoVar != null) {
            int i26 = i25;
            tld tldVar = this.h;
            boolean z11 = z9;
            oui ouiVar = this.b;
            int i27 = i26;
            kjc kjcVar = this.d;
            Map map2 = this.g;
            String[] strArr = oxh.c;
            TextPaint textPaint3 = (TextPaint) elementsServices.w().io();
            String strZ = ahno.Z(paragraph.j());
            asxo asxoVar2 = asxoVar;
            CharSequence charSequenceJ = oxh.j(strZ);
            int iB3 = elementsServices.b();
            int iE = paragraph.e();
            if (iE != 0) {
                iB2 = oxh.b(iE);
                i17 = iD;
            } else {
                i17 = iD;
                if (iB3 == 1) {
                    iB2 = 4;
                    iB3 = 1;
                } else {
                    iB2 = 3;
                }
            }
            int i28 = iB2;
            int i29 = Build.VERSION.SDK_INT;
            TextDirectionHeuristic textDirectionHeuristicM = rpi.m(i28, iB3);
            if (i29 < 28 && iE == 0) {
                textDirectionHeuristicM = textDirectionHeuristicM.isRtl(strZ, 0, strZ.length()) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
            Layout.Alignment alignmentC = oxh.c(paragraph.c(), strZ, textDirectionHeuristicM, elementsServices.b());
            if (asxoVar2.aR()) {
                asxr asxrVarAU = asxoVar2.aU();
                TextPaint textPaint4 = new TextPaint(textPaint3);
                textPaint4.bgColor = textPaint3.bgColor;
                textPaint4.baselineShift = textPaint3.baselineShift;
                textPaint4.linkColor = textPaint3.linkColor;
                textPaint4.drawableState = textPaint3.drawableState;
                textPaint4.density = textPaint3.density;
                TextDirectionHeuristic textDirectionHeuristic = textDirectionHeuristicM;
                if (Build.VERSION.SDK_INT >= 29) {
                    textPaint4.underlineColor = textPaint3.underlineColor;
                    textPaint4.underlineThickness = textPaint3.underlineThickness;
                }
                CharSequence charSequence5 = charSequenceJ;
                tld tldVar2 = tldVar;
                oui ouiVar2 = ouiVar;
                CharSequence charSequence6 = "";
                int i30 = 0;
                int i31 = 0;
                TextPaint textPaint5 = textPaint4;
                while (true) {
                    if (i30 >= asxrVarAU.aT()) {
                        z3 = z11;
                        i19 = i27;
                        i5 = i22;
                        i4 = i17;
                        i20 = 0;
                        yvhVarN = new yvh(charSequence6, textPaint5, i31, (Layout) null);
                        break;
                    }
                    textPaint4.set(textPaint3);
                    textPaint4.bgColor = textPaint3.bgColor;
                    textPaint4.baselineShift = textPaint3.baselineShift;
                    textPaint4.linkColor = textPaint3.linkColor;
                    textPaint4.drawableState = textPaint3.drawableState;
                    textPaint4.density = textPaint3.density;
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint4.underlineColor = textPaint3.underlineColor;
                        textPaint4.underlineThickness = textPaint3.underlineThickness;
                    }
                    int iAS = asxrVarAU.aS(i30);
                    boolean z12 = z11;
                    int iAR = asxrVarAU.aR(i30);
                    asxr asxrVar = asxrVarAU;
                    DisplayMetrics displayMetricsE = elementsServices.e();
                    int i32 = i30;
                    z3 = z12;
                    TextPaint textPaint6 = textPaint3;
                    i5 = i22;
                    CharSequence charSequence7 = charSequence5;
                    i20 = 0;
                    TextPaint textPaint7 = textPaint4;
                    i19 = i27;
                    i4 = i17;
                    tld tldVar3 = tldVar2;
                    oui ouiVar3 = ouiVar2;
                    CharSequence charSequenceM = oxh.m(elementsServices.c(), displayMetricsE, paragraph, charSequence7, elementsServices.l(), tldVar3, ouiVar3, map2, owjVar, kjcVar, iAR);
                    kjc kjcVar2 = kjcVar;
                    oxh.g(textPaint7, charSequenceM, displayMetricsE.density, displayMetricsE.scaledDensity);
                    Layout.Alignment alignment2 = alignmentC;
                    Layout layoutD = oxh.d(charSequenceM, textPaint7, rpi.k(charSequenceM, textPaint7, i21), alignment2, textDirectionHeuristic, paragraph, elementsServices);
                    textPaint5 = new TextPaint(textPaint7);
                    textPaint5.bgColor = textPaint7.bgColor;
                    textPaint5.baselineShift = textPaint7.baselineShift;
                    textPaint5.linkColor = textPaint7.linkColor;
                    textPaint5.drawableState = textPaint7.drawableState;
                    textPaint5.density = textPaint7.density;
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint5.underlineColor = textPaint7.underlineColor;
                        textPaint5.underlineThickness = textPaint7.underlineThickness;
                    }
                    if (layoutD.getLineCount() <= iAS) {
                        yvhVarN = new yvh(charSequenceM, textPaint5, iAS, layoutD);
                        break;
                    }
                    charSequence6 = charSequenceM;
                    alignmentC = alignment2;
                    i30 = i32 + 1;
                    ouiVar2 = ouiVar3;
                    kjcVar = kjcVar2;
                    i31 = iAS;
                    textPaint4 = textPaint7;
                    i22 = i5;
                    asxrVarAU = asxrVar;
                    i27 = i19;
                    i17 = i4;
                    charSequence5 = charSequence7;
                    z11 = z3;
                    tldVar2 = tldVar3;
                    textPaint3 = textPaint6;
                }
                i6 = i20;
                i7 = i19;
            } else {
                TextDirectionHeuristic textDirectionHeuristic2 = textDirectionHeuristicM;
                z3 = z11;
                i5 = i22;
                i4 = i17;
                tld tldVar4 = tldVar;
                kjc kjcVar3 = kjcVar;
                oui ouiVar4 = ouiVar;
                if (asxoVar2.aS()) {
                    asxu asxuVarAV = asxoVar2.aV();
                    yvh yvhVarN2 = oxh.n(paragraph, charSequenceJ, i27, textPaint3, alignmentC, textDirectionHeuristic2, i21, elementsServices, tldVar4, ouiVar4, kjcVar3, map2, owjVar);
                    TextPaint textPaint8 = textPaint3;
                    Layout.Alignment alignment3 = alignmentC;
                    if (yvhVarN2.d == null) {
                        TextPaint textPaint9 = new TextPaint(textPaint8);
                        textPaint9.bgColor = textPaint8.bgColor;
                        textPaint9.baselineShift = textPaint8.baselineShift;
                        textPaint9.linkColor = textPaint8.linkColor;
                        textPaint9.drawableState = textPaint8.drawableState;
                        textPaint9.density = textPaint8.density;
                        if (Build.VERSION.SDK_INT >= 29) {
                            i18 = i27;
                            charSequence3 = charSequenceJ;
                            i21 = i21;
                            textPaint9.underlineColor = textPaint8.underlineColor;
                            textPaint9.underlineThickness = textPaint8.underlineThickness;
                        }
                        i18 = i27;
                        charSequence3 = charSequenceJ;
                        i21 = i21;
                        Object obj4 = yvhVarN2.c;
                        TextPaint textPaint10 = textPaint9;
                        int i33 = 0;
                        ?? r4 = obj4;
                        while (true) {
                            if (i33 >= asxuVarAV.aS()) {
                                yvhVarN = new yvh((CharSequence) r4, textPaint10, i18, (Layout) null);
                                break;
                            }
                            textPaint9.set(textPaint8);
                            textPaint9.bgColor = textPaint8.bgColor;
                            textPaint9.baselineShift = textPaint8.baselineShift;
                            textPaint9.linkColor = textPaint8.linkColor;
                            textPaint9.drawableState = textPaint8.drawableState;
                            textPaint9.density = textPaint8.density;
                            if (Build.VERSION.SDK_INT >= 29) {
                                textPaint9.underlineColor = textPaint8.underlineColor;
                                textPaint9.underlineThickness = textPaint8.underlineThickness;
                            }
                            oui ouiVar5 = ouiVar4;
                            kjc kjcVar4 = kjcVar3;
                            int iAR2 = asxuVarAV.aR(i33);
                            TextPaint textPaint11 = textPaint9;
                            DisplayMetrics displayMetricsE2 = elementsServices.e();
                            TextPaint textPaint12 = textPaint8;
                            tld tldVar5 = tldVar4;
                            int i34 = i33;
                            CharSequence charSequenceM2 = oxh.m(elementsServices.c(), displayMetricsE2, paragraph, charSequence3, elementsServices.l(), tldVar5, ouiVar5, map2, owjVar, kjcVar4, iAR2);
                            CharSequence charSequence8 = charSequence3;
                            tldVar4 = tldVar5;
                            kjcVar3 = kjcVar4;
                            ouiVar4 = ouiVar5;
                            oxh.g(textPaint11, charSequenceM2, displayMetricsE2.density, displayMetricsE2.scaledDensity);
                            Layout.Alignment alignment4 = alignment3;
                            Layout layoutD2 = oxh.d(charSequenceM2, textPaint11, rpi.k(charSequenceM2, textPaint11, i21), alignment4, textDirectionHeuristic2, paragraph, elementsServices);
                            textPaint10 = new TextPaint(textPaint11);
                            textPaint10.bgColor = textPaint11.bgColor;
                            textPaint10.baselineShift = textPaint11.baselineShift;
                            textPaint10.linkColor = textPaint11.linkColor;
                            textPaint10.drawableState = textPaint11.drawableState;
                            textPaint10.density = textPaint11.density;
                            if (Build.VERSION.SDK_INT >= 29) {
                                textPaint10.underlineColor = textPaint11.underlineColor;
                                textPaint10.underlineThickness = textPaint11.underlineThickness;
                            }
                            if (layoutD2.getLineCount() <= i18) {
                                yvhVarN = new yvh(charSequenceM2, textPaint10, i18, layoutD2);
                                break;
                            }
                            i33 = i34 + 1;
                            textPaint9 = textPaint11;
                            r4 = charSequenceM2;
                            alignment3 = alignment4;
                            textPaint8 = textPaint12;
                            charSequence3 = charSequence8;
                        }
                    } else {
                        i18 = i27;
                        charSequence3 = charSequenceJ;
                        i21 = i21;
                        i7 = i18;
                        yvhVarN = yvhVarN2;
                    }
                    i6 = 0;
                } else if (asxoVar2.aT()) {
                    asxx asxxVarAW = asxoVar2.aW();
                    yvh yvhVarN3 = oxh.n(paragraph, charSequenceJ, i27, textPaint3, alignmentC, textDirectionHeuristic2, i21, elementsServices, tldVar4, ouiVar4, kjcVar3, map2, owjVar);
                    TextPaint textPaint13 = textPaint3;
                    Layout.Alignment alignment5 = alignmentC;
                    if (yvhVarN3.d == null) {
                        long j2 = asxxVarAW.c;
                        int iPeekInt = Memory.peekInt(j2 + 12, false);
                        int iPeekInt2 = Memory.peekInt(j2 + 16, false);
                        TextPaint textPaint14 = new TextPaint(textPaint13);
                        textPaint14.bgColor = textPaint13.bgColor;
                        textPaint14.baselineShift = textPaint13.baselineShift;
                        textPaint14.linkColor = textPaint13.linkColor;
                        textPaint14.drawableState = textPaint13.drawableState;
                        textPaint14.density = textPaint13.density;
                        if (Build.VERSION.SDK_INT >= 29) {
                            i18 = i27;
                            map = map2;
                            charSequence2 = charSequenceJ;
                            i21 = i21;
                            textPaint14.underlineColor = textPaint13.underlineColor;
                            textPaint14.underlineThickness = textPaint13.underlineThickness;
                        }
                        i18 = i27;
                        map = map2;
                        charSequence2 = charSequenceJ;
                        i21 = i21;
                        DisplayMetrics displayMetricsE3 = elementsServices.e();
                        int i35 = iPeekInt;
                        int i36 = iPeekInt2;
                        int i37 = -1;
                        Layout layout4 = null;
                        CharSequence charSequence9 = null;
                        TextPaint textPaint15 = null;
                        while (i35 <= i36) {
                            int i38 = (i36 - i35) / 2;
                            textPaint14.set(textPaint13);
                            DisplayMetrics displayMetrics = displayMetricsE3;
                            textPaint14.bgColor = textPaint13.bgColor;
                            textPaint14.baselineShift = textPaint13.baselineShift;
                            textPaint14.linkColor = textPaint13.linkColor;
                            textPaint14.drawableState = textPaint13.drawableState;
                            textPaint14.density = textPaint13.density;
                            TextPaint textPaint16 = textPaint13;
                            if (Build.VERSION.SDK_INT >= 29) {
                                textPaint14.underlineColor = textPaint16.underlineColor;
                                textPaint14.underlineThickness = textPaint16.underlineThickness;
                            }
                            int i39 = i35 + i38;
                            int i40 = i36;
                            int i41 = i37;
                            oui ouiVar6 = ouiVar4;
                            kjc kjcVar5 = kjcVar3;
                            textPaint13 = textPaint16;
                            asxxVarAW = asxxVarAW;
                            TextPaint textPaint17 = textPaint14;
                            int i42 = i35;
                            tld tldVar6 = tldVar4;
                            CharSequence charSequenceM3 = oxh.m(elementsServices.c(), displayMetrics, paragraph, charSequence2, elementsServices.l(), tldVar6, ouiVar6, map, owjVar, kjcVar5, i39);
                            charSequence2 = charSequence2;
                            tldVar4 = tldVar6;
                            map = map;
                            kjcVar3 = kjcVar5;
                            ouiVar4 = ouiVar6;
                            oxh.g(textPaint17, charSequenceM3, displayMetrics.density, displayMetrics.scaledDensity);
                            int iK = rpi.k(charSequenceM3, textPaint17, i21);
                            displayMetricsE3 = displayMetrics;
                            textPaint14 = textPaint17;
                            alignment5 = alignment5;
                            Layout layoutD3 = oxh.d(charSequenceM3, textPaint14, iK, alignment5, textDirectionHeuristic2, paragraph, elementsServices);
                            if (layoutD3.getLineCount() <= i18) {
                                TextPaint textPaint18 = new TextPaint(textPaint14);
                                textPaint18.bgColor = textPaint14.bgColor;
                                textPaint18.baselineShift = textPaint14.baselineShift;
                                textPaint18.linkColor = textPaint14.linkColor;
                                textPaint18.drawableState = textPaint14.drawableState;
                                textPaint18.density = textPaint14.density;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    textPaint18.underlineColor = textPaint14.underlineColor;
                                    textPaint18.underlineThickness = textPaint14.underlineThickness;
                                }
                                i35 = i39 + 1;
                                textPaint15 = textPaint18;
                                charSequence9 = charSequenceM3;
                                layout4 = layoutD3;
                                i37 = i39;
                                i36 = i40;
                            } else {
                                i36 = i39 - 1;
                                i37 = i41;
                                i35 = i42;
                            }
                        }
                        TextPaint textPaint19 = textPaint13;
                        CharSequence charSequence10 = charSequence2;
                        Map map3 = map;
                        kjc kjcVar6 = kjcVar3;
                        asxx asxxVar = asxxVarAW;
                        DisplayMetrics displayMetrics2 = displayMetricsE3;
                        TextPaint textPaint20 = textPaint14;
                        if (i37 != -1) {
                            charSequence9.getClass();
                            textPaint15.getClass();
                            yvhVarN = new yvh(charSequence9, textPaint15, i18, layout4);
                        } else {
                            textPaint20.set(textPaint19);
                            textPaint20.bgColor = textPaint19.bgColor;
                            textPaint20.baselineShift = textPaint19.baselineShift;
                            textPaint20.linkColor = textPaint19.linkColor;
                            textPaint20.drawableState = textPaint19.drawableState;
                            textPaint20.density = textPaint19.density;
                            if (Build.VERSION.SDK_INT >= 29) {
                                textPaint20.underlineColor = textPaint19.underlineColor;
                                textPaint20.underlineThickness = textPaint19.underlineThickness;
                            }
                            CharSequence charSequenceM4 = oxh.m(elementsServices.c(), displayMetrics2, paragraph, charSequence10, elementsServices.l(), tldVar4, ouiVar4, map3, owjVar, kjcVar6, Memory.peekInt(asxxVar.c + 12, false));
                            oxh.g(textPaint20, charSequenceM4, displayMetrics2.density, displayMetrics2.scaledDensity);
                            TextPaint textPaint21 = new TextPaint(textPaint20);
                            textPaint21.bgColor = textPaint20.bgColor;
                            textPaint21.baselineShift = textPaint20.baselineShift;
                            textPaint21.linkColor = textPaint20.linkColor;
                            textPaint21.drawableState = textPaint20.drawableState;
                            textPaint21.density = textPaint20.density;
                            if (Build.VERSION.SDK_INT >= 29) {
                                textPaint21.underlineColor = textPaint20.underlineColor;
                                textPaint21.underlineThickness = textPaint20.underlineThickness;
                            }
                            yvhVarN = new yvh(charSequenceM4, textPaint21, i18, (Layout) null);
                            i6 = 0;
                        }
                    } else {
                        i18 = i27;
                        map = map2;
                        charSequence2 = charSequenceJ;
                        i21 = i21;
                        i6 = 0;
                        yvhVarN = yvhVarN3;
                    }
                    i7 = i18;
                } else {
                    i6 = 0;
                    yvhVarN = oxh.n(paragraph, charSequenceJ, i27, textPaint3, alignmentC, textDirectionHeuristic2, i21, elementsServices, tldVar4, ouiVar4, kjcVar3, map2, owjVar);
                    i7 = i27;
                    i21 = i21;
                }
                i7 = i18;
                i6 = 0;
            }
            obj = yvhVarN.d;
            int i43 = yvhVarN.a;
            Object obj5 = yvhVarN.b;
            oxjVar = this;
            i8 = i43;
            obj3 = yvhVarN.c;
            obj2 = obj5;
        } else {
            i4 = iD;
            z3 = z9;
            i5 = i22;
            i6 = 0;
            i7 = i25;
            oxjVar = this;
            CharSequence charSequenceM5 = oxh.m(elementsServices.c(), elementsServices.e(), paragraph, oxh.j(ahno.Z(paragraph.j())), elementsServices.l(), this.h, this.b, this.g, owjVar, this.d, 0);
            TextPaint textPaint22 = new TextPaint(textPaint2);
            textPaint22.bgColor = textPaint2.bgColor;
            textPaint22.baselineShift = textPaint2.baselineShift;
            textPaint22.linkColor = textPaint2.linkColor;
            textPaint22.drawableState = textPaint2.drawableState;
            textPaint22.density = textPaint2.density;
            if (Build.VERSION.SDK_INT >= 29) {
                textPaint22.underlineColor = textPaint2.underlineColor;
                textPaint22.underlineThickness = textPaint2.underlineThickness;
            }
            DisplayMetrics displayMetricsE4 = elementsServices.e();
            oxh.g(textPaint22, charSequenceM5, displayMetricsE4.density, displayMetricsE4.scaledDensity);
            i8 = i7;
            obj = null;
            obj3 = charSequenceM5;
            obj2 = textPaint22;
        }
        ?? r5 = obj3;
        if (i24 != 0) {
            i8 = 1;
        }
        TextPaint textPaint23 = (TextPaint) obj2;
        int iK2 = rpi.k(r5, textPaint23, i21);
        boolean zL = paragraph.l();
        int iE2 = paragraph.e();
        if (iE2 != 0) {
            iB = oxh.b(iE2);
            i9 = 1;
            r7 = z;
        } else {
            boolean z13 = z;
            i9 = 1;
            if (z13) {
                iB = 2;
                r7 = z13;
            } else {
                iB = 1;
                r7 = z13;
            }
        }
        ?? M = rpi.m(iB, r7);
        ?? r10 = M;
        r10 = M;
        if (Build.VERSION.SDK_INT < 28 && iE2 == 0) {
            r10 = M.isRtl(r5, i6, r5.length()) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        ?? r6 = r10;
        Layout.Alignment alignmentC2 = oxh.c(paragraph.c(), r5, r6, r7);
        int i44 = i5 & 262144;
        TextUtils.TruncateAt truncateAtE = oxh.e(i4);
        if ((i44 != 0 || i7 < Integer.MAX_VALUE) && truncateAtE == null && (i4 == 0 || i4 == i9)) {
            truncateAtE = TextUtils.TruncateAt.END;
        }
        if (truncateAtE == TextUtils.TruncateAt.MARQUEE && i8 == i9) {
            i11 = i9;
            i10 = i11;
        } else if (i24 == 0 || truncateAtE != null) {
            i10 = i8;
            i11 = i6;
        } else {
            i10 = i8;
            i11 = i9;
        }
        if (obj == 0) {
            TextUtils.TruncateAt truncateAt3 = truncateAtE;
            boolean z14 = z10;
            Layout layoutE = e(r5, textPaint23, iK2, alignmentC2, r6, i11, zL, truncateAt3, i10, z14, paragraph, elementsServices, null);
            alignment = alignmentC2;
            r24 = r6;
            z5 = zL;
            truncateAt = truncateAt3;
            z4 = z14;
            paragraph2 = paragraph;
            obj = layoutE;
        } else {
            paragraph2 = paragraph;
            r24 = r6;
            alignment = alignmentC2;
            truncateAt = truncateAtE;
            z4 = z10;
            z5 = zL;
        }
        Layout layout5 = (Layout) obj;
        int iH = rpi.h(i10, i3, layout5);
        if (!z4 || layout5.getLineCount() <= iH) {
            return iH < i10 ? e(r5, textPaint23, iK2, alignment, r24, false, z5, truncateAt, iH, false, paragraph, elementsServices, null) : layout5;
        }
        if (!z2 && !z8) {
            i12 = i5;
            if ((i12 & SemanticState.ReadOnly) != 0) {
                i13 = iH;
                truncateAt2 = TextUtils.TruncateAt.END;
                textPaint = textPaint23;
                r1 = r5;
            }
            return e(r1, textPaint, iK2, alignment, r24, false, z5, truncateAt2, i13, false, paragraph2, elementsServices, Integer.valueOf(i6));
        }
        i12 = i5;
        if (layout5.getLineStart(iH) < r5.length()) {
            if (paragraph2.m()) {
                if ((i12 & SemanticState.Hidden) != 0) {
                    long jJniGetTruncatedAlt = Paragraph.jniGetTruncatedAlt(paragraph2.paragraphHandle);
                    if (jJniGetTruncatedAlt == 0) {
                        paragraph3 = null;
                    } else {
                        paragraph3 = new Paragraph(jJniGetTruncatedAlt, paragraph2.b);
                    }
                } else {
                    paragraph3 = null;
                }
                if (paragraph3 != null) {
                    try {
                        String strJ = paragraph3.j();
                        Context contextC = elementsServices.c();
                        DisplayMetrics displayMetricsE5 = elementsServices.e();
                        String strZ2 = ahno.Z(strJ);
                        orq orqVarL = elementsServices.l();
                        tld tldVar7 = oxjVar.h;
                        oui ouiVar7 = oxjVar.b;
                        paragraph4 = paragraph3;
                        try {
                            Map map4 = oxjVar.g;
                            kjc kjcVar7 = oxjVar.d;
                            i13 = iH;
                            layout = layout5;
                            CharSequence charSequenceM6 = oxh.m(contextC, displayMetricsE5, paragraph4, strZ2, orqVarL, tldVar7, ouiVar7, map4, owjVar, kjcVar7, 0);
                            paragraph4.k();
                            charSequence4 = charSequenceM6;
                        } catch (Throwable th) {
                            th = th;
                            paragraph4.k();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        paragraph4 = paragraph3;
                    }
                } else {
                    layout = layout5;
                    i13 = iH;
                }
                if (TextUtils.isEmpty(charSequence4) && z8) {
                    charSequence = "…";
                }
            } else {
                layout = layout5;
                i13 = iH;
                if (!z2) {
                    charSequence = "…";
                }
            }
            i14 = i13 - 1;
            locale = elementsServices.c().getResources().getConfiguration().locale;
            bPeekByte = Memory.peekByte(FlagServices.b().c + 35);
            if (!z8 || z2) {
                r32 = i9;
            } else {
                r32 = i6;
            }
            if (layout.getParagraphDirection(i14) == -1) {
                i15 = i9;
            } else {
                i15 = i6;
            }
            spannableString = new SpannableString(charSequence);
            if (spannableString.length() > 0) {
                z6 = z3;
                spannableString.setSpan(new oyb(z6), i6, spannableString.length(), 18);
            } else {
                z6 = z3;
            }
            while (TextUtils.indexOf((CharSequence) spannableString, ' ', i6, spannableString.length()) >= 0) {
                spannableString = new SpannableString(TextUtils.replace(spannableString, oxh.c, oxh.d));
            }
            if (z7) {
                layout3 = layout;
                iA = oxh.a(i14, layout3, spannableString, textPaint23, r32, locale);
                textPaint = textPaint23;
                if (z6) {
                    r3 = i9;
                } else {
                    desiredWidth3 = Layout.getDesiredWidth(spannableString, textPaint);
                    spannableString3 = new SpannableString(spannableString);
                    oxh.l(spannableString3, layout3, iA);
                    if (Layout.getDesiredWidth(spannableString3, textPaint) > desiredWidth3 + 0.5f) {
                        iA = oxh.a(i14, layout3, spannableString3, textPaint, r32, locale);
                        r3 = i6;
                        spannableString = spannableString3;
                    } else {
                        r3 = i6;
                    }
                }
                charSequenceF = oxh.f(iA, layout3, spannableString, r3);
            } else {
                layout2 = layout;
                textPaint = textPaint23;
                desiredWidth = Layout.getDesiredWidth(spannableString, textPaint);
                if (i15 != 0) {
                    width = desiredWidth;
                } else {
                    width = layout2.getWidth() - desiredWidth;
                }
                i16 = rpi.i(i13, layout2, width, layout2.getOffsetForHorizontal(i14, width));
                if (z6) {
                    r2 = i9;
                } else {
                    spannableString2 = new SpannableString(spannableString);
                    oxh.l(spannableString2, layout2, i16);
                    desiredWidth2 = Layout.getDesiredWidth(spannableString2, textPaint);
                    if (desiredWidth2 > desiredWidth + 0.5f) {
                        if (i15 == 0) {
                            desiredWidth2 = layout2.getWidth() - desiredWidth2;
                        }
                        i16 = rpi.i(i13, layout2, desiredWidth2, layout2.getOffsetForHorizontal(i14, desiredWidth2));
                        r2 = i6;
                        spannableString = spannableString2;
                    } else {
                        r2 = i6;
                    }
                }
                charSequenceF = oxh.f(i16, layout2, spannableString, r2);
            }
            if (bPeekByte == 0 && z6) {
                truncateAt2 = null;
                r1 = charSequenceF;
            } else {
                truncateAt2 = truncateAt;
                r1 = charSequenceF;
            }
            return e(r1, textPaint, iK2, alignment, r24, false, z5, truncateAt2, i13, false, paragraph2, elementsServices, Integer.valueOf(i6));
        }
        layout = layout5;
        i13 = iH;
        charSequence = charSequence4;
        i14 = i13 - 1;
        locale = elementsServices.c().getResources().getConfiguration().locale;
        bPeekByte = Memory.peekByte(FlagServices.b().c + 35);
        if (z8) {
            r32 = i9;
        } else {
            r32 = i9;
        }
        if (layout.getParagraphDirection(i14) == -1) {
            i15 = i9;
        } else {
            i15 = i6;
        }
        spannableString = new SpannableString(charSequence);
        if (spannableString.length() > 0) {
            z6 = z3;
            spannableString.setSpan(new oyb(z6), i6, spannableString.length(), 18);
        } else {
            z6 = z3;
        }
        while (TextUtils.indexOf((CharSequence) spannableString, ' ', i6, spannableString.length()) >= 0) {
            spannableString = new SpannableString(TextUtils.replace(spannableString, oxh.c, oxh.d));
        }
        if (z7) {
            layout3 = layout;
            iA = oxh.a(i14, layout3, spannableString, textPaint23, r32, locale);
            textPaint = textPaint23;
            if (z6) {
                desiredWidth3 = Layout.getDesiredWidth(spannableString, textPaint);
                spannableString3 = new SpannableString(spannableString);
                oxh.l(spannableString3, layout3, iA);
                if (Layout.getDesiredWidth(spannableString3, textPaint) > desiredWidth3 + 0.5f) {
                    iA = oxh.a(i14, layout3, spannableString3, textPaint, r32, locale);
                    r3 = i6;
                    spannableString = spannableString3;
                } else {
                    r3 = i6;
                }
            } else {
                r3 = i9;
            }
            charSequenceF = oxh.f(iA, layout3, spannableString, r3);
        } else {
            layout2 = layout;
            textPaint = textPaint23;
            desiredWidth = Layout.getDesiredWidth(spannableString, textPaint);
            if (i15 != 0) {
                width = desiredWidth;
            } else {
                width = layout2.getWidth() - desiredWidth;
            }
            i16 = rpi.i(i13, layout2, width, layout2.getOffsetForHorizontal(i14, width));
            if (z6) {
                spannableString2 = new SpannableString(spannableString);
                oxh.l(spannableString2, layout2, i16);
                desiredWidth2 = Layout.getDesiredWidth(spannableString2, textPaint);
                if (desiredWidth2 > desiredWidth + 0.5f) {
                    if (i15 == 0) {
                        desiredWidth2 = layout2.getWidth() - desiredWidth2;
                    }
                    i16 = rpi.i(i13, layout2, desiredWidth2, layout2.getOffsetForHorizontal(i14, desiredWidth2));
                    r2 = i6;
                    spannableString = spannableString2;
                } else {
                    r2 = i6;
                }
            } else {
                r2 = i9;
            }
            charSequenceF = oxh.f(i16, layout2, spannableString, r2);
        }
        if (bPeekByte == 0) {
            truncateAt2 = truncateAt;
            r1 = charSequenceF;
        } else {
            truncateAt2 = truncateAt;
            r1 = charSequenceF;
        }
        return e(r1, textPaint, iK2, alignment, r24, false, z5, truncateAt2, i13, false, paragraph2, elementsServices, Integer.valueOf(i6));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008f  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
    private static final Layout e(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, TextDirectionHeuristic textDirectionHeuristic, boolean z, boolean z2, TextUtils.TruncateAt truncateAt, int i2, boolean z3, Paragraph paragraph, ElementsServices elementsServices, Integer num) {
        BoringLayout.Metrics metricsIsBoring;
        int iCeil;
        StaticLayout.Builder builderObtain;
        int iJniGetParagraphStyleTextWrapStyle;
        BoringLayout.Metrics metrics = (BoringLayout.Metrics) f.get();
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 33) {
            metricsIsBoring = BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, false, metrics);
        } else {
            metricsIsBoring = (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR || textDirectionHeuristic == TextDirectionHeuristics.LTR) ? BoringLayout.isBoring(charSequence, textPaint, metrics) : null;
        }
        if (metricsIsBoring == null) {
            if (z) {
                iCeil = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
            }
            builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, iCeil);
            builderObtain.setAlignment(alignment).setIncludePad(z2).setEllipsize(truncateAt).setTextDirection(textDirectionHeuristic);
            if (Build.VERSION.SDK_INT >= 29 && paragraph.c() == 4) {
                builderObtain.setJustificationMode(1);
            }
            if (!z3) {
                builderObtain.setMaxLines(i2);
            }
            builderObtain.setLineSpacing(paragraph.a() * elementsServices.a(), 1.0f);
            iJniGetParagraphStyleTextWrapStyle = Paragraph.jniGetParagraphStyleTextWrapStyle(paragraph.paragraphHandle);
            if (num == null && iJniGetParagraphStyleTextWrapStyle == 0) {
                num.intValue();
                builderObtain.setBreakStrategy(0);
            } else {
                if (iJniGetParagraphStyleTextWrapStyle == 1) {
                    i3 = 2;
                } else if (iJniGetParagraphStyleTextWrapStyle == 2) {
                    i3 = 1;
                }
                builderObtain.setBreakStrategy(i3);
            }
            return builderObtain.build();
        }
        if (metricsIsBoring.width <= i || z) {
            BoringLayout.Metrics metrics2 = new BoringLayout.Metrics();
            metrics2.width = metricsIsBoring.width;
            metrics2.top = metricsIsBoring.top;
            metrics2.ascent = metricsIsBoring.ascent;
            metrics2.descent = metricsIsBoring.descent;
            metrics2.bottom = metricsIsBoring.bottom;
            metrics2.leading = metricsIsBoring.leading;
            return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics2, z2);
        }
        iCeil = i;
        builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, iCeil);
        builderObtain.setAlignment(alignment).setIncludePad(z2).setEllipsize(truncateAt).setTextDirection(textDirectionHeuristic);
        if (Build.VERSION.SDK_INT >= 29) {
            builderObtain.setJustificationMode(1);
        }
        if (!z3) {
            builderObtain.setMaxLines(i2);
        }
        builderObtain.setLineSpacing(paragraph.a() * elementsServices.a(), 1.0f);
        iJniGetParagraphStyleTextWrapStyle = Paragraph.jniGetParagraphStyleTextWrapStyle(paragraph.paragraphHandle);
        if (num == null) {
            if (iJniGetParagraphStyleTextWrapStyle == 1) {
                i3 = 2;
            } else if (iJniGetParagraphStyleTextWrapStyle == 2) {
                i3 = 1;
            }
            builderObtain.setBreakStrategy(i3);
        } else {
            if (iJniGetParagraphStyleTextWrapStyle == 1) {
                i3 = 2;
            } else if (iJniGetParagraphStyleTextWrapStyle == 2) {
                i3 = 1;
            }
            builderObtain.setBreakStrategy(i3);
        }
        return builderObtain.build();
    }

    @Override // defpackage.owu
    public final Layout a(TextTypeOuterClass$TextType textTypeOuterClass$TextType, owj owjVar, int i, int i2, ElementsServices elementsServices, boolean z) {
        return c(textTypeOuterClass$TextType, null, owjVar, i, i2, elementsServices, z);
    }

    @Override // defpackage.owu
    public final Layout b(TextTypeOuterClass$TextType textTypeOuterClass$TextType, owj owjVar, int i, ElementsServices elementsServices, boolean z) {
        Paragraph paragraphCreateFromTextType = Paragraph.createFromTextType(textTypeOuterClass$TextType);
        if (paragraphCreateFromTextType == null) {
            return super.b(textTypeOuterClass$TextType, owjVar, i, elementsServices, z);
        }
        try {
            int iPeekInt = 1;
            if ((Memory.peekByte(textTypeOuterClass$TextType.c + 8) & 2) != 0) {
                iPeekInt = Memory.peekInt(textTypeOuterClass$TextType.c + (true != atnq.a ? 16L : 12L), false);
            }
            return d(paragraphCreateFromTextType, iPeekInt, owjVar, i, 0, elementsServices, z);
        } finally {
            paragraphCreateFromTextType.k();
        }
    }

    public final Layout c(TextTypeOuterClass$TextType textTypeOuterClass$TextType, Paragraph paragraph, owj owjVar, int i, int i2, ElementsServices elementsServices, boolean z) {
        if (paragraph == null) {
            return super.a(textTypeOuterClass$TextType, owjVar, i, i2, elementsServices, z);
        }
        int iJniGetParagraphStyleLineClamp = (paragraph.a & 131072) == 0 ? 0 : Paragraph.jniGetParagraphStyleLineClamp(paragraph.paragraphHandle);
        if (iJniGetParagraphStyleLineClamp <= 0) {
            if ((Memory.peekByte(textTypeOuterClass$TextType.c + 8) & 2) != 0) {
                iJniGetParagraphStyleLineClamp = Memory.peekInt(textTypeOuterClass$TextType.c + (true != atnq.a ? 16L : 12L), false);
            } else {
                iJniGetParagraphStyleLineClamp = Alert.DURATION_SHOW_INDEFINITELY;
            }
        }
        return d(paragraph, iJniGetParagraphStyleLineClamp, owjVar, i, i2, elementsServices, z);
    }
}
