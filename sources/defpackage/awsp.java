package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awsp implements Iterator, awrp {
    final /* synthetic */ awsu a;
    private final Iterator b;
    private int c = -1;
    private Object d;

    /* JADX WARN: Type inference failed for: r1v1, types: [awsx, java.lang.Object] */
    public awsp(awsu awsuVar) {
        this.a = awsuVar;
        this.b = awsuVar.a.a();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [awqg, java.lang.Object] */
    private final void a() {
        int i;
        Object next;
        do {
            Iterator it = this.b;
            if (it.hasNext()) {
                next = it.next();
            } else {
                i = 0;
            }
            this.c = i;
        } while (((Boolean) this.a.b.invoke(next)).booleanValue());
        this.d = next;
        i = 1;
        this.c = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c == -1) {
            a();
        }
        return this.c == 1 || this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c == -1) {
            a();
        }
        if (this.c != 1) {
            return this.b.next();
        }
        Object obj = this.d;
        this.d = null;
        this.c = 0;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.aw();
    }
}
