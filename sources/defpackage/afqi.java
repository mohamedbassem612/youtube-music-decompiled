package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afqi extends awpk implements awqk {
    Object a;
    Object b;
    int c;
    final /* synthetic */ bob d;
    final /* synthetic */ boc e;
    final /* synthetic */ awqk f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afqi(bob bobVar, boc bocVar, awqk awqkVar, awoq awoqVar) {
        super(2, awoqVar);
        this.d = bobVar;
        this.e = bocVar;
        this.f = awqkVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        afqi afqiVar = new afqi(this.d, this.e, this.f, awoqVar);
        afqiVar.g = obj;
        return afqiVar;
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((afqi) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0075  */
    /* JADX WARN: Code duplicated, block: B:18:0x0080  */
    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:35:? A[SYNTHETIC] */
    @Override // defpackage.awpe
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        Object obj2;
        Object obj3;
        awwd awwdVar;
        boe boeVar;
        Object obj4;
        awwd awwdVar2;
        boe boeVar2;
        awox awoxVar = awox.a;
        if (this.c != 0) {
            Object obj5 = this.b;
            obj2 = this.a;
            try {
                atqp.j(obj);
                obj4 = obj5;
                awwdVar2 = (awwd) ((awrm) obj2).a;
                if (awwdVar2 != null) {
                    awwdVar2.p(null);
                }
                boeVar2 = (boe) ((awrm) obj4).a;
                if (boeVar2 != null) {
                    this.e.c(boeVar2);
                }
                return awmy.a;
            } catch (Throwable th2) {
                th = th2;
                obj3 = obj5;
                awwdVar = (awwd) ((awrm) obj2).a;
                if (awwdVar != null) {
                    awwdVar.p(null);
                }
                boeVar = (boe) ((awrm) obj3).a;
                if (boeVar != null) {
                    throw th;
                }
                this.e.c(boeVar);
                throw th;
            }
        }
        atqp.j(obj);
        awut awutVar = (awut) this.g;
        awrm awrmVar = new awrm();
        awrm awrmVar2 = new awrm();
        try {
            bob bobVar = this.d;
            boc bocVar = this.e;
            awqk awqkVar = this.f;
            this.g = awutVar;
            this.a = awrmVar;
            this.b = awrmVar2;
            this.c = 1;
            awud awudVar = new awud(JniZero.q(this), 1);
            awudVar.w();
            bnz bnzVar = boa.Companion;
            awrmVar2.a = new afqh(bnz.c(bobVar), awrmVar, awutVar, bnz.a(bobVar), awudVar, new axfi(false), awqkVar, 0);
            Object obj6 = awrmVar2.a;
            obj6.getClass();
            bocVar.b((boe) obj6);
            if (awudVar.j() == awoxVar) {
                return awoxVar;
            }
            obj2 = awrmVar;
            obj4 = awrmVar2;
            awwdVar2 = (awwd) ((awrm) obj2).a;
            if (awwdVar2 != null) {
                awwdVar2.p(null);
            }
            boeVar2 = (boe) ((awrm) obj4).a;
            if (boeVar2 != null) {
                this.e.c(boeVar2);
            }
            return awmy.a;
        } catch (Throwable th3) {
            th = th3;
            obj2 = awrmVar;
            obj3 = awrmVar2;
            awwdVar = (awwd) ((awrm) obj2).a;
            if (awwdVar != null) {
                awwdVar.p(null);
            }
            boeVar = (boe) ((awrm) obj3).a;
            if (boeVar != null) {
                throw th;
            }
            this.e.c(boeVar);
            throw th;
        }
    }
}
