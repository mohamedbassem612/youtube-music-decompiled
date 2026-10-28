package defpackage;

import j$.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qdm {
    public static agke a(List list, long j, long j2) {
        if (j < 0 && j2 < 0) {
            return (agke) Collection.EL.stream(list).map(new qdi(3)).collect(aghu.a);
        }
        Iterator it = list.iterator();
        long jA = 0;
        while (it.hasNext()) {
            jA += ((qdl) it.next()).a();
        }
        if (list.size() <= j && jA <= j2) {
            return (agke) Collection.EL.stream(list).map(new qdi(3)).collect(aghu.a);
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        agjz agjzVar = new agjz(4);
        int size = arrayList.size();
        long jA2 = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            qdl qdlVar = (qdl) arrayList.get(i2);
            i++;
            jA2 += qdlVar.a();
            if ((j >= 0 && i > j) || (j2 >= 0 && jA2 > j2)) {
                break;
            }
            agjzVar.h(qdlVar.b());
        }
        return agjzVar.g();
    }
}
