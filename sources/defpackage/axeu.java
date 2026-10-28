package defpackage;

import androidx.car.app.model.Alert;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axeu extends Thread {
    public final axfd a;
    public final awtp b;
    public boolean c;
    final /* synthetic */ axev d;
    public int e;
    private final awrm f;
    private long g;
    private long h;
    private int i;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;

    public axeu(axev axevVar, int i) {
        this.d = axevVar;
        setDaemon(true);
        setContextClassLoader(axevVar.getClass().getClassLoader());
        this.a = new axfd();
        this.f = new awrm();
        this.e = 4;
        this.b = new awtp(0, awts.a);
        this.nextParkedWorker = axev.a;
        int iNanoTime = (int) System.nanoTime();
        this.i = iNanoTime == 0 ? 42 : iNanoTime;
        c(i);
    }

    private final axez e() {
        int iA = a(2);
        axev axevVar = this.d;
        if (iA == 0) {
            axez axezVar = (axez) axevVar.i.p();
            return axezVar == null ? (axez) axevVar.j.p() : axezVar;
        }
        axez axezVar2 = (axez) axevVar.j.p();
        return axezVar2 == null ? (axez) axevVar.i.p() : axezVar2;
    }

    private final axez f(int i) {
        long j;
        axez axezVarC;
        long j2;
        Object obj;
        long j3;
        long j4;
        axev axevVar = this.d;
        int i2 = (int) (axevVar.h.b & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iA = a(i2);
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            iA++;
            if (iA > i2) {
                iA = 1;
            }
            axeu axeuVar = (axeu) axevVar.g.a(iA);
            if (axeuVar != null && axeuVar != this) {
                axfd axfdVar = axeuVar.a;
                awrm awrmVar = this.f;
                if (i != 3) {
                    boolean z = i == 1;
                    int i4 = ((awtp) axfdVar.d).b;
                    j = 0;
                    int i5 = ((awtp) axfdVar.c).b;
                    while (true) {
                        if (i4 == i5 || (z && ((awtp) axfdVar.e).b == 0)) {
                            axezVarC = null;
                            break;
                        }
                        int i6 = i4 + 1;
                        axez axezVarD = axfdVar.d(i4, z);
                        if (axezVarD != null) {
                            axezVarC = axezVarD;
                            break;
                        }
                        i4 = i6;
                    }
                } else {
                    axezVarC = axfdVar.c();
                    j = 0;
                }
                if (axezVarC != null) {
                    awrmVar.a = axezVarC;
                    obj = null;
                    j4 = -1;
                    j3 = -1;
                } else {
                    while (true) {
                        awtr awtrVar = (awtr) axfdVar.b;
                        axez axezVar = (axez) awtrVar.a;
                        j2 = -2;
                        if (axezVar != null) {
                            j3 = -1;
                            if (((true != axezVar.h ? 2 : 1) & i) != 0) {
                                String str = axfb.a;
                                axfd axfdVar2 = axfdVar;
                                long jNanoTime = System.nanoTime() - axezVar.g;
                                long j5 = axfb.b;
                                if (jNanoTime < j5) {
                                    j2 = j5 - jNanoTime;
                                } else {
                                    obj = null;
                                    if (awtrVar.d(axezVar, null)) {
                                        awrmVar.a = axezVar;
                                        j2 = -1;
                                        break;
                                    }
                                    axfdVar = axfdVar2;
                                }
                            }
                            obj = null;
                            break;
                        }
                        obj = null;
                        j3 = -1;
                        break;
                    }
                    j4 = j2;
                }
                if (j4 == j3) {
                    axez axezVar2 = (axez) awrmVar.a;
                    awrmVar.a = obj;
                    return axezVar2;
                }
                if (j4 > j) {
                    jMin = Math.min(jMin, j4);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.h = jMin;
        return null;
    }

    private final boolean g() {
        return this.nextParkedWorker != axev.a;
    }

    public final int a(int i) {
        int i2 = this.i;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.i = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Alert.DURATION_SHOW_INDEFINITELY) % i;
    }

    public final axez b(boolean z) {
        axez axezVarE;
        axez axezVarE2;
        awtq awtqVar;
        long j;
        axez axezVar = null;
        if (this.e != 1) {
            axev axevVar = this.d;
            do {
                awtqVar = axevVar.h;
                j = awtqVar.b;
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    axfd axfdVar = this.a;
                    while (true) {
                        awtr awtrVar = (awtr) axfdVar.b;
                        axez axezVar2 = (axez) awtrVar.a;
                        if (axezVar2 == null || !axezVar2.h) {
                            int i = ((awtp) axfdVar.d).b;
                            int i2 = ((awtp) axfdVar.c).b;
                            while (i != i2 && ((awtp) axfdVar.e).b != 0) {
                                i2--;
                                axez axezVarD = axfdVar.d(i2, true);
                                if (axezVarD != null) {
                                    axezVar = axezVarD;
                                    break;
                                }
                            }
                            break;
                        }
                        if (awtrVar.d(axezVar2, null)) {
                            axezVar = axezVar2;
                            break;
                        }
                    }
                    if (axezVar != null) {
                        return axezVar;
                    }
                    axez axezVar3 = (axez) axevVar.j.p();
                    return axezVar3 == null ? f(1) : axezVar3;
                }
            } while (!awtqVar.c(j, (-4398046511104L) + j));
            this.e = 1;
        }
        if (z) {
            boolean z2 = a(this.d.b << 1) == 0;
            if (z2 && (axezVarE2 = e()) != null) {
                return axezVarE2;
            }
            axfd axfdVar2 = this.a;
            axez axezVar4 = (axez) ((awtr) axfdVar2.b).a(null);
            axez axezVarC = axezVar4 == null ? axfdVar2.c() : axezVar4;
            if (axezVarC != null) {
                return axezVarC;
            }
            if (!z2 && (axezVarE = e()) != null) {
                return axezVarE;
            }
        } else {
            axez axezVarE3 = e();
            if (axezVarE3 != null) {
                return axezVarE3;
            }
        }
        return f(3);
    }

    public final void c(int i) {
        String strValueOf = i == 0 ? "TERMINATED" : String.valueOf(i);
        setName(this.d.e + "-worker-" + strValueOf);
        this.indexInArray = i;
    }

    public final boolean d(int i) {
        int i2 = this.e;
        boolean z = i2 == 1;
        if (z) {
            this.d.h.a(4398046511104L);
        }
        if (i2 != i) {
            this.e = i;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00fd A[DONT_GENERATE] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                axev axevVar = this.d;
                if (axevVar.d() || this.e == 5) {
                    break loop0;
                }
                axez axezVarB = b(this.c);
                if (axezVarB != null) {
                    this.h = 0L;
                    this.g = 0L;
                    if (this.e == 3) {
                        boolean z2 = awuv.a;
                        this.e = 2;
                    }
                    if (!axezVarB.h) {
                        axev.e(axezVarB);
                        break;
                    }
                    if (d(2)) {
                        axevVar.c();
                    }
                    axev.e(axezVarB);
                    axevVar.h.a(-2097152L);
                    if (this.e == 5) {
                        break;
                    }
                    boolean z3 = awuv.a;
                    this.e = 4;
                    break;
                }
                this.c = false;
                if (this.h == 0) {
                    long j2 = 2097151;
                    if (g()) {
                        awtp awtpVar = this.b;
                        awtpVar.b = -1;
                        while (g() && awtpVar.b == -1 && !axevVar.d() && this.e != 5) {
                            d(3);
                            Thread.interrupted();
                            if (this.g == 0) {
                                this.g = System.nanoTime() + axevVar.d;
                            }
                            LockSupport.parkNanos(axevVar.d);
                            long j3 = j2;
                            if (System.nanoTime() - this.g >= 0) {
                                this.g = 0L;
                                axdu axduVar = axevVar.g;
                                synchronized (axduVar) {
                                    if (!axevVar.d()) {
                                        awtq awtqVar = axevVar.h;
                                        if (((int) (awtqVar.b & j3)) > axevVar.b && awtpVar.c(-1, 1)) {
                                            int i = this.indexInArray;
                                            c(0);
                                            axevVar.b(this, i, 0);
                                            int andDecrement = (int) (awtq.a.getAndDecrement(awtqVar) & j3);
                                            if (andDecrement != i) {
                                                Object objA = axduVar.a(andDecrement);
                                                objA.getClass();
                                                axeu axeuVar = (axeu) objA;
                                                axduVar.b(i, axeuVar);
                                                axeuVar.c(i);
                                                axevVar.b(axeuVar, andDecrement, i);
                                            }
                                            axduVar.b(andDecrement, null);
                                            this.e = 5;
                                        }
                                    }
                                }
                            }
                            j2 = j3;
                        }
                    } else if (this.nextParkedWorker == axev.a) {
                        awtq awtqVar2 = axevVar.f;
                        while (true) {
                            long j4 = awtqVar2.b;
                            int i2 = this.indexInArray;
                            boolean z4 = awuv.a;
                            long j5 = j;
                            this.nextParkedWorker = axevVar.g.a((int) (j4 & 2097151));
                            j = awtqVar2.c(j4, ((2097152 + j4) & j5) | ((long) i2)) ? -2097152L : j5;
                        }
                    }
                } else {
                    if (z) {
                        d(3);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.h);
                        this.h = 0L;
                        break;
                    }
                    z = true;
                }
            }
        }
        d(5);
    }
}
