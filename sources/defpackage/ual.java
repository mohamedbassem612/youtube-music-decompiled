package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ual extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aubu aubuVar = (aubu) obj;
        aihf aihfVarCreateBuilder = anaw.a.createBuilder();
        if ((aubuVar.b & 1) != 0) {
            agdy agdyVar = udt.b;
            auby aubyVar = aubuVar.c;
            if (aubyVar == null) {
                aubyVar = auby.a;
            }
            anba anbaVar = (anba) agdyVar.b(aubyVar);
            aihfVarCreateBuilder.copyOnWrite();
            anaw anawVar = (anaw) aihfVarCreateBuilder.instance;
            anbaVar.getClass();
            anawVar.c = anbaVar;
            anawVar.b |= 1;
        }
        if ((aubuVar.b & 2) != 0) {
            agdy agdyVar2 = udt.a;
            aubo auboVar = aubuVar.d;
            if (auboVar == null) {
                auboVar = aubo.a;
            }
            anaq anaqVar = (anaq) agdyVar2.b(auboVar);
            aihfVarCreateBuilder.copyOnWrite();
            anaw anawVar2 = (anaw) aihfVarCreateBuilder.instance;
            anaqVar.getClass();
            anawVar2.d = anaqVar;
            anawVar2.b |= 2;
        }
        if ((aubuVar.b & 4) != 0) {
            agdy agdyVar3 = udt.c;
            aucg aucgVar = aubuVar.e;
            if (aucgVar == null) {
                aucgVar = aucg.a;
            }
            anbi anbiVar = (anbi) agdyVar3.b(aucgVar);
            aihfVarCreateBuilder.copyOnWrite();
            anaw anawVar3 = (anaw) aihfVarCreateBuilder.instance;
            anbiVar.getClass();
            anawVar3.e = anbiVar;
            anawVar3.b |= 4;
        }
        if ((aubuVar.b & 8) != 0) {
            boolean z = aubuVar.f;
            aihfVarCreateBuilder.copyOnWrite();
            anaw anawVar4 = (anaw) aihfVarCreateBuilder.instance;
            anawVar4.b |= 8;
            anawVar4.f = z;
        }
        return (anaw) aihfVarCreateBuilder.build();
    }
}
