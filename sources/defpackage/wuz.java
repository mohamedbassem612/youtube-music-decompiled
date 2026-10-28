package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wuz extends wlu {
    public String a;
    public long b;

    public wuz(abxv abxvVar, zwa zwaVar) {
        super("ypc/pause_subscription", abxvVar, zwaVar, 1, false, null, null);
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alui.a.createBuilder();
        String str = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        alui aluiVar = (alui) aihfVarCreateBuilder.instance;
        str.getClass();
        aluiVar.b |= 2;
        aluiVar.d = str;
        long j = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        alui aluiVar2 = (alui) aihfVarCreateBuilder.instance;
        aluiVar2.b |= 4;
        aluiVar2.e = j;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        this.a.getClass();
        ahno.P(this.b > 0, "resume time must be specified");
    }
}
