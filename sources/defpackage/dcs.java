package defpackage;

import android.text.TextUtils;
import app.rive.runtime.kotlin.fonts.Fonts;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dcs implements dbn {
    private final XmlPullParserFactory i;
    private static final Pattern c = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern d = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern e = Pattern.compile("^(([0-9]*\\.)?[0-9]+)(px|em|%)$");
    static final Pattern a = Pattern.compile("^([-+]?\\d+(?:\\.\\d*)?)%$");
    static final Pattern b = Pattern.compile("^([-+]?\\d+(?:\\.\\d*)?)% ([-+]?\\d+(?:\\.\\d*)?)%$");
    private static final Pattern f = Pattern.compile("^([-+]?\\d+(?:\\.\\d*)?)px ([-+]?\\d+(?:\\.\\d*)?)px$");
    private static final Pattern g = Pattern.compile("^(\\d+) (\\d+)$");
    private static final dcr h = new dcr(30.0f, 1, 1);

    public dcs() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.i = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    private static long e(String str, dcr dcrVar) throws dbf {
        double d2;
        double d3;
        Matcher matcher = c.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j2 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d4 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d5 = 0.0d;
            double d6 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d7 = j + j2 + d4;
            String strGroup5 = matcher.group(5);
            double d8 = strGroup5 != null ? Long.parseLong(strGroup5) / dcrVar.a : 0.0d;
            double d9 = d7 + d6;
            String strGroup6 = matcher.group(6);
            if (strGroup6 != null) {
                d5 = (Long.parseLong(strGroup6) / ((double) dcrVar.b)) / ((double) dcrVar.a);
            }
            return (long) ((d9 + d8 + d5) * 1000000.0d);
        }
        Matcher matcher2 = d.matcher(str);
        if (!matcher2.matches()) {
            throw new dbf("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d10 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        int iHashCode = strGroup8.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode == 115) {
                            strGroup8.equals("s");
                        } else if (iHashCode == 116 && strGroup8.equals("t")) {
                            d2 = dcrVar.c;
                            d10 /= d2;
                        }
                    } else if (strGroup8.equals("ms")) {
                        d2 = 1000.0d;
                        d10 /= d2;
                    }
                } else if (strGroup8.equals("m")) {
                    d3 = 60.0d;
                    d10 *= d3;
                }
            } else if (strGroup8.equals("h")) {
                d3 = 3600.0d;
                d10 *= d3;
            }
        } else if (strGroup8.equals("f")) {
            d2 = dcrVar.a;
            d10 /= d2;
        }
        return (long) (d10 * 1000000.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r1.equals("left") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r1.equals("end") != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return android.text.Layout.Alignment.ALIGN_NORMAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return android.text.Layout.Alignment.ALIGN_OPPOSITE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.equals("start") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r1.equals("right") != false) goto L16;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.text.Layout.Alignment f(java.lang.String r1) {
        /*
            java.lang.String r1 = defpackage.ahno.ae(r1)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1364013995: goto L34;
                case 100571: goto L29;
                case 3317767: goto L1e;
                case 108511772: goto L15;
                case 109757538: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L3f
        Lc:
            java.lang.String r0 = "start"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L3f
            goto L26
        L15:
            java.lang.String r0 = "right"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L3f
            goto L31
        L1e:
            java.lang.String r0 = "left"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L3f
        L26:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L40
        L29:
            java.lang.String r0 = "end"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L3f
        L31:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L40
        L34:
            java.lang.String r0 = "center"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L3f
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L40
        L3f:
            r1 = 0
        L40:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcs.f(java.lang.String):android.text.Layout$Alignment");
    }

    private static dcu g(dcu dcuVar) {
        return dcuVar == null ? new dcu() : dcuVar;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x0325  */
    /* JADX WARN: Code duplicated, block: B:167:0x0354  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fb  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static dcu h(XmlPullParser xmlPullParser, dcu dcuVar) {
        int i;
        Matcher matcher;
        int i2;
        dcp dcpVar;
        int attributeCount = xmlPullParser.getAttributeCount();
        dcu dcuVarG = dcuVar;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeValue = xmlPullParser.getAttributeValue(i3);
            String attributeName = xmlPullParser.getAttributeName(i3);
            int i4 = -1;
            int i5 = 1;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        dcuVarG = g(dcuVarG);
                        dcuVarG.i = Fonts.Font.STYLE_ITALIC.equalsIgnoreCase(attributeValue) ? 1 : 0;
                    }
                    break;
                case -1289044182:
                    if (attributeName.equals("extent")) {
                        dcuVarG = g(dcuVarG);
                        dcuVarG.u = attributeValue;
                    }
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        dcuVarG = g(dcuVarG);
                        dcuVarG.a = attributeValue;
                    }
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        dcuVarG = g(dcuVarG);
                        dcuVarG.o = f(attributeValue);
                    }
                    break;
                case -1008619738:
                    if (attributeName.equals("origin")) {
                        dcuVarG = g(dcuVarG);
                        dcuVarG.t = attributeValue;
                    }
                    break;
                case -879295043:
                    if (!attributeName.equals("textDecoration")) {
                        break;
                    } else {
                        String strAe = ahno.ae(attributeValue);
                        switch (strAe.hashCode()) {
                            case -1461280213:
                                if (strAe.equals("nounderline")) {
                                    dcuVarG = g(dcuVarG);
                                    dcuVarG.g = 0;
                                }
                                break;
                            case -1026963764:
                                if (strAe.equals("underline")) {
                                    dcuVarG = g(dcuVarG);
                                    dcuVarG.g = 1;
                                }
                                break;
                            case 913457136:
                                if (strAe.equals("nolinethrough")) {
                                    dcuVarG = g(dcuVarG);
                                    dcuVarG.f = 0;
                                }
                                break;
                            case 1679736913:
                                if (strAe.equals("linethrough")) {
                                    dcuVarG = g(dcuVarG);
                                    dcuVarG.f = 1;
                                }
                                break;
                        }
                    }
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        dcuVarG = g(dcuVarG);
                        dcuVarG.h = "bold".equalsIgnoreCase(attributeValue) ? 1 : 0;
                    }
                    break;
                case 3355:
                    if (attributeName.equals("id") && "style".equals(xmlPullParser.getName())) {
                        dcuVarG = g(dcuVarG);
                        dcuVarG.l = attributeValue;
                    }
                    break;
                case 3511770:
                    if (!attributeName.equals("ruby")) {
                        break;
                    } else {
                        String strAe2 = ahno.ae(attributeValue);
                        switch (strAe2.hashCode()) {
                            case -618561360:
                                if (strAe2.equals("baseContainer")) {
                                    dcuVarG = g(dcuVarG);
                                    i = 2;
                                    dcuVarG.m = i;
                                }
                                break;
                            case -410956671:
                                if (strAe2.equals("container")) {
                                    dcuVarG = g(dcuVarG);
                                    dcuVarG.m = 1;
                                }
                                break;
                            case -250518009:
                                if (strAe2.equals("delimiter")) {
                                    dcuVarG = g(dcuVarG);
                                    dcuVarG.m = 4;
                                }
                                break;
                            case -136074796:
                                if (strAe2.equals("textContainer")) {
                                    dcuVarG = g(dcuVarG);
                                    i = 3;
                                    dcuVarG.m = i;
                                }
                                break;
                            case 3016401:
                                if (strAe2.equals("base")) {
                                    dcuVarG = g(dcuVarG);
                                    i = 2;
                                    dcuVarG.m = i;
                                }
                                break;
                            case 3556653:
                                if (strAe2.equals("text")) {
                                    dcuVarG = g(dcuVarG);
                                    i = 3;
                                    dcuVarG.m = i;
                                }
                                break;
                        }
                    }
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        dcuVarG = g(dcuVarG);
                        try {
                            dcuVarG.d(bvg.a(attributeValue, false));
                        } catch (IllegalArgumentException unused) {
                            bvx.e("TtmlParser", "Failed parsing color value: ".concat(String.valueOf(attributeValue)));
                        }
                    }
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        dcu dcuVarG2 = g(dcuVarG);
                        Matcher matcher2 = a.matcher(attributeValue);
                        float fMin = Float.MAX_VALUE;
                        if (matcher2.matches()) {
                            try {
                                String strGroup = matcher2.group(1);
                                strGroup.getClass();
                                fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup)));
                            } catch (NumberFormatException e2) {
                                bvx.f("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e2);
                            }
                        } else {
                            bvx.e("TtmlParser", "Invalid value for shear: ".concat(String.valueOf(attributeValue)));
                        }
                        dcuVarG2.s = fMin;
                        dcuVarG = dcuVarG2;
                        break;
                    }
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        String strAe3 = ahno.ae(attributeValue);
                        int iHashCode = strAe3.hashCode();
                        if (iHashCode != 96673) {
                            if (iHashCode == 3387192 && strAe3.equals("none")) {
                                dcuVarG = g(dcuVarG);
                                dcuVarG.q = 0;
                            }
                        } else if (strAe3.equals("all")) {
                            dcuVarG = g(dcuVarG);
                            dcuVarG.q = 1;
                        }
                    }
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        try {
                            dcuVarG = g(dcuVarG);
                            int i6 = bwp.a;
                            String[] strArrSplit = attributeValue.split("\\s+", -1);
                            int length = strArrSplit.length;
                            if (length == 1) {
                                matcher = e.matcher(attributeValue);
                            } else {
                                if (length != 2) {
                                    throw new dbf(a.ci((byte) 46, length, "Invalid number of entries for fontSize: "));
                                }
                                matcher = e.matcher(strArrSplit[1]);
                                bvx.e("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                            }
                            if (!matcher.matches()) {
                                throw new dbf(a.bT(attributeValue, "Invalid expression for fontSize: '", "'."));
                            }
                            String strGroup2 = matcher.group(3);
                            strGroup2.getClass();
                            int iHashCode2 = strGroup2.hashCode();
                            if (iHashCode2 == 37) {
                                if (!strGroup2.equals("%")) {
                                    throw new dbf(a.bT(strGroup2, "Invalid unit for fontSize: '", "'."));
                                }
                                dcuVarG.j = 3;
                                String strGroup3 = matcher.group(1);
                                strGroup3.getClass();
                                dcuVarG.k = Float.parseFloat(strGroup3);
                            } else if (iHashCode2 == 3240) {
                                if (!strGroup2.equals("em")) {
                                    throw new dbf(a.bT(strGroup2, "Invalid unit for fontSize: '", "'."));
                                }
                                dcuVarG.j = 2;
                                String strGroup4 = matcher.group(1);
                                strGroup4.getClass();
                                dcuVarG.k = Float.parseFloat(strGroup4);
                            } else {
                                if (iHashCode2 != 3592 || !strGroup2.equals("px")) {
                                    throw new dbf(a.bT(strGroup2, "Invalid unit for fontSize: '", "'."));
                                }
                                dcuVarG.j = 1;
                                String strGroup5 = matcher.group(1);
                                strGroup5.getClass();
                                dcuVarG.k = Float.parseFloat(strGroup5);
                            }
                        } catch (dbf unused2) {
                            bvx.e("TtmlParser", "Failed parsing fontSize value: ".concat(String.valueOf(attributeValue)));
                        }
                    } else {
                        continue;
                    }
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        dcuVarG = g(dcuVarG);
                        Pattern pattern = dcp.a;
                        dcp dcpVar2 = null;
                        if (attributeValue != null) {
                            String strAe4 = ahno.ae(attributeValue.trim());
                            if (!strAe4.isEmpty()) {
                                agkz agkzVarO = agkz.o(TextUtils.split(strAe4, dcp.a));
                                String str = (String) aguu.J(ahng.af(dcp.e, agkzVarO), "outside");
                                int iHashCode3 = str.hashCode();
                                if (iHashCode3 != -1106037339) {
                                    if (iHashCode3 == 92734940 && str.equals("after")) {
                                        i2 = 2;
                                    } else {
                                        i2 = 1;
                                    }
                                } else if (str.equals("outside")) {
                                    i2 = -2;
                                } else {
                                    i2 = 1;
                                }
                                agqh agqhVarAf = ahng.af(dcp.b, agkzVarO);
                                if (agqhVarAf.isEmpty()) {
                                    agqh agqhVarAf2 = ahng.af(dcp.d, agkzVarO);
                                    agqh agqhVarAf3 = ahng.af(dcp.c, agkzVarO);
                                    if (agqhVarAf2.isEmpty() && agqhVarAf3.isEmpty()) {
                                        dcpVar = new dcp(-1, 0, i2);
                                    } else {
                                        String str2 = (String) aguu.J(agqhVarAf2, "filled");
                                        int i7 = (str2.hashCode() == 3417674 && str2.equals("open")) ? 2 : 1;
                                        String str3 = (String) aguu.J(agqhVarAf3, "circle");
                                        int iHashCode4 = str3.hashCode();
                                        if (iHashCode4 != -905816648) {
                                            if (iHashCode4 == 99657 && str3.equals("dot")) {
                                                i5 = 2;
                                            }
                                        } else if (str3.equals("sesame")) {
                                            i5 = 3;
                                        }
                                        dcpVar = new dcp(i5, i7, i2);
                                    }
                                } else {
                                    String str4 = (String) ((agpz) agqhVarAf).iterator().next();
                                    if (str4.hashCode() == 3387192 && str4.equals("none")) {
                                        i4 = 0;
                                    }
                                    dcpVar = new dcp(i4, 0, i2);
                                }
                                dcpVar2 = dcpVar;
                            }
                        }
                        dcuVarG.r = dcpVar2;
                    }
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        String strAe5 = ahno.ae(attributeValue);
                        int iHashCode5 = strAe5.hashCode();
                        if (iHashCode5 != -1392885889) {
                            if (iHashCode5 == 92734940 && strAe5.equals("after")) {
                                dcuVarG = g(dcuVarG);
                                dcuVarG.n = 2;
                            }
                        } else if (strAe5.equals("before")) {
                            dcuVarG = g(dcuVarG);
                            dcuVarG.n = 1;
                        }
                    }
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        dcuVarG = g(dcuVarG);
                        try {
                            dcuVarG.c(bvg.a(attributeValue, false));
                        } catch (IllegalArgumentException unused3) {
                            bvx.e("TtmlParser", "Failed parsing background value: ".concat(String.valueOf(attributeValue)));
                        }
                    }
                    break;
                case 1587328867:
                    if (attributeName.equals("displayAlign")) {
                        dcuVarG = g(dcuVarG);
                        dcuVarG.v = attributeValue;
                    }
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        dcuVarG = g(dcuVarG);
                        dcuVarG.p = f(attributeValue);
                    }
                    break;
            }
        }
        return dcuVarG;
    }

    private static String[] i(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        int i = bwp.a;
        return strTrim.split("\\s+", -1);
    }

    @Override // defpackage.dbn
    public final int a() {
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:195:0x046d  */
    /* JADX WARN: Code duplicated, block: B:214:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:215:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:222:0x04d3 A[LOOP:1: B:98:0x0241->B:222:0x04d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:241:0x0534 A[PHI: r36 r38
      0x0534: PHI (r36v3 java.lang.String[]) = 
      (r36v2 java.lang.String[])
      (r36v2 java.lang.String[])
      (r36v2 java.lang.String[])
      (r36v2 java.lang.String[])
      (r36v5 java.lang.String[])
      (r36v2 java.lang.String[])
      (r36v2 java.lang.String[])
      (r36v2 java.lang.String[])
     binds: [B:228:0x050b, B:243:0x053d, B:237:0x0529, B:239:0x0530, B:240:0x0532, B:231:0x0515, B:233:0x051d, B:234:0x051f] A[DONT_GENERATE, DONT_INLINE]
      0x0534: PHI (r38v3 java.lang.String) = 
      (r38v2 java.lang.String)
      (r38v2 java.lang.String)
      (r38v2 java.lang.String)
      (r38v2 java.lang.String)
      (r38v2 java.lang.String)
      (r38v2 java.lang.String)
      (r38v2 java.lang.String)
      (r38v5 java.lang.String)
     binds: [B:228:0x050b, B:243:0x053d, B:237:0x0529, B:239:0x0530, B:240:0x0532, B:231:0x0515, B:233:0x051d, B:234:0x051f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:358:0x04cd A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:228:0x050b. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.dbn
    public final dbd b(byte[] bArr, int i, int i2) {
        String str;
        int i3;
        String str2;
        ArrayDeque arrayDeque;
        dcr dcrVar;
        dcq dcqVar;
        long j;
        long j2;
        String str3;
        dct dctVar;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i4;
        float f7;
        int i5;
        String strE;
        dcu dcuVar;
        String strE2;
        dcu dcuVar2;
        String strE3;
        dcu dcuVar3;
        String strE4;
        float f8;
        boolean z;
        String str4 = "";
        String str5 = "\n";
        String str6 = "http://www.w3.org/ns/ttml#parameter";
        try {
            XmlPullParser xmlPullParserNewPullParser = this.i.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new dct("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque2 = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            dcr dcrVar2 = h;
            dcv dcvVar = null;
            ys ysVar = null;
            dcr dcrVar3 = dcrVar2;
            int i6 = 0;
            int i7 = 15;
            while (eventType != 1) {
                dcq dcqVar2 = (dcq) arrayDeque2.peek();
                if (i6 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    str = str4;
                    dcvVar = dcvVar;
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            String attributeValue = xmlPullParserNewPullParser.getAttributeValue(str6, "frameRate");
                            int i8 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
                            String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(str6, "frameRateMultiplier");
                            if (attributeValue2 != null) {
                                int i9 = bwp.a;
                                String[] strArrSplit = attributeValue2.split(" ", -1);
                                ahno.G(strArrSplit.length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f8 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
                            } else {
                                f8 = 1.0f;
                            }
                            int i10 = dcrVar2.b;
                            String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(str6, "subFrameRate");
                            if (attributeValue3 != null) {
                                i10 = Integer.parseInt(attributeValue3);
                            }
                            int i11 = dcrVar2.c;
                            String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(str6, "tickRate");
                            if (attributeValue4 != null) {
                                i11 = Integer.parseInt(attributeValue4);
                            }
                            dcr dcrVar4 = new dcr(i8 * f8, i10, i11);
                            String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(str6, "cellResolution");
                            if (attributeValue5 != null) {
                                Matcher matcher = g.matcher(attributeValue5);
                                if (matcher.matches()) {
                                    try {
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        int i12 = Integer.parseInt(strGroup);
                                        String strGroup2 = matcher.group(2);
                                        strGroup2.getClass();
                                        int i13 = Integer.parseInt(strGroup2);
                                        try {
                                            if (i12 != 0) {
                                                if (i13 != 0) {
                                                    z = true;
                                                } else {
                                                    i13 = 0;
                                                    z = false;
                                                }
                                                ahno.L(z, "Invalid cell resolution %s %s", i12, i13);
                                                i7 = i13;
                                            } else {
                                                z = false;
                                            }
                                            ahno.L(z, "Invalid cell resolution %s %s", i12, i13);
                                            i7 = i13;
                                        } catch (NumberFormatException unused) {
                                            bvx.e("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                            i7 = 15;
                                        }
                                    } catch (NumberFormatException unused2) {
                                        str6 = str6;
                                    }
                                } else {
                                    bvx.e("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue5));
                                    str6 = str6;
                                    i7 = 15;
                                }
                            } else {
                                str6 = str6;
                                i7 = 15;
                            }
                            String strE5 = aty.e(xmlPullParserNewPullParser, "extent");
                            if (strE5 != null) {
                                Matcher matcher2 = f.matcher(strE5);
                                if (matcher2.matches()) {
                                    try {
                                        String strGroup3 = matcher2.group(1);
                                        strGroup3.getClass();
                                        int i14 = Integer.parseInt(strGroup3);
                                        String strGroup4 = matcher2.group(2);
                                        strGroup4.getClass();
                                        ysVar = new ys(i14, Integer.parseInt(strGroup4));
                                    } catch (NumberFormatException unused3) {
                                        bvx.e("TtmlParser", "Ignoring malformed tts extent: ".concat(strE5));
                                        ysVar = null;
                                    }
                                    dcrVar3 = dcrVar4;
                                } else {
                                    bvx.e("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strE5));
                                }
                                ysVar = null;
                                dcrVar3 = dcrVar4;
                            } else {
                                ysVar = null;
                                dcrVar3 = dcrVar4;
                            }
                        } else {
                            str6 = str6;
                            i6 = i6;
                        }
                        i7 = i7;
                        ysVar = ysVar;
                        String str7 = "image";
                        str2 = str5;
                        ArrayDeque arrayDeque3 = arrayDeque2;
                        if (name.equals("tt") || name.equals("head") || name.equals("body") || name.equals("div") || name.equals("p") || name.equals("span") || name.equals("br") || name.equals("style") || name.equals("styling") || name.equals("layout") || name.equals("region") || name.equals("metadata") || name.equals("image") || name.equals("data") || name.equals("information")) {
                            if ("head".equals(name)) {
                                while (true) {
                                    xmlPullParserNewPullParser.next();
                                    if (aty.j(xmlPullParserNewPullParser, "style")) {
                                        String strE6 = aty.e(xmlPullParserNewPullParser, "style");
                                        dcu dcuVarH = h(xmlPullParserNewPullParser, new dcu());
                                        if (strE6 != null) {
                                            String[] strArrI = i(strE6);
                                            int i15 = 0;
                                            for (int length = strArrI.length; i15 < length; length = length) {
                                                dcuVarH.b((dcu) map.get(strArrI[i15]));
                                                i15++;
                                            }
                                        }
                                        String str8 = dcuVarH.l;
                                        if (str8 != null) {
                                            map.put(str8, dcuVarH);
                                        }
                                    } else {
                                        dcrVar3 = dcrVar3;
                                        if (aty.j(xmlPullParserNewPullParser, "region")) {
                                            String strE7 = aty.e(xmlPullParserNewPullParser, "id");
                                            if (strE7 == null) {
                                                str3 = str7;
                                                dctVar = null;
                                            } else {
                                                String strE8 = aty.e(xmlPullParserNewPullParser, "origin");
                                                if (strE8 == null && (strE3 = aty.e(xmlPullParserNewPullParser, "style")) != null && (dcuVar3 = (dcu) map.get(strE3)) != null) {
                                                    strE8 = dcuVar3.t;
                                                }
                                                if (strE8 != null) {
                                                    Matcher matcher3 = b.matcher(strE8);
                                                    Matcher matcher4 = f.matcher(strE8);
                                                    if (matcher3.matches()) {
                                                        f2 = 100.0f;
                                                        try {
                                                            String strGroup5 = matcher3.group(1);
                                                            strGroup5.getClass();
                                                            f4 = Float.parseFloat(strGroup5) / 100.0f;
                                                            String strGroup6 = matcher3.group(2);
                                                            strGroup6.getClass();
                                                            f3 = Float.parseFloat(strGroup6) / 100.0f;
                                                        } catch (NumberFormatException unused4) {
                                                            bvx.e("TtmlParser", "Ignoring region with malformed origin: ".concat(strE8));
                                                            str3 = str7;
                                                        }
                                                    } else {
                                                        f2 = 100.0f;
                                                        if (!matcher4.matches()) {
                                                            bvx.e("TtmlParser", "Ignoring region with unsupported origin: ".concat(strE8));
                                                        } else if (ysVar == null) {
                                                            bvx.e("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strE8));
                                                        } else {
                                                            try {
                                                                String strGroup7 = matcher4.group(1);
                                                                strGroup7.getClass();
                                                                int i16 = Integer.parseInt(strGroup7);
                                                                String strGroup8 = matcher4.group(2);
                                                                strGroup8.getClass();
                                                                int i17 = Integer.parseInt(strGroup8);
                                                                f4 = i16 / ysVar.a;
                                                                f3 = i17 / ysVar.b;
                                                            } catch (NumberFormatException unused5) {
                                                                bvx.e("TtmlParser", "Ignoring region with malformed origin: ".concat(strE8));
                                                                str3 = str7;
                                                            }
                                                        }
                                                        str3 = str7;
                                                        dctVar = null;
                                                    }
                                                } else {
                                                    f2 = 100.0f;
                                                    f3 = 0.0f;
                                                    f4 = 0.0f;
                                                }
                                                float f9 = f4;
                                                String strE9 = aty.e(xmlPullParserNewPullParser, "extent");
                                                if (strE9 == null && (strE2 = aty.e(xmlPullParserNewPullParser, "style")) != null && (dcuVar2 = (dcu) map.get(strE2)) != null) {
                                                    strE9 = dcuVar2.u;
                                                }
                                                if (strE9 != null) {
                                                    Matcher matcher5 = b.matcher(strE9);
                                                    str3 = str7;
                                                    Matcher matcher6 = f.matcher(strE9);
                                                    if (matcher5.matches()) {
                                                        try {
                                                            String strGroup9 = matcher5.group(1);
                                                            strGroup9.getClass();
                                                            float f10 = Float.parseFloat(strGroup9) / f2;
                                                            String strGroup10 = matcher5.group(2);
                                                            strGroup10.getClass();
                                                            f6 = Float.parseFloat(strGroup10) / f2;
                                                            f5 = f10;
                                                        } catch (NumberFormatException unused6) {
                                                            bvx.e("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strE8)));
                                                            dctVar = null;
                                                        }
                                                    } else {
                                                        if (!matcher6.matches()) {
                                                            bvx.e("TtmlParser", "Ignoring region with unsupported extent: ".concat(String.valueOf(strE8)));
                                                        } else if (ysVar == null) {
                                                            bvx.e("TtmlParser", "Ignoring region with missing tts:extent: ".concat(String.valueOf(strE8)));
                                                        } else {
                                                            try {
                                                                String strGroup11 = matcher6.group(1);
                                                                strGroup11.getClass();
                                                                int i18 = Integer.parseInt(strGroup11);
                                                                String strGroup12 = matcher6.group(2);
                                                                strGroup12.getClass();
                                                                int i19 = Integer.parseInt(strGroup12);
                                                                float f11 = i18 / ysVar.a;
                                                                f6 = i19 / ysVar.b;
                                                                f5 = f11;
                                                            } catch (NumberFormatException unused7) {
                                                                bvx.e("TtmlParser", "Ignoring region with malformed extent: ".concat(String.valueOf(strE8)));
                                                                dctVar = null;
                                                            }
                                                        }
                                                        dctVar = null;
                                                    }
                                                } else {
                                                    str3 = str7;
                                                    f5 = 1.0f;
                                                    f6 = 1.0f;
                                                }
                                                String strE10 = aty.e(xmlPullParserNewPullParser, "displayAlign");
                                                if (strE10 == null && (strE = aty.e(xmlPullParserNewPullParser, "style")) != null && (dcuVar = (dcu) map.get(strE)) != null) {
                                                    strE10 = dcuVar.v;
                                                }
                                                if (strE10 != null) {
                                                    String strAe = ahno.ae(strE10);
                                                    int iHashCode = strAe.hashCode();
                                                    if (iHashCode != -1364013995) {
                                                        if (iHashCode == 92734940 && strAe.equals("after")) {
                                                            f7 = f3 + f6;
                                                            i4 = 2;
                                                        } else {
                                                            i4 = 0;
                                                            f7 = f3;
                                                        }
                                                    } else if (strAe.equals("center")) {
                                                        f7 = f3 + (f6 / 2.0f);
                                                        i4 = 1;
                                                    } else {
                                                        i4 = 0;
                                                        f7 = f3;
                                                    }
                                                } else {
                                                    i4 = 0;
                                                    f7 = f3;
                                                }
                                                float f12 = 1.0f / i7;
                                                String strE11 = aty.e(xmlPullParserNewPullParser, "writingMode");
                                                if (strE11 != null) {
                                                    String strAe2 = ahno.ae(strE11);
                                                    int iHashCode2 = strAe2.hashCode();
                                                    if (iHashCode2 != 3694) {
                                                        if (iHashCode2 != 3553396) {
                                                            if (iHashCode2 == 3553576 && strAe2.equals("tbrl")) {
                                                                i5 = 1;
                                                            }
                                                        } else if (strAe2.equals("tblr")) {
                                                            i5 = 2;
                                                        }
                                                        i5 = Integer.MIN_VALUE;
                                                    } else if (strAe2.equals("tb")) {
                                                        i5 = 2;
                                                    } else {
                                                        i5 = Integer.MIN_VALUE;
                                                    }
                                                } else {
                                                    i5 = Integer.MIN_VALUE;
                                                }
                                                dctVar = new dct(strE7, f9, f7, 0, i4, f5, f6, 1, f12, i5);
                                            }
                                            if (dctVar != null) {
                                                map2.put(dctVar.a, dctVar);
                                            }
                                        } else if (aty.j(xmlPullParserNewPullParser, "metadata")) {
                                            do {
                                                xmlPullParserNewPullParser.next();
                                                if (aty.j(xmlPullParserNewPullParser, str7) && (strE4 = aty.e(xmlPullParserNewPullParser, "id")) != null) {
                                                    map3.put(strE4, xmlPullParserNewPullParser.nextText());
                                                }
                                            } while (!aty.h(xmlPullParserNewPullParser, "metadata"));
                                        }
                                        if (aty.h(xmlPullParserNewPullParser, "head")) {
                                            dcrVar = dcrVar3;
                                            arrayDeque = arrayDeque3;
                                        } else {
                                            dcrVar3 = dcrVar3;
                                            str7 = str3;
                                        }
                                    }
                                    str3 = str7;
                                    if (aty.h(xmlPullParserNewPullParser, "head")) {
                                        dcrVar = dcrVar3;
                                        arrayDeque = arrayDeque3;
                                    } else {
                                        dcrVar3 = dcrVar3;
                                        str7 = str3;
                                    }
                                }
                            } else {
                                dcr dcrVar5 = dcrVar3;
                                try {
                                    int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                    dcu dcuVarH2 = h(xmlPullParserNewPullParser, null);
                                    int i20 = 0;
                                    String[] strArr = null;
                                    String strSubstring = null;
                                    String str9 = str;
                                    long jE = -9223372036854775807L;
                                    long jE2 = -9223372036854775807L;
                                    long jE3 = -9223372036854775807L;
                                    while (i20 < attributeCount) {
                                        String attributeName = xmlPullParserNewPullParser.getAttributeName(i20);
                                        String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(i20);
                                        dcrVar = dcrVar5;
                                        switch (attributeName.hashCode()) {
                                            case -934795532:
                                                if (attributeName.equals("region") && map2.containsKey(attributeValue6)) {
                                                    str9 = attributeValue6;
                                                }
                                                i20++;
                                                dcrVar5 = dcrVar;
                                                break;
                                            case 99841:
                                                if (attributeName.equals("dur")) {
                                                    jE3 = e(attributeValue6, dcrVar);
                                                }
                                                i20++;
                                                dcrVar5 = dcrVar;
                                                break;
                                            case 100571:
                                                if (attributeName.equals("end")) {
                                                    jE = e(attributeValue6, dcrVar);
                                                }
                                                i20++;
                                                dcrVar5 = dcrVar;
                                                break;
                                            case 93616297:
                                                if (attributeName.equals("begin")) {
                                                    dcrVar = dcrVar5;
                                                    try {
                                                        jE2 = e(attributeValue6, dcrVar);
                                                    } catch (dbf e2) {
                                                        e = e2;
                                                        arrayDeque = arrayDeque3;
                                                        bvx.f("TtmlParser", "Suppressing parser error", e);
                                                        dcrVar3 = dcrVar;
                                                        i6 = 1;
                                                        xmlPullParserNewPullParser.next();
                                                        eventType = xmlPullParserNewPullParser.getEventType();
                                                        arrayDeque2 = arrayDeque;
                                                        str5 = str2;
                                                        str4 = str;
                                                        dcrVar2 = dcrVar2;
                                                        str6 = str6;
                                                    }
                                                } else {
                                                    dcrVar = dcrVar5;
                                                }
                                                i20++;
                                                dcrVar5 = dcrVar;
                                                break;
                                            case 109780401:
                                                if (attributeName.equals("style")) {
                                                    String[] strArrI2 = i(attributeValue6);
                                                    if (strArrI2.length > 0) {
                                                        strArr = strArrI2;
                                                    }
                                                }
                                                dcrVar = dcrVar5;
                                                i20++;
                                                dcrVar5 = dcrVar;
                                                break;
                                            case 1292595405:
                                                if (attributeName.equals("backgroundImage") && attributeValue6.startsWith("#")) {
                                                    strSubstring = attributeValue6.substring(1);
                                                }
                                                dcrVar = dcrVar5;
                                                i20++;
                                                dcrVar5 = dcrVar;
                                                break;
                                            default:
                                                dcrVar = dcrVar5;
                                                i20++;
                                                dcrVar5 = dcrVar;
                                                break;
                                        }
                                    }
                                    dcrVar = dcrVar5;
                                    if (dcqVar2 != null) {
                                        long j3 = dcqVar2.d;
                                        if (j3 == -9223372036854775807L) {
                                            dcqVar = dcqVar2;
                                        } else {
                                            jE2 = jE2 != -9223372036854775807L ? jE2 + j3 : j3;
                                            if (jE != -9223372036854775807L) {
                                                jE += j3;
                                                dcqVar = dcqVar2;
                                            } else {
                                                dcqVar = dcqVar2;
                                                jE = -9223372036854775807L;
                                            }
                                        }
                                    } else {
                                        dcqVar = null;
                                    }
                                    if (jE == -9223372036854775807L) {
                                        if (jE3 != -9223372036854775807L) {
                                            j2 = jE2 + jE3;
                                        } else {
                                            if (dcqVar != null) {
                                                j2 = dcqVar.e;
                                                if (j2 == -9223372036854775807L) {
                                                }
                                            }
                                            j = -9223372036854775807L;
                                        }
                                        j = j2;
                                    } else {
                                        j = jE;
                                    }
                                    dcq dcqVar3 = new dcq(xmlPullParserNewPullParser.getName(), null, jE2, j, dcuVarH2, strArr, str9, strSubstring, dcqVar);
                                    arrayDeque = arrayDeque3;
                                    try {
                                        arrayDeque.push(dcqVar3);
                                        if (dcqVar2 != null) {
                                            dcqVar2.c(dcqVar3);
                                        }
                                    } catch (dbf e3) {
                                        e = e3;
                                        bvx.f("TtmlParser", "Suppressing parser error", e);
                                        dcrVar3 = dcrVar;
                                        i6 = 1;
                                    }
                                } catch (dbf e4) {
                                    e = e4;
                                    dcrVar = dcrVar5;
                                }
                            }
                            i7 = i7;
                            ysVar = ysVar;
                            dcrVar3 = dcrVar;
                            dcvVar = dcvVar;
                            i6 = i6;
                            str2 = str2;
                        } else {
                            bvx.h("Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            arrayDeque = arrayDeque3;
                        }
                        i6 = 1;
                    } else {
                        String str10 = str5;
                        str6 = str6;
                        arrayDeque = arrayDeque2;
                        dcrVar2 = dcrVar2;
                        i3 = i6;
                        if (eventType == 4) {
                            dcqVar2.getClass();
                            str2 = str10;
                            dcqVar2.c(new dcq(null, xmlPullParserNewPullParser.getText().replaceAll("\r\n", str2).replaceAll(" *\n *", str2).replaceAll(str2, " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null));
                        } else {
                            str2 = str10;
                            if (eventType == 3) {
                                if (xmlPullParserNewPullParser.getName().equals("tt")) {
                                    dcq dcqVar4 = (dcq) arrayDeque.peek();
                                    dcqVar4.getClass();
                                    dcvVar = new dcv(dcqVar4, map, map2, map3);
                                } else {
                                    dcvVar = dcvVar;
                                }
                                arrayDeque.pop();
                            }
                            i6 = i3;
                        }
                        dcvVar = dcvVar;
                        i6 = i3;
                    }
                } else {
                    str = str4;
                    str6 = str6;
                    dcrVar2 = dcrVar2;
                    dcvVar = dcvVar;
                    i3 = i6;
                    str2 = str5;
                    arrayDeque = arrayDeque2;
                    if (eventType == 2) {
                        i6 = i3 + 1;
                    } else {
                        if (eventType == 3) {
                            i6 = i3 - 1;
                        }
                        dcvVar = dcvVar;
                        i6 = i3;
                    }
                    dcvVar = dcvVar;
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                arrayDeque2 = arrayDeque;
                str5 = str2;
                str4 = str;
                dcrVar2 = dcrVar2;
                str6 = str6;
            }
            dcv dcvVar2 = dcvVar;
            dcvVar2.getClass();
            return dcvVar2;
        } catch (IOException e5) {
            throw new IllegalStateException("Unexpected error when reading input.", e5);
        } catch (XmlPullParserException e6) {
            throw new IllegalStateException("Unable to decode source", e6);
        }
    }

    @Override // defpackage.dbn
    public final void c(byte[] bArr, int i, int i2, dbm dbmVar, bvh bvhVar) {
        om.f(b(bArr, i, i2), dbmVar, bvhVar);
    }

    @Override // defpackage.dbn
    public final /* synthetic */ void d() {
    }
}
