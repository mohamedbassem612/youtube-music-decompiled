package defpackage;

import j$.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pup {
    private static final puo d = new puo();
    private final awmd a;
    private final awmd b;
    private final awmd c;

    public pup(awmd awmdVar, awmd awmdVar2, awmd awmdVar3) {
        this.a = awmdVar;
        this.b = awmdVar2;
        this.c = awmdVar3;
    }

    public final aiej a() {
        Set set = (Set) this.a.io();
        if (set.isEmpty()) {
            return aiej.a;
        }
        ArrayList arrayList = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((ahxx) it.next()).g));
        }
        aihf aihfVarCreateBuilder = aiej.a.createBuilder();
        Iterator it2 = arrayList.iterator();
        int iMax = 1;
        while (it2.hasNext()) {
            iMax = Math.max((((Integer) it2.next()).intValue() / 64) + 1, iMax);
        }
        ArrayList arrayList2 = new ArrayList(iMax);
        arrayList2.addAll(Collections.nCopies(iMax, 0L));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            int iIntValue = ((Integer) it3.next()).intValue();
            int i = iIntValue / 64;
            arrayList2.set(i, Long.valueOf((1 << (iIntValue % 64)) | ((Long) arrayList2.get(i)).longValue()));
        }
        aihfVarCreateBuilder.at(arrayList2);
        return (aiej) aihfVarCreateBuilder.build();
    }

    public final aiew b() {
        aihf aihfVarCreateBuilder = aiew.a.createBuilder();
        Iterator it = ((Set) this.b.io()).iterator();
        while (it.hasNext()) {
            aihfVarCreateBuilder.mergeFrom((aihn) it.next());
        }
        Set set = (Set) ((aupo) this.c).b;
        if (!set.isEmpty()) {
            Iterable iterable = (Iterable) Collection.EL.stream(set).map(d).collect(aghu.a);
            aihfVarCreateBuilder.copyOnWrite();
            aiew aiewVar = (aiew) aihfVarCreateBuilder.instance;
            aihv aihvVar = aiewVar.g;
            if (!aihvVar.c()) {
                aiewVar.g = aihn.mutableCopy(aihvVar);
            }
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                aiewVar.g.h(((aidt) it2.next()).C);
            }
        }
        return (aiew) aihfVarCreateBuilder.build();
    }
}
