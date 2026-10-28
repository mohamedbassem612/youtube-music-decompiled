package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class uct extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aucr aucrVar = (aucr) obj;
        aihf aihfVarCreateBuilder = anbt.a.createBuilder();
        if ((aucrVar.b & 1) != 0) {
            agdy agdyVar = ufi.a;
            audi audiVarA = audi.a(aucrVar.c);
            if (audiVarA == null) {
                audiVarA = audi.MEDIA_ENGINE_TRANSMUXING_DECISION_UNSPECIFIED;
            }
            ancl anclVar = (ancl) agdyVar.b(audiVarA);
            aihfVarCreateBuilder.copyOnWrite();
            anbt anbtVar = (anbt) aihfVarCreateBuilder.instance;
            anbtVar.c = anclVar.e;
            anbtVar.b |= 1;
        }
        if ((aucrVar.b & 2) != 0) {
            agdy agdyVar2 = ufi.a;
            audi audiVarA2 = audi.a(aucrVar.d);
            if (audiVarA2 == null) {
                audiVarA2 = audi.MEDIA_ENGINE_TRANSMUXING_DECISION_UNSPECIFIED;
            }
            ancl anclVar2 = (ancl) agdyVar2.b(audiVarA2);
            aihfVarCreateBuilder.copyOnWrite();
            anbt anbtVar2 = (anbt) aihfVarCreateBuilder.instance;
            anbtVar2.d = anclVar2.e;
            anbtVar2.b |= 2;
        }
        return (anbt) aihfVarCreateBuilder.build();
    }
}
