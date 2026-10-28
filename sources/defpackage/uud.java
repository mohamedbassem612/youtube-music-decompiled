package defpackage;

import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uud implements utv {
    private final /* synthetic */ int $cid;

    public uud(int i) {
        this.$cid = i;
    }

    @Override // defpackage.utv
    public final /* synthetic */ String b() {
        return this.$cid != 0 ? yno.gq(this) : yno.gq(this);
    }

    @Override // defpackage.utx
    public final auhs h(auhs auhsVar) {
        if (this.$cid != 0) {
            auhsVar.getClass();
            aihf builder = auhsVar.toBuilder();
            builder.getClass();
            auhq auhqVar = (auhq) builder;
            auhqVar.copyOnWrite();
            ((auhs) auhqVar.instance).m = auhs.emptyProtobufList();
            ArrayList arrayList = new ArrayList();
            for (augy augyVar : auhsVar.d) {
                aiie aiieVar = augyVar.u;
                aiieVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : aiieVar) {
                    if (!(((aufd) obj).c == 3)) {
                        arrayList2.add(obj);
                    }
                }
                if (arrayList2.size() < augyVar.u.size()) {
                    jrr jrrVar = (jrr) augyVar.toBuilder();
                    jrrVar.copyOnWrite();
                    ((augy) jrrVar.instance).u = augy.emptyProtobufList();
                    jrrVar.copyOnWrite();
                    augy augyVar2 = (augy) jrrVar.instance;
                    augyVar2.a();
                    aifs.addAll(arrayList2, augyVar2.u);
                    aihn aihnVarBuild = jrrVar.build();
                    aihnVarBuild.getClass();
                    arrayList.add(aihnVarBuild);
                } else {
                    augyVar.getClass();
                    arrayList.add(augyVar);
                }
            }
            auhqVar.copyOnWrite();
            ((auhs) auhqVar.instance).d = auhs.emptyProtobufList();
            auhqVar.b(arrayList);
            aihn aihnVarBuild2 = auhqVar.build();
            aihnVarBuild2.getClass();
            return (auhs) aihnVarBuild2;
        }
        auhsVar.getClass();
        aiie aiieVar2 = auhsVar.f;
        aiieVar2.getClass();
        aihl aihlVar = aufx.b;
        aihlVar.getClass();
        if (yno.gh(aiieVar2, aihlVar) == null) {
            return auhsVar;
        }
        agke<augy> agkeVarF = usj.f(auhsVar);
        agkeVarF.getClass();
        ArrayList arrayList3 = new ArrayList(atqq.N(agkeVarF, 10));
        Iterator<E> it = agkeVarF.iterator();
        while (it.hasNext()) {
            aigu aiguVar = ((augy) it.next()).i;
            if (aiguVar == null) {
                aiguVar = aigu.a;
            }
            aiguVar.getClass();
            arrayList3.add(aext.v(aiguVar));
        }
        Duration duration = (Duration) atqq.V(arrayList3);
        if (duration == null) {
            duration = Duration.ZERO;
            duration.getClass();
        }
        ArrayList arrayList4 = new ArrayList(atqq.N(agkeVarF, 10));
        for (augy augyVar3 : agkeVarF) {
            aigu aiguVar2 = augyVar3.i;
            if (aiguVar2 == null) {
                aiguVar2 = aigu.a;
            }
            aiguVar2.getClass();
            Duration durationV = aext.v(aiguVar2);
            aigu aiguVar3 = augyVar3.j;
            if (aiguVar3 == null) {
                aiguVar3 = aigu.a;
            }
            aiguVar3.getClass();
            arrayList4.add(durationV.plus(aext.v(aiguVar3)));
        }
        Duration duration2 = (Duration) atqq.U(arrayList4);
        if (duration2 == null) {
            duration2 = Duration.ZERO;
            duration2.getClass();
        }
        auhq auhqVar2 = (auhq) auhsVar.toBuilder();
        auhqVar2.getClass();
        Duration durationMinus = duration2.minus(duration);
        durationMinus.getClass();
        aigu aiguVarU = aext.u(durationMinus);
        auhqVar2.copyOnWrite();
        auhs auhsVar2 = (auhs) auhqVar2.instance;
        auhsVar2.h = aiguVarU;
        auhsVar2.b |= 2;
        return atqn.z(auhqVar2);
    }

    @Override // defpackage.uub
    public final /* synthetic */ void c(urz urzVar) {
    }
}
