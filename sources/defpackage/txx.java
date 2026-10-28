package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class txx implements Iterator {
    final /* synthetic */ txy a;
    private int b = 0;
    private int c;
    private txw d;
    private txw e;
    private Object f;
    private final txv g;

    public txx(txy txyVar, txv txvVar) {
        this.a = txyVar;
        this.g = txvVar;
        this.c = txyVar.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        txw txwVar;
        txw txwVar2 = this.e;
        if (txwVar2 != null && (this.f != null || txwVar2.b)) {
            return true;
        }
        while (true) {
            txw txwVar3 = this.e;
            if (txwVar3 == null) {
                do {
                    int i = this.b;
                    txw[] txwVarArr = this.a.a;
                    if (i >= txwVarArr.length) {
                        break;
                    }
                    this.b = i + 1;
                    txwVar = txwVarArr[i];
                    this.e = txwVar;
                } while (txwVar == null);
                txwVar3 = this.e;
                if (txwVar3 == null) {
                    return false;
                }
            }
            Object obj = txwVar3.get();
            this.f = obj;
            if (obj != null) {
                return true;
            }
            txw txwVar4 = this.e;
            if (txwVar4.b) {
                return true;
            }
            this.e = txwVar4.d;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c != this.a.b) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        txw txwVar = this.e;
        this.d = txwVar;
        this.e = txwVar.d;
        Object objA = this.g.a(txwVar);
        this.f = null;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.c;
        txy txyVar = this.a;
        if (i != txyVar.b) {
            throw new ConcurrentModificationException();
        }
        txw txwVar = this.d;
        if (txwVar == null) {
            throw new IllegalStateException();
        }
        txyVar.b(txwVar);
        this.d = null;
        this.c++;
    }
}
