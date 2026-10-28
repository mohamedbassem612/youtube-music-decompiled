package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class syq extends syv {
    @Override // defpackage.syv
    protected final int d(Object obj, Object obj2) {
        Object obj3 = ((zrr) obj2).a;
        if (obj3 == null) {
            return 1;
        }
        Iterator it = ((acbn) obj3).a.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((acce) it.next()).b.e.size();
        }
        return Math.max(1, size);
    }
}
