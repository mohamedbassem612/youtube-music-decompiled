package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ucn extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aucl auclVar = (aucl) obj;
        aihf aihfVarCreateBuilder = anbn.a.createBuilder();
        if ((auclVar.b & 1) != 0) {
            agdy agdyVar = ufe.a;
            auby aubyVar = auclVar.c;
            if (aubyVar == null) {
                aubyVar = auby.a;
            }
            anba anbaVar = (anba) agdyVar.b(aubyVar);
            aihfVarCreateBuilder.copyOnWrite();
            anbn anbnVar = (anbn) aihfVarCreateBuilder.instance;
            anbaVar.getClass();
            anbnVar.c = anbaVar;
            anbnVar.b |= 1;
        }
        if ((auclVar.b & 2) != 0) {
            agdy agdyVar2 = ufe.b;
            aucn aucnVar = auclVar.d;
            if (aucnVar == null) {
                aucnVar = aucn.a;
            }
            anbp anbpVar = (anbp) agdyVar2.b(aucnVar);
            aihfVarCreateBuilder.copyOnWrite();
            anbn anbnVar2 = (anbn) aihfVarCreateBuilder.instance;
            anbpVar.getClass();
            anbnVar2.d = anbpVar;
            anbnVar2.b |= 2;
        }
        Iterator it = auclVar.e.iterator();
        while (it.hasNext()) {
            anbo anboVar = (anbo) ufe.c.b((aucm) it.next());
            aihfVarCreateBuilder.copyOnWrite();
            anbn anbnVar3 = (anbn) aihfVarCreateBuilder.instance;
            anboVar.getClass();
            aiie aiieVar = anbnVar3.e;
            if (!aiieVar.c()) {
                anbnVar3.e = aihn.mutableCopy(aiieVar);
            }
            anbnVar3.e.add(anboVar);
        }
        if ((auclVar.b & 4) != 0) {
            int i = auclVar.f;
            aihfVarCreateBuilder.copyOnWrite();
            anbn anbnVar4 = (anbn) aihfVarCreateBuilder.instance;
            anbnVar4.b |= 4;
            anbnVar4.f = i;
        }
        if ((auclVar.b & 8) != 0) {
            int i2 = auclVar.g;
            aihfVarCreateBuilder.copyOnWrite();
            anbn anbnVar5 = (anbn) aihfVarCreateBuilder.instance;
            anbnVar5.b |= 8;
            anbnVar5.g = i2;
        }
        Iterator it2 = auclVar.h.iterator();
        while (it2.hasNext()) {
            anbb anbbVar = (anbb) ufe.d.b((aubz) it2.next());
            aihfVarCreateBuilder.copyOnWrite();
            anbn anbnVar6 = (anbn) aihfVarCreateBuilder.instance;
            anbbVar.getClass();
            aiie aiieVar2 = anbnVar6.h;
            if (!aiieVar2.c()) {
                anbnVar6.h = aihn.mutableCopy(aiieVar2);
            }
            anbnVar6.h.add(anbbVar);
        }
        return (anbn) aihfVarCreateBuilder.build();
    }
}
