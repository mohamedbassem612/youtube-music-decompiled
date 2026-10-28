package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wpf extends wlu {
    public almy a;
    public almw b;

    public wpf(abxv abxvVar, zwa zwaVar) {
        super("share/send_share", abxvVar, zwaVar, 1, false, null, null);
        m();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = almu.a.createBuilder();
        almy almyVar = this.a;
        if (almyVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            almu almuVar = (almu) aihfVarCreateBuilder.instance;
            almuVar.e = almyVar;
            almuVar.b |= 16;
        }
        almw almwVar = this.b;
        if (almwVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            almu almuVar2 = (almu) aihfVarCreateBuilder.instance;
            almuVar2.d = almwVar;
            almuVar2.b |= 2;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.P(this.a != null, "Only ShareToContacts is allowed to have a missing SharedObjectParams!");
        ahno.O(this.b != null);
    }
}
