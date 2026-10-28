package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awsy extends awsz implements Iterator, awoq, awrp {
    public awoq a;
    private int b;
    private Object c;
    private Iterator d;

    private final Throwable c() {
        int i = this.b;
        if (i != 4) {
            return i != 5 ? new IllegalStateException(a.bR(i, "Unexpected state of the iterator: ")) : new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    @Override // defpackage.awsz
    public final Object a(Object obj, awoq awoqVar) {
        this.c = obj;
        this.b = 3;
        this.a = awoqVar;
        return awox.a;
    }

    @Override // defpackage.awsz
    public final Object b(Iterator it, awoq awoqVar) {
        if (!it.hasNext()) {
            return awmy.a;
        }
        this.d = it;
        this.b = 2;
        this.a = awoqVar;
        return awox.a;
    }

    @Override // defpackage.awoq
    public final awou getContext() {
        return awov.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws Throwable {
        while (true) {
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator it = this.d;
                it.getClass();
                if (it.hasNext()) {
                    this.b = 2;
                    return true;
                }
                this.d = null;
            }
            this.b = 5;
            awoq awoqVar = this.a;
            awoqVar.getClass();
            this.a = null;
            awoqVar.resumeWith(awmy.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() throws Throwable {
        int i = this.b;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.b = 1;
            Iterator it = this.d;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw c();
        }
        this.b = 0;
        Object obj = this.c;
        this.c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.aw();
    }

    @Override // defpackage.awoq
    public final void resumeWith(Object obj) throws Throwable {
        atqp.j(obj);
        this.b = 4;
    }
}
