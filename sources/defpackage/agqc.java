package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agqc extends aggd {
    final /* synthetic */ Iterator a;
    final /* synthetic */ Set b;
    final /* synthetic */ Iterator c;
    final /* synthetic */ Set d;

    public agqc(Iterator it, Set set, Iterator it2, Set set2) {
        this.a = it;
        this.b = set;
        this.c = it2;
        this.d = set2;
    }

    @Override // defpackage.aggd
    protected final Object a() {
        Set set;
        Object next;
        Set set2;
        Object next2;
        do {
            Iterator it = this.a;
            if (!it.hasNext()) {
                do {
                    Iterator it2 = this.c;
                    if (!it2.hasNext()) {
                        b();
                        return null;
                    }
                    set = this.d;
                    next = it2.next();
                } while (set.contains(next));
                return next;
            }
            set2 = this.b;
            next2 = it.next();
        } while (set2.contains(next2));
        return next2;
    }
}
