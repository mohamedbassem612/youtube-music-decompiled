package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agri extends agrx {
    public agri(Class cls) {
        super("tags", cls, false, true);
    }

    @Override // defpackage.agrx
    public final /* bridge */ /* synthetic */ void b(Object obj, agrw agrwVar) {
        agva agvaVar = (agva) obj;
        if (agvaVar != null) {
            aumg aumgVar = new aumg((AbstractCollection) agvaVar.c.d, 1);
            while (aumgVar.hasNext()) {
                Map.Entry entry = (Map.Entry) aumgVar.next();
                if (((Set) entry.getValue()).isEmpty()) {
                    agrwVar.a((String) entry.getKey(), null);
                } else {
                    Iterator it = ((Set) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        agrwVar.a((String) entry.getKey(), it.next());
                    }
                }
            }
        }
    }
}
