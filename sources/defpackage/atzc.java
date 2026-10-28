package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class atzc {
    public final Map a = new HashMap();

    public final String a(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        Map map = this.a;
        if (!map.containsKey(lowerCase)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str2 : (List) map.get(str.toLowerCase(Locale.US))) {
            if (str2 != null) {
                if (!z) {
                    sb.append(',');
                }
                sb.append(str2);
                z = false;
            }
        }
        return sb.toString();
    }

    public final List b(String str) {
        List list = (List) this.a.get(str.toLowerCase(Locale.US));
        return list == null ? agpi.a : list;
    }

    public final Set c() {
        return DesugarCollections.unmodifiableSet(this.a.keySet());
    }

    public final void d(String str, String str2) {
        boolean z = false;
        if (str != null && !str.isEmpty()) {
            z = true;
        }
        ahno.F(z);
        str2.getClass();
        String lowerCase = str.toLowerCase(Locale.US);
        Map map = this.a;
        map.put(lowerCase, new ArrayList());
        ((List) map.get(lowerCase)).add(str2);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList(this.a.entrySet());
        Collections.sort(arrayList, new rit(19));
        StringBuilder sb = new StringBuilder("{");
        new aciz(new ager(", ")).q(sb, arrayList);
        sb.append('}');
        return sb.toString();
    }
}
