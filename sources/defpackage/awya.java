package defpackage;

import internal.org.jni_zero.JniZero;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class awya implements awye {
    public final awtq a;
    public final awtq b;
    public final awtr c;
    public final awtr d;
    private final int f;
    private final awtq g;
    private final awtq h;
    private final awtr i;
    private final awtr j;
    private final awtr k;

    public awya(int i) {
        this.f = i;
        if (i < 0) {
            throw new IllegalArgumentException(a.bP(i, "Invalid channel capacity: ", ", should be >=0"));
        }
        awts awtsVar = awts.a;
        this.a = new awtq(0L, awtsVar);
        this.b = new awtq(0L, awtsVar);
        awyj awyjVar = awyc.a;
        this.g = new awtq(i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L, awtsVar);
        this.h = new awtq(C(), awtsVar);
        awyj awyjVar2 = new awyj(0L, null, this, 3);
        this.c = new awtr(awyjVar2, awtsVar);
        this.d = new awtr(awyjVar2, awtsVar);
        if (J()) {
            awyjVar2 = awyc.a;
            awyjVar2.getClass();
        }
        this.i = new awtr(awyjVar2, awtsVar);
        this.j = new awtr(awyc.s, awtsVar);
        this.k = new awtr(null, awtsVar);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0000 A[SYNTHETIC] */
    private final int B(awyj awyjVar, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objD = awyjVar.d(i);
            if (objD == null) {
                if (I(j)) {
                    if (z) {
                        if (awyjVar.j(i, null, awyc.j)) {
                            awyjVar.g(i, false);
                            return 4;
                        }
                    } else if (awyjVar.j(i, null, awyc.d)) {
                        break;
                    }
                } else if (z) {
                    if (awyjVar.j(i, null, awyc.j)) {
                        awyjVar.g(i, false);
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (awyjVar.j(i, null, obj2)) {
                        return 2;
                    }
                }
            } else {
                if (objD != awyc.e) {
                    axdy axdyVar = awyc.k;
                    if (objD == axdyVar || objD == awyc.h) {
                        awyjVar.h(i, null);
                    } else {
                        if (objD == awyc.l) {
                            awyjVar.h(i, null);
                            y();
                            return 4;
                        }
                        boolean z2 = awuv.a;
                        awyjVar.h(i, null);
                        if (objD instanceof awyt) {
                            objD = ((awyt) objD).a;
                        }
                        if (O(objD, obj)) {
                            awyjVar.i(i, awyc.i);
                            return 0;
                        }
                        if (awyjVar.b(i, axdyVar) != axdyVar) {
                            awyjVar.g(i, true);
                        }
                    }
                    return 5;
                }
                if (awyjVar.j(i, objD, awyc.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    private final long C() {
        return this.g.b;
    }

    private final awyj D(long j) {
        Object objA;
        long j2;
        Object obj = this.i.a;
        awyj awyjVar = (awyj) this.c.a;
        if (awyjVar.b > ((awyj) obj).b) {
            obj = awyjVar;
        }
        awyj awyjVar2 = (awyj) this.d.a;
        if (awyjVar2.b > ((awyj) obj).b) {
            obj = awyjVar2;
        }
        axcv axcvVar = (axcv) obj;
        while (true) {
            Object objL = axcvVar.l();
            axdy axdyVar = axcu.a;
            objA = null;
            if (objL == axdyVar) {
                break;
            }
            axcv axcvVar2 = (axcv) objL;
            if (axcvVar2 == null) {
                if (axcvVar.a.d(null, axdyVar)) {
                    break;
                }
            } else {
                axcvVar = axcvVar2;
            }
        }
        awyj awyjVar3 = (awyj) axcvVar;
        if (z()) {
            awyj awyjVar4 = awyjVar3;
            loop1: while (true) {
                int i = awyc.b;
                int i2 = i - 1;
                while (true) {
                    if (i2 >= 0) {
                        j2 = (awyjVar4.b * ((long) i)) + ((long) i2);
                        if (j2 >= b()) {
                            while (true) {
                                Object objD = awyjVar4.d(i2);
                                if (objD != null && objD != awyc.e) {
                                    if (objD != awyc.d) {
                                        break;
                                    }
                                    break loop1;
                                }
                                if (awyjVar4.j(i2, objD, awyc.l)) {
                                    awyjVar4.r();
                                    break;
                                }
                            }
                            i2--;
                        }
                    } else {
                        awyjVar4 = (awyj) awyjVar4.n();
                        if (awyjVar4 == null) {
                        }
                    }
                    j2 = -1;
                    break;
                }
            }
            if (j2 != -1) {
                r(j2);
            }
        }
        loop4: for (awyj awyjVar5 = awyjVar3; awyjVar5 != null; awyjVar5 = (awyj) awyjVar5.n()) {
            int i3 = awyc.b;
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                if ((awyjVar5.b * ((long) i3)) + ((long) i4) < j) {
                    break loop4;
                }
                while (true) {
                    Object objD2 = awyjVar5.d(i4);
                    if (objD2 != null && objD2 != awyc.e) {
                        if (!(objD2 instanceof awyt)) {
                            if (!(objD2 instanceof awxo)) {
                                break;
                            }
                            if (awyjVar5.j(i4, objD2, awyc.l)) {
                                objA = axdk.a(objA, objD2);
                                awyjVar5.g(i4, true);
                                break;
                            }
                        } else {
                            if (awyjVar5.j(i4, objD2, awyc.l)) {
                                objA = axdk.a(objA, ((awyt) objD2).a);
                                awyjVar5.g(i4, true);
                                break;
                            }
                        }
                    } else {
                        if (awyjVar5.j(i4, objD2, awyc.l)) {
                            awyjVar5.r();
                            break;
                        }
                    }
                }
            }
        }
        if (objA != null) {
            if (objA instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) objA;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    H((awxo) arrayList.get(size), true);
                }
            } else {
                H((awxo) objA, true);
            }
        }
        return awyjVar3;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x000e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00a9 A[SYNTHETIC] */
    private final void E() {
        long j;
        Object objA;
        axdy axdyVar;
        awyj awyjVar;
        if (J()) {
            return;
        }
        awtr awtrVar = this.i;
        awyj awyjVar2 = (awyj) awtrVar.a;
        loop0: while (true) {
            awtq awtqVar = this.g;
            long jB = awtqVar.b();
            long j2 = awyc.b;
            long j3 = jB / j2;
            if (c() <= jB) {
                if (awyjVar2.b < j3 && awyjVar2.m() != null) {
                    G(j3, awyjVar2);
                }
                F(1L);
                return;
            }
            if (awyjVar2.b != j3) {
                awyb awybVar = awyb.a;
                while (true) {
                    objA = axcu.a(awyjVar2, j3, awybVar);
                    axdyVar = axcu.a;
                    if (objA == axdyVar) {
                        j = jB;
                        break;
                    }
                    axcv axcvVarB = axdw.b(objA);
                    while (true) {
                        axcv axcvVar = (axcv) awtrVar.a;
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
                            jB = j;
                        }
                    }
                    jB = j;
                }
                if (objA == axdyVar) {
                    y();
                    G(j3, awyjVar2);
                    F(1L);
                } else {
                    awyjVar = (awyj) axdw.b(objA);
                    long j4 = awyjVar.b;
                    if (j4 > j3) {
                        long j5 = j4 * j2;
                        if (awtqVar.c(j + 1, j5)) {
                            F(j5 - j);
                        } else {
                            F(1L);
                        }
                    } else {
                        boolean z = awuv.a;
                    }
                    if (awyjVar != null) {
                        awyjVar2 = awyjVar;
                    } else {
                        continue;
                    }
                }
                awyjVar = null;
                if (awyjVar != null) {
                    awyjVar2 = awyjVar;
                } else {
                    continue;
                }
            } else {
                j = jB;
            }
            int i = (int) (j % j2);
            Object objD = awyjVar2.d(i);
            if (!(objD instanceof awxo) || j < this.b.b || !awyjVar2.j(i, objD, awyc.g)) {
                while (true) {
                    Object objD2 = awyjVar2.d(i);
                    if (objD2 instanceof awxo) {
                        if (j < this.b.b) {
                            if (awyjVar2.j(i, objD2, new awyt((awxo) objD2))) {
                                break loop0;
                            }
                        } else if (awyjVar2.j(i, objD2, awyc.g)) {
                            if (!N(objD2)) {
                                awyjVar2.i(i, awyc.j);
                                awyjVar2.g(i, false);
                                break;
                            } else {
                                awyjVar2.i(i, awyc.d);
                                break;
                            }
                        }
                    } else {
                        if (objD2 == awyc.j) {
                            break;
                        }
                        if (objD2 == null) {
                            if (awyjVar2.j(i, null, awyc.e)) {
                                break loop0;
                            }
                        } else if (objD2 == awyc.d || objD2 == awyc.h || objD2 == awyc.i || objD2 == awyc.k || objD2 == awyc.l) {
                            break loop0;
                        } else if (objD2 != awyc.f) {
                            Objects.toString(objD2);
                            throw new IllegalStateException("Unexpected cell state: ".concat(objD2.toString()));
                        }
                    }
                }
                F(1L);
            } else if (N(objD)) {
                awyjVar2.i(i, awyc.d);
                break;
            } else {
                awyjVar2.i(i, awyc.j);
                awyjVar2.g(i, false);
                F(1L);
            }
        }
        F(1L);
    }

    private final void F(long j) {
        awtq awtqVar = this.h;
        if ((awtqVar.a(j) & 4611686018427387904L) != 0) {
            while ((awtqVar.b & 4611686018427387904L) != 0) {
            }
        }
    }

    private final void G(long j, awyj awyjVar) {
        awyj awyjVar2;
        awyj awyjVar3;
        while (awyjVar.b < j && (awyjVar3 = (awyj) awyjVar.m()) != null) {
            awyjVar = awyjVar3;
        }
        while (true) {
            if (!awyjVar.t() || (awyjVar2 = (awyj) awyjVar.m()) == null) {
                awtr awtrVar = this.i;
                while (true) {
                    axcv axcvVar = (axcv) awtrVar.a;
                    if (axcvVar.b >= awyjVar.b) {
                        return;
                    }
                    if (!awyjVar.u()) {
                        break;
                    }
                    if (awtrVar.d(axcvVar, awyjVar)) {
                        if (axcvVar.s()) {
                            axcvVar.p();
                            return;
                        }
                        return;
                    } else if (awyjVar.s()) {
                        awyjVar.p();
                    }
                }
            } else {
                awyjVar = awyjVar2;
            }
        }
    }

    private final void H(awxo awxoVar, boolean z) {
        j$.util.Objects.checkIndex(0, 6);
        if (awxoVar != null) {
            if (awxoVar instanceof awxx) {
                throw null;
            }
            if (awxoVar instanceof awuc) {
                ((awoq) awxoVar).resumeWith(atqp.i(z ? m() : n()));
                return;
            }
            if (awxoVar instanceof awyq) {
                ((awyq) awxoVar).a.resumeWith(new awyi(new awyg(l())));
                return;
            }
            if (awxoVar instanceof awxw) {
                awxw awxwVar = (awxw) awxoVar;
                awud awudVar = awxwVar.b;
                awudVar.getClass();
                awxwVar.b = null;
                awxwVar.a = awyc.l;
                Throwable thL = awxwVar.c.l();
                if (thL == null) {
                    awudVar.resumeWith(Boolean.FALSE);
                    return;
                }
                if (awuv.b) {
                    thL = axdx.a(thL, awudVar);
                }
                awudVar.resumeWith(atqp.i(thL));
                return;
            }
            if (awxoVar instanceof axfe) {
                awyj awyjVar = awyc.a;
                throw null;
            }
        }
        Objects.toString(awxoVar);
        throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(awxoVar)));
    }

    private final boolean I(long j) {
        return j < C() || j < b() + ((long) this.f);
    }

    private final boolean J() {
        long jC = C();
        return jC == 0 || jC == Long.MAX_VALUE;
    }

    private final Object K(awoq awoqVar) {
        awud awudVar = new awud(JniZero.q(awoqVar), 1);
        awudVar.w();
        Throwable thN = n();
        if (awuv.b) {
            thN = axdx.a(thN, awudVar);
        }
        awudVar.resumeWith(atqp.i(thN));
        Object objJ = awudVar.j();
        if (objJ != awox.a) {
            return awmy.a;
        }
        awoqVar.getClass();
        return objJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void L(awuc awucVar) {
        Throwable thN = n();
        if (awuv.b) {
            thN = axdx.a(thN, awucVar);
        }
        awucVar.resumeWith(atqp.i(thN));
    }

    private static final void M(awxo awxoVar, awyj awyjVar, int i) {
        awxoVar.B(awyjVar, i + awyc.b);
    }

    private static final boolean N(Object obj) {
        j$.util.Objects.checkIndex(0, 4);
        if (obj != null) {
            if (obj instanceof awuc) {
                return awyc.b((awuc) obj, awmy.a);
            }
            if (obj instanceof axfe) {
                throw null;
            }
            if (obj instanceof awxx) {
                throw null;
            }
        }
        Objects.toString(obj);
        throw new IllegalStateException("Unexpected waiter: ".concat(String.valueOf(obj)));
    }

    private static final boolean O(Object obj, Object obj2) {
        j$.util.Objects.checkIndex(0, 5);
        if (obj != null) {
            if (obj instanceof axfe) {
                throw null;
            }
            if (obj instanceof awyq) {
                return awyc.b(((awyq) obj).a, new awyi(obj2));
            }
            if (obj instanceof awxw) {
                awxw awxwVar = (awxw) obj;
                awud awudVar = awxwVar.b;
                awudVar.getClass();
                awxwVar.b = null;
                awxwVar.a = obj2;
                return awyc.b(awudVar, Boolean.TRUE);
            }
            if (obj instanceof awuc) {
                return awyc.b((awuc) obj, obj2);
            }
        }
        Objects.toString(obj);
        throw new IllegalStateException("Unexpected receiver type: ".concat(String.valueOf(obj)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object f(awya awyaVar, awoq awoqVar) throws Throwable {
        awxy awxyVar;
        awyj awyjVar;
        if (awoqVar instanceof awxy) {
            awxyVar = (awxy) awoqVar;
            int i = awxyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                awxyVar.c = i - Integer.MIN_VALUE;
            } else {
                awxyVar = new awxy(awyaVar, awoqVar);
            }
        } else {
            awxyVar = new awxy(awyaVar, awoqVar);
        }
        awxy awxyVar2 = awxyVar;
        Object obj = awxyVar2.a;
        awox awoxVar = awox.a;
        int i2 = awxyVar2.c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(obj);
            return ((awyi) obj).b;
        }
        atqp.j(obj);
        awyj awyjVar2 = (awyj) awyaVar.d.a;
        while (!awyaVar.x()) {
            long jB = awyaVar.b.b();
            long j = awyc.b;
            long j2 = jB / j;
            int i3 = (int) (jB % j);
            if (awyjVar2.b != j2) {
                awyj awyjVarO = awyaVar.o(j2, awyjVar2);
                if (awyjVarO != null) {
                    awyjVar = awyjVarO;
                } else {
                    continue;
                }
            } else {
                awyjVar = awyjVar2;
            }
            awya awyaVar2 = awyaVar;
            Object objK = awyaVar2.k(awyjVar, i3, jB, null);
            if (objK == awyc.m) {
                throw new IllegalStateException("unexpected");
            }
            if (objK != awyc.o) {
                if (objK == awyc.n) {
                    awxyVar2.c = 1;
                    objK = awyaVar2.g(awyjVar, i3, jB, awxyVar2);
                    if (objK == awoxVar) {
                        return awoxVar;
                    }
                } else {
                    awyjVar.o();
                }
                return objK;
            }
            if (jB < awyaVar2.c()) {
                awyjVar.o();
            }
            awyaVar = awyaVar2;
            awyjVar2 = awyjVar;
        }
        return new awyg(awyaVar.l());
    }

    @Override // defpackage.awyr
    public final awxw A() {
        return new awxw(this);
    }

    public final int a(awyj awyjVar, int i, Object obj, long j, Object obj2, boolean z) {
        awyjVar.h(i, obj);
        if (z) {
            return B(awyjVar, i, obj, j, obj2, true);
        }
        Object objD = awyjVar.d(i);
        if (objD == null) {
            if (I(j)) {
                if (awyjVar.j(i, null, awyc.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (awyjVar.j(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objD instanceof awxo) {
            awyjVar.h(i, null);
            if (O(objD, obj)) {
                awyjVar.i(i, awyc.i);
                return 0;
            }
            axdy axdyVar = awyc.k;
            if (awyjVar.b(i, axdyVar) != axdyVar) {
                awyjVar.g(i, true);
            }
            return 5;
        }
        return B(awyjVar, i, obj, j, obj2, false);
    }

    public final long b() {
        return this.b.b;
    }

    public final long c() {
        return this.a.b & 1152921504606846975L;
    }

    @Override // defpackage.awyr
    public final Object d(awoq awoqVar) throws Throwable {
        awya awyaVar = this;
        awtr awtrVar = awyaVar.d;
        awyj awyjVar = (awyj) awtrVar.a;
        while (!awyaVar.x()) {
            awtq awtqVar = awyaVar.b;
            long jB = awtqVar.b();
            long j = awyc.b;
            long j2 = jB / j;
            int i = (int) (jB % j);
            if (awyjVar.b != j2) {
                awyj awyjVarO = awyaVar.o(j2, awyjVar);
                if (awyjVarO != null) {
                    awyjVar = awyjVarO;
                } else {
                    continue;
                }
            }
            Object objK = awyaVar.k(awyjVar, i, jB, null);
            axdy axdyVar = awyc.m;
            if (objK == axdyVar) {
                throw new IllegalStateException("unexpected");
            }
            axdy axdyVar2 = awyc.o;
            if (objK == axdyVar2) {
                if (jB < c()) {
                    awyjVar.o();
                }
                awyaVar = this;
            } else {
                axdy axdyVar3 = awyc.n;
                if (objK != axdyVar3) {
                    awyjVar.o();
                    return objK;
                }
                awud awudVarJ = awqx.j(JniZero.q(awoqVar));
                awya awyaVar2 = this;
                try {
                    Object objK2 = awyaVar2.k(awyjVar, i, jB, awudVarJ);
                    if (objK2 == axdyVar) {
                        awudVarJ.B(awyjVar, i);
                    } else if (objK2 == axdyVar2) {
                        if (jB < awyaVar2.c()) {
                            awyjVar.o();
                        }
                        awyj awyjVar2 = (awyj) awtrVar.a;
                        while (!awyaVar2.x()) {
                            long jB2 = awtqVar.b();
                            long j3 = jB2 / j;
                            awud awudVar = awudVarJ;
                            try {
                                int i2 = (int) (jB2 % j);
                                if (awyjVar2.b != j3) {
                                    awyj awyjVarO2 = awyaVar2.o(j3, awyjVar2);
                                    if (awyjVarO2 != null) {
                                        awyjVar2 = awyjVarO2;
                                    } else {
                                        awudVarJ = awudVar;
                                    }
                                }
                                awudVarJ = awudVar;
                                Object objK3 = awyaVar2.k(awyjVar2, i2, jB2, awudVarJ);
                                if (objK3 == axdyVar) {
                                    awudVarJ.B(awyjVar2, i2);
                                } else if (objK3 == axdyVar2) {
                                    if (jB2 < c()) {
                                        awyjVar2.o();
                                    }
                                    awyaVar2 = this;
                                } else {
                                    if (objK3 == axdyVar3) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    awyjVar2.o();
                                    awudVarJ.d(objK3, null);
                                }
                            } catch (Throwable th) {
                                th = th;
                                awudVarJ = awudVar;
                                awudVarJ.y();
                                throw th;
                            }
                        }
                        awudVarJ.resumeWith(new awmm(awyaVar2.m()));
                    } else {
                        awyjVar.o();
                        awudVarJ.d(objK2, null);
                    }
                    Object objJ = awudVarJ.j();
                    awox awoxVar = awox.a;
                    return objJ;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        throw axdx.b(m());
    }

    @Override // defpackage.awyr
    public final Object e(awoq awoqVar) {
        return f(this, awoqVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object g(awyj awyjVar, int i, long j, awoq awoqVar) throws Throwable {
        awxz awxzVar;
        awyi awyiVar;
        awql awqlVar;
        awya awyaVar = this;
        if (awoqVar instanceof awxz) {
            awxzVar = (awxz) awoqVar;
            int i2 = awxzVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                awxzVar.e = i2 - Integer.MIN_VALUE;
            } else {
                awxzVar = new awxz(awyaVar, awoqVar);
            }
        } else {
            awxzVar = new awxz(awyaVar, awoqVar);
        }
        Object objJ = awxzVar.c;
        awox awoxVar = awox.a;
        int i3 = awxzVar.e;
        if (i3 == 0) {
            atqp.j(objJ);
            awxzVar.f = awyjVar;
            awxzVar.a = i;
            awxzVar.b = j;
            awxzVar.e = 1;
            awud awudVarJ = awqx.j(JniZero.q(awxzVar));
            try {
                awyq awyqVar = new awyq(awudVarJ);
                Object objK = awyaVar.k(awyjVar, i, j, awyqVar);
                axdy axdyVar = awyc.m;
                if (objK != axdyVar) {
                    axdy axdyVar2 = awyc.o;
                    if (objK == axdyVar2) {
                        if (j < awyaVar.c()) {
                            awyjVar.o();
                        }
                        awyj awyjVar2 = (awyj) awyaVar.d.a;
                        while (true) {
                            if (awyaVar.x()) {
                                awudVarJ.resumeWith(new awyi(new awyg(awyaVar.l())));
                                break;
                            }
                            long jB = awyaVar.b.b();
                            long j2 = awyc.b;
                            long j3 = jB / j2;
                            int i4 = (int) (jB % j2);
                            if (awyjVar2.b != j3) {
                                awyj awyjVarO = awyaVar.o(j3, awyjVar2);
                                if (awyjVarO != null) {
                                    awyjVar2 = awyjVarO;
                                } else {
                                    continue;
                                }
                            }
                            Object objK2 = awyaVar.k(awyjVar2, i4, jB, awyqVar);
                            if (objK2 == axdyVar) {
                                awyqVar.B(awyjVar2, i4);
                                break;
                            }
                            if (objK2 == axdyVar2) {
                                if (jB < c()) {
                                    awyjVar2.o();
                                }
                                awyaVar = this;
                            } else {
                                if (objK2 == awyc.n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                awyjVar2.o();
                                awyiVar = new awyi(objK2);
                                awqlVar = null;
                            }
                        }
                    } else {
                        awyjVar.o();
                        awyiVar = new awyi(objK);
                        awqlVar = null;
                    }
                    awudVarJ.d(awyiVar, awqlVar);
                    break;
                }
                awyqVar.B(awyjVar, i);
                objJ = awudVarJ.j();
                if (objJ == awox.a) {
                    awxzVar.getClass();
                }
                if (objJ == awoxVar) {
                    return awoxVar;
                }
            } catch (Throwable th) {
                awudVarJ.y();
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j4 = awxzVar.b;
            int i5 = awxzVar.a;
            awyj awyjVar3 = awxzVar.f;
            atqp.j(objJ);
        }
        return ((awyi) objJ).b;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c9 A[Catch: all -> 0x012b, TryCatch #0 {all -> 0x012b, blocks: (B:29:0x007b, B:36:0x008c, B:37:0x0093, B:39:0x00ab, B:68:0x0107, B:44:0x00b5, B:51:0x00c9, B:53:0x00d0, B:55:0x00d8, B:56:0x00dc, B:57:0x00e1, B:59:0x00e4, B:60:0x00e8, B:61:0x00ec, B:72:0x0117, B:62:0x00ef, B:63:0x00f5, B:64:0x00fb, B:65:0x00fc, B:67:0x0104, B:69:0x010b, B:70:0x010f, B:71:0x0112), top: B:90:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d8 A[Catch: all -> 0x012b, TryCatch #0 {all -> 0x012b, blocks: (B:29:0x007b, B:36:0x008c, B:37:0x0093, B:39:0x00ab, B:68:0x0107, B:44:0x00b5, B:51:0x00c9, B:53:0x00d0, B:55:0x00d8, B:56:0x00dc, B:57:0x00e1, B:59:0x00e4, B:60:0x00e8, B:61:0x00ec, B:72:0x0117, B:62:0x00ef, B:63:0x00f5, B:64:0x00fb, B:65:0x00fc, B:67:0x0104, B:69:0x010b, B:70:0x010f, B:71:0x0112), top: B:90:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4 A[Catch: all -> 0x012b, TryCatch #0 {all -> 0x012b, blocks: (B:29:0x007b, B:36:0x008c, B:37:0x0093, B:39:0x00ab, B:68:0x0107, B:44:0x00b5, B:51:0x00c9, B:53:0x00d0, B:55:0x00d8, B:56:0x00dc, B:57:0x00e1, B:59:0x00e4, B:60:0x00e8, B:61:0x00ec, B:72:0x0117, B:62:0x00ef, B:63:0x00f5, B:64:0x00fb, B:65:0x00fc, B:67:0x0104, B:69:0x010b, B:70:0x010f, B:71:0x0112), top: B:90:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8 A[Catch: all -> 0x012b, EDGE_INSN: B:60:0x00e8->B:73:0x011a BREAK  A[LOOP:1: B:37:0x0093->B:52:0x00cd], TryCatch #0 {all -> 0x012b, blocks: (B:29:0x007b, B:36:0x008c, B:37:0x0093, B:39:0x00ab, B:68:0x0107, B:44:0x00b5, B:51:0x00c9, B:53:0x00d0, B:55:0x00d8, B:56:0x00dc, B:57:0x00e1, B:59:0x00e4, B:60:0x00e8, B:61:0x00ec, B:72:0x0117, B:62:0x00ef, B:63:0x00f5, B:64:0x00fb, B:65:0x00fc, B:67:0x0104, B:69:0x010b, B:70:0x010f, B:71:0x0112), top: B:90:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0122  */
    /* JADX WARN: Code duplicated, block: B:76:0x0126  */
    @Override // defpackage.awys
    public Object h(Object obj, awoq awoqVar) throws awve {
        awmy awmyVar;
        Object objJ;
        awox awoxVar;
        String str;
        int iA;
        awtr awtrVar = this.c;
        awyj awyjVar = (awyj) awtrVar.a;
        while (true) {
            awtq awtqVar = this.a;
            long jB = awtqVar.b();
            long j = jB & 1152921504606846975L;
            boolean zW = w(jB, false);
            long j2 = awyc.b;
            long j3 = j / j2;
            int i = (int) (j % j2);
            if (awyjVar.b != j3) {
                awyj awyjVarQ = q(j3, awyjVar);
                if (awyjVarQ != null) {
                    awyjVar = awyjVarQ;
                } else if (zW) {
                    Object objK = K(awoqVar);
                    if (objK != awox.a) {
                        break;
                    }
                    return objK;
                }
            }
            int iA2 = a(awyjVar, i, obj, j, null, zW);
            if (iA2 == 0) {
                awyjVar.o();
                break;
            }
            if (iA2 != 1) {
                if (iA2 == 2) {
                    if (!zW) {
                        boolean z = awuv.a;
                        break;
                    }
                    awyjVar.r();
                    Object objK2 = K(awoqVar);
                    if (objK2 != awox.a) {
                        break;
                    }
                    return objK2;
                }
                if (iA2 == 3) {
                    awud awudVarJ = awqx.j(JniZero.q(awoqVar));
                    try {
                        int iA3 = a(awyjVar, i, obj, j, awudVarJ, false);
                        if (iA3 == 0) {
                            awyjVar.o();
                            awmyVar = awmy.a;
                        } else {
                            if (iA3 != 1) {
                                if (iA3 != 2) {
                                    if (iA3 != 4) {
                                        String str2 = "unexpected";
                                        if (iA3 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        awyjVar.o();
                                        awyj awyjVar2 = (awyj) awtrVar.a;
                                        while (true) {
                                            long jB2 = awtqVar.b();
                                            long j4 = jB2 & 1152921504606846975L;
                                            boolean zW2 = w(jB2, false);
                                            long j5 = j4 / j2;
                                            awtq awtqVar2 = awtqVar;
                                            int i2 = (int) (j4 % j2);
                                            if (awyjVar2.b == j5) {
                                                str = str2;
                                                iA = a(awyjVar2, i2, obj, j4, awudVarJ, zW2);
                                                if (iA != 0) {
                                                    awyjVar2.o();
                                                    awmyVar = awmy.a;
                                                } else if (iA != 1) {
                                                    awmyVar = awmy.a;
                                                } else if (iA != 2) {
                                                    if (zW2) {
                                                        M(awudVarJ, awyjVar2, i2);
                                                        break;
                                                    }
                                                    awyjVar2.r();
                                                } else {
                                                    if (iA != 3) {
                                                        throw new IllegalStateException(str);
                                                    }
                                                    if (iA != 4) {
                                                        awyjVar2.o();
                                                        str2 = str;
                                                        awtqVar = awtqVar2;
                                                    } else if (j4 < b()) {
                                                        awyjVar2.o();
                                                    }
                                                }
                                            } else {
                                                awyj awyjVarQ2 = q(j5, awyjVar2);
                                                if (awyjVarQ2 != null) {
                                                    awyjVar2 = awyjVarQ2;
                                                    str = str2;
                                                    iA = a(awyjVar2, i2, obj, j4, awudVarJ, zW2);
                                                    if (iA != 0) {
                                                        awyjVar2.o();
                                                        awmyVar = awmy.a;
                                                    } else if (iA != 1) {
                                                        awmyVar = awmy.a;
                                                    } else if (iA != 2) {
                                                        if (zW2) {
                                                            M(awudVarJ, awyjVar2, i2);
                                                            break;
                                                        }
                                                        awyjVar2.r();
                                                    } else {
                                                        if (iA != 3) {
                                                            throw new IllegalStateException(str);
                                                        }
                                                        if (iA != 4) {
                                                            awyjVar2.o();
                                                            str2 = str;
                                                            awtqVar = awtqVar2;
                                                        } else if (j4 < b()) {
                                                            awyjVar2.o();
                                                        }
                                                    }
                                                } else if (!zW2) {
                                                    awtqVar = awtqVar2;
                                                }
                                            }
                                        }
                                    } else if (j < b()) {
                                        awyjVar.o();
                                    }
                                    L(awudVarJ);
                                    break;
                                } else {
                                    M(awudVarJ, awyjVar, i);
                                }
                                objJ = awudVarJ.j();
                                awoxVar = awox.a;
                                if (objJ == awoxVar) {
                                    awoqVar.getClass();
                                } else {
                                    objJ = awmy.a;
                                }
                                if (objJ == awoxVar) {
                                    break;
                                }
                                return objJ;
                            }
                            awmyVar = awmy.a;
                        }
                        awudVarJ.resumeWith(awmyVar);
                        objJ = awudVarJ.j();
                        awoxVar = awox.a;
                        if (objJ == awoxVar) {
                            awoqVar.getClass();
                        } else {
                            objJ = awmy.a;
                        }
                        if (objJ == awoxVar) {
                            break;
                        }
                        return objJ;
                    } catch (Throwable th) {
                        awudVarJ.y();
                        throw th;
                    }
                }
                if (iA2 == 4) {
                    if (j < b()) {
                        awyjVar.o();
                    }
                    Object objK3 = K(awoqVar);
                    if (objK3 != awox.a) {
                        break;
                    }
                    return objK3;
                }
                awyjVar.o();
            } else {
                break;
            }
        }
        return awmy.a;
    }

    @Override // defpackage.awyr
    public final Object i() {
        awyj awyjVar;
        awtq awtqVar = this.b;
        long j = awtqVar.b;
        long j2 = this.a.b;
        if (w(j2, true)) {
            return new awyg(l());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return awyi.a;
        }
        awtr awtrVar = this.d;
        axdy axdyVar = awyc.k;
        awyj awyjVar2 = (awyj) awtrVar.a;
        while (!this.x()) {
            long jB = awtqVar.b();
            long j3 = awyc.b;
            long j4 = jB / j3;
            int i = (int) (jB % j3);
            if (awyjVar2.b != j4) {
                awyj awyjVarO = this.o(j4, awyjVar2);
                if (awyjVarO != null) {
                    awyjVar = awyjVarO;
                } else {
                    continue;
                }
            } else {
                awyjVar = awyjVar2;
            }
            awya awyaVar = this;
            Object objK = awyaVar.k(awyjVar, i, jB, axdyVar);
            awyjVar2 = awyjVar;
            if (objK == awyc.m) {
                awyaVar.t(jB);
                awyjVar2.r();
                return awyi.a;
            }
            if (objK != awyc.o) {
                if (objK == awyc.n) {
                    throw new IllegalStateException("unexpected");
                }
                awyjVar2.o();
                return objK;
            }
            if (jB < awyaVar.c()) {
                awyjVar2.o();
            }
            this = awyaVar;
        }
        return new awyg(this.l());
    }

    @Override // defpackage.awys
    public Object j(Object obj) {
        awyg awygVar;
        awya awyaVar = this;
        awtq awtqVar = awyaVar.a;
        long j = awtqVar.b;
        if (!awyaVar.w(j, false) && !awyaVar.I(j & 1152921504606846975L)) {
            return awyi.a;
        }
        awtr awtrVar = awyaVar.c;
        axdy axdyVar = awyc.j;
        awyj awyjVar = (awyj) awtrVar.a;
        while (true) {
            long jB = awtqVar.b();
            long j2 = jB & 1152921504606846975L;
            boolean zW = awyaVar.w(jB, false);
            long j3 = awyc.b;
            long j4 = j2 / j3;
            int i = (int) (j2 % j3);
            if (awyjVar.b != j4) {
                awyj awyjVarQ = awyaVar.q(j4, awyjVar);
                if (awyjVarQ != null) {
                    awyjVar = awyjVarQ;
                } else if (zW) {
                    awygVar = new awyg(awyaVar.n());
                    break;
                }
            }
            int iA = awyaVar.a(awyjVar, i, obj, j2, axdyVar, zW);
            if (iA == 0) {
                awyjVar.o();
                return awmy.a;
            }
            if (iA == 1) {
                return awmy.a;
            }
            if (iA == 2) {
                if (!zW) {
                    awyjVar.r();
                    return awyi.a;
                }
                awyjVar.r();
                awygVar = new awyg(n());
                break;
            }
            if (iA == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iA == 4) {
                if (j2 < b()) {
                    awyjVar.o();
                }
                awygVar = new awyg(n());
                break;
            }
            awyjVar.o();
            awyaVar = this;
        }
        return awygVar;
    }

    public final Object k(awyj awyjVar, int i, long j, Object obj) {
        Object objD = awyjVar.d(i);
        if (objD == null) {
            if (j >= (this.a.b & 1152921504606846975L)) {
                if (obj == null) {
                    return awyc.n;
                }
                if (awyjVar.j(i, null, obj)) {
                    E();
                    return awyc.m;
                }
            }
        } else if (objD == awyc.d && awyjVar.j(i, objD, awyc.i)) {
            E();
            return awyjVar.e(i);
        }
        while (true) {
            Object objD2 = awyjVar.d(i);
            if (objD2 == null || objD2 == awyc.e) {
                if (j < (this.a.b & 1152921504606846975L)) {
                    if (awyjVar.j(i, objD2, awyc.h)) {
                        E();
                        return awyc.o;
                    }
                } else {
                    if (obj == null) {
                        return awyc.n;
                    }
                    if (awyjVar.j(i, objD2, obj)) {
                        E();
                        return awyc.m;
                    }
                }
            } else if (objD2 != awyc.d) {
                axdy axdyVar = awyc.j;
                if (objD2 == axdyVar || objD2 == awyc.h) {
                    return awyc.o;
                }
                if (objD2 == awyc.l) {
                    E();
                    return awyc.o;
                }
                if (objD2 != awyc.g && awyjVar.j(i, objD2, awyc.f)) {
                    boolean z = objD2 instanceof awyt;
                    if (z) {
                        objD2 = ((awyt) objD2).a;
                    }
                    if (N(objD2)) {
                        awyjVar.i(i, awyc.i);
                        E();
                        return awyjVar.e(i);
                    }
                    awyjVar.i(i, axdyVar);
                    awyjVar.g(i, false);
                    if (z) {
                        E();
                    }
                    return awyc.o;
                }
            } else if (awyjVar.j(i, objD2, awyc.i)) {
                E();
                return awyjVar.e(i);
            }
        }
    }

    public final Throwable l() {
        return (Throwable) this.j.a;
    }

    public final Throwable m() {
        Throwable thL = l();
        return thL == null ? new awyk() : thL;
    }

    protected final Throwable n() {
        Throwable thL = l();
        return thL == null ? new awyl("Channel was closed") : thL;
    }

    public final awyj o(long j, awyj awyjVar) {
        Object objA;
        long j2;
        long j3;
        awyj awyjVar2 = awyc.a;
        awyb awybVar = awyb.a;
        loop0: while (true) {
            objA = axcu.a(awyjVar, j, awybVar);
            if (axdw.a(objA)) {
                break;
            }
            axcv axcvVarB = axdw.b(objA);
            while (true) {
                awtr awtrVar = this.d;
                axcv axcvVar = (axcv) awtrVar.a;
                if (axcvVar.b >= axcvVarB.b) {
                    break loop0;
                }
                if (axcvVarB.u()) {
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
                }
            }
        }
        if (axdw.a(objA)) {
            y();
            if (awyjVar.b * ((long) awyc.b) >= c()) {
                return null;
            }
            awyjVar.o();
            return null;
        }
        awyj awyjVar3 = (awyj) axdw.b(objA);
        if (!J() && j <= C() / ((long) awyc.b)) {
            awtr awtrVar2 = this.i;
            while (true) {
                axcv axcvVar2 = (axcv) awtrVar2.a;
                if (axcvVar2.b >= awyjVar3.b || !awyjVar3.u()) {
                    break;
                }
                if (awtrVar2.d(axcvVar2, awyjVar3)) {
                    if (!axcvVar2.s()) {
                        break;
                    }
                    axcvVar2.p();
                    break;
                }
                if (awyjVar3.s()) {
                    awyjVar3.p();
                }
            }
        }
        long j4 = awyjVar3.b;
        if (j4 <= j) {
            boolean z = awuv.a;
            return awyjVar3;
        }
        long j5 = awyc.b;
        awtq awtqVar = this.b;
        do {
            j2 = j4 * j5;
            j3 = awtqVar.b;
            if (j3 >= j2) {
                break;
            }
        } while (!awtqVar.c(j3, j2));
        if (j2 >= c()) {
            return null;
        }
        awyjVar3.o();
        return null;
    }

    @Override // defpackage.awyr
    public final void p(CancellationException cancellationException) {
        v(cancellationException, true);
    }

    public final awyj q(long j, awyj awyjVar) {
        Object objA;
        long j2;
        long j3;
        long j4;
        awyj awyjVar2 = awyc.a;
        awyb awybVar = awyb.a;
        loop0: while (true) {
            objA = axcu.a(awyjVar, j, awybVar);
            if (axdw.a(objA)) {
                break;
            }
            axcv axcvVarB = axdw.b(objA);
            while (true) {
                awtr awtrVar = this.c;
                axcv axcvVar = (axcv) awtrVar.a;
                if (axcvVar.b >= axcvVarB.b) {
                    break loop0;
                }
                if (axcvVarB.u()) {
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
                }
            }
        }
        if (axdw.a(objA)) {
            y();
            if (awyjVar.b * ((long) awyc.b) >= b()) {
                return null;
            }
            awyjVar.o();
            return null;
        }
        awyj awyjVar3 = (awyj) axdw.b(objA);
        long j5 = awyjVar3.b;
        if (j5 <= j) {
            boolean z = awuv.a;
            return awyjVar3;
        }
        long j6 = awyc.b;
        awtq awtqVar = this.a;
        do {
            j2 = j5 * j6;
            j3 = awtqVar.b;
            j4 = 1152921504606846975L & j3;
            if (j4 >= j2) {
                break;
            }
        } while (!awtqVar.c(j3, awyc.a(j4, (int) (j3 >> 60))));
        if (j2 >= b()) {
            return null;
        }
        awyjVar3.o();
        return null;
    }

    protected final void r(long j) {
        awyj awyjVar;
        boolean z = awuv.a;
        awyj awyjVar2 = (awyj) this.d.a;
        while (true) {
            awtq awtqVar = this.b;
            int i = this.f;
            long j2 = awtqVar.b;
            if (j < Math.max(((long) i) + j2, this.C())) {
                return;
            }
            if (awtqVar.c(j2, 1 + j2)) {
                long j3 = awyc.b;
                long j4 = j2 / j3;
                int i2 = (int) (j2 % j3);
                if (awyjVar2.b != j4) {
                    awyj awyjVarO = this.o(j4, awyjVar2);
                    if (awyjVarO != null) {
                        awyjVar = awyjVarO;
                    }
                } else {
                    awyjVar = awyjVar2;
                }
                awya awyaVar = this;
                if (awyaVar.k(awyjVar, i2, j2, null) != awyc.o || j2 < awyaVar.c()) {
                    awyjVar.o();
                }
                this = awyaVar;
                awyjVar2 = awyjVar;
            }
            this = this;
        }
    }

    @Override // defpackage.awys
    public final void s(awqg awqgVar) {
        axdy axdyVar;
        awtr awtrVar = this.k;
        if (awtrVar.d(null, awqgVar)) {
            return;
        }
        do {
            Object obj = awtrVar.a;
            axdyVar = awyc.q;
            if (obj != axdyVar) {
                if (obj == awyc.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                Objects.toString(obj);
                throw new IllegalStateException("Another handler is already registered: ".concat(String.valueOf(obj)));
            }
        } while (!awtrVar.d(axdyVar, awyc.r));
        awqgVar.invoke(l());
    }

    public final void t(long j) {
        long j2;
        long j3;
        if (J()) {
            return;
        }
        while (C() <= j) {
        }
        int i = awyc.c;
        for (int i2 = 0; i2 < i; i2++) {
            long jC = C();
            if (jC == (this.h.b & 4611686018427387903L) && jC == C()) {
                return;
            }
        }
        awtq awtqVar = this.h;
        do {
            j2 = awtqVar.b;
        } while (!awtqVar.c(j2, (j2 & 4611686018427387903L) + 4611686018427387904L));
        while (true) {
            long jC2 = C();
            long j4 = awtqVar.b;
            long j5 = j4 & 4611686018427387903L;
            long j6 = j4 & 4611686018427387904L;
            if (jC2 == j5 && jC2 == C()) {
                break;
            } else if (j6 == 0) {
                awtqVar.c(j4, j5 + 4611686018427387904L);
            }
        }
        do {
            j3 = awtqVar.b;
        } while (!awtqVar.c(j3, j3 & 4611686018427387903L));
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i = (int) (this.a.b >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f + ',');
        sb.append("data=[");
        List listAL = atqq.aL(new awyj[]{(awyj) this.d.a, (awyj) this.c.a, (awyj) this.i.a});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAL) {
            if (((awyj) obj) != awyc.a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((awyj) next).b;
            do {
                Object next2 = it.next();
                long j2 = ((awyj) next2).b;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        awyj awyjVar = (awyj) next;
        long jB = b();
        long jC = c();
        loop2: do {
            int i2 = awyc.b;
            for (int i3 = 0; i3 < i2; i3++) {
                long j3 = (awyjVar.b * ((long) i2)) + ((long) i3);
                if (j3 >= jC && j3 >= jB) {
                    break loop2;
                }
                Object objD = awyjVar.d(i3);
                Object objC = awyjVar.c(i3);
                if (objD instanceof awuc) {
                    string = (jC > j3 || j3 >= jB) ? (jB > j3 || j3 >= jC) ? "cont" : "send" : "receive";
                } else if (objD instanceof axfe) {
                    string = (jC > j3 || j3 >= jB) ? (jB > j3 || j3 >= jC) ? "select" : "onSend" : "onReceive";
                } else if (objD instanceof awyq) {
                    string = "receiveCatching";
                } else if (objD instanceof awxx) {
                    string = "sendBroadcast";
                } else if (objD instanceof awyt) {
                    string = "EB(" + objD + ')';
                } else if (awrc.c(objD, awyc.f) || awrc.c(objD, awyc.g)) {
                    string = "resuming_sender";
                } else {
                    if (objD != null && !awrc.c(objD, awyc.e) && !awrc.c(objD, awyc.i) && !awrc.c(objD, awyc.h) && !awrc.c(objD, awyc.k) && !awrc.c(objD, awyc.j) && !awrc.c(objD, awyc.l)) {
                        string = objD.toString();
                    }
                }
                if (objC != null) {
                    sb.append("(" + string + ',' + objC + "),");
                } else {
                    sb.append(String.valueOf(string).concat(","));
                }
            }
            awyjVar = (awyj) awyjVar.m();
        } while (awyjVar != null);
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(awrc.o(sb)) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.awys
    public final boolean u(Throwable th) {
        return v(th, false);
    }

    protected final boolean v(Throwable th, boolean z) {
        long j;
        long jA;
        Object obj;
        long j2;
        long j3;
        if (z) {
            awtq awtqVar = this.a;
            do {
                j3 = awtqVar.b;
                if (((int) (j3 >> 60)) != 0) {
                    break;
                }
            } while (!awtqVar.c(j3, awyc.a(j3 & 1152921504606846975L, 1)));
        }
        boolean zD = this.j.d(awyc.s, th);
        awtq awtqVar2 = this.a;
        if (z) {
            do {
                j2 = awtqVar2.b;
            } while (!awtqVar2.c(j2, awyc.a(j2 & 1152921504606846975L, 3)));
        } else {
            do {
                j = awtqVar2.b;
                int i = (int) (j >> 60);
                if (i == 0) {
                    jA = awyc.a(j & 1152921504606846975L, 2);
                } else {
                    if (i != 1) {
                        break;
                    }
                    jA = awyc.a(j & 1152921504606846975L, 3);
                }
            } while (!awtqVar2.c(j, jA));
        }
        y();
        if (zD) {
            awtr awtrVar = this.k;
            do {
                obj = awtrVar.a;
            } while (!awtrVar.d(obj, obj == null ? awyc.q : awyc.r));
            if (obj != null) {
                awro.c(obj, 1);
                ((awqg) obj).invoke(l());
                return true;
            }
        }
        return zD;
    }

    public final boolean w(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        if (i == 2) {
            D(j & 1152921504606846975L);
            if (z) {
                while (true) {
                    awtr awtrVar = this.d;
                    awyj awyjVarO = (awyj) awtrVar.a;
                    long jB = b();
                    if (c() <= jB) {
                        break;
                    }
                    long j2 = awyc.b;
                    long j3 = jB / j2;
                    if (awyjVarO.b != j3 && (awyjVarO = o(j3, awyjVarO)) == null) {
                        if (((awyj) awtrVar.a).b < j3) {
                            break;
                        }
                    } else {
                        awyjVarO.o();
                        int i2 = (int) (jB % j2);
                        while (true) {
                            Object objD = awyjVarO.d(i2);
                            if (objD != null && objD != awyc.e) {
                                if (objD == awyc.d) {
                                    return false;
                                }
                                if (objD == awyc.j || objD == awyc.l || objD == awyc.i || objD == awyc.h) {
                                    break;
                                    break;
                                    break;
                                    break;
                                }
                                if (objD == awyc.g) {
                                    return false;
                                }
                                if (objD == awyc.f || jB != b()) {
                                    break;
                                    break;
                                }
                                return false;
                            }
                            if (awyjVarO.j(i2, objD, awyc.h)) {
                                E();
                                break;
                            }
                        }
                        this.b.c(jB, 1 + jB);
                    }
                }
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException(a.bR(i, "unexpected close status: "));
            }
            awyj awyjVarD = D(j & 1152921504606846975L);
            Object objA = null;
            loop0: do {
                int i3 = awyc.b;
                for (int i4 = i3 - 1; i4 >= 0; i4--) {
                    long j4 = awyjVarD.b * ((long) i3);
                    while (true) {
                        Object objD2 = awyjVarD.d(i4);
                        if (objD2 == awyc.i) {
                            break loop0;
                        }
                        long j5 = ((long) i4) + j4;
                        if (objD2 != awyc.d) {
                            if (objD2 != awyc.e && objD2 != null) {
                                if (!(objD2 instanceof awxo) && !(objD2 instanceof awyt)) {
                                    axdy axdyVar = awyc.g;
                                    if (objD2 == axdyVar || objD2 == awyc.f) {
                                        break loop0;
                                    }
                                    if (objD2 != axdyVar) {
                                        break;
                                    }
                                } else {
                                    if (j5 < b()) {
                                        break loop0;
                                    }
                                    awxo awxoVar = objD2 instanceof awyt ? ((awyt) objD2).a : (awxo) objD2;
                                    if (awyjVarD.j(i4, objD2, awyc.l)) {
                                        objA = axdk.a(objA, awxoVar);
                                        awyjVarD.h(i4, null);
                                        awyjVarD.r();
                                        break;
                                    }
                                }
                            } else {
                                if (awyjVarD.j(i4, objD2, awyc.l)) {
                                    awyjVarD.r();
                                    break;
                                }
                            }
                        } else {
                            if (j5 < b()) {
                                break loop0;
                            }
                            if (awyjVarD.j(i4, objD2, awyc.l)) {
                                awyjVarD.h(i4, null);
                                awyjVarD.r();
                                break;
                            }
                        }
                    }
                }
                awyjVarD = (awyj) awyjVarD.n();
            } while (awyjVarD != null);
            if (objA != null) {
                if (objA instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) objA;
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        H((awxo) arrayList.get(size), false);
                    }
                } else {
                    H((awxo) objA, false);
                }
            }
        }
        return true;
    }

    public final boolean x() {
        return w(this.a.b, true);
    }

    @Override // defpackage.awys
    public final boolean y() {
        return w(this.a.b, false);
    }

    protected boolean z() {
        return false;
    }
}
