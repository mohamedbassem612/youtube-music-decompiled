package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ubw extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auem auemVar = (auem) obj;
        aihf aihfVarCreateBuilder = andv.a.createBuilder();
        if ((auemVar.b & 1) != 0) {
            agdy agdyVar = ues.a;
            auer auerVar = auemVar.c;
            if (auerVar == null) {
                auerVar = auer.a;
            }
            aneb anebVar = (aneb) agdyVar.b(auerVar);
            aihfVarCreateBuilder.copyOnWrite();
            andv andvVar = (andv) aihfVarCreateBuilder.instance;
            anebVar.getClass();
            andvVar.c = anebVar;
            andvVar.b |= 1;
        }
        if ((auemVar.b & 2) != 0) {
            agdy agdyVar2 = ues.a;
            auer auerVar2 = auemVar.d;
            if (auerVar2 == null) {
                auerVar2 = auer.a;
            }
            aneb anebVar2 = (aneb) agdyVar2.b(auerVar2);
            aihfVarCreateBuilder.copyOnWrite();
            andv andvVar2 = (andv) aihfVarCreateBuilder.instance;
            anebVar2.getClass();
            andvVar2.d = anebVar2;
            andvVar2.b |= 2;
        }
        return (andv) aihfVarCreateBuilder.build();
    }
}
