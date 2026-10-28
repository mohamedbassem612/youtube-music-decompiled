package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class uao extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aubw aubwVar = (aubw) obj;
        aihf aihfVarCreateBuilder = anay.a.createBuilder();
        if ((aubwVar.b & 1) != 0) {
            agdy agdyVar = udv.b;
            aucg aucgVar = aubwVar.c;
            if (aucgVar == null) {
                aucgVar = aucg.a;
            }
            anbi anbiVar = (anbi) agdyVar.b(aucgVar);
            aihfVarCreateBuilder.copyOnWrite();
            anay anayVar = (anay) aihfVarCreateBuilder.instance;
            anbiVar.getClass();
            anayVar.c = anbiVar;
            anayVar.b |= 1;
        }
        if ((aubwVar.b & 2) != 0) {
            agdy agdyVar2 = udv.a;
            aubo auboVar = aubwVar.d;
            if (auboVar == null) {
                auboVar = aubo.a;
            }
            anaq anaqVar = (anaq) agdyVar2.b(auboVar);
            aihfVarCreateBuilder.copyOnWrite();
            anay anayVar2 = (anay) aihfVarCreateBuilder.instance;
            anaqVar.getClass();
            anayVar2.d = anaqVar;
            anayVar2.b |= 2;
        }
        if ((aubwVar.b & 4) != 0) {
            boolean z = aubwVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            anay anayVar3 = (anay) aihfVarCreateBuilder.instance;
            anayVar3.b |= 4;
            anayVar3.e = z;
        }
        return (anay) aihfVarCreateBuilder.build();
    }
}
