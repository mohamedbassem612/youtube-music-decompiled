package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ucl extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aucj aucjVar = (aucj) obj;
        aihf aihfVarCreateBuilder = anbl.a.createBuilder();
        if ((aucjVar.b & 1) != 0) {
            agdy agdyVar = ufd.a;
            auby aubyVar = aucjVar.c;
            if (aubyVar == null) {
                aubyVar = auby.a;
            }
            anba anbaVar = (anba) agdyVar.b(aubyVar);
            aihfVarCreateBuilder.copyOnWrite();
            anbl anblVar = (anbl) aihfVarCreateBuilder.instance;
            anbaVar.getClass();
            anblVar.c = anbaVar;
            anblVar.b |= 1;
        }
        if ((aucjVar.b & 2) != 0) {
            int i = aucjVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            anbl anblVar2 = (anbl) aihfVarCreateBuilder.instance;
            anblVar2.b |= 2;
            anblVar2.d = i;
        }
        return (anbl) aihfVarCreateBuilder.build();
    }
}
