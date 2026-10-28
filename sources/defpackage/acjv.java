package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acjv extends wlu {
    private final String a;

    public acjv(abxv abxvVar, zwa zwaVar, String str) {
        super("get_playlist_filter_search_metadata", abxvVar, zwaVar, 1, false, null, null);
        this.a = str;
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alpz.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        alpz alpzVar = (alpz) aihfVarCreateBuilder.instance;
        alpzVar.b |= 2;
        alpzVar.d = this.a;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        typ.f(this.a);
    }
}
