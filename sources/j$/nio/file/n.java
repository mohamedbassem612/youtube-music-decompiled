package j$.nio.file;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class n implements Iterator {
    public int a = 0;
    public final /* synthetic */ j$.desugar.sun.nio.fs.p b;

    public n(j$.desugar.sun.nio.fs.p pVar) {
        this.b = pVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.c.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        j$.desugar.sun.nio.fs.p pVar = this.b;
        if (i >= pVar.c.size()) {
            throw new NoSuchElementException();
        }
        j$.desugar.sun.nio.fs.p name = pVar.getName(this.a);
        this.a++;
        return name;
    }
}
