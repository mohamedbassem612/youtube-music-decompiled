package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agpa implements Iterator {
    private final agow a;
    private final Iterator b;
    private int c;
    private int d;
    private boolean e;
    private agox f;

    public agpa(agow agowVar, Iterator it) {
        this.a = agowVar;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c > 0 || this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int iA = this.c;
        if (iA == 0) {
            agox agoxVar = (agox) this.b.next();
            this.f = agoxVar;
            iA = agoxVar.a();
            this.d = iA;
        }
        this.c = iA - 1;
        this.e = true;
        agox agoxVar2 = this.f;
        agoxVar2.getClass();
        return agoxVar2.a;
    }

    @Override // java.util.Iterator
    public final void remove() {
        ahno.P(this.e, "no calls to next() since the last call to remove()");
        if (this.d == 1) {
            this.b.remove();
        } else {
            agow agowVar = this.a;
            agox agoxVar = this.f;
            agoxVar.getClass();
            agowVar.remove(agoxVar.a);
        }
        this.d--;
        this.e = false;
    }
}
