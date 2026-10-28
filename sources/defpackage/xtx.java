package defpackage;

import android.database.DataSetObserver;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.ToLongFunction;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class xtx extends DataSetObserver {
    final /* synthetic */ xub a;

    public xtx(xub xubVar) {
        this.a = xubVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        super.onChanged();
        ArrayList arrayList = new ArrayList();
        final xub xubVar = this.a;
        int count = xubVar.m.getCount();
        for (int i = 0; i < count; i++) {
            dii diiVar = (dii) xubVar.m.getItem(i);
            if (xubVar.E.a(xrx.a(diiVar)) > 0) {
                arrayList.add(diiVar);
            }
        }
        Collections.sort(arrayList, Comparator$EL.reversed(Comparator$CC.comparingLong(new ToLongFunction() { // from class: xtw
            @Override // java.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return xubVar.E.a(xrx.a((dii) obj));
            }
        })));
        if (arrayList.equals(xubVar.H)) {
            return;
        }
        xubVar.H.clear();
        xubVar.H.addAll(arrayList);
        if (xubVar.H.isEmpty()) {
            xubVar.r(8);
        } else {
            xubVar.r(0);
        }
        xubVar.I.jW();
    }
}
