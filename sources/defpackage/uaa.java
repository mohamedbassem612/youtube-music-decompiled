package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class uaa extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aubj aubjVar = (aubj) obj;
        aihf aihfVarCreateBuilder = anal.a.createBuilder();
        if ((aubjVar.b & 1) != 0) {
            aigu aiguVar = aubjVar.c;
            if (aiguVar == null) {
                aiguVar = aigu.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            anal analVar = (anal) aihfVarCreateBuilder.instance;
            aiguVar.getClass();
            analVar.c = aiguVar;
            analVar.b |= 1;
        }
        if ((aubjVar.b & 2) != 0) {
            aigu aiguVar2 = aubjVar.d;
            if (aiguVar2 == null) {
                aiguVar2 = aigu.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            anal analVar2 = (anal) aihfVarCreateBuilder.instance;
            aiguVar2.getClass();
            analVar2.d = aiguVar2;
            analVar2.b |= 2;
        }
        if ((aubjVar.b & 4) != 0) {
            boolean z = aubjVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            anal analVar3 = (anal) aihfVarCreateBuilder.instance;
            analVar3.b |= 4;
            analVar3.e = z;
        }
        Iterator it = aubjVar.f.iterator();
        while (it.hasNext()) {
            anam anamVar = (anam) udn.a.b((aubk) it.next());
            aihfVarCreateBuilder.copyOnWrite();
            anal analVar4 = (anal) aihfVarCreateBuilder.instance;
            anamVar.getClass();
            aiie aiieVar = analVar4.f;
            if (!aiieVar.c()) {
                analVar4.f = aihn.mutableCopy(aiieVar);
            }
            analVar4.f.add(anamVar);
        }
        if ((aubjVar.b & 8) != 0) {
            agdy agdyVar = udn.b;
            aubh aubhVar = aubjVar.g;
            if (aubhVar == null) {
                aubhVar = aubh.a;
            }
            anaj anajVar = (anaj) agdyVar.b(aubhVar);
            aihfVarCreateBuilder.copyOnWrite();
            anal analVar5 = (anal) aihfVarCreateBuilder.instance;
            anajVar.getClass();
            analVar5.g = anajVar;
            analVar5.b |= 8;
        }
        return (anal) aihfVarCreateBuilder.build();
    }
}
