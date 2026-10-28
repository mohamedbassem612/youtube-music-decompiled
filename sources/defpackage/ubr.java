package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class ubr extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aueh auehVar = (aueh) obj;
        aihf aihfVarCreateBuilder = ando.a.createBuilder();
        Iterator it = auehVar.b.iterator();
        while (it.hasNext()) {
            andw andwVar = (andw) ueo.a.b((auen) it.next());
            aihfVarCreateBuilder.copyOnWrite();
            ando andoVar = (ando) aihfVarCreateBuilder.instance;
            andwVar.getClass();
            aiie aiieVar = andoVar.b;
            if (!aiieVar.c()) {
                andoVar.b = aihn.mutableCopy(aiieVar);
            }
            andoVar.b.add(andwVar);
        }
        Iterator it2 = auehVar.c.iterator();
        while (it2.hasNext()) {
            andx andxVar = (andx) ueo.b.b((aueo) it2.next());
            aihfVarCreateBuilder.copyOnWrite();
            ando andoVar2 = (ando) aihfVarCreateBuilder.instance;
            andxVar.getClass();
            aiie aiieVar2 = andoVar2.c;
            if (!aiieVar2.c()) {
                andoVar2.c = aihn.mutableCopy(aiieVar2);
            }
            andoVar2.c.add(andxVar);
        }
        return (ando) aihfVarCreateBuilder.build();
    }
}
