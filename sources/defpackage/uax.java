package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class uax extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        audn audnVar = (audn) obj;
        aihf aihfVarCreateBuilder = anct.a.createBuilder();
        if ((audnVar.b & 1) != 0) {
            String str = audnVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            anct anctVar = (anct) aihfVarCreateBuilder.instance;
            str.getClass();
            anctVar.b |= 1;
            anctVar.c = str;
        }
        if ((audnVar.b & 2) != 0) {
            agdy agdyVar = ueb.a;
            audo audoVar = audnVar.d;
            if (audoVar == null) {
                audoVar = audo.a;
            }
            ancu ancuVar = (ancu) agdyVar.b(audoVar);
            aihfVarCreateBuilder.copyOnWrite();
            anct anctVar2 = (anct) aihfVarCreateBuilder.instance;
            ancuVar.getClass();
            anctVar2.d = ancuVar;
            anctVar2.b |= 2;
        }
        Iterator it = audnVar.e.iterator();
        while (it.hasNext()) {
            ancr ancrVar = (ancr) ueb.b.b((audl) it.next());
            aihfVarCreateBuilder.copyOnWrite();
            anct anctVar3 = (anct) aihfVarCreateBuilder.instance;
            ancrVar.getClass();
            aiie aiieVar = anctVar3.e;
            if (!aiieVar.c()) {
                anctVar3.e = aihn.mutableCopy(aiieVar);
            }
            anctVar3.e.add(ancrVar);
        }
        return (anct) aihfVarCreateBuilder.build();
    }
}
