package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class uae extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aubn aubnVar = (aubn) obj;
        aihf aihfVarCreateBuilder = anap.a.createBuilder();
        if ((aubnVar.b & 1) != 0) {
            aigu aiguVar = aubnVar.c;
            if (aiguVar == null) {
                aiguVar = aigu.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            anap anapVar = (anap) aihfVarCreateBuilder.instance;
            aiguVar.getClass();
            anapVar.c = aiguVar;
            anapVar.b |= 1;
        }
        if ((aubnVar.b & 2) != 0) {
            String str = aubnVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            anap anapVar2 = (anap) aihfVarCreateBuilder.instance;
            str.getClass();
            anapVar2.b |= 2;
            anapVar2.d = str;
        }
        return (anap) aihfVarCreateBuilder.build();
    }
}
