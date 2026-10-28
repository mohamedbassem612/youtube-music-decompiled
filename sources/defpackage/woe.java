package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class woe extends wlu {
    public String a;
    public String b;

    public woe(abxv abxvVar, zwa zwaVar, String str, boolean z, byte[] bArr) {
        super("att/log", abxvVar, zwaVar, 1, false, str, Boolean.valueOf(z));
        this.a = "";
        this.b = "";
        l(bArr);
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alsl.a.createBuilder();
        String str = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        alsl alslVar = (alsl) aihfVarCreateBuilder.instance;
        str.getClass();
        alslVar.b |= 2;
        alslVar.f = str;
        String str2 = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        alsl alslVar2 = (alsl) aihfVarCreateBuilder.instance;
        str2.getClass();
        alslVar2.c = 4;
        alslVar2.d = str2;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.F(!(this.a.isEmpty() || this.b.isEmpty()));
    }
}
