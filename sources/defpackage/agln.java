package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agln extends agix {
    final /* synthetic */ Iterable a;
    final /* synthetic */ agex b;

    public agln(Iterable iterable, agex agexVar) {
        this.a = iterable;
        this.b = agexVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        return new agls(it, this.b);
    }
}
