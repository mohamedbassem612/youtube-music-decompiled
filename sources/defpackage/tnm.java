package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class tnm {
    private final tnj a;
    public final int d;
    public final Map e;
    public final List f;
    public final boolean g;

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public tnm(int i, byte[] bArr, Map map, boolean z) {
        List arrayList;
        if (map == null) {
            arrayList = null;
        } else if (map.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new tnd((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(i, bArr, map, arrayList, z);
    }

    private static Map f(List list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tnd tndVar = (tnd) it.next();
            treeMap.put(tndVar.a, tndVar.b);
        }
        return treeMap;
    }

    public final int a() {
        return this.a.a();
    }

    public final aigm b() {
        return this.a.b();
    }

    public final Iterable c() {
        return this.a.c();
    }

    public final boolean d() {
        return this.a.d();
    }

    public final byte[] e() {
        return this.a.e();
    }

    private tnm(int i, byte[] bArr, Map map, List list, boolean z) {
        this.d = i;
        this.a = new tnl(bArr);
        this.e = map;
        this.f = list == null ? null : DesugarCollections.unmodifiableList(list);
        this.g = z;
    }

    public tnm(int i, Iterable iterable, List list, boolean z, boolean z2) {
        this.d = i;
        this.a = new tnk(iterable, z, z2);
        this.e = f(list);
        this.f = list == null ? null : DesugarCollections.unmodifiableList(list);
        this.g = false;
    }

    public tnm(int i, byte[] bArr, boolean z, List list) {
        this(i, bArr, f(list), list, z);
    }
}
