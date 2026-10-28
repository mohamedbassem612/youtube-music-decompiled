package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tbo implements Iterable {
    public final Map a;

    public tbo(Comparator comparator) {
        this.a = new TreeMap(comparator);
    }

    public final void a(Object obj, Object obj2) {
        Map map = this.a;
        LinkedList linkedList = (LinkedList) map.get(obj);
        if (linkedList == null) {
            linkedList = new LinkedList();
            map.put(obj, linkedList);
        }
        linkedList.addLast(obj2);
    }

    public final void b(Object obj) {
        Map map = this.a;
        agqr it = agkz.n(map.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            LinkedList linkedList = (LinkedList) entry.getValue();
            if (linkedList.remove(obj)) {
                if (linkedList.isEmpty()) {
                    map.remove(entry.getKey());
                    return;
                }
                return;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new tbn(this);
    }
}
