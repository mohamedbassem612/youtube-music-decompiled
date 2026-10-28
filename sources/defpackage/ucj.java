package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ucj extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auci auciVar = (auci) obj;
        aihf aihfVarCreateBuilder = anbk.a.createBuilder();
        if ((auciVar.b & 1) != 0) {
            agdy agdyVar = ufc.a;
            audh audhVarA = audh.a(auciVar.c);
            if (audhVarA == null) {
                audhVarA = audh.MEDIA_ENGINE_SEGMENT_TYPE_UNKNOWN;
            }
            ancj ancjVar = (ancj) agdyVar.b(audhVarA);
            aihfVarCreateBuilder.copyOnWrite();
            anbk anbkVar = (anbk) aihfVarCreateBuilder.instance;
            anbkVar.c = ancjVar.j;
            anbkVar.b |= 1;
        }
        return (anbk) aihfVarCreateBuilder.build();
    }
}
