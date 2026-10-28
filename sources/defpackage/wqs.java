package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wqs extends wlu {
    public amnx a;

    public wqs(abxv abxvVar, zwa zwaVar) {
        super("live_chat/get_live_chat_replay", abxvVar, zwaVar, 1, true, null, null);
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alsb.a.createBuilder();
        String str = this.i;
        aihfVarCreateBuilder.copyOnWrite();
        alsb alsbVar = (alsb) aihfVarCreateBuilder.instance;
        str.getClass();
        alsbVar.b |= 4;
        alsbVar.d = str;
        amnx amnxVar = this.a;
        if (amnxVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alsb alsbVar2 = (alsb) aihfVarCreateBuilder.instance;
            alsbVar2.e = amnxVar;
            alsbVar2.b |= 8;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
    }
}
