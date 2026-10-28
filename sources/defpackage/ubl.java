package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ubl extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auea aueaVar = (auea) obj;
        aihf aihfVarCreateBuilder = andg.a.createBuilder();
        if ((aueaVar.b & 1) != 0) {
            int i = aueaVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            andg andgVar = (andg) aihfVarCreateBuilder.instance;
            andgVar.b |= 1;
            andgVar.c = i;
        }
        return (andg) aihfVarCreateBuilder.build();
    }
}
