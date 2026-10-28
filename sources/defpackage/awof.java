package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class awof extends awod implements Iterator, awrp {
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
        Object[] objArr = awogVar.c;
        objArr.getClass();
        Object obj = objArr[i];
        b();
        return obj;
    }
}
