package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wri extends wlu {
    public aigj a;
    public aigj b;

    public wri(abxv abxvVar, zwa zwaVar) {
        super("notification/opt_out", abxvVar, zwaVar, 1, true, null, null);
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alti.a.createBuilder();
        aigj aigjVar = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        alti altiVar = (alti) aihfVarCreateBuilder.instance;
        aigjVar.getClass();
        altiVar.b |= 4;
        altiVar.d = aigjVar;
        aigj aigjVar2 = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        alti altiVar2 = (alti) aihfVarCreateBuilder.instance;
        aigjVar2.getClass();
        altiVar2.b |= 32;
        altiVar2.e = aigjVar2;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
    }
}
