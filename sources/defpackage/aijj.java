package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aijj implements Iterator {
    final /* synthetic */ aijl a;
    private int b = -1;

    public aijj(aijl aijlVar) {
        this.a = aijlVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        aijl aijlVar = this.a;
        aijlVar.c();
        return this.b + 1 < aijlVar.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        aijl aijlVar = this.a;
        aijlVar.c();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object[] objArr = aijlVar.a;
        int i = this.b + 1;
        this.b = i;
        return (aiji) objArr[i];
    }
}
