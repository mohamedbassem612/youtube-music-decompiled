package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class avri implements Iterator {
    final /* synthetic */ awlz a;
    private Object b;

    public avri(awlz awlzVar) {
        this.a = awlzVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object obj = this.a.b;
        this.b = obj;
        return !awkl.d(obj);
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object obj = this.b;
            if (obj == null) {
                obj = this.a.b;
                this.b = obj;
            }
            if (awkl.d(obj)) {
                throw new NoSuchElementException();
            }
            if (obj instanceof awkj) {
                throw awkh.b(awkl.a(obj));
            }
            this.b = null;
            return obj;
        } catch (Throwable th) {
            this.b = null;
            throw th;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Read only iterator");
    }
}
