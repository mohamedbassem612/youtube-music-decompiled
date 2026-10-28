package defpackage;

import android.os.Process;
import android.view.View;
import com.facebook.litho.ComponentTree;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fhp {
    public final fhd a;
    public final fgy b;
    public final int c;
    public final int d;
    public final boolean e;
    public final fly f;
    public final boolean h;
    public final int i;
    public volatile boolean j;
    public final int k;
    public final String l;
    final /* synthetic */ ComponentTree n;
    private final RunnableFuture p;
    private volatile Object q;
    private volatile Object r;
    private final AtomicInteger o = new AtomicInteger(-1);
    public final AtomicInteger g = new AtomicInteger(0);
    public volatile boolean m = false;

    public fhp(ComponentTree componentTree, fhd fhdVar, fgy fgyVar, int i, int i2, int i3, boolean z, fly flyVar, int i4, String str) {
        this.n = componentTree;
        this.a = fhdVar;
        this.b = fgyVar;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = flyVar;
        this.h = ComponentTree.y(i4);
        this.k = i4;
        this.l = str;
        this.i = i3;
        FutureTask futureTask = new FutureTask(new fho(this));
        fvy fvyVar = gzj.d;
        this.p = futureTask;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x024a A[Catch: all -> 0x0261, TRY_ENTER, TryCatch #1 {all -> 0x0261, blocks: (B:45:0x0082, B:47:0x008e, B:165:0x024a, B:166:0x024c, B:168:0x0254, B:169:0x0256, B:170:0x0257, B:171:0x0260), top: B:180:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x0254 A[Catch: all -> 0x0261, TryCatch #1 {all -> 0x0261, blocks: (B:45:0x0082, B:47:0x008e, B:165:0x024a, B:166:0x024c, B:168:0x0254, B:169:0x0256, B:170:0x0257, B:171:0x0260), top: B:180:0x0080 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x0257 A[Catch: all -> 0x0261, TryCatch #1 {all -> 0x0261, blocks: (B:45:0x0082, B:47:0x008e, B:165:0x024a, B:166:0x024c, B:168:0x0254, B:169:0x0256, B:170:0x0257, B:171:0x0260), top: B:180:0x0080 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public final fjc a(int i) {
        int threadPriority;
        boolean z;
        Throwable cause;
        fkn fknVarBN;
        fkn fknVar;
        Object obj;
        fkn fknVarBN2;
        fji fjiVarBi;
        Object obj2;
        AtomicInteger atomicInteger = this.o;
        if (atomicInteger.compareAndSet(-1, Process.myTid())) {
            this.p.run();
        }
        int i2 = atomicInteger.get();
        boolean z2 = false;
        boolean z3 = i2 != Process.myTid();
        boolean z4 = !this.p.isDone() && z3;
        fkn fknVar2 = null;
        if (z4 && !gzj.aT() && !ComponentTree.y(i)) {
            return null;
        }
        if (gzj.aT() && z4) {
            if (this.n.D && !this.h) {
                this.j = true;
                fmb fmbVar = fhz.h;
                this.q = null;
            }
            try {
                threadPriority = Process.getThreadPriority(i2);
                int i3 = -4;
                boolean z5 = false;
                while (!z5 && i3 < threadPriority) {
                    try {
                        Process.setThreadPriority(i2, i3);
                        z5 = true;
                    } catch (SecurityException unused) {
                        i3++;
                    }
                }
                z = true;
            } catch (RuntimeException unused2) {
                threadPriority = 0;
                z = false;
            }
        } else {
            threadPriority = 0;
            z = false;
        }
        ComponentTree componentTree = this.n;
        omj omjVarW = componentTree.I;
        if (omjVarW == null) {
            omjVarW = componentTree.i.w();
        }
        if (z3 && fna.w) {
            z2 = true;
        }
        try {
            if (z2) {
                try {
                    boolean z6 = fna.a;
                    fgy fgyVar = this.b;
                    fgyVar.c();
                    fgyVar.c();
                } catch (CancellationException e) {
                    e = e;
                    if (z2) {
                        boolean z7 = fna.a;
                    }
                    cause = e.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    }
                    throw new RuntimeException(e.getMessage(), e);
                } catch (ExecutionException e2) {
                    e = e2;
                    if (z2) {
                        boolean z8 = fna.a;
                    }
                    cause = e.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    }
                    throw new RuntimeException(e.getMessage(), e);
                }
            }
            if (omjVarW != null) {
                fhd fhdVar = componentTree.i;
                fknVarBN = gzj.bN(omjVarW, fhdVar.n(), omjVarW.p(fhdVar, 21), fhdVar.e);
            } else {
                fknVarBN = null;
            }
            try {
                fjc fjcVar = (fjc) a.i(this.p);
                if (z2) {
                    boolean z9 = fna.a;
                }
                if (fknVarBN != null) {
                    fknVarBN.c("FUTURE_TASK_END");
                }
                if (z) {
                    try {
                        Process.setThreadPriority(i2, threadPriority);
                    } catch (IllegalArgumentException | SecurityException unused3) {
                    }
                }
                if (!this.j || !fjcVar.G) {
                    fknVar = null;
                    obj = fjcVar;
                } else if (gzj.aT()) {
                    Object obj3 = this.r;
                    fmb fmbVar2 = fhz.h;
                    this.r = null;
                    try {
                        if (this.m) {
                            obj2 = null;
                            fknVar2 = null;
                        } else {
                            int i4 = this.k;
                            fhd fhdVar2 = fjcVar.b;
                            if (!fjcVar.G) {
                                throw new IllegalStateException("Can not resume a finished LayoutState calculation");
                            }
                            fgy fgyVar2 = fjcVar.c;
                            int i5 = fjcVar.x;
                            int i6 = fjcVar.d;
                            int i7 = fjcVar.e;
                            omj omjVarW2 = fhdVar2.w();
                            if (fna.w) {
                                fgyVar2.c();
                                int i8 = fgyVar2.j;
                                View.MeasureSpec.toString(i6);
                                View.MeasureSpec.toString(i7);
                            }
                            if (omjVarW2 != null) {
                                fknVarBN2 = gzj.bN(omjVarW2, fhdVar2.n(), omjVarW2.p(fhdVar2, 19), fhdVar2.e);
                            } else {
                                fknVarBN2 = null;
                            }
                            if (fknVarBN2 != null) {
                                fknVarBN2.b("component", fgyVar2.c());
                                fknVarBN2.b("calculate_layout_state_source", fjc.i(i4));
                            }
                            fjd fjdVarD = fjcVar.d();
                            List list = fjdVarD.g;
                            list.add(Thread.currentThread().getName());
                            fjq fjqVar = fjcVar.o;
                            if (fjqVar == null) {
                                throw null;
                            }
                            fib fibVar = fjcVar.O;
                            if (fjdVarD.d()) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("LayoutStateContext was created on: ");
                                sb.append(fjdVarD.e);
                                sb.append("\nLayoutStateContext was released on: [");
                                Iterator it = fjdVarD.f.iterator();
                                while (it.hasNext()) {
                                    sb.append((String) it.next());
                                    sb.append(" ,");
                                }
                                sb.append("]LayoutStateContext was resumed on: [");
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    sb.append((String) it2.next());
                                    sb.append(" ,");
                                }
                                sb.append(']');
                                gzj.bs(2, sb.toString(), fpr.a(fhdVar2));
                            }
                            if (fjdVarD.d()) {
                                fjiVarBi = null;
                            } else {
                                if (fna.w) {
                                    fjqVar.d().c();
                                }
                                gzj.bf(fjdVarD, fjqVar);
                                if (fknVarBN2 != null) {
                                    fknVarBN2.c("start_measure");
                                }
                                fjiVarBi = gzj.bi(fjdVarD, fjqVar, i6, i7);
                                if (fknVarBN2 != null) {
                                    fknVarBN2.c("end_measure");
                                }
                            }
                            if (fjiVarBi != null) {
                                fjcVar.p = fjiVarBi;
                                fjcVar.n = fjiVarBi.l();
                            }
                            fjc.k(fhdVar2, fjcVar);
                            fjcVar.d().b();
                            if (fknVarBN2 != null) {
                                if (omjVarW2 == null) {
                                    throw fknVar2;
                                }
                                omj.r(fknVarBN2);
                            }
                            synchronized (this) {
                                obj2 = fjcVar;
                                if (true == this.m) {
                                    obj2 = fknVar2;
                                }
                            }
                        }
                        fmb fmbVar3 = fhz.h;
                        fknVar = fknVar2;
                        obj = obj2;
                    } catch (Throwable th) {
                        try {
                            fmb fmbVar4 = fhz.h;
                            throw th;
                        } catch (Throwable th2) {
                            fmb fmbVar5 = fhz.h;
                            throw th2;
                        }
                    }
                } else {
                    Object obj4 = this.q;
                    fmb fmbVar6 = fhz.h;
                    fknVar = null;
                    this.r = null;
                    this.q = null;
                    obj = null;
                }
                if (z2) {
                    boolean z10 = fna.a;
                }
                if (fknVarBN != null) {
                    gzj.aT();
                    omj.r(fknVarBN);
                }
                if (obj != null) {
                    synchronized (this) {
                        if (!this.m) {
                            return obj;
                        }
                    }
                }
                return fknVar;
            } catch (CancellationException e3) {
                e = e3;
                if (z2) {
                    boolean z11 = fna.a;
                }
                cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(e.getMessage(), e);
            } catch (ExecutionException e4) {
                e = e4;
                if (z2) {
                    boolean z12 = fna.a;
                }
                cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(e.getMessage(), e);
            } catch (Throwable th3) {
                th = th3;
                fknVar2 = fknVarBN;
                if (z2) {
                    boolean z13 = fna.a;
                }
                if (fknVar2 != null) {
                    gzj.aT();
                    omj.r(fknVar2);
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final synchronized void b() {
        if (!this.m) {
            this.r = null;
            this.q = null;
            this.m = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fhp fhpVar = (fhp) obj;
            if (this.c == fhpVar.c && this.d == fhpVar.d && this.a.equals(fhpVar.a)) {
                if (this.b.j == fhpVar.b.j) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.j) * 31) + this.c) * 31) + this.d;
    }
}
