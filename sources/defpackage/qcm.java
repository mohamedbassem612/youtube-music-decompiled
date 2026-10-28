package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qcm implements qcl {
    private final qcs a;
    private final awmd b;
    private final awmd c;
    private final awmd d;
    private final awmd e;
    private final awmd f;

    public qcm(qcs qcsVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5) {
        this.a = qcsVar;
        this.b = awmdVar;
        this.c = awmdVar2;
        this.d = awmdVar3;
        this.e = awmdVar4;
        this.f = awmdVar5;
        Boolean.FALSE.booleanValue();
        try {
            afty.r(false);
            Iterator it = ((Set) awmdVar.io()).iterator();
            while (it.hasNext()) {
                ((qfh) it.next()).k();
            }
        } catch (RuntimeException e) {
            ((agrc) ((agrc) ((agrc) qcq.a.c()).j(e)).k("com/google/android/libraries/performance/primes/PrimesApiImpl", "initializeMetricServices", '{', "PrimesApiImpl.java")).t("Primes failed to initialize");
            qcs qcsVar2 = this.a;
            if (qcsVar2.a) {
                return;
            }
            qcsVar2.a = true;
        }
    }

    @Override // defpackage.qcl
    public final void a(qci qciVar, axgh axghVar) {
        ((qhn) this.d.io()).b(qciVar, axghVar);
    }

    @Override // defpackage.qcl
    public final void b(qhy qhyVar) {
        ((qia) this.f.io()).a(qhyVar);
    }

    @Override // defpackage.qcl
    public final void c() {
        ((qfv) this.c.io()).l();
    }

    @Override // defpackage.qcl
    public final void d() {
        ((qhn) this.d.io()).a();
    }

    @Override // defpackage.qcl
    public final void e(String str) {
        ((qhr) this.e.io()).c(str);
    }
}
