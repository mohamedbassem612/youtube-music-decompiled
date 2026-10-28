package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agpw extends aggd {
    final Iterator a;
    final Iterator b;
    final /* synthetic */ Set c;
    final /* synthetic */ Set d;

    public agpw(Set set, Set set2) {
        this.c = set;
        this.d = set2;
        this.a = set.iterator();
        this.b = ((agqj) set2).iterator();
    }

    @Override // defpackage.aggd
    protected final Object a() {
        Set set;
        Object next;
        Iterator it = this.a;
        if (it.hasNext()) {
            return it.next();
        }
        do {
            Iterator it2 = this.b;
            if (!it2.hasNext()) {
                b();
                return null;
            }
            set = this.c;
            next = it2.next();
        } while (set.contains(next));
        return next;
    }
}
