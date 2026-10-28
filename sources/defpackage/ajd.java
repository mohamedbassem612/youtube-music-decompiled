package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ajd implements Iterator, awrp {
    private final ajh[] a;
    private int b;
    private boolean c = true;

    public ajd(ajg ajgVar, ajh[] ajhVarArr) {
        this.a = ajhVarArr;
        ajhVarArr[0].d(ajgVar.b, 0);
        this.b = 0;
        b();
    }

    private final int a(int i) {
        ajh[] ajhVarArr = this.a;
        if (ajhVarArr[i].b()) {
            return i;
        }
        if (!ajhVarArr[i].c()) {
            return -1;
        }
        ajh ajhVar = ajhVarArr[i];
        ajhVar.c();
        Object obj = ajhVar.a[ajhVar.b];
        obj.getClass();
        ajg ajgVar = (ajg) obj;
        if (i == 6) {
            ajhVarArr[7].d(ajgVar.b, 0);
        } else {
            ajhVarArr[i + 1].d(ajgVar.b, 0);
        }
        return a(i + 1);
    }

    private final void b() {
        ajh[] ajhVarArr = this.a;
        if (ajhVarArr[this.b].b()) {
            return;
        }
        for (int i = this.b; i >= 0; i--) {
            int iA = a(i);
            if (iA == -1) {
                if (ajhVarArr[i].c()) {
                    ajhVarArr[i].a();
                    iA = a(i);
                } else {
                    iA = -1;
                }
            }
            if (iA != -1) {
                this.b = iA;
                return;
            }
            if (i > 0) {
                ajhVarArr[i - 1].a();
            }
            ajhVarArr[i].d(ajg.a.b, 0);
        }
        this.c = false;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.c) {
            throw new NoSuchElementException();
        }
        Object next = this.a[this.b].next();
        b();
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.aw();
    }
}
