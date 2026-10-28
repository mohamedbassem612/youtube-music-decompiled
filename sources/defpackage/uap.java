package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class uap extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aubx aubxVar = (aubx) obj;
        aihf aihfVarCreateBuilder = anaz.a.createBuilder();
        if ((aubxVar.b & 1) != 0) {
            agdy agdyVar = udw.a;
            aubw aubwVar = aubxVar.c;
            if (aubwVar == null) {
                aubwVar = aubw.a;
            }
            anay anayVar = (anay) agdyVar.b(aubwVar);
            aihfVarCreateBuilder.copyOnWrite();
            anaz anazVar = (anaz) aihfVarCreateBuilder.instance;
            anayVar.getClass();
            anazVar.c = anayVar;
            anazVar.b |= 1;
        }
        if ((aubxVar.b & 2) != 0) {
            agdy agdyVar2 = udw.b;
            aubp aubpVar = aubxVar.d;
            if (aubpVar == null) {
                aubpVar = aubp.a;
            }
            anar anarVar = (anar) agdyVar2.b(aubpVar);
            aihfVarCreateBuilder.copyOnWrite();
            anaz anazVar2 = (anaz) aihfVarCreateBuilder.instance;
            anarVar.getClass();
            anazVar2.d = anarVar;
            anazVar2.b |= 2;
        }
        if ((aubxVar.b & 4) != 0) {
            agdy agdyVar3 = udw.c;
            aubv aubvVar = aubxVar.e;
            if (aubvVar == null) {
                aubvVar = aubv.a;
            }
            anax anaxVar = (anax) agdyVar3.b(aubvVar);
            aihfVarCreateBuilder.copyOnWrite();
            anaz anazVar3 = (anaz) aihfVarCreateBuilder.instance;
            anaxVar.getClass();
            anazVar3.e = anaxVar;
            anazVar3.b |= 4;
        }
        if ((aubxVar.b & 8) != 0) {
            int i = aubxVar.f;
            aihfVarCreateBuilder.copyOnWrite();
            anaz anazVar4 = (anaz) aihfVarCreateBuilder.instance;
            anazVar4.b |= 8;
            anazVar4.f = i;
        }
        return (anaz) aihfVarCreateBuilder.build();
    }
}
