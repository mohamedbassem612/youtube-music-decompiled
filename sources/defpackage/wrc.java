package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wrc extends wlu {
    public aigj a;

    public wrc(abxv abxvVar, zwa zwaVar) {
        super("live_chat/moderate", abxvVar, zwaVar, 1, true, null, null);
        this.a = aigj.d;
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alrs.a.createBuilder();
        aigj aigjVar = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        alrs alrsVar = (alrs) aihfVarCreateBuilder.instance;
        aigjVar.getClass();
        alrsVar.b |= 2;
        alrsVar.d = aigjVar;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
    }
}
