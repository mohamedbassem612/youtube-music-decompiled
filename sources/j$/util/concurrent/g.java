package j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public final class g extends a implements Iterator, Enumeration {
    public final /* synthetic */ byte k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j[] jVarArr, int i, int i2, ConcurrentHashMap concurrentHashMap, byte b) {
        super(jVarArr, i, i2, concurrentHashMap);
        this.k = b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.k) {
            case 0:
                j jVar = this.b;
                if (jVar == null) {
                    throw new NoSuchElementException();
                }
                Object obj = jVar.b;
                this.j = jVar;
                a();
                return obj;
            default:
                j jVar2 = this.b;
                if (jVar2 == null) {
                    throw new NoSuchElementException();
                }
                Object obj2 = jVar2.c;
                this.j = jVar2;
                a();
                return obj2;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.k) {
            case 0:
                break;
            default:
                break;
        }
        return next();
    }
}
