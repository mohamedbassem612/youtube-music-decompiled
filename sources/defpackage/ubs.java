package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class ubs extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aihf aihfVarCreateBuilder = andp.a.createBuilder();
        Iterator it = ((auei) obj).b.iterator();
        while (it.hasNext()) {
            andq andqVar = (andq) uep.a.b((auej) it.next());
            aihfVarCreateBuilder.copyOnWrite();
            andp andpVar = (andp) aihfVarCreateBuilder.instance;
            andqVar.getClass();
            aiie aiieVar = andpVar.b;
            if (!aiieVar.c()) {
                andpVar.b = aihn.mutableCopy(aiieVar);
            }
            andpVar.b.add(andqVar);
        }
        return (andp) aihfVarCreateBuilder.build();
    }
}
