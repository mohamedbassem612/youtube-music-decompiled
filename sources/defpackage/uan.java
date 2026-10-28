package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class uan extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aubv aubvVar = (aubv) obj;
        aihf aihfVarCreateBuilder = anax.a.createBuilder();
        if ((aubvVar.b & 1) != 0) {
            int i = aubvVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            anax anaxVar = (anax) aihfVarCreateBuilder.instance;
            anaxVar.b |= 1;
            anaxVar.c = i;
        }
        Iterator it = aubvVar.d.iterator();
        while (it.hasNext()) {
            anai anaiVar = (anai) udu.a.b((aubg) it.next());
            aihfVarCreateBuilder.copyOnWrite();
            anax anaxVar2 = (anax) aihfVarCreateBuilder.instance;
            anaiVar.getClass();
            aiie aiieVar = anaxVar2.d;
            if (!aiieVar.c()) {
                anaxVar2.d = aihn.mutableCopy(aiieVar);
            }
            anaxVar2.d.add(anaiVar);
        }
        if ((aubvVar.b & 2) != 0) {
            agdy agdyVar = udu.b;
            aucr aucrVar = aubvVar.e;
            if (aucrVar == null) {
                aucrVar = aucr.a;
            }
            anbt anbtVar = (anbt) agdyVar.b(aucrVar);
            aihfVarCreateBuilder.copyOnWrite();
            anax anaxVar3 = (anax) aihfVarCreateBuilder.instance;
            anbtVar.getClass();
            anaxVar3.e = anbtVar;
            anaxVar3.b |= 2;
        }
        if ((aubvVar.b & 4) != 0) {
            agdy agdyVar2 = udu.c;
            auco aucoVar = aubvVar.f;
            if (aucoVar == null) {
                aucoVar = auco.a;
            }
            anbq anbqVar = (anbq) agdyVar2.b(aucoVar);
            aihfVarCreateBuilder.copyOnWrite();
            anax anaxVar4 = (anax) aihfVarCreateBuilder.instance;
            anbqVar.getClass();
            anaxVar4.f = anbqVar;
            anaxVar4.b |= 4;
        }
        return (anax) aihfVarCreateBuilder.build();
    }
}
