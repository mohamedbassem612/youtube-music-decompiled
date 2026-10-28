package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class ucm extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auck auckVar = (auck) obj;
        aihf aihfVarCreateBuilder = anbm.a.createBuilder();
        if ((auckVar.b & 1) != 0) {
            int i = auckVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            anbm anbmVar = (anbm) aihfVarCreateBuilder.instance;
            anbmVar.b |= 1;
            anbmVar.c = i;
        }
        if ((auckVar.b & 2) != 0) {
            int i2 = auckVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            anbm anbmVar2 = (anbm) aihfVarCreateBuilder.instance;
            anbmVar2.b |= 2;
            anbmVar2.d = i2;
        }
        return (anbm) aihfVarCreateBuilder.build();
    }
}
