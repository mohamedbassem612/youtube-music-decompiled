package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bfe extends awpk implements awqg {
    Object a;
    Object b;
    Object c;
    int d;
    int e;
    final /* synthetic */ boolean f;
    final /* synthetic */ bfp g;
    final /* synthetic */ awqk h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfe(boolean z, bfp bfpVar, awqk awqkVar, awoq awoqVar) {
        super(1, awoqVar);
        this.f = z;
        this.g = bfpVar;
        this.h = awqkVar;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new bfe(this.f, this.g, this.h, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((bfe) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063 A[Catch: bdu -> 0x00a8, TryCatch #2 {bdu -> 0x00a8, blocks: (B:15:0x003a, B:35:0x00a4, B:18:0x0044, B:32:0x0084, B:19:0x004a, B:27:0x0063, B:29:0x0069, B:22:0x0053, B:24:0x0059, B:33:0x0091), top: B:60:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objA;
        awrm awrmVar;
        Object obj2;
        awrm awrmVar2;
        Object obj3;
        awrm awrmVar3;
        awrk awrkVar;
        Object objG;
        Object objG2;
        int iHashCode;
        Object objInvoke;
        Object obj4;
        int i;
        awox awoxVar = awox.a;
        int i2 = this.e;
        try {
            if (i2 == 0) {
                atqp.j(obj);
                boolean z = this.f;
                bfp bfpVar = this.g;
                if (!z) {
                    ayq ayqVarN = bfpVar.n();
                    bfc bfcVar = new bfc(bfpVar, this.h, null);
                    this.e = 3;
                    objG = ayqVarN.g(bfcVar, this);
                    if (objG == awoxVar) {
                        return awoxVar;
                    }
                    return (bdw) objG;
                }
                this.e = 1;
                objG2 = bfpVar.g(this);
                if (objG2 == awoxVar) {
                    return awoxVar;
                }
                if (objG2 != null) {
                    iHashCode = objG2.hashCode();
                } else {
                    iHashCode = 0;
                }
                awqk awqkVar = this.h;
                Boolean boolValueOf = Boolean.valueOf(this.f);
                this.a = null;
                this.b = objG2;
                this.d = iHashCode;
                this.e = 2;
                objInvoke = awqkVar.invoke(boolValueOf, this);
                if (objInvoke != awoxVar) {
                    return awoxVar;
                }
                int i3 = iHashCode;
                obj4 = objG2;
                i = i3;
            } else if (i2 == 1) {
                atqp.j(obj);
                objG2 = obj;
                if (objG2 != null) {
                    iHashCode = objG2.hashCode();
                } else {
                    iHashCode = 0;
                }
                awqk awqkVar2 = this.h;
                Boolean boolValueOf2 = Boolean.valueOf(this.f);
                this.a = null;
                this.b = objG2;
                this.d = iHashCode;
                this.e = 2;
                objInvoke = awqkVar2.invoke(boolValueOf2, this);
                if (objInvoke != awoxVar) {
                    return awoxVar;
                }
                int i4 = iHashCode;
                obj4 = objG2;
                i = i4;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        atqp.j(obj);
                        objG = obj;
                        return (bdw) objG;
                    }
                    Object obj5 = this.c;
                    if (i2 != 4) {
                        awrkVar = (awrk) obj5;
                        awrmVar3 = (awrm) this.b;
                        obj3 = this.a;
                        try {
                            atqp.j(obj);
                            Object obj6 = awrmVar3.a;
                            return new bdw(obj6, obj6 != null ? obj6.hashCode() : 0, awrkVar.a);
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = (Throwable) obj3;
                            avkz.d(th2, th);
                            throw th2;
                        }
                    }
                    awrm awrmVar4 = (awrm) this.b;
                    Object obj7 = this.a;
                    atqp.j(obj);
                    awrmVar = awrmVar4;
                    awrmVar2 = (awrm) obj5;
                    obj2 = obj7;
                    objA = obj;
                    awrmVar2.a = objA;
                    awrk awrkVar2 = new awrk();
                    try {
                        bfp bfpVar2 = this.g;
                        boolean z2 = this.f;
                        bfd bfdVar = new bfd(awrmVar, bfpVar2, awrkVar2, this.h, z2, null);
                        this.a = obj2;
                        this.b = awrmVar;
                        this.c = awrkVar2;
                        this.e = 5;
                        if ((z2 ? bfdVar.invoke(this) : bfpVar2.n().f(new bep(bfdVar, (awoq) null, 0), this)) == awoxVar) {
                            return awoxVar;
                        }
                        awrmVar3 = awrmVar;
                        awrkVar = awrkVar2;
                        Object obj8 = awrmVar3.a;
                        return new bdw(obj8, obj8 != null ? obj8.hashCode() : 0, awrkVar.a);
                    } catch (Throwable th3) {
                        th = th3;
                        obj3 = obj2;
                        Throwable th4 = (Throwable) obj3;
                        avkz.d(th4, th);
                        throw th4;
                    }
                }
                i = this.d;
                obj4 = this.b;
                atqp.j(obj);
                objInvoke = obj;
            }
            return new bdw(obj4, i, ((Number) objInvoke).intValue());
        } catch (bdu e) {
            awrm awrmVar5 = new awrm();
            bfp bfpVar3 = this.g;
            this.a = e;
            this.b = awrmVar5;
            this.c = awrmVar5;
            this.e = 4;
            objA = bfpVar3.b.a(e);
            if (objA == awoxVar) {
                return awoxVar;
            }
            awrmVar = awrmVar5;
            obj2 = e;
            awrmVar2 = awrmVar;
        }
    }
}
