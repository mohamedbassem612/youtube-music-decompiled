package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class uad extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aubm aubmVar = (aubm) obj;
        aihf aihfVarCreateBuilder = anao.a.createBuilder();
        if ((aubmVar.b & 1) != 0) {
            boolean z = aubmVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            anao anaoVar = (anao) aihfVarCreateBuilder.instance;
            anaoVar.b |= 1;
            anaoVar.c = z;
        }
        if ((aubmVar.b & 2) != 0) {
            agdy agdyVar = udp.a;
            aubn aubnVar = aubmVar.d;
            if (aubnVar == null) {
                aubnVar = aubn.a;
            }
            anap anapVar = (anap) agdyVar.b(aubnVar);
            aihfVarCreateBuilder.copyOnWrite();
            anao anaoVar2 = (anao) aihfVarCreateBuilder.instance;
            anapVar.getClass();
            anaoVar2.d = anapVar;
            anaoVar2.b |= 2;
        }
        if ((aubmVar.b & 4) != 0) {
            agdy agdyVar2 = udp.b;
            aubq aubqVar = aubmVar.e;
            if (aubqVar == null) {
                aubqVar = aubq.a;
            }
            anas anasVar = (anas) agdyVar2.b(aubqVar);
            aihfVarCreateBuilder.copyOnWrite();
            anao anaoVar3 = (anao) aihfVarCreateBuilder.instance;
            anasVar.getClass();
            anaoVar3.e = anasVar;
            anaoVar3.b |= 4;
        }
        if ((aubmVar.b & 8) != 0) {
            boolean z2 = aubmVar.f;
            aihfVarCreateBuilder.copyOnWrite();
            anao anaoVar4 = (anao) aihfVarCreateBuilder.instance;
            anaoVar4.b |= 8;
            anaoVar4.f = z2;
        }
        return (anao) aihfVarCreateBuilder.build();
    }
}
