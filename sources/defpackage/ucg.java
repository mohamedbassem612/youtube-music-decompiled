package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
class ucg extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aucf aucfVar = (aucf) obj;
        aihf aihfVarCreateBuilder = anbh.a.createBuilder();
        if ((aucfVar.b & 1) != 0) {
            agdy agdyVar = uez.a;
            aucg aucgVar = aucfVar.c;
            if (aucgVar == null) {
                aucgVar = aucg.a;
            }
            anbi anbiVar = (anbi) agdyVar.b(aucgVar);
            aihfVarCreateBuilder.copyOnWrite();
            anbh anbhVar = (anbh) aihfVarCreateBuilder.instance;
            anbiVar.getClass();
            anbhVar.c = anbiVar;
            anbhVar.b |= 1;
        }
        return (anbh) aihfVarCreateBuilder.build();
    }
}
