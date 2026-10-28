package defpackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class acdv {
    public final acdu a;
    public volatile boolean b;
    private final Set c;
    private final Set d;
    private avmn e;
    private final awli f;
    private final Executor g;
    private final Supplier h;

    public acdv(Set set, Set set2, acdu acduVar, awli awliVar, Executor executor, Supplier supplier) {
        this.c = set;
        this.d = set2;
        this.a = acduVar;
        this.f = awliVar;
        this.g = executor;
        this.h = supplier;
    }

    private final void i() {
        if (j() == 1) {
            synchronized (this) {
                if (j() == 1) {
                    awli awliVar = this.f;
                    long j = this.a.c;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    Executor executor = this.g;
                    avmb avmbVar = awlg.a;
                    this.e = awliVar.p(j, timeUnit, new awir(executor)).ar().af(new acaa(this, 8));
                }
            }
        }
    }

    private final int j() {
        avmn avmnVar = this.e;
        if (avmnVar == null) {
            return 1;
        }
        return !avmnVar.f() ? 2 : 3;
    }

    final void a() {
        this.f.kk("");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        avmn avmnVar = this.e;
        if (avmnVar != 0) {
            if (avmnVar.f()) {
                return;
            } else {
                avnr.b((AtomicReference) avmnVar);
            }
        }
        Supplier supplier = this.h;
        if (supplier == null || !((Boolean) supplier.get()).booleanValue()) {
            c();
        }
    }

    public final void c() {
        acdu acduVar = this.a;
        int i = acduVar.d;
        acduVar.d = 0;
        if (i != 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((acdp) it.next()).gU(i);
            }
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                ((acdp) it2.next()).gU(i);
            }
        }
    }

    public final void d(int i) {
        acdu acduVar = this.a;
        acduVar.a(i);
        acduVar.d = 0;
        acduVar.e = 0;
        h(5);
    }

    public final boolean e() {
        return this.a.b() || j() == 3;
    }

    public final boolean f() {
        acdu acduVar = this.a;
        return (acduVar.e & acduVar.a) != 0;
    }

    public final int g(int i) {
        int i2;
        int iJ = j();
        if (this.b) {
            i2 = 6;
        } else {
            acdu acduVar = this.a;
            if (acduVar.b() || iJ == 3) {
                i2 = 1;
            } else {
                int i3 = acduVar.e | i;
                int i4 = acduVar.a;
                if ((i3 & i4) == i4) {
                    i2 = 2;
                } else if ((acduVar.b & i) != 0) {
                    i2 = 4;
                } else {
                    i2 = (i4 & i) != 0 ? 3 : 7;
                }
            }
        }
        this.a.a(i);
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            c();
            return;
        }
        if (i2 == 1) {
            b();
            return;
        }
        if (i2 == 2) {
            i();
            a();
            return;
        }
        if (i2 == 3) {
            i();
            a();
            c();
        } else {
            if (i2 != 4) {
                if (i2 == 6) {
                    i();
                    return;
                }
                return;
            }
            avmn avmnVar = this.e;
            if (avmnVar != 0) {
                synchronized (this) {
                    this.e = null;
                    if (!avmnVar.f()) {
                        avnr.b((AtomicReference) avmnVar);
                    }
                }
            }
            c();
        }
    }
}
