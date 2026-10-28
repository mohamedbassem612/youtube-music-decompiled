package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ywx {
    public final String a;
    public final Map b;

    public ywx(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static Map e(bwb bwbVar) {
        HashMap map = new HashMap();
        String strZ = bwbVar.z();
        while (!TextUtils.isEmpty(strZ)) {
            String[] strArrSplit = strZ.split(": ");
            if (strArrSplit.length >= 2) {
                map.put(strArrSplit[0], strArrSplit[1]);
            }
            strZ = bwbVar.z();
        }
        return map;
    }

    public final Double a(String str) {
        try {
            Map map = this.b;
            if (map.containsKey(str)) {
                return Double.valueOf(Double.parseDouble((String) map.get(str)));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final Integer b(String str) {
        try {
            Map map = this.b;
            if (map.containsKey(str)) {
                return Integer.valueOf((String) map.get(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final Long c(String str) {
        try {
            Map map = this.b;
            if (map.containsKey(str)) {
                return Long.valueOf((String) map.get(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final String d(String str) {
        return (String) this.b.get(str);
    }

    public final String toString() {
        return "EmbeddedMetadata(scheme='" + this.a + "', numKeys=" + this.b.size() + ')';
    }
}
