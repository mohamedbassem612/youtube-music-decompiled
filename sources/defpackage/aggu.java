package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aggu extends aggs implements ListIterator {
    final /* synthetic */ aggv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aggu(aggv aggvVar, int i) {
        super(aggvVar, aggvVar.d().listIterator(i));
        this.d = aggvVar;
    }

    private final ListIterator b() {
        a();
        return (ListIterator) this.a;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        aggv aggvVar = this.d;
        boolean zIsEmpty = aggvVar.isEmpty();
        b().add(obj);
        aggvVar.f.b++;
        if (zIsEmpty) {
            aggvVar.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aggu(aggv aggvVar) {
        super(aggvVar);
        this.d = aggvVar;
    }
}
