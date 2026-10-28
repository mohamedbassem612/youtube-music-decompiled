package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agws {
    public final Map a;
    public volatile transient Map.Entry b;

    public agws(Map map) {
        this.a = map;
    }

    public final Object a(Object obj) {
        obj.getClass();
        Object objB = b(obj);
        return objB == null ? c(obj) : objB;
    }

    public final Object b(Object obj) {
        Map.Entry entry = this.b;
        if (entry == null || entry.getKey() != obj) {
            return null;
        }
        return entry.getValue();
    }

    final Object c(Object obj) {
        obj.getClass();
        return this.a.get(obj);
    }

    public final void d() {
        this.b = null;
    }

    final boolean e(Object obj) {
        return b(obj) != null || this.a.containsKey(obj);
    }
}
