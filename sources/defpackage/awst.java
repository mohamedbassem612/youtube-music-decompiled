package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awst implements Iterator, awrp {
    final /* synthetic */ awsu a;
    private final Iterator b;
    private Iterator c;
    private int d;

    /* JADX WARN: Type inference failed for: r1v1, types: [awsx, java.lang.Object] */
    public awst(awsu awsuVar) {
        this.a = awsuVar;
        this.b = awsuVar.a.a();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v2, types: [awqg, java.lang.Object] */
    private final boolean a() {
        ?? Invoke;
        Iterator it = this.c;
        if (it != null && it.hasNext()) {
            this.d = 1;
            return true;
        }
        do {
            Iterator it2 = this.b;
            if (!it2.hasNext()) {
                this.d = 2;
                this.c = null;
                return false;
            }
            Invoke = this.a.b.invoke(it2.next());
        } while (!Invoke.hasNext());
        this.c = Invoke;
        this.d = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.d;
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        return a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        if (i == 2) {
            throw new NoSuchElementException();
        }
        if (i == 0 && !a()) {
            throw new NoSuchElementException();
        }
        this.d = 0;
        Iterator it = this.c;
        it.getClass();
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.aw();
    }
}
