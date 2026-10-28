package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class tzy extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aubh aubhVar = (aubh) obj;
        aihf aihfVarCreateBuilder = anaj.a.createBuilder();
        Iterator it = aubhVar.c.iterator();
        while (it.hasNext()) {
            anak anakVar = (anak) udm.a.b((aubi) it.next());
            aihfVarCreateBuilder.copyOnWrite();
            anaj anajVar = (anaj) aihfVarCreateBuilder.instance;
            anakVar.getClass();
            aiie aiieVar = anajVar.c;
            if (!aiieVar.c()) {
                anajVar.c = aihn.mutableCopy(aiieVar);
            }
            anajVar.c.add(anakVar);
        }
        if ((aubhVar.b & 1) != 0) {
            agdy agdyVar = udm.b;
            aubl aublVar = aubhVar.d;
            if (aublVar == null) {
                aublVar = aubl.a;
            }
            anan ananVar = (anan) agdyVar.b(aublVar);
            aihfVarCreateBuilder.copyOnWrite();
            anaj anajVar2 = (anaj) aihfVarCreateBuilder.instance;
            ananVar.getClass();
            anajVar2.d = ananVar;
            anajVar2.b |= 1;
        }
        return (anaj) aihfVarCreateBuilder.build();
    }
}
