package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class miu implements vx {
    private final /* synthetic */ int $cid;

    public /* synthetic */ miu(int i) {
        this.$cid = i;
    }

    @Override // defpackage.vx
    public final Object a(Object obj) {
        long jF;
        int i = this.$cid;
        if (i == 0) {
            return new nud("Error creating Component", (Throwable) obj);
        }
        boolean z = true;
        if (i != 1) {
            return obj;
        }
        List list = (List) obj;
        String str = ees.a;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(atqq.N(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eer eerVar = (eer) it.next();
            List list2 = eerVar.q;
            dyp dypVar = !list2.isEmpty() ? (dyp) list2.get(0) : dyp.a;
            UUID uuidFromString = UUID.fromString(eerVar.a);
            uuidFromString.getClass();
            dzr dzrVar = eerVar.b;
            HashSet hashSet = new HashSet(eerVar.o);
            dyp dypVar2 = eerVar.c;
            int i2 = eerVar.h;
            int i3 = eerVar.l;
            dyn dynVar = eerVar.g;
            boolean z2 = z;
            long j = eerVar.d;
            long j2 = eerVar.e;
            boolean z3 = j2 != 0 ? false : z2;
            Iterator it2 = it;
            dzq dzqVar = j2 != 0 ? new dzq(j2, eerVar.f) : null;
            dzr dzrVar2 = dzr.a;
            if (dzrVar == dzrVar2) {
                jF = bou.f((dzrVar != dzrVar2 || i2 <= 0) ? false : z2, i2, eerVar.r, eerVar.i, eerVar.j, eerVar.k, !z3, j, eerVar.f, j2, eerVar.m);
                i2 = i2;
            } else {
                jF = Long.MAX_VALUE;
            }
            arrayList.add(new dzs(uuidFromString, dzrVar, hashSet, dypVar2, dypVar, i2, i3, dynVar, j, dzqVar, jF, eerVar.n, eerVar.p));
            z = z2;
            it = it2;
        }
        return arrayList;
    }
}
