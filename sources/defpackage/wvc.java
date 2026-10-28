package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class wvc extends wlu {
    public String a;

    public wvc(abxv abxvVar, zwa zwaVar) {
        super("ypc/resume_subscription", abxvVar, zwaVar, 1, false, null, null);
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alxa.a.createBuilder();
        String str = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        alxa alxaVar = (alxa) aihfVarCreateBuilder.instance;
        str.getClass();
        alxaVar.b |= 2;
        alxaVar.d = str;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        this.a.getClass();
    }
}
