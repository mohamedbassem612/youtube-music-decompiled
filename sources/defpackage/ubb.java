package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ubb extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        audr audrVar = (audr) obj;
        aihf aihfVarCreateBuilder = ancx.a.createBuilder();
        if ((audrVar.b & 1) != 0) {
            agdy agdyVar = uee.a;
            audt audtVar = audrVar.c;
            if (audtVar == null) {
                audtVar = audt.a;
            }
            ancz anczVar = (ancz) agdyVar.b(audtVar);
            aihfVarCreateBuilder.copyOnWrite();
            ancx ancxVar = (ancx) aihfVarCreateBuilder.instance;
            anczVar.getClass();
            ancxVar.c = anczVar;
            ancxVar.b |= 1;
        }
        if ((audrVar.b & 2) != 0) {
            String str = audrVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            ancx ancxVar2 = (ancx) aihfVarCreateBuilder.instance;
            str.getClass();
            ancxVar2.b |= 2;
            ancxVar2.d = str;
        }
        if ((audrVar.b & 4) != 0) {
            agdy agdyVar2 = uee.a;
            audt audtVar2 = audrVar.e;
            if (audtVar2 == null) {
                audtVar2 = audt.a;
            }
            ancz anczVar2 = (ancz) agdyVar2.b(audtVar2);
            aihfVarCreateBuilder.copyOnWrite();
            ancx ancxVar3 = (ancx) aihfVarCreateBuilder.instance;
            anczVar2.getClass();
            ancxVar3.e = anczVar2;
            ancxVar3.b |= 4;
        }
        Iterator it = audrVar.f.iterator();
        while (it.hasNext()) {
            ancw ancwVar = (ancw) uee.b.b((audq) it.next());
            aihfVarCreateBuilder.copyOnWrite();
            ancx ancxVar4 = (ancx) aihfVarCreateBuilder.instance;
            ancwVar.getClass();
            aiie aiieVar = ancxVar4.f;
            if (!aiieVar.c()) {
                ancxVar4.f = aihn.mutableCopy(aiieVar);
            }
            ancxVar4.f.add(ancwVar);
        }
        return (ancx) aihfVarCreateBuilder.build();
    }
}
