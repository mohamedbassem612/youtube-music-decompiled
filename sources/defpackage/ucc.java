package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ucc extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aucd aucdVar = (aucd) obj;
        aihf aihfVarCreateBuilder = anbf.a.createBuilder();
        Iterator it = aucdVar.c.iterator();
        while (it.hasNext()) {
            anbi anbiVar = (anbi) uex.b.b((aucg) it.next());
            aihfVarCreateBuilder.copyOnWrite();
            anbf anbfVar = (anbf) aihfVarCreateBuilder.instance;
            anbiVar.getClass();
            aiie aiieVar = anbfVar.c;
            if (!aiieVar.c()) {
                anbfVar.c = aihn.mutableCopy(aiieVar);
            }
            anbfVar.c.add(anbiVar);
        }
        if ((aucdVar.b & 1) != 0) {
            agdy agdyVar = uex.a;
            aubo auboVar = aucdVar.d;
            if (auboVar == null) {
                auboVar = aubo.a;
            }
            anaq anaqVar = (anaq) agdyVar.b(auboVar);
            aihfVarCreateBuilder.copyOnWrite();
            anbf anbfVar2 = (anbf) aihfVarCreateBuilder.instance;
            anaqVar.getClass();
            anbfVar2.d = anaqVar;
            anbfVar2.b |= 1;
        }
        return (anbf) aihfVarCreateBuilder.build();
    }
}
