package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class azh implements Iterator, awrp {
    private final awqg a;
    private final List b = new ArrayList();
    private Iterator c;

    public azh(Iterator it, awqg awqgVar) {
        this.a = awqgVar;
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Iterator] */
    @Override // java.util.Iterator
    public final Object next() {
        Object next = this.c.next();
        ?? Invoke = this.a.invoke(next);
        if (Invoke == 0 || !Invoke.hasNext()) {
            while (!this.c.hasNext()) {
                List list = this.b;
                if (list.isEmpty()) {
                    break;
                }
                this.c = (Iterator) atqq.ab(list);
                atqq.Q(list);
            }
        } else {
            this.b.add(this.c);
            this.c = Invoke;
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.aw();
    }
}
