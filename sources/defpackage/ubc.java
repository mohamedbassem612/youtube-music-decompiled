package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ubc extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auds audsVar = (auds) obj;
        aihf aihfVarCreateBuilder = ancy.a.createBuilder();
        if ((audsVar.b & 1) != 0) {
            String str = audsVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            ancy ancyVar = (ancy) aihfVarCreateBuilder.instance;
            str.getClass();
            ancyVar.b |= 1;
            ancyVar.c = str;
        }
        if ((audsVar.b & 2) != 0) {
            agdy agdyVar = uef.a;
            audt audtVar = audsVar.d;
            if (audtVar == null) {
                audtVar = audt.a;
            }
            ancz anczVar = (ancz) agdyVar.b(audtVar);
            aihfVarCreateBuilder.copyOnWrite();
            ancy ancyVar2 = (ancy) aihfVarCreateBuilder.instance;
            anczVar.getClass();
            ancyVar2.d = anczVar;
            ancyVar2.b |= 2;
        }
        Iterator it = audsVar.e.iterator();
        while (it.hasNext()) {
            ancw ancwVar = (ancw) uef.b.b((audq) it.next());
            aihfVarCreateBuilder.copyOnWrite();
            ancy ancyVar3 = (ancy) aihfVarCreateBuilder.instance;
            ancwVar.getClass();
            aiie aiieVar = ancyVar3.e;
            if (!aiieVar.c()) {
                ancyVar3.e = aihn.mutableCopy(aiieVar);
            }
            ancyVar3.e.add(ancwVar);
        }
        return (ancy) aihfVarCreateBuilder.build();
    }
}
