package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nrn {
    public static String a(Map map, Map map2) {
        StringBuilder sb = new StringBuilder();
        for (String str : map2.keySet()) {
            String strA = ((ofw) map2.get(str)).a(map);
            if (strA != null) {
                sb.append(str);
                sb.append('=');
                sb.append(strA);
                sb.append('&');
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
