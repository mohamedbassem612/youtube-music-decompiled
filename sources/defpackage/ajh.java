package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ajh implements Iterator, awrp {
    public Object[] a = ajg.a.b;
    public int b;
    private int c;

    public final void a() {
        c();
        this.b++;
    }

    public final boolean b() {
        return this.b < this.c;
    }

    public final boolean c() {
        int i = this.b;
        int length = this.a.length;
        return i < 0;
    }

    public final void d(Object[] objArr, int i) {
        this.a = objArr;
        this.c = i;
        this.b = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return b();
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.aw();
    }
}
