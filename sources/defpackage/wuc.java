package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wuc extends wlu {
    public String a;
    public aqec b;
    public alap c;
    public int d;
    private String e;

    public wuc(abxv abxvVar, zwa zwaVar, boolean z) {
        super("submit_form", abxvVar, zwaVar, 1, z, null, null);
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = aqef.a.createBuilder();
        int i = this.d;
        if (i != 0) {
            aihfVarCreateBuilder.copyOnWrite();
            aqef aqefVar = (aqef) aihfVarCreateBuilder.instance;
            aqefVar.d = i - 1;
            aqefVar.b |= 2;
        }
        String str = this.a;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aqef aqefVar2 = (aqef) aihfVarCreateBuilder.instance;
            aqefVar2.b |= 4;
            aqefVar2.e = str;
        }
        String str2 = this.e;
        if (str2 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aqef aqefVar3 = (aqef) aihfVarCreateBuilder.instance;
            aqefVar3.b |= 8;
            aqefVar3.f = str2;
        }
        aqec aqecVar = this.b;
        if (aqecVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aqef aqefVar4 = (aqef) aihfVarCreateBuilder.instance;
            aqefVar4.g = aqecVar;
            aqefVar4.b |= 16;
        }
        alap alapVar = this.c;
        if (alapVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            aqef aqefVar5 = (aqef) aihfVarCreateBuilder.instance;
            aqefVar5.h = alapVar;
            aqefVar5.b |= 32;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        if (this.d == 0 && this.a == null) {
            throw new IllegalStateException();
        }
    }

    public final void e(String str) {
        this.e = j(str);
    }
}
