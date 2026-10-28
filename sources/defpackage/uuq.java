package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uuq implements utv {
    private final aufd a;
    private final Long b;
    private final Long c;

    public uuq(aufd aufdVar, Long l, Long l2, Context context) {
        aufdVar.getClass();
        context.getClass();
        this.a = aufdVar;
        this.b = l;
        this.c = l2;
    }

    private final auhs d(auhs auhsVar, long j) throws utw {
        Optional optionalN = usj.n(auhsVar, j);
        optionalN.getClass();
        augy augyVar = (augy) awrc.f(optionalN);
        if (augyVar == null) {
            throw new utw(a.cf(j, "Graphical segment with id ", " not found"), this);
        }
        jrr jrrVar = (jrr) augyVar.toBuilder();
        jrrVar.getClass();
        aufd aufdVar = this.a;
        if (!atxy.g(jrrVar).contains(aufdVar)) {
            atxy.g(jrrVar);
            jrrVar.copyOnWrite();
            augy augyVar2 = (augy) jrrVar.instance;
            augyVar2.a();
            augyVar2.u.add(aufdVar);
        }
        auhs auhsVarI = usj.i(auhsVar, atxy.h(jrrVar));
        auhsVarI.getClass();
        return auhsVarI;
    }

    @Override // defpackage.utv
    public final /* synthetic */ String b() {
        return yno.gq(this);
    }

    @Override // defpackage.utx
    public final auhs h(auhs auhsVar) {
        auhsVar.getClass();
        auhq auhqVar = (auhq) auhsVar.toBuilder();
        auhqVar.getClass();
        Long l = this.b;
        Long l2 = this.c;
        if (l != null) {
            if (l2 == null) {
                return d(auhsVar, l.longValue());
            }
            aihf aihfVarCreateBuilder = aufj.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            long jLongValue = l.longValue();
            aihfVarCreateBuilder.copyOnWrite();
            aufj aufjVar = (aufj) aihfVarCreateBuilder.instance;
            aufjVar.b |= 1;
            aufjVar.c = jLongValue;
            long jLongValue2 = l2.longValue();
            aihfVarCreateBuilder.copyOnWrite();
            aufj aufjVar2 = (aufj) aihfVarCreateBuilder.instance;
            aufjVar2.b |= 2;
            aufjVar2.d = jLongValue2;
            aufd aufdVar = this.a;
            aihfVarCreateBuilder.copyOnWrite();
            aufj aufjVar3 = (aufj) aihfVarCreateBuilder.instance;
            aufjVar3.e = aufdVar;
            aufjVar3.b |= 4;
            aihn aihnVarBuild = aihfVarCreateBuilder.build();
            aihnVarBuild.getClass();
            aufj aufjVar4 = (aufj) aihnVarBuild;
            Iterator it = atqn.y(auhqVar).iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                aufj aufjVar5 = (aufj) it.next();
                if (aufjVar5.c == aufjVar4.c && aufjVar5.d == aufjVar4.d) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                atqn.y(auhqVar);
                auhqVar.copyOnWrite();
                auhs auhsVar2 = (auhs) auhqVar.instance;
                auhsVar2.c();
                auhsVar2.m.set(i, aufjVar4);
            } else {
                atqn.y(auhqVar);
                auhqVar.copyOnWrite();
                auhs auhsVar3 = (auhs) auhqVar.instance;
                auhsVar3.c();
                auhsVar3.m.add(aufjVar4);
            }
        } else if (l2 != null) {
            return d(auhsVar, l2.longValue());
        }
        return atqn.z(auhqVar);
    }

    @Override // defpackage.uub
    public final /* synthetic */ void c(urz urzVar) {
    }
}
