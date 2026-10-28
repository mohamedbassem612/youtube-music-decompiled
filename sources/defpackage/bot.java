package defpackage;

import internal.org.jni_zero.JniZero;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class bot extends awpk implements awqk {
    Object a;
    Object b;
    int c;
    final /* synthetic */ boc d;
    final /* synthetic */ bob e;
    final /* synthetic */ awut f;
    final /* synthetic */ awqk g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bot(boc bocVar, bob bobVar, awut awutVar, awqk awqkVar, awoq awoqVar) {
        super(2, awoqVar);
        this.d = bocVar;
        this.e = bobVar;
        this.f = awutVar;
        this.g = awqkVar;
    }

    @Override // defpackage.awpe
    public final awoq create(Object obj, awoq awoqVar) {
        return new bot(this.d, this.e, this.f, this.g, awoqVar);
    }

    @Override // defpackage.awqk
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bot) create((awut) obj, (awoq) obj2)).invokeSuspend(awmy.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0074  */
    /* JADX WARN: Code duplicated, block: B:20:0x007f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0090  */
    /* JADX WARN: Code duplicated, block: B:28:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:? A[SYNTHETIC] */
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
                    this.d.c(boeVar2);
                }
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
                this.d.c(boeVar);
                throw th;
            }
        } else {
            atqp.j(obj);
            boc bocVar = this.d;
            if (bocVar.a() != bob.a) {
                awrm awrmVar = new awrm();
                awrm awrmVar2 = new awrm();
                try {
                    bob bobVar = this.e;
                    awut awutVar = this.f;
                    awqk awqkVar = this.g;
                    this.a = awrmVar;
                    this.b = awrmVar2;
                    this.c = 1;
                    awud awudVar = new awud(JniZero.q(this), 1);
                    awudVar.w();
                    bnz bnzVar = boa.Companion;
                    awrmVar2.a = new afqh(bnz.c(bobVar), awrmVar, awutVar, bnz.a(bobVar), awudVar, new axfi(false), awqkVar, 1);
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
                        this.d.c(boeVar2);
                    }
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
                    this.d.c(boeVar);
                    throw th;
                }
            }
        }
        return awmy.a;
    }
}
