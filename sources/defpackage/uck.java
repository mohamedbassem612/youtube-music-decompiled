package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class uck extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aueu aueuVar = (aueu) obj;
        aihf aihfVarCreateBuilder = aneg.a.createBuilder();
        if ((aueuVar.b & 1) != 0) {
            long j = aueuVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            aneg anegVar = (aneg) aihfVarCreateBuilder.instance;
            anegVar.b |= 1;
            anegVar.c = j;
        }
        return (aneg) aihfVarCreateBuilder.build();
    }
}
