package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class adqw extends awpk implements awqk {
    Object a;
    int b;
    final /* synthetic */ awwd c;
    final /* synthetic */ awwd d;
    final /* synthetic */ awwd e;
    final /* synthetic */ adqc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adqw(awwd awwdVar, awwd awwdVar2, awwd awwdVar3, adqc adqcVar, awoq awoqVar) {
        super(2, awoqVar);
        this.c = awwdVar;
        this.d = awwdVar2;
        this.e = awwdVar3;
        this.f = adqcVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new adqw(this.c, this.d, this.e, this.f, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((adqw) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        awwd awwdVar;
        awwq awwqVar;
        adqv adqvVar;
        awox awoxVar = awox.a;
        int i = this.b;
        try {
            if (i != 0) {
                if (i == 1) {
                    atqp.j(obj);
                } else if (i == 2) {
                    atqp.j(obj);
                    awwdVar = this.e;
                    this.b = 3;
                    if (awwdVar.l(this) == awoxVar) {
                        return awoxVar;
                    }
                    adqc adqcVar = this.f;
                    awwqVar = awwq.a;
                    adqvVar = new adqv(adqcVar, (awoq) null, 2);
                    this.b = 4;
                    if (awro.p(awwqVar, adqvVar, this) == awoxVar) {
                        return awoxVar;
                    }
                } else if (i == 3) {
                    atqp.j(obj);
                    adqc adqcVar2 = this.f;
                    awwqVar = awwq.a;
                    adqvVar = new adqv(adqcVar2, (awoq) null, 2);
                    this.b = 4;
                    if (awro.p(awwqVar, adqvVar, this) == awoxVar) {
                        return awoxVar;
                    }
                } else {
                    if (i != 4) {
                        obj2 = this.a;
                        atqp.j(obj);
                        throw ((Throwable) obj2);
                    }
                    atqp.j(obj);
                }
                return awmy.a;
            }
            atqp.j(obj);
            awwd awwdVar2 = this.c;
            if (awwdVar2 != null) {
                this.b = 1;
                if (awwdVar2.l(this) == awoxVar) {
                    return awoxVar;
                }
            }
            awwd awwdVar3 = this.d;
            this.b = 2;
            if (awwdVar3.l(this) == awoxVar) {
                return awoxVar;
            }
            awwdVar = this.e;
            this.b = 3;
            if (awwdVar.l(this) == awoxVar) {
                return awoxVar;
            }
            adqc adqcVar3 = this.f;
            awwqVar = awwq.a;
            adqvVar = new adqv(adqcVar3, (awoq) null, 2);
            this.b = 4;
            if (awro.p(awwqVar, adqvVar, this) == awoxVar) {
                return awoxVar;
            }
            return awmy.a;
        } catch (Throwable th) {
            adqc adqcVar4 = this.f;
            awwq awwqVar2 = awwq.a;
            adqv adqvVar2 = new adqv(adqcVar4, (awoq) null, 2);
            this.a = th;
            this.b = 5;
            if (awro.p(awwqVar2, adqvVar2, this) == awoxVar) {
                return awoxVar;
            }
            obj2 = th;
        }
    }
}
