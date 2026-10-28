package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aenc extends wlu {
    public String a;
    public aptc b;

    public aenc(abxv abxvVar, zwa zwaVar) {
        super("share/submit_share_engagement", abxvVar, zwaVar, 1, true, null, null);
        m();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = aqek.a.createBuilder();
        aihfVarCreateBuilder.getClass();
        String str = this.a;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aqek aqekVar = (aqek) aihfVarCreateBuilder.instance;
            aqekVar.b |= 2;
            aqekVar.d = str;
        }
        aptc aptcVar = this.b;
        if (aptcVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aqek aqekVar2 = (aqek) aihfVarCreateBuilder.instance;
            aqekVar2.e = aptcVar;
            aqekVar2.b |= 4;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
    }
}
