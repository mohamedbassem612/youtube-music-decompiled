package defpackage;

import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cwl {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static axmq a(String str) {
        long j;
        agke agkeVarR;
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new StringReader(str));
            xmlPullParserNewPullParser.next();
            if (!aty.j(xmlPullParserNewPullParser, "x:xmpmeta")) {
                throw new bsz("Couldn't find xmp metadata", null, true, 1);
            }
            agke agkeVar = agpi.a;
            agke agkeVarB = agkeVar;
            long j2 = -9223372036854775807L;
            do {
                xmlPullParserNewPullParser.next();
                if (aty.j(xmlPullParserNewPullParser, "rdf:Description")) {
                    String[] strArr = a;
                    int i = 0;
                    for (int i2 = 0; i2 < 4; i2++) {
                        String strE = aty.e(xmlPullParserNewPullParser, strArr[i2]);
                        if (strE != null) {
                            if (Integer.parseInt(strE) != 1) {
                                return null;
                            }
                            String[] strArr2 = b;
                            int i3 = 0;
                            while (true) {
                                if (i3 < 4) {
                                    String strE2 = aty.e(xmlPullParserNewPullParser, strArr2[i3]);
                                    if (strE2 != null) {
                                        j = Long.parseLong(strE2);
                                        if (j != -1) {
                                            break;
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                                j = -9223372036854775807L;
                                break;
                            }
                            String[] strArr3 = c;
                            while (true) {
                                if (i >= 2) {
                                    agkeVarR = agkeVar;
                                    break;
                                }
                                String strE3 = aty.e(xmlPullParserNewPullParser, strArr3[i]);
                                if (strE3 != null) {
                                    agkeVarR = agke.r(new aawx("image/jpeg", 0L, 0L), new aawx("video/mp4", Long.parseLong(strE3), 0L));
                                    break;
                                }
                                i++;
                            }
                            long j3 = j;
                            agkeVarB = agkeVarR;
                            j2 = j3;
                        }
                    }
                    return null;
                }
                if (aty.j(xmlPullParserNewPullParser, "Container:Directory")) {
                    agkeVarB = b(xmlPullParserNewPullParser, "Container", "Item");
                } else if (aty.j(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    agkeVarB = b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                }
            } while (!aty.h(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (agkeVarB.isEmpty()) {
                return null;
            }
            return new axmq(j2, agkeVarB, null);
        } catch (bsz | NumberFormatException | XmlPullParserException unused) {
            bvx.e("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static agke b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        agjz agjzVar = new agjz(4);
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (aty.j(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strE = aty.e(xmlPullParser, strConcat2);
                String strE2 = aty.e(xmlPullParser, strConcat3);
                String strE3 = aty.e(xmlPullParser, strConcat4);
                String strE4 = aty.e(xmlPullParser, strConcat5);
                if (strE == null || strE2 == null) {
                    return agpi.a;
                }
                agjzVar.h(new aawx(strE, strE3 != null ? Long.parseLong(strE3) : 0L, strE4 != null ? Long.parseLong(strE4) : 0L));
            }
        } while (!aty.h(xmlPullParser, str.concat(":Directory")));
        return agjzVar.g();
    }
}
