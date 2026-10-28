package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class ucq extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auco aucoVar = (auco) obj;
        aihf aihfVarCreateBuilder = anbq.a.createBuilder();
        if ((aucoVar.b & 1) != 0) {
            boolean z = aucoVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            anbq anbqVar = (anbq) aihfVarCreateBuilder.instance;
            anbqVar.b |= 1;
            anbqVar.c = z;
        }
        if ((aucoVar.b & 2) != 0) {
            boolean z2 = aucoVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            anbq anbqVar2 = (anbq) aihfVarCreateBuilder.instance;
            anbqVar2.b |= 2;
            anbqVar2.d = z2;
        }
        return (anbq) aihfVarCreateBuilder.build();
    }
}
