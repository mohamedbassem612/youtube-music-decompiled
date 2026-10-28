package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class uab extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aubk aubkVar = (aubk) obj;
        aihf aihfVarCreateBuilder = anam.a.createBuilder();
        if ((aubkVar.b & 1) != 0) {
            agdy agdyVar = udo.a;
            auca aucaVar = aubkVar.c;
            if (aucaVar == null) {
                aucaVar = auca.a;
            }
            anbc anbcVar = (anbc) agdyVar.b(aucaVar);
            aihfVarCreateBuilder.copyOnWrite();
            anam anamVar = (anam) aihfVarCreateBuilder.instance;
            anbcVar.getClass();
            anamVar.c = anbcVar;
            anamVar.b |= 1;
        }
        return (anam) aihfVarCreateBuilder.build();
    }
}
