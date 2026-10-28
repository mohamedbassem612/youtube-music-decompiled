package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class ucf extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auce auceVar = (auce) obj;
        aihf aihfVarCreateBuilder = anbg.a.createBuilder();
        if ((auceVar.b & 1) != 0) {
            int i = auceVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            anbg anbgVar = (anbg) aihfVarCreateBuilder.instance;
            anbgVar.b |= 1;
            anbgVar.c = i;
        }
        if ((auceVar.b & 2) != 0) {
            int i2 = auceVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            anbg anbgVar2 = (anbg) aihfVarCreateBuilder.instance;
            anbgVar2.b |= 2;
            anbgVar2.d = i2;
        }
        if ((auceVar.b & 4) != 0) {
            int i3 = auceVar.e;
            aihfVarCreateBuilder.copyOnWrite();
            anbg anbgVar3 = (anbg) aihfVarCreateBuilder.instance;
            anbgVar3.b |= 4;
            anbgVar3.e = i3;
        }
        if ((auceVar.b & 8) != 0) {
            int i4 = auceVar.f;
            aihfVarCreateBuilder.copyOnWrite();
            anbg anbgVar4 = (anbg) aihfVarCreateBuilder.instance;
            anbgVar4.b |= 8;
            anbgVar4.f = i4;
        }
        return (anbg) aihfVarCreateBuilder.build();
    }
}
