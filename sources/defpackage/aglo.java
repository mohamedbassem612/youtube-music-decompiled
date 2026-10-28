package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aglo extends agix {
    final /* synthetic */ Iterable a;
    final /* synthetic */ agek b;

    public aglo(Iterable iterable, agek agekVar) {
        this.a = iterable;
        this.b = agekVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new aglt(this.a.iterator(), this.b);
    }
}
