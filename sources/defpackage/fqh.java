package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fqh {
    public static final /* synthetic */ int f = 0;
    private static final AtomicInteger g = new AtomicInteger(1);
    public final fjl a;
    public final int b;
    public boolean c;
    public ComponentTree d;
    public ftg e;
    private final boolean h;
    private final boolean i;
    private fqg j;
    private final fna k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private fkz s;
    private fhr t;
    private int u;
    private int v;
    private boolean w;
    private final qcb x;

    public fqh(fqf fqfVar) {
        new AtomicInteger(0);
        this.p = true;
        this.q = false;
        this.u = -1;
        this.v = -1;
        this.w = true;
        this.e = fqfVar.a;
        this.x = fqfVar.j;
        this.h = fqfVar.d;
        this.b = g.getAndIncrement();
        this.l = fqfVar.c;
        this.m = fqfVar.g;
        this.n = fqfVar.e;
        this.i = fqfVar.f;
        this.a = fqfVar.h;
        this.k = fqfVar.b;
        this.o = fqfVar.i;
    }

    private final void v(fhd fhdVar) {
        fhq fsfVar;
        fhq fhqVar;
        fim fimVar;
        if (this.d == null) {
            if (this.a != null) {
                this.j = new fqg(this);
            }
            fgy fgyVarC = this.e.c();
            fqg fqgVar = this.j;
            String str = ComponentTree.a;
            fhm fhmVar = new fhm(fhdVar);
            fhmVar.b(fgyVarC);
            fhmVar.o = fqgVar;
            Object objF = this.e.f("is_reconciliation_enabled");
            Object objF2 = this.e.f("layout_diffing_enabled");
            Object objF3 = this.e.f("error_event_handler");
            if (objF != null) {
                fhmVar.k = ((Boolean) objF).booleanValue();
            } else {
                fhmVar.k = false;
            }
            if (objF2 != null) {
                fhmVar.g = ((Boolean) objF2).booleanValue();
            } else {
                fhmVar.g = this.i;
            }
            if ((objF3 instanceof fim) && (fimVar = (fim) objF3) != null) {
                fhmVar.l = fimVar;
            }
            fhmVar.h = this.s;
            qcb qcbVar = this.x;
            if (qcbVar == null) {
                fhqVar = null;
            } else {
                fsy fsyVar = (fsy) qcbVar.a;
                if (fsyVar.m) {
                    fsfVar = new fse(fsyVar, this);
                } else {
                    fsfVar = fsyVar.n ? new fsf(fsyVar, this, 1) : new fsf(fsyVar, this, 0);
                }
                fhqVar = fsfVar;
            }
            fhmVar.j = fhqVar;
            fhmVar.i = this.q;
            fhmVar.d = this.l;
            fhmVar.b = this.m;
            fhmVar.e = this.n;
            fhmVar.m = this.h;
            omj omjVarQ = this.e.q();
            String strG = this.e.g();
            fhmVar.q = omjVarQ;
            fhmVar.n = strG;
            fhmVar.p = true;
            fhmVar.a();
            ComponentTree componentTreeA = fhmVar.a();
            this.d = componentTreeA;
            fhr fhrVar = this.t;
            if (fhrVar != null) {
                componentTreeA.q = fhrVar;
            }
        }
    }

    final synchronized int a() {
        return this.r;
    }

    public final synchronized ComponentTree b() {
        return this.d;
    }

    public final synchronized ComponentTree c() {
        if (!this.c) {
            return null;
        }
        return this.d;
    }

    public final synchronized ftg d() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b A[Catch: all -> 0x0030, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000f, B:11:0x0021, B:13:0x0025, B:14:0x0029, B:8:0x0017, B:10:0x001b), top: B:21:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0025 A[Catch: all -> 0x0030, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000f, B:11:0x0021, B:13:0x0025, B:14:0x0029, B:8:0x0017, B:10:0x001b), top: B:21:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017 A[Catch: all -> 0x0030, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000f, B:11:0x0021, B:13:0x0025, B:14:0x0029, B:8:0x0017, B:10:0x001b), top: B:21:0x0003 }] */
    public final synchronized void e(boolean z) {
        ComponentTree componentTree;
        ComponentTree componentTree2;
        if (z) {
            componentTree2 = this.d;
            if (componentTree2 != null) {
                this.s = componentTree2.e();
            }
            componentTree = this.d;
            if (componentTree != null) {
                this.q = componentTree.t;
            }
            k();
        } else {
            Object objF = this.e.f("acquire_state_handler");
            if ((objF instanceof Boolean) && ((Boolean) objF).booleanValue()) {
                componentTree2 = this.d;
                if (componentTree2 != null) {
                    this.s = componentTree2.e();
                }
            }
            componentTree = this.d;
            if (componentTree != null) {
                this.q = componentTree.t;
            }
            k();
        }
        throw th;
    }

    public final synchronized void f(fhq fhqVar) {
        ComponentTree componentTree = this.d;
        if (componentTree != null) {
            synchronized (componentTree) {
                List list = componentTree.f;
                if (list != null) {
                    list.remove(fhqVar);
                }
            }
        }
    }

    public final synchronized void g() {
        this.w = false;
    }

    public final void h(fhd fhdVar, int i, int i2, fhq fhqVar, boolean z) {
        synchronized (this) {
            if (this.e.m()) {
                return;
            }
            this.u = i;
            this.v = i2;
            v(fhdVar);
            ComponentTree componentTree = this.d;
            fgy fgyVarC = this.e.c();
            ftg ftgVar = this.e;
            fly flyVar = ftgVar instanceof fuq ? ((fuq) ftgVar).a : null;
            if (this.o && this.w && !z) {
                this.w = false;
                m(0);
            }
            if (fhqVar != null) {
                componentTree.i(fhqVar);
            }
            componentTree.D(fgyVarC, i, i2, true, null, 1, null, flyVar, false, false);
            synchronized (this) {
                if (this.d == componentTree && fgyVarC == this.e.c()) {
                    this.c = true;
                }
            }
        }
    }

    public final void i(fhd fhdVar, int i, int i2, fkw fkwVar) {
        synchronized (this) {
            if (this.e.m()) {
                return;
            }
            this.u = i;
            this.v = i2;
            v(fhdVar);
            ComponentTree componentTree = this.d;
            fgy fgyVarC = this.e.c();
            ftg ftgVar = this.e;
            fly flyVar = ftgVar instanceof fuq ? ((fuq) ftgVar).a : null;
            if (this.o && this.w) {
                this.w = false;
                m(0);
            }
            componentTree.D(fgyVarC, i, i2, false, fkwVar, 0, null, flyVar, false, false);
            synchronized (this) {
                if (componentTree == this.d && fgyVarC == this.e.c()) {
                    this.c = true;
                    if (fkwVar != null) {
                        this.r = fkwVar.b;
                    }
                }
            }
        }
    }

    final synchronized void j() {
        this.c = false;
    }

    public final synchronized void k() {
        ComponentTree componentTree = this.d;
        if (componentTree != null) {
            fqg fqgVar = this.j;
            if (fqgVar != null) {
                fqgVar.d(fjk.DESTROYED);
                return;
            } else {
                componentTree.t();
                this.d = null;
                this.e.h();
            }
        }
        this.c = false;
    }

    public final synchronized void l(boolean z) {
        this.p = z;
    }

    final synchronized void m(int i) {
        this.r = i;
    }

    final synchronized void n(fhr fhrVar) {
        ComponentTree componentTree = this.d;
        if (componentTree != null) {
            componentTree.q = fhrVar;
        } else {
            this.t = fhrVar;
        }
    }

    public final synchronized void o(ftg ftgVar) {
        j();
        this.e = ftgVar;
    }

    public final synchronized boolean p() {
        boolean z = true;
        if (!this.e.m()) {
            ComponentTree componentTree = this.d;
            if (componentTree == null) {
                z = false;
            } else if (!componentTree.x(this.u, this.v)) {
                return false;
            }
        }
        return z;
    }

    public final synchronized boolean q() {
        return this.p;
    }

    public final synchronized boolean r() {
        return this.c;
    }

    public final synchronized boolean s(int i, int i2) {
        return r() && this.u == i && this.v == i2;
    }

    public final synchronized boolean t() {
        return this.w;
    }

    final synchronized void u(int i, int i2, int i3) {
        ComponentTree componentTree = this.d;
        if (componentTree != null) {
            componentTree.C(i, i2, i3);
        }
    }
}
