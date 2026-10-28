package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zqb extends wlu {
    final String a;

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, zwb] */
    public zqb(aaqf aaqfVar, String str) {
        super("get_user_mention_suggestions", aaqfVar.b, aaqfVar.d.e(), 1, false, null, null);
        this.a = str;
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alzh.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        alzh alzhVar = (alzh) aihfVarCreateBuilder.instance;
        String str = this.a;
        str.getClass();
        alzhVar.b |= 2;
        alzhVar.d = str;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
    }
}
