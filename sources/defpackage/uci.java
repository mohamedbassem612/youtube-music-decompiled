package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class uci extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auch auchVar = (auch) obj;
        aihf aihfVarCreateBuilder = anbj.a.createBuilder();
        if ((auchVar.b & 1) != 0) {
            agdy agdyVar = ufb.a;
            auce auceVar = auchVar.c;
            if (auceVar == null) {
                auceVar = auce.a;
            }
            anbg anbgVar = (anbg) agdyVar.b(auceVar);
            aihfVarCreateBuilder.copyOnWrite();
            anbj anbjVar = (anbj) aihfVarCreateBuilder.instance;
            anbgVar.getClass();
            anbjVar.c = anbgVar;
            anbjVar.b |= 1;
        }
        if ((auchVar.b & 2) != 0) {
            agdy agdyVar2 = ufb.b;
            aubs aubsVar = auchVar.d;
            if (aubsVar == null) {
                aubsVar = aubs.a;
            }
            anau anauVar = (anau) agdyVar2.b(aubsVar);
            aihfVarCreateBuilder.copyOnWrite();
            anbj anbjVar2 = (anbj) aihfVarCreateBuilder.instance;
            anauVar.getClass();
            anbjVar2.d = anauVar;
            anbjVar2.b |= 2;
        }
        return (anbj) aihfVarCreateBuilder.build();
    }
}
