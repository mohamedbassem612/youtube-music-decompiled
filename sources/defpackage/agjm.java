package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agjm implements Iterator {
    final /* synthetic */ agjn a;
    private int b;
    private int c;
    private int d;
    private int e;

    public agjm(agjn agjnVar) {
        this.a = agjnVar;
        agjo agjoVar = agjnVar.b;
        this.b = agjoVar.e;
        this.c = -1;
        this.d = agjoVar.d;
        this.e = agjoVar.c;
    }

    private final void a() {
        if (this.a.b.d != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.b != -2 && this.e > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        agjn agjnVar = this.a;
        Object objA = agjnVar.a(this.b);
        int i = this.b;
        this.c = i;
        this.b = agjnVar.b.f[i];
        this.e--;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        ahno.P(this.c != -1, "no calls to next() since the last call to remove()");
        int i = this.c;
        agjo agjoVar = this.a.b;
        agjoVar.i(i, aguu.X(agjoVar.a[i]));
        if (this.b == agjoVar.c) {
            this.b = this.c;
        }
        this.c = -1;
        this.d = agjoVar.d;
    }
}
