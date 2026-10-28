package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ubo extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auee aueeVar = (auee) obj;
        aihf aihfVarCreateBuilder = andl.a.createBuilder();
        if ((aueeVar.b & 1) != 0) {
            long j = aueeVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            andl andlVar = (andl) aihfVarCreateBuilder.instance;
            andlVar.b |= 1;
            andlVar.c = j;
        }
        return (andl) aihfVarCreateBuilder.build();
    }
}
