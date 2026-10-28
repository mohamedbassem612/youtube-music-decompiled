package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class da implements cy {
    final /* synthetic */ dd a;

    public da(dd ddVar) {
        this.a = ddVar;
    }

    @Override // defpackage.cy
    public final boolean i(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean zAf;
        int i;
        dd ddVar = this.a;
        if (dd.aa(2)) {
            Objects.toString(ddVar.b);
        }
        int i2 = 0;
        if (ddVar.c.isEmpty()) {
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            zAf = false;
        } else {
            ArrayList arrayList5 = ddVar.c;
            ddVar.f = (av) arrayList5.get(arrayList5.size() - 1);
            ArrayList arrayList6 = ddVar.f.e;
            int size = arrayList6.size();
            for (int i3 = 0; i3 < size; i3++) {
                cc ccVar = ((dm) arrayList6.get(i3)).b;
                if (ccVar != null) {
                    ccVar.mTransitioning = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            zAf = ddVar.af(arrayList3, arrayList4, null, -1, 0);
        }
        if (!ddVar.m.isEmpty() && arrayList3.size() > 0) {
            boolean zBooleanValue = ((Boolean) arrayList4.get(arrayList3.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList3.size();
            for (int i4 = 0; i4 < size2; i4++) {
                linkedHashSet.addAll(dd.ai((av) arrayList3.get(i4)));
            }
            ArrayList arrayList7 = ddVar.m;
            int size3 = arrayList7.size();
            while (i2 < size3) {
                cx cxVar = (cx) arrayList7.get(i2);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        cxVar.b((cc) it.next(), zBooleanValue);
                    }
                }
                i2 = i;
            }
        }
        return zAf;
    }
}
