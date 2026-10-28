package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class uas extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auca aucaVar = (auca) obj;
        aihf aihfVarCreateBuilder = anbc.a.createBuilder();
        if ((aucaVar.b & 1) != 0) {
            agdy agdyVar = udx.a;
            aubm aubmVar = aucaVar.c;
            if (aubmVar == null) {
                aubmVar = aubm.a;
            }
            anao anaoVar = (anao) agdyVar.b(aubmVar);
            aihfVarCreateBuilder.copyOnWrite();
            anbc anbcVar = (anbc) aihfVarCreateBuilder.instance;
            anaoVar.getClass();
            anbcVar.c = anaoVar;
            anbcVar.b |= 1;
        }
        if ((aucaVar.b & 2) != 0) {
            agdy agdyVar2 = udx.b;
            aubh aubhVar = aucaVar.d;
            if (aubhVar == null) {
                aubhVar = aubh.a;
            }
            anaj anajVar = (anaj) agdyVar2.b(aubhVar);
            aihfVarCreateBuilder.copyOnWrite();
            anbc anbcVar2 = (anbc) aihfVarCreateBuilder.instance;
            anajVar.getClass();
            anbcVar2.d = anajVar;
            anbcVar2.b |= 2;
        }
        return (anbc) aihfVarCreateBuilder.build();
    }
}
