package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abfo implements abfn {
    private static final String a = wfs.g(382, "active-video-key");
    private final wbz b;
    private final zwb c;

    public abfo(wbz wbzVar, zwb zwbVar) {
        this.b = wbzVar;
        this.c = zwbVar;
    }

    private final wby b() {
        return this.b.e(this.c.e());
    }

    @Override // defpackage.abfn
    public final void a(String str) {
        wer werVarE = b().e();
        String str2 = a;
        str2.getClass();
        ahno.P(!str2.isEmpty(), "key cannot be empty");
        aihf aihfVarCreateBuilder = aqdw.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        aqdw aqdwVar = (aqdw) aihfVarCreateBuilder.instance;
        aqdwVar.b |= 1;
        aqdwVar.c = str2;
        aqdt aqdtVar = new aqdt(aihfVarCreateBuilder);
        aihf aihfVar = aqdtVar.a;
        aihfVar.copyOnWrite();
        aqdw aqdwVar2 = (aqdw) aihfVar.instance;
        str.getClass();
        aqdwVar2.b |= 2;
        aqdwVar2.d = str;
        b();
        werVarE.e(aqdtVar.am());
        werVarE.b();
    }
}
