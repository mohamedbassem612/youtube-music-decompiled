package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class awnb implements Iterator, awrp {
    public int a;
    final /* synthetic */ awne b;

    public awnb(awne awneVar) {
        this.b = awneVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        awne awneVar = this.b;
        int i = this.a;
        this.a = i + 1;
        return awneVar.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.aw();
    }
}
