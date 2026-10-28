package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class uca extends agdy {
    @Override // defpackage.agdy
    protected final /* synthetic */ Object a(Object obj) {
        aueq aueqVar = (aueq) obj;
        aihf aihfVarCreateBuilder = anea.a.createBuilder();
        int i = aueqVar.b;
        if (i == 1 && a.aU(1) == 2) {
            ancy ancyVar = (ancy) uew.a.b(i == 1 ? (auds) aueqVar.c : auds.a);
            aihfVarCreateBuilder.copyOnWrite();
            anea aneaVar = (anea) aihfVarCreateBuilder.instance;
            ancyVar.getClass();
            aneaVar.c = ancyVar;
            aneaVar.b = 1;
        }
        return (anea) aihfVarCreateBuilder.build();
    }
}
