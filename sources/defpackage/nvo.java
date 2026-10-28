package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nvo {
    public static final List a(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(atqq.N(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((pot) it.next()).a);
        }
        return arrayList;
    }

    public static final List b(boolean z, List list, Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (z == set.contains(((pot) obj).a)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean c(pot potVar) {
        return potVar.z == 3 || potVar.b == aidu.DELETED;
    }
}
