package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class uaj extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aihf aihfVarCreateBuilder = anau.a.createBuilder();
        Iterator it = ((aubs) obj).b.iterator();
        while (it.hasNext()) {
            anat anatVar = (anat) udr.a.b((aubr) it.next());
            aihfVarCreateBuilder.copyOnWrite();
            anau anauVar = (anau) aihfVarCreateBuilder.instance;
            anatVar.getClass();
            aiie aiieVar = anauVar.b;
            if (!aiieVar.c()) {
                anauVar.b = aihn.mutableCopy(aiieVar);
            }
            anauVar.b.add(anatVar);
        }
        return (anau) aihfVarCreateBuilder.build();
    }
}
