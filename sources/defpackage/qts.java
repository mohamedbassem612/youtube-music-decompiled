package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class qts implements Iterator {
    private final int[] a;
    private final int b;
    private int c = 0;

    public qts(int[] iArr) {
        this.a = iArr;
        this.b = iArr.length;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.a;
        int i = this.c;
        this.c = i + 1;
        return Integer.valueOf(iArr[i]);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
