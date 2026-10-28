package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ubk extends agdy {
    @Override // defpackage.agdy
    protected final /* synthetic */ Object a(Object obj) {
        audz audzVar = (audz) obj;
        aihf aihfVarCreateBuilder = andf.a.createBuilder();
        if (audzVar.b == 1 && a.aS(1) == 2) {
            anbw anbwVar = (anbw) uel.a.b(audzVar.b == 1 ? (aucu) audzVar.c : aucu.a);
            aihfVarCreateBuilder.copyOnWrite();
            andf andfVar = (andf) aihfVarCreateBuilder.instance;
            anbwVar.getClass();
            andfVar.c = anbwVar;
            andfVar.b = 1;
        }
        return (andf) aihfVarCreateBuilder.build();
    }
}
