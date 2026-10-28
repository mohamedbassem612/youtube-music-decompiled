package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wrh extends wms {
    /* JADX WARN: Illegal instructions before constructor call */
    public wrh(abxv abxvVar, zwa zwaVar, String str) {
        typ.f(str);
        aihf aihfVarCreateBuilder = alta.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        alta altaVar = (alta) aihfVarCreateBuilder.instance;
        str.getClass();
        altaVar.b |= 2;
        altaVar.d = str;
        super(abxvVar, zwaVar, "notification/add_upcoming_event_reminder", aihfVarCreateBuilder, true);
    }

    @Override // defpackage.wkf
    protected final void b() {
    }
}
