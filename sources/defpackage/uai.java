package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class uai extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aubr aubrVar = (aubr) obj;
        aihf aihfVarCreateBuilder = anat.a.createBuilder();
        if ((aubrVar.b & 1) != 0) {
            int i = aubrVar.c;
            aihfVarCreateBuilder.copyOnWrite();
            anat anatVar = (anat) aihfVarCreateBuilder.instance;
            anatVar.b |= 1;
            anatVar.c = i;
        }
        return (anat) aihfVarCreateBuilder.build();
    }
}
