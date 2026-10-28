package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wtx extends wlu {
    private apqf a;

    public wtx(abxv abxvVar, zwa zwaVar) {
        super("account/set_setting", abxvVar, zwaVar, 1, true, null, null);
        m();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alyc.a.createBuilder();
        String str = this.a.f;
        aihfVarCreateBuilder.copyOnWrite();
        alyc alycVar = (alyc) aihfVarCreateBuilder.instance;
        str.getClass();
        alycVar.b |= 2;
        alycVar.d = str;
        aihf aihfVarCreateBuilder2 = apqh.a.createBuilder();
        apqf apqfVar = this.a;
        int i = apqfVar.d;
        if (i == 3) {
            boolean zBooleanValue = ((Boolean) apqfVar.e).booleanValue();
            aihfVarCreateBuilder2.copyOnWrite();
            apqh apqhVar = (apqh) aihfVarCreateBuilder2.instance;
            apqhVar.b |= 2;
            apqhVar.d = zBooleanValue;
        } else if (i == 4) {
            long jLongValue = ((Long) apqfVar.e).longValue();
            aihfVarCreateBuilder2.copyOnWrite();
            apqh apqhVar2 = (apqh) aihfVarCreateBuilder2.instance;
            apqhVar2.b |= 4;
            apqhVar2.e = jLongValue;
        } else if (i == 2) {
            String str2 = (String) apqfVar.e;
            aihfVarCreateBuilder2.copyOnWrite();
            apqh apqhVar3 = (apqh) aihfVarCreateBuilder2.instance;
            str2.getClass();
            apqhVar3.b |= 1;
            apqhVar3.c = str2;
        }
        aihfVarCreateBuilder.copyOnWrite();
        alyc alycVar2 = (alyc) aihfVarCreateBuilder.instance;
        apqh apqhVar4 = (apqh) aihfVarCreateBuilder2.build();
        apqhVar4.getClass();
        alycVar2.e = apqhVar4;
        alycVar2.b |= 4;
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        typ.f(this.a.f);
    }

    public final void e(apqf apqfVar) {
        apqfVar.getClass();
        this.a = apqfVar;
    }
}
