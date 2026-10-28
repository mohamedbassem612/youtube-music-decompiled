package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class flv extends flp {
    public final ArrayList a = new ArrayList();

    public flv(List list) {
        for (int i = 0; i < list.size(); i++) {
            flp flpVar = (flp) list.get(i);
            if (flpVar instanceof flj) {
                ArrayList arrayListA = ((flj) flpVar).a();
                int size = arrayListA.size();
                ArrayList arrayList = this.a;
                if (size > 1) {
                    arrayList.add(new flv(arrayListA));
                } else {
                    arrayList.add((flp) arrayListA.get(0));
                }
            } else {
                if (flpVar == null) {
                    throw new IllegalStateException("Null element is not allowed in transition set");
                }
                this.a.add(flpVar);
            }
        }
    }
}
