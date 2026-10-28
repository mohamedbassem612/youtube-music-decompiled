package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adre extends awpk implements awqk {
    final /* synthetic */ adqc a;
    final /* synthetic */ adrf b;
    final /* synthetic */ boc c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adre(adqc adqcVar, adrf adrfVar, boc bocVar, awoq awoqVar) {
        super(2, awoqVar);
        this.a = adqcVar;
        this.b = adrfVar;
        this.c = bocVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        adre adreVar = new adre(this.a, this.b, this.c, awoqVar);
        adreVar.d = obj;
        return adreVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((adre) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        atqp.j(obj);
        awut awutVar = (awut) this.d;
        awou awouVarB = awutVar.b();
        awwd awwdVar = (awwd) awouVarB.get(awwd.d);
        if (awwdVar == null) {
            Objects.toString(awouVarB);
            throw new IllegalStateException("Current context doesn't contain Job in it: ".concat(String.valueOf(awouVarB)));
        }
        adqc adqcVar = this.a;
        adrf adrfVar = this.b;
        awro.t(awutVar, null, 0, new adpb(adqcVar, adrfVar, (awoq) null, 4), 3);
        awro.t(awutVar, null, 0, new egh(adqcVar, this.c, adrfVar, awwdVar, (awoq) null, 12), 3);
        return awmy.a;
    }
}
