package defpackage;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.jni.UnsafeMemory;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.protos.youtube.elements.upb.TextTypeOuterClass$TextType;
import java.util.Locale;
import java.util.Map;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class owu {
    public final nxl a;
    protected final oui b;
    public final Map c;
    public final kjc d;

    public owu(nxl nxlVar, oui ouiVar, kjc kjcVar, Map map) {
        this.a = nxlVar;
        this.b = ouiVar;
        this.d = kjcVar;
        this.c = map;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    private static final Layout c(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, TextDirectionHeuristic textDirectionHeuristic, boolean z, boolean z2, TextUtils.TruncateAt truncateAt, int i2, boolean z3, asxe asxeVar, ElementsServices elementsServices, Integer num) {
        int iCeil;
        StaticLayout.Builder builderObtain;
        BoringLayout.Metrics metricsIsBoring = null;
        if (Build.VERSION.SDK_INT >= 33) {
            metricsIsBoring = BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, false, null);
        } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR || textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            metricsIsBoring = BoringLayout.isBoring(charSequence, textPaint);
        }
        BoringLayout.Metrics metrics = metricsIsBoring;
        if (metrics == null) {
            if (z) {
                iCeil = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
            }
            builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, iCeil);
            builderObtain.setAlignment(alignment).setIncludePad(z2).setEllipsize(truncateAt).setTextDirection(textDirectionHeuristic);
            if (num != null) {
                num.intValue();
                builderObtain.setBreakStrategy(0);
            }
            if (!z3) {
                builderObtain.setMaxLines(i2);
            }
            owt.l(builderObtain, asxeVar, elementsServices);
            return builderObtain.build();
        }
        if (metrics.width <= i || z) {
            return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z2);
        }
        iCeil = i;
        builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, iCeil);
        builderObtain.setAlignment(alignment).setIncludePad(z2).setEllipsize(truncateAt).setTextDirection(textDirectionHeuristic);
        if (num != null) {
            num.intValue();
            builderObtain.setBreakStrategy(0);
        }
        if (!z3) {
            builderObtain.setMaxLines(i2);
        }
        owt.l(builderObtain, asxeVar, elementsServices);
        return builderObtain.build();
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:118:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:130:0x0203  */
    /* JADX WARN: Code duplicated, block: B:131:0x0206  */
    /* JADX WARN: Code duplicated, block: B:135:0x0217  */
    /* JADX WARN: Code duplicated, block: B:136:0x021a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0222  */
    /* JADX WARN: Code duplicated, block: B:143:0x0239  */
    /* JADX WARN: Code duplicated, block: B:145:0x023f  */
    /* JADX WARN: Code duplicated, block: B:148:0x024a  */
    /* JADX WARN: Code duplicated, block: B:150:0x0250  */
    /* JADX WARN: Code duplicated, block: B:152:0x025a  */
    /* JADX WARN: Code duplicated, block: B:155:0x026d A[EDGE_INSN: B:155:0x026d->B:156:0x026e BREAK  A[LOOP:0: B:116:0x01d2->B:154:0x0269]] */
    /* JADX WARN: Code duplicated, block: B:158:0x0272  */
    /* JADX WARN: Code duplicated, block: B:160:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:161:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:164:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:166:0x02db  */
    /* JADX WARN: Code duplicated, block: B:170:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:172:0x0312  */
    /* JADX WARN: Code duplicated, block: B:176:0x0374 A[LOOP:1: B:168:0x02ef->B:176:0x0374, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x0394  */
    /* JADX WARN: Code duplicated, block: B:180:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:182:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:183:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:185:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:189:0x040b  */
    /* JADX WARN: Code duplicated, block: B:191:0x0428  */
    /* JADX WARN: Code duplicated, block: B:196:0x0483 A[LOOP:2: B:187:0x0405->B:196:0x0483, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:198:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:200:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:202:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:203:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:205:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:208:0x0511  */
    /* JADX WARN: Code duplicated, block: B:210:0x0532  */
    /* JADX WARN: Code duplicated, block: B:217:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:219:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:222:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:224:0x060d  */
    /* JADX WARN: Code duplicated, block: B:226:0x064b  */
    /* JADX WARN: Code duplicated, block: B:228:0x0670  */
    /* JADX WARN: Code duplicated, block: B:230:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:234:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:235:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:238:0x0701  */
    /* JADX WARN: Code duplicated, block: B:239:0x070a  */
    /* JADX WARN: Code duplicated, block: B:249:0x0725  */
    /* JADX WARN: Code duplicated, block: B:251:0x072b  */
    /* JADX WARN: Code duplicated, block: B:256:0x0744  */
    /* JADX WARN: Code duplicated, block: B:259:0x0767  */
    /* JADX WARN: Code duplicated, block: B:273:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:274:0x07c4 A[PHI: r41
      0x07c4: PHI (r41v1 java.lang.CharSequence) = 
      (r41v0 java.lang.CharSequence)
      (r41v0 java.lang.CharSequence)
      (r41v2 java.lang.CharSequence)
      (r41v2 java.lang.CharSequence)
     binds: [B:265:0x078a, B:272:0x07bf, B:269:0x07ba, B:270:0x07bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:310:0x087c  */
    /* JADX WARN: Code duplicated, block: B:312:0x0889  */
    /* JADX WARN: Code duplicated, block: B:314:0x0895  */
    /* JADX WARN: Code duplicated, block: B:317:0x08a2  */
    /* JADX WARN: Code duplicated, block: B:322:0x026e A[EDGE_INSN: B:322:0x026e->B:156:0x026e BREAK  A[LOOP:0: B:116:0x01d2->B:154:0x0269], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x026e A[EDGE_INSN: B:323:0x026e->B:156:0x026e BREAK  A[LOOP:0: B:116:0x01d2->B:154:0x0269], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x026d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:330:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:331:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:332:0x0387 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x036d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x0479 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:0x0494 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x0597 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x0581 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v23 */
    /* JADX WARN: Type inference failed for: r22v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r22v9, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v54, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v75 */
    /* JADX WARN: Type inference failed for: r2v76 */
    public Layout a(TextTypeOuterClass$TextType textTypeOuterClass$TextType, owj owjVar, int i, int i2, ElementsServices elementsServices, boolean z) {
        int iPeekInt;
        asxe asxeVar;
        asxe asxeVarA;
        TextPaint textPaint;
        boolean z2;
        asxo asxoVar;
        asxe asxeVar2;
        boolean z3;
        TextUtils.TruncateAt truncateAt;
        asxe asxeVar3;
        TextPaint textPaint2;
        TextPaint textPaint3;
        int i3;
        Object objC;
        Object obj;
        ?? r1;
        TextPaint textPaint4;
        int iK;
        TextDirectionHeuristic textDirectionHeuristicK;
        int iBr;
        Layout.Alignment alignmentH;
        TextUtils.TruncateAt truncateAtI;
        int i4;
        boolean z4;
        ?? r22;
        asxe asxeVar4;
        TextUtils.TruncateAt truncateAt2;
        TextDirectionHeuristic textDirectionHeuristic;
        boolean z5;
        int i5;
        int iH;
        TextDirectionHeuristic textDirectionHeuristic2;
        boolean z6;
        CharSequence charSequence;
        boolean z7;
        int i6;
        TextPaint textPaint5;
        CharSequence charSequenceE;
        boolean z8;
        oui ouiVar;
        kjc kjcVar;
        Map map;
        TextPaint textPaint6;
        CharSequence charSequenceM;
        TextDirectionHeuristic textDirectionHeuristicK2;
        nxl nxlVar;
        int iBr2;
        Layout.Alignment alignmentH2;
        asxe asxeVar5;
        yvh yvhVarQ;
        asxx asxxVarAW;
        Layout.Alignment alignment;
        TextDirectionHeuristic textDirectionHeuristic3;
        yvh yvhVarQ2;
        CharSequence charSequence2;
        nxl nxlVar2;
        oui ouiVar2;
        int iPeekInt2;
        TextPaint textPaint7;
        int i7;
        CharSequence charSequence3;
        Layout layout;
        int i8;
        TextPaint textPaint8;
        CharSequence charSequence4;
        nxl nxlVar3;
        oui ouiVar3;
        int i9;
        CharSequence charSequenceO;
        int i10;
        Layout layoutJ;
        asxu asxuVarAV;
        Layout.Alignment alignment2;
        TextDirectionHeuristic textDirectionHeuristic4;
        yvh yvhVarQ3;
        CharSequence charSequence5;
        nxl nxlVar4;
        oui ouiVar4;
        TextPaint textPaint9;
        int i11;
        ?? r2;
        asxu asxuVar;
        CharSequence charSequenceO2;
        CharSequence charSequence6;
        nxl nxlVar5;
        oui ouiVar5;
        TextPaint textPaint10;
        Layout.Alignment alignment3;
        TextDirectionHeuristic textDirectionHeuristic5;
        Layout layoutJ2;
        asxr asxrVarAU;
        TextPaint textPaint11;
        CharSequence charSequence7;
        int iAS;
        int i12;
        oui ouiVar6;
        kjc kjcVar2;
        Map map2;
        CharSequence charSequence8;
        nxl nxlVar6;
        Layout.Alignment alignment4;
        TextDirectionHeuristic textDirectionHeuristic6;
        Layout layoutJ3;
        int i13;
        aszd aszdVarBz;
        byte b;
        asxr asxrVarAU2;
        int iAT;
        int iPeekInt3;
        int i14;
        asxe asxeVarAW = textTypeOuterClass$TextType.aU() ? textTypeOuterClass$TextType.aW() : null;
        byte b2 = 2;
        if ((Memory.peekByte(textTypeOuterClass$TextType.c + 8) & 2) != 0) {
            iPeekInt = Memory.peekInt(textTypeOuterClass$TextType.c + (true != atnq.a ? 16L : 12L), false);
        } else {
            iPeekInt = Integer.MAX_VALUE;
        }
        if (textTypeOuterClass$TextType.aV()) {
            if (textTypeOuterClass$TextType.g == null && (Memory.peekByte(textTypeOuterClass$TextType.c + 8) & 4) != 0) {
                textTypeOuterClass$TextType.g = new asxe(textTypeOuterClass$TextType.cp(true != atnq.a ? 20 : 32, asxd.a));
            }
            if (textTypeOuterClass$TextType.g == null) {
                int i15 = asxe.A;
                asxeVar = asxc.a;
            } else {
                asxeVar = textTypeOuterClass$TextType.g;
            }
        } else {
            asxeVar = null;
        }
        TextPaint textPaint12 = (TextPaint) elementsServices.w().io();
        if (iPeekInt <= 0) {
            iPeekInt = Integer.MAX_VALUE;
        }
        if (asxeVarAW != null) {
            asxeVarA = nuy.a(asxeVarAW);
        } else {
            int i16 = asxe.A;
            asxeVarA = asxc.a;
        }
        boolean z9 = Memory.peekByte(FlagServices.b().c + 29) != 0;
        boolean z10 = z9 && (Memory.peekByte(asxeVarA.c + 8) & 32) != 0 && asxeVarA.bs() == 6;
        boolean z11 = z9 && (Memory.peekByte(asxeVarA.c + 8) & 8) != 0 && asxeVarA.bq() == 2;
        boolean z12 = iPeekInt < Integer.MAX_VALUE && (z11 || (!(asxeVar == null || (Memory.peekByte(asxeVar.c + 8) & 1) == 0) || z10));
        if (!z12) {
            if (iPeekInt < Integer.MAX_VALUE) {
                int i17 = owt.c;
                if (asxeVarA == null) {
                    z2 = false;
                    textPaint = textPaint12;
                } else {
                    int length = asxeVarA.bi().length();
                    int i18 = 0;
                    while (true) {
                        if (i18 < asxeVarA.bh()) {
                            aszd aszdVarBz2 = asxeVarA.bz(i18);
                            long j = aszdVarBz2.c;
                            textPaint = textPaint12;
                            int iPeekInt4 = Memory.peekInt(j + 12, false);
                            int i19 = length;
                            int iPeekInt5 = (Memory.peekByte(aszdVarBz2.c + 8) & b2) != 0 ? Memory.peekInt(j + 16, false) : i19 - iPeekInt4;
                            length = i19;
                            if (iPeekInt4 != 0 || iPeekInt5 < length) {
                                if (Float.intBitsToFloat(Memory.peekInt(j + 20, false)) == 0.0f) {
                                    long j2 = aszdVarBz2.c;
                                    if ((Memory.peekByte(j2 + 9) & 8) == 0 && (Memory.peekByte(j2 + 8) & 4) == 0 && !aszdVarBz2.cl()) {
                                        boolean z13 = aszd.a;
                                        long j3 = aszdVarBz2.c + ((long) (true != z13 ? 76 : 56));
                                        long j4 = 1 + j3;
                                        byte bPeekByte = Memory.peekByte(j3);
                                        byte bPeekByte2 = Memory.peekByte(j4);
                                        boolean z14 = UnsafeMemory.a;
                                        byte b3 = true != z14 ? bPeekByte2 : bPeekByte;
                                        if (true == z14) {
                                            bPeekByte = bPeekByte2;
                                        }
                                        if (((short) ((b3 << 8) | (bPeekByte & 255))) != 7 && !aszdVarBz2.aW()) {
                                            long j5 = aszdVarBz2.c;
                                            if (Memory.peekByte(11 + j5) == 0) {
                                                if (Float.intBitsToFloat(Memory.peekInt(j5 + (true != z13 ? 36L : 32L), false)) != 0.0f || aszdVarBz2.aY() != 1) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i18++;
                            textPaint12 = textPaint;
                            b2 = 2;
                        } else {
                            textPaint = textPaint12;
                            z2 = false;
                        }
                    }
                }
            } else {
                textPaint = textPaint12;
                z2 = false;
            }
            int i20 = owt.c;
            if (asxeVarA != null) {
                asxoVar = null;
                break;
            }
            i13 = 0;
            while (true) {
                if (i13 < asxeVarA.bh()) {
                    asxoVar = null;
                    break;
                }
                aszdVarBz = asxeVarA.bz(i13);
                if (aszdVarBz.j == null) {
                    b = 1;
                    if ((Memory.peekByte(aszdVarBz.c + 10) & 1) != 0) {
                        continue;
                    }
                    i13++;
                } else {
                    b = 1;
                }
                if (aszdVarBz.j == null && (Memory.peekByte(aszdVarBz.c + 10) & b) != 0) {
                    if (b != aszd.a) {
                        i14 = 64;
                    } else {
                        i14 = SemanticState.Focused;
                    }
                    aszdVarBz.j = new asxo(aszdVarBz.cp(i14, asxn.a));
                }
                if (aszdVarBz.j == null) {
                    asxoVar = asxm.a;
                } else {
                    asxoVar = aszdVarBz.j;
                }
                if (asxoVar.aT()) {
                    long j6 = asxoVar.aW().c;
                    iPeekInt3 = Memory.peekInt(j6 + 12, false);
                    int iPeekInt6 = Memory.peekInt(j6 + 16, false);
                    if (iPeekInt3 > 0 && iPeekInt6 >= iPeekInt3) {
                        break;
                    }
                    i13++;
                } else if (asxoVar.aS()) {
                    if (asxoVar.aR()) {
                        asxrVarAU2 = asxoVar.aU();
                        if (asxrVarAU2.aT() > 0) {
                            iAT = asxrVarAU2.aT();
                            asxrVarAU2.aU();
                            if (iAT != asxrVarAU2.e.size()) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                    i13++;
                } else {
                    if (asxoVar.aV().aS() > 0) {
                        break;
                    }
                    i13++;
                }
            }
            CharSequence charSequenceP = "";
            if (asxoVar != null) {
                nxl nxlVar7 = this.a;
                ouiVar = this.b;
                kjcVar = this.d;
                map = this.c;
                textPaint6 = (TextPaint) elementsServices.w().io();
                charSequenceM = owt.m(asxeVarA);
                String strBi = asxeVarA.bi();
                textDirectionHeuristicK2 = owt.k(asxeVarA, elementsServices.b(), strBi);
                nxlVar = nxlVar7;
                if ((Memory.peekByte(asxeVarA.c + 8) & 4) != 0) {
                    iBr2 = asxeVarA.br();
                } else {
                    iBr2 = 1;
                }
                alignmentH2 = owt.h(iBr2, strBi, textDirectionHeuristicK2, elementsServices.b());
                if (asxoVar.aR()) {
                    asxrVarAU = asxoVar.aU();
                    textPaint11 = new TextPaint(textPaint6);
                    textPaint11.bgColor = textPaint6.bgColor;
                    textPaint11.baselineShift = textPaint6.baselineShift;
                    textPaint11.linkColor = textPaint6.linkColor;
                    textPaint11.drawableState = textPaint6.drawableState;
                    textPaint11.density = textPaint6.density;
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint11.underlineColor = textPaint6.underlineColor;
                        textPaint11.underlineThickness = textPaint6.underlineThickness;
                    }
                    asxeVar2 = asxeVar;
                    charSequence7 = "";
                    iAS = 0;
                    i12 = 0;
                    while (true) {
                        if (i12 < asxrVarAU.aT()) {
                            textPaint11.set(textPaint6);
                            textPaint11.bgColor = textPaint6.bgColor;
                            textPaint11.baselineShift = textPaint6.baselineShift;
                            textPaint11.linkColor = textPaint6.linkColor;
                            textPaint11.drawableState = textPaint6.drawableState;
                            textPaint11.density = textPaint6.density;
                            if (Build.VERSION.SDK_INT >= 29) {
                                textPaint11.underlineColor = textPaint6.underlineColor;
                                textPaint11.underlineThickness = textPaint6.underlineThickness;
                            }
                            iAS = asxrVarAU.aS(i12);
                            asxe asxeVar6 = asxeVarA;
                            ouiVar6 = ouiVar;
                            kjcVar2 = kjcVar;
                            map2 = map;
                            CharSequence charSequenceO3 = owt.o(elementsServices.c(), elementsServices.e(), asxeVar6, charSequenceM, elementsServices.l(), nxlVar, ouiVar6, map2, owjVar, kjcVar2, asxrVarAU.aR(i12));
                            charSequence8 = charSequenceM;
                            nxlVar6 = nxlVar;
                            owt.f(textPaint11, charSequenceO3, elementsServices.d());
                            alignment4 = alignmentH2;
                            textDirectionHeuristic6 = textDirectionHeuristicK2;
                            layoutJ3 = owt.j(charSequenceO3, textPaint11, rpi.k(charSequenceO3, textPaint11, i), alignment4, textDirectionHeuristic6, asxeVar6, elementsServices);
                            charSequence7 = charSequenceO3;
                            asxeVar5 = asxeVar6;
                            if (layoutJ3.getLineCount() <= iAS) {
                                yvhVarQ = new yvh(charSequence7, textPaint11, iAS, layoutJ3);
                                z3 = z2;
                                truncateAt = null;
                            } else {
                                i12++;
                                nxlVar = nxlVar6;
                                ouiVar = ouiVar6;
                                asxeVarA = asxeVar5;
                                alignmentH2 = alignment4;
                                textDirectionHeuristicK2 = textDirectionHeuristic6;
                                kjcVar = kjcVar2;
                                charSequenceM = charSequence8;
                                map = map2;
                            }
                        } else {
                            asxeVar5 = asxeVarA;
                            yvhVarQ = new yvh(charSequence7, textPaint11, iAS, (Layout) null);
                            z3 = z2;
                            truncateAt = null;
                        }
                    }
                } else {
                    asxeVar2 = asxeVar;
                    asxeVar5 = asxeVarA;
                    if (asxoVar.aS()) {
                        asxuVarAV = asxoVar.aV();
                        alignment2 = alignmentH2;
                        textDirectionHeuristic4 = textDirectionHeuristicK2;
                        yvhVarQ3 = owt.q(asxeVar5, charSequenceM, iPeekInt, textPaint6, alignment2, textDirectionHeuristic4, i, elementsServices, nxlVar, ouiVar, kjcVar, map, owjVar);
                        ouiVar4 = ouiVar;
                        if (yvhVarQ3.d != null) {
                            charSequence5 = charSequenceM;
                            nxlVar4 = nxlVar;
                            z3 = z2;
                            yvhVarQ = yvhVarQ3;
                            truncateAt = null;
                        } else {
                            textPaint9 = new TextPaint(textPaint6);
                            textPaint9.bgColor = textPaint6.bgColor;
                            textPaint9.baselineShift = textPaint6.baselineShift;
                            textPaint9.linkColor = textPaint6.linkColor;
                            textPaint9.drawableState = textPaint6.drawableState;
                            textPaint9.density = textPaint6.density;
                            if (Build.VERSION.SDK_INT >= 29) {
                                charSequence5 = charSequenceM;
                                nxlVar4 = nxlVar;
                                textPaint9.underlineColor = textPaint6.underlineColor;
                                textPaint9.underlineThickness = textPaint6.underlineThickness;
                            }
                            charSequence5 = charSequenceM;
                            nxlVar4 = nxlVar;
                            i11 = 0;
                            r2 = yvhVarQ3.c;
                            while (true) {
                                if (i11 < asxuVarAV.aS()) {
                                    textPaint9.set(textPaint6);
                                    textPaint9.bgColor = textPaint6.bgColor;
                                    textPaint9.baselineShift = textPaint6.baselineShift;
                                    textPaint9.linkColor = textPaint6.linkColor;
                                    textPaint9.drawableState = textPaint6.drawableState;
                                    textPaint9.density = textPaint6.density;
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        textPaint9.underlineColor = textPaint6.underlineColor;
                                        textPaint9.underlineThickness = textPaint6.underlineThickness;
                                    }
                                    asxuVar = asxuVarAV;
                                    charSequenceO2 = owt.o(elementsServices.c(), elementsServices.e(), asxeVar5, charSequence5, elementsServices.l(), nxlVar4, ouiVar4, map, owjVar, kjcVar, asxuVar.aR(i11));
                                    charSequence6 = charSequence5;
                                    nxlVar5 = nxlVar4;
                                    ouiVar5 = ouiVar4;
                                    owt.f(textPaint9, charSequenceO2, elementsServices.d());
                                    asxe asxeVar7 = asxeVar5;
                                    textPaint10 = textPaint9;
                                    alignment3 = alignment2;
                                    textDirectionHeuristic5 = textDirectionHeuristic4;
                                    layoutJ2 = owt.j(charSequenceO2, textPaint10, rpi.k(charSequenceO2, textPaint9, i), alignment3, textDirectionHeuristic5, asxeVar7, elementsServices);
                                    asxeVar5 = asxeVar7;
                                    if (layoutJ2.getLineCount() <= iPeekInt) {
                                        yvhVarQ = new yvh(charSequenceO2, textPaint10, iPeekInt, layoutJ2);
                                        z3 = z2;
                                        truncateAt = null;
                                    } else {
                                        i11++;
                                        textPaint9 = textPaint10;
                                        asxuVarAV = asxuVar;
                                        nxlVar4 = nxlVar5;
                                        ouiVar4 = ouiVar5;
                                        alignment2 = alignment3;
                                        textDirectionHeuristic4 = textDirectionHeuristic5;
                                        charSequence5 = charSequence6;
                                        r2 = charSequenceO2;
                                    }
                                } else {
                                    yvhVarQ = new yvh((CharSequence) r2, textPaint9, iPeekInt, (Layout) null);
                                    z3 = z2;
                                    truncateAt = null;
                                }
                            }
                        }
                    } else if (asxoVar.aT()) {
                        asxxVarAW = asxoVar.aW();
                        z3 = z2;
                        alignment = alignmentH2;
                        textDirectionHeuristic3 = textDirectionHeuristicK2;
                        yvhVarQ2 = owt.q(asxeVar5, charSequenceM, iPeekInt, textPaint6, alignment, textDirectionHeuristic3, i, elementsServices, nxlVar, ouiVar, kjcVar, map, owjVar);
                        ouiVar2 = ouiVar;
                        if (yvhVarQ2.d != null) {
                            charSequence2 = charSequenceM;
                            nxlVar2 = nxlVar;
                            yvhVarQ = yvhVarQ2;
                        } else {
                            long j7 = asxxVarAW.c;
                            int iPeekInt7 = Memory.peekInt(j7 + 12, false);
                            iPeekInt2 = Memory.peekInt(j7 + 16, false);
                            textPaint7 = new TextPaint(textPaint6);
                            textPaint7.bgColor = textPaint6.bgColor;
                            textPaint7.baselineShift = textPaint6.baselineShift;
                            textPaint7.linkColor = textPaint6.linkColor;
                            textPaint7.drawableState = textPaint6.drawableState;
                            textPaint7.density = textPaint6.density;
                            if (Build.VERSION.SDK_INT >= 29) {
                                charSequence2 = charSequenceM;
                                nxlVar2 = nxlVar;
                                textPaint7.underlineColor = textPaint6.underlineColor;
                                textPaint7.underlineThickness = textPaint6.underlineThickness;
                            }
                            charSequence2 = charSequenceM;
                            nxlVar2 = nxlVar;
                            i7 = iPeekInt7;
                            charSequence3 = null;
                            layout = null;
                            i8 = -1;
                            while (i7 <= iPeekInt2) {
                                int i21 = (iPeekInt2 - i7) / 2;
                                textPaint7.set(textPaint6);
                                textPaint7.bgColor = textPaint6.bgColor;
                                textPaint7.baselineShift = textPaint6.baselineShift;
                                textPaint7.linkColor = textPaint6.linkColor;
                                textPaint7.drawableState = textPaint6.drawableState;
                                textPaint7.density = textPaint6.density;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    textPaint7.underlineColor = textPaint6.underlineColor;
                                    textPaint7.underlineThickness = textPaint6.underlineThickness;
                                }
                                i9 = i7 + i21;
                                charSequenceO = owt.o(elementsServices.c(), elementsServices.e(), asxeVar5, charSequence2, elementsServices.l(), nxlVar2, ouiVar2, map, owjVar, kjcVar, i9);
                                i10 = iPeekInt2;
                                charSequence2 = charSequence2;
                                nxlVar2 = nxlVar2;
                                ouiVar2 = ouiVar2;
                                owt.f(textPaint7, charSequenceO, elementsServices.d());
                                asxe asxeVar8 = asxeVar5;
                                TextPaint textPaint13 = textPaint7;
                                alignment = alignment;
                                textDirectionHeuristic3 = textDirectionHeuristic3;
                                layoutJ = owt.j(charSequenceO, textPaint13, rpi.k(charSequenceO, textPaint7, i), alignment, textDirectionHeuristic3, asxeVar8, elementsServices);
                                textPaint7 = textPaint13;
                                asxeVar5 = asxeVar8;
                                if (layoutJ.getLineCount() <= iPeekInt) {
                                    i7 = i9 + 1;
                                    layout = layoutJ;
                                    charSequence3 = charSequenceO;
                                    i8 = i9;
                                    iPeekInt2 = i10;
                                } else {
                                    iPeekInt2 = i9 - 1;
                                }
                            }
                            textPaint8 = textPaint7;
                            charSequence4 = charSequence2;
                            nxlVar3 = nxlVar2;
                            ouiVar3 = ouiVar2;
                            if (i8 != -1) {
                                textPaint8.set(textPaint6);
                                textPaint8.bgColor = textPaint6.bgColor;
                                textPaint8.baselineShift = textPaint6.baselineShift;
                                textPaint8.linkColor = textPaint6.linkColor;
                                textPaint8.drawableState = textPaint6.drawableState;
                                textPaint8.density = textPaint6.density;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    textPaint8.underlineColor = textPaint6.underlineColor;
                                    textPaint8.underlineThickness = textPaint6.underlineThickness;
                                }
                                charSequence3.getClass();
                                owt.f(textPaint8, charSequence3, elementsServices.d());
                                yvhVarQ = new yvh(charSequence3, textPaint8, iPeekInt, layout);
                            } else {
                                textPaint8.set(textPaint6);
                                textPaint8.bgColor = textPaint6.bgColor;
                                textPaint8.baselineShift = textPaint6.baselineShift;
                                textPaint8.linkColor = textPaint6.linkColor;
                                textPaint8.drawableState = textPaint6.drawableState;
                                textPaint8.density = textPaint6.density;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    textPaint8.underlineColor = textPaint6.underlineColor;
                                    textPaint8.underlineThickness = textPaint6.underlineThickness;
                                }
                                CharSequence charSequenceO4 = owt.o(elementsServices.c(), elementsServices.e(), asxeVar5, charSequence4, elementsServices.l(), nxlVar3, ouiVar3, map, owjVar, kjcVar, Memory.peekInt(asxxVarAW.c + 12, false));
                                owt.f(textPaint8, charSequenceO4, elementsServices.d());
                                truncateAt = null;
                                yvhVarQ = new yvh(charSequenceO4, textPaint8, iPeekInt, (Layout) null);
                            }
                        }
                        truncateAt = null;
                    } else {
                        z3 = z2;
                        truncateAt = null;
                        yvhVarQ = owt.q(asxeVar5, charSequenceM, iPeekInt, textPaint6, alignmentH2, textDirectionHeuristicK2, i, elementsServices, nxlVar, ouiVar, kjcVar, map, owjVar);
                    }
                }
                Object obj2 = yvhVarQ.c;
                Object obj3 = yvhVarQ.b;
                int i22 = yvhVarQ.a;
                objC = yvhVarQ.d;
                i3 = i22;
                obj = obj3;
                asxeVar3 = asxeVar5;
                r1 = obj2;
            } else {
                asxeVar2 = asxeVar;
                asxe asxeVar9 = asxeVarA;
                z3 = z2;
                truncateAt = null;
                CharSequence charSequenceP2 = owt.p(elementsServices.c(), elementsServices.e(), asxeVar9, elementsServices.l(), this.a, this.b, this.c, owjVar, this.d);
                asxeVar3 = asxeVar9;
                textPaint3 = textPaint;
                textPaint2 = new TextPaint(textPaint3);
                textPaint2.bgColor = textPaint3.bgColor;
                textPaint2.baselineShift = textPaint3.baselineShift;
                textPaint2.linkColor = textPaint3.linkColor;
                textPaint2.drawableState = textPaint3.drawableState;
                textPaint2.density = textPaint3.density;
                if (Build.VERSION.SDK_INT >= 29) {
                    textPaint2.underlineColor = textPaint3.underlineColor;
                    textPaint2.underlineThickness = textPaint3.underlineThickness;
                }
                owt.f(textPaint2, charSequenceP2, elementsServices.d());
                i3 = iPeekInt;
                objC = null;
                r1 = charSequenceP2;
                obj = textPaint2;
            }
            textPaint4 = (TextPaint) obj;
            iK = rpi.k(r1, textPaint4, i);
            textDirectionHeuristicK = owt.k(asxeVar3, z ? 1 : 0, r1);
            if ((Memory.peekByte(asxeVar3.c + 8) & 4) != 0) {
                iBr = asxeVar3.br();
            } else {
                iBr = 1;
            }
            alignmentH = owt.h(iBr, r1, textDirectionHeuristicK, z ? 1 : 0);
            if ((Memory.peekByte(asxeVar3.c + 8) & 8) != 0) {
                truncateAtI = owt.i(asxeVar3.bq());
            } else {
                truncateAtI = TextUtils.TruncateAt.END;
            }
            if (!z9 && truncateAtI == null && asxeVar3.bq() == 2) {
                truncateAtI = TextUtils.TruncateAt.END;
            }
            if (truncateAtI == TextUtils.TruncateAt.MARQUEE || i3 != 1) {
                i4 = i3;
                z4 = false;
            } else {
                z4 = true;
                i4 = 1;
            }
            if (objC == null) {
                if ((Memory.peekByte(asxeVar3.c + 8) & 16) == 0 && Memory.peekByte(asxeVar3.c + 10) == 0) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                ?? r23 = r1;
                asxe asxeVar10 = asxeVar3;
                TextUtils.TruncateAt truncateAt3 = truncateAtI;
                z5 = z3;
                objC = c(r23, textPaint4, iK, alignmentH, textDirectionHeuristicK, z4, z8, truncateAt3, i4, z5, asxeVar10, elementsServices, null);
                textDirectionHeuristic = textDirectionHeuristicK;
                truncateAt2 = truncateAt3;
                asxeVar4 = asxeVar10;
                r22 = r23;
            } else {
                r22 = r1;
                asxeVar4 = asxeVar3;
                truncateAt2 = truncateAtI;
                textDirectionHeuristic = textDirectionHeuristicK;
                z5 = z3;
            }
            i5 = i4;
            Layout layout2 = (Layout) objC;
            iH = rpi.h(i5, i2, layout2);
            if (z5 || layout2.getLineCount() <= iH) {
                textDirectionHeuristic2 = textDirectionHeuristic;
                if (iH < i5) {
                    if ((Memory.peekByte(asxeVar4.c + 8) & 16) == 0 && Memory.peekByte(asxeVar4.c + 10) == 0) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    objC = c(r22, textPaint4, iK, alignmentH, textDirectionHeuristic2, false, z6, truncateAt2, iH, false, asxeVar4, elementsServices, null);
                }
            } else {
                int i23 = iH - 1;
                if (layout2.getLineStart(iH) >= r22.length()) {
                    charSequence = charSequenceP;
                } else if (asxeVar2 != null) {
                    charSequenceP = owt.p(elementsServices.c(), elementsServices.e(), nuy.a(asxeVar2), elementsServices.l(), this.a, this.b, this.c, owjVar, this.d);
                    if (TextUtils.isEmpty(charSequenceP) && z10) {
                        charSequence = "…";
                    } else {
                        charSequence = charSequenceP;
                    }
                } else if (z11) {
                    charSequence = charSequenceP;
                } else {
                    charSequence = "…";
                }
                Locale locale = elementsServices.c().getResources().getConfiguration().locale;
                boolean z15 = Memory.peekByte(FlagServices.b().c + 35) != 0;
                if (z15) {
                    textPaint5 = textPaint4;
                    i6 = iH;
                    z7 = z12;
                    charSequenceE = owt.e(i6, layout2, charSequence, z7, textPaint5, z10 || z11, locale, z9, layout2.getParagraphDirection(i23) == -1);
                } else {
                    z7 = z12;
                    i6 = iH;
                    textPaint5 = textPaint4;
                    charSequenceE = owt.e(i6, layout2, charSequence, z7, textPaint5, z10 || z11, locale, z9, layout2.getParagraphDirection(i23) == -1);
                }
                objC = c(charSequenceE, textPaint5, iK, alignmentH, textDirectionHeuristic, false, (Memory.peekByte(asxeVar4.c + 8) & 16) == 0 || Memory.peekByte(asxeVar4.c + 10) != 0, (z15 && z7) ? truncateAt : truncateAt2, i6, false, asxeVar4, elementsServices, 0);
            }
            return (Layout) objC;
        }
        textPaint = textPaint12;
        z2 = true;
        int i24 = owt.c;
        if (asxeVarA != null) {
            asxoVar = null;
            break;
        }
        i13 = 0;
        while (true) {
            if (i13 < asxeVarA.bh()) {
                asxoVar = null;
                break;
            }
            aszdVarBz = asxeVarA.bz(i13);
            if (aszdVarBz.j == null) {
                b = 1;
                if ((Memory.peekByte(aszdVarBz.c + 10) & 1) != 0) {
                    continue;
                }
                i13++;
            } else {
                b = 1;
            }
            if (aszdVarBz.j == null) {
                if (b != aszd.a) {
                    i14 = 64;
                } else {
                    i14 = SemanticState.Focused;
                }
                aszdVarBz.j = new asxo(aszdVarBz.cp(i14, asxn.a));
            }
            if (aszdVarBz.j == null) {
                asxoVar = asxm.a;
            } else {
                asxoVar = aszdVarBz.j;
            }
            if (asxoVar.aT()) {
                long j8 = asxoVar.aW().c;
                iPeekInt3 = Memory.peekInt(j8 + 12, false);
                int iPeekInt8 = Memory.peekInt(j8 + 16, false);
                if (iPeekInt3 > 0) {
                    continue;
                }
                i13++;
            } else if (asxoVar.aS()) {
                if (asxoVar.aR()) {
                    asxrVarAU2 = asxoVar.aU();
                    if (asxrVarAU2.aT() > 0) {
                        iAT = asxrVarAU2.aT();
                        asxrVarAU2.aU();
                        if (iAT != asxrVarAU2.e.size()) {
                            break;
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
                i13++;
            } else {
                if (asxoVar.aV().aS() > 0) {
                    break;
                    break;
                }
                i13++;
            }
        }
        CharSequence charSequenceP3 = "";
        if (asxoVar != null) {
            nxl nxlVar8 = this.a;
            ouiVar = this.b;
            kjcVar = this.d;
            map = this.c;
            textPaint6 = (TextPaint) elementsServices.w().io();
            charSequenceM = owt.m(asxeVarA);
            String strBi2 = asxeVarA.bi();
            textDirectionHeuristicK2 = owt.k(asxeVarA, elementsServices.b(), strBi2);
            nxlVar = nxlVar8;
            if ((Memory.peekByte(asxeVarA.c + 8) & 4) != 0) {
                iBr2 = asxeVarA.br();
            } else {
                iBr2 = 1;
            }
            alignmentH2 = owt.h(iBr2, strBi2, textDirectionHeuristicK2, elementsServices.b());
            if (asxoVar.aR()) {
                asxrVarAU = asxoVar.aU();
                textPaint11 = new TextPaint(textPaint6);
                textPaint11.bgColor = textPaint6.bgColor;
                textPaint11.baselineShift = textPaint6.baselineShift;
                textPaint11.linkColor = textPaint6.linkColor;
                textPaint11.drawableState = textPaint6.drawableState;
                textPaint11.density = textPaint6.density;
                if (Build.VERSION.SDK_INT >= 29) {
                    textPaint11.underlineColor = textPaint6.underlineColor;
                    textPaint11.underlineThickness = textPaint6.underlineThickness;
                }
                asxeVar2 = asxeVar;
                charSequence7 = "";
                iAS = 0;
                i12 = 0;
                while (true) {
                    if (i12 < asxrVarAU.aT()) {
                        textPaint11.set(textPaint6);
                        textPaint11.bgColor = textPaint6.bgColor;
                        textPaint11.baselineShift = textPaint6.baselineShift;
                        textPaint11.linkColor = textPaint6.linkColor;
                        textPaint11.drawableState = textPaint6.drawableState;
                        textPaint11.density = textPaint6.density;
                        if (Build.VERSION.SDK_INT >= 29) {
                            textPaint11.underlineColor = textPaint6.underlineColor;
                            textPaint11.underlineThickness = textPaint6.underlineThickness;
                        }
                        iAS = asxrVarAU.aS(i12);
                        asxe asxeVar11 = asxeVarA;
                        ouiVar6 = ouiVar;
                        kjcVar2 = kjcVar;
                        map2 = map;
                        CharSequence charSequenceO5 = owt.o(elementsServices.c(), elementsServices.e(), asxeVar11, charSequenceM, elementsServices.l(), nxlVar, ouiVar6, map2, owjVar, kjcVar2, asxrVarAU.aR(i12));
                        charSequence8 = charSequenceM;
                        nxlVar6 = nxlVar;
                        owt.f(textPaint11, charSequenceO5, elementsServices.d());
                        alignment4 = alignmentH2;
                        textDirectionHeuristic6 = textDirectionHeuristicK2;
                        layoutJ3 = owt.j(charSequenceO5, textPaint11, rpi.k(charSequenceO5, textPaint11, i), alignment4, textDirectionHeuristic6, asxeVar11, elementsServices);
                        charSequence7 = charSequenceO5;
                        asxeVar5 = asxeVar11;
                        if (layoutJ3.getLineCount() <= iAS) {
                            yvhVarQ = new yvh(charSequence7, textPaint11, iAS, layoutJ3);
                            z3 = z2;
                            truncateAt = null;
                        } else {
                            i12++;
                            nxlVar = nxlVar6;
                            ouiVar = ouiVar6;
                            asxeVarA = asxeVar5;
                            alignmentH2 = alignment4;
                            textDirectionHeuristicK2 = textDirectionHeuristic6;
                            kjcVar = kjcVar2;
                            charSequenceM = charSequence8;
                            map = map2;
                        }
                    } else {
                        asxeVar5 = asxeVarA;
                        yvhVarQ = new yvh(charSequence7, textPaint11, iAS, (Layout) null);
                        z3 = z2;
                        truncateAt = null;
                    }
                }
            } else {
                asxeVar2 = asxeVar;
                asxeVar5 = asxeVarA;
                if (asxoVar.aS()) {
                    asxuVarAV = asxoVar.aV();
                    alignment2 = alignmentH2;
                    textDirectionHeuristic4 = textDirectionHeuristicK2;
                    yvhVarQ3 = owt.q(asxeVar5, charSequenceM, iPeekInt, textPaint6, alignment2, textDirectionHeuristic4, i, elementsServices, nxlVar, ouiVar, kjcVar, map, owjVar);
                    ouiVar4 = ouiVar;
                    if (yvhVarQ3.d != null) {
                        charSequence5 = charSequenceM;
                        nxlVar4 = nxlVar;
                        z3 = z2;
                        yvhVarQ = yvhVarQ3;
                        truncateAt = null;
                    } else {
                        textPaint9 = new TextPaint(textPaint6);
                        textPaint9.bgColor = textPaint6.bgColor;
                        textPaint9.baselineShift = textPaint6.baselineShift;
                        textPaint9.linkColor = textPaint6.linkColor;
                        textPaint9.drawableState = textPaint6.drawableState;
                        textPaint9.density = textPaint6.density;
                        if (Build.VERSION.SDK_INT >= 29) {
                            charSequence5 = charSequenceM;
                            nxlVar4 = nxlVar;
                            textPaint9.underlineColor = textPaint6.underlineColor;
                            textPaint9.underlineThickness = textPaint6.underlineThickness;
                        }
                        charSequence5 = charSequenceM;
                        nxlVar4 = nxlVar;
                        i11 = 0;
                        r2 = yvhVarQ3.c;
                        while (true) {
                            if (i11 < asxuVarAV.aS()) {
                                textPaint9.set(textPaint6);
                                textPaint9.bgColor = textPaint6.bgColor;
                                textPaint9.baselineShift = textPaint6.baselineShift;
                                textPaint9.linkColor = textPaint6.linkColor;
                                textPaint9.drawableState = textPaint6.drawableState;
                                textPaint9.density = textPaint6.density;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    textPaint9.underlineColor = textPaint6.underlineColor;
                                    textPaint9.underlineThickness = textPaint6.underlineThickness;
                                }
                                asxuVar = asxuVarAV;
                                charSequenceO2 = owt.o(elementsServices.c(), elementsServices.e(), asxeVar5, charSequence5, elementsServices.l(), nxlVar4, ouiVar4, map, owjVar, kjcVar, asxuVar.aR(i11));
                                charSequence6 = charSequence5;
                                nxlVar5 = nxlVar4;
                                ouiVar5 = ouiVar4;
                                owt.f(textPaint9, charSequenceO2, elementsServices.d());
                                asxe asxeVar12 = asxeVar5;
                                textPaint10 = textPaint9;
                                alignment3 = alignment2;
                                textDirectionHeuristic5 = textDirectionHeuristic4;
                                layoutJ2 = owt.j(charSequenceO2, textPaint10, rpi.k(charSequenceO2, textPaint9, i), alignment3, textDirectionHeuristic5, asxeVar12, elementsServices);
                                asxeVar5 = asxeVar12;
                                if (layoutJ2.getLineCount() <= iPeekInt) {
                                    yvhVarQ = new yvh(charSequenceO2, textPaint10, iPeekInt, layoutJ2);
                                    z3 = z2;
                                    truncateAt = null;
                                } else {
                                    i11++;
                                    textPaint9 = textPaint10;
                                    asxuVarAV = asxuVar;
                                    nxlVar4 = nxlVar5;
                                    ouiVar4 = ouiVar5;
                                    alignment2 = alignment3;
                                    textDirectionHeuristic4 = textDirectionHeuristic5;
                                    charSequence5 = charSequence6;
                                    r2 = charSequenceO2;
                                }
                            } else {
                                yvhVarQ = new yvh((CharSequence) r2, textPaint9, iPeekInt, (Layout) null);
                                z3 = z2;
                                truncateAt = null;
                            }
                        }
                    }
                } else if (asxoVar.aT()) {
                    asxxVarAW = asxoVar.aW();
                    z3 = z2;
                    alignment = alignmentH2;
                    textDirectionHeuristic3 = textDirectionHeuristicK2;
                    yvhVarQ2 = owt.q(asxeVar5, charSequenceM, iPeekInt, textPaint6, alignment, textDirectionHeuristic3, i, elementsServices, nxlVar, ouiVar, kjcVar, map, owjVar);
                    ouiVar2 = ouiVar;
                    if (yvhVarQ2.d != null) {
                        charSequence2 = charSequenceM;
                        nxlVar2 = nxlVar;
                        yvhVarQ = yvhVarQ2;
                    } else {
                        long j9 = asxxVarAW.c;
                        int iPeekInt9 = Memory.peekInt(j9 + 12, false);
                        iPeekInt2 = Memory.peekInt(j9 + 16, false);
                        textPaint7 = new TextPaint(textPaint6);
                        textPaint7.bgColor = textPaint6.bgColor;
                        textPaint7.baselineShift = textPaint6.baselineShift;
                        textPaint7.linkColor = textPaint6.linkColor;
                        textPaint7.drawableState = textPaint6.drawableState;
                        textPaint7.density = textPaint6.density;
                        if (Build.VERSION.SDK_INT >= 29) {
                            charSequence2 = charSequenceM;
                            nxlVar2 = nxlVar;
                            textPaint7.underlineColor = textPaint6.underlineColor;
                            textPaint7.underlineThickness = textPaint6.underlineThickness;
                        }
                        charSequence2 = charSequenceM;
                        nxlVar2 = nxlVar;
                        i7 = iPeekInt9;
                        charSequence3 = null;
                        layout = null;
                        i8 = -1;
                        while (i7 <= iPeekInt2) {
                            int i25 = (iPeekInt2 - i7) / 2;
                            textPaint7.set(textPaint6);
                            textPaint7.bgColor = textPaint6.bgColor;
                            textPaint7.baselineShift = textPaint6.baselineShift;
                            textPaint7.linkColor = textPaint6.linkColor;
                            textPaint7.drawableState = textPaint6.drawableState;
                            textPaint7.density = textPaint6.density;
                            if (Build.VERSION.SDK_INT >= 29) {
                                textPaint7.underlineColor = textPaint6.underlineColor;
                                textPaint7.underlineThickness = textPaint6.underlineThickness;
                            }
                            i9 = i7 + i25;
                            charSequenceO = owt.o(elementsServices.c(), elementsServices.e(), asxeVar5, charSequence2, elementsServices.l(), nxlVar2, ouiVar2, map, owjVar, kjcVar, i9);
                            i10 = iPeekInt2;
                            charSequence2 = charSequence2;
                            nxlVar2 = nxlVar2;
                            ouiVar2 = ouiVar2;
                            owt.f(textPaint7, charSequenceO, elementsServices.d());
                            asxe asxeVar13 = asxeVar5;
                            TextPaint textPaint14 = textPaint7;
                            alignment = alignment;
                            textDirectionHeuristic3 = textDirectionHeuristic3;
                            layoutJ = owt.j(charSequenceO, textPaint14, rpi.k(charSequenceO, textPaint7, i), alignment, textDirectionHeuristic3, asxeVar13, elementsServices);
                            textPaint7 = textPaint14;
                            asxeVar5 = asxeVar13;
                            if (layoutJ.getLineCount() <= iPeekInt) {
                                i7 = i9 + 1;
                                layout = layoutJ;
                                charSequence3 = charSequenceO;
                                i8 = i9;
                                iPeekInt2 = i10;
                            } else {
                                iPeekInt2 = i9 - 1;
                            }
                        }
                        textPaint8 = textPaint7;
                        charSequence4 = charSequence2;
                        nxlVar3 = nxlVar2;
                        ouiVar3 = ouiVar2;
                        if (i8 != -1) {
                            textPaint8.set(textPaint6);
                            textPaint8.bgColor = textPaint6.bgColor;
                            textPaint8.baselineShift = textPaint6.baselineShift;
                            textPaint8.linkColor = textPaint6.linkColor;
                            textPaint8.drawableState = textPaint6.drawableState;
                            textPaint8.density = textPaint6.density;
                            if (Build.VERSION.SDK_INT >= 29) {
                                textPaint8.underlineColor = textPaint6.underlineColor;
                                textPaint8.underlineThickness = textPaint6.underlineThickness;
                            }
                            charSequence3.getClass();
                            owt.f(textPaint8, charSequence3, elementsServices.d());
                            yvhVarQ = new yvh(charSequence3, textPaint8, iPeekInt, layout);
                        } else {
                            textPaint8.set(textPaint6);
                            textPaint8.bgColor = textPaint6.bgColor;
                            textPaint8.baselineShift = textPaint6.baselineShift;
                            textPaint8.linkColor = textPaint6.linkColor;
                            textPaint8.drawableState = textPaint6.drawableState;
                            textPaint8.density = textPaint6.density;
                            if (Build.VERSION.SDK_INT >= 29) {
                                textPaint8.underlineColor = textPaint6.underlineColor;
                                textPaint8.underlineThickness = textPaint6.underlineThickness;
                            }
                            CharSequence charSequenceO6 = owt.o(elementsServices.c(), elementsServices.e(), asxeVar5, charSequence4, elementsServices.l(), nxlVar3, ouiVar3, map, owjVar, kjcVar, Memory.peekInt(asxxVarAW.c + 12, false));
                            owt.f(textPaint8, charSequenceO6, elementsServices.d());
                            truncateAt = null;
                            yvhVarQ = new yvh(charSequenceO6, textPaint8, iPeekInt, (Layout) null);
                        }
                    }
                    truncateAt = null;
                } else {
                    z3 = z2;
                    truncateAt = null;
                    yvhVarQ = owt.q(asxeVar5, charSequenceM, iPeekInt, textPaint6, alignmentH2, textDirectionHeuristicK2, i, elementsServices, nxlVar, ouiVar, kjcVar, map, owjVar);
                }
            }
            Object obj4 = yvhVarQ.c;
            Object obj5 = yvhVarQ.b;
            int i26 = yvhVarQ.a;
            objC = yvhVarQ.d;
            i3 = i26;
            obj = obj5;
            asxeVar3 = asxeVar5;
            r1 = obj4;
        } else {
            asxeVar2 = asxeVar;
            asxe asxeVar14 = asxeVarA;
            z3 = z2;
            truncateAt = null;
            CharSequence charSequenceP4 = owt.p(elementsServices.c(), elementsServices.e(), asxeVar14, elementsServices.l(), this.a, this.b, this.c, owjVar, this.d);
            asxeVar3 = asxeVar14;
            textPaint3 = textPaint;
            textPaint2 = new TextPaint(textPaint3);
            textPaint2.bgColor = textPaint3.bgColor;
            textPaint2.baselineShift = textPaint3.baselineShift;
            textPaint2.linkColor = textPaint3.linkColor;
            textPaint2.drawableState = textPaint3.drawableState;
            textPaint2.density = textPaint3.density;
            if (Build.VERSION.SDK_INT >= 29) {
                textPaint2.underlineColor = textPaint3.underlineColor;
                textPaint2.underlineThickness = textPaint3.underlineThickness;
            }
            owt.f(textPaint2, charSequenceP4, elementsServices.d());
            i3 = iPeekInt;
            objC = null;
            r1 = charSequenceP4;
            obj = textPaint2;
        }
        textPaint4 = (TextPaint) obj;
        iK = rpi.k(r1, textPaint4, i);
        textDirectionHeuristicK = owt.k(asxeVar3, z ? 1 : 0, r1);
        if ((Memory.peekByte(asxeVar3.c + 8) & 4) != 0) {
            iBr = asxeVar3.br();
        } else {
            iBr = 1;
        }
        alignmentH = owt.h(iBr, r1, textDirectionHeuristicK, z ? 1 : 0);
        if ((Memory.peekByte(asxeVar3.c + 8) & 8) != 0) {
            truncateAtI = owt.i(asxeVar3.bq());
        } else {
            truncateAtI = TextUtils.TruncateAt.END;
        }
        if (!z9) {
            truncateAtI = TextUtils.TruncateAt.END;
        }
        if (truncateAtI == TextUtils.TruncateAt.MARQUEE) {
            i4 = i3;
            z4 = false;
        } else {
            i4 = i3;
            z4 = false;
        }
        if (objC == null) {
            if ((Memory.peekByte(asxeVar3.c + 8) & 16) == 0) {
                z8 = true;
            } else {
                z8 = true;
            }
            ?? r24 = r1;
            asxe asxeVar15 = asxeVar3;
            TextUtils.TruncateAt truncateAt4 = truncateAtI;
            z5 = z3;
            objC = c(r24, textPaint4, iK, alignmentH, textDirectionHeuristicK, z4, z8, truncateAt4, i4, z5, asxeVar15, elementsServices, null);
            textDirectionHeuristic = textDirectionHeuristicK;
            truncateAt2 = truncateAt4;
            asxeVar4 = asxeVar15;
            r22 = r24;
        } else {
            r22 = r1;
            asxeVar4 = asxeVar3;
            truncateAt2 = truncateAtI;
            textDirectionHeuristic = textDirectionHeuristicK;
            z5 = z3;
        }
        i5 = i4;
        Layout layout3 = (Layout) objC;
        iH = rpi.h(i5, i2, layout3);
        if (z5) {
            textDirectionHeuristic2 = textDirectionHeuristic;
            if (iH < i5) {
                if ((Memory.peekByte(asxeVar4.c + 8) & 16) == 0) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                objC = c(r22, textPaint4, iK, alignmentH, textDirectionHeuristic2, false, z6, truncateAt2, iH, false, asxeVar4, elementsServices, null);
            }
        } else {
            textDirectionHeuristic2 = textDirectionHeuristic;
            if (iH < i5) {
                if ((Memory.peekByte(asxeVar4.c + 8) & 16) == 0) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                objC = c(r22, textPaint4, iK, alignmentH, textDirectionHeuristic2, false, z6, truncateAt2, iH, false, asxeVar4, elementsServices, null);
            }
        }
        return (Layout) objC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Layout b(TextTypeOuterClass$TextType textTypeOuterClass$TextType, owj owjVar, int i, ElementsServices elementsServices, boolean z) {
        asxe asxeVarA;
        if (textTypeOuterClass$TextType.aU()) {
            asxeVarA = nuy.a(textTypeOuterClass$TextType.aW());
        } else {
            int i2 = asxe.A;
            asxeVarA = asxc.a;
        }
        asxe asxeVar = asxeVarA;
        CharSequence charSequenceP = owt.p(elementsServices.c(), elementsServices.e(), asxeVar, elementsServices.l(), this.a, this.b, this.c, owjVar, this.d);
        TextPaint textPaint = (TextPaint) elementsServices.w().io();
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
        TextDirectionHeuristic textDirectionHeuristicK = owt.k(asxeVar, z ? 1 : 0, charSequenceP);
        boolean z2 = true;
        Layout.Alignment alignmentH = owt.h((Memory.peekByte(asxeVar.c + 8) & 4) != 0 ? asxeVar.br() : 1, charSequenceP, textDirectionHeuristicK, z ? 1 : 0);
        BoringLayout.Metrics metricsIsBoring = null;
        if (Build.VERSION.SDK_INT >= 33) {
            metricsIsBoring = BoringLayout.isBoring(charSequenceP, textPaint2, textDirectionHeuristicK, false, null);
        } else if (textDirectionHeuristicK == TextDirectionHeuristics.FIRSTSTRONG_LTR || textDirectionHeuristicK == TextDirectionHeuristics.LTR) {
            metricsIsBoring = BoringLayout.isBoring(charSequenceP, textPaint2);
        }
        BoringLayout.Metrics metrics = metricsIsBoring;
        if (metrics != null) {
            return new BoringLayout(charSequenceP, textPaint2, metrics.width, alignmentH, 1.0f, 0.0f, metrics, (Memory.peekByte(asxeVar.c + 8) & 16) == 0 || Memory.peekByte(asxeVar.c + 10) != 0);
        }
        StaticLayout.Builder lineSpacing = StaticLayout.Builder.obtain(charSequenceP, 0, charSequenceP.length(), textPaint2, (int) Math.ceil(Layout.getDesiredWidth(charSequenceP, textPaint2))).setAlignment(alignmentH).setLineSpacing((Memory.peekByte(asxeVar.c + 8) & 2) != 0 ? Float.intBitsToFloat(Memory.peekInt(asxeVar.c + 12, false)) * elementsServices.a() : 0.0f, 1.0f);
        if ((Memory.peekByte(asxeVar.c + 8) & 16) != 0 && Memory.peekByte(asxeVar.c + 10) == 0) {
            z2 = false;
        }
        return lineSpacing.setIncludePad(z2).setTextDirection(textDirectionHeuristicK).build();
    }
}
