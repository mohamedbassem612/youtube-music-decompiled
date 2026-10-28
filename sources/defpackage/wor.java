package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wor extends wlu {
    public aigj a;
    public arrc b;
    public alml c;
    public int d;

    public wor(abxv abxvVar, zwa zwaVar) {
        super("channel/create_channel", abxvVar, zwaVar, 1, true, null, null);
        m();
    }

    @Override // defpackage.wlu
    public final /* bridge */ /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = almm.a.createBuilder();
        aigj aigjVar = this.a;
        aihfVarCreateBuilder.copyOnWrite();
        almm almmVar = (almm) aihfVarCreateBuilder.instance;
        aigjVar.getClass();
        almmVar.b |= 4;
        almmVar.e = aigjVar;
        aihfVarCreateBuilder.copyOnWrite();
        almm almmVar2 = (almm) aihfVarCreateBuilder.instance;
        almmVar2.b |= 16;
        almmVar2.g = j(null);
        aihfVarCreateBuilder.copyOnWrite();
        almm almmVar3 = (almm) aihfVarCreateBuilder.instance;
        almmVar3.b |= 32;
        almmVar3.h = j(null);
        arrc arrcVar = this.b;
        if (arrcVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            almm almmVar4 = (almm) aihfVarCreateBuilder.instance;
            almmVar4.i = arrcVar;
            almmVar4.b |= 64;
        }
        alml almlVar = this.c;
        if (almlVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            almm almmVar5 = (almm) aihfVarCreateBuilder.instance;
            almmVar5.f = almlVar;
            almmVar5.b |= 8;
        }
        int i = this.d;
        if (i != 0) {
            aihfVarCreateBuilder.copyOnWrite();
            almm almmVar6 = (almm) aihfVarCreateBuilder.instance;
            almmVar6.c = i - 1;
            almmVar6.b |= 1;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        this.a.getClass();
    }
}
