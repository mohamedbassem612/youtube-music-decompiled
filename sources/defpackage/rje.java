package defpackage;

import j$.util.Collection;
import java.util.HashSet;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class rje extends rjg {
    private final rjm b;

    public rje(rjm rjmVar, quc qucVar, quc qucVar2) {
        super(qucVar, qucVar2);
        this.b = rjmVar;
        agkj agkjVar = (agkj) Collection.EL.stream(qucVar.c()).collect(aext.h(new ris(3)));
        agkj agkjVar2 = (agkj) Collection.EL.stream(qucVar2.c()).collect(aext.h(new ris(3)));
        if (!agkjVar2.keySet().containsAll(agkjVar.keySet())) {
            a(rjf.x);
        }
        if (!agkjVar.keySet().containsAll(agkjVar2.keySet())) {
            a(rjf.w);
        }
        agqr it = ((agpz) ahng.af(agkjVar.keySet(), agkjVar2.keySet())).iterator();
        while (it.hasNext()) {
            UUID uuid = (UUID) it.next();
            if (!this.b.b((qvu) agkjVar.get(uuid), (qvu) agkjVar2.get(uuid)).a.isEmpty()) {
                a(rjf.y);
                break;
            }
        }
        agkj agkjVar3 = (agkj) Collection.EL.stream(qucVar.d()).collect(aext.h(new ris(4)));
        agkj agkjVar4 = (agkj) Collection.EL.stream(qucVar2.d()).collect(aext.h(new ris(4)));
        if (!agkjVar4.keySet().containsAll(agkjVar3.keySet())) {
            a(rjf.A);
        }
        if (!agkjVar3.keySet().containsAll(agkjVar4.keySet())) {
            a(rjf.z);
        }
        agqr it2 = ((agpz) ahng.af(agkjVar3.keySet(), agkjVar4.keySet())).iterator();
        while (it2.hasNext()) {
            UUID uuid2 = (UUID) it2.next();
            if (!((HashSet) this.b.c((qxj) agkjVar3.get(uuid2), (qxj) agkjVar4.get(uuid2)).a).isEmpty()) {
                a(rjf.B);
                return;
            }
        }
    }
}
