package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.util.Log;
import com.facebook.litho.ComponentTree;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class fhd implements Cloneable {
    public final Context a;
    public String b;
    public fgy c;
    public String d;
    public fly e;
    public fly f;
    public ComponentTree g;
    public WeakReference h;
    public fkt i;
    public final AtomicReference j;
    public final ayq k;
    private final String l;
    private final AtomicReference m;
    private final AtomicInteger n;
    private final omj o;

    public fhd(fhd fhdVar, fly flyVar, fjd fjdVar) {
        ComponentTree componentTree;
        this.a = fhdVar.a;
        this.k = fhdVar.k;
        this.c = fhdVar.c;
        this.g = fhdVar.g;
        this.h = new WeakReference(fjdVar);
        this.o = fhdVar.o;
        String strG = fhdVar.l;
        if (strG == null && (componentTree = this.g) != null) {
            strG = componentTree.g();
        }
        this.l = strG;
        this.e = flyVar == null ? fhdVar.e : flyVar;
        this.f = fhdVar.f;
        this.d = fhdVar.d;
        this.n = fhdVar.n;
        this.j = fhdVar.j;
        this.m = fhdVar.m;
    }

    private final void A() {
        String str = this.b;
        if (str != null) {
            throw new IllegalStateException(a.bT(str, "Updating the state of a component during ", " leads to unexpected behaviour, consider using lazy state updates."));
        }
    }

    public static fhd e(fhd fhdVar) {
        return new fhd(fhdVar.a, fhdVar.n(), fhdVar.w(), fhdVar.j());
    }

    public final int a() {
        return this.n.get();
    }

    public final Context b() {
        return this.a.getApplicationContext();
    }

    public final Resources c() {
        return this.a.getResources();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final fhd clone() {
        try {
            return (fhd) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final fip f() {
        ComponentTree componentTree;
        if (this.c != null) {
            try {
                fip fipVar = i().f;
                if (fipVar != null) {
                    return fipVar;
                }
            } catch (IllegalStateException unused) {
                componentTree = this.g;
                if (componentTree == null) {
                    return fic.a;
                }
            }
        }
        componentTree = this.g;
        if (componentTree == null) {
            return fic.a;
        }
        return componentTree.B;
    }

    final fjc g() {
        WeakReference weakReference = this.h;
        fjd fjdVar = weakReference != null ? (fjd) weakReference.get() : null;
        if (fjdVar != null) {
            return fjdVar.b;
        }
        return null;
    }

    public final fjd h() {
        WeakReference weakReference = this.h;
        if (weakReference != null) {
            return (fjd) weakReference.get();
        }
        return null;
    }

    public final fkt i() {
        fkt fktVar = this.i;
        azs.l(fktVar);
        return fktVar;
    }

    public final fly j() {
        fly flyVar = this.e;
        if (flyVar == null) {
            return null;
        }
        return fly.a(flyVar);
    }

    public final Object k(Class cls) {
        fly flyVar = this.f;
        if (flyVar == null) {
            return null;
        }
        return flyVar.c(cls);
    }

    public final Object l(Class cls) {
        fly flyVar = this.e;
        if (flyVar == null) {
            return null;
        }
        return flyVar.c(cls);
    }

    public String m() {
        if (this.c != null) {
            return this.d;
        }
        throw new RuntimeException("getGlobalKey cannot be accessed from a ComponentContext without a scope");
    }

    public final String n() {
        String str;
        ComponentTree componentTree = this.g;
        return (componentTree == null || (str = componentTree.E) == null) ? this.l : str;
    }

    public final String o() {
        return (String) this.j.get();
    }

    final void p() {
        this.b = null;
    }

    public final void q() {
        this.n.incrementAndGet();
    }

    public final void r(boolean z) {
        a.av(this.m, fhc.a, z ? fhc.b : fhc.c);
    }

    final boolean s() {
        fjc fjcVar;
        WeakReference weakReference = this.h;
        fjd fjdVar = weakReference != null ? (fjd) weakReference.get() : null;
        if (fjdVar == null || (fjcVar = fjdVar.b) == null) {
            return false;
        }
        return fjcVar.A;
    }

    public final boolean t() {
        ComponentTree componentTree = this.g;
        if (componentTree != null) {
            return componentTree.C;
        }
        boolean z = fna.a;
        return false;
    }

    public final boolean u() {
        return this.m.get() == fhc.b;
    }

    public final fiq v(int i, String str) {
        return new fiq(this.c == null ? "" : m(), i, str);
    }

    public final omj w() {
        omj omjVar;
        ComponentTree componentTree = this.g;
        return (componentTree == null || (omjVar = componentTree.I) == null) ? this.o : omjVar;
    }

    public void x(aero aeroVar, String str) {
        A();
        ComponentTree componentTree = this.g;
        if (componentTree != null) {
            String strM = m();
            boolean zS = s();
            if (!componentTree.n) {
                throw new RuntimeException("Triggering async state updates on this component tree is disabled, use sync state updates.");
            }
            synchronized (componentTree) {
                if (componentTree.v == null) {
                    return;
                }
                fkz fkzVar = componentTree.z;
                if (fkzVar != null) {
                    fkzVar.o(strM, aeroVar, false);
                }
                fpq.c.addAndGet(1L);
                componentTree.w(true, str, zS);
            }
        }
    }

    public final void y(aero aeroVar) {
        ComponentTree componentTree = this.g;
        if (componentTree != null) {
            componentTree.F(m(), aeroVar);
        }
    }

    public void z(aero aeroVar, String str) {
        A();
        ComponentTree componentTree = this.g;
        if (componentTree != null) {
            String strM = m();
            boolean zS = s();
            synchronized (componentTree) {
                if (componentTree.v == null) {
                    return;
                }
                fkz fkzVar = componentTree.z;
                if (fkzVar != null) {
                    fkzVar.o(strM, aeroVar, false);
                }
                fpq.b.addAndGet(1L);
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    Log.w(ComponentTree.a, "You cannot update state synchronously from a thread without a looper, using the default background layout thread instead");
                    synchronized (componentTree.g) {
                        fhs fhsVar = componentTree.h;
                        if (fhsVar != null) {
                            componentTree.p.a(fhsVar);
                        }
                        componentTree.h = new fhs(componentTree, str, zS);
                        componentTree.p.b();
                        componentTree.p.c(componentTree.h);
                    }
                    return;
                }
                ThreadLocal threadLocal = ComponentTree.b;
                WeakReference weakReference = (WeakReference) threadLocal.get();
                fvu fvtVar = weakReference != null ? (fvu) weakReference.get() : null;
                if (fvtVar == null) {
                    fvtVar = new fvt(looperMyLooper);
                    threadLocal.set(new WeakReference(fvtVar));
                }
                synchronized (componentTree.g) {
                    fhs fhsVar2 = componentTree.h;
                    if (fhsVar2 != null) {
                        fvtVar.a(fhsVar2);
                    }
                    componentTree.h = new fhs(componentTree, str, zS);
                    fvtVar.c(componentTree.h);
                }
            }
        }
    }

    public fhd(Context context, String str, omj omjVar, fly flyVar) {
        if (omjVar != null && str == null) {
            throw new IllegalStateException("When a ComponentsLogger is set, a LogTag must be set");
        }
        this.a = context;
        ci.I(context.getResources().getConfiguration());
        this.k = new ayq(context);
        this.e = flyVar;
        this.o = omjVar;
        this.l = str;
        this.m = new AtomicReference(fhc.a);
        this.n = new AtomicInteger(0);
        this.j = new AtomicReference();
    }
}
