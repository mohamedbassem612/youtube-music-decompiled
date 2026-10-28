package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wrd extends wlu {
    public aigj a;
    public String b;
    public amqw c;
    public String d;

    public wrd(abxv abxvVar, zwa zwaVar) {
        super("live_chat/send_message", abxvVar, zwaVar, 1, true, null, null);
        this.a = aigj.d;
        m();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alxw.a.createBuilder();
        aigj aigjVar = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        alxw alxwVar = (alxw) aihfVarCreateBuilder.instance;
        aigjVar.getClass();
        alxwVar.b |= 2;
        alxwVar.f = aigjVar;
        amqw amqwVar = this.c;
        if (amqwVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alxw alxwVar2 = (alxw) aihfVarCreateBuilder.instance;
            alxwVar2.d = amqwVar;
            alxwVar2.c = 6;
        } else {
            String str = this.b;
            aihfVarCreateBuilder.copyOnWrite();
            alxw alxwVar3 = (alxw) aihfVarCreateBuilder.instance;
            str.getClass();
            alxwVar3.c = 4;
            alxwVar3.d = str;
        }
        String strJ = j(this.d);
        aihfVarCreateBuilder.copyOnWrite();
        alxw alxwVar4 = (alxw) aihfVarCreateBuilder.instance;
        alxwVar4.b |= 4;
        alxwVar4.g = strJ;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
    }
}
