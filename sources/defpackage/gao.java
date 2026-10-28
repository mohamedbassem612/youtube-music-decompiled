package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gao implements Runnable, gal {
    private static final long g = System.currentTimeMillis();
    public Context b;
    public final kwc c;
    public final fwz d;
    public final boolean e;
    private final Executor h;
    public final AtomicReference a = new AtomicReference();
    final CountDownLatch f = new CountDownLatch(1);
    private final List i = new ArrayList();

    public gao(Context context, Executor executor, fwz fwzVar) {
        this.d = fwzVar;
        this.b = context;
        this.h = executor;
        jwm jwmVar = jwp.a;
        kro.E(new jwo(context));
        boolean z = ((Boolean) jwp.c.d()).booleanValue() && fwzVar.g;
        this.e = z;
        this.c = kwc.a(context, executor, z);
        executor.execute(this);
    }

    public static final Context h(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    private final void j() {
        List<Object[]> list = this.i;
        if (list.isEmpty()) {
            return;
        }
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            for (Object[] objArr : list) {
                int length = objArr.length;
                if (length == 1) {
                    ((gal) atomicReference.get()).f((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    ((gal) atomicReference.get()).g(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            list.clear();
        }
    }

    private final void l() {
        Context context = this.b;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        AtomicReference atomicReference = this.a;
        ahsm ahsmVar = new ahsm(this.d);
        gap.r(context, ahsmVar);
        atomicReference.set(new gap(context, ahsmVar));
    }

    public final String a(Context context) {
        ListenableFuture listenableFutureR = ahng.r(new uf(this, context, 4), this.h);
        try {
            fxf fxfVar = this.d.i;
            if (fxfVar == null) {
                fxfVar = fxf.a;
            }
            return (String) listenableFutureR.get(fxfVar.c, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return "17";
        } catch (TimeoutException unused2) {
            return kro.aV(context, this.d.e, g);
        }
    }

    public final String b(Context context) {
        if (!m()) {
            return "";
        }
        j();
        gal galVar = (gal) this.a.get();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return galVar.d(context);
    }

    @Override // defpackage.gal
    @Deprecated
    public final String c(Context context, String str, View view, Activity activity) {
        if (!m()) {
            return "";
        }
        j();
        return ((gal) this.a.get()).c(h(context), str, view, activity);
    }

    @Override // defpackage.gal
    public final String d(Context context) {
        fwz fwzVar = this.d;
        fxf fxfVar = fwzVar.i;
        if (fxfVar == null) {
            fxfVar = fxf.a;
        }
        if (fxfVar.d) {
            long jCurrentTimeMillis = System.currentTimeMillis() - g;
            fxf fxfVar2 = fwzVar.i;
            if (fxfVar2 == null) {
                fxfVar2 = fxf.a;
            }
            if (jCurrentTimeMillis <= fxfVar2.e) {
                return a(context);
            }
        }
        return b(context);
    }

    @Override // defpackage.gal
    public final String e(Context context, View view, Activity activity) {
        return m() ? ((gal) this.a.get()).e(context, view, activity) : "";
    }

    @Override // defpackage.gal
    public final void f(MotionEvent motionEvent) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() == null) {
            this.i.add(new Object[]{motionEvent});
        } else {
            j();
            ((gal) atomicReference.get()).f(motionEvent);
        }
    }

    @Override // defpackage.gal
    public final void g(int i, int i2, int i3) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() == null) {
            this.i.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        } else {
            j();
            ((gal) atomicReference.get()).g(i, i2, i3);
        }
    }

    @Override // defpackage.gal
    public final void i(View view) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            ((gal) atomicReference.get()).i(view);
        }
    }

    @Override // defpackage.gal
    public final boolean k() {
        if (this.f.getCount() == 0) {
            AtomicReference atomicReference = this.a;
            if (atomicReference.get() != null && ((gal) atomicReference.get()).k()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gal
    public final boolean m() {
        try {
            this.f.await();
            AtomicReference atomicReference = this.a;
            return atomicReference.get() != null && ((gal) atomicReference.get()).m();
        } catch (InterruptedException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                fwz fwzVar = this.d;
                int iAS = a.aS(fwzVar.c);
                if (iAS == 0) {
                    iAS = 1;
                }
                if (iAS - 1 == 2) {
                    int i2 = kwj.a;
                    kwt kwtVar = new kwt(this.b, kwj.b(this.b, this.c), new gan(this, 0), ((Boolean) jwp.b.d()).booleanValue());
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    synchronized (kwt.a) {
                        gcz gczVarG = kwtVar.g(1);
                        if (gczVarG == null) {
                            kwtVar.e(4025, jCurrentTimeMillis2);
                        } else {
                            File fileA = kwtVar.a(gczVarG.c);
                            if (new File(fileA, "pcam.jar").exists()) {
                                if (new File(fileA, "pcbc").exists()) {
                                    kwtVar.e(5019, jCurrentTimeMillis2);
                                } else {
                                    kwtVar.e(4027, jCurrentTimeMillis2);
                                }
                                i = 3;
                            } else {
                                kwtVar.e(4026, jCurrentTimeMillis2);
                            }
                        }
                        if (fwzVar.d) {
                            i = 2;
                        } else {
                            i = 3;
                        }
                    }
                } else {
                    i = 2;
                }
                if (i - 1 != 2) {
                    l();
                    int iAS2 = a.aS(this.d.c);
                    if (iAS2 != 0 && iAS2 == 3) {
                        this.h.execute(new dxk(this, 8));
                    }
                } else {
                    fwz fwzVar2 = this.d;
                    String str = fwzVar2.e;
                    Context context = this.b;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    gaj gajVarB = gaj.b(str, context, this.h, fwzVar2.f, this.e);
                    this.a.set(gajVarB);
                    if (!gajVarB.l() && fwzVar2.d) {
                        l();
                    }
                }
            } catch (NullPointerException e) {
                if (this.d.d) {
                    l();
                }
                this.c.e(2031, System.currentTimeMillis() - jCurrentTimeMillis, e, null, null);
            }
            this.b = null;
            this.f.countDown();
        } catch (Throwable th) {
            this.b = null;
            this.f.countDown();
            throw th;
        }
    }
}
