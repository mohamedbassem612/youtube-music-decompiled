package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wpe extends wlu {
    public String a;
    public aptc b;

    public wpe(abxv abxvVar, zwa zwaVar) {
        super("share/get_sharing_provider_data", abxvVar, zwaVar, 1, true, null, null);
        m();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alqo.a.createBuilder();
        String str = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        alqo alqoVar = (alqo) aihfVarCreateBuilder.instance;
        str.getClass();
        alqoVar.b |= 2;
        alqoVar.d = str;
        aptc aptcVar = this.b;
        if (aptcVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alqo alqoVar2 = (alqo) aihfVarCreateBuilder.instance;
            alqoVar2.e = aptcVar;
            alqoVar2.b |= 4;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        this.a.getClass();
    }
}
