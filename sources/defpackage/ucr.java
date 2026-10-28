package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ucr extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aucp aucpVar = (aucp) obj;
        aihf aihfVarCreateBuilder = anbr.a.createBuilder();
        if ((aucpVar.b & 1) != 0) {
            agdy agdyVar = ufh.a;
            aucg aucgVar = aucpVar.c;
            if (aucgVar == null) {
                aucgVar = aucg.a;
            }
            anbi anbiVar = (anbi) agdyVar.b(aucgVar);
            aihfVarCreateBuilder.copyOnWrite();
            anbr anbrVar = (anbr) aihfVarCreateBuilder.instance;
            anbiVar.getClass();
            anbrVar.c = anbiVar;
            anbrVar.b |= 1;
        }
        if ((aucpVar.b & 2) != 0) {
            agdy agdyVar2 = ufh.a;
            aucg aucgVar2 = aucpVar.d;
            if (aucgVar2 == null) {
                aucgVar2 = aucg.a;
            }
            anbi anbiVar2 = (anbi) agdyVar2.b(aucgVar2);
            aihfVarCreateBuilder.copyOnWrite();
            anbr anbrVar2 = (anbr) aihfVarCreateBuilder.instance;
            anbiVar2.getClass();
            anbrVar2.d = anbiVar2;
            anbrVar2.b |= 2;
        }
        return (anbr) aihfVarCreateBuilder.build();
    }
}
