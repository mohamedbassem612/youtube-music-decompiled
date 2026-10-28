package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class uag extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aubp aubpVar = (aubp) obj;
        aihf aihfVarCreateBuilder = anar.a.createBuilder();
        if ((aubpVar.b & 1) != 0) {
            agdy agdyVar = udq.a;
            auby aubyVar = aubpVar.c;
            if (aubyVar == null) {
                aubyVar = auby.a;
            }
            anba anbaVar = (anba) agdyVar.b(aubyVar);
            aihfVarCreateBuilder.copyOnWrite();
            anar anarVar = (anar) aihfVarCreateBuilder.instance;
            anbaVar.getClass();
            anarVar.c = anbaVar;
            anarVar.b |= 1;
        }
        if ((aubpVar.b & 2) != 0) {
            boolean z = aubpVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            anar anarVar2 = (anar) aihfVarCreateBuilder.instance;
            anarVar2.b |= 2;
            anarVar2.d = z;
        }
        if ((aubpVar.b & 4) != 0) {
            boolean z2 = aubpVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            anar anarVar3 = (anar) aihfVarCreateBuilder.instance;
            anarVar3.b |= 4;
            anarVar3.e = z2;
        }
        return (anar) aihfVarCreateBuilder.build();
    }
}
