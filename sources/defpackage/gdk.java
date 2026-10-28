package defpackage;

import android.os.SystemClock;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class gdk {
    public String b;
    private final LinkedHashMap d = new LinkedHashMap();
    public final LinkedList a = new LinkedList();
    private final long c = SystemClock.elapsedRealtime();

    public gdk(String str) {
        this.b = str;
    }

    public static Map a(String str, Map map, StringBuilder sb, StringBuilder sb2) {
        if (sb.length() <= 0) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("action", str);
        }
        if (map != null && !map.isEmpty()) {
            linkedHashMap.putAll(map);
        }
        sb.deleteCharAt(sb.length() - 1);
        linkedHashMap.put("it", sb.toString());
        if (sb2.length() <= 0) {
            return linkedHashMap;
        }
        sb2.deleteCharAt(sb2.length() - 1);
        linkedHashMap.put("irt", sb2.toString());
        return linkedHashMap;
    }

    public final Map b() {
        return DesugarCollections.unmodifiableMap(this.d);
    }

    public void c(String str, String str2) {
        this.d.put(str, str2);
    }

    public jij d(long j) {
        throw null;
    }

    public boolean e(jij jijVar, long j, String... strArr) {
        if (jijVar != null) {
            this.a.add(new jij(j, strArr[0], jijVar));
            return true;
        }
        Log.e("Ticker", "In action: " + this.b + ", label item shouldn't be null");
        return false;
    }

    public Map f(kro kroVar) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (jij jijVar : this.a) {
            Object obj = jijVar.a;
            Object obj2 = jijVar.b;
            Object obj3 = jijVar.c;
            if (obj2 != null) {
                Long l = (Long) obj3;
                if (l.longValue() > 0) {
                    long jLongValue = l.longValue() - ((Long) ((jij) obj2).c).longValue();
                    long jLongValue2 = l.longValue() - this.c;
                    sb.append((String) obj);
                    sb.append('.');
                    sb.append(jLongValue);
                    sb.append(',');
                    arrayList.add(obj);
                    arrayList2.add(Long.valueOf(jLongValue));
                    arrayList3.add(Long.valueOf(jLongValue2));
                }
            }
        }
        arrayList.isEmpty();
        LinkedHashMap linkedHashMap = this.d;
        linkedHashMap.isEmpty();
        return a(this.b, linkedHashMap, sb, sb2);
    }
}
