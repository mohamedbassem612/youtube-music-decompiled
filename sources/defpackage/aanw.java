package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aanw {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/offline/orchestration/OrchestrationActionUtil");
    private final Map b;
    private final mbc c;
    private final AtomicLong d = new AtomicLong();
    private final AtomicLong e = new AtomicLong();

    public aanw(Map map, mbc mbcVar) {
        this.b = map;
        this.c = mbcVar;
    }

    private final aanq b(aofh aofhVar, aanq aanqVar) throws aaob {
        int iB = wfs.b(aofhVar.d);
        if (!this.b.containsKey(Integer.valueOf(iB))) {
            throw new aaob(a.bR(iB, "Couldn't find registered controller for entityType: "));
        }
        String strL = tym.l();
        String str = aanqVar != null ? aanqVar.g : strL;
        long nanos = TimeUnit.MILLISECONDS.toNanos(this.c.f().toEpochMilli());
        AtomicLong atomicLong = this.d;
        if (nanos != atomicLong.get()) {
            atomicLong.set(nanos);
            this.e.set(0L);
        }
        return new aanq(strL, aofhVar, iB, nanos + this.e.getAndIncrement(), str, aanqVar != null ? aanqVar.a : null);
    }

    private final List c(aanq aanqVar, String str, List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aofh aofhVar = (aofh) it.next();
            try {
                aanq aanqVarB = b(aofhVar, aanqVar);
                aanqVarB.h = str;
                arrayList.add(aanqVarB);
                if (!aofhVar.f.isEmpty()) {
                    arrayList2.add(aanqVarB);
                }
            } catch (aaob e) {
                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/offline/orchestration/OrchestrationActionUtil", "createWrappedChainedActions", 120, "OrchestrationActionUtil.java")).w("[Offline] One of the chained actions couldn't be created: %s", e.getMessage());
            }
        }
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            aanq aanqVar2 = (aanq) arrayList2.get(i);
            arrayList.addAll(c(aanqVar, aanqVar2.a, aanqVar2.c.f));
        }
        return arrayList;
    }

    final List a(aofh aofhVar, aanq aanqVar) throws aaob {
        ArrayList arrayList = new ArrayList();
        aanq aanqVarB = b(aofhVar, aanqVar);
        arrayList.add(aanqVarB);
        if (!aofhVar.f.isEmpty()) {
            arrayList.addAll(c(aanqVar, aanqVarB.a, aofhVar.f));
        }
        return arrayList;
    }
}
