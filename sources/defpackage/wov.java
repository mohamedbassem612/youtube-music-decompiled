package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class wov extends wlu {
    private final zwb a;
    public String c;

    protected wov(abxv abxvVar, zwb zwbVar) {
        super("channel_edit/update_channel_page_settings", abxvVar, zwbVar.e(), 1, true, null, null);
        this.a = zwbVar;
        m();
    }

    @Override // defpackage.wkf
    public void b() {
        ahno.O(this.a.u());
        typ.f(this.c);
    }

    @Override // defpackage.wlu
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public aihf a() {
        aihf aihfVarCreateBuilder = alyz.a.createBuilder();
        String str = this.c;
        aihfVarCreateBuilder.copyOnWrite();
        alyz alyzVar = (alyz) aihfVarCreateBuilder.instance;
        str.getClass();
        alyzVar.b |= 2;
        alyzVar.d = str;
        return aihfVarCreateBuilder;
    }
}
