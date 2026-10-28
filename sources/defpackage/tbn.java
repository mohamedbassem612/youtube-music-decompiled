package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tbn implements Iterator {
    private final Iterator a;
    private LinkedList b;
    private Iterator c;

    public tbn(tbo tboVar) {
        this.a = tboVar.a.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a.hasNext()) {
            return true;
        }
        Iterator it = this.c;
        return it != null && it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        while (true) {
            Iterator it = this.c;
            if (it != null && it.hasNext()) {
                return this.c.next();
            }
            LinkedList linkedList = (LinkedList) ((Map.Entry) this.a.next()).getValue();
            this.b = linkedList;
            this.c = linkedList.iterator();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.c.remove();
        if (this.b.isEmpty()) {
            this.a.remove();
        }
    }
}
