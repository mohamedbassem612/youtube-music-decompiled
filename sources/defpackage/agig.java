package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agig implements Iterator {
    int a;
    int b;
    int c = -1;
    final /* synthetic */ agih d;

    public agig(agih agihVar) {
        this.d = agihVar;
        this.a = agihVar.b;
        this.b = agihVar.a();
    }

    private final void a() {
        if (this.d.b != this.a) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.c = i;
        agih agihVar = this.d;
        Object objC = agihVar.c(i);
        this.b = agihVar.b(this.b);
        return objC;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    @Override // java.util.Iterator
    public final void remove() {
        a();
        ahno.P((this.c ^ (-1)) >>> 31, "no calls to next() since the last call to remove()");
        this.a += 32;
        int i = this.c;
        agih agihVar = this.d;
        agihVar.remove(agihVar.c(i));
        this.b--;
        this.c = -1;
    }
}
