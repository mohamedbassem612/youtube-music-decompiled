package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.car.app.model.Alert;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.TimeConversions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aun {
    public static float b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return j(xmlPullParser, str) ? typedArray.getFloat(i, f) : f;
    }

    public static int c(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId == 0 ? i2 : i;
    }

    public static int d(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return j(xmlPullParser, str) ? typedArray.getInt(i, i2) : i2;
    }

    public static int e(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public static TypedArray f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static CharSequence g(TypedArray typedArray, int i, int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    public static String h(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static boolean i(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    public static boolean j(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static CharSequence[] k(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    public static int l(TypedArray typedArray, int i, int i2) {
        return typedArray.getInt(i, typedArray.getInt(i2, Alert.DURATION_SHOW_INDEFINITELY));
    }

    public static int m(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (j(xmlPullParser, str)) {
            return typedArray.getColor(i, 0);
        }
        return 0;
    }

    public static String n(String str) {
        return str.replace('-', '+').replace('_', '/');
    }

    public static byi o(ciy ciyVar, cim cimVar, civ civVar, int i, Map map) {
        byh byhVar = new byh();
        byhVar.a = civVar.a(cimVar.a);
        byhVar.c = cimVar.b;
        byhVar.g = civVar.a;
        byhVar.h = civVar.b;
        String strM = ciyVar.m();
        if (strM == null) {
            strM = civVar.a(((cim) ciyVar.d.get(0)).a).toString();
        }
        byhVar.i = strM;
        byhVar.j = i;
        byhVar.f = map;
        return byhVar.a();
    }

    public static yre p(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        yre yreVar;
        float f;
        Shader radialGradient;
        if (j(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return new yre(null, null, typedValue.data);
            }
            Resources resources = typedArray.getResources();
            try {
                XmlResourceParser xml = resources.getXml(typedArray.getResourceId(i, 0));
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    int next = xml.next();
                    if (next == 2) {
                        String name = xml.getName();
                        int iHashCode = name.hashCode();
                        if (iHashCode != 89650992) {
                            if (iHashCode == 1191572447 && name.equals("selector")) {
                                ColorStateList colorStateListB = avn.b(resources, xml, attributeSetAsAttributeSet, theme);
                                yreVar = new yre(null, colorStateListB, colorStateListB.getDefaultColor());
                                break;
                            }
                            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
                        }
                        if (name.equals("gradient")) {
                            String name2 = xml.getName();
                            if (!name2.equals("gradient")) {
                                throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
                            }
                            TypedArray typedArrayF = f(resources, theme, attributeSetAsAttributeSet, asz.e);
                            float fB = b(typedArrayF, xml, "startX", 8, 0.0f);
                            float fB2 = b(typedArrayF, xml, "startY", 9, 0.0f);
                            float fB3 = b(typedArrayF, xml, "endX", 10, 0.0f);
                            float fB4 = b(typedArrayF, xml, "endY", 11, 0.0f);
                            float fB5 = b(typedArrayF, xml, "centerX", 3, 0.0f);
                            float fB6 = b(typedArrayF, xml, "centerY", 4, 0.0f);
                            int iD = d(typedArrayF, xml, "type", 2, 0);
                            int iM = m(typedArrayF, xml, "startColor", 0);
                            boolean zJ = j(xml, "centerColor");
                            int iM2 = m(typedArrayF, xml, "centerColor", 7);
                            int iM3 = m(typedArrayF, xml, "endColor", 1);
                            int i2 = 1;
                            int iD2 = d(typedArrayF, xml, "tileMode", 6, 0);
                            float fB7 = b(typedArrayF, xml, "gradientRadius", 5, 0.0f);
                            typedArrayF.recycle();
                            int depth = xml.getDepth() + 1;
                            ArrayList arrayList = new ArrayList(20);
                            ArrayList arrayList2 = new ArrayList(20);
                            while (true) {
                                int next2 = xml.next();
                                XmlResourceParser xmlResourceParser = xml;
                                if (next2 == i2) {
                                    f = fB;
                                    break;
                                }
                                int depth2 = xmlResourceParser.getDepth();
                                f = fB;
                                if (depth2 < depth && next2 == 3) {
                                    break;
                                }
                                if (next2 == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                                    TypedArray typedArrayF2 = f(resources, theme, attributeSetAsAttributeSet, asz.f);
                                    boolean zHasValue = typedArrayF2.hasValue(0);
                                    boolean zHasValue2 = typedArrayF2.hasValue(1);
                                    if (!zHasValue || !zHasValue2) {
                                        throw new XmlPullParserException(String.valueOf(xmlResourceParser.getPositionDescription()).concat(": <item> tag requires a 'color' attribute and a 'offset' attribute!"));
                                    }
                                    int color = typedArrayF2.getColor(0, 0);
                                    float f2 = typedArrayF2.getFloat(1, 0.0f);
                                    typedArrayF2.recycle();
                                    arrayList2.add(Integer.valueOf(color));
                                    arrayList.add(Float.valueOf(f2));
                                }
                                xml = xmlResourceParser;
                                fB = f;
                                i2 = 1;
                            }
                            eol eolVar = arrayList2.size() > 0 ? new eol((List) arrayList2, (List) arrayList) : null;
                            if (eolVar == null) {
                                eolVar = zJ ? new eol(iM, iM2, iM3) : new eol(iM, iM3);
                            }
                            if (iD != 1) {
                                if (iD != 2) {
                                    radialGradient = new LinearGradient(f, fB2, fB3, fB4, (int[]) eolVar.b, (float[]) eolVar.a, auc.c(iD2));
                                } else {
                                    radialGradient = new SweepGradient(fB5, fB6, (int[]) eolVar.b, (float[]) eolVar.a);
                                }
                            } else {
                                if (fB7 <= 0.0f) {
                                    throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                                }
                                radialGradient = new RadialGradient(fB5, fB6, fB7, (int[]) eolVar.b, (float[]) eolVar.a, auc.c(iD2));
                            }
                            yreVar = new yre(radialGradient, null, 0);
                            break;
                        }
                        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
                    }
                    if (next == 1) {
                        throw new XmlPullParserException("No start tag found");
                    }
                }
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                yreVar = null;
            }
            if (yreVar != null) {
                return yreVar;
            }
        }
        return new yre(null, null, 0);
    }

    private static Notification.Metric.MetricValue q(auk aukVar) {
        Notification.Metric.TimeDifference timeDifferenceForPausedStopwatch;
        if (!(aukVar instanceof aul)) {
            if (aukVar instanceof auf) {
                auf aufVar = (auf) aukVar;
                LocalDate localDate = aufVar.a;
                return new Notification.Metric.FixedDate(TimeConversions.convert(localDate), aufVar.b);
            }
            if (aukVar instanceof aug) {
                aug augVar = (aug) aukVar;
                return new Notification.Metric.FixedFloat(augVar.a, augVar.b, augVar.c, augVar.d);
            }
            if (aukVar instanceof auh) {
                auh auhVar = (auh) aukVar;
                return new Notification.Metric.FixedInt(auhVar.a, auhVar.b);
            }
            if (aukVar instanceof aui) {
                aui auiVar = (aui) aukVar;
                return new Notification.Metric.FixedText(auiVar.a, auiVar.b);
            }
            if (aukVar instanceof auj) {
                return new Notification.Metric.FixedTime(TimeConversions.convert(((auj) aukVar).a));
            }
            Objects.toString(aukVar);
            throw new IllegalArgumentException("Unexpected MetricValue: ".concat(aukVar.toString()));
        }
        aul aulVar = (aul) aukVar;
        Instant instant = aulVar.a;
        if (instant == null) {
            Long l = aulVar.b;
            if (l == null) {
                Duration duration = aulVar.c;
                if (duration == null) {
                    Objects.toString(aulVar);
                    throw new IllegalArgumentException("Unexpected TimeDifference: ".concat(aulVar.toString()));
                }
                if (aulVar.d) {
                    timeDifferenceForPausedStopwatch = Notification.Metric.TimeDifference.forPausedTimer(TimeConversions.convert(duration), aulVar.e);
                } else {
                    timeDifferenceForPausedStopwatch = Notification.Metric.TimeDifference.forPausedStopwatch(TimeConversions.convert(duration), aulVar.e);
                }
            } else if (aulVar.d) {
                timeDifferenceForPausedStopwatch = Notification.Metric.TimeDifference.forTimer(l.longValue(), aulVar.e);
            } else {
                timeDifferenceForPausedStopwatch = Notification.Metric.TimeDifference.forStopwatch(l.longValue(), aulVar.e);
            }
        } else if (aulVar.d) {
            timeDifferenceForPausedStopwatch = Notification.Metric.TimeDifference.forTimer(TimeConversions.convert(instant), aulVar.e);
        } else {
            timeDifferenceForPausedStopwatch = Notification.Metric.TimeDifference.forStopwatch(TimeConversions.convert(instant), aulVar.e);
        }
        return (Notification.Metric.MetricValue) timeDifferenceForPausedStopwatch;
    }

    private static Notification.Metric r(aum aumVar) {
        return new Notification.Metric(q(aumVar.a), aumVar.b, aumVar.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Notification.Style s(auo auoVar) {
        Notification.Style metricStyle = new Notification.MetricStyle();
        Iterator it = auoVar.e().iterator();
        while (it.hasNext()) {
            metricStyle.addMetric(r((aum) it.next()));
        }
        List listE = auoVar.e();
        int i = auoVar.b;
        aum aumVar = null;
        if (i >= 0) {
            List list = auoVar.a;
            if (i < list.size()) {
                aumVar = (aum) list.get(auoVar.b);
            }
        }
        metricStyle.setCriticalMetric(listE.indexOf(aumVar));
        return metricStyle;
    }
}
