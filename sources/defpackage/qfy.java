package defpackage;

import android.app.Activity;
import android.os.SystemClock;
import app.rive.semantics.SemanticState;
import com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qfy extends qfv implements qfh, qed, qdy {
    public volatile qci a;
    public final aunn b;
    public final awmd d;
    public final awmd e;
    public final qiu f;
    public final aerj g;
    public final kjc h;
    private final Executor j;
    private final qfg k;
    private final agev l;
    private final qeb m;
    private final awmd r;
    private final awmd s;
    private final awmd t;
    private final kjc u;
    private final kjc v;
    private final AtomicBoolean i = new AtomicBoolean();
    private final AtomicInteger n = new AtomicInteger();
    private final AtomicInteger o = new AtomicInteger();
    private final AtomicInteger p = new AtomicInteger();
    private final AtomicBoolean q = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public qfy(axfd axfdVar, Executor executor, aunn aunnVar, agev agevVar, kjc kjcVar, qeb qebVar, kjc kjcVar2, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, aerj aerjVar, qiu qiuVar, awmd awmdVar4, awmd awmdVar5, kjc kjcVar3) {
        this.b = aunnVar;
        this.l = agevVar;
        this.v = kjcVar;
        this.m = qebVar;
        this.u = kjcVar2;
        this.k = axfdVar.V(MoreExecutors.directExecutor(), aunnVar, null);
        this.j = executor;
        this.r = awmdVar;
        this.d = awmdVar2;
        this.e = awmdVar3;
        this.g = aerjVar;
        this.f = qiuVar;
        this.s = awmdVar4;
        this.t = awmdVar5;
        this.h = kjcVar3;
    }

    private final void q(final int i, final AtomicInteger atomicInteger) {
        atomicInteger.getAndIncrement();
        this.j.execute(new ahfo(new ahcx() { // from class: qfw
            @Override // defpackage.ahcx
            public final ListenableFuture a() {
                if (atomicInteger.getAndDecrement() <= 0) {
                    return aher.a;
                }
                int i2 = i;
                qfy qfyVar = this.a;
                return qfyVar.o(i2, (qfq) qfyVar.b.io());
            }
        }));
    }

    @Override // defpackage.qed
    public final void c(Activity activity) {
        this.j.execute(new ahfo(new ojf(this, 7)));
    }

    @Override // defpackage.qed
    public final void d(Activity activity) {
        this.a = new qci(activity.getClass().getSimpleName());
    }

    @Override // defpackage.qdy
    public final void g(qci qciVar) {
        this.a = null;
    }

    @Override // defpackage.qed
    public final void h() {
        if (this.q.getAndSet(true)) {
            return;
        }
        q(4, this.o);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [awmd, java.lang.Object] */
    @Override // defpackage.qfh
    public final void k() {
        ((NativeCrashHandlerImpl) ((agfa) this.l).a.io()).a(this);
        this.v.E(this);
        this.m.a(this);
        q(3, this.n);
        this.j.execute(new ahfo(new ojf(this, 6)));
    }

    @Override // defpackage.qfv
    public final void l() {
        if (this.i.compareAndSet(false, true)) {
            Thread.setDefaultUncaughtExceptionHandler(new qfx(this, Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0154  */
    /* JADX WARN: Code duplicated, block: B:49:0x016a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0180  */
    /* JADX WARN: Code duplicated, block: B:53:0x01bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x01c4 A[PHI: r8 r17
      0x01c4: PHI (r8v2 axhq) = (r8v1 axhq), (r8v20 axhq), (r8v20 axhq) binds: [B:55:0x01c0, B:52:0x01b9, B:53:0x01bb] A[DONT_GENERATE, DONT_INLINE]
      0x01c4: PHI (r17v1 boolean) = (r17v0 boolean), (r17v13 boolean), (r17v13 boolean) binds: [B:55:0x01c0, B:52:0x01b9, B:53:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x01ce A[Catch: InterruptedException -> 0x023e, all -> 0x0245, TryCatch #8 {InterruptedException -> 0x023e, all -> 0x0245, blocks: (B:57:0x01c6, B:59:0x01ce, B:61:0x01df, B:60:0x01d7), top: B:92:0x01c6 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x01d7 A[Catch: InterruptedException -> 0x023e, all -> 0x0245, TryCatch #8 {InterruptedException -> 0x023e, all -> 0x0245, blocks: (B:57:0x01c6, B:59:0x01ce, B:61:0x01df, B:60:0x01d7), top: B:92:0x01c6 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x024d A[LOOP:0: B:64:0x0245->B:66:0x024d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x0257  */
    /* JADX WARN: Code duplicated, block: B:76:0x027e A[LOOP:2: B:74:0x0276->B:76:0x027e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x0284  */
    /* JADX WARN: Code duplicated, block: B:80:0x0287 A[LOOP:1: B:72:0x026e->B:80:0x0287, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v32, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [awmd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v5, types: [agfr, java.lang.Object] */
    public final void m(axhq axhqVar, qgi qgiVar) {
        boolean z;
        axhq axhqVar2;
        boolean z2;
        boolean zG;
        awmd awmdVar;
        int i;
        axhn axhnVar;
        IOException iOException;
        int iAX;
        qfq qfqVar = (qfq) this.b.io();
        if (qfqVar.b()) {
            qdo qdoVar = qdo.a;
            boolean z3 = true;
            try {
                if (n()) {
                    aerj aerjVar = this.g;
                    if (((AtomicBoolean) aerjVar.b).getAndSet(false)) {
                        Object obj = aerjVar.d;
                        aihf aihfVarCreateBuilder = axhn.a.createBuilder();
                        sdy sdyVar = (sdy) obj;
                        qfs qfsVar = (qfs) sdyVar.b.io();
                        if (SystemClock.uptimeMillis() - sdyVar.a <= qfsVar.e) {
                            ?? r12 = sdyVar.c;
                            ?? r0 = sdyVar.d;
                            agev agevVar = (agev) r12.io();
                            boolean zG2 = agevVar.g();
                            Object objIo = r0.io();
                            if (zG2) {
                                agev agevVar2 = (agev) objIo;
                                if (agevVar2.g()) {
                                    qfr qfrVar = new qfr((File) agevVar.c(), (String) agevVar2.c());
                                    int iA = qfrVar.a();
                                    aihfVarCreateBuilder.copyOnWrite();
                                    axhn axhnVar2 = (axhn) aihfVarCreateBuilder.instance;
                                    axhnVar2.b |= 2;
                                    axhnVar2.d = iA;
                                    int i2 = iA + 1;
                                    if (i2 >= qfsVar.d) {
                                        aihfVarCreateBuilder.copyOnWrite();
                                        axhn axhnVar3 = (axhn) aihfVarCreateBuilder.instance;
                                        axhnVar3.c = 5;
                                        axhnVar3.b |= 1;
                                        axhnVar = (axhn) aihfVarCreateBuilder.build();
                                    } else {
                                        if (!qfrVar.c()) {
                                            z = z3;
                                            break;
                                        }
                                        qfrVar.b++;
                                        aihf aihfVarCreateBuilder2 = qfu.a.createBuilder();
                                        int i3 = qfrVar.b;
                                        aihfVarCreateBuilder2.copyOnWrite();
                                        qfu qfuVar = (qfu) aihfVarCreateBuilder2.instance;
                                        qfuVar.b |= 1;
                                        qfuVar.c = i3;
                                        qfu qfuVar2 = (qfu) aihfVarCreateBuilder2.build();
                                        boolean z4 = false;
                                        while (true) {
                                            try {
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(qfrVar.b());
                                                    try {
                                                        qfuVar2.writeTo(fileOutputStream);
                                                        try {
                                                            fileOutputStream.close();
                                                            z = z3;
                                                            break;
                                                        } catch (IOException e) {
                                                            iOException = e;
                                                            z = z3;
                                                            ((agrc) ((agrc) ((agrc) qcq.a.c()).j(iOException)).k("com/google/android/libraries/performance/primes/metrics/crash/CrashCounter", "increment", 'D', "CrashCounter.java")).t("failed to write counter to disk.");
                                                        }
                                                    } catch (Throwable th) {
                                                        z = z3;
                                                        try {
                                                            try {
                                                                fileOutputStream.close();
                                                            } catch (Throwable th2) {
                                                                th.addSuppressed(th2);
                                                            }
                                                            throw th;
                                                        } catch (FileNotFoundException unused) {
                                                            if (z4) {
                                                                if (i2 >= qfsVar.c) {
                                                                    aihfVarCreateBuilder.copyOnWrite();
                                                                    axhn axhnVar4 = (axhn) aihfVarCreateBuilder.instance;
                                                                    axhnVar4.c = 4;
                                                                    axhnVar4.b |= 1;
                                                                    axhnVar = (axhn) aihfVarCreateBuilder.build();
                                                                } else {
                                                                    aihfVarCreateBuilder.copyOnWrite();
                                                                    axhn axhnVar5 = (axhn) aihfVarCreateBuilder.instance;
                                                                    axhnVar5.c = 3;
                                                                    axhnVar5.b |= 1;
                                                                    axhnVar = (axhn) aihfVarCreateBuilder.build();
                                                                }
                                                                aihf builder = axhqVar.toBuilder();
                                                                builder.copyOnWrite();
                                                                axhq axhqVar3 = (axhq) builder.instance;
                                                                axhnVar.getClass();
                                                                axhqVar3.l = axhnVar;
                                                                axhqVar3.b |= SemanticState.Modal;
                                                                axhqVar2 = (axhq) builder.build();
                                                                iAX = a.aX(axhnVar.c);
                                                                if (iAX == 0) {
                                                                    z2 = false;
                                                                } else {
                                                                    z2 = false;
                                                                }
                                                                zG = qpj.g();
                                                                awmdVar = this.r;
                                                                if (zG) {
                                                                    i = ((qfz) awmdVar.io()).b;
                                                                } else {
                                                                    i = ((qfz) awmdVar.io()).c;
                                                                }
                                                                long j = i;
                                                                qfg qfgVar = this.k;
                                                                qfc qfcVarA = qfd.a();
                                                                aihf aihfVarCreateBuilder3 = axhz.a.createBuilder();
                                                                aihfVarCreateBuilder3.copyOnWrite();
                                                                axhz axhzVar = (axhz) aihfVarCreateBuilder3.instance;
                                                                axhqVar2.getClass();
                                                                axhzVar.h = axhqVar2;
                                                                axhzVar.b |= 64;
                                                                qfcVarA.g((axhz) aihfVarCreateBuilder3.build());
                                                                qfcVarA.g = qdoVar;
                                                                qfcVarA.c(qfqVar.b);
                                                                qfcVarA.i(((Boolean) this.s.io()).booleanValue());
                                                                qfcVarA.f(((Long) this.t.io()).intValue());
                                                                qfcVarA.e = qgiVar;
                                                                qfgVar.a(qfcVarA.a()).get(j, TimeUnit.MILLISECONDS);
                                                                while (this.n.getAndDecrement() > 0) {
                                                                    o(3, qfqVar);
                                                                }
                                                                if (n()) {
                                                                    p(6, qfqVar, ((qfs) this.e.io()).f);
                                                                }
                                                                while (this.o.getAndDecrement() > 0) {
                                                                    o(4, qfqVar);
                                                                }
                                                                while (this.p.getAndDecrement() > 0) {
                                                                    o(5, qfqVar);
                                                                }
                                                                if (z2) {
                                                                    agev agevVar3 = qfqVar.c;
                                                                }
                                                            }
                                                            qfrVar.a.mkdirs();
                                                            z3 = z;
                                                            z4 = z3;
                                                        } catch (IOException e2) {
                                                            e = e2;
                                                            iOException = e;
                                                            ((agrc) ((agrc) ((agrc) qcq.a.c()).j(iOException)).k("com/google/android/libraries/performance/primes/metrics/crash/CrashCounter", "increment", 'D', "CrashCounter.java")).t("failed to write counter to disk.");
                                                            if (i2 >= qfsVar.c) {
                                                                aihfVarCreateBuilder.copyOnWrite();
                                                                axhn axhnVar6 = (axhn) aihfVarCreateBuilder.instance;
                                                                axhnVar6.c = 4;
                                                                axhnVar6.b |= 1;
                                                                axhnVar = (axhn) aihfVarCreateBuilder.build();
                                                            } else {
                                                                aihfVarCreateBuilder.copyOnWrite();
                                                                axhn axhnVar7 = (axhn) aihfVarCreateBuilder.instance;
                                                                axhnVar7.c = 3;
                                                                axhnVar7.b |= 1;
                                                                axhnVar = (axhn) aihfVarCreateBuilder.build();
                                                            }
                                                            aihf builder2 = axhqVar.toBuilder();
                                                            builder2.copyOnWrite();
                                                            axhq axhqVar4 = (axhq) builder2.instance;
                                                            axhnVar.getClass();
                                                            axhqVar4.l = axhnVar;
                                                            axhqVar4.b |= SemanticState.Modal;
                                                            axhqVar2 = (axhq) builder2.build();
                                                            iAX = a.aX(axhnVar.c);
                                                            if (iAX == 0) {
                                                                z2 = false;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            zG = qpj.g();
                                                            awmdVar = this.r;
                                                            if (zG) {
                                                                i = ((qfz) awmdVar.io()).b;
                                                            } else {
                                                                i = ((qfz) awmdVar.io()).c;
                                                            }
                                                            long j2 = i;
                                                            qfg qfgVar2 = this.k;
                                                            qfc qfcVarA2 = qfd.a();
                                                            aihf aihfVarCreateBuilder4 = axhz.a.createBuilder();
                                                            aihfVarCreateBuilder4.copyOnWrite();
                                                            axhz axhzVar2 = (axhz) aihfVarCreateBuilder4.instance;
                                                            axhqVar2.getClass();
                                                            axhzVar2.h = axhqVar2;
                                                            axhzVar2.b |= 64;
                                                            qfcVarA2.g((axhz) aihfVarCreateBuilder4.build());
                                                            qfcVarA2.g = qdoVar;
                                                            qfcVarA2.c(qfqVar.b);
                                                            qfcVarA2.i(((Boolean) this.s.io()).booleanValue());
                                                            qfcVarA2.f(((Long) this.t.io()).intValue());
                                                            qfcVarA2.e = qgiVar;
                                                            qfgVar2.a(qfcVarA2.a()).get(j2, TimeUnit.MILLISECONDS);
                                                            while (this.n.getAndDecrement() > 0) {
                                                                o(3, qfqVar);
                                                            }
                                                            if (n()) {
                                                                p(6, qfqVar, ((qfs) this.e.io()).f);
                                                            }
                                                            while (this.o.getAndDecrement() > 0) {
                                                                o(4, qfqVar);
                                                            }
                                                            while (this.p.getAndDecrement() > 0) {
                                                                o(5, qfqVar);
                                                            }
                                                            if (z2) {
                                                                agev agevVar4 = qfqVar.c;
                                                            }
                                                        }
                                                    }
                                                } catch (FileNotFoundException unused2) {
                                                    z = z3;
                                                }
                                            } catch (IOException e3) {
                                                e = e3;
                                                z = z3;
                                            }
                                            qfrVar.a.mkdirs();
                                            z3 = z;
                                            z4 = z3;
                                        }
                                        if (i2 >= qfsVar.c) {
                                            aihfVarCreateBuilder.copyOnWrite();
                                            axhn axhnVar8 = (axhn) aihfVarCreateBuilder.instance;
                                            axhnVar8.c = 4;
                                            axhnVar8.b |= 1;
                                            axhnVar = (axhn) aihfVarCreateBuilder.build();
                                        } else {
                                            aihfVarCreateBuilder.copyOnWrite();
                                            axhn axhnVar9 = (axhn) aihfVarCreateBuilder.instance;
                                            axhnVar9.c = 3;
                                            axhnVar9.b |= 1;
                                            axhnVar = (axhn) aihfVarCreateBuilder.build();
                                        }
                                    }
                                } else {
                                    z = true;
                                    aihfVarCreateBuilder.copyOnWrite();
                                    axhn axhnVar10 = (axhn) aihfVarCreateBuilder.instance;
                                    axhnVar10.c = 6;
                                    axhnVar10.b |= 1;
                                    axhnVar = (axhn) aihfVarCreateBuilder.build();
                                }
                            } else {
                                z = true;
                                aihfVarCreateBuilder.copyOnWrite();
                                axhn axhnVar11 = (axhn) aihfVarCreateBuilder.instance;
                                axhnVar11.c = 6;
                                axhnVar11.b |= 1;
                                axhnVar = (axhn) aihfVarCreateBuilder.build();
                            }
                            aihf builder3 = axhqVar.toBuilder();
                            builder3.copyOnWrite();
                            axhq axhqVar5 = (axhq) builder3.instance;
                            axhnVar.getClass();
                            axhqVar5.l = axhnVar;
                            axhqVar5.b |= SemanticState.Modal;
                            axhqVar2 = (axhq) builder3.build();
                            iAX = a.aX(axhnVar.c);
                            if (iAX == 0 && iAX == 5) {
                                z2 = z;
                            }
                            zG = qpj.g();
                            awmdVar = this.r;
                            if (zG) {
                                i = ((qfz) awmdVar.io()).b;
                            } else {
                                i = ((qfz) awmdVar.io()).c;
                            }
                            long j3 = i;
                            qfg qfgVar3 = this.k;
                            qfc qfcVarA3 = qfd.a();
                            aihf aihfVarCreateBuilder5 = axhz.a.createBuilder();
                            aihfVarCreateBuilder5.copyOnWrite();
                            axhz axhzVar3 = (axhz) aihfVarCreateBuilder5.instance;
                            axhqVar2.getClass();
                            axhzVar3.h = axhqVar2;
                            axhzVar3.b |= 64;
                            qfcVarA3.g((axhz) aihfVarCreateBuilder5.build());
                            qfcVarA3.g = qdoVar;
                            qfcVarA3.c(qfqVar.b);
                            qfcVarA3.i(((Boolean) this.s.io()).booleanValue());
                            qfcVarA3.f(((Long) this.t.io()).intValue());
                            qfcVarA3.e = qgiVar;
                            qfgVar3.a(qfcVarA3.a()).get(j3, TimeUnit.MILLISECONDS);
                            while (this.n.getAndDecrement() > 0) {
                                o(3, qfqVar);
                            }
                            if (n() && !this.c.getAndSet(z)) {
                                p(6, qfqVar, ((qfs) this.e.io()).f);
                            }
                            while (this.o.getAndDecrement() > 0) {
                                o(4, qfqVar);
                            }
                            while (this.p.getAndDecrement() > 0) {
                                o(5, qfqVar);
                            }
                            if (z2) {
                                agev agevVar5 = qfqVar.c;
                            }
                        }
                        aihfVarCreateBuilder.copyOnWrite();
                        axhn axhnVar12 = (axhn) aihfVarCreateBuilder.instance;
                        axhnVar12.c = 2;
                        axhnVar12.b |= 1;
                        axhnVar = (axhn) aihfVarCreateBuilder.build();
                    } else {
                        aihf aihfVarCreateBuilder6 = axhn.a.createBuilder();
                        aihfVarCreateBuilder6.copyOnWrite();
                        axhn axhnVar13 = (axhn) aihfVarCreateBuilder6.instance;
                        axhnVar13.c = 1;
                        axhnVar13.b |= 1;
                        axhnVar = (axhn) aihfVarCreateBuilder6.build();
                    }
                    z = true;
                    aihf builder4 = axhqVar.toBuilder();
                    builder4.copyOnWrite();
                    axhq axhqVar6 = (axhq) builder4.instance;
                    axhnVar.getClass();
                    axhqVar6.l = axhnVar;
                    axhqVar6.b |= SemanticState.Modal;
                    axhqVar2 = (axhq) builder4.build();
                    iAX = a.aX(axhnVar.c);
                    if (iAX == 0) {
                    }
                    zG = qpj.g();
                    awmdVar = this.r;
                    if (zG) {
                        i = ((qfz) awmdVar.io()).b;
                    } else {
                        i = ((qfz) awmdVar.io()).c;
                    }
                    long j4 = i;
                    qfg qfgVar4 = this.k;
                    qfc qfcVarA4 = qfd.a();
                    aihf aihfVarCreateBuilder7 = axhz.a.createBuilder();
                    aihfVarCreateBuilder7.copyOnWrite();
                    axhz axhzVar4 = (axhz) aihfVarCreateBuilder7.instance;
                    axhqVar2.getClass();
                    axhzVar4.h = axhqVar2;
                    axhzVar4.b |= 64;
                    qfcVarA4.g((axhz) aihfVarCreateBuilder7.build());
                    qfcVarA4.g = qdoVar;
                    qfcVarA4.c(qfqVar.b);
                    qfcVarA4.i(((Boolean) this.s.io()).booleanValue());
                    qfcVarA4.f(((Long) this.t.io()).intValue());
                    qfcVarA4.e = qgiVar;
                    qfgVar4.a(qfcVarA4.a()).get(j4, TimeUnit.MILLISECONDS);
                    while (this.n.getAndDecrement() > 0) {
                        o(3, qfqVar);
                    }
                    if (n()) {
                        p(6, qfqVar, ((qfs) this.e.io()).f);
                    }
                    while (this.o.getAndDecrement() > 0) {
                        o(4, qfqVar);
                    }
                    while (this.p.getAndDecrement() > 0) {
                        o(5, qfqVar);
                    }
                    if (z2) {
                        agev agevVar6 = qfqVar.c;
                    }
                }
                z = true;
                axhqVar2 = axhqVar;
                zG = qpj.g();
                awmdVar = this.r;
                if (zG) {
                    i = ((qfz) awmdVar.io()).b;
                } else {
                    i = ((qfz) awmdVar.io()).c;
                }
                long j5 = i;
                qfg qfgVar5 = this.k;
                qfc qfcVarA5 = qfd.a();
                aihf aihfVarCreateBuilder8 = axhz.a.createBuilder();
                aihfVarCreateBuilder8.copyOnWrite();
                axhz axhzVar5 = (axhz) aihfVarCreateBuilder8.instance;
                axhqVar2.getClass();
                axhzVar5.h = axhqVar2;
                axhzVar5.b |= 64;
                qfcVarA5.g((axhz) aihfVarCreateBuilder8.build());
                qfcVarA5.g = qdoVar;
                qfcVarA5.c(qfqVar.b);
                qfcVarA5.i(((Boolean) this.s.io()).booleanValue());
                qfcVarA5.f(((Long) this.t.io()).intValue());
                qfcVarA5.e = qgiVar;
                qfgVar5.a(qfcVarA5.a()).get(j5, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused3) {
                Thread.currentThread().interrupt();
            } catch (Throwable unused4) {
            }
            z2 = false;
            while (this.n.getAndDecrement() > 0) {
                o(3, qfqVar);
            }
            if (n()) {
                p(6, qfqVar, ((qfs) this.e.io()).f);
            }
            while (this.o.getAndDecrement() > 0) {
                o(4, qfqVar);
            }
            while (this.p.getAndDecrement() > 0) {
                o(5, qfqVar);
            }
            if (z2) {
                agev agevVar7 = qfqVar.c;
            }
        }
    }

    public final boolean n() {
        return ((qfs) this.e.io()).b;
    }

    public final ListenableFuture o(int i, qfq qfqVar) {
        return p(i, qfqVar, qfqVar.a / 100.0f);
    }

    public final ListenableFuture p(int i, qfq qfqVar, float f) {
        if (!qfqVar.b()) {
            return aher.a;
        }
        qjb qjbVarD = this.u.D(f);
        if (((Random) qjbVarD.b).nextFloat() >= qjbVarD.a) {
            return aher.a;
        }
        qfg qfgVar = this.k;
        qfc qfcVarA = qfd.a();
        aihf aihfVarCreateBuilder = axhz.a.createBuilder();
        aihf aihfVarCreateBuilder2 = axhy.a.createBuilder();
        float f2 = 1.0f / f;
        aihfVarCreateBuilder2.copyOnWrite();
        axhy axhyVar = (axhy) aihfVarCreateBuilder2.instance;
        axhyVar.b |= 2;
        axhyVar.d = (int) f2;
        aihfVarCreateBuilder2.copyOnWrite();
        axhy axhyVar2 = (axhy) aihfVarCreateBuilder2.instance;
        axhyVar2.c = i - 1;
        axhyVar2.b |= 1;
        aihfVarCreateBuilder.copyOnWrite();
        axhz axhzVar = (axhz) aihfVarCreateBuilder.instance;
        axhy axhyVar3 = (axhy) aihfVarCreateBuilder2.build();
        axhyVar3.getClass();
        axhzVar.r = axhyVar3;
        axhzVar.b |= 16777216;
        qfcVarA.g((axhz) aihfVarCreateBuilder.build());
        return qfgVar.a(qfcVarA.a());
    }

    @Override // defpackage.qed
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void a(Activity activity) {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void e(Activity activity) {
    }

    @Override // defpackage.qed
    public final /* synthetic */ void f(int i) {
    }

    @Override // defpackage.qdy
    public final /* synthetic */ void j(qci qciVar) {
    }
}
