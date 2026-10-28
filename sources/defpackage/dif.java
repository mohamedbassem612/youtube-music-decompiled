package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dif extends dii {
    public final Map a;
    private final List v;

    public dif(dih dihVar, String str, String str2) {
        super(dihVar, str, str2, false);
        this.v = new ArrayList();
        this.a = new afv();
    }

    final void a(Collection collection) {
        this.u.clear();
        List list = this.v;
        list.clear();
        Map map = this.a;
        map.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            dhi dhiVar = (dhi) it.next();
            dii diiVarC = this.b.c(dhiVar.a.p());
            if (diiVarC != null) {
                list.add(diiVarC);
                map.put(diiVarC.d, dhiVar);
                int i = dhiVar.b;
                if (i == 2 || i == 3) {
                    this.u.add(diiVarC);
                }
            }
        }
        dij.a().b.a(259, this);
    }
}
