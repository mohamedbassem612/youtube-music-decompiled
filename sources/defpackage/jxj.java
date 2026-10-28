package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jxj implements Iterator {
    final /* synthetic */ jxk a;
    private int b = 0;

    public jxj(jxk jxkVar) {
        this.a = jxkVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String[] strArr = this.a.b;
        return strArr != null && this.b < strArr.length;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b++;
        return new hna(null);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
