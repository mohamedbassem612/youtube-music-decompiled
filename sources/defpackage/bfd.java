package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bfd extends awpk implements awqg {
    Object a;
    Object b;
    int c;
    final /* synthetic */ awrm d;
    final /* synthetic */ bfp e;
    final /* synthetic */ awrk f;
    final /* synthetic */ awqk g;
    final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bfd(awrm awrmVar, bfp bfpVar, awrk awrkVar, awqk awqkVar, boolean z, awoq awoqVar) {
        super(1, awoqVar);
        this.d = awrmVar;
        this.e = bfpVar;
        this.f = awrkVar;
        this.g = awqkVar;
        this.h = z;
    }

    @Override // defpackage.awpe
    public final awoq create(awoq awoqVar) {
        return new bfd(this.d, this.e, this.f, this.g, this.h, awoqVar);
    }

    @Override // defpackage.awqg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((bfd) create((awoq) obj)).invokeSuspend(awmy.a);
    }

    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        awrm awrmVar;
        awrk awrkVar;
        awox awoxVar = awox.a;
        int i = this.c;
        try {
            if (i != 0) {
                if (i == 1) {
                    awrmVar = (awrm) this.a;
                    atqp.j(obj);
                } else {
                    if (i != 2) {
                        obj2 = this.b;
                        atqp.j(obj);
                        ((awrk) obj2).a = ((Number) obj).intValue();
                        return awmy.a;
                    }
                    awrkVar = (awrk) this.a;
                    atqp.j(obj);
                }
                awrkVar.a = ((Number) obj).intValue();
                return awmy.a;
            }
            atqp.j(obj);
            awrmVar = this.d;
            bfp bfpVar = this.e;
            this.a = awrmVar;
            this.c = 1;
            obj = bfpVar.g(this);
            if (obj == awoxVar) {
                return awoxVar;
            }
            awrmVar.a = obj;
            awrkVar = this.f;
            awqk awqkVar = this.g;
            Boolean boolValueOf = Boolean.valueOf(this.h);
            this.a = awrkVar;
            this.c = 2;
            obj = awqkVar.invoke(boolValueOf, this);
            if (obj == awoxVar) {
                return awoxVar;
            }
            awrkVar.a = ((Number) obj).intValue();
        } catch (bdu unused) {
            awrk awrkVar2 = this.f;
            bfp bfpVar2 = this.e;
            Object obj3 = this.d.a;
            this.a = null;
            this.b = awrkVar2;
            this.c = 3;
            Object objI = bfpVar2.i(obj3, true, this);
            if (objI == awoxVar) {
                return awoxVar;
            }
            obj2 = awrkVar2;
            obj = objI;
        }
        return awmy.a;
    }
}
