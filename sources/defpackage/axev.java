package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axev implements Executor, Closeable {
    public static final axdy a = new axdy("NOT_IN_STACK");
    public final int b;
    public final int c;
    public final long d;
    public final String e;
    public final awtq f;
    public final axdu g;
    public final awtq h;
    public final ahud i;
    public final ahud j;
    private final awto k;

    public axev(int i, int i2, long j, String str) {
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = str;
        if (i <= 0) {
            throw new IllegalArgumentException(a.bP(i, "Core pool size ", " should be at least 1"));
        }
        if (i2 < i) {
            throw new IllegalArgumentException(a.bQ(i, i2, "Max pool size ", " should be greater than or equals to core pool size "));
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(a.bP(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
        }
        if (j <= 0) {
            throw new IllegalArgumentException(a.cf(j, "Idle worker keep alive time ", " must be positive"));
        }
        this.i = new ahud((byte[]) null, (byte[]) null);
        this.j = new ahud((byte[]) null, (byte[]) null);
        awts awtsVar = awts.a;
        this.f = new awtq(0L, awtsVar);
        this.g = new axdu((i + 1) << 1);
        this.h = new awtq(((long) i) << 42, awtsVar);
        this.k = new awto(false, awtsVar);
    }

    public static final void e(axez axezVar) {
        try {
            axezVar.run();
        } catch (Throwable th) {
            Thread threadCurrentThread = Thread.currentThread();
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final int g() {
        axdu axduVar = this.g;
        synchronized (axduVar) {
            if (d()) {
                return -1;
            }
            awtq awtqVar = this.h;
            long j = awtqVar.b;
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.b || i >= this.c) {
                return 0;
            }
            int i3 = ((int) (awtqVar.b & 2097151)) + 1;
            if (axduVar.a(i3) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            axeu axeuVar = new axeu(this, i3);
            axduVar.b(i3, axeuVar);
            if (i3 != ((int) (awtq.a.incrementAndGet(awtqVar) & 2097151))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int i4 = i2 + 1;
            axeuVar.start();
            return i4;
        }
    }

    private final axeu h() {
        Thread threadCurrentThread = Thread.currentThread();
        axeu axeuVar = threadCurrentThread instanceof axeu ? (axeu) threadCurrentThread : null;
        if (axeuVar == null || !awrc.c(axeuVar.d, this)) {
            return null;
        }
        return axeuVar;
    }

    private final boolean i(long j) {
        int i = ((int) (j & 2097151)) - ((int) ((4398044413952L & j) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.b;
        if (i >= i2) {
            return false;
        }
        int iG = g();
        if (iG == 1) {
            if (i2 > 1) {
                g();
            }
        } else if (iG <= 0) {
            return false;
        }
        return true;
    }

    private final boolean j() {
        axeu axeuVar;
        do {
            awtq awtqVar = this.f;
            while (true) {
                long j = awtqVar.b;
                axeuVar = (axeu) this.g.a((int) (2097151 & j));
                if (axeuVar != null) {
                    long j2 = 2097152 + j;
                    int iK = k(axeuVar);
                    if (iK >= 0 && awtqVar.c(j, (j2 & (-2097152)) | ((long) iK))) {
                        axeuVar.nextParkedWorker = a;
                        break;
                    }
                } else {
                    axeuVar = null;
                    break;
                }
            }
            if (axeuVar == null) {
                return false;
            }
        } while (!axeuVar.b.c(-1, 0));
        LockSupport.unpark(axeuVar);
        return true;
    }

    private static final int k(axeu axeuVar) {
        int i;
        do {
            Object obj = axeuVar.nextParkedWorker;
            if (obj == a) {
                return -1;
            }
            if (obj == null) {
                return 0;
            }
            axeuVar = (axeu) obj;
            i = axeuVar.indexInArray;
        } while (i == 0);
        return i;
    }

    public final void a(Runnable runnable, boolean z, boolean z2) {
        axez axfaVar;
        int i;
        String str = axfb.a;
        long jNanoTime = System.nanoTime();
        if (runnable instanceof axez) {
            axfaVar = (axez) runnable;
            axfaVar.g = jNanoTime;
            axfaVar.h = z;
        } else {
            axfaVar = new axfa(runnable, jNanoTime, z);
        }
        boolean z3 = axfaVar.h;
        long jA = z3 ? this.h.a(2097152L) : 0L;
        axeu axeuVarH = h();
        if (axeuVarH != null && (i = axeuVarH.e) != 5 && (axfaVar.h || i != 2)) {
            axeuVarH.c = true;
            axfd axfdVar = axeuVarH.a;
            if (z2) {
                axfaVar = axfdVar.b(axfaVar);
            } else {
                axez axezVar = (axez) ((awtr) axfdVar.b).a(axfaVar);
                axfaVar = axezVar == null ? null : axfdVar.b(axezVar);
            }
        }
        if (axfaVar != null) {
            if (!(axfaVar.h ? this.j.r(axfaVar) : this.i.r(axfaVar))) {
                throw new RejectedExecutionException(String.valueOf(this.e).concat(" was terminated"));
            }
        }
        if (!z3) {
            c();
        } else {
            if (j() || i(jA)) {
                return;
            }
            j();
        }
    }

    public final void b(axeu axeuVar, int i, int i2) {
        while (true) {
            awtq awtqVar = this.f;
            long j = awtqVar.b;
            long j2 = 2097152 + j;
            int iK = (int) (2097151 & j);
            if (iK == i) {
                iK = i2 == 0 ? k(axeuVar) : i2;
            }
            if (iK >= 0 && awtqVar.c(j, (j2 & (-2097152)) | ((long) iK))) {
                return;
            }
        }
    }

    public final void c() {
        if (j() || i(this.h.b)) {
            return;
        }
        j();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f();
    }

    public final boolean d() {
        return this.k.a();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a(runnable, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    public final void f() {
        long j;
        axez axezVarB;
        if (this.k.b()) {
            axeu axeuVarH = h();
            synchronized (this.g) {
                j = this.h.b & 2097151;
            }
            int i = (int) j;
            if (i > 0) {
                int i2 = 1;
                while (true) {
                    Object objA = this.g.a(i2);
                    objA.getClass();
                    axeu axeuVar = (axeu) objA;
                    if (axeuVar != axeuVarH) {
                        while (axeuVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(axeuVar);
                            axeuVar.join(10000L);
                        }
                        boolean z = awuv.a;
                        axfd axfdVar = axeuVar.a;
                        ahud ahudVar = this.j;
                        axez axezVar = (axez) ((awtr) axfdVar.b).a(null);
                        if (axezVar != null) {
                            ahudVar.r(axezVar);
                        }
                        while (true) {
                            axez axezVarC = axfdVar.c();
                            if (axezVarC == null) {
                                break;
                            } else {
                                ahudVar.r(axezVarC);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            ahud ahudVar2 = this.j;
            ahudVar2.q();
            ahud ahudVar3 = this.i;
            ahudVar3.q();
            while (true) {
                if (axeuVarH == null) {
                    axezVarB = (axez) ahudVar3.p();
                    if (axezVarB == null && (axezVarB = (axez) ahudVar2.p()) == null) {
                        break;
                    }
                } else {
                    axezVarB = axeuVarH.b(true);
                    if (axezVarB == null) {
                        axezVarB = (axez) ahudVar3.p();
                        if (axezVarB == null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                e(axezVarB);
            }
            if (axeuVarH != null) {
                axeuVarH.d(5);
            }
            boolean z2 = awuv.a;
            this.f.b = 0L;
            this.h.b = 0L;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        axdu axduVar = this.g;
        int length = axduVar.array.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            axeu axeuVar = (axeu) axduVar.a(i6);
            if (axeuVar != null) {
                axfd axfdVar = axeuVar.a;
                Object obj = ((awtr) axfdVar.b).a;
                int iA = axfdVar.a();
                if (obj != null) {
                    iA++;
                }
                int i7 = axeuVar.e;
                int i8 = i7 - 1;
                if (i7 == 0) {
                    throw null;
                }
                if (i8 == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(iA);
                    sb.append('c');
                    arrayList.add(sb.toString());
                    i++;
                } else if (i8 == 1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iA);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                    i2++;
                } else if (i8 == 2) {
                    i3++;
                } else if (i8 == 3) {
                    i4++;
                    if (iA > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iA);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i8 != 4) {
                        throw new awmj();
                    }
                    i5++;
                }
            }
        }
        awtq awtqVar = this.h;
        String str = this.e;
        long j = awtqVar.b;
        String strB = awuw.b(this);
        int i9 = this.b;
        int i10 = this.c;
        ahud ahudVar = this.i;
        ahud ahudVar2 = this.j;
        long j2 = 2097151 & j;
        long j3 = j & 4398044413952L;
        long j4 = j & 9223367638808264704L;
        return str + '@' + strB + "[Pool Size {core = " + i9 + ", max = " + i10 + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + ahudVar.o() + ", global blocking queue size = " + ahudVar2.o() + ", Control State {created workers= " + ((int) j2) + ", blocking tasks = " + ((int) (j3 >> 21)) + ", CPUs acquired = " + (i9 - ((int) (j4 >> 42))) + "}]";
    }
}
