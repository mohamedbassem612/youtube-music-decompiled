package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fpv {
    public Map a;

    public final void a(String str, Object obj) {
        Map mapSynchronizedMap = this.a;
        if (mapSynchronizedMap == null) {
            mapSynchronizedMap = DesugarCollections.synchronizedMap(new HashMap());
            this.a = mapSynchronizedMap;
        }
        mapSynchronizedMap.put(str, obj);
    }

    public final void b(boolean z) {
        a("is_full_span", Boolean.valueOf(z));
    }

    public final void c(boolean z) {
        a("is_sticky", Boolean.valueOf(z));
    }

    public final void d(int i) {
        a("span_size", Integer.valueOf(i));
    }
}
