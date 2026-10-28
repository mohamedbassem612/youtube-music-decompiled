package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class wug extends wlu {
    public alyn a;
    public int b;

    public wug(abxv abxvVar, zwa zwaVar) {
        super("get_survey", abxvVar, zwaVar, 1, true, null, null);
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alyo.a.createBuilder();
        alyn alynVar = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        alyo alyoVar = (alyo) aihfVarCreateBuilder.instance;
        alynVar.getClass();
        alyoVar.d = alynVar;
        alyoVar.b |= 2;
        int i = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        alyo alyoVar2 = (alyo) aihfVarCreateBuilder.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        alyoVar2.e = i2;
        alyoVar2.b |= 4;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        this.a.getClass();
    }
}
