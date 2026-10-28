package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axqs extends LinkedHashMap {
    public static final axqs a;
    public boolean b;

    static {
        axqs axqsVar = new axqs();
        a = axqsVar;
        axqsVar.c();
    }

    private axqs() {
        this.b = true;
    }

    private static int d(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof axqh) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = axqj.a;
        int length = bArr.length;
        int iAl = a.al(length, bArr, 0, length);
        if (iAl == 0) {
            return 1;
        }
        return iAl;
    }

    public final axqs a() {
        return isEmpty() ? new axqs() : new axqs(this);
    }

    public final void b() {
        if (!this.b) {
            throw new UnsupportedOperationException();
        }
    }

    public final void c() {
        this.b = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator it = entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (!map.containsKey(entry.getKey()) || !a.ai(entry.getValue(), map.get(entry.getKey()))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iD = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iD += d(entry.getKey()) ^ d(entry.getValue());
        }
        return iD;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        b();
        byte[] bArr = axqj.a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        b();
        for (Object obj : map.keySet()) {
            axqj.a(obj);
            axqj.a(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        return super.remove(obj);
    }

    private axqs(Map map) {
        super(map);
        this.b = true;
    }
}
