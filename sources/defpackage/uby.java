package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class uby extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aueo aueoVar = (aueo) obj;
        aihf aihfVarCreateBuilder = andx.a.createBuilder();
        if ((aueoVar.b & 1) != 0) {
            agdy agdyVar = ueu.a;
            auen auenVar = aueoVar.c;
            if (auenVar == null) {
                auenVar = auen.a;
            }
            andw andwVar = (andw) agdyVar.b(auenVar);
            aihfVarCreateBuilder.copyOnWrite();
            andx andxVar = (andx) aihfVarCreateBuilder.instance;
            andwVar.getClass();
            andxVar.c = andwVar;
            andxVar.b |= 1;
        }
        if ((aueoVar.b & 2) != 0) {
            agdy agdyVar2 = ueu.a;
            auen auenVar2 = aueoVar.d;
            if (auenVar2 == null) {
                auenVar2 = auen.a;
            }
            andw andwVar2 = (andw) agdyVar2.b(auenVar2);
            aihfVarCreateBuilder.copyOnWrite();
            andx andxVar2 = (andx) aihfVarCreateBuilder.instance;
            andwVar2.getClass();
            andxVar2.d = andwVar2;
            andxVar2.b |= 2;
        }
        if ((aueoVar.b & 4) != 0) {
            long j = aueoVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            andx andxVar3 = (andx) aihfVarCreateBuilder.instance;
            andxVar3.b |= 4;
            andxVar3.e = j;
        }
        return (andx) aihfVarCreateBuilder.build();
    }
}
