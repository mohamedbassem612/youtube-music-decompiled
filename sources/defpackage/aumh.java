package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aumh extends AbstractList {
    private static final aumi c = aumi.b(aumh.class);
    final List a;
    final Iterator b;

    public aumh(List list, Iterator it) {
        this.a = list;
        this.b = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.a;
        if (list.size() > i) {
            return list.get(i);
        }
        Iterator it = this.b;
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        list.add(it.next());
        return get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new aumg(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        aumi aumiVar = c;
        aumiVar.a("potentially expensive size() call");
        aumiVar.a("blowup running");
        while (true) {
            Iterator it = this.b;
            boolean zHasNext = it.hasNext();
            List list = this.a;
            if (!zHasNext) {
                return list.size();
            }
            list.add(it.next());
        }
    }
}
