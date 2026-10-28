package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class uaf extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aubo auboVar = (aubo) obj;
        aihf aihfVarCreateBuilder = anaq.a.createBuilder();
        if ((auboVar.b & 1) != 0) {
            aigu aiguVar = auboVar.c;
            if (aiguVar == null) {
                aiguVar = aigu.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            anaq anaqVar = (anaq) aihfVarCreateBuilder.instance;
            aiguVar.getClass();
            anaqVar.c = aiguVar;
            anaqVar.b |= 1;
        }
        if ((auboVar.b & 2) != 0) {
            long j = auboVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            anaq anaqVar2 = (anaq) aihfVarCreateBuilder.instance;
            anaqVar2.b |= 2;
            anaqVar2.d = j;
        }
        return (anaq) aihfVarCreateBuilder.build();
    }
}
