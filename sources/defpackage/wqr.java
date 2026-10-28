package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wqr extends wlu {
    public aigj a;
    public amqw b;

    public wqr(abxv abxvVar, zwa zwaVar) {
        super("live_chat/get_live_chat_message_buy_flow", abxvVar, zwaVar, 1, true, null, null);
        this.a = aigj.d;
        this.b = null;
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alry.a.createBuilder();
        aigj aigjVar = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        alry alryVar = (alry) aihfVarCreateBuilder.instance;
        aigjVar.getClass();
        alryVar.b |= 2;
        alryVar.d = aigjVar;
        amqw amqwVar = this.b;
        if (amqwVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alry alryVar2 = (alry) aihfVarCreateBuilder.instance;
            alryVar2.e = amqwVar;
            alryVar2.b |= 4;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
    }
}
