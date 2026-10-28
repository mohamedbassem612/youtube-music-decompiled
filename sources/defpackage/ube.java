package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ube extends agdy {
    @Override // defpackage.agdy
    protected final /* synthetic */ Object a(Object obj) {
        audu auduVar = (audu) obj;
        aihf aihfVarCreateBuilder = anda.a.createBuilder();
        int i = auduVar.b;
        if (i == 1 && a.aU(1) == 2) {
            ancs ancsVar = (ancs) ueh.a.b(i == 1 ? (audm) auduVar.c : audm.a);
            aihfVarCreateBuilder.copyOnWrite();
            anda andaVar = (anda) aihfVarCreateBuilder.instance;
            ancsVar.getClass();
            andaVar.c = ancsVar;
            andaVar.b = 1;
        }
        return (anda) aihfVarCreateBuilder.build();
    }
}
