package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class acxg implements agek {
    @Override // defpackage.agek
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        aihf aihfVarCreateBuilder = aksd.a.createBuilder();
        Iterator it = ((asmz) obj).b.iterator();
        while (it.hasNext()) {
            Object objApply = acyd.a.apply((asna) it.next());
            aihfVarCreateBuilder.copyOnWrite();
            aksd aksdVar = (aksd) aihfVarCreateBuilder.instance;
            objApply.getClass();
            aiie aiieVar = aksdVar.b;
            if (!aiieVar.c()) {
                aksdVar.b = aihn.mutableCopy(aiieVar);
            }
            aksdVar.b.add(objApply);
        }
        return (aksd) aihfVarCreateBuilder.build();
    }
}
