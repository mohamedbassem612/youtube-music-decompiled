package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import defpackage.knc;
import defpackage.kne;
import defpackage.knf;
import defpackage.kng;
import defpackage.kni;
import defpackage.knj;
import defpackage.knl;
import defpackage.koc;
import defpackage.kod;
import defpackage.koe;
import defpackage.kor;
import defpackage.kpl;
import defpackage.kro;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class BasePendingResult extends knf {
    public static final ThreadLocal e = new koc();
    private final Object a;
    private final CountDownLatch b;
    private final ArrayList c;
    private knj d;
    protected final kod f;
    public kni g;
    public boolean h;
    private final AtomicReference i;
    private Status j;
    private volatile boolean k;
    private boolean l;
    private boolean m;
    private volatile knl n;
    private koe resultGuardian;

    protected BasePendingResult(knc kncVar) {
        this.a = new Object();
        this.b = new CountDownLatch(1);
        this.c = new ArrayList();
        this.i = new AtomicReference();
        this.h = false;
        this.f = new kod(kncVar != null ? ((kor) kncVar).a.A : Looper.getMainLooper());
        new WeakReference(kncVar);
    }

    private final kni b() {
        kni kniVar;
        synchronized (this.a) {
            if (this.k) {
                throw new IllegalStateException("Result has already been consumed.");
            }
            if (!m()) {
                throw new IllegalStateException("Result is not ready.");
            }
            kniVar = this.g;
            this.g = null;
            this.d = null;
            this.k = true;
        }
        kpl kplVar = (kpl) this.i.getAndSet(null);
        if (kplVar != null) {
            kplVar.a();
        }
        if (kniVar != null) {
            return kniVar;
        }
        throw new NullPointerException("null reference");
    }

    public static void k(kni kniVar) {
        if (kniVar instanceof kng) {
            try {
                ((kng) kniVar).a();
            } catch (RuntimeException e2) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(String.valueOf(kniVar))), e2);
            }
        }
    }

    private final void o(kni kniVar) {
        this.g = kniVar;
        this.j = kniVar.a();
        this.b.countDown();
        if (this.l) {
            this.d = null;
        } else {
            knj knjVar = this.d;
            if (knjVar != null) {
                kod kodVar = this.f;
                kodVar.removeMessages(2);
                kodVar.a(knjVar, b());
            } else if (this.g instanceof kng) {
                this.resultGuardian = new koe(this);
            }
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((kne) arrayList.get(i)).a(this.j);
        }
        arrayList.clear();
    }

    protected abstract kni a(Status status);

    @Override // defpackage.knf
    public final void d(kne kneVar) {
        synchronized (this.a) {
            if (m()) {
                kneVar.a(this.j);
            } else {
                this.c.add(kneVar);
            }
        }
    }

    @Override // defpackage.knf
    public final void e() {
        synchronized (this.a) {
            if (this.l || this.k) {
                return;
            }
            k(this.g);
            this.l = true;
            o(a(Status.e));
        }
    }

    @Override // defpackage.knf
    public final void f(knj knjVar) {
        boolean z;
        Object obj = this.a;
        synchronized (obj) {
            kro.h(!this.k, "Result has already been consumed.");
            knl knlVar = this.n;
            synchronized (obj) {
                try {
                    z = this.l;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            return;
        }
        if (m()) {
            this.f.a(knjVar, b());
        } else {
            this.d = knjVar;
        }
    }

    @Override // defpackage.knf
    public final kni g(TimeUnit timeUnit) {
        if (this.k) {
            throw new IllegalStateException("Result has already been consumed.");
        }
        knl knlVar = this.n;
        try {
            if (!this.b.await(0L, timeUnit)) {
                j(Status.d);
            }
        } catch (InterruptedException unused) {
            j(Status.b);
        }
        if (m()) {
            return b();
        }
        throw new IllegalStateException("Result is not ready.");
    }

    @Deprecated
    public final void j(Status status) {
        synchronized (this.a) {
            if (!m()) {
                l(a(status));
                this.m = true;
            }
        }
    }

    public final void l(kni kniVar) {
        synchronized (this.a) {
            if (this.m || this.l) {
                k(kniVar);
                return;
            }
            m();
            if (m()) {
                throw new IllegalStateException("Results have already been set");
            }
            if (this.k) {
                throw new IllegalStateException("Result has already been consumed");
            }
            o(kniVar);
        }
    }

    public final boolean m() {
        return this.b.getCount() == 0;
    }

    @Deprecated
    protected BasePendingResult(Looper looper) {
        this.a = new Object();
        this.b = new CountDownLatch(1);
        this.c = new ArrayList();
        this.i = new AtomicReference();
        this.h = false;
        this.f = new kod(looper);
        new WeakReference(null);
    }

    @Deprecated
    BasePendingResult() {
        this.a = new Object();
        this.b = new CountDownLatch(1);
        this.c = new ArrayList();
        this.i = new AtomicReference();
        this.h = false;
        this.f = new kod(Looper.getMainLooper());
        new WeakReference(null);
    }
}
