package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ufn implements ufq {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ ufr a;
    public final /* synthetic */ long b;

    public /* synthetic */ ufn(ufr ufrVar, long j, int i) {
        this.$cid = i;
        this.a = ufrVar;
        this.b = j;
    }

    @Override // defpackage.ufq
    public final void a(aijp aijpVar) {
        if (this.$cid != 0) {
            aihf aihfVarCreateBuilder = asjz.a.createBuilder();
            aihfVarCreateBuilder.copyOnWrite();
            asjz asjzVar = (asjz) aihfVarCreateBuilder.instance;
            asjzVar.b |= 2;
            asjzVar.d = this.b;
            aihfVarCreateBuilder.copyOnWrite();
            asjz asjzVar2 = (asjz) aihfVarCreateBuilder.instance;
            aijpVar.getClass();
            asjzVar2.c = aijpVar;
            asjzVar2.b |= 1;
            aihfVarCreateBuilder.copyOnWrite();
            asjz asjzVar3 = (asjz) aihfVarCreateBuilder.instance;
            asjzVar3.b |= 4;
            ufr ufrVar = this.a;
            asjzVar3.e = ufrVar.e;
            asjz asjzVar4 = (asjz) aihfVarCreateBuilder.build();
            agbv agbvVar = ufrVar.b;
            agbvVar.i();
            aigv aigvVar = aigv.a;
            return;
        }
        aihf aihfVarCreateBuilder2 = asjx.a.createBuilder();
        aihfVarCreateBuilder2.copyOnWrite();
        asjx asjxVar = (asjx) aihfVarCreateBuilder2.instance;
        asjxVar.b |= 2;
        asjxVar.d = this.b;
        aihfVarCreateBuilder2.copyOnWrite();
        asjx asjxVar2 = (asjx) aihfVarCreateBuilder2.instance;
        aijpVar.getClass();
        asjxVar2.c = aijpVar;
        asjxVar2.b |= 1;
        aihfVarCreateBuilder2.copyOnWrite();
        asjx asjxVar3 = (asjx) aihfVarCreateBuilder2.instance;
        asjxVar3.b |= 4;
        ufr ufrVar2 = this.a;
        asjxVar3.e = ufrVar2.e;
        asjx asjxVar4 = (asjx) aihfVarCreateBuilder2.build();
        agbv agbvVar2 = ufrVar2.b;
        agbvVar2.i();
        aigv aigvVar2 = aigv.a;
    }
}
