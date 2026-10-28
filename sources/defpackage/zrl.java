package defpackage;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zrl implements zrj {
    private final SortedMap a = new TreeMap();

    @Override // defpackage.zrj
    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : this.a.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append(':');
            sb.append((String) entry.getValue());
            sb.append('/');
        }
        return sb.toString();
    }

    @Override // defpackage.zrj
    public final void b(String str, String str2) {
        this.a.put(str, str2);
    }
}
