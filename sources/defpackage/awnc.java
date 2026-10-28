package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class awnc extends awnb implements ListIterator, awrp {
    final /* synthetic */ awne c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awnc(awne awneVar, int i) {
        super(awneVar);
        this.c = awneVar;
        atqp.f(i, awneVar.a());
        this.a = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a.aF();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        awne awneVar = this.c;
        int i = this.a - 1;
        this.a = i;
        return awneVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a.aF();
    }
}
