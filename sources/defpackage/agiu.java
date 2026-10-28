package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agiu extends agix {
    final /* synthetic */ Iterable a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agiu(Iterable iterable, Iterable iterable2) {
        super(iterable);
        this.a = iterable2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
