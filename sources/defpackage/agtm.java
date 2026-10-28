package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agtm implements Iterator {
    final /* synthetic */ agtn a;
    private int b = 0;

    public agtm(agtn agtnVar) {
        this.a = agtnVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.a.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.b;
        this.b = i + 1;
        agtp agtpVar = this.a.a;
        return agtpVar.e(agtpVar.a[i] & 31);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
