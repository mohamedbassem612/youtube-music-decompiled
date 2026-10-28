package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import app.rive.semantics.SemanticState;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ciq extends DefaultHandler implements crr {
    private static final Pattern a = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private static final Pattern b = Pattern.compile("CC([1-4])=.*");
    private static final Pattern c = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    private static final int[] d = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};
    private static final int[] e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    private final XmlPullParserFactory f;

    public ciq() {
        try {
            this.f = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    protected static final cja A(XmlPullParser xmlPullParser, cja cjaVar, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long jE = e(xmlPullParser, "timescale", cjaVar != null ? cjaVar.k : 1L);
        long jE2 = e(xmlPullParser, "presentationTimeOffset", cjaVar != null ? cjaVar.l : 0L);
        long jE3 = e(xmlPullParser, "duration", cjaVar != null ? cjaVar.b : -9223372036854775807L);
        long jE4 = e(xmlPullParser, "startNumber", cjaVar != null ? cjaVar.a : 1L);
        long jF = F(j3, j4);
        List list = null;
        civ civVarT = null;
        List listZ = null;
        do {
            xmlPullParser.next();
            if (aty.j(xmlPullParser, "Initialization")) {
                civVarT = t(xmlPullParser, "sourceURL", "range");
            } else {
                List list2 = list;
                civ civVar = civVarT;
                if (aty.j(xmlPullParser, "SegmentTimeline")) {
                    listZ = z(xmlPullParser, jE, j2);
                } else if (aty.j(xmlPullParser, "SegmentURL")) {
                    List arrayList = list2 == null ? new ArrayList() : list2;
                    arrayList.add(t(xmlPullParser, "media", "mediaRange"));
                    civVarT = civVar;
                    list = arrayList;
                } else {
                    j(xmlPullParser);
                }
                list = list2;
                civVarT = civVar;
            }
        } while (!aty.h(xmlPullParser, "SegmentList"));
        if (cjaVar != null) {
            if (civVarT == null) {
                civVarT = cjaVar.j;
            }
            if (listZ == null) {
                listZ = cjaVar.c;
            }
            if (list == null) {
                list = cjaVar.g;
            }
        }
        return new cja(civVarT, jE, jE2, jE4, jE3, listZ, jF, list, bwp.y(j5), bwp.y(j));
    }

    protected static final cjb B(XmlPullParser xmlPullParser, cjb cjbVar, List list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6;
        civ civVar;
        civ civVar2;
        String str;
        long jE = e(xmlPullParser, "timescale", cjbVar != null ? cjbVar.k : 1L);
        long jE2 = e(xmlPullParser, "presentationTimeOffset", cjbVar != null ? cjbVar.l : 0L);
        long jE3 = e(xmlPullParser, "duration", cjbVar != null ? cjbVar.b : -9223372036854775807L);
        long jE4 = e(xmlPullParser, "startNumber", cjbVar != null ? cjbVar.a : 1L);
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            cir cirVar = (cir) list.get(i);
            if (ahno.ag("http://dashif.org/guidelines/last-segment-number", cirVar.a) && (str = cirVar.b) != null) {
                j6 = Long.parseLong(str);
                break;
            }
            i++;
        }
        long j7 = j6;
        long jF = F(j3, j4);
        civ civVarT = null;
        xsc xscVarD = D(xmlPullParser, "media", cjbVar != null ? cjbVar.i : null);
        xsc xscVarD2 = D(xmlPullParser, "initialization", cjbVar != null ? cjbVar.h : null);
        List listZ = null;
        while (true) {
            xmlPullParser.next();
            if (aty.j(xmlPullParser, "Initialization")) {
                civVarT = t(xmlPullParser, "sourceURL", "range");
            } else if (aty.j(xmlPullParser, "SegmentTimeline")) {
                listZ = z(xmlPullParser, jE, j2);
            } else {
                j(xmlPullParser);
            }
            civVar = civVarT;
            if (aty.h(xmlPullParser, "SegmentTemplate")) {
                break;
            }
            civVarT = civVar;
        }
        if (cjbVar != null) {
            civ civVar3 = civVar == null ? cjbVar.j : civVar;
            if (listZ == null) {
                listZ = cjbVar.c;
            }
            civVar2 = civVar3;
        } else {
            civVar2 = civVar;
        }
        return new cjb(civVar2, jE, jE2, jE4, j7, jE3, listZ, jF, xscVarD2, xscVarD, bwp.y(j5), bwp.y(j));
    }

    @Deprecated
    protected static final dep C(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strH = h(xmlPullParser, "schemeIdUri", "");
        String strH2 = h(xmlPullParser, "value", "");
        long jE = e(xmlPullParser, "timescale", 1L);
        long jE2 = e(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(SemanticState.LiveRegion);
        while (true) {
            xmlPullParser.next();
            if (aty.j(xmlPullParser, "Event")) {
                long jE3 = e(xmlPullParser, "id", 0L);
                long jE4 = e(xmlPullParser, "duration", -9223372036854775807L);
                long jE5 = e(xmlPullParser, "presentationTime", 0L);
                long jC = bwp.C(jE4, 1000L, jE);
                long jC2 = bwp.C(jE5 - jE2, 1000000L, jE);
                String strE = aty.e(xmlPullParser, "messageData");
                byteArrayOutputStream.reset();
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, StandardCharsets.UTF_8.name());
                xmlPullParser.nextToken();
                while (!aty.h(xmlPullParser, "Event")) {
                    G(xmlPullParser, xmlSerializerNewSerializer);
                    xmlPullParser.nextToken();
                }
                xmlSerializerNewSerializer.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Long lValueOf = Long.valueOf(jC2);
                if (strE != null) {
                    byteArray = bwp.ah(strE);
                }
                arrayList.add(Pair.create(lValueOf, new cxt(strH, strH2, jC, jE3, byteArray)));
            } else {
                j(xmlPullParser);
            }
            if (aty.h(xmlPullParser, "EventStream")) {
                break;
            }
            jE = jE;
        }
        long[] jArr = new long[arrayList.size()];
        cxt[] cxtVarArr = new cxt[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            cxtVarArr[i] = (cxt) pair.second;
        }
        return new dep(strH, strH2, jArr, cxtVarArr);
    }

    protected static final xsc D(XmlPullParser xmlPullParser, String str, xsc xscVar) {
        String strSubstring;
        String strE = aty.e(xmlPullParser, str);
        if (strE == null) {
            return xscVar;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add("");
        int length = 0;
        while (length < strE.length()) {
            int iIndexOf = strE.indexOf("$", length);
            if (iIndexOf == -1) {
                arrayList.set(arrayList2.size(), String.valueOf((String) arrayList.get(arrayList2.size())).concat(String.valueOf(strE.substring(length))));
                length = strE.length();
            } else if (iIndexOf != length) {
                arrayList.set(arrayList2.size(), String.valueOf((String) arrayList.get(arrayList2.size())).concat(String.valueOf(strE.substring(length, iIndexOf))));
                length = iIndexOf;
            } else if (strE.startsWith("$$", length)) {
                arrayList.set(arrayList2.size(), String.valueOf((String) arrayList.get(arrayList2.size())).concat("$"));
                length += 2;
            } else {
                arrayList3.add("");
                int i = length + 1;
                int iIndexOf2 = strE.indexOf("$", i);
                String strSubstring2 = strE.substring(i, iIndexOf2);
                if (strSubstring2.equals("RepresentationID")) {
                    arrayList2.add(1);
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = String.valueOf(strSubstring).concat("d");
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = "%01d";
                    }
                    int iHashCode = strSubstring2.hashCode();
                    if (iHashCode != -1950496919) {
                        if (iHashCode != 2606829) {
                            if (iHashCode != 38199441 || !strSubstring2.equals("Bandwidth")) {
                                throw new IllegalArgumentException("Invalid template: ".concat(strE));
                            }
                            arrayList2.add(3);
                            arrayList3.set(arrayList2.size() - 1, strSubstring);
                        } else {
                            if (!strSubstring2.equals("Time")) {
                                throw new IllegalArgumentException("Invalid template: ".concat(strE));
                            }
                            arrayList2.add(4);
                            arrayList3.set(arrayList2.size() - 1, strSubstring);
                        }
                    } else {
                        if (!strSubstring2.equals("Number")) {
                            throw new IllegalArgumentException("Invalid template: ".concat(strE));
                        }
                        arrayList2.add(2);
                        arrayList3.set(arrayList2.size() - 1, strSubstring);
                    }
                }
                arrayList.add("");
                length = iIndexOf2 + 1;
            }
        }
        return new xsc(arrayList, arrayList2, arrayList3, (float[]) null);
    }

    private static int E(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        ahno.O(i == i2);
        return i;
    }

    private static long F(long j, long j2) {
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        if (j != Long.MAX_VALUE) {
            return j;
        }
        return -9223372036854775807L;
    }

    private static void G(XmlPullParser xmlPullParser, XmlSerializer xmlSerializer) throws IOException {
        switch (xmlPullParser.getEventType()) {
            case 0:
                xmlSerializer.startDocument(null, Boolean.FALSE);
                break;
            case 1:
                xmlSerializer.endDocument();
                break;
            case 2:
                xmlSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                    xmlSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                }
                break;
            case 3:
                xmlSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                break;
            case 4:
                xmlSerializer.text(xmlPullParser.getText());
                break;
            case 5:
                xmlSerializer.cdsect(xmlPullParser.getText());
                break;
            case 6:
                xmlSerializer.entityRef(xmlPullParser.getText());
                break;
            case 7:
                xmlSerializer.ignorableWhitespace(xmlPullParser.getText());
                break;
            case 8:
                xmlSerializer.processingInstruction(xmlPullParser.getText());
                break;
            case 9:
                xmlSerializer.comment(xmlPullParser.getText());
                break;
            case 10:
                xmlSerializer.docdecl(xmlPullParser.getText());
                break;
        }
    }

    private static final long H(List list, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            int i3 = bwp.a;
            i2 = (int) ((((j3 - j) + j2) - 1) / j2);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            list.add(new cjc(j, j2));
            j += j2;
        }
        return j;
    }

    protected static float b(XmlPullParser xmlPullParser, float f) {
        String strE = aty.e(xmlPullParser, "frameRate");
        if (strE == null) {
            return f;
        }
        Matcher matcher = a.matcher(strE);
        if (!matcher.matches()) {
            return f;
        }
        float f2 = Integer.parseInt(matcher.group(1));
        String strGroup = matcher.group(2);
        return !TextUtils.isEmpty(strGroup) ? f2 / Integer.parseInt(strGroup) : f2;
    }

    protected static int c(XmlPullParser xmlPullParser, String str, int i) {
        String strE = aty.e(xmlPullParser, str);
        return strE != null ? Integer.parseInt(strE) : i;
    }

    protected static long d(XmlPullParser xmlPullParser, String str, long j) {
        String strE = aty.e(xmlPullParser, str);
        if (strE == null) {
            return j;
        }
        Matcher matcher = bwp.g.matcher(strE);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(strE) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d2 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d3 = d2 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d4 = d3 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d5 = d4 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d6 = d5 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j2 = (long) ((d6 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j2 : j2;
    }

    protected static long e(XmlPullParser xmlPullParser, String str, long j) {
        String strE = aty.e(xmlPullParser, str);
        return strE != null ? Long.parseLong(strE) : j;
    }

    protected static cir g(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strH = h(xmlPullParser, "schemeIdUri", "");
        String strE = aty.e(xmlPullParser, "value");
        String strE2 = aty.e(xmlPullParser, "id");
        do {
            xmlPullParser.next();
        } while (!aty.h(xmlPullParser, str));
        return new cir(strH, strE, strE2);
    }

    protected static String h(XmlPullParser xmlPullParser, String str, String str2) {
        String strE = aty.e(xmlPullParser, str);
        return strE != null ? strE : str2;
    }

    protected static String i(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                j(xmlPullParser);
            }
        } while (!aty.h(xmlPullParser, str));
        return text;
    }

    public static void j(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (aty.i(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (aty.i(xmlPullParser)) {
                    i++;
                } else if (aty.g(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    protected static boolean k(XmlPullParser xmlPullParser, String str, boolean z) {
        String strE = aty.e(xmlPullParser, str);
        if (strE != null) {
            return strE.equals("true") || strE.equals("1");
        }
        return z;
    }

    protected static String[] l(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String strE = aty.e(xmlPullParser, str);
        return strE == null ? strArr : strE.split(",");
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Code duplicated, block: B:38:0x008f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:82:0x0152  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    protected static final int m(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strE;
        int iC;
        String strE2;
        String strE3;
        String strAe;
        String strH = h(xmlPullParser, "schemeIdUri", "");
        int iC2 = 6;
        switch (strH.hashCode()) {
            case -2128649360:
                if (!strH.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    iC2 = -1;
                } else {
                    iC2 = c(xmlPullParser, "value", -1);
                    if (iC2 > 0 || iC2 >= 33) {
                        iC2 = -1;
                    }
                }
                break;
            case -2060825028:
                if (strH.equals("tag:dolby.com,2015:dash:audio_channel_configuration:2015") && (strE = aty.e(xmlPullParser, "value")) != null && strE.length() == 6) {
                    int i = Integer.parseInt(strE, 16);
                    int i2 = 0;
                    if ((8388608 & i) == 0) {
                        int i3 = 0;
                        while (true) {
                            int[] iArr = d;
                            int length = iArr.length;
                            if (i2 >= 19) {
                                iC2 = i3 == 0 ? -1 : i3;
                            } else {
                                i3 += ((i >> i2) & 1) * iArr[i2];
                                i2++;
                            }
                        }
                    } else {
                        String[] strArrAj = bwp.aj(str);
                        if (strArrAj.length == 0) {
                            iC2 = -1;
                        } else {
                            List listH = agfm.b('.').h(ahno.ae(strArrAj[0].trim()));
                            if (listH.size() == 4 && ((String) listH.get(0)).equals("ac-4")) {
                                String str2 = (String) listH.get(3);
                                int iHashCode = str2.hashCode();
                                if (iHashCode == 1539) {
                                    iC2 = !str2.equals("03") ? -1 : 18;
                                } else if (iHashCode == 1540 && str2.equals("04")) {
                                    iC2 = 21;
                                } else {
                                    iC2 = -1;
                                }
                            } else {
                                iC2 = -1;
                            }
                        }
                    }
                } else {
                    iC2 = -1;
                }
                break;
            case -1352850286:
                iC2 = !strH.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011") ? -1 : c(xmlPullParser, "value", -1);
                break;
            case -1138141449:
                if (strH.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    strE3 = aty.e(xmlPullParser, "value");
                    if (strE3 != null) {
                        strAe = ahno.ae(strE3);
                        switch (strAe.hashCode()) {
                            case 1596796:
                                if (strAe.equals("4000")) {
                                    iC2 = -1;
                                } else {
                                    iC2 = 1;
                                }
                                break;
                            case 2937391:
                                if (strAe.equals("a000")) {
                                    iC2 = -1;
                                } else {
                                    iC2 = 2;
                                }
                                break;
                            case 3094034:
                                if (strAe.equals("f800")) {
                                    iC2 = -1;
                                } else {
                                    iC2 = 5;
                                }
                                break;
                            case 3094035:
                                if (!strAe.equals("f801")) {
                                    iC2 = -1;
                                }
                                break;
                            case 3133436:
                                if (strAe.equals("fa01")) {
                                    iC2 = -1;
                                } else {
                                    iC2 = 8;
                                }
                                break;
                            default:
                                iC2 = -1;
                                break;
                        }
                    } else {
                        iC2 = -1;
                        break;
                    }
                } else {
                    iC2 = -1;
                    break;
                }
                break;
            case -986633423:
                if (strH.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration") && (iC = c(xmlPullParser, "value", -1)) >= 0) {
                    int[] iArr2 = e;
                    int length2 = iArr2.length;
                    iC2 = iC >= 21 ? -1 : iArr2[iC];
                } else {
                    iC2 = -1;
                }
                break;
            case -79006963:
                if (!strH.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    iC2 = -1;
                } else {
                    iC2 = c(xmlPullParser, "value", -1);
                    if (iC2 > 0) {
                        iC2 = -1;
                    }
                }
                break;
            case 312179081:
                if (!strH.equals("tag:dts.com,2018:uhd:audio_channel_configuration") || (strE2 = aty.e(xmlPullParser, "value")) == null || (iC2 = Integer.bitCount(Integer.parseInt(strE2, 16))) == 0) {
                    iC2 = -1;
                }
                break;
            case 2036691300:
                if (strH.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    strE3 = aty.e(xmlPullParser, "value");
                    if (strE3 != null) {
                        strAe = ahno.ae(strE3);
                        switch (strAe.hashCode()) {
                            case 1596796:
                                if (strAe.equals("4000")) {
                                    iC2 = -1;
                                } else {
                                    iC2 = 1;
                                }
                                break;
                            case 2937391:
                                if (strAe.equals("a000")) {
                                    iC2 = -1;
                                } else {
                                    iC2 = 2;
                                }
                                break;
                            case 3094034:
                                if (strAe.equals("f800")) {
                                    iC2 = -1;
                                } else {
                                    iC2 = 5;
                                }
                                break;
                            case 3094035:
                                if (!strAe.equals("f801")) {
                                    iC2 = -1;
                                }
                                break;
                            case 3133436:
                                if (strAe.equals("fa01")) {
                                    iC2 = -1;
                                } else {
                                    iC2 = 8;
                                }
                                break;
                            default:
                                iC2 = -1;
                                break;
                        }
                    } else {
                        iC2 = -1;
                        break;
                    }
                } else {
                    iC2 = -1;
                    break;
                }
                break;
            default:
                iC2 = -1;
                break;
        }
        do {
            xmlPullParser.next();
        } while (!aty.h(xmlPullParser, "AudioChannelConfiguration"));
        return iC2;
    }

    protected static final long n(XmlPullParser xmlPullParser, long j) {
        String strE = aty.e(xmlPullParser, "availabilityTimeOffset");
        if (strE == null) {
            return j;
        }
        if ("INF".equals(strE)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(strE) * 1000000.0f);
    }

    protected static final List o(XmlPullParser xmlPullParser, List list, boolean z) {
        String strE = aty.e(xmlPullParser, "dvb:priority");
        int i = strE != null ? Integer.parseInt(strE) : z ? 1 : Integer.MIN_VALUE;
        String strE2 = aty.e(xmlPullParser, "dvb:weight");
        int i2 = strE2 != null ? Integer.parseInt(strE2) : 1;
        String strE3 = aty.e(xmlPullParser, "serviceLocation");
        String strTrim = i(xmlPullParser, "BaseURL").trim();
        if (atv.e(strTrim)) {
            if (strE3 == null) {
                strE3 = strTrim;
            }
            return aguu.s(new cim(strTrim, strE3, i, i2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            cim cimVar = (cim) list.get(i3);
            String strD = atv.d(cimVar.a, strTrim);
            String str = strE3 == null ? strD : strE3;
            if (z) {
                i = cimVar.c;
                i2 = cimVar.d;
                str = cimVar.b;
            }
            arrayList.add(new cim(strD, str, i, i2));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:68:0x0130  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v9 */
    protected static final Pair p(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strE;
        UUID uuid;
        UUID uuid2;
        ?? text;
        ?? J;
        String attributeValue;
        String strE2 = aty.e(xmlPullParser, "schemeIdUri");
        if (strE2 != null) {
            String strAe = ahno.ae(strE2);
            switch (strAe) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    uuid = brt.c;
                    strE = null;
                    uuid2 = null;
                    text = uuid2;
                    J = uuid2;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    uuid = brt.e;
                    strE = null;
                    uuid2 = null;
                    text = uuid2;
                    J = uuid2;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    uuid = brt.d;
                    strE = null;
                    uuid2 = null;
                    text = uuid2;
                    J = uuid2;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    strE = aty.e(xmlPullParser, "value");
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i = 0;
                    while (true) {
                        if (i >= attributeCount) {
                            attributeValue = null;
                        } else if (aty.f(xmlPullParser.getAttributeName(i)).equals("default_KID")) {
                            attributeValue = xmlPullParser.getAttributeValue(i);
                        } else {
                            i++;
                        }
                    }
                    if (TextUtils.isEmpty(attributeValue) || "00000000-0000-0000-0000-000000000000".equals(attributeValue)) {
                        bvx.e("MpdParser", "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        uuid = null;
                    } else {
                        String[] strArrSplit = attributeValue.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                            uuidArr[i2] = UUID.fromString(strArrSplit[i2]);
                        }
                        uuid = brt.b;
                        text = 0;
                        J = om.j(uuid, uuidArr, null);
                    }
                    break;
                default:
                    if (strAe.equals("urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e")) {
                        uuid = brt.c;
                        strE = null;
                        uuid2 = null;
                        text = uuid2;
                        J = uuid2;
                        break;
                    }
                    strE = null;
                    uuid = null;
                    uuid2 = uuid;
                    text = uuid2;
                    J = uuid2;
                    break;
            }
        } else {
            strE = null;
            uuid = null;
            uuid2 = uuid;
            text = uuid2;
            J = uuid2;
        }
        do {
            xmlPullParser.next();
            if ((aty.j(xmlPullParser, "clearkey:Laurl") || aty.j(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                J = J;
                text = xmlPullParser.getText();
            } else if (aty.j(xmlPullParser, "ms:laurl")) {
                J = J;
                text = aty.e(xmlPullParser, "licenseUrl");
            } else if (J == 0 && aty.i(xmlPullParser) && aty.f(xmlPullParser.getName()).equals("pssh") && xmlPullParser.next() == 4) {
                byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                UUID uuidI = om.i(bArrDecode);
                if (uuidI == null) {
                    bvx.e("MpdParser", "Skipping malformed cenc:pssh data");
                    uuid = uuidI;
                    J = 0;
                    text = text;
                } else {
                    J = bArrDecode;
                    uuid = uuidI;
                    text = text;
                }
            } else if (J == 0) {
                UUID uuid3 = brt.e;
                if (uuid3.equals(uuid) && aty.j(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    J = om.j(uuid3, null, Base64.decode(xmlPullParser.getText(), 0));
                    text = text;
                } else {
                    j(xmlPullParser);
                    J = J;
                    text = text;
                }
            } else {
                j(xmlPullParser);
                J = J;
                text = text;
            }
        } while (!aty.h(xmlPullParser, "ContentProtection"));
        return Pair.create(strE, uuid != null ? new brz(uuid, text, "video/mp4", J) : null);
    }

    protected static final int q(XmlPullParser xmlPullParser) {
        String strE = aty.e(xmlPullParser, "contentType");
        if (TextUtils.isEmpty(strE)) {
            return -1;
        }
        if ("audio".equals(strE)) {
            return 1;
        }
        if ("video".equals(strE)) {
            return 2;
        }
        if ("text".equals(strE)) {
            return 3;
        }
        return "image".equals(strE) ? 4 : -1;
    }

    protected static long r(XmlPullParser xmlPullParser, String str) {
        String strE = aty.e(xmlPullParser, str);
        if (strE == null) {
            return -9223372036854775807L;
        }
        return bwp.A(strE);
    }

    protected static float s(XmlPullParser xmlPullParser, String str) {
        String strE = aty.e(xmlPullParser, str);
        if (strE == null) {
            return -3.4028235E38f;
        }
        return Float.parseFloat(strE);
    }

    protected static final civ t(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String strE = aty.e(xmlPullParser, str);
        String strE2 = aty.e(xmlPullParser, str2);
        if (strE2 != null) {
            String[] strArrSplit = strE2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
            return new civ(strE, j, j2);
        }
        j = 0;
        j2 = -1;
        return new civ(strE, j, j2);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0090 A[ORIG_RETURN, RETURN] */
    protected static final int u(String str) {
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    return SemanticState.Focused;
                }
                return 0;
            case -1724546052:
                if (str.equals("description")) {
                    return SemanticState.LiveRegion;
                }
                return 0;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    return SemanticState.Modal;
                }
                return 0;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    return SemanticState.Focused;
                }
                return 0;
            case -1408024454:
                return str.equals("alternate") ? 2 : 0;
            case -1396432756:
                if (str.equals("forced-subtitle")) {
                    return SemanticState.Focused;
                }
                return 0;
            case 99825:
                return str.equals("dub") ? 16 : 0;
            case 3343801:
                return str.equals("main") ? 1 : 0;
            case 3530173:
                if (str.equals("sign")) {
                    return SemanticState.Hidden;
                }
                return 0;
            case 552573414:
                return str.equals("caption") ? 64 : 0;
            case 899152809:
                return str.equals("commentary") ? 8 : 0;
            case 1629013393:
                return str.equals("emergency") ? 32 : 0;
            case 1855372047:
                return str.equals("supplementary") ? 4 : 0;
            default:
                return 0;
        }
    }

    protected static final int v(List list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (ahno.ag("http://dashif.org/guidelines/trickmode", ((cir) list.get(i2)).a)) {
                i = 16384;
            }
        }
        return i;
    }

    protected static final cjh w(XmlPullParser xmlPullParser) {
        String strE = aty.e(xmlPullParser, "schemeIdUri");
        String strE2 = aty.e(xmlPullParser, "value");
        if (strE == null || strE2 == null) {
            return null;
        }
        return new cjh(strE, strE2);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x019d  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a8 A[Catch: NumberFormatException -> 0x01d5, TRY_ENTER, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x01d5, blocks: (B:89:0x0161, B:95:0x017c, B:111:0x01a8, B:117:0x01c3), top: B:268:0x0161 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:115:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c3 A[Catch: NumberFormatException -> 0x01d5, TRY_ENTER, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x01d5, blocks: (B:89:0x0161, B:95:0x017c, B:111:0x01a8, B:117:0x01c3), top: B:268:0x0161 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:120:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:126:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:139:0x0203  */
    /* JADX WARN: Code duplicated, block: B:143:0x0212  */
    /* JADX WARN: Code duplicated, block: B:145:0x0220  */
    /* JADX WARN: Code duplicated, block: B:147:0x0224  */
    /* JADX WARN: Code duplicated, block: B:149:0x022d  */
    /* JADX WARN: Code duplicated, block: B:154:0x023b  */
    /* JADX WARN: Code duplicated, block: B:157:0x0245  */
    /* JADX WARN: Code duplicated, block: B:163:0x0254  */
    /* JADX WARN: Code duplicated, block: B:165:0x0262  */
    /* JADX WARN: Code duplicated, block: B:170:0x0275  */
    /* JADX WARN: Code duplicated, block: B:172:0x0283  */
    /* JADX WARN: Code duplicated, block: B:173:0x028d  */
    /* JADX WARN: Code duplicated, block: B:175:0x0297  */
    /* JADX WARN: Code duplicated, block: B:177:0x029b  */
    /* JADX WARN: Code duplicated, block: B:180:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:182:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:183:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:185:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:186:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:188:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:189:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:191:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:192:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:194:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:195:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:201:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:215:0x035b  */
    /* JADX WARN: Code duplicated, block: B:216:0x0364  */
    /* JADX WARN: Code duplicated, block: B:219:0x0369  */
    /* JADX WARN: Code duplicated, block: B:220:0x0372  */
    /* JADX WARN: Code duplicated, block: B:223:0x037b  */
    /* JADX WARN: Code duplicated, block: B:224:0x0386  */
    /* JADX WARN: Code duplicated, block: B:226:0x038c  */
    /* JADX WARN: Code duplicated, block: B:227:0x0396  */
    /* JADX WARN: Code duplicated, block: B:229:0x039c  */
    /* JADX WARN: Code duplicated, block: B:231:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:234:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:243:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:245:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:248:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:257:0x042a  */
    /* JADX WARN: Code duplicated, block: B:259:0x042e  */
    /* JADX WARN: Code duplicated, block: B:261:0x0434  */
    /* JADX WARN: Code duplicated, block: B:266:0x031a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x01d5 A[DONT_GENERATE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x02db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x0335 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:308:0x042a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x042a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:68:0x0109  */
    /* JADX WARN: Code duplicated, block: B:70:0x010e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0131  */
    /* JADX WARN: Code duplicated, block: B:80:0x0137  */
    /* JADX WARN: Code duplicated, block: B:81:0x013e  */
    /* JADX WARN: Code duplicated, block: B:84:0x014e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0159  */
    /* JADX WARN: Code duplicated, block: B:92:0x0172  */
    /* JADX WARN: Code duplicated, block: B:93:0x0174  */
    /* JADX WARN: Code duplicated, block: B:95:0x017c A[Catch: NumberFormatException -> 0x01d5, TRY_ENTER, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x01d5, blocks: (B:89:0x0161, B:95:0x017c, B:111:0x01a8, B:117:0x01c3), top: B:268:0x0161 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0189  */
    /* JADX WARN: Code duplicated, block: B:99:0x018c  */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0243, code lost:
    
        r11 = 2;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static final defpackage.bse x(java.lang.String r27, java.lang.String r28, int r29, int r30, float r31, int r32, int r33, int r34, java.lang.String r35, java.util.List r36, java.util.List r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.util.List r41, java.util.List r42) {
        /*
            Method dump skipped, instruction units count: 1120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ciq.x(java.lang.String, java.lang.String, int, int, float, int, int, int, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List):bse");
    }

    protected static final cjd y(XmlPullParser xmlPullParser, cjd cjdVar) throws XmlPullParserException, IOException {
        long j;
        long jE = e(xmlPullParser, "timescale", cjdVar != null ? cjdVar.k : 1L);
        long j2 = 0;
        long jE2 = e(xmlPullParser, "presentationTimeOffset", cjdVar != null ? cjdVar.l : 0L);
        if (cjdVar != null) {
            j = cjdVar.a;
            j2 = cjdVar.b;
        } else {
            j = 0;
        }
        String strE = aty.e(xmlPullParser, "indexRange");
        if (strE != null) {
            String[] strArrSplit = strE.split("-");
            j = Long.parseLong(strArrSplit[0]);
            j2 = (Long.parseLong(strArrSplit[1]) - j) + 1;
        }
        long j3 = j2;
        civ civVarT = cjdVar != null ? cjdVar.j : null;
        while (true) {
            xmlPullParser.next();
            if (aty.j(xmlPullParser, "Initialization")) {
                civVarT = t(xmlPullParser, "sourceURL", "range");
            } else {
                j(xmlPullParser);
            }
            civ civVar = civVarT;
            if (aty.h(xmlPullParser, "SegmentBase")) {
                return new cjd(civVar, jE, jE2, j, j3);
            }
            civVarT = civVar;
        }
    }

    protected static final List z(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        long j3;
        ArrayList arrayList = new ArrayList();
        long jH = 0;
        boolean z = false;
        int iC = 0;
        long jE = -9223372036854775807L;
        do {
            xmlPullParser.next();
            if (aty.j(xmlPullParser, "S")) {
                long jE2 = e(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    int i = iC;
                    j3 = jE2;
                    jH = H(arrayList, jH, jE, i, j3);
                } else {
                    j3 = jE2;
                }
                if (j3 != -9223372036854775807L) {
                    jH = j3;
                }
                jE = e(xmlPullParser, "d", -9223372036854775807L);
                iC = c(xmlPullParser, "r", 0);
                z = true;
            } else {
                j(xmlPullParser);
            }
        } while (!aty.h(xmlPullParser, "SegmentTimeline"));
        if (z) {
            H(arrayList, jH, jE, iC, bwp.C(j2, j, 1000L));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:170:0x068b  */
    /* JADX WARN: Code duplicated, block: B:260:0x0a8e A[LOOP:12: B:203:0x07d4->B:260:0x0a8e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:341:0x0d77 A[LOOP:5: B:117:0x0478->B:341:0x0d77, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:525:0x1422  */
    /* JADX WARN: Code duplicated, block: B:527:0x1426  */
    /* JADX WARN: Code duplicated, block: B:528:0x1429 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:529:0x142b  */
    /* JADX WARN: Code duplicated, block: B:530:0x142d A[Catch: XmlPullParserException -> 0x1496, TryCatch #0 {XmlPullParserException -> 0x1496, blocks: (B:3:0x000e, B:5:0x0020, B:7:0x002a, B:9:0x0037, B:14:0x0047, B:16:0x006a, B:19:0x0077, B:22:0x0084, B:24:0x0097, B:28:0x00a9, B:32:0x00b9, B:37:0x00e5, B:40:0x00f0, B:41:0x00f4, B:521:0x1418, B:533:0x143a, B:535:0x1440, B:537:0x145e, B:538:0x1468, B:530:0x142d, B:531:0x1437, B:44:0x011c, B:47:0x0128, B:48:0x0136, B:50:0x0143, B:59:0x0171, B:61:0x0179, B:51:0x014e, B:53:0x0156, B:54:0x015b, B:56:0x0163, B:57:0x0168, B:63:0x019f, B:65:0x01a7, B:68:0x01c2, B:70:0x01ca, B:72:0x01e6, B:74:0x01f1, B:73:0x01ec, B:75:0x0212, B:78:0x022f, B:80:0x023a, B:85:0x0287, B:87:0x028f, B:81:0x0256, B:83:0x0262, B:89:0x02b4, B:91:0x02bc, B:92:0x02f2, B:95:0x02fe, B:99:0x030a, B:101:0x0323, B:103:0x032a, B:104:0x0356, B:107:0x0361, B:108:0x0365, B:505:0x1368, B:507:0x1370, B:511:0x1397, B:512:0x13b4, B:513:0x13b5, B:517:0x13c5, B:516:0x13c3, B:109:0x039f, B:112:0x03b9, B:116:0x03c7, B:117:0x0478, B:120:0x0483, B:121:0x0487, B:281:0x0c09, B:283:0x0c11, B:284:0x0c1b, B:286:0x0c21, B:288:0x0c30, B:290:0x0c36, B:292:0x0c40, B:295:0x0c46, B:298:0x0c5a, B:300:0x0c60, B:302:0x0c74, B:304:0x0c78, B:309:0x0c8b, B:311:0x0c91, B:313:0x0ca3, B:315:0x0ca7, B:316:0x0cb5, B:317:0x0cba, B:319:0x0cc6, B:322:0x0cd3, B:324:0x0cd9, B:326:0x0ce5, B:327:0x0ce9, B:328:0x0cec, B:329:0x0cef, B:331:0x0cff, B:333:0x0d17, B:337:0x0d39, B:334:0x0d2d, B:336:0x0d32, B:338:0x0d46, B:339:0x0d4d, B:305:0x0c7c, B:291:0x0c3b, B:340:0x0d4e, B:123:0x04db, B:125:0x04e5, B:127:0x04ed, B:128:0x04f3, B:130:0x04f7, B:131:0x04ff, B:133:0x0507, B:138:0x0518, B:137:0x0511, B:139:0x0521, B:141:0x0529, B:142:0x0533, B:144:0x053b, B:146:0x056c, B:148:0x0574, B:151:0x05c6, B:153:0x05ce, B:155:0x060d, B:157:0x0617, B:158:0x0648, B:160:0x0658, B:162:0x066d, B:164:0x0675, B:171:0x068d, B:172:0x06a8, B:174:0x06b3, B:176:0x06bb, B:178:0x06c5, B:175:0x06b8, B:167:0x0680, B:180:0x071a, B:183:0x072b, B:187:0x0739, B:191:0x0757, B:194:0x0761, B:198:0x076e, B:202:0x077b, B:203:0x07d4, B:206:0x07df, B:207:0x07e3, B:242:0x0a04, B:244:0x0a0c, B:246:0x0a1c, B:248:0x0a30, B:250:0x0a34, B:252:0x0a3a, B:254:0x0a40, B:255:0x0a44, B:259:0x0a54, B:210:0x083a, B:212:0x0844, B:213:0x0875, B:215:0x087d, B:216:0x08cd, B:218:0x08d7, B:220:0x0938, B:222:0x0982, B:223:0x09a5, B:225:0x09b5, B:227:0x09bf, B:228:0x09c5, B:230:0x09c9, B:231:0x09d1, B:233:0x09d9, B:234:0x09e1, B:236:0x09e7, B:237:0x09ef, B:239:0x09f5, B:240:0x09fd, B:261:0x0ae4, B:263:0x0b26, B:265:0x0b47, B:267:0x0b51, B:268:0x0b7f, B:270:0x0b8f, B:271:0x0bb5, B:273:0x0bbd, B:274:0x0bcf, B:276:0x0bdd, B:277:0x0bf6, B:279:0x0c00, B:342:0x0dc2, B:344:0x0df0, B:348:0x0dfc, B:352:0x0e05, B:354:0x0e0f, B:356:0x0e17, B:489:0x12a1, B:357:0x0e22, B:359:0x0e30, B:361:0x0e38, B:363:0x0e40, B:365:0x0e52, B:366:0x0e83, B:368:0x0e8e, B:371:0x0ea0, B:373:0x0eaa, B:377:0x0eb5, B:379:0x0ed6, B:381:0x0ee6, B:384:0x0f1d, B:389:0x0f36, B:408:0x0fd3, B:410:0x0fe1, B:413:0x0fe8, B:415:0x0ff2, B:417:0x1007, B:479:0x121f, B:418:0x1023, B:422:0x1032, B:429:0x1065, B:433:0x1086, B:435:0x1093, B:441:0x10ac, B:442:0x10b6, B:444:0x10c4, B:447:0x10d1, B:449:0x10e2, B:451:0x10f3, B:453:0x1104, B:457:0x1122, B:454:0x110c, B:427:0x1049, B:421:0x102e, B:464:0x119d, B:466:0x11a9, B:477:0x1219, B:392:0x0f48, B:394:0x0f51, B:395:0x0f55, B:397:0x0f6e, B:403:0x0fa7, B:405:0x0fb2, B:482:0x125e, B:484:0x1266, B:485:0x1273, B:487:0x1279, B:488:0x1292, B:399:0x0f7b, B:401:0x0f8c, B:402:0x0f92, B:481:0x1245, B:491:0x12dc, B:493:0x12ea, B:494:0x1302, B:496:0x1308, B:498:0x1332, B:500:0x1345, B:501:0x1355, B:503:0x135d, B:504:0x1364, B:519:0x13f5, B:12:0x0043, B:540:0x148b, B:541:0x1495), top: B:549:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:532:0x1438  */
    /* JADX WARN: Code duplicated, block: B:535:0x1440 A[Catch: XmlPullParserException -> 0x1496, TryCatch #0 {XmlPullParserException -> 0x1496, blocks: (B:3:0x000e, B:5:0x0020, B:7:0x002a, B:9:0x0037, B:14:0x0047, B:16:0x006a, B:19:0x0077, B:22:0x0084, B:24:0x0097, B:28:0x00a9, B:32:0x00b9, B:37:0x00e5, B:40:0x00f0, B:41:0x00f4, B:521:0x1418, B:533:0x143a, B:535:0x1440, B:537:0x145e, B:538:0x1468, B:530:0x142d, B:531:0x1437, B:44:0x011c, B:47:0x0128, B:48:0x0136, B:50:0x0143, B:59:0x0171, B:61:0x0179, B:51:0x014e, B:53:0x0156, B:54:0x015b, B:56:0x0163, B:57:0x0168, B:63:0x019f, B:65:0x01a7, B:68:0x01c2, B:70:0x01ca, B:72:0x01e6, B:74:0x01f1, B:73:0x01ec, B:75:0x0212, B:78:0x022f, B:80:0x023a, B:85:0x0287, B:87:0x028f, B:81:0x0256, B:83:0x0262, B:89:0x02b4, B:91:0x02bc, B:92:0x02f2, B:95:0x02fe, B:99:0x030a, B:101:0x0323, B:103:0x032a, B:104:0x0356, B:107:0x0361, B:108:0x0365, B:505:0x1368, B:507:0x1370, B:511:0x1397, B:512:0x13b4, B:513:0x13b5, B:517:0x13c5, B:516:0x13c3, B:109:0x039f, B:112:0x03b9, B:116:0x03c7, B:117:0x0478, B:120:0x0483, B:121:0x0487, B:281:0x0c09, B:283:0x0c11, B:284:0x0c1b, B:286:0x0c21, B:288:0x0c30, B:290:0x0c36, B:292:0x0c40, B:295:0x0c46, B:298:0x0c5a, B:300:0x0c60, B:302:0x0c74, B:304:0x0c78, B:309:0x0c8b, B:311:0x0c91, B:313:0x0ca3, B:315:0x0ca7, B:316:0x0cb5, B:317:0x0cba, B:319:0x0cc6, B:322:0x0cd3, B:324:0x0cd9, B:326:0x0ce5, B:327:0x0ce9, B:328:0x0cec, B:329:0x0cef, B:331:0x0cff, B:333:0x0d17, B:337:0x0d39, B:334:0x0d2d, B:336:0x0d32, B:338:0x0d46, B:339:0x0d4d, B:305:0x0c7c, B:291:0x0c3b, B:340:0x0d4e, B:123:0x04db, B:125:0x04e5, B:127:0x04ed, B:128:0x04f3, B:130:0x04f7, B:131:0x04ff, B:133:0x0507, B:138:0x0518, B:137:0x0511, B:139:0x0521, B:141:0x0529, B:142:0x0533, B:144:0x053b, B:146:0x056c, B:148:0x0574, B:151:0x05c6, B:153:0x05ce, B:155:0x060d, B:157:0x0617, B:158:0x0648, B:160:0x0658, B:162:0x066d, B:164:0x0675, B:171:0x068d, B:172:0x06a8, B:174:0x06b3, B:176:0x06bb, B:178:0x06c5, B:175:0x06b8, B:167:0x0680, B:180:0x071a, B:183:0x072b, B:187:0x0739, B:191:0x0757, B:194:0x0761, B:198:0x076e, B:202:0x077b, B:203:0x07d4, B:206:0x07df, B:207:0x07e3, B:242:0x0a04, B:244:0x0a0c, B:246:0x0a1c, B:248:0x0a30, B:250:0x0a34, B:252:0x0a3a, B:254:0x0a40, B:255:0x0a44, B:259:0x0a54, B:210:0x083a, B:212:0x0844, B:213:0x0875, B:215:0x087d, B:216:0x08cd, B:218:0x08d7, B:220:0x0938, B:222:0x0982, B:223:0x09a5, B:225:0x09b5, B:227:0x09bf, B:228:0x09c5, B:230:0x09c9, B:231:0x09d1, B:233:0x09d9, B:234:0x09e1, B:236:0x09e7, B:237:0x09ef, B:239:0x09f5, B:240:0x09fd, B:261:0x0ae4, B:263:0x0b26, B:265:0x0b47, B:267:0x0b51, B:268:0x0b7f, B:270:0x0b8f, B:271:0x0bb5, B:273:0x0bbd, B:274:0x0bcf, B:276:0x0bdd, B:277:0x0bf6, B:279:0x0c00, B:342:0x0dc2, B:344:0x0df0, B:348:0x0dfc, B:352:0x0e05, B:354:0x0e0f, B:356:0x0e17, B:489:0x12a1, B:357:0x0e22, B:359:0x0e30, B:361:0x0e38, B:363:0x0e40, B:365:0x0e52, B:366:0x0e83, B:368:0x0e8e, B:371:0x0ea0, B:373:0x0eaa, B:377:0x0eb5, B:379:0x0ed6, B:381:0x0ee6, B:384:0x0f1d, B:389:0x0f36, B:408:0x0fd3, B:410:0x0fe1, B:413:0x0fe8, B:415:0x0ff2, B:417:0x1007, B:479:0x121f, B:418:0x1023, B:422:0x1032, B:429:0x1065, B:433:0x1086, B:435:0x1093, B:441:0x10ac, B:442:0x10b6, B:444:0x10c4, B:447:0x10d1, B:449:0x10e2, B:451:0x10f3, B:453:0x1104, B:457:0x1122, B:454:0x110c, B:427:0x1049, B:421:0x102e, B:464:0x119d, B:466:0x11a9, B:477:0x1219, B:392:0x0f48, B:394:0x0f51, B:395:0x0f55, B:397:0x0f6e, B:403:0x0fa7, B:405:0x0fb2, B:482:0x125e, B:484:0x1266, B:485:0x1273, B:487:0x1279, B:488:0x1292, B:399:0x0f7b, B:401:0x0f8c, B:402:0x0f92, B:481:0x1245, B:491:0x12dc, B:493:0x12ea, B:494:0x1302, B:496:0x1308, B:498:0x1332, B:500:0x1345, B:501:0x1355, B:503:0x135d, B:504:0x1364, B:519:0x13f5, B:12:0x0043, B:540:0x148b, B:541:0x1495), top: B:549:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:537:0x145e A[Catch: XmlPullParserException -> 0x1496, TryCatch #0 {XmlPullParserException -> 0x1496, blocks: (B:3:0x000e, B:5:0x0020, B:7:0x002a, B:9:0x0037, B:14:0x0047, B:16:0x006a, B:19:0x0077, B:22:0x0084, B:24:0x0097, B:28:0x00a9, B:32:0x00b9, B:37:0x00e5, B:40:0x00f0, B:41:0x00f4, B:521:0x1418, B:533:0x143a, B:535:0x1440, B:537:0x145e, B:538:0x1468, B:530:0x142d, B:531:0x1437, B:44:0x011c, B:47:0x0128, B:48:0x0136, B:50:0x0143, B:59:0x0171, B:61:0x0179, B:51:0x014e, B:53:0x0156, B:54:0x015b, B:56:0x0163, B:57:0x0168, B:63:0x019f, B:65:0x01a7, B:68:0x01c2, B:70:0x01ca, B:72:0x01e6, B:74:0x01f1, B:73:0x01ec, B:75:0x0212, B:78:0x022f, B:80:0x023a, B:85:0x0287, B:87:0x028f, B:81:0x0256, B:83:0x0262, B:89:0x02b4, B:91:0x02bc, B:92:0x02f2, B:95:0x02fe, B:99:0x030a, B:101:0x0323, B:103:0x032a, B:104:0x0356, B:107:0x0361, B:108:0x0365, B:505:0x1368, B:507:0x1370, B:511:0x1397, B:512:0x13b4, B:513:0x13b5, B:517:0x13c5, B:516:0x13c3, B:109:0x039f, B:112:0x03b9, B:116:0x03c7, B:117:0x0478, B:120:0x0483, B:121:0x0487, B:281:0x0c09, B:283:0x0c11, B:284:0x0c1b, B:286:0x0c21, B:288:0x0c30, B:290:0x0c36, B:292:0x0c40, B:295:0x0c46, B:298:0x0c5a, B:300:0x0c60, B:302:0x0c74, B:304:0x0c78, B:309:0x0c8b, B:311:0x0c91, B:313:0x0ca3, B:315:0x0ca7, B:316:0x0cb5, B:317:0x0cba, B:319:0x0cc6, B:322:0x0cd3, B:324:0x0cd9, B:326:0x0ce5, B:327:0x0ce9, B:328:0x0cec, B:329:0x0cef, B:331:0x0cff, B:333:0x0d17, B:337:0x0d39, B:334:0x0d2d, B:336:0x0d32, B:338:0x0d46, B:339:0x0d4d, B:305:0x0c7c, B:291:0x0c3b, B:340:0x0d4e, B:123:0x04db, B:125:0x04e5, B:127:0x04ed, B:128:0x04f3, B:130:0x04f7, B:131:0x04ff, B:133:0x0507, B:138:0x0518, B:137:0x0511, B:139:0x0521, B:141:0x0529, B:142:0x0533, B:144:0x053b, B:146:0x056c, B:148:0x0574, B:151:0x05c6, B:153:0x05ce, B:155:0x060d, B:157:0x0617, B:158:0x0648, B:160:0x0658, B:162:0x066d, B:164:0x0675, B:171:0x068d, B:172:0x06a8, B:174:0x06b3, B:176:0x06bb, B:178:0x06c5, B:175:0x06b8, B:167:0x0680, B:180:0x071a, B:183:0x072b, B:187:0x0739, B:191:0x0757, B:194:0x0761, B:198:0x076e, B:202:0x077b, B:203:0x07d4, B:206:0x07df, B:207:0x07e3, B:242:0x0a04, B:244:0x0a0c, B:246:0x0a1c, B:248:0x0a30, B:250:0x0a34, B:252:0x0a3a, B:254:0x0a40, B:255:0x0a44, B:259:0x0a54, B:210:0x083a, B:212:0x0844, B:213:0x0875, B:215:0x087d, B:216:0x08cd, B:218:0x08d7, B:220:0x0938, B:222:0x0982, B:223:0x09a5, B:225:0x09b5, B:227:0x09bf, B:228:0x09c5, B:230:0x09c9, B:231:0x09d1, B:233:0x09d9, B:234:0x09e1, B:236:0x09e7, B:237:0x09ef, B:239:0x09f5, B:240:0x09fd, B:261:0x0ae4, B:263:0x0b26, B:265:0x0b47, B:267:0x0b51, B:268:0x0b7f, B:270:0x0b8f, B:271:0x0bb5, B:273:0x0bbd, B:274:0x0bcf, B:276:0x0bdd, B:277:0x0bf6, B:279:0x0c00, B:342:0x0dc2, B:344:0x0df0, B:348:0x0dfc, B:352:0x0e05, B:354:0x0e0f, B:356:0x0e17, B:489:0x12a1, B:357:0x0e22, B:359:0x0e30, B:361:0x0e38, B:363:0x0e40, B:365:0x0e52, B:366:0x0e83, B:368:0x0e8e, B:371:0x0ea0, B:373:0x0eaa, B:377:0x0eb5, B:379:0x0ed6, B:381:0x0ee6, B:384:0x0f1d, B:389:0x0f36, B:408:0x0fd3, B:410:0x0fe1, B:413:0x0fe8, B:415:0x0ff2, B:417:0x1007, B:479:0x121f, B:418:0x1023, B:422:0x1032, B:429:0x1065, B:433:0x1086, B:435:0x1093, B:441:0x10ac, B:442:0x10b6, B:444:0x10c4, B:447:0x10d1, B:449:0x10e2, B:451:0x10f3, B:453:0x1104, B:457:0x1122, B:454:0x110c, B:427:0x1049, B:421:0x102e, B:464:0x119d, B:466:0x11a9, B:477:0x1219, B:392:0x0f48, B:394:0x0f51, B:395:0x0f55, B:397:0x0f6e, B:403:0x0fa7, B:405:0x0fb2, B:482:0x125e, B:484:0x1266, B:485:0x1273, B:487:0x1279, B:488:0x1292, B:399:0x0f7b, B:401:0x0f8c, B:402:0x0f92, B:481:0x1245, B:491:0x12dc, B:493:0x12ea, B:494:0x1302, B:496:0x1308, B:498:0x1332, B:500:0x1345, B:501:0x1355, B:503:0x135d, B:504:0x1364, B:519:0x13f5, B:12:0x0043, B:540:0x148b, B:541:0x1495), top: B:549:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:539:0x1469 A[LOOP:1: B:37:0x00e5->B:539:0x1469, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:554:0x141e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x028f A[EDGE_INSN: B:556:0x028f->B:87:0x028f BREAK  A[LOOP:3: B:78:0x022f->B:88:0x02a6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x0c11 A[EDGE_INSN: B:558:0x0c11->B:283:0x0c11 BREAK  A[LOOP:5: B:117:0x0478->B:341:0x0d77], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x0a0c A[EDGE_INSN: B:576:0x0a0c->B:244:0x0a0c BREAK  A[LOOP:12: B:203:0x07d4->B:260:0x0a8e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x02a6 A[LOOP:3: B:78:0x022f->B:88:0x02a6, LOOP_END] */
    @Override // defpackage.crr
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final cio a(Uri uri, InputStream inputStream) throws IOException {
        boolean z;
        ArrayList arrayList;
        String str;
        ArrayList arrayList2;
        String str2;
        ArrayList arrayList3;
        long j;
        long j2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        long j3;
        long j4;
        cir cirVar;
        String str3;
        String str4;
        ArrayList arrayList9;
        ByteArrayOutputStream byteArrayOutputStream;
        long j5;
        String str5;
        long j6;
        String str6;
        String str7;
        Object obj;
        Pair pairCreate;
        long j7;
        long j8;
        String str8;
        String str9;
        ArrayList arrayList10;
        Object obj2;
        boolean z2;
        int i;
        long j9;
        long jRound;
        ArrayList arrayList11;
        boolean zK;
        boolean zK2;
        long j10;
        cik cikVar;
        Pair pairCreate2;
        long j11;
        ArrayList arrayList12;
        String str10;
        int i2;
        int i3;
        agjz agjzVar;
        long j12;
        int i4;
        long j13;
        int i5;
        String str11;
        String str12;
        int iM;
        long j14;
        int i6;
        cjh cjhVar;
        String str13;
        int i7;
        long j15;
        Object ciwVar;
        String str14;
        long j16;
        long j17;
        float fS;
        float fS2;
        long j18;
        String str15;
        String str16;
        String strNextText;
        long j19;
        String str17 = "MPD";
        String str18 = "EssentialProperty";
        String str19 = "BaseURL";
        String str20 = "id";
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() != 2 || !"MPD".equals(xmlPullParserNewPullParser.getName())) {
                throw new bsz("inputStream does not contain a valid media presentation description", null, true, 4);
            }
            String[] strArrL = l(xmlPullParserNewPullParser, "profiles", new String[0]);
            int length = strArrL.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    z = false;
                    break;
                }
                if (strArrL[i8].startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                    z = true;
                    break;
                }
                i8++;
            }
            long jR = r(xmlPullParserNewPullParser, "availabilityStartTime");
            long jD = d(xmlPullParserNewPullParser, "mediaPresentationDuration", -9223372036854775807L);
            long jD2 = d(xmlPullParserNewPullParser, "minBufferTime", -9223372036854775807L);
            boolean zEquals = "dynamic".equals(aty.e(xmlPullParserNewPullParser, "type"));
            long jD3 = zEquals ? d(xmlPullParserNewPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
            long jD4 = zEquals ? d(xmlPullParserNewPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
            long jD5 = zEquals ? d(xmlPullParserNewPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
            long jR2 = r(xmlPullParserNewPullParser, "publishTime");
            ArrayList arrayList13 = new ArrayList();
            long j20 = true != zEquals ? -9223372036854775807L : 0L;
            long j21 = 0;
            String string = uri.toString();
            ArrayList arrayListS = aguu.s(new cim(string, string, true != z ? Integer.MIN_VALUE : 1, 1));
            ArrayList arrayList14 = new ArrayList();
            ArrayList arrayList15 = new ArrayList();
            long jN = j20;
            long j22 = true != zEquals ? 0L : -9223372036854775807L;
            ciu ciuVar = null;
            cjh cjhVarW = null;
            cjf cjfVar = null;
            cin cinVar = null;
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                xmlPullParserNewPullParser.next();
                if (aty.j(xmlPullParserNewPullParser, str19)) {
                    if (!z3) {
                        jN = n(xmlPullParserNewPullParser, jN);
                    }
                    arrayList15.addAll(o(xmlPullParserNewPullParser, arrayListS, z));
                    str18 = str18;
                    str19 = str19;
                    str20 = str20;
                    str = string;
                    arrayList = arrayListS;
                    arrayList2 = arrayList15;
                    zEquals = zEquals;
                    jD4 = jD4;
                    jD2 = jD2;
                    j2 = -9223372036854775807L;
                    z3 = true;
                } else {
                    arrayList = arrayListS;
                    String str21 = "lang";
                    if (aty.j(xmlPullParserNewPullParser, "ProgramInformation")) {
                        String strE = aty.e(xmlPullParserNewPullParser, "moreInformationURL");
                        String strE2 = aty.e(xmlPullParserNewPullParser, "lang");
                        String str22 = null;
                        String strNextText2 = null;
                        String strNextText3 = null;
                        while (true) {
                            xmlPullParserNewPullParser.next();
                            String str23 = str22;
                            if (aty.j(xmlPullParserNewPullParser, "Title")) {
                                strNextText = xmlPullParserNewPullParser.nextText();
                                str15 = strNextText2;
                                str16 = strNextText3;
                            } else {
                                if (aty.j(xmlPullParserNewPullParser, "Source")) {
                                    strNextText2 = xmlPullParserNewPullParser.nextText();
                                } else if (aty.j(xmlPullParserNewPullParser, "Copyright")) {
                                    strNextText3 = xmlPullParserNewPullParser.nextText();
                                } else {
                                    j(xmlPullParserNewPullParser);
                                }
                                str15 = strNextText2;
                                str16 = strNextText3;
                                strNextText = str23;
                            }
                            if (aty.h(xmlPullParserNewPullParser, "ProgramInformation")) {
                                break;
                            }
                            str22 = strNextText;
                            strNextText2 = str15;
                            strNextText3 = str16;
                        }
                        str18 = str18;
                        str19 = str19;
                        str20 = str20;
                        arrayList2 = arrayList15;
                        zEquals = zEquals;
                        jD4 = jD4;
                        jD2 = jD2;
                        ciuVar = new ciu(strNextText, str15, str16, strE, strE2);
                        j2 = -9223372036854775807L;
                        str = string;
                        arrayList3 = arrayList14;
                        z = z;
                        arrayList4 = arrayList13;
                    } else {
                        if (aty.j(xmlPullParserNewPullParser, "UTCTiming")) {
                            cjhVarW = w(xmlPullParserNewPullParser);
                            str = string;
                            arrayList2 = arrayList15;
                        } else {
                            if (aty.j(xmlPullParserNewPullParser, "Location")) {
                                String strE3 = aty.e(xmlPullParserNewPullParser, "serviceLocation");
                                Uri uri2 = Uri.parse(atv.d(string, i(xmlPullParserNewPullParser, "Location").trim()));
                                str = string;
                                arrayList13.add(strE3 != null ? new cis(uri2, strE3) : new cis(uri2));
                                str2 = str17;
                                str18 = str18;
                                str19 = str19;
                                str20 = str20;
                                arrayList2 = arrayList15;
                                arrayList3 = arrayList14;
                                zEquals = zEquals;
                                j = jN;
                                jD4 = jD4;
                                jD2 = jD2;
                                j2 = -9223372036854775807L;
                                z = z;
                                arrayList4 = arrayList13;
                            } else {
                                str = string;
                                if (aty.j(xmlPullParserNewPullParser, "ServiceDescription")) {
                                    float f = -3.4028235E38f;
                                    float f2 = -3.4028235E38f;
                                    long jE = -9223372036854775807L;
                                    long jE2 = -9223372036854775807L;
                                    long jE3 = -9223372036854775807L;
                                    while (true) {
                                        xmlPullParserNewPullParser.next();
                                        if (aty.j(xmlPullParserNewPullParser, "Latency")) {
                                            jE3 = e(xmlPullParserNewPullParser, "target", -9223372036854775807L);
                                            jE2 = e(xmlPullParserNewPullParser, "min", -9223372036854775807L);
                                            jE = e(xmlPullParserNewPullParser, "max", -9223372036854775807L);
                                        } else {
                                            if (aty.j(xmlPullParserNewPullParser, "PlaybackRate")) {
                                                j16 = jE2;
                                                j17 = jE3;
                                                fS = s(xmlPullParserNewPullParser, "min");
                                                fS2 = s(xmlPullParserNewPullParser, "max");
                                                j18 = jE;
                                            }
                                            if (aty.h(xmlPullParserNewPullParser, "ServiceDescription")) {
                                                break;
                                            }
                                            jE3 = j17;
                                            jE2 = j16;
                                            jE = j18;
                                            f = fS;
                                            f2 = fS2;
                                        }
                                        j16 = jE2;
                                        j17 = jE3;
                                        j18 = jE;
                                        fS = f;
                                        fS2 = f2;
                                        if (aty.h(xmlPullParserNewPullParser, "ServiceDescription")) {
                                            break;
                                            break;
                                        }
                                        jE3 = j17;
                                        jE2 = j16;
                                        jE = j18;
                                        f = fS;
                                        f2 = fS2;
                                    }
                                    str18 = str18;
                                    str19 = str19;
                                    str20 = str20;
                                    arrayList2 = arrayList15;
                                    zEquals = zEquals;
                                    cjfVar = new cjf(j17, j16, j18, fS, fS2);
                                } else if (aty.j(xmlPullParserNewPullParser, "ContentSteering")) {
                                    cinVar = new cin(atv.c(uri.toString(), i(xmlPullParserNewPullParser, "ContentSteering").trim()), l(xmlPullParserNewPullParser, "defaultServiceLocation", new String[0]), k(xmlPullParserNewPullParser, "queryBeforeStart", false));
                                    arrayList2 = arrayList15;
                                } else {
                                    arrayList2 = arrayList15;
                                    if (!aty.j(xmlPullParserNewPullParser, "Period") || z4) {
                                        str2 = str17;
                                        str18 = str18;
                                        str19 = str19;
                                        str20 = str20;
                                        arrayList3 = arrayList14;
                                        zEquals = zEquals;
                                        j = jN;
                                        arrayList2 = arrayList2;
                                        jD4 = jD4;
                                        jD2 = jD2;
                                        j2 = -9223372036854775807L;
                                        z = z;
                                        arrayList4 = arrayList13;
                                        j(xmlPullParserNewPullParser);
                                    } else {
                                        ArrayList arrayList16 = true != arrayList2.isEmpty() ? arrayList2 : arrayList;
                                        String strE4 = aty.e(xmlPullParserNewPullParser, str20);
                                        ArrayList arrayList17 = arrayList14;
                                        long j23 = j22;
                                        long jD6 = d(xmlPullParserNewPullParser, "start", j23);
                                        j22 = j23;
                                        long j24 = jR != -9223372036854775807L ? jR + jD6 : -9223372036854775807L;
                                        long jD7 = d(xmlPullParserNewPullParser, "duration", -9223372036854775807L);
                                        ArrayList arrayList18 = new ArrayList();
                                        ArrayList arrayList19 = new ArrayList();
                                        ArrayList arrayList20 = new ArrayList();
                                        str2 = str17;
                                        ArrayList arrayList21 = new ArrayList();
                                        ArrayList arrayList22 = arrayList19;
                                        ArrayList arrayList23 = arrayList20;
                                        long jN2 = jN;
                                        boolean z5 = false;
                                        long j25 = -9223372036854775807L;
                                        cje cjeVarB = null;
                                        cir cirVarG = null;
                                        while (true) {
                                            xmlPullParserNewPullParser.next();
                                            if (aty.j(xmlPullParserNewPullParser, str19)) {
                                                if (!z5) {
                                                    jN2 = n(xmlPullParserNewPullParser, jN2);
                                                }
                                                arrayList21.addAll(o(xmlPullParserNewPullParser, arrayList16, z));
                                                str18 = str18;
                                                str19 = str19;
                                                str20 = str20;
                                                arrayList6 = arrayList16;
                                                str21 = str21;
                                                arrayList7 = arrayList18;
                                                j = jN;
                                                arrayList2 = arrayList2;
                                                arrayList17 = arrayList17;
                                                arrayList8 = arrayList22;
                                                jD2 = jD2;
                                                j4 = jD7;
                                                cirVar = cirVarG;
                                                jN2 = jN2;
                                                j2 = -9223372036854775807L;
                                                z5 = true;
                                                arrayList5 = arrayList21;
                                                z = z;
                                                zEquals = zEquals;
                                                arrayList4 = arrayList13;
                                                jD4 = jD4;
                                                j3 = j24;
                                            } else {
                                                arrayList5 = arrayList21;
                                                arrayList6 = arrayList16;
                                                ArrayList arrayList24 = arrayList18;
                                                long j26 = jN2;
                                                String str24 = "SupplementalProperty";
                                                if (aty.j(xmlPullParserNewPullParser, "AdaptationSet")) {
                                                    zEquals = zEquals;
                                                    ArrayList arrayList25 = true != arrayList5.isEmpty() ? arrayList5 : arrayList6;
                                                    j = jN;
                                                    long jE4 = e(xmlPullParserNewPullParser, str20, -1L);
                                                    int iQ = q(xmlPullParserNewPullParser);
                                                    String strE5 = aty.e(xmlPullParserNewPullParser, "mimeType");
                                                    String strE6 = aty.e(xmlPullParserNewPullParser, "codecs");
                                                    String strE7 = aty.e(xmlPullParserNewPullParser, "scte214:supplementalCodecs");
                                                    String strE8 = aty.e(xmlPullParserNewPullParser, "scte214:supplementalProfiles");
                                                    String str25 = "SegmentTemplate";
                                                    int iC = c(xmlPullParserNewPullParser, "width", -1);
                                                    int iC2 = c(xmlPullParserNewPullParser, "height", -1);
                                                    float fB = b(xmlPullParserNewPullParser, -1.0f);
                                                    arrayList4 = arrayList13;
                                                    String str26 = "SegmentList";
                                                    int iC3 = c(xmlPullParserNewPullParser, "audioSamplingRate", -1);
                                                    String strE9 = aty.e(xmlPullParserNewPullParser, str21);
                                                    String strE10 = aty.e(xmlPullParserNewPullParser, "label");
                                                    ArrayList arrayList26 = new ArrayList();
                                                    ArrayList arrayList27 = new ArrayList();
                                                    String str27 = "SegmentBase";
                                                    ArrayList arrayList28 = new ArrayList();
                                                    ArrayList arrayList29 = new ArrayList();
                                                    int i9 = iC3;
                                                    ArrayList arrayList30 = new ArrayList();
                                                    float f3 = fB;
                                                    ArrayList arrayList31 = new ArrayList();
                                                    int i10 = iC2;
                                                    ArrayList arrayList32 = new ArrayList();
                                                    int i11 = iC;
                                                    str20 = str20;
                                                    agjz agjzVar2 = new agjz(4);
                                                    ArrayList arrayList33 = new ArrayList();
                                                    ArrayList arrayList34 = new ArrayList();
                                                    ArrayList arrayList35 = arrayList31;
                                                    str18 = str18;
                                                    ArrayList arrayList36 = arrayList32;
                                                    agjz agjzVar3 = agjzVar2;
                                                    long j27 = j25;
                                                    cje cjeVarB2 = cjeVarB;
                                                    long jN3 = j26;
                                                    int iE = iQ;
                                                    String str28 = strE9;
                                                    int iM2 = -1;
                                                    boolean z6 = false;
                                                    String str29 = null;
                                                    while (true) {
                                                        xmlPullParserNewPullParser.next();
                                                        if (aty.j(xmlPullParserNewPullParser, str19)) {
                                                            if (!z6) {
                                                                jN3 = n(xmlPullParserNewPullParser, jN3);
                                                            }
                                                            arrayList34.addAll(o(xmlPullParserNewPullParser, arrayList25, z));
                                                            str28 = str28;
                                                            j11 = jN3;
                                                            z6 = true;
                                                        } else {
                                                            j11 = jN3;
                                                            if (aty.j(xmlPullParserNewPullParser, "ContentProtection")) {
                                                                Pair pairP = p(xmlPullParserNewPullParser);
                                                                if (pairP.first != null) {
                                                                    str29 = (String) pairP.first;
                                                                }
                                                                if (pairP.second != null) {
                                                                    arrayList27.add((brz) pairP.second);
                                                                }
                                                            } else if (aty.j(xmlPullParserNewPullParser, "ContentComponent")) {
                                                                String strE11 = aty.e(xmlPullParserNewPullParser, str21);
                                                                if (str28 == null) {
                                                                    str28 = strE11;
                                                                } else if (strE11 != null) {
                                                                    ahno.O(str28.equals(strE11));
                                                                }
                                                                iE = E(iE, q(xmlPullParserNewPullParser));
                                                            } else {
                                                                if (aty.j(xmlPullParserNewPullParser, "Role")) {
                                                                    arrayList30.add(g(xmlPullParserNewPullParser, "Role"));
                                                                } else {
                                                                    if (aty.j(xmlPullParserNewPullParser, "AudioChannelConfiguration")) {
                                                                        iM2 = m(xmlPullParserNewPullParser, strE6);
                                                                    } else if (aty.j(xmlPullParserNewPullParser, "Accessibility")) {
                                                                        arrayList29.add(g(xmlPullParserNewPullParser, "Accessibility"));
                                                                    } else {
                                                                        str18 = str18;
                                                                        if (aty.j(xmlPullParserNewPullParser, str18)) {
                                                                            arrayList12 = arrayList34;
                                                                            ArrayList arrayList37 = arrayList35;
                                                                            arrayList37.add(g(xmlPullParserNewPullParser, str18));
                                                                            arrayList35 = arrayList37;
                                                                            arrayList36 = arrayList36;
                                                                        } else {
                                                                            arrayList12 = arrayList34;
                                                                            ArrayList arrayList38 = arrayList35;
                                                                            if (aty.j(xmlPullParserNewPullParser, str24)) {
                                                                                ArrayList arrayList39 = arrayList36;
                                                                                arrayList39.add(g(xmlPullParserNewPullParser, str24));
                                                                                arrayList35 = arrayList38;
                                                                                arrayList36 = arrayList39;
                                                                            } else {
                                                                                arrayList29 = arrayList29;
                                                                                ArrayList arrayList40 = arrayList36;
                                                                                str24 = str24;
                                                                                arrayList25 = arrayList25;
                                                                                if (aty.j(xmlPullParserNewPullParser, "ProducerReferenceTime")) {
                                                                                    String str30 = str20;
                                                                                    long jE5 = e(xmlPullParserNewPullParser, str30, -1L);
                                                                                    boolean zK3 = k(xmlPullParserNewPullParser, "inband", false);
                                                                                    String strE12 = aty.e(xmlPullParserNewPullParser, "type");
                                                                                    if (strE12 == null || ahno.ag("encoder", strE12)) {
                                                                                        i6 = 0;
                                                                                    } else if (ahno.ag("captured", strE12)) {
                                                                                        i6 = 1;
                                                                                    } else if (ahno.ag("application", strE12)) {
                                                                                        i6 = 2;
                                                                                    } else {
                                                                                        i6 = 0;
                                                                                    }
                                                                                    String strE13 = aty.e(xmlPullParserNewPullParser, "applicationScheme");
                                                                                    long jR3 = r(xmlPullParserNewPullParser, "wallClockTime");
                                                                                    int i12 = iE;
                                                                                    String str31 = strE6;
                                                                                    long jE6 = e(xmlPullParserNewPullParser, "presentationTime", -9223372036854775807L);
                                                                                    cjh cjhVarW2 = null;
                                                                                    while (true) {
                                                                                        xmlPullParserNewPullParser.next();
                                                                                        if (aty.j(xmlPullParserNewPullParser, "UTCTiming")) {
                                                                                            cjhVarW2 = w(xmlPullParserNewPullParser);
                                                                                        } else {
                                                                                            j(xmlPullParserNewPullParser);
                                                                                        }
                                                                                        cjhVar = cjhVarW2;
                                                                                        if (aty.h(xmlPullParserNewPullParser, "ProducerReferenceTime")) {
                                                                                            break;
                                                                                        }
                                                                                        cjhVarW2 = cjhVar;
                                                                                    }
                                                                                    agjz agjzVar4 = agjzVar3;
                                                                                    agjzVar4.h(new cit(jE5, zK3, i6, strE13, jR3, jE6, cjhVar));
                                                                                    str20 = str30;
                                                                                    str19 = str19;
                                                                                    arrayList35 = arrayList38;
                                                                                    arrayList27 = arrayList27;
                                                                                    arrayList36 = arrayList40;
                                                                                    i4 = i12;
                                                                                    str28 = str28;
                                                                                    arrayList30 = arrayList30;
                                                                                    arrayList2 = arrayList2;
                                                                                    arrayList22 = arrayList22;
                                                                                    jD2 = jD2;
                                                                                    j4 = jD7;
                                                                                    arrayList23 = arrayList23;
                                                                                    str24 = str24;
                                                                                    arrayList25 = arrayList25;
                                                                                    str25 = str25;
                                                                                    arrayList4 = arrayList4;
                                                                                    str26 = str26;
                                                                                    arrayList26 = arrayList26;
                                                                                    i3 = i9;
                                                                                    i10 = i10;
                                                                                    arrayList33 = arrayList33;
                                                                                    str18 = str18;
                                                                                    str21 = str21;
                                                                                    z = z;
                                                                                    agjzVar = agjzVar4;
                                                                                    arrayList17 = arrayList17;
                                                                                    jD4 = jD4;
                                                                                    j12 = j24;
                                                                                    str27 = str27;
                                                                                    i2 = i11;
                                                                                    str10 = str31;
                                                                                    arrayList28 = arrayList28;
                                                                                    j13 = j27;
                                                                                } else {
                                                                                    int i13 = iE;
                                                                                    str10 = strE6;
                                                                                    agjz agjzVar5 = agjzVar3;
                                                                                    str20 = str20;
                                                                                    if (aty.j(xmlPullParserNewPullParser, "Representation")) {
                                                                                        int i14 = i13;
                                                                                        ArrayList arrayList41 = true != arrayList12.isEmpty() ? arrayList12 : arrayList25;
                                                                                        int i15 = i9;
                                                                                        String strE14 = aty.e(xmlPullParserNewPullParser, str20);
                                                                                        agjzVar = agjzVar5;
                                                                                        int iC4 = c(xmlPullParserNewPullParser, "bandwidth", -1);
                                                                                        String strE15 = aty.e(xmlPullParserNewPullParser, "mimeType");
                                                                                        String str32 = strE15 == null ? strE5 : strE15;
                                                                                        String strE16 = aty.e(xmlPullParserNewPullParser, "codecs");
                                                                                        if (strE16 == null) {
                                                                                            strE16 = str10;
                                                                                        }
                                                                                        String strE17 = aty.e(xmlPullParserNewPullParser, "scte214:supplementalCodecs");
                                                                                        String str33 = strE17 == null ? strE7 : strE17;
                                                                                        String strE18 = aty.e(xmlPullParserNewPullParser, "scte214:supplementalProfiles");
                                                                                        String str34 = strE18 == null ? strE8 : strE18;
                                                                                        String str35 = "InbandEventStream";
                                                                                        int i16 = i11;
                                                                                        int iC5 = c(xmlPullParserNewPullParser, "width", i16);
                                                                                        i2 = i16;
                                                                                        int i17 = i10;
                                                                                        int iC6 = c(xmlPullParserNewPullParser, "height", i17);
                                                                                        float f4 = f3;
                                                                                        float fB2 = b(xmlPullParserNewPullParser, f4);
                                                                                        f3 = f4;
                                                                                        i10 = i17;
                                                                                        int iC7 = c(xmlPullParserNewPullParser, "audioSamplingRate", i15);
                                                                                        ArrayList arrayList42 = new ArrayList();
                                                                                        ArrayList arrayList43 = new ArrayList();
                                                                                        ArrayList arrayList44 = new ArrayList(arrayList38);
                                                                                        arrayList35 = arrayList38;
                                                                                        ArrayList arrayList45 = new ArrayList(arrayList40);
                                                                                        ArrayList arrayList46 = arrayList40;
                                                                                        ArrayList arrayList47 = new ArrayList();
                                                                                        ArrayList arrayList48 = arrayList44;
                                                                                        i3 = i15;
                                                                                        str28 = str28;
                                                                                        ArrayList arrayList49 = arrayList30;
                                                                                        int i18 = iM2;
                                                                                        long j28 = j27;
                                                                                        cje cjeVarB3 = cjeVarB2;
                                                                                        long jN4 = j11;
                                                                                        boolean z7 = false;
                                                                                        String str36 = null;
                                                                                        while (true) {
                                                                                            xmlPullParserNewPullParser.next();
                                                                                            if (aty.j(xmlPullParserNewPullParser, str19)) {
                                                                                                if (!z7) {
                                                                                                    jN4 = n(xmlPullParserNewPullParser, jN4);
                                                                                                }
                                                                                                str19 = str19;
                                                                                                arrayList47.addAll(o(xmlPullParserNewPullParser, arrayList41, z));
                                                                                                iM = i18;
                                                                                                z7 = true;
                                                                                            } else {
                                                                                                str19 = str19;
                                                                                                if (aty.j(xmlPullParserNewPullParser, "AudioChannelConfiguration")) {
                                                                                                    iM = m(xmlPullParserNewPullParser, strE16);
                                                                                                } else {
                                                                                                    String str37 = str27;
                                                                                                    if (aty.j(xmlPullParserNewPullParser, str37)) {
                                                                                                        cjeVarB3 = y(xmlPullParserNewPullParser, (cjd) cjeVarB3);
                                                                                                        str20 = str20;
                                                                                                        str27 = str37;
                                                                                                        arrayList27 = arrayList27;
                                                                                                        arrayList2 = arrayList2;
                                                                                                        jD4 = jD4;
                                                                                                        arrayList22 = arrayList22;
                                                                                                        jD2 = jD2;
                                                                                                        j24 = j24;
                                                                                                        arrayList23 = arrayList23;
                                                                                                        str24 = str24;
                                                                                                        arrayList25 = arrayList25;
                                                                                                        str25 = str25;
                                                                                                        arrayList4 = arrayList4;
                                                                                                        str26 = str26;
                                                                                                        i14 = i14;
                                                                                                        f3 = f3;
                                                                                                        str10 = str10;
                                                                                                        str35 = str35;
                                                                                                        i2 = i2;
                                                                                                        arrayList46 = arrayList46;
                                                                                                        arrayList42 = arrayList42;
                                                                                                        iM = i18;
                                                                                                        str11 = strE16;
                                                                                                        str12 = str36;
                                                                                                    } else {
                                                                                                        arrayList47 = arrayList47;
                                                                                                        String str38 = str26;
                                                                                                        if (aty.j(xmlPullParserNewPullParser, str38)) {
                                                                                                            arrayList2 = arrayList2;
                                                                                                            arrayList17 = arrayList17;
                                                                                                            long jN5 = n(xmlPullParserNewPullParser, j28);
                                                                                                            str20 = str20;
                                                                                                            str27 = str37;
                                                                                                            arrayList27 = arrayList27;
                                                                                                            arrayList22 = arrayList22;
                                                                                                            jD2 = jD2;
                                                                                                            long j29 = jD7;
                                                                                                            arrayList23 = arrayList23;
                                                                                                            str24 = str24;
                                                                                                            arrayList25 = arrayList25;
                                                                                                            arrayList4 = arrayList4;
                                                                                                            i14 = i14;
                                                                                                            f3 = f3;
                                                                                                            agjzVar = agjzVar;
                                                                                                            str35 = str35;
                                                                                                            str28 = str28;
                                                                                                            arrayList42 = arrayList42;
                                                                                                            i3 = i3;
                                                                                                            str21 = str21;
                                                                                                            str26 = str38;
                                                                                                            arrayList41 = arrayList41;
                                                                                                            z = z;
                                                                                                            iC6 = iC6;
                                                                                                            str32 = str32;
                                                                                                            arrayList43 = arrayList43;
                                                                                                            arrayList48 = arrayList48;
                                                                                                            str11 = strE16;
                                                                                                            long j30 = j24;
                                                                                                            str10 = str10;
                                                                                                            i2 = i2;
                                                                                                            cjeVarB3 = A(xmlPullParserNewPullParser, (cja) cjeVarB3, j30, j29, jN4, jN5, jD4);
                                                                                                            j14 = j29;
                                                                                                            j28 = jN5;
                                                                                                            j24 = j30;
                                                                                                            str25 = str25;
                                                                                                            jD4 = jD4;
                                                                                                            arrayList46 = arrayList46;
                                                                                                        } else {
                                                                                                            str20 = str20;
                                                                                                            str27 = str37;
                                                                                                            arrayList27 = arrayList27;
                                                                                                            arrayList2 = arrayList2;
                                                                                                            arrayList17 = arrayList17;
                                                                                                            arrayList22 = arrayList22;
                                                                                                            jD2 = jD2;
                                                                                                            arrayList23 = arrayList23;
                                                                                                            str24 = str24;
                                                                                                            arrayList25 = arrayList25;
                                                                                                            arrayList4 = arrayList4;
                                                                                                            i14 = i14;
                                                                                                            f3 = f3;
                                                                                                            str35 = str35;
                                                                                                            arrayList42 = arrayList42;
                                                                                                            str21 = str21;
                                                                                                            str26 = str38;
                                                                                                            arrayList41 = arrayList41;
                                                                                                            z = z;
                                                                                                            String str39 = str25;
                                                                                                            iC6 = iC6;
                                                                                                            str32 = str32;
                                                                                                            arrayList43 = arrayList43;
                                                                                                            arrayList48 = arrayList48;
                                                                                                            str11 = strE16;
                                                                                                            long j31 = jD7;
                                                                                                            agjzVar = agjzVar;
                                                                                                            str28 = str28;
                                                                                                            i3 = i3;
                                                                                                            long j32 = j24;
                                                                                                            str10 = str10;
                                                                                                            long j33 = jD4;
                                                                                                            i2 = i2;
                                                                                                            if (aty.j(xmlPullParserNewPullParser, str39)) {
                                                                                                                long jN6 = n(xmlPullParserNewPullParser, j28);
                                                                                                                str25 = str39;
                                                                                                                long j34 = jN4;
                                                                                                                ArrayList arrayList50 = arrayList46;
                                                                                                                cjeVarB3 = B(xmlPullParserNewPullParser, (cjb) cjeVarB3, arrayList50, j32, j31, j34, jN6, j33);
                                                                                                                arrayList46 = arrayList50;
                                                                                                                j14 = j31;
                                                                                                                jN4 = j34;
                                                                                                                jD4 = j33;
                                                                                                                j24 = j32;
                                                                                                                j28 = jN6;
                                                                                                            } else {
                                                                                                                str25 = str39;
                                                                                                                j24 = j32;
                                                                                                                jD4 = j33;
                                                                                                                arrayList46 = arrayList46;
                                                                                                                if (aty.j(xmlPullParserNewPullParser, "ContentProtection")) {
                                                                                                                    Pair pairP2 = p(xmlPullParserNewPullParser);
                                                                                                                    jD7 = j31;
                                                                                                                    if (pairP2.first != null) {
                                                                                                                        str36 = (String) pairP2.first;
                                                                                                                    }
                                                                                                                    if (pairP2.second != null) {
                                                                                                                        arrayList42.add((brz) pairP2.second);
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    jD7 = j31;
                                                                                                                    if (aty.j(xmlPullParserNewPullParser, str35)) {
                                                                                                                        arrayList43.add(g(xmlPullParserNewPullParser, str35));
                                                                                                                    } else if (aty.j(xmlPullParserNewPullParser, str18)) {
                                                                                                                        arrayList48.add(g(xmlPullParserNewPullParser, str18));
                                                                                                                    } else if (aty.j(xmlPullParserNewPullParser, str24)) {
                                                                                                                        arrayList45.add(g(xmlPullParserNewPullParser, str24));
                                                                                                                    } else {
                                                                                                                        j(xmlPullParserNewPullParser);
                                                                                                                    }
                                                                                                                }
                                                                                                                str12 = str36;
                                                                                                                iM = i18;
                                                                                                            }
                                                                                                        }
                                                                                                        str12 = str36;
                                                                                                        iM = i18;
                                                                                                        jD7 = j14;
                                                                                                    }
                                                                                                }
                                                                                                if (aty.h(xmlPullParserNewPullParser, "Representation")) {
                                                                                                    break;
                                                                                                }
                                                                                                str35 = str35;
                                                                                                arrayList42 = arrayList42;
                                                                                                arrayList43 = arrayList43;
                                                                                                arrayList48 = arrayList48;
                                                                                                z = z;
                                                                                                i2 = i2;
                                                                                                i3 = i3;
                                                                                                str21 = str21;
                                                                                                arrayList41 = arrayList41;
                                                                                                arrayList46 = arrayList46;
                                                                                                arrayList47 = arrayList47;
                                                                                                i18 = iM;
                                                                                                strE16 = str11;
                                                                                                f3 = f3;
                                                                                                str36 = str12;
                                                                                                str19 = str19;
                                                                                                str27 = str27;
                                                                                                str25 = str25;
                                                                                                arrayList27 = arrayList27;
                                                                                                str24 = str24;
                                                                                                arrayList25 = arrayList25;
                                                                                                str32 = str32;
                                                                                                iC6 = iC6;
                                                                                                iC7 = iC7;
                                                                                                str28 = str28;
                                                                                                str20 = str20;
                                                                                                arrayList23 = arrayList23;
                                                                                                i14 = i14;
                                                                                                str10 = str10;
                                                                                                agjzVar = agjzVar;
                                                                                                jD7 = jD7;
                                                                                                j24 = j24;
                                                                                                arrayList17 = arrayList17;
                                                                                                arrayList2 = arrayList2;
                                                                                                arrayList22 = arrayList22;
                                                                                                jD4 = jD4;
                                                                                                str26 = str26;
                                                                                                arrayList4 = arrayList4;
                                                                                                jD2 = jD2;
                                                                                            }
                                                                                            str11 = strE16;
                                                                                            str12 = str36;
                                                                                            if (aty.h(xmlPullParserNewPullParser, "Representation")) {
                                                                                                break;
                                                                                                break;
                                                                                            }
                                                                                            str35 = str35;
                                                                                            arrayList42 = arrayList42;
                                                                                            arrayList43 = arrayList43;
                                                                                            arrayList48 = arrayList48;
                                                                                            z = z;
                                                                                            i2 = i2;
                                                                                            i3 = i3;
                                                                                            str21 = str21;
                                                                                            arrayList41 = arrayList41;
                                                                                            arrayList46 = arrayList46;
                                                                                            arrayList47 = arrayList47;
                                                                                            i18 = iM;
                                                                                            strE16 = str11;
                                                                                            f3 = f3;
                                                                                            str36 = str12;
                                                                                            str19 = str19;
                                                                                            str27 = str27;
                                                                                            str25 = str25;
                                                                                            arrayList27 = arrayList27;
                                                                                            str24 = str24;
                                                                                            arrayList25 = arrayList25;
                                                                                            str32 = str32;
                                                                                            iC6 = iC6;
                                                                                            iC7 = iC7;
                                                                                            str28 = str28;
                                                                                            str20 = str20;
                                                                                            arrayList23 = arrayList23;
                                                                                            i14 = i14;
                                                                                            str10 = str10;
                                                                                            agjzVar = agjzVar;
                                                                                            jD7 = jD7;
                                                                                            j24 = j24;
                                                                                            arrayList17 = arrayList17;
                                                                                            arrayList2 = arrayList2;
                                                                                            arrayList22 = arrayList22;
                                                                                            jD4 = jD4;
                                                                                            str26 = str26;
                                                                                            arrayList4 = arrayList4;
                                                                                            jD2 = jD2;
                                                                                        }
                                                                                        ArrayList arrayList51 = arrayList48;
                                                                                        arrayList30 = arrayList49;
                                                                                        bse bseVarX = x(strE14, str32, iC5, iC6, fB2, iM, iC7, iC4, str28, arrayList30, arrayList29, str11, str33, str34, arrayList51, arrayList45);
                                                                                        cje cjdVar = cjeVarB3 == null ? new cjd(null, 1L, 0L, 0L, 0L) : cjeVarB3;
                                                                                        String str40 = bseVarX.p;
                                                                                        if (str40 != null && bsy.m(str40) && cjdVar.l != j21) {
                                                                                            cjdVar = cjdVar.i();
                                                                                        }
                                                                                        cip cipVar = new cip(bseVarX, true != arrayList47.isEmpty() ? arrayList47 : arrayList41, cjdVar, str12, arrayList42, arrayList43, arrayList51, arrayList45);
                                                                                        int iE2 = E(i14, bsy.b(cipVar.a.q));
                                                                                        arrayList33 = arrayList33;
                                                                                        arrayList33.add(cipVar);
                                                                                        j4 = jD7;
                                                                                        strE7 = strE7;
                                                                                        arrayList36 = arrayList46;
                                                                                        str26 = str26;
                                                                                        str27 = str27;
                                                                                        str25 = str25;
                                                                                        i5 = iE2;
                                                                                        j12 = j24;
                                                                                    } else {
                                                                                        str20 = str20;
                                                                                        str19 = str19;
                                                                                        arrayList35 = arrayList38;
                                                                                        arrayList27 = arrayList27;
                                                                                        str28 = str28;
                                                                                        arrayList30 = arrayList30;
                                                                                        arrayList2 = arrayList2;
                                                                                        jD4 = jD4;
                                                                                        arrayList22 = arrayList22;
                                                                                        jD2 = jD2;
                                                                                        long j35 = j24;
                                                                                        arrayList23 = arrayList23;
                                                                                        str24 = str24;
                                                                                        arrayList25 = arrayList25;
                                                                                        String str41 = str25;
                                                                                        arrayList4 = arrayList4;
                                                                                        String str42 = str26;
                                                                                        i10 = i10;
                                                                                        i2 = i11;
                                                                                        str10 = str10;
                                                                                        arrayList33 = arrayList33;
                                                                                        str21 = str21;
                                                                                        z = z;
                                                                                        arrayList17 = arrayList17;
                                                                                        long j36 = jD7;
                                                                                        str27 = str27;
                                                                                        i3 = i9;
                                                                                        agjzVar = agjzVar5;
                                                                                        if (aty.j(xmlPullParserNewPullParser, str27)) {
                                                                                            cjeVarB2 = y(xmlPullParserNewPullParser, (cjd) cjeVarB2);
                                                                                            String str43 = strE7;
                                                                                            i5 = i13;
                                                                                            strE7 = str43;
                                                                                            j4 = j36;
                                                                                            j12 = j35;
                                                                                            arrayList36 = arrayList40;
                                                                                            str26 = str42;
                                                                                            str25 = str41;
                                                                                        } else {
                                                                                            str26 = str42;
                                                                                            j4 = j36;
                                                                                            if (aty.j(xmlPullParserNewPullParser, str26)) {
                                                                                                long jN7 = n(xmlPullParserNewPullParser, j27);
                                                                                                cjeVarB2 = A(xmlPullParserNewPullParser, (cja) cjeVarB2, j35, j4, j11, jN7, jD4);
                                                                                                j11 = j11;
                                                                                                j4 = j4;
                                                                                                j12 = j35;
                                                                                                String str44 = strE7;
                                                                                                i5 = i13;
                                                                                                strE7 = str44;
                                                                                                str18 = str18;
                                                                                                j27 = jN7;
                                                                                                jD4 = jD4;
                                                                                                arrayList36 = arrayList40;
                                                                                                arrayList26 = arrayList26;
                                                                                                arrayList28 = arrayList28;
                                                                                                str25 = str41;
                                                                                            } else {
                                                                                                j12 = j35;
                                                                                                long j37 = j27;
                                                                                                str25 = str41;
                                                                                                jD4 = jD4;
                                                                                                if (aty.j(xmlPullParserNewPullParser, str25)) {
                                                                                                    long jN8 = n(xmlPullParserNewPullParser, j37);
                                                                                                    cjeVarB2 = B(xmlPullParserNewPullParser, (cjb) cjeVarB2, arrayList40, j12, j4, j11, jN8, jD4);
                                                                                                    arrayList36 = arrayList40;
                                                                                                    j11 = j11;
                                                                                                    String str45 = strE7;
                                                                                                    i5 = i13;
                                                                                                    strE7 = str45;
                                                                                                    str18 = str18;
                                                                                                    j27 = jN8;
                                                                                                    str25 = str25;
                                                                                                    arrayList26 = arrayList26;
                                                                                                    arrayList28 = arrayList28;
                                                                                                } else {
                                                                                                    arrayList36 = arrayList40;
                                                                                                    if (aty.j(xmlPullParserNewPullParser, "InbandEventStream")) {
                                                                                                        str18 = str18;
                                                                                                        arrayList28 = arrayList28;
                                                                                                        arrayList28.add(g(xmlPullParserNewPullParser, "InbandEventStream"));
                                                                                                        i4 = i13;
                                                                                                        j13 = j37;
                                                                                                        arrayList26 = arrayList26;
                                                                                                    } else {
                                                                                                        str18 = str18;
                                                                                                        arrayList28 = arrayList28;
                                                                                                        i4 = i13;
                                                                                                        if (aty.j(xmlPullParserNewPullParser, "Label")) {
                                                                                                            j13 = j37;
                                                                                                            arrayList26 = arrayList26;
                                                                                                            arrayList26.add(new bsg(aty.e(xmlPullParserNewPullParser, str21), i(xmlPullParserNewPullParser, "Label")));
                                                                                                        } else {
                                                                                                            j13 = j37;
                                                                                                            arrayList26 = arrayList26;
                                                                                                            if (aty.i(xmlPullParserNewPullParser)) {
                                                                                                                j(xmlPullParserNewPullParser);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    jD4 = jD4;
                                                                                }
                                                                                j27 = j13;
                                                                                strE7 = strE7;
                                                                                i5 = i4;
                                                                            }
                                                                        }
                                                                        j13 = j27;
                                                                        agjz agjzVar6 = agjzVar3;
                                                                        i4 = iE;
                                                                        j12 = j24;
                                                                        i2 = i11;
                                                                        str10 = strE6;
                                                                        j4 = jD7;
                                                                        i3 = i9;
                                                                        agjzVar = agjzVar6;
                                                                        j27 = j13;
                                                                        strE7 = strE7;
                                                                        i5 = i4;
                                                                    }
                                                                    if (aty.h(xmlPullParserNewPullParser, "AdaptationSet")) {
                                                                        break;
                                                                    }
                                                                    arrayList28 = arrayList28;
                                                                    str24 = str24;
                                                                    arrayList26 = arrayList26;
                                                                    arrayList33 = arrayList33;
                                                                    str27 = str27;
                                                                    str25 = str25;
                                                                    jD4 = jD4;
                                                                    arrayList4 = arrayList4;
                                                                    i11 = i2;
                                                                    i9 = i3;
                                                                    agjzVar3 = agjzVar;
                                                                    arrayList25 = arrayList25;
                                                                    str21 = str21;
                                                                    arrayList17 = arrayList17;
                                                                    arrayList30 = arrayList30;
                                                                    arrayList34 = arrayList12;
                                                                    i10 = i10;
                                                                    jN3 = j11;
                                                                    arrayList36 = arrayList36;
                                                                    arrayList35 = arrayList35;
                                                                    str19 = str19;
                                                                    arrayList2 = arrayList2;
                                                                    arrayList22 = arrayList22;
                                                                    arrayList23 = arrayList23;
                                                                    str26 = str26;
                                                                    jD7 = j4;
                                                                    strE6 = str10;
                                                                    str18 = str18;
                                                                    str28 = str28;
                                                                    arrayList29 = arrayList29;
                                                                    j24 = j12;
                                                                    z = z;
                                                                    jD2 = jD2;
                                                                    iE = i5;
                                                                    strE7 = strE7;
                                                                    arrayList27 = arrayList27;
                                                                }
                                                                str19 = str19;
                                                                arrayList27 = arrayList27;
                                                                str21 = str21;
                                                                arrayList29 = arrayList29;
                                                                str24 = str24;
                                                                str28 = str28;
                                                                arrayList30 = arrayList30;
                                                                arrayList2 = arrayList2;
                                                                arrayList22 = arrayList22;
                                                                jD2 = jD2;
                                                                arrayList23 = arrayList23;
                                                                str25 = str25;
                                                                arrayList4 = arrayList4;
                                                                str26 = str26;
                                                                arrayList26 = arrayList26;
                                                                str27 = str27;
                                                                arrayList36 = arrayList36;
                                                                str18 = str18;
                                                                arrayList35 = arrayList35;
                                                                arrayList12 = arrayList34;
                                                                i10 = i10;
                                                                j13 = j27;
                                                                agjz agjzVar7 = agjzVar3;
                                                                i4 = iE;
                                                                j12 = j24;
                                                                i2 = i11;
                                                                str10 = strE6;
                                                                j4 = jD7;
                                                                i3 = i9;
                                                                agjzVar = agjzVar7;
                                                                j27 = j13;
                                                                strE7 = strE7;
                                                                i5 = i4;
                                                                if (aty.h(xmlPullParserNewPullParser, "AdaptationSet")) {
                                                                    break;
                                                                    break;
                                                                }
                                                                arrayList28 = arrayList28;
                                                                str24 = str24;
                                                                arrayList26 = arrayList26;
                                                                arrayList33 = arrayList33;
                                                                str27 = str27;
                                                                str25 = str25;
                                                                jD4 = jD4;
                                                                arrayList4 = arrayList4;
                                                                i11 = i2;
                                                                i9 = i3;
                                                                agjzVar3 = agjzVar;
                                                                arrayList25 = arrayList25;
                                                                str21 = str21;
                                                                arrayList17 = arrayList17;
                                                                arrayList30 = arrayList30;
                                                                arrayList34 = arrayList12;
                                                                i10 = i10;
                                                                jN3 = j11;
                                                                arrayList36 = arrayList36;
                                                                arrayList35 = arrayList35;
                                                                str19 = str19;
                                                                arrayList2 = arrayList2;
                                                                arrayList22 = arrayList22;
                                                                arrayList23 = arrayList23;
                                                                str26 = str26;
                                                                jD7 = j4;
                                                                strE6 = str10;
                                                                str18 = str18;
                                                                str28 = str28;
                                                                arrayList29 = arrayList29;
                                                                j24 = j12;
                                                                z = z;
                                                                jD2 = jD2;
                                                                iE = i5;
                                                                strE7 = strE7;
                                                                arrayList27 = arrayList27;
                                                            }
                                                            str28 = str28;
                                                        }
                                                        arrayList12 = arrayList34;
                                                        arrayList25 = arrayList25;
                                                        z = z;
                                                        i5 = iE;
                                                        arrayList17 = arrayList17;
                                                        jD4 = jD4;
                                                        j12 = j24;
                                                        i10 = i10;
                                                        i2 = i11;
                                                        arrayList33 = arrayList33;
                                                        str10 = strE6;
                                                        j4 = jD7;
                                                        i3 = i9;
                                                        agjzVar = agjzVar3;
                                                        if (aty.h(xmlPullParserNewPullParser, "AdaptationSet")) {
                                                            break;
                                                            break;
                                                        }
                                                        arrayList28 = arrayList28;
                                                        str24 = str24;
                                                        arrayList26 = arrayList26;
                                                        arrayList33 = arrayList33;
                                                        str27 = str27;
                                                        str25 = str25;
                                                        jD4 = jD4;
                                                        arrayList4 = arrayList4;
                                                        i11 = i2;
                                                        i9 = i3;
                                                        agjzVar3 = agjzVar;
                                                        arrayList25 = arrayList25;
                                                        str21 = str21;
                                                        arrayList17 = arrayList17;
                                                        arrayList30 = arrayList30;
                                                        arrayList34 = arrayList12;
                                                        i10 = i10;
                                                        jN3 = j11;
                                                        arrayList36 = arrayList36;
                                                        arrayList35 = arrayList35;
                                                        str19 = str19;
                                                        arrayList2 = arrayList2;
                                                        arrayList22 = arrayList22;
                                                        arrayList23 = arrayList23;
                                                        str26 = str26;
                                                        jD7 = j4;
                                                        strE6 = str10;
                                                        str18 = str18;
                                                        str28 = str28;
                                                        arrayList29 = arrayList29;
                                                        j24 = j12;
                                                        z = z;
                                                        jD2 = jD2;
                                                        iE = i5;
                                                        strE7 = strE7;
                                                        arrayList27 = arrayList27;
                                                    }
                                                    ArrayList arrayList52 = new ArrayList(arrayList33.size());
                                                    int i19 = 0;
                                                    while (i19 < arrayList33.size()) {
                                                        cip cipVar2 = (cip) arrayList33.get(i19);
                                                        bsd bsdVar = new bsd(cipVar2.a);
                                                        if (strE10 == null || !arrayList26.isEmpty()) {
                                                            str13 = strE10;
                                                            bsdVar.d(arrayList26);
                                                        } else {
                                                            str13 = strE10;
                                                            bsdVar.b = str13;
                                                        }
                                                        String str46 = cipVar2.d;
                                                        if (str46 == null) {
                                                            str46 = str29;
                                                        }
                                                        ArrayList arrayList53 = cipVar2.e;
                                                        ArrayList arrayList54 = arrayList26;
                                                        ArrayList arrayList55 = arrayList27;
                                                        arrayList53.addAll(arrayList55);
                                                        arrayList27 = arrayList55;
                                                        ArrayList arrayList56 = arrayList33;
                                                        if (arrayList53.isEmpty()) {
                                                            i7 = i19;
                                                            strE10 = str13;
                                                            j15 = j12;
                                                        } else {
                                                            int i20 = 0;
                                                            while (true) {
                                                                if (i20 >= arrayList53.size()) {
                                                                    i7 = i19;
                                                                    strE10 = str13;
                                                                    str14 = null;
                                                                    break;
                                                                }
                                                                brz brzVar = (brz) arrayList53.get(i20);
                                                                i7 = i19;
                                                                strE10 = str13;
                                                                if (brt.c.equals(brzVar.a) && (str14 = brzVar.b) != null) {
                                                                    arrayList53.remove(i20);
                                                                    break;
                                                                }
                                                                i20++;
                                                                i19 = i7;
                                                                str13 = strE10;
                                                            }
                                                            if (str14 != null) {
                                                                int i21 = 0;
                                                                while (i21 < arrayList53.size()) {
                                                                    brz brzVar2 = (brz) arrayList53.get(i21);
                                                                    long j38 = j12;
                                                                    if (brt.b.equals(brzVar2.a) && brzVar2.b == null) {
                                                                        arrayList53.set(i21, new brz(brt.c, str14, brzVar2.c, brzVar2.d));
                                                                    }
                                                                    i21++;
                                                                    j12 = j38;
                                                                }
                                                            }
                                                            j15 = j12;
                                                            for (int size = arrayList53.size() - 1; size >= 0; size--) {
                                                                brz brzVar3 = (brz) arrayList53.get(size);
                                                                if (!brzVar3.b()) {
                                                                    for (int i22 = 0; i22 < arrayList53.size(); i22++) {
                                                                        if (((brz) arrayList53.get(i22)).a(brzVar3)) {
                                                                            arrayList53.remove(size);
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            bsdVar.s = new bsa(str46, arrayList53);
                                                        }
                                                        ArrayList arrayList57 = cipVar2.f;
                                                        arrayList57.addAll(arrayList28);
                                                        long j39 = cipVar2.g;
                                                        bse bseVar = new bse(bsdVar);
                                                        agke agkeVar = cipVar2.b;
                                                        cje cjeVar = cipVar2.c;
                                                        List list = cipVar2.h;
                                                        List list2 = cipVar2.i;
                                                        if (cjeVar instanceof cjd) {
                                                            ciwVar = new cix(bseVar, agkeVar, (cjd) cjeVar, arrayList57, null, -1L);
                                                        } else {
                                                            if (!(cjeVar instanceof ciz)) {
                                                                throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
                                                            }
                                                            ciwVar = new ciw(bseVar, agkeVar, (ciz) cjeVar, arrayList57);
                                                        }
                                                        arrayList52.add(ciwVar);
                                                        i19 = i7 + 1;
                                                        j12 = j15;
                                                        arrayList26 = arrayList54;
                                                        arrayList33 = arrayList56;
                                                    }
                                                    arrayList24.add(new cij(jE4, i5, arrayList52, arrayList29, arrayList35, arrayList36, agjzVar.g()));
                                                    arrayList7 = arrayList24;
                                                    j3 = j12;
                                                    arrayList8 = arrayList22;
                                                    arrayList23 = arrayList23;
                                                    j2 = -9223372036854775807L;
                                                } else {
                                                    str18 = str18;
                                                    str19 = str19;
                                                    str20 = str20;
                                                    str21 = str21;
                                                    Object obj3 = "SupplementalProperty";
                                                    zEquals = zEquals;
                                                    j = jN;
                                                    arrayList2 = arrayList2;
                                                    arrayList17 = arrayList17;
                                                    ArrayList arrayList58 = arrayList22;
                                                    jD2 = jD2;
                                                    long j40 = jD7;
                                                    ArrayList arrayList59 = arrayList23;
                                                    arrayList7 = arrayList24;
                                                    z = z;
                                                    arrayList4 = arrayList13;
                                                    jD4 = jD4;
                                                    long j41 = j24;
                                                    if (aty.j(xmlPullParserNewPullParser, "EventStream")) {
                                                        ArrayList arrayList60 = true != arrayList5.isEmpty() ? arrayList5 : arrayList6;
                                                        String str47 = "";
                                                        String str48 = !arrayList60.isEmpty() ? ((cim) arrayList60.get(0)).a : "";
                                                        if (bsc.c(11)) {
                                                            String strH = h(xmlPullParserNewPullParser, "schemeIdUri", "");
                                                            if (strH.equals("urn:mpeg:dash:event:alternativeMPD:insert:2025") || strH.equals("urn:mpeg:dash:event:alternativeMPD:replace:2025") || strH.equals("urn:mpeg:dash:event:alternative:replace:2025")) {
                                                                int i23 = !strH.equals("urn:mpeg:dash:event:alternativeMPD:insert:2025") ? 1 : 0;
                                                                String strH2 = h(xmlPullParserNewPullParser, "value", "");
                                                                long jE7 = e(xmlPullParserNewPullParser, "timescale", 1L);
                                                                long jE8 = e(xmlPullParserNewPullParser, "presentationTimeOffset", j21);
                                                                ArrayList arrayList61 = new ArrayList();
                                                                ArrayList arrayList62 = new ArrayList();
                                                                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(SemanticState.LiveRegion);
                                                                while (true) {
                                                                    xmlPullParserNewPullParser.next();
                                                                    if (aty.j(xmlPullParserNewPullParser, "Event")) {
                                                                        str4 = strH;
                                                                        String str49 = str20;
                                                                        long jE9 = e(xmlPullParserNewPullParser, str49, -1L);
                                                                        if (jE9 == -1) {
                                                                            jE9 = 0;
                                                                        }
                                                                        boolean z8 = i23 == 1 && Objects.equals(h(xmlPullParserNewPullParser, "status", null), "update");
                                                                        j5 = jE8;
                                                                        long jE10 = e(xmlPullParserNewPullParser, "duration", -9223372036854775807L);
                                                                        long j42 = -9223372036854775807L;
                                                                        long jE11 = e(xmlPullParserNewPullParser, "presentationTime", 0L);
                                                                        long jC = bwp.C(jE10, 1000L, jE7);
                                                                        long jC2 = jE10 != -9223372036854775807L ? bwp.C(jE10, 1000000L, jE7) : -9223372036854775807L;
                                                                        long jC3 = bwp.C(jE11 - j5, 1000000L, jE7);
                                                                        String str50 = str47;
                                                                        long j43 = jE7;
                                                                        String str51 = str49;
                                                                        Object obj4 = obj3;
                                                                        String strH3 = h(xmlPullParserNewPullParser, "messageData", null);
                                                                        byteArrayOutputStream2.reset();
                                                                        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                                                                        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream2, StandardCharsets.UTF_8.name());
                                                                        byteArrayOutputStream = byteArrayOutputStream2;
                                                                        String str52 = 1 == i23 ? "ReplacePresentation" : "InsertPresentation";
                                                                        ArrayList arrayList63 = new ArrayList();
                                                                        xmlPullParserNewPullParser.nextToken();
                                                                        str3 = str48;
                                                                        cik cikVar2 = null;
                                                                        boolean z9 = false;
                                                                        int i24 = 0;
                                                                        boolean z10 = false;
                                                                        while (true) {
                                                                            i23 = i23;
                                                                            if (i24 <= 0) {
                                                                                j7 = j43;
                                                                                if (aty.h(xmlPullParserNewPullParser, "Event")) {
                                                                                    break;
                                                                                }
                                                                                j8 = jE9;
                                                                            } else {
                                                                                j7 = j43;
                                                                                j8 = jE9;
                                                                            }
                                                                            G(xmlPullParserNewPullParser, xmlSerializerNewSerializer);
                                                                            cik cikVar3 = cikVar2;
                                                                            int eventType = xmlPullParserNewPullParser.getEventType();
                                                                            XmlSerializer xmlSerializer = xmlSerializerNewSerializer;
                                                                            if (eventType == 2) {
                                                                                int i25 = i24 + 1;
                                                                                if (i25 != 1) {
                                                                                    z2 = z10;
                                                                                    i = 2;
                                                                                } else if (z10) {
                                                                                    i25 = 1;
                                                                                    i = 2;
                                                                                    z2 = true;
                                                                                } else if (xmlPullParserNewPullParser.getName().equals(str52)) {
                                                                                    String name = xmlPullParserNewPullParser.getName();
                                                                                    jC2 = jC2;
                                                                                    String strH4 = h(xmlPullParserNewPullParser, "uri", null);
                                                                                    if (TextUtils.isEmpty(strH4)) {
                                                                                        bvx.e("MpdParser", a.bT(name, "Skipping ", " without uri"));
                                                                                        arrayList11 = arrayList63;
                                                                                        i23 = i23;
                                                                                        j7 = j7;
                                                                                        cikVar = null;
                                                                                        jC3 = jC3;
                                                                                    } else {
                                                                                        String strE19 = aty.e(xmlPullParserNewPullParser, "earliestResolutionTimeOffset");
                                                                                        double d2 = strE19 == null ? Double.NaN : Double.parseDouble(strE19);
                                                                                        if (Double.isNaN(d2)) {
                                                                                            j9 = j7;
                                                                                            jC3 = jC3;
                                                                                            jRound = 60000000;
                                                                                        } else if (d2 < 0.0d) {
                                                                                            long j44 = jC3;
                                                                                            jRound = 60000000;
                                                                                            j9 = j7;
                                                                                            jC3 = j44;
                                                                                        } else {
                                                                                            double d3 = d2 * 1000000.0d;
                                                                                            j9 = j7;
                                                                                            jC3 = jC3;
                                                                                            jRound = Math.round(d3 / j9);
                                                                                        }
                                                                                        j7 = j9;
                                                                                        String strH5 = h(xmlPullParserNewPullParser, "serviceDescriptionId", null);
                                                                                        ArrayList arrayList64 = arrayList63;
                                                                                        long j45 = j42;
                                                                                        long jE12 = e(xmlPullParserNewPullParser, "maxDuration", j45);
                                                                                        long jC4 = (jE12 == j45 || jE12 == 2251799813685247L) ? -9223372036854775807L : bwp.C(jE12, 1000000L, j7);
                                                                                        arrayList11 = arrayList64;
                                                                                        boolean zK4 = k(xmlPullParserNewPullParser, "executeOnce", false);
                                                                                        int iC8 = c(xmlPullParserNewPullParser, "noJump", 0);
                                                                                        if (iC8 != 0 && iC8 != 1 && iC8 != 2) {
                                                                                            bvx.e("MpdParser", a.bR(iC8, "Ignoring unknown noJump mode: "));
                                                                                            iC8 = 0;
                                                                                        }
                                                                                        long jD8 = d(xmlPullParserNewPullParser, "skipAfter", 0L);
                                                                                        long jY = jD8 > 0 ? bwp.y(jD8) : 0L;
                                                                                        i23 = i23;
                                                                                        if (i23 == 1) {
                                                                                            long jE13 = e(xmlPullParserNewPullParser, "returnOffset", -9223372036854775807L);
                                                                                            long jC5 = jE13 != -9223372036854775807L ? bwp.C(jE13, 1000000L, j7) : -9223372036854775807L;
                                                                                            zK2 = k(xmlPullParserNewPullParser, "clip", true);
                                                                                            zK = aty.e(xmlPullParserNewPullParser, "startWithOffset") != null ? k(xmlPullParserNewPullParser, "startWithOffset", false) : k(xmlPullParserNewPullParser, "startAtOffset", false);
                                                                                            j10 = jC5;
                                                                                        } else {
                                                                                            j7 = j7;
                                                                                            zK = false;
                                                                                            zK2 = true;
                                                                                            j10 = -9223372036854775807L;
                                                                                        }
                                                                                        String str53 = str3;
                                                                                        str3 = str53;
                                                                                        cikVar = new cik(i23, j8, atv.c(str53, strH4));
                                                                                        cikVar.h = jRound;
                                                                                        cikVar.i = strH5;
                                                                                        cikVar.j = jC4;
                                                                                        cikVar.k = zK4;
                                                                                        cikVar.l = iC8;
                                                                                        cikVar.m = jY;
                                                                                        cikVar.o = j10;
                                                                                        cikVar.p = zK2;
                                                                                        cikVar.q = zK;
                                                                                    }
                                                                                    str9 = str50;
                                                                                    cikVar2 = cikVar;
                                                                                    obj2 = obj4;
                                                                                    i24 = i25;
                                                                                    arrayList10 = arrayList11;
                                                                                    str8 = str51;
                                                                                    z9 = true;
                                                                                    z10 = true;
                                                                                } else {
                                                                                    i25 = 1;
                                                                                    i = 2;
                                                                                    z2 = false;
                                                                                }
                                                                                if (i25 != i) {
                                                                                    str9 = str50;
                                                                                    obj2 = obj4;
                                                                                    arrayList10 = arrayList63;
                                                                                    str8 = str51;
                                                                                    z10 = z2;
                                                                                    cikVar2 = cikVar3;
                                                                                    i24 = i25;
                                                                                } else if (z9) {
                                                                                    obj2 = obj4;
                                                                                    if (xmlPullParserNewPullParser.getName().equals(obj2)) {
                                                                                        str9 = str50;
                                                                                        str8 = str51;
                                                                                        arrayList10 = arrayList63;
                                                                                        arrayList10.add(new cir(h(xmlPullParserNewPullParser, "schemeIdUri", str9), h(xmlPullParserNewPullParser, "value", null), h(xmlPullParserNewPullParser, str8, null)));
                                                                                    } else {
                                                                                        str9 = str50;
                                                                                        arrayList10 = arrayList63;
                                                                                        str8 = str51;
                                                                                    }
                                                                                    z10 = z2;
                                                                                    cikVar2 = cikVar3;
                                                                                    i24 = i25;
                                                                                    z9 = true;
                                                                                } else {
                                                                                    str9 = str50;
                                                                                    obj2 = obj4;
                                                                                    arrayList10 = arrayList63;
                                                                                    str8 = str51;
                                                                                    z10 = z2;
                                                                                    cikVar2 = cikVar3;
                                                                                    i24 = i25;
                                                                                    z9 = false;
                                                                                }
                                                                            } else {
                                                                                arrayList62 = arrayList62;
                                                                                jC2 = jC2;
                                                                                str52 = str52;
                                                                                i23 = i23;
                                                                                j7 = j7;
                                                                                str8 = str51;
                                                                                str9 = str50;
                                                                                strH2 = strH2;
                                                                                arrayList10 = arrayList63;
                                                                                jC3 = jC3;
                                                                                obj2 = obj4;
                                                                                if (eventType == 3) {
                                                                                    int i26 = i24;
                                                                                    i24 = i26 - 1;
                                                                                    z9 = i26 == 1 ? false : z9;
                                                                                }
                                                                                cikVar2 = cikVar3;
                                                                            }
                                                                            xmlPullParserNewPullParser.nextToken();
                                                                            long j46 = j8;
                                                                            z8 = z8;
                                                                            jE9 = j46;
                                                                            obj4 = obj2;
                                                                            str50 = str9;
                                                                            arrayList63 = arrayList10;
                                                                            str51 = str8;
                                                                            xmlSerializerNewSerializer = xmlSerializer;
                                                                            j43 = j7;
                                                                            strH2 = strH2;
                                                                            jC3 = jC3;
                                                                            jC2 = jC2;
                                                                            arrayList62 = arrayList62;
                                                                            str52 = str52;
                                                                            j42 = -9223372036854775807L;
                                                                        }
                                                                        xmlSerializerNewSerializer.flush();
                                                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                                        if (strH3 != null) {
                                                                            byteArray = bwp.ah(strH3);
                                                                        }
                                                                        String str54 = strH2;
                                                                        Pair pairCreate3 = Pair.create(Long.valueOf(jC3), new cxt(str4, strH2, jC, jE9, byteArray));
                                                                        if (jE9 == -1) {
                                                                            bvx.e("MpdParser", "Skipping AlternativeMpdEvent without id");
                                                                            pairCreate2 = Pair.create(pairCreate3, null);
                                                                        } else if (!z10) {
                                                                            bvx.e("MpdParser", "Skipping AlternativeMpdEvent without ".concat(str52));
                                                                            pairCreate2 = Pair.create(pairCreate3, null);
                                                                        } else if (cikVar2 == null) {
                                                                            pairCreate2 = Pair.create(pairCreate3, null);
                                                                        } else {
                                                                            cikVar2.c = z8;
                                                                            cikVar2.a(str54);
                                                                            cikVar2.e = jC3;
                                                                            cikVar2.f = jC2;
                                                                            cikVar2.b(arrayList63);
                                                                            pairCreate2 = Pair.create(pairCreate3, new cil(cikVar2));
                                                                        }
                                                                        arrayList61.add((Pair) pairCreate2.first);
                                                                        if (pairCreate2.second != null) {
                                                                            arrayList62.add((cil) pairCreate2.second);
                                                                        }
                                                                        str7 = str50;
                                                                        arrayList9 = arrayList62;
                                                                        i23 = i23;
                                                                        j6 = j7;
                                                                        str6 = str51;
                                                                        str5 = str54;
                                                                        obj = obj4;
                                                                    } else {
                                                                        str3 = str48;
                                                                        str4 = strH;
                                                                        arrayList9 = arrayList62;
                                                                        byteArrayOutputStream = byteArrayOutputStream2;
                                                                        j5 = jE8;
                                                                        str5 = strH2;
                                                                        j6 = jE7;
                                                                        str6 = str20;
                                                                        str7 = str47;
                                                                        obj = obj3;
                                                                        j(xmlPullParserNewPullParser);
                                                                    }
                                                                    if (aty.h(xmlPullParserNewPullParser, "EventStream")) {
                                                                        break;
                                                                    }
                                                                    obj3 = obj;
                                                                    str47 = str7;
                                                                    str20 = str6;
                                                                    jE8 = j5;
                                                                    arrayList7 = arrayList7;
                                                                    strH = str4;
                                                                    jE7 = j6;
                                                                    j40 = j40;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream;
                                                                    str48 = str3;
                                                                    strH2 = str5;
                                                                    arrayList62 = arrayList9;
                                                                }
                                                                long[] jArr = new long[arrayList61.size()];
                                                                cxt[] cxtVarArr = new cxt[arrayList61.size()];
                                                                for (int i27 = 0; i27 < arrayList61.size(); i27++) {
                                                                    Pair pair = (Pair) arrayList61.get(i27);
                                                                    jArr[i27] = ((Long) pair.first).longValue();
                                                                    cxtVarArr[i27] = (cxt) pair.second;
                                                                }
                                                                pairCreate = Pair.create(new dep(str4, str5, jArr, cxtVarArr), arrayList9);
                                                            } else {
                                                                pairCreate = Pair.create(C(xmlPullParserNewPullParser), agpi.a);
                                                            }
                                                            arrayList8 = arrayList58;
                                                            arrayList8.add((dep) pairCreate.first);
                                                            arrayList59.addAll((Collection) pairCreate.second);
                                                            arrayList23 = arrayList59;
                                                            str20 = str6;
                                                            j3 = j41;
                                                            j4 = j40;
                                                            j2 = -9223372036854775807L;
                                                            j21 = 0;
                                                        } else {
                                                            pairCreate = Pair.create(C(xmlPullParserNewPullParser), agpi.a);
                                                        }
                                                        arrayList7 = arrayList7;
                                                        j40 = j40;
                                                        str6 = str20;
                                                        arrayList8 = arrayList58;
                                                        arrayList8.add((dep) pairCreate.first);
                                                        arrayList59.addAll((Collection) pairCreate.second);
                                                        arrayList23 = arrayList59;
                                                        str20 = str6;
                                                        j3 = j41;
                                                        j4 = j40;
                                                        j2 = -9223372036854775807L;
                                                        j21 = 0;
                                                    } else {
                                                        arrayList7 = arrayList7;
                                                        arrayList8 = arrayList58;
                                                        if (aty.j(xmlPullParserNewPullParser, "SegmentBase")) {
                                                            cjeVarB = y(xmlPullParserNewPullParser, null);
                                                            arrayList23 = arrayList59;
                                                            j3 = j41;
                                                            cirVar = cirVarG;
                                                            jN2 = j26;
                                                            j4 = j40;
                                                            j2 = -9223372036854775807L;
                                                            j21 = 0;
                                                        } else if (aty.j(xmlPullParserNewPullParser, "SegmentList")) {
                                                            long jN9 = n(xmlPullParserNewPullParser, -9223372036854775807L);
                                                            arrayList23 = arrayList59;
                                                            j2 = -9223372036854775807L;
                                                            j21 = 0;
                                                            cjeVarB = A(xmlPullParserNewPullParser, null, j41, j40, j26, jN9, jD4);
                                                            jD4 = jD4;
                                                            j4 = j40;
                                                            j3 = j41;
                                                            j25 = jN9;
                                                        } else {
                                                            arrayList23 = arrayList59;
                                                            j3 = j41;
                                                            j2 = -9223372036854775807L;
                                                            j21 = 0;
                                                            if (aty.j(xmlPullParserNewPullParser, "SegmentTemplate")) {
                                                                j4 = j40;
                                                                long jN10 = n(xmlPullParserNewPullParser, -9223372036854775807L);
                                                                cjeVarB = B(xmlPullParserNewPullParser, null, agpi.a, j3, j4, j26, jN10, jD4);
                                                                j25 = jN10;
                                                            } else if (aty.j(xmlPullParserNewPullParser, "AssetIdentifier")) {
                                                                j4 = j40;
                                                                cirVarG = g(xmlPullParserNewPullParser, "AssetIdentifier");
                                                            } else {
                                                                j4 = j40;
                                                                j(xmlPullParserNewPullParser);
                                                            }
                                                        }
                                                    }
                                                }
                                                cirVar = cirVarG;
                                                jN2 = j26;
                                            }
                                            if (aty.h(xmlPullParserNewPullParser, "Period")) {
                                                Pair pairCreate4 = Pair.create(new aesh(strE4, jD6, arrayList7, arrayList8, cirVar, arrayList23), Long.valueOf(j4));
                                                aesh aeshVar = (aesh) pairCreate4.first;
                                                long j47 = aeshVar.a;
                                                if (j47 != j2) {
                                                    long jLongValue = ((Long) pairCreate4.second).longValue();
                                                    long j48 = jLongValue == j2 ? j2 : j47 + jLongValue;
                                                    arrayList3 = arrayList17;
                                                    arrayList3.add(aeshVar);
                                                    j22 = j48;
                                                    break;
                                                }
                                                if (zEquals) {
                                                    arrayList3 = arrayList17;
                                                    z4 = true;
                                                    break;
                                                }
                                                throw new bsz("Unable to determine start of period " + arrayList17.size(), null, true, 4);
                                            }
                                            j24 = j3;
                                            jD4 = jD4;
                                            z = z;
                                            arrayList13 = arrayList4;
                                            jD2 = jD2;
                                            cirVarG = cirVar;
                                            arrayList21 = arrayList5;
                                            zEquals = zEquals;
                                            arrayList16 = arrayList6;
                                            arrayList18 = arrayList7;
                                            str21 = str21;
                                            str18 = str18;
                                            arrayList17 = arrayList17;
                                            str19 = str19;
                                            arrayList2 = arrayList2;
                                            arrayList22 = arrayList8;
                                            jD7 = j4;
                                            jN = j;
                                            str20 = str20;
                                        }
                                    }
                                }
                                j2 = -9223372036854775807L;
                            }
                            str17 = str2;
                            jN = j;
                        }
                        j2 = -9223372036854775807L;
                    }
                    if (aty.h(xmlPullParserNewPullParser, str17)) {
                        if (jD == j2) {
                            j19 = jD;
                        } else if (j22 != j2) {
                            j19 = j22;
                        } else {
                            if (zEquals) {
                                throw new bsz("Unable to determine duration of static manifest.", null, true, 4);
                            }
                            j19 = j2;
                        }
                        if (arrayList3.isEmpty()) {
                            throw new bsz("No periods found.", null, true, 4);
                        }
                        return new cio(jR, j19, jD2, zEquals, jD3, jD4, jD5, jR2, ciuVar, cjhVarW, cjfVar, arrayList3, arrayList4, cinVar);
                    }
                    arrayList14 = arrayList3;
                    str17 = str17;
                    jD4 = jD4;
                    arrayListS = arrayList;
                    string = str;
                    str18 = str18;
                    str20 = str20;
                    str19 = str19;
                    arrayList15 = arrayList2;
                    jR2 = jR2;
                    jD3 = jD3;
                    z = z;
                    arrayList13 = arrayList4;
                    jD2 = jD2;
                    zEquals = zEquals;
                }
                arrayList3 = arrayList14;
                z = z;
                arrayList4 = arrayList13;
                if (aty.h(xmlPullParserNewPullParser, str17)) {
                    if (jD == j2) {
                        j19 = jD;
                    } else if (j22 != j2) {
                        j19 = j22;
                    } else {
                        if (zEquals) {
                            throw new bsz("Unable to determine duration of static manifest.", null, true, 4);
                        }
                        j19 = j2;
                    }
                    if (arrayList3.isEmpty()) {
                        return new cio(jR, j19, jD2, zEquals, jD3, jD4, jD5, jR2, ciuVar, cjhVarW, cjfVar, arrayList3, arrayList4, cinVar);
                    }
                    throw new bsz("No periods found.", null, true, 4);
                }
                arrayList14 = arrayList3;
                str17 = str17;
                jD4 = jD4;
                arrayListS = arrayList;
                string = str;
                str18 = str18;
                str20 = str20;
                str19 = str19;
                arrayList15 = arrayList2;
                jR2 = jR2;
                jD3 = jD3;
                z = z;
                arrayList13 = arrayList4;
                jD2 = jD2;
                zEquals = zEquals;
            }
        } catch (XmlPullParserException e2) {
            if (e2.getDetail() instanceof IOException) {
                throw ((IOException) e2.getDetail());
            }
            throw new bsz(null, e2, true, 4);
        }
    }
}
