package j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class c extends a implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        j jVar = this.b;
        if (jVar == null) {
            throw new NoSuchElementException();
        }
        Object obj = jVar.b;
        Object obj2 = jVar.c;
        this.j = jVar;
        a();
        return new i(obj, obj2, this.i);
    }
}
