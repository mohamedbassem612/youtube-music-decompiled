package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wrm extends wms {
    /* JADX WARN: Illegal instructions before constructor call */
    public wrm(abxv abxvVar, zwa zwaVar, String str) {
        typ.f(str);
        aihf aihfVarCreateBuilder = altn.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        altn altnVar = (altn) aihfVarCreateBuilder.instance;
        str.getClass();
        altnVar.b |= 2;
        altnVar.d = str;
        super(abxvVar, zwaVar, "notification/remove_upcoming_event_reminder", aihfVarCreateBuilder, true);
    }

    @Override // defpackage.wkf
    protected final void b() {
    }
}
