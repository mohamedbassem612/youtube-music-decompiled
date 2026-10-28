package defpackage;

import internal.org.jni_zero.JniZero;
import java.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class axfm {
    private final awtr a;
    public final int b;
    public final awtp c;
    private final awtq d;
    private final awtr e;
    private final awtq f;
    private final awql g;

    public axfm(int i, int i2) {
        this.b = i;
        awts awtsVar = awts.a;
        this.d = new awtq(0L, awtsVar);
        this.f = new awtq(0L, awtsVar);
        axfo axfoVar = new axfo(0L, null, 2);
        this.a = new awtr(axfoVar, awtsVar);
        this.e = new awtr(axfoVar, awtsVar);
        this.c = new awtp(i - i2, awtsVar);
        this.g = new axfg(this, 2);
    }

    private final int a() {
        int andDecrement;
        do {
            andDecrement = awtp.a.getAndDecrement(this.c);
        } while (andDecrement > this.b);
        return andDecrement;
    }

    private final boolean b(awxo awxoVar) {
        Object objA;
        long j;
        axfo axfoVar;
        awtr awtrVar = this.e;
        axfo axfoVar2 = (axfo) awtrVar.a;
        long jB = this.f.b();
        axfk axfkVar = axfk.a;
        long j2 = axfn.f;
        long j3 = jB / j2;
        loop0: while (true) {
            objA = axcu.a(axfoVar2, j3, axfkVar);
            if (objA == axcu.a) {
                j = jB;
                break;
            }
            axcv axcvVarB = axdw.b(objA);
            while (true) {
                axcv axcvVar = (axcv) awtrVar.a;
                axfoVar = axfoVar2;
                j = jB;
                if (axcvVar.b >= axcvVarB.b) {
                    break loop0;
                }
                if (!axcvVarB.u()) {
                    break;
                }
                if (awtrVar.d(axcvVar, axcvVarB)) {
                    if (!axcvVar.s()) {
                        break loop0;
                    }
                    axcvVar.p();
                    break loop0;
                }
                if (axcvVarB.s()) {
                    axcvVarB.p();
                }
                axfoVar2 = axfoVar;
                jB = j;
            }
            axfoVar2 = axfoVar;
            jB = j;
        }
        axfo axfoVar3 = (axfo) axdw.b(objA);
        int i = (int) (j % j2);
        ahud ahudVar = axfoVar3.c;
        if (ahudVar.s(i).d(null, awxoVar)) {
            awxoVar.B(axfoVar3, i);
            return true;
        }
        if (!ahudVar.s(i).d(axfn.b, axfn.c)) {
            boolean z = awuv.a;
            return false;
        }
        int iT = awrc.T(awxoVar);
        if (iT == 0) {
            ((awuc) awxoVar).d(awmy.a, this.g);
            return true;
        }
        if (iT != 1) {
            Objects.toString(awxoVar);
            throw new IllegalStateException("unexpected: ".concat(awxoVar.toString()));
        }
        throw null;
    }

    public final Object e(awoq awoqVar) throws awve {
        if (a() <= 0) {
            awud awudVarJ = awqx.j(JniZero.q(awoqVar));
            try {
                if (!b(awudVarJ)) {
                    f(awudVarJ);
                }
                Object objJ = awudVarJ.j();
                awox awoxVar = awox.a;
                if (objJ != awoxVar) {
                    objJ = awmy.a;
                }
                if (objJ == awoxVar) {
                    return objJ;
                }
            } catch (Throwable th) {
                awudVarJ.y();
                throw th;
            }
        }
        return awmy.a;
    }

    protected final void f(awuc awucVar) {
        while (a() <= 0) {
            if (b((awxo) awucVar)) {
                return;
            }
        }
        awucVar.d(awmy.a, this.g);
    }

    public final void g() {
        awtp awtpVar;
        int i;
        int i2;
        do {
            awtpVar = this.c;
            i = this.b;
            i2 = awtpVar.b;
            if (i2 <= i) {
                return;
            }
        } while (!awtpVar.c(i2, i));
    }

    public final void h() {
        Object objA;
        long j;
        axfo axfoVar;
        while (true) {
            int andIncrement = awtp.a.getAndIncrement(this.c);
            int i = this.b;
            if (andIncrement >= i) {
                g();
                throw new IllegalStateException(a.bR(i, "The number of released permits cannot be greater than "));
            }
            if (andIncrement >= 0) {
                return;
            }
            awtr awtrVar = this.a;
            axfo axfoVar2 = (axfo) awtrVar.a;
            long jB = this.d.b();
            long j2 = axfn.f;
            long j3 = jB / j2;
            axfl axflVar = axfl.a;
            while (true) {
                objA = axcu.a(axfoVar2, j3, axflVar);
                if (objA == axcu.a) {
                    j = jB;
                    break;
                }
                axcv axcvVarB = axdw.b(objA);
                while (true) {
                    axcv axcvVar = (axcv) awtrVar.a;
                    axfoVar = axfoVar2;
                    j = jB;
                    if (axcvVar.b >= axcvVarB.b) {
                        break;
                    }
                    if (!axcvVarB.u()) {
                        break;
                    }
                    if (awtrVar.d(axcvVar, axcvVarB)) {
                        if (!axcvVar.s()) {
                            break;
                        }
                        axcvVar.p();
                        break;
                    } else {
                        if (axcvVarB.s()) {
                            axcvVarB.p();
                        }
                        axfoVar2 = axfoVar;
                        jB = j;
                    }
                }
                axfoVar2 = axfoVar;
                jB = j;
            }
            axfo axfoVar3 = (axfo) axdw.b(objA);
            axfoVar3.o();
            if (axfoVar3.b <= j3) {
                int i2 = (int) (j % j2);
                ahud ahudVar = axfoVar3.c;
                axdy axdyVar = axfn.b;
                Object objA2 = ahudVar.s(i2).a(axdyVar);
                if (objA2 == null) {
                    int i3 = axfn.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (ahudVar.s(i2).a == axfn.c) {
                            return;
                        }
                    }
                    if (!ahudVar.s(i2).d(axdyVar, axfn.d)) {
                        return;
                    }
                } else if (objA2 == axfn.e) {
                    continue;
                } else {
                    int iT = awrc.T(objA2);
                    if (iT != 0) {
                        if (iT != 1) {
                            Objects.toString(objA2);
                            throw new IllegalStateException("unexpected: ".concat(objA2.toString()));
                        }
                        throw null;
                    }
                    awuc awucVar = (awuc) objA2;
                    Object objI = awucVar.i(awmy.a, this.g);
                    if (objI != null) {
                        awucVar.a(objI);
                        return;
                    }
                }
            }
        }
    }
}
