package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ubf extends agdy {
    @Override // defpackage.agdy
    protected final /* synthetic */ Object a(Object obj) {
        audv audvVar = (audv) obj;
        aihf aihfVarCreateBuilder = andb.a.createBuilder();
        int i = audvVar.b;
        if (i == 1 && a.aU(1) == 2) {
            anct anctVar = (anct) uei.a.b(i == 1 ? (audn) audvVar.c : audn.a);
            aihfVarCreateBuilder.copyOnWrite();
            andb andbVar = (andb) aihfVarCreateBuilder.instance;
            anctVar.getClass();
            andbVar.c = anctVar;
            andbVar.b = 1;
        }
        return (andb) aihfVarCreateBuilder.build();
    }
}
