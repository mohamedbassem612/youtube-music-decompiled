package defpackage;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class aad {
    protected aad() {
    }

    public static List a(List list) {
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public static List b(List list) {
        return list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    public static void e(Context context, int i, SparseArray sparseArray, SparseArray sparseArray2) {
        String str;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            asd asdVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                asl aslVar = new asl();
                                int attributeCount = xml.getAttributeCount();
                                for (int i2 = 0; i2 < attributeCount; i2++) {
                                    String attributeName = xml.getAttributeName(i2);
                                    String attributeValue = xml.getAttributeValue(i2);
                                    if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                                        int i3 = -1;
                                        int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                                        if (identifier != -1) {
                                            i3 = identifier;
                                        } else if (attributeValue.length() > 1) {
                                            i3 = Integer.parseInt(attributeValue.substring(1));
                                        } else {
                                            Log.e("ConstraintLayoutStates", "error in parsing id");
                                        }
                                        aslVar.f(context, xml);
                                        sparseArray2.put(i3, aslVar);
                                    }
                                }
                            } else {
                                continue;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                asd asdVar2 = new asd(context, xml);
                                sparseArray.put(asdVar2.a, asdVar2);
                                asdVar = asdVar2;
                            } else {
                                continue;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                ase aseVar = new ase(context, xml);
                                if (asdVar != null) {
                                    ((ArrayList) asdVar.c).add(aseVar);
                                }
                            } else {
                                continue;
                            }
                            break;
                        default:
                            continue;
                    }
                    name.equals(str);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", a.bR(i, "Error parsing resource: "), e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", a.bR(i, "Error parsing resource: "), e2);
        }
    }

    public static aad f() {
        return new atc(ActivityOptions.makeBasic());
    }

    public Bundle c() {
        throw null;
    }

    public void d(int i) {
        throw null;
    }
}
