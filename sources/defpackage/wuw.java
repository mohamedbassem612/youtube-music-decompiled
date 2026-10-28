package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class wuw extends wlu {
    public String a;

    public wuw(abxv abxvVar, zwa zwaVar) {
        super("ypc/get_offline_upsell", abxvVar, zwaVar, 1, true, null, null);
        this.a = "";
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = amam.a.createBuilder();
        String str = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        amam amamVar = (amam) aihfVarCreateBuilder.instance;
        str.getClass();
        amamVar.b |= 2;
        amamVar.d = str;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        typ.f(this.a);
    }
}
