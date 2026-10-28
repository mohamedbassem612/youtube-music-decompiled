package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class agpy extends aggd {
    final Iterator a;
    final /* synthetic */ Set b;
    final /* synthetic */ Set c;

    public agpy(Set set, Set set2) {
        this.b = set;
        this.c = set2;
        this.a = set.iterator();
    }

    @Override // defpackage.aggd
    protected final Object a() {
        Set set;
        Object next;
        do {
            Iterator it = this.a;
            if (!it.hasNext()) {
                b();
                return null;
            }
            set = this.c;
            next = it.next();
        } while (!set.contains(next));
        return next;
    }
}
