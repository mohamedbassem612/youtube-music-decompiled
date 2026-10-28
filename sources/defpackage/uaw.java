package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class uaw extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        audm audmVar = (audm) obj;
        aihf aihfVarCreateBuilder = ancs.a.createBuilder();
        if ((audmVar.b & 1) != 0) {
            agdy agdyVar = uea.a;
            audo audoVar = audmVar.c;
            if (audoVar == null) {
                audoVar = audo.a;
            }
            ancu ancuVar = (ancu) agdyVar.b(audoVar);
            aihfVarCreateBuilder.copyOnWrite();
            ancs ancsVar = (ancs) aihfVarCreateBuilder.instance;
            ancuVar.getClass();
            ancsVar.c = ancuVar;
            ancsVar.b |= 1;
        }
        if ((audmVar.b & 2) != 0) {
            String str = audmVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            ancs ancsVar2 = (ancs) aihfVarCreateBuilder.instance;
            str.getClass();
            ancsVar2.b |= 2;
            ancsVar2.d = str;
        }
        if ((audmVar.b & 4) != 0) {
            agdy agdyVar2 = uea.a;
            audo audoVar2 = audmVar.e;
            if (audoVar2 == null) {
                audoVar2 = audo.a;
            }
            ancu ancuVar2 = (ancu) agdyVar2.b(audoVar2);
            aihfVarCreateBuilder.copyOnWrite();
            ancs ancsVar3 = (ancs) aihfVarCreateBuilder.instance;
            ancuVar2.getClass();
            ancsVar3.e = ancuVar2;
            ancsVar3.b |= 4;
        }
        return (ancs) aihfVarCreateBuilder.build();
    }
}
