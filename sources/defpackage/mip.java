package defpackage;

import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mip implements nru {
    public final Map a = DesugarCollections.synchronizedMap(new HashMap());
    private final agke b;

    public mip(agke agkeVar) {
        this.b = agkeVar;
        DesugarCollections.synchronizedMap(new HashMap());
    }

    @Override // defpackage.nru
    public final nrt a(nrt nrtVar) {
        int i = 0;
        nrt nrtVarA = nrtVar;
        while (true) {
            agke agkeVar = this.b;
            if (i >= ((agpi) agkeVar).d) {
                break;
            }
            nrtVarA = ((nru) agkeVar.get(i)).a(nrtVar);
            i++;
        }
        Map map = this.a;
        synchronized (map) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                nrtVarA = ((nru) it.next()).a(nrtVar);
            }
        }
        return nrtVarA;
    }

    public final void b(Object obj, nru nruVar) {
        this.a.put(obj, nruVar);
    }
}
