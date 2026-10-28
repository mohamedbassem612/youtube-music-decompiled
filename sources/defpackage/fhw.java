package defpackage;

import android.graphics.Rect;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.litho.TextContent;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class fhw {
    private static final HashSet a = new HashSet(Arrays.asList("delegate", "feedPrefetcher", "parentFeedContextChain", "child", "children", "childComponent", "trackingCode", "eventsController", "itemAnimator", "onScrollListeners", "recyclerConfiguration", "threadTileViewData", "textColorStateList", "typeface", "text", "params"));

    private static String a(Object obj, int i) {
        if (obj == null) {
            return "";
        }
        String strReplace = obj.toString().replace(" \n", " ").replace("\n", " ").replace("\"", "");
        return strReplace.length() > i ? String.valueOf(strReplace.substring(0, i)).concat("...") : strReplace;
    }

    public static void addViewDescription(fhu fhuVar, StringBuilder sb, int i, int i2, boolean z, boolean z2, fhv fhvVar) {
        fmu fmuVar;
        Object obj;
        fkl fklVar;
        sb.append("litho.");
        sb.append(fhuVar.c().c());
        sb.append('{');
        sb.append(Integer.toHexString(fhuVar.hashCode()));
        sb.append(' ');
        fjw fjwVarH = fhuVar.h();
        kyr kyrVarO = fhuVar.o();
        String str = ".";
        sb.append((fjwVarH == null || fjwVarH.getVisibility() != 0) ? "." : "V");
        sb.append((kyrVarO == null || (fklVar = ((fjq) kyrVarO.b).f) == null || fklVar.D != 1) ? "." : "F");
        sb.append((fjwVarH == null || !fjwVarH.isEnabled()) ? "." : "E");
        sb.append('.');
        sb.append((fjwVarH == null || !fjwVarH.isHorizontalScrollBarEnabled()) ? "." : "H");
        sb.append((fjwVarH == null || !fjwVarH.isVerticalScrollBarEnabled()) ? "." : "V");
        if (kyrVarO != null && kyrVarO.G() != null) {
            str = "C";
        }
        sb.append(str);
        sb.append(". .. ");
        Rect rectA = fhuVar.a();
        sb.append(rectA.left - i);
        sb.append(',');
        sb.append(rectA.top - i2);
        sb.append('-');
        sb.append(rectA.right - i);
        sb.append(',');
        sb.append(rectA.bottom - i2);
        String string = null;
        String str2 = fhuVar.n() ? fhuVar.b.w : null;
        if (str2 != null && !TextUtils.isEmpty(str2)) {
            sb.append(" litho:id/");
            sb.append(str2.replace(' ', '_'));
        }
        fjw fjwVarH2 = fhuVar.h();
        if (fjwVarH2 != null) {
            fgy fgyVarC = fhuVar.c();
            fkb fkbVar = fjwVarH2.x;
            int iA = fkbVar.a();
            for (int i3 = 0; i3 < iA; i3++) {
                fvi fviVarI = fkbVar.i(i3);
                fgy fgyVar = fviVarI == null ? null : fja.a(fviVarI).c;
                if (fgyVar != null && fgyVar.j == fgyVarC.j) {
                    Object obj2 = fviVarI.a;
                    StringBuilder sb2 = new StringBuilder();
                    if (obj2 instanceof TextContent) {
                        Iterator it = ((TextContent) obj2).getTextItems().iterator();
                        while (it.hasNext()) {
                            sb2.append((CharSequence) it.next());
                        }
                    } else if (obj2 instanceof TextView) {
                        sb2.append(((TextView) obj2).getText());
                    }
                    if (sb2.length() != 0) {
                        string = sb2.toString();
                        break;
                    }
                }
            }
        }
        if (string != null && !TextUtils.isEmpty(string)) {
            sb.append(" text=\"");
            sb.append(a(string, 200));
            sb.append('\"');
        }
        if (z2) {
            fgy fgyVarC2 = fhuVar.c();
            JSONObject jSONObject = new JSONObject();
            for (Field field : fgyVarC2.getClass().getDeclaredFields()) {
                try {
                    if (!a.contains(field.getName()) && (fmuVar = (fmu) field.getAnnotation(fmu.class)) != null) {
                        field.setAccessible(true);
                        int iOrdinal = fmuVar.a().ordinal();
                        if (iOrdinal == 1) {
                            String strA = a(field.get(fgyVarC2), 50);
                            if (!TextUtils.isEmpty(strA)) {
                                jSONObject.put(field.getName(), strA);
                            }
                        } else if (iOrdinal != 11 && iOrdinal != 6 && iOrdinal != 7 && iOrdinal != 8 && (obj = field.get(fgyVarC2)) != null) {
                            jSONObject.put(field.getName(), obj);
                        }
                    }
                } catch (Exception e) {
                    try {
                        jSONObject.put("DUMP-ERROR", a(e.getMessage(), 50));
                    } catch (Exception unused) {
                    }
                }
            }
            if (jSONObject.length() > 0) {
                sb.append(" props=\"");
                sb.append(jSONObject.toString());
                sb.append('\"');
            }
        }
        if (fhvVar != null) {
            fhvVar.a();
        }
        if (!z && kyrVarO != null && kyrVarO.G() != null) {
            sb.append(" [clickable]");
        }
        sb.append('}');
    }

    public static void addViewDescription(fhu fhuVar, StringBuilder sb, int i, int i2, boolean z, boolean z2) {
        addViewDescription(fhuVar, sb, i, i2, z, z2, null);
    }
}
