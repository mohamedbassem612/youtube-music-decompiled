package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bvi implements Iterable {
    private final Object a = new Object();
    private final Map b = new HashMap();
    private Set c = Collections.EMPTY_SET;
    private List d = Collections.EMPTY_LIST;

    public final int a(Object obj) {
        int iIntValue;
        synchronized (this.a) {
            iIntValue = ((Integer) j$.util.Map.EL.getOrDefault(this.b, obj, 0)).intValue();
        }
        return iIntValue;
    }

    public final Set b() {
        Set set;
        synchronized (this.a) {
            set = this.c;
        }
        return set;
    }

    public final void c(Object obj) {
        synchronized (this.a) {
            ArrayList arrayList = new ArrayList(this.d);
            arrayList.add(obj);
            this.d = DesugarCollections.unmodifiableList(arrayList);
            Map map = this.b;
            Integer num = (Integer) map.get(obj);
            int iIntValue = 1;
            if (num == null) {
                HashSet hashSet = new HashSet(this.c);
                hashSet.add(obj);
                this.c = DesugarCollections.unmodifiableSet(hashSet);
            } else {
                iIntValue = 1 + num.intValue();
            }
            map.put(obj, Integer.valueOf(iIntValue));
        }
    }

    public final void d(Object obj) {
        synchronized (this.a) {
            Map map = this.b;
            Integer num = (Integer) map.get(obj);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.d);
            arrayList.remove(obj);
            this.d = DesugarCollections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                map.remove(obj);
                HashSet hashSet = new HashSet(this.c);
                hashSet.remove(obj);
                this.c = DesugarCollections.unmodifiableSet(hashSet);
            } else {
                map.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.a) {
            it = this.d.iterator();
        }
        return it;
    }
}
