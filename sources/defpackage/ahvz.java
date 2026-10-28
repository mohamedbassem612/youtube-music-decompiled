package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahvz implements agtz {
    private static final agsw a = new ahvu("", agpi.a);
    private final aunn b;

    public ahvz(aunn aunnVar) {
        this.b = aunnVar;
    }

    @Override // defpackage.agtz
    public final agsw a(String str) {
        Set set = (Set) this.b.io();
        int size = set.size();
        if (size == 0) {
            return a;
        }
        if (size == 1) {
            return ((agtz) set.iterator().next()).a(str);
        }
        aguu.ag(size, "expectedSize");
        agjz agjzVar = new agjz(size);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            agjzVar.h(((agtz) it.next()).a(str));
        }
        return new ahvu(str, agjzVar.g());
    }
}
