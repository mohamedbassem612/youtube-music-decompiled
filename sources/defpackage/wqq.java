package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class wqq extends wlu {
    public aigj a;

    public wqq(abxv abxvVar, zwa zwaVar) {
        super("live_chat/get_item_context_menu", abxvVar, zwaVar, 1, true, null, null);
        this.a = aigj.d;
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alrp.a.createBuilder();
        aigj aigjVar = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        alrp alrpVar = (alrp) aihfVarCreateBuilder.instance;
        aigjVar.getClass();
        alrpVar.b |= 2;
        alrpVar.d = aigjVar;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
    }
}
