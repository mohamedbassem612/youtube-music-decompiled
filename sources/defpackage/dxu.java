package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.os.StrictMode;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import com.google.cardboard.sdk.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dxu {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public dxu(Context context) {
        SidecarInterface sidecarImpl = SidecarProvider.getSidecarImpl(context.getApplicationContext());
        dxq dxqVar = new dxq(null);
        this.a = sidecarImpl;
        this.b = dxqVar;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.window.sidecar.SidecarInterface, java.lang.Object] */
    public final dwy a(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        IBinder iBinderS = azw.s(activity);
        if (iBinderS == null) {
            return new dwy(awno.a);
        }
        ?? r0 = this.a;
        SidecarWindowLayoutInfo windowLayoutInfo = r0 != 0 ? r0.getWindowLayoutInfo(iBinderS) : null;
        Object obj = this.b;
        if (r0 == 0 || (sidecarDeviceState = r0.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return ((dxq) obj).a(windowLayoutInfo, sidecarDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.window.sidecar.SidecarInterface, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Map] */
    public final void b(IBinder iBinder, final Activity activity) {
        ?? r0 = this.c;
        r0.put(iBinder, activity);
        ?? r1 = this.a;
        if (r1 != 0) {
            r1.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (r0.size() == 1 && r1 != 0) {
            r1.onDeviceStateListenersChanged(false);
        }
        Object obj = this.e;
        if (obj != null) {
            ((dxs) obj).a(activity, a(activity));
        }
        ?? r3 = this.d;
        if (r3.get(activity) == null && (activity instanceof avi)) {
            axo axoVar = new axo() { // from class: dxr
                @Override // defpackage.axo
                public final void accept(Object obj2) {
                    dxu dxuVar = this.a;
                    Object obj3 = dxuVar.e;
                    if (obj3 != null) {
                        Activity activity2 = activity;
                        ((dxs) obj3).a(activity2, dxuVar.a(activity2));
                    }
                }
            };
            r3.put(activity, axoVar);
            ((avi) activity).addOnConfigurationChangedListener(axoVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0336 A[Catch: all -> 0x0347, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0347, blocks: (B:107:0x028c, B:109:0x02bc, B:120:0x0317, B:126:0x0336, B:112:0x02c4, B:114:0x02de), top: B:146:0x028c }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0320 A[EDGE_INSN: B:162:0x0320->B:122:0x0320 BREAK  A[LOOP:2: B:144:0x01c1->B:164:0x01c1], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r41v0 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c(ListenableFuture listenableFuture) throws Throwable {
        mcz mczVarA;
        long jAI;
        boolean z;
        boolean z2;
        AtomicReference atomicReference;
        ?? r6;
        mcv mcvVar;
        boolean z3;
        boolean z4;
        int i;
        ?? r7;
        dxu dxuVar = this;
        mda mdaVar = mdc.a;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread == mdc.b) {
            mczVarA = mdc.c;
            if (mczVarA == null) {
                mczVarA = mdaVar.a();
            }
        } else if (threadCurrentThread instanceof mcr) {
            mczVarA = ((mcr) threadCurrentThread).c;
        } else {
            Object obj = mdb.a.get();
            obj.getClass();
            mczVarA = (mcz) obj;
        }
        long j = 8796093022207L;
        int i2 = 2;
        boolean z5 = true;
        ?? r8 = 0;
        if (mczVarA.c) {
            long j2 = mczVarA.f.get();
            jAI = ksy.aI(false, false, false, -21, -21, mcy.f(mcy.d(j2), mcy.a(j2, 2), mcy.a(j2, 1), mcy.a(j2, 0)), j2 & 8796093022207L);
        } else {
            jAI = ksy.aI(false, false, false, -21, -21, Process.getThreadPriority(mczVarA.b), 0L);
        }
        mcv mcvVar2 = new mcv(jAI, mczVarA, listenableFuture);
        while (!listenableFuture.isDone()) {
            if (a.ap((AtomicReference) dxuVar.c, mcvVar2)) {
                boolean z6 = mczVarA.d;
                if (!z6) {
                    mczVarA.d = z5;
                }
                ((mcx) dxuVar.b).a(mczVarA.a);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                boolean zInterrupted = Thread.interrupted();
                while (true) {
                    try {
                        Runnable runnable = (Runnable) dxuVar.a.poll();
                        if (runnable != null) {
                            try {
                                try {
                                    runnable.run();
                                    zInterrupted |= Thread.interrupted();
                                } catch (Throwable th) {
                                    boolean zInterrupted2 = zInterrupted | Thread.interrupted();
                                    throw th;
                                }
                            } catch (Error e) {
                                dxuVar.e = e;
                                dxuVar.d.execute(afwl.i(new lei(e, 19)));
                                zInterrupted |= Thread.interrupted();
                            } catch (RuntimeException e2) {
                                dxuVar.e = e2;
                                dxuVar.d.execute(afwl.i(new lei(e2, 18)));
                                zInterrupted |= Thread.interrupted();
                            }
                        } else if (!listenableFuture.isDone()) {
                            String strBV = a.bV(listenableFuture, "Expected ", " to be done, as no runnables were queued");
                            if (dxuVar.e == null) {
                                throw new mdd(strBV);
                            }
                            throw new ExecutionException(strBV, (Throwable) dxuVar.e);
                        }
                        j = j;
                        if (listenableFuture.isDone()) {
                            ((mcx) dxuVar.b).a(null);
                            ((AtomicReference) dxuVar.c).set(null);
                            mcvVar2.a();
                            if (!z6) {
                                mczVarA.d = r8;
                                if (mczVarA.e) {
                                    mczVarA.e = r8;
                                    mczVarA.b();
                                }
                            }
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                            StrictMode.setThreadPolicy(threadPolicy);
                            r8 = r8;
                            if (!zInterrupted) {
                                break;
                            }
                            mczVarA.a.interrupt();
                            r8 = r8;
                            break;
                        }
                        j = j;
                    } catch (Throwable th2) {
                        ((mcx) dxuVar.b).a(null);
                        ((AtomicReference) dxuVar.c).set(null);
                        mcvVar2.a();
                        if (!z6) {
                            mczVarA.d = r8;
                            if (mczVarA.e) {
                                mczVarA.e = r8;
                                mczVarA.b();
                            }
                        }
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        StrictMode.setThreadPolicy(threadPolicy);
                        if (zInterrupted) {
                            mczVarA.a.interrupt();
                        }
                        throw th2;
                    }
                }
            } else {
                j = j;
                mcv mcvVar3 = (mcv) ((AtomicReference) dxuVar.c).get();
                if (mcvVar3 != null) {
                    mcz mczVar = mcvVar3.a;
                    if (awrc.c(mczVar, mczVarA)) {
                        throw new IllegalStateException("Reentrant call would deadlock!");
                    }
                    mczVarA.getClass();
                    mcu mcuVar = new mcu(mczVarA);
                    r8 = r8;
                    while (true) {
                        AtomicReference atomicReference2 = mcvVar3.c;
                        ksy ksyVar = (ksy) atomicReference2.get();
                        mct mctVar = mct.b;
                        if (ksyVar != mctVar) {
                            mcuVar.c = (mcu) ksyVar;
                            if (a.av(atomicReference2, ksyVar, mcuVar)) {
                                boolean z7 = r8 == true ? 1 : 0;
                                while (true) {
                                    try {
                                        AtomicLong atomicLong = mczVarA.f;
                                        long j3 = atomicLong.get();
                                        if (atomicLong.compareAndSet(j3, mcy.e(j3, false, false, true, 0, 0, 0L, 123))) {
                                            int iF = mczVarA.c ? mcy.f(mcy.d(j3), mcy.a(j3, i2), mcy.a(j3, 1), mcy.a(j3, r8)) : Process.getThreadPriority(mczVarA.b);
                                            while (true) {
                                                int i3 = mcvVar3.get();
                                                if ((i3 & 1) == 0 && (i3 >> 2) > iF) {
                                                    if (mcvVar3.compareAndSet(i3, mcw.a(i3, iF, true, r8, 4))) {
                                                        long jAI2 = ksy.aI(false, false, false, -21, -21, iF, mcvVar3.b);
                                                        if (mczVar.c) {
                                                            while (true) {
                                                                AtomicLong atomicLong2 = mczVar.f;
                                                                long j4 = atomicLong2.get();
                                                                if ((j4 & j) == (jAI2 & j)) {
                                                                    mcvVar3 = mcvVar3;
                                                                    if (mcy.a(j4, r8 == true ? 1 : 0) == -21 || mcy.a(j4, r8 == true ? 1 : 0) > (((int) (jAI2 >> 43)) & 63) - 21) {
                                                                        long jE = mcy.e(j4, false, false, false, 0, (((int) (jAI2 >> 43)) & 63) - 21, 0L, 95);
                                                                        if (!mcy.c(j4)) {
                                                                            boolean zD = mcy.d(j4);
                                                                            z = z7 ? 1 : 0;
                                                                            try {
                                                                                atomicReference = atomicReference2;
                                                                                mcvVar = mcvVar2;
                                                                                long j5 = jAI2;
                                                                                if (mcy.f(zD, mcy.a(j4, 2), mcy.a(j4, 1), mcy.a(j4, 0)) == mcy.f(mcy.d(jE), mcy.a(jE, 2), mcy.a(jE, 1), mcy.a(jE, 0))) {
                                                                                    if (atomicLong2.compareAndSet(j4, jE)) {
                                                                                        r6 = 0;
                                                                                        z2 = z;
                                                                                        i = 2;
                                                                                        z4 = true;
                                                                                        r7 = r6;
                                                                                        z3 = z2;
                                                                                    }
                                                                                } else if (atomicLong2.compareAndSet(j4, mcy.e(jE, false, true, false, 0, 0, 0L, R.styleable.AppCompatTheme_windowMinWidthMinor))) {
                                                                                    i = 2;
                                                                                    z4 = true;
                                                                                    r7 = 0;
                                                                                    mczVar.a(mcy.f(mcy.d(j4), mcy.a(j4, 2), mcy.a(j4, 1), mcy.a(j4, 0)));
                                                                                    z3 = z;
                                                                                }
                                                                                z7 = z ? 1 : 0;
                                                                                atomicReference2 = atomicReference;
                                                                                mcvVar2 = mcvVar;
                                                                                jAI2 = j5;
                                                                                r8 = 0;
                                                                            } catch (Throwable th3) {
                                                                                th = th3;
                                                                                mczVarA.d();
                                                                                if (z) {
                                                                                    mczVarA.a.interrupt();
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        } else if (!atomicLong2.compareAndSet(j4, jE)) {
                                                                        }
                                                                    }
                                                                    z2 = z7;
                                                                    atomicReference = atomicReference2;
                                                                    r6 = r8;
                                                                    mcvVar = mcvVar2;
                                                                    i = 2;
                                                                    z4 = true;
                                                                    r7 = r6;
                                                                    z3 = z2;
                                                                }
                                                            }
                                                        }
                                                        LockSupport.park(mcvVar3);
                                                        if (atomicReference.get() == mctVar) {
                                                            break;
                                                        }
                                                        z7 = z3 | (Thread.interrupted() ? 1 : 0);
                                                        int i4 = i;
                                                        r8 = r7;
                                                        i2 = i4;
                                                        atomicReference2 = atomicReference;
                                                        mcvVar2 = mcvVar;
                                                        mcvVar3 = mcvVar3;
                                                    } else {
                                                        iF = iF;
                                                    }
                                                }
                                                mcvVar3 = mcvVar3;
                                                z2 = z7;
                                                atomicReference = atomicReference2;
                                                r6 = r8;
                                                mcvVar = mcvVar2;
                                                i = 2;
                                                z4 = true;
                                                r7 = r6;
                                                z3 = z2;
                                                LockSupport.park(mcvVar3);
                                                if (atomicReference.get() == mctVar) {
                                                    break;
                                                    break;
                                                }
                                                z7 = z3 | (Thread.interrupted() ? 1 : 0);
                                                int i5 = i;
                                                r8 = r7;
                                                i2 = i5;
                                                atomicReference2 = atomicReference;
                                                mcvVar2 = mcvVar;
                                                mcvVar3 = mcvVar3;
                                            }
                                        } else {
                                            r8 = r8 == true ? 1 : 0;
                                            i2 = i2;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        z = z7 ? 1 : 0;
                                    }
                                }
                                mczVarA.d();
                                if (z3) {
                                    mczVarA.a.interrupt();
                                }
                                int i6 = i;
                                r8 = r7;
                                i2 = i6;
                                dxuVar = this;
                                z5 = z4;
                                j = j;
                                mcvVar2 = mcvVar;
                            } else {
                                r8 = r8 == true ? 1 : 0 ? 1 : 0;
                                i2 = i2;
                            }
                        }
                    }
                }
                r8 = r8 == true ? 1 : 0;
                i2 = i2;
                dxuVar = this;
            }
            j = j;
            z5 = true;
        }
        ahno.R(listenableFuture.isDone(), "Future was expected to be done: %s", listenableFuture);
        a.i(listenableFuture);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [acey, java.lang.Object] */
    public final void d() {
        Object obj = this.e;
        if (obj != null) {
            aboe aboeVar = (aboe) obj;
            e(aboeVar);
            ?? r3 = ((abwk) this.d).d;
            if (r3 != 0) {
                int i = aboeVar.j;
                if (i == 4 || i == 3 || i == 17) {
                    r3.I(aboeVar);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [axsp, java.lang.Object] */
    public final void e(aboe aboeVar) {
        this.b.kk(aboeVar);
    }

    public final void f() {
        this.e = null;
    }

    public final void g(aboe aboeVar) {
        if (((igp) this.a).b() != 2) {
            this.e = aboeVar;
            ((abpj) this.c).m(abnw.c);
            d();
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [ablg, java.lang.Object] */
    public final void h(avlh avlhVar) {
        avmm avmmVar = new avmm();
        int i = 12;
        avmmVar.c(avlhVar.i(new abwr(1)).ak(new abhb(this, i)));
        this.e.b(avlhVar);
        avmmVar.c(avlhVar.p().W(new vvb(new abhg(5), 7)).ak(new jbq(this, avlhVar, i)));
    }

    public dxu(axsp axspVar, igp igpVar, abpj abpjVar, abwk abwkVar) {
        this.b = axspVar;
        this.a = igpVar;
        this.c = abpjVar;
        this.d = abwkVar;
    }

    public dxu(abfv abfvVar, ablf ablfVar, ablk ablkVar, abmt abmtVar) {
        this.d = abfvVar;
        this.b = abmtVar;
        this.a = ablfVar;
        this.c = ablkVar;
        this.e = ablfVar;
    }

    public dxu(Executor executor) {
        executor.getClass();
        this.d = executor;
        this.c = new AtomicReference();
        this.a = new ConcurrentLinkedQueue();
        this.b = new mcx();
    }
}
