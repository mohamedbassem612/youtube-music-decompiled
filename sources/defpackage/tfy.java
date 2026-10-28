package defpackage;

import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class tfy extends HashMap {
    public tfy(int i) {
        super(i, 1.0f);
    }

    private static Object a(Object obj) {
        if (!(obj instanceof String)) {
            return obj;
        }
        String str = (String) obj;
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.ENGLISH);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return super.containsKey(a(obj));
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        return super.get(a(obj));
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        String str = (String) obj;
        return super.put(str == null ? null : str.toLowerCase(Locale.ENGLISH), obj2);
    }
}
