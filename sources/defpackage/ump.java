package defpackage;

import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class ump implements utu {
    private final long a;
    private final auft b;

    public ump(long j, auft auftVar) {
        this.a = j;
        this.b = auftVar;
    }

    @Override // defpackage.utu
    public final /* synthetic */ utv a(auhs auhsVar) {
        throw null;
    }

    @Override // defpackage.utu
    public final utv b(auhs auhsVar) throws utw {
        auhsVar.getClass();
        long j = this.a;
        aufa aufaVarGl = yno.gl(auhsVar, j);
        if (aufaVarGl == null) {
            throw new utw(a.cf(j, "Failed to find segment with ID ", " to update derived source mixin"), this);
        }
        ArrayList arrayList = new ArrayList();
        long j2 = aufaVarGl.e;
        aihl aihlVar = auft.b;
        aihlVar.getClass();
        auft auftVar = this.b;
        arrayList.add(new uvi(j2, aihlVar, auftVar));
        Duration[] durationArr = new Duration[3];
        aigu aiguVar = aufaVarGl.g;
        if (aiguVar == null) {
            aiguVar = aigu.a;
        }
        aiguVar.getClass();
        durationArr[0] = aext.v(aiguVar);
        aigu aiguVar2 = auftVar.e;
        if (aiguVar2 == null) {
            aiguVar2 = aigu.a;
        }
        aiguVar2.getClass();
        durationArr[1] = aext.v(aiguVar2);
        aigu aiguVar3 = auftVar.k;
        if (aiguVar3 == null) {
            aiguVar3 = aigu.a;
        }
        aiguVar3.getClass();
        durationArr[2] = aext.v(aiguVar3);
        List listAL = atqq.aL(durationArr);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listAL) {
            if (a.y((Duration) obj)) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        Duration duration = (Duration) comparable;
        aigu aiguVar4 = aufaVarGl.f;
        if (aiguVar4 == null) {
            aiguVar4 = aigu.a;
        }
        aiguVar4.getClass();
        Duration durationPlus = aext.v(aiguVar4).plus(duration);
        durationPlus.getClass();
        arrayList.add(new uuk(aufaVarGl.e, null, durationPlus));
        return new utt(arrayList);
    }
}
