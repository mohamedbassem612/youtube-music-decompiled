package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aglq extends agix {
    final /* synthetic */ Iterable a;
    final /* synthetic */ int b;

    public aglq(Iterable iterable, int i) {
        this.a = iterable;
        this.b = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable iterable = this.a;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.b), list.size()).iterator();
        }
        int i = this.b;
        Iterator it = iterable.iterator();
        aguu.w(it, i);
        return new aglp(it);
    }
}
