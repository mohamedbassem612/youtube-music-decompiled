package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class tzx extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aubg aubgVar = (aubg) obj;
        aihf aihfVarCreateBuilder = anai.a.createBuilder();
        if ((aubgVar.b & 1) != 0) {
            agdy agdyVar = udl.a;
            aubt aubtVar = aubgVar.c;
            if (aubtVar == null) {
                aubtVar = aubt.a;
            }
            anav anavVar = (anav) agdyVar.b(aubtVar);
            aihfVarCreateBuilder.copyOnWrite();
            anai anaiVar = (anai) aihfVarCreateBuilder.instance;
            anavVar.getClass();
            anaiVar.c = anavVar;
            anaiVar.b |= 1;
        }
        if ((aubgVar.b & 2) != 0) {
            boolean z = aubgVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            anai anaiVar2 = (anai) aihfVarCreateBuilder.instance;
            anaiVar2.b |= 2;
            anaiVar2.d = z;
        }
        if ((aubgVar.b & 4) != 0) {
            boolean z2 = aubgVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            anai anaiVar3 = (anai) aihfVarCreateBuilder.instance;
            anaiVar3.b |= 4;
            anaiVar3.e = z2;
        }
        return (anai) aihfVarCreateBuilder.build();
    }
}
