package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class uco extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aucm aucmVar = (aucm) obj;
        aihf aihfVarCreateBuilder = anbo.a.createBuilder();
        if ((aucmVar.b & 1) != 0) {
            agdy agdyVar = uff.b;
            auby aubyVar = aucmVar.c;
            if (aubyVar == null) {
                aubyVar = auby.a;
            }
            anba anbaVar = (anba) agdyVar.b(aubyVar);
            aihfVarCreateBuilder.copyOnWrite();
            anbo anboVar = (anbo) aihfVarCreateBuilder.instance;
            anbaVar.getClass();
            anboVar.c = anbaVar;
            anboVar.b |= 1;
        }
        if ((aucmVar.b & 2) != 0) {
            boolean z = aucmVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            anbo anboVar2 = (anbo) aihfVarCreateBuilder.instance;
            anboVar2.b |= 2;
            anboVar2.d = z;
        }
        if ((aucmVar.b & 4) != 0) {
            agdy agdyVar2 = uff.a;
            auck auckVar = aucmVar.e;
            if (auckVar == null) {
                auckVar = auck.a;
            }
            anbm anbmVar = (anbm) agdyVar2.b(auckVar);
            aihfVarCreateBuilder.copyOnWrite();
            anbo anboVar3 = (anbo) aihfVarCreateBuilder.instance;
            anbmVar.getClass();
            anboVar3.e = anbmVar;
            anboVar3.b |= 4;
        }
        return (anbo) aihfVarCreateBuilder.build();
    }
}
