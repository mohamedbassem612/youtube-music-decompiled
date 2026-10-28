package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahdn extends ahcv {
    private List c;

    public ahdn(agjw agjwVar, boolean z) {
        List arrayList;
        super(agjwVar, z, true);
        if (agjwVar.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            int size = agjwVar.size();
            aguu.ag(size, "initialArraySize");
            arrayList = new ArrayList(size);
        }
        for (int i = 0; i < agjwVar.size(); i++) {
            arrayList.add(null);
        }
        this.c = arrayList;
        p();
    }

    @Override // defpackage.ahcv
    public final void d(int i, Object obj) {
        List list = this.c;
        if (list != null) {
            list.set(i, new ahud(obj));
        }
    }

    @Override // defpackage.ahcv
    public final void f() {
        List<ahud> list = this.c;
        if (list != null) {
            int size = list.size();
            aguu.ag(size, "initialArraySize");
            ArrayList arrayList = new ArrayList(size);
            for (ahud ahudVar : list) {
                arrayList.add(ahudVar != null ? ahudVar.b : null);
            }
            set(DesugarCollections.unmodifiableList(arrayList));
        }
    }

    @Override // defpackage.ahcv
    public final void r(int i) {
        super.r(i);
        this.c = null;
    }
}
