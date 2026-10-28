package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ucv extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auct auctVar = (auct) obj;
        aihf aihfVarCreateBuilder = anbv.a.createBuilder();
        if ((auctVar.b & 1) != 0) {
            agdy agdyVar = ufj.a;
            aucj aucjVar = auctVar.c;
            if (aucjVar == null) {
                aucjVar = aucj.a;
            }
            anbl anblVar = (anbl) agdyVar.b(aucjVar);
            aihfVarCreateBuilder.copyOnWrite();
            anbv anbvVar = (anbv) aihfVarCreateBuilder.instance;
            anblVar.getClass();
            anbvVar.c = anblVar;
            anbvVar.b |= 1;
        }
        if ((auctVar.b & 2) != 0) {
            agdy agdyVar2 = ufj.b;
            aubn aubnVar = auctVar.d;
            if (aubnVar == null) {
                aubnVar = aubn.a;
            }
            anap anapVar = (anap) agdyVar2.b(aubnVar);
            aihfVarCreateBuilder.copyOnWrite();
            anbv anbvVar2 = (anbv) aihfVarCreateBuilder.instance;
            anapVar.getClass();
            anbvVar2.d = anapVar;
            anbvVar2.b |= 2;
        }
        if ((auctVar.b & 4) != 0) {
            agdy agdyVar3 = ufj.c;
            aubq aubqVar = auctVar.e;
            if (aubqVar == null) {
                aubqVar = aubq.a;
            }
            anas anasVar = (anas) agdyVar3.b(aubqVar);
            aihfVarCreateBuilder.copyOnWrite();
            anbv anbvVar3 = (anbv) aihfVarCreateBuilder.instance;
            anasVar.getClass();
            anbvVar3.e = anasVar;
            anbvVar3.b |= 4;
        }
        if ((auctVar.b & 8) != 0) {
            int i = auctVar.f;
            aihfVarCreateBuilder.copyOnWrite();
            anbv anbvVar4 = (anbv) aihfVarCreateBuilder.instance;
            anbvVar4.b |= 8;
            anbvVar4.f = i;
        }
        return (anbv) aihfVarCreateBuilder.build();
    }
}
