package defpackage;

import j$.time.Instant;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wmu implements wmg {
    private final wmb a;
    private final Set b;
    private final ahbw c;
    private final Map d;

    public wmu(wmb wmbVar, ahbw ahbwVar) {
        this.a = wmbVar;
        this.c = ahbwVar;
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        this.b = setNewSetFromMap;
        this.d = new ConcurrentHashMap();
        setNewSetFromMap.add(wmbVar);
    }

    @Override // defpackage.wmg
    public final void a(alop alopVar) {
        throw null;
    }

    @Override // defpackage.wmg
    public final void c(wlu wluVar, alop alopVar, zwa zwaVar) {
        if ((alopVar.b & 4194304) != 0) {
            aqcn aqcnVar = alopVar.i;
            if (aqcnVar == null) {
                aqcnVar = aqcn.a;
            }
            Instant instantA = this.c.a();
            for (Integer num : aqcnVar.c) {
                num.intValue();
                j$.util.Map.EL.compute(this.d, num, new ito(instantA, 5));
            }
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((wmt) it.next()).b(aqcnVar.c);
            }
        }
        wmb wmbVar = this.a;
        aqcn aqcnVar2 = alopVar.i;
        if (aqcnVar2 == null) {
            aqcnVar2 = aqcn.a;
        }
        wmbVar.c(wluVar, aqcnVar2.b);
    }

    @Override // defpackage.wmg
    public final /* synthetic */ void d() {
    }
}
