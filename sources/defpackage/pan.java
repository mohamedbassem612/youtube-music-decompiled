package defpackage;

import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class pan extends awpk implements awqk {
    int a;
    final /* synthetic */ pao b;
    final /* synthetic */ int c;
    final /* synthetic */ String d;
    final /* synthetic */ plx e;
    final /* synthetic */ agke f;
    final /* synthetic */ aiff g;
    final /* synthetic */ Intent h;
    final /* synthetic */ ahza i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pan(pao paoVar, int i, String str, plx plxVar, agke agkeVar, aiff aiffVar, Intent intent, ahza ahzaVar, awoq awoqVar) {
        super(2, awoqVar);
        this.b = paoVar;
        this.c = i;
        this.d = str;
        this.e = plxVar;
        this.f = agkeVar;
        this.g = aiffVar;
        this.h = intent;
        this.i = ahzaVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new pan(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((pan) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        awox awoxVar = awox.a;
        int i = this.a;
        atqp.j(obj);
        if (i == 0) {
            pct pctVar = (pct) this.b.c.io();
            pbe pbeVarA = pbf.a();
            pbeVarA.f = 1;
            pbeVarA.e(this.c);
            pbeVarA.a = this.d;
            pbeVarA.b = this.e;
            pbeVarA.f(this.f);
            pbeVarA.d(this.g);
            pbeVarA.c = this.h;
            pbeVarA.e = new pbh(this.i, null, null, false);
            pbeVarA.b(true);
            pbf pbfVarA = pbeVarA.a();
            this.a = 1;
            if (pctVar.a(pbfVarA, this) == awoxVar) {
                return awoxVar;
            }
        }
        return awmy.a;
    }
}
