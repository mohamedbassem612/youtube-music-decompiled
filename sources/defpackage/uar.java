package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class uar extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aubz aubzVar = (aubz) obj;
        aihf aihfVarCreateBuilder = anbb.a.createBuilder();
        if ((aubzVar.b & 1) != 0) {
            aigu aiguVar = aubzVar.c;
            if (aiguVar == null) {
                aiguVar = aigu.a;
            }
            aihfVarCreateBuilder.copyOnWrite();
            anbb anbbVar = (anbb) aihfVarCreateBuilder.instance;
            aiguVar.getClass();
            anbbVar.c = aiguVar;
            anbbVar.b |= 1;
        }
        return (anbb) aihfVarCreateBuilder.build();
    }
}
