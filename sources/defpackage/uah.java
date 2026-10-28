package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class uah extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aubq aubqVar = (aubq) obj;
        aihf aihfVarCreateBuilder = anas.a.createBuilder();
        if ((aubqVar.b & 1) != 0) {
            int i = aubqVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            anas anasVar = (anas) aihfVarCreateBuilder.instance;
            anasVar.b |= 1;
            anasVar.c = i;
        }
        if ((aubqVar.b & 2) != 0) {
            int i2 = aubqVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            anas anasVar2 = (anas) aihfVarCreateBuilder.instance;
            anasVar2.b |= 2;
            anasVar2.d = i2;
        }
        return (anas) aihfVarCreateBuilder.build();
    }
}
