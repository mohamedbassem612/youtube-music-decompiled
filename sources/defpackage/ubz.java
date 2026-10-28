package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ubz extends agdy {
    @Override // defpackage.agdy
    protected final /* synthetic */ Object a(Object obj) {
        auep auepVar = (auep) obj;
        aihf aihfVarCreateBuilder = andz.a.createBuilder();
        int i = auepVar.b;
        if (i == 1 && a.aU(1) == 2) {
            ancx ancxVar = (ancx) uev.a.b(i == 1 ? (audr) auepVar.c : audr.a);
            aihfVarCreateBuilder.copyOnWrite();
            andz andzVar = (andz) aihfVarCreateBuilder.instance;
            ancxVar.getClass();
            andzVar.c = ancxVar;
            andzVar.b = 1;
        }
        return (andz) aihfVarCreateBuilder.build();
    }
}
