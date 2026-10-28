package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awsv implements Iterator, awrp {
    final /* synthetic */ awsw a;
    private Object b;
    private int c = -2;

    public awsv(awsw awswVar) {
        this.a = awswVar;
    }

    private final void a() {
        Object objInvoke;
        int i = this.c;
        awsw awswVar = this.a;
        if (i == -2) {
            objInvoke = awswVar.a.invoke();
        } else {
            Object obj = this.b;
            obj.getClass();
            objInvoke = awswVar.b.invoke(obj);
        }
        this.b = objInvoke;
        this.c = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c < 0) {
            a();
        }
        return this.c == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.c < 0) {
            a();
        }
        if (this.c == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.b;
        obj.getClass();
        this.c = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.aw();
    }
}
