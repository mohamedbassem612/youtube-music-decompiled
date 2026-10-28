package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adqx extends awpk implements awqk {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adqx(adrf adrfVar, byte[] bArr, awut awutVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = adrfVar;
        this.c = bArr;
        this.d = awutVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [awzc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [awuc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [axae, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [awqk, java.lang.Object] */
    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        int i = this.$cid;
        if (i == 0) {
            Object obj2 = this.b;
            adrf adrfVar = (adrf) obj2;
            adqx adqxVar = new adqx(adrfVar, (byte[]) this.c, (awut) this.d, awoqVar, 0);
            adqxVar.e = obj;
            return adqxVar;
        }
        if (i != 1) {
            adqx adqxVar2 = new adqx((awzc) this.d, (axae) this.c, this.b, awoqVar, 2);
            adqxVar2.e = obj;
            return adqxVar2;
        }
        adqx adqxVar3 = new adqx((dmq) this.b, (awuc) this.c, (awqk) this.d, awoqVar, 1);
        adqxVar3.e = obj;
        return adqxVar3;
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((adqx) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        if (i != 1) {
            return ((adqx) create((axan) obj, (awoq) obj2)).invokeSuspend(awmy.a);
        }
        return ((adqx) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [awzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [awqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [awut, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [awoq] */
    /* JADX WARN: Type inference failed for: r8v23, types: [awzc, java.lang.Object] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r7;
        int i = this.$cid;
        if (i == 0) {
            awox awoxVar = awox.a;
            int i2 = this.a;
            atqp.j(obj);
            if (i2 == 0) {
                awro.A(((awut) this.e).b());
                Object obj2 = this.b;
                Object obj3 = this.c;
                ?? r4 = this.d;
                adrf adrfVar = (adrf) obj2;
                yby ybyVar = new yby(adrfVar, (awoq) null, 3);
                this.a = 1;
                obj = aciz.o(adrfVar.r, (byte[]) obj3, r4, ybyVar, this);
                if (obj == awoxVar) {
                    return awoxVar;
                }
            }
            adqc adqcVar = (adqc) obj;
            if (adqcVar != null) {
                return adqcVar;
            }
            ((agrc) adrf.a.b().k("com/google/android/libraries/youtube/rendering/rive/RiveSession", "loadNativeSession$<anonymous>", 514, "RiveSession.kt")).t("Failed to initialize Rive session");
            return null;
        }
        if (i != 1) {
            awox awoxVar2 = awox.a;
            int i3 = this.a;
            atqp.j(obj);
            if (i3 == 0) {
                int iOrdinal = ((axan) this.e).ordinal();
                if (iOrdinal == 0) {
                    ?? r8 = this.d;
                    ?? r2 = this.c;
                    this.a = 1;
                    if (r8.collect(r2, this) == awoxVar2) {
                        return awoxVar2;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new awmj();
                    }
                    Object obj4 = this.b;
                    if (obj4 == axal.a) {
                        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                    }
                    ((axav) this.c).d(obj4);
                }
            }
            return awmy.a;
        }
        awox awoxVar3 = awox.a;
        if (this.a != 0) {
            awoq awoqVar = (awoq) this.e;
            atqp.j(obj);
            r7 = awoqVar;
        } else {
            atqp.j(obj);
            awos awosVar = ((awut) this.e).b().get(awor.j);
            awosVar.getClass();
            Object obj5 = this.b;
            awor aworVar = (awor) awosVar;
            awou awouVarPlus = aworVar.plus(new dmx(aworVar));
            awou awouVarPlus2 = awouVarPlus.plus(new axeb(awouVarPlus, ((dmq) obj5).g));
            Object obj6 = this.c;
            ?? r3 = this.d;
            this.e = obj6;
            this.a = 1;
            obj = awro.p(awouVarPlus2, r3, this);
            if (obj == awoxVar3) {
                return awoxVar3;
            }
            r7 = obj6;
        }
        r7.resumeWith(obj);
        return awmy.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adqx(awzc awzcVar, axae axaeVar, Object obj, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.d = awzcVar;
        this.c = axaeVar;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adqx(dmq dmqVar, awuc awucVar, awqk awqkVar, awoq awoqVar, int i) {
        super(2, awoqVar);
        this.$cid = i;
        this.b = dmqVar;
        this.c = awucVar;
        this.d = awqkVar;
    }
}
