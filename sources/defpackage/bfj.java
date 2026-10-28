package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bfj extends awpk implements awqg {
    Object a;
    Object b;
    int c;
    final /* synthetic */ bfp d;
    final /* synthetic */ awou e;
    final /* synthetic */ awqk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfj(bfp bfpVar, awou awouVar, awqk awqkVar, awoq awoqVar) {
        super(1, awoqVar);
        this.d = bfpVar;
        this.e = awouVar;
        this.f = awqkVar;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new bfj(this.d, this.e, this.f, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((bfj) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0062  */
    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        bdw bdwVar;
        Object obj3;
        int iHashCode;
        bfp bfpVar;
        awox awoxVar = awox.a;
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                atqp.j(obj);
            } else if (i == 2) {
                obj2 = this.a;
                atqp.j(obj);
                awou awouVar = this.e;
                bfi bfiVar = new bfi(this.d, (dqy) obj, this.f, (bdw) obj2, null);
                this.a = obj2;
                this.c = 3;
                obj = awro.p(awouVar, bfiVar, this);
                if (obj == awoxVar) {
                    return awoxVar;
                }
            } else {
                if (i != 3) {
                    Object obj4 = this.b;
                    atqp.j(obj);
                    return obj4;
                }
                obj2 = this.a;
                atqp.j(obj);
            }
            bdwVar = (bdw) obj2;
            obj3 = bdwVar.a;
            if (obj3 != null) {
                iHashCode = obj3.hashCode();
            } else {
                iHashCode = 0;
            }
            if (iHashCode == bdwVar.b) {
                throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
            }
            if (!awrc.c(obj3, obj)) {
                bfpVar = this.d;
                this.a = null;
                this.b = obj;
                this.c = 4;
                if (bfpVar.i(obj, true, this) == awoxVar) {
                    return awoxVar;
                }
            }
            return obj;
        }
        atqp.j(obj);
        bfp bfpVar2 = this.d;
        bej bejVar = new bej(bfpVar2, (awoq) null, 3, (short[]) null);
        this.c = 1;
        obj = bfpVar2.h(true, bejVar, this);
        if (obj == awoxVar) {
            return awoxVar;
        }
        bdw bdwVar2 = (bdw) obj;
        this.a = bdwVar2;
        this.c = 2;
        obj2 = bdwVar2;
        obj = null;
        awou awouVar2 = this.e;
        bfi bfiVar2 = new bfi(this.d, (dqy) obj, this.f, (bdw) obj2, null);
        this.a = obj2;
        this.c = 3;
        obj = awro.p(awouVar2, bfiVar2, this);
        if (obj == awoxVar) {
            return awoxVar;
        }
        bdwVar = (bdw) obj2;
        obj3 = bdwVar.a;
        if (obj3 != null) {
            iHashCode = obj3.hashCode();
        } else {
            iHashCode = 0;
        }
        if (iHashCode == bdwVar.b) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
        if (!awrc.c(obj3, obj)) {
            bfpVar = this.d;
            this.a = null;
            this.b = obj;
            this.c = 4;
            if (bfpVar.i(obj, true, this) == awoxVar) {
                return awoxVar;
            }
        }
        return obj;
    }
}
