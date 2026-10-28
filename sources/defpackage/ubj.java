package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ubj extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aucu aucuVar = (aucu) obj;
        aihf aihfVarCreateBuilder = anbw.a.createBuilder();
        if ((aucuVar.b & 1) != 0) {
            agdy agdyVar = uek.b;
            aucf aucfVar = aucuVar.c;
            if (aucfVar == null) {
                aucfVar = aucf.a;
            }
            anbh anbhVar = (anbh) agdyVar.b(aucfVar);
            aihfVarCreateBuilder.copyOnWrite();
            anbw anbwVar = (anbw) aihfVarCreateBuilder.instance;
            anbhVar.getClass();
            anbwVar.c = anbhVar;
            anbwVar.b |= 1;
        }
        if ((aucuVar.b & 2) != 0) {
            agdy agdyVar2 = uek.a;
            aubx aubxVar = aucuVar.d;
            if (aubxVar == null) {
                aubxVar = aubx.a;
            }
            anaz anazVar = (anaz) agdyVar2.b(aubxVar);
            aihfVarCreateBuilder.copyOnWrite();
            anbw anbwVar2 = (anbw) aihfVarCreateBuilder.instance;
            anazVar.getClass();
            anbwVar2.d = anazVar;
            anbwVar2.b |= 2;
        }
        if ((aucuVar.b & 4) != 0) {
            agdy agdyVar3 = uek.c;
            auch auchVar = aucuVar.e;
            if (auchVar == null) {
                auchVar = auch.a;
            }
            anbj anbjVar = (anbj) agdyVar3.b(auchVar);
            aihfVarCreateBuilder.copyOnWrite();
            anbw anbwVar3 = (anbw) aihfVarCreateBuilder.instance;
            anbjVar.getClass();
            anbwVar3.e = anbjVar;
            anbwVar3.b |= 4;
        }
        return (anbw) aihfVarCreateBuilder.build();
    }
}
