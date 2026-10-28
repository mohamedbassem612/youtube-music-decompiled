package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awoe extends awod implements Iterator, awrp {
    @Override // java.util.Iterator
    public final Object next() {
        a();
        awog awogVar = this.a;
        int i = this.b;
        if (i >= awogVar.e) {
            throw new NoSuchElementException();
        }
        this.b = i + 1;
        this.c = i;
        Object obj = awogVar.b[i];
        b();
        return obj;
    }
}
