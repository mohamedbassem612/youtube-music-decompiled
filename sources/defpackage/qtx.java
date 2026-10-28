package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class qtx implements Iterator {
    private final int a;
    private int b = 0;

    public qtx(int i) {
        this.a = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Integer numValueOf = Integer.valueOf(this.b);
        this.b++;
        return numValueOf;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
