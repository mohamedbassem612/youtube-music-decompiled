package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
class ubv extends agdy {
    @Override // defpackage.agdy
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        auel auelVar = (auel) obj;
        aihf aihfVarCreateBuilder = ands.a.createBuilder();
        if ((auelVar.b & 1) != 0) {
            agdy agdyVar = uer.a;
            audf audfVarA = audf.a(auelVar.c);
            if (audfVarA == null) {
                audfVarA = audf.MEDIA_ENGINE_PLAYER_STATE_UNKNOWN;
            }
            anci anciVar = (anci) agdyVar.b(audfVarA);
            aihfVarCreateBuilder.copyOnWrite();
            ands andsVar = (ands) aihfVarCreateBuilder.instance;
            andsVar.c = anciVar.g;
            andsVar.b |= 1;
        }
        if ((auelVar.b & 2) != 0) {
            long j = auelVar.d;
            aihfVarCreateBuilder.copyOnWrite();
            ands andsVar2 = (ands) aihfVarCreateBuilder.instance;
            andsVar2.b |= 2;
            andsVar2.d = j;
        }
        return (ands) aihfVarCreateBuilder.build();
    }
}
