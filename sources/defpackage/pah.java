package defpackage;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pah extends awpk implements awqk {
    int a;
    final /* synthetic */ paj b;
    final /* synthetic */ int c;
    final /* synthetic */ awrm d;
    final /* synthetic */ plx e;
    final /* synthetic */ agke f;
    final /* synthetic */ aiff g;
    final /* synthetic */ Intent h;
    final /* synthetic */ pzn i;
    final /* synthetic */ aicf j;
    final /* synthetic */ ahza k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pah(paj pajVar, int i, awrm awrmVar, plx plxVar, agke agkeVar, aiff aiffVar, Intent intent, pzn pznVar, aicf aicfVar, ahza ahzaVar, awoq awoqVar) {
        super(2, awoqVar);
        this.b = pajVar;
        this.c = i;
        this.d = awrmVar;
        this.e = plxVar;
        this.f = agkeVar;
        this.g = aiffVar;
        this.h = intent;
        this.i = pznVar;
        this.j = aicfVar;
        this.k = ahzaVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new pah(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((pah) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i == 0) {
            paj pajVar = this.b;
            pbe pbeVarA = pbf.a();
            pbeVarA.f = 1;
            pbeVarA.e(this.c);
            pbeVarA.a = (String) this.d.a;
            pbeVarA.b = this.e;
            pbeVarA.f(this.f);
            pbeVarA.d(this.g);
            pbeVarA.c = this.h;
            pbeVarA.c(this.i);
            pbeVarA.d = this.j;
            pbeVarA.e = new pbh(this.k, null, null, false);
            pbf pbfVarA = pbeVarA.a();
            this.a = 1;
            if (pajVar.a.a(pbfVarA, this) == awoxVar) {
                return awoxVar;
            }
        }
        return awmy.a;
    }
}
