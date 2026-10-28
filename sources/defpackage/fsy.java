package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.litho.ComponentTree;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fsy implements fpx, frh, fqv {
    public static Field a;
    public boolean A;
    public fkw B;
    public RecyclerView C;
    public int H;
    public int I;
    volatile fkw J;
    public fip K;
    public final fuz N;
    public int P;
    public final fth Q;
    public final abgn S;
    public final hhb U;
    private final boolean Y;
    private final fjl Z;
    private final fte aa;
    private final boolean ab;
    private final boolean ac;
    private final boolean ad;
    private final boolean ae;
    private final boolean af;
    private final fna ag;
    private final fsx ar;
    private ftr au;
    private final qcb aw;
    public final fsk d;
    public final frj e;
    public final nh f;
    public final fhd g;
    public final float i;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final List o;
    public final boolean p;
    public final boolean q;
    final boolean t;
    public final float u;
    public final boolean y;
    public final boolean z;
    private static final fkw V = new fkw();
    private static final Rect W = new Rect();
    static final gzj T = new gzj();
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public final Handler h = new Handler(Looper.getMainLooper());
    public final AtomicBoolean j = new AtomicBoolean(false);
    private final AtomicBoolean X = new AtomicBoolean(false);
    public final Map r = new HashMap();
    public final AtomicLong s = new AtomicLong(-1);
    private final Deque ah = new ArrayDeque();
    private final AtomicBoolean ai = new AtomicBoolean(false);
    private final AtomicBoolean aj = new AtomicBoolean(false);
    final Deque v = new ArrayDeque();
    final Runnable w = new px(this, 20, null);
    private final hhb av = new hhb(this);
    private final ViewTreeObserver.OnPreDrawListener ak = new fsd(this, 0);
    private final Runnable al = new fsu(this, 1);
    private final ArrayList am = new ArrayList();
    private final fhr an = new fsg(this);
    public final fmx x = new fsh(this);
    private int ao = -1;
    private int ap = -1;
    public int D = -1;
    public int E = -1;
    int F = -1;
    public final AtomicInteger G = new AtomicInteger(0);
    public volatile boolean L = false;
    private boolean aq = false;
    public final Set M = new HashSet();
    private fsl as = null;
    public boolean O = true;
    private final fuw at = new frx(this, 0);
    public final Runnable R = new px(this, 19, null);

    public fsy(fss fssVar) {
        this.I = -1;
        fhd fhdVar = fssVar.d;
        this.g = fhdVar;
        this.Z = fssVar.p;
        this.k = fssVar.g;
        this.d = fssVar.r;
        this.U = new hhb(this);
        this.f = new fsv(this);
        this.m = fssVar.s;
        this.n = fssVar.t;
        this.i = fssVar.a;
        frj frjVar = fssVar.b;
        this.e = frjVar;
        this.l = true;
        this.af = fssVar.o;
        this.ag = fssVar.c;
        this.q = fssVar.q;
        int i = fna.x;
        this.ar = i > 0 ? new fsx(i) : null;
        this.Q = new fth(fssVar.f);
        boolean z = frjVar.i() == 0 ? fssVar.e : false;
        this.y = z;
        this.z = frjVar.i() == 0 && fna.E;
        this.aw = z ? new qcb(this) : null;
        this.A = false;
        np npVarJ = frjVar.j();
        boolean stackFromEnd = npVarJ instanceof LinearLayoutManager ? ((LinearLayoutManager) npVarJ).getStackFromEnd() : false;
        this.t = stackFromEnd;
        if (stackFromEnd) {
            this.aa = fte.b;
        } else {
            this.aa = fte.a;
        }
        this.N = new fuz(this.D, this.E, fssVar.b);
        this.o = fssVar.h;
        int i2 = fssVar.l;
        if (i2 != -1) {
            this.I = i2;
            this.ad = true;
        } else {
            this.ad = false;
        }
        this.p = fssVar.i;
        this.Y = fssVar.n;
        this.ab = fssVar.j;
        this.ac = fssVar.k;
        this.ae = fssVar.m;
        this.S = fssVar.u;
        this.u = fhdVar.a.getResources().getDisplayMetrics().density;
    }

    public static void B(fqh fqhVar, boolean z) {
        if (fqhVar.r()) {
            Object objF = fqhVar.e.f("prevent_release");
            if (((objF instanceof Boolean) && ((Boolean) objF).booleanValue()) || fqhVar.d().k() || fqhVar.b() == null || fqhVar.b().getLithoView() != null) {
                return;
            }
            fqhVar.e(z);
        }
    }

    public static void K(List list, Map map) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            fqh fqhVar = (fqh) list.get(i);
            fqhVar.k();
            if (fna.I) {
                map.remove(fqhVar);
            }
        }
    }

    public static void S(fsy fsyVar, fkw fkwVar) {
        fsyVar.J = fkwVar;
        synchronized (fsyVar) {
            fsyVar.N();
        }
    }

    static boolean T(int i, int i2, int i3, boolean z) {
        if (i3 != 1 ? View.MeasureSpec.getMode(i2) != 1073741824 : View.MeasureSpec.getMode(i) != 1073741824) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    private final fkw X(int i, int i2, boolean z) {
        int size;
        fkw fkwVar = new fkw();
        int i3 = this.e.i();
        boolean zT = T(i, i2, i3, z);
        int size2 = 0;
        if (i3 != 1) {
            int size3 = View.MeasureSpec.getSize(i);
            if (!zT) {
                size2 = View.MeasureSpec.getSize(i2);
            } else if (this.J != null) {
                size2 = this.J.b;
            }
            size = size2;
            size2 = size3;
        } else {
            size = View.MeasureSpec.getSize(i2);
            if (!zT) {
                size2 = View.MeasureSpec.getSize(i);
            } else if (this.J != null) {
                size2 = this.J.a;
            }
        }
        fkwVar.a = size2;
        fkwVar.b = size;
        return fkwVar;
    }

    private final void Y(fqh fqhVar) {
        int iQ = q(fqhVar);
        int iP = p(fqhVar);
        if (!fqhVar.s(iQ, iP)) {
            fqhVar.h(this.g, iQ, iP, null, false);
        } else if (fqhVar.p()) {
            ComponentTree componentTreeB = fqhVar.b();
            if (componentTreeB.q != null) {
                componentTreeB.q = null;
            }
        }
    }

    private final void Z(int i, int i2) {
        int iAM;
        int i3;
        fte fteVar = this.aa;
        int i4 = this.D;
        int i5 = this.F;
        if (i4 != i5) {
            this.O = i4 > i5;
            this.F = i4;
        }
        int andSet = fna.B > 0 ? this.G.getAndSet(0) : 0;
        synchronized (this) {
            if (!((this.q && this.y) ? this.j.get() : ad()) || this.I == -1) {
                return;
            }
            if (i == -1 || i2 == -1) {
                i = 0;
                i2 = 0;
            }
            float f = fna.z;
            float f2 = fna.A;
            boolean z = this.e.i() == 1 && fna.y > 0;
            int i6 = fna.x;
            boolean z2 = i6 == -1;
            boolean z3 = i6 > 0;
            boolean z4 = z || z2 || z3;
            int iMax = Math.max(this.I, i2 - i);
            if (z) {
                iMax = fna.y;
            } else if (z2) {
                iMax = this.I;
            } else if (z3) {
                fsx fsxVar = this.ar;
                fsxVar.c += iMax;
                LinkedList linkedList = fsxVar.a;
                linkedList.offerFirst(Integer.valueOf(iMax));
                if (linkedList.size() > fsxVar.b) {
                    fsxVar.c -= ((Integer) linkedList.removeLast()).intValue();
                }
                if (linkedList.isEmpty()) {
                    throw new IllegalStateException("RollingAverage window is empty");
                }
                iMax = fsxVar.c / linkedList.size();
            }
            int size = this.b.size();
            if (!z4) {
                int i7 = (int) (iMax * this.i);
                int i8 = i - i7;
                iAM = i7 + i + iMax;
                i3 = i8;
            } else if (z) {
                boolean z5 = this.O;
                int iAN = i - gzj.aN(iMax, true != z5 ? f : f2, z5);
                int i9 = true != z5 ? andSet : 0;
                if (true != z5) {
                    f = f2;
                }
                iAM = i2 + gzj.aM(iMax, f, z5) + (true == z5 ? andSet : 0);
                i3 = iAN - i9;
                gzj.aO(z5, i3, iAM, andSet, this.M);
            } else {
                float f3 = iMax * this.i;
                boolean z6 = this.O;
                if (true != z6) {
                    f = f2;
                }
                int i10 = (int) f3;
                int iAN2 = i - gzj.aN(i10, f, z6);
                int i11 = true != z6 ? andSet : 0;
                iAM = i2 + gzj.aM(i10, f, z6) + (true == z6 ? andSet : 0);
                i3 = iAN2 - i11;
                gzj.aO(z6, i3, iAM, andSet, this.M);
            }
            if (fna.w && Build.VERSION.SDK_INT >= 29) {
                Trace.setCounter("RecyclerBinder Window Size", iAM - i3);
            }
            fteVar.a(size, new fsb(this, i3, iAM, size));
        }
    }

    private final void aa() {
        if (gzj.aT()) {
            x(0);
        } else {
            fmz.b().a(this.x);
        }
    }

    private final void ab(fsl fslVar) {
        ArrayList arrayList = fslVar.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            fsn fsnVar = (fsn) arrayList.get(i);
            if (fsnVar instanceof fsm) {
                Y(((fsm) fsnVar).b);
            }
        }
    }

    private final boolean ac() {
        return !(this.J == null || this.I == -1) || this.ad;
    }

    private final boolean ad() {
        return this.j.get() && !this.X.get();
    }

    private final boolean ae() {
        RecyclerView recyclerView = this.C;
        if (recyclerView != null) {
            return recyclerView.au();
        }
        return false;
    }

    private final aero af() {
        int iO;
        List list = this.b;
        if (list.isEmpty()) {
            List list2 = this.c;
            if (list2.isEmpty() || (iO = o(list2, this.t)) < 0) {
                return null;
            }
            return new aero(iO, list2);
        }
        int iO2 = o(list, this.t);
        if (this.D >= list.size() || iO2 < 0) {
            return null;
        }
        return new aero(iO2, list);
    }

    static int o(List list, boolean z) {
        if (z) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (((fqh) list.get(size)).d().l()) {
                    return size;
                }
            }
            return -1;
        }
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            if (((fqh) list.get(i)).d().l()) {
                return i;
            }
        }
        return -1;
    }

    public static fkw s(fhd fhdVar, fqh fqhVar) {
        fkw fkwVar = new fkw();
        fqhVar.i(fhdVar, 0, 0, fkwVar);
        return fkwVar;
    }

    public final void A(int i, List list) {
        gzj.aS();
        if (ftj.a) {
            String[] strArr = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                strArr[i2] = ((ftg) list.get(i2)).s();
            }
            hashCode();
            list.size();
            Arrays.toString(strArr);
        }
        synchronized (this) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ftg ftgVar = (ftg) list.get(i3);
                if (ftgVar == null) {
                    throw new RuntimeException("Received null RenderInfo to insert/update!");
                }
                fqh fqhVarT = t(ftgVar);
                if (this.L) {
                    throw new RuntimeException("Trying to do a sync insert when using asynchronous mutations!");
                }
                this.b.add(i + i3, fqhVarT);
                this.Q.b(ftgVar);
            }
            list.size();
        }
        this.f.l(i, list.size());
        fuz fuzVar = this.N;
        list.size();
        fuzVar.c(fuzVar.f(i, this.I));
    }

    public final void C() {
        gzj.aS();
        Deque deque = this.v;
        if (deque.isEmpty() || !this.aq) {
            return;
        }
        RecyclerView recyclerView = this.C;
        if (recyclerView != null && recyclerView.as() && recyclerView.q && recyclerView.getWindowVisibility() == 0) {
            Object parent = recyclerView;
            while (true) {
                if (!(parent instanceof View)) {
                    Rect rect = W;
                    if (!recyclerView.getGlobalVisibleRect(rect)) {
                        break;
                    }
                    if (deque.size() > 20) {
                        deque.clear();
                        StringBuilder sb = new StringBuilder("recyclerView: ");
                        sb.append(recyclerView);
                        sb.append(", hasPendingAdapterUpdates(): ");
                        sb.append(recyclerView.as());
                        sb.append(", isAttachedToWindow(): ");
                        sb.append(recyclerView.q);
                        sb.append(", getWindowVisibility(): ");
                        sb.append(recyclerView.getWindowVisibility());
                        sb.append(", vie visible hierarchy: ");
                        ArrayList arrayList = new ArrayList();
                        Object parent2 = recyclerView;
                        while (parent2 instanceof View) {
                            View view = (View) parent2;
                            arrayList.add("view=" + view.getClass().getSimpleName() + ", alpha=" + view.getAlpha() + ", visibility=" + view.getVisibility());
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            } else {
                                parent2 = view.getParent();
                            }
                        }
                        sb.append(arrayList);
                        sb.append(", getGlobalVisibleRect(): ");
                        sb.append(recyclerView.getGlobalVisibleRect(rect));
                        sb.append(", isComputingLayout(): ");
                        sb.append(recyclerView.au());
                        sb.append(", isSubAdapter: false, visible range: [");
                        sb.append(this.D);
                        sb.append(", ");
                        sb.append(this.E);
                        sb.append(']');
                        gzj.bs(2, "@OnDataRendered callbacks aren't triggered as expected: ".concat(sb.toString()), fpr.a(this.g));
                        return;
                    }
                    return;
                }
                View view2 = (View) parent;
                if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                    break;
                } else {
                    parent = view2.getParent();
                }
            }
        }
        boolean z = recyclerView != null;
        ArrayDeque arrayDeque = new ArrayDeque(deque);
        deque.clear();
        this.h.postAtFrontOfQueue(new frz((Deque) arrayDeque, z, 0));
    }

    public final void D() {
        if (this.C != null && this.N.d()) {
            RecyclerView recyclerView = this.C;
            Runnable runnable = this.R;
            recyclerView.removeCallbacks(runnable);
            RecyclerView recyclerView2 = this.C;
            int i = bac.a;
            recyclerView2.postOnAnimation(runnable);
        }
        Z(this.D, this.E);
    }

    public final void E(fst fstVar) {
        fqh fqhVarA = fstVar.next();
        if (this.b.isEmpty() || fqhVarA == null || this.I != -1) {
            return;
        }
        int iQ = q(fqhVarA);
        int iP = p(fqhVarA);
        if (fqhVarA.s(iQ, iP)) {
            return;
        }
        fqhVarA.h(this.g, iQ, iP, new fsa(this, fstVar, fqhVarA), false);
    }

    public final void F() {
        aero aeroVarAf;
        List list;
        int iO;
        if (this.j.get()) {
            if (!this.X.get()) {
                if (!ac() && (iO = o((list = this.b), this.t)) >= 0) {
                    aero aeroVar = new aero(iO, list);
                    fkw fkwVar = this.B;
                    int i = fkwVar.a;
                    int i2 = fkwVar.b;
                    this.e.i();
                    W(i, i2, aeroVar);
                }
                D();
                return;
            }
            fkw fkwVar2 = this.B;
            if (fkwVar2.a == 0 || fkwVar2.b == 0) {
                N();
                return;
            }
            fkw fkwVarX = X(this.ao, this.ap, true);
            fkw fkwVar3 = new fkw();
            int i3 = fkwVarX.a;
            int i4 = fkwVarX.b;
            boolean z = fna.a;
            frj frjVar = this.e;
            int iC = frjVar.c();
            if (iC == -1) {
                iC = 0;
            }
            List list2 = this.b;
            fri friVarK = frjVar.k(i3, i4);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
            fkw fkwVar4 = new fkw();
            while (friVarK.c() && iC < list2.size()) {
                fqh fqhVar = (fqh) list2.get(iC);
                ftg ftgVarD = fqhVar.d();
                if (ftgVarD.m()) {
                    break;
                }
                fqhVar.i(this.g, frjVar.g(iMakeMeasureSpec, ftgVarD), frjVar.f(iMakeMeasureSpec2, ftgVarD), fkwVar4);
                friVarK.b(ftgVarD, fkwVar4.a, fkwVar4.b);
                iC++;
            }
            int iA = friVarK.a();
            if (frjVar.i() == 1) {
                fkwVar3.a = i3;
                fkwVar3.b = Math.min(iA, i4);
            } else {
                fkwVar3.a = Math.min(iA, i3);
                fkwVar3.b = i4;
            }
            list2.size();
            if (ftj.a) {
                hashCode();
            }
            if (!ac() && (aeroVarAf = af()) != null) {
                frjVar.i();
                W(i3, i4, aeroVarAf);
            }
            int i5 = fkwVar3.a;
            fkw fkwVar5 = this.B;
            if (i5 == fkwVar5.a && fkwVar3.b == fkwVar5.b) {
                return;
            }
            N();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(RecyclerView recyclerView) {
        gzj.aS();
        RecyclerView recyclerView2 = this.C;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                P(recyclerView2);
            }
            if (this.L) {
                x(0);
            }
            this.C = recyclerView;
            this.aq = true;
            frj frjVar = this.e;
            boolean z = this.af;
            np npVarJ = frjVar.j();
            npVarJ.setItemPrefetchEnabled(z);
            recyclerView.getPaddingLeft();
            recyclerView.ah(npVarJ);
            recyclerView.ad(this.f);
            fuz fuzVar = this.N;
            recyclerView.aC(fuzVar.d);
            if (npVarJ instanceof frr) {
                new Rect(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
                ((frr) npVarJ).a();
            }
            if (recyclerView instanceof frm) {
                ((frm) recyclerView).af = this.av;
            } else if (recyclerView.getViewTreeObserver() != null) {
                recyclerView.getViewTreeObserver().addOnPreDrawListener(this.ak);
            }
            frjVar.m(this);
            fuzVar.a(this.at);
            int i = this.D;
            if (i != -1 && i >= 0) {
                frjVar.l(i, this.H);
            }
            RecyclerView recyclerView3 = this.C;
            if (recyclerView3 != null) {
                int i2 = ftl.o;
                ftl ftlVar = recyclerView3.getParent() instanceof ftl ? (ftl) recyclerView3.getParent() : null;
                if (ftlVar != null) {
                    ftr ftrVar = new ftr(this);
                    this.au = ftrVar;
                    if (ftrVar.a != null) {
                        throw new RuntimeException("SectionsRecyclerView has already been initialized but never reset.");
                    }
                    ftrVar.a = ftlVar;
                    ftrVar.a.p();
                    ftrVar.b = ftlVar.l.n;
                    if (ftrVar.b == null) {
                        throw new RuntimeException("LayoutManager of RecyclerView is not initialized yet.");
                    }
                    ftrVar.a.l.aC(ftrVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    public final void H(int i, int i2) {
        fqh fqhVar;
        boolean z;
        boolean z2;
        gzj.aS();
        if (ftj.a) {
            hashCode();
        }
        synchronized (this) {
            List list = this.b;
            fqhVar = (fqh) list.remove(i);
            list.add(i2, fqhVar);
            int i3 = this.I;
            z = true;
            if (i3 != -1) {
                float f = i2;
                float f2 = this.D;
                float f3 = i3 * this.i;
                if (f < f2 - f3 || f > this.E + f3) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
        }
        if (fqhVar.r() && !z2) {
            fqhVar.e(this.l);
        }
        this.f.jY(i, i2);
        fuz fuzVar = this.N;
        int i4 = (this.E - this.D) + 1;
        if (!fuzVar.d() && i4 != -1) {
            int i5 = fuzVar.a;
            boolean z3 = i2 >= i5 && i2 <= (i5 + i4) + (-1);
            boolean z4 = i >= i5 && i <= (i5 + i4) + (-1);
            if (!z3 && !z4) {
                z = false;
            }
        }
        fuzVar.c(z);
    }

    public final void I(List list) {
        this.h.post(new br(this, list, 14, (char[]) null));
    }

    public final void J(fsm fsmVar) {
        w(fsmVar);
        fqh fqhVar = fsmVar.b;
        fqhVar.n(this.an);
        if (ad()) {
            Y(fqhVar);
        }
    }

    public final void L(int i) {
        fqh fqhVar;
        gzj.aS();
        if (ftj.a) {
            hashCode();
        }
        synchronized (this) {
            fqhVar = (fqh) this.b.remove(i);
        }
        this.f.n(i);
        fuz fuzVar = this.N;
        fuzVar.c(fuzVar.g(i));
        this.h.post(new dhr((Object) this, (Object) fqhVar, 19, (short[]) null));
    }

    public final void M(int i, int i2) {
        gzj.aS();
        if (ftj.a) {
            hashCode();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add((fqh) this.b.remove(i));
            }
        }
        this.f.m(i, i2);
        fuz fuzVar = this.N;
        fuzVar.c(fuzVar.g(i));
        I(arrayList);
    }

    public final void N() {
        if (ftj.a) {
            hashCode();
        }
        RecyclerView recyclerView = this.C;
        Handler handler = this.h;
        if (recyclerView == null) {
            Runnable runnable = this.w;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        } else {
            Runnable runnable2 = this.w;
            handler.removeCallbacks(runnable2);
            this.C.removeCallbacks(runnable2);
            RecyclerView recyclerView2 = this.C;
            int i = bac.a;
            recyclerView2.postOnAnimation(runnable2);
        }
    }

    public final void O(int i) {
        if (this.J == null || this.ad) {
            return;
        }
        List list = this.b;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            fqh fqhVar = (fqh) list.get(i3);
            int iA = fqhVar.a();
            if ((!this.q || !this.y || !fqhVar.t()) && iA > i2) {
                i2 = iA;
            }
        }
        if (i2 != this.J.b) {
            int iMax = Math.max(this.e.a(View.MeasureSpec.getSize(this.ao), View.MeasureSpec.getSize(this.ap), i, i2), 1);
            this.J.b = i2;
            this.I = iMax;
        }
    }

    public final void P(RecyclerView recyclerView) {
        int decoratedTop;
        int paddingTop;
        int decoratedLeft;
        int paddingLeft;
        gzj.aS();
        frj frjVar = this.e;
        np npVarJ = frjVar.j();
        View viewFindViewByPosition = npVarJ.findViewByPosition(this.D);
        if (viewFindViewByPosition != null) {
            np npVarJ2 = frjVar.j();
            boolean reverseLayout = npVarJ2 instanceof LinearLayoutManager ? ((LinearLayoutManager) npVarJ2).getReverseLayout() : false;
            if (frjVar.i() == 0) {
                if (reverseLayout) {
                    decoratedLeft = recyclerView.getWidth() - npVarJ.getPaddingRight();
                    paddingLeft = npVarJ.getDecoratedRight(viewFindViewByPosition);
                } else {
                    decoratedLeft = npVarJ.getDecoratedLeft(viewFindViewByPosition);
                    paddingLeft = npVarJ.getPaddingLeft();
                }
                this.H = decoratedLeft - paddingLeft;
            } else {
                if (reverseLayout) {
                    decoratedTop = recyclerView.getHeight() - npVarJ.getPaddingBottom();
                    paddingTop = npVarJ.getDecoratedBottom(viewFindViewByPosition);
                } else {
                    decoratedTop = npVarJ.getDecoratedTop(viewFindViewByPosition);
                    paddingTop = npVarJ.getPaddingTop();
                }
                this.H = decoratedTop - paddingTop;
            }
        } else {
            this.H = 0;
        }
        fuz fuzVar = this.N;
        recyclerView.aE(fuzVar.d);
        if (recyclerView instanceof frm) {
            ((frm) recyclerView).af = null;
        } else if (recyclerView.getViewTreeObserver() != null) {
            recyclerView.getViewTreeObserver().removeOnPreDrawListener(this.ak);
        }
        C();
        recyclerView.ad(null);
        recyclerView.ah(null);
        fuw fuwVar = this.at;
        if (fuwVar != null) {
            synchronized (fuzVar) {
                List list = fuzVar.c;
                if (!list.isEmpty()) {
                    list.remove(fuwVar);
                }
            }
        }
        synchronized (this) {
            List list2 = this.b;
            int size = list2.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((fqh) list2.get(size)).e(this.l);
                }
            }
        }
        if (this.C == recyclerView) {
            this.C = null;
            ftr ftrVar = this.au;
            if (ftrVar != null) {
                ftl ftlVar = ftrVar.a;
                if (ftlVar == null) {
                    throw new IllegalStateException("SectionsRecyclerView has not been set yet.");
                }
                ftlVar.l.aE(ftrVar);
                ftrVar.b = null;
                ftrVar.a = null;
            }
            this.e.m(null);
            this.M.clear();
        }
    }

    public final void Q(int i, ftg ftgVar) {
        boolean zM;
        gzj.aS();
        if (ftj.a) {
            hashCode();
            ftgVar.s();
        }
        synchronized (this) {
            List list = this.b;
            if (list.isEmpty()) {
                int size = list.size();
                String strS = ftgVar.s();
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = this.am;
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    sb.append((String) arrayList.get(i2));
                    sb.append('\n');
                }
                throw new RuntimeException("Trying to update an item while the list of components is empty (index=" + i + ", size=" + size + "). This likely means data passed to the section had duplicates or a mutable data model. Component involved in the error whose backing data model may have duplicates: " + strS + ". Read more here: https://fblitho.com/docs/sections/best-practices/#avoiding-indexoutofboundsexception. Operations Info: " + sb.toString());
            }
            fqh fqhVar = (fqh) list.get(i);
            zM = fqhVar.d().m();
            if (ftgVar == null) {
                throw new RuntimeException("Received null RenderInfo to insert/update!");
            }
            this.Q.b(ftgVar);
            fqhVar.d();
            fqhVar.o(ftgVar);
        }
        if (zM || ftgVar.m()) {
            this.f.jX(i);
        }
        fuz fuzVar = this.N;
        fuzVar.c(fuzVar.e(i, 1));
    }

    public final void R(int i, List list) {
        gzj.aS();
        if (ftj.a) {
            String[] strArr = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                strArr[i2] = ((ftg) list.get(i2)).s();
            }
            hashCode();
            list.size();
            Arrays.toString(strArr);
        }
        list.size();
        synchronized (this) {
            try {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    int i4 = i + i3;
                    fqh fqhVar = (fqh) this.b.get(i4);
                    ftg ftgVar = (ftg) list.get(i3);
                    if (ftgVar == null) {
                        throw new RuntimeException("Received null RenderInfo to insert/update!");
                    }
                    if (ftgVar.m() || fqhVar.d().m()) {
                        this.f.jX(i4);
                    }
                    this.Q.b(ftgVar);
                    fqhVar.d();
                    fqhVar.o(ftgVar);
                }
            } catch (IndexOutOfBoundsException e) {
                String[] strArr2 = new String[list.size()];
                for (int i5 = 0; i5 < list.size(); i5++) {
                    strArr2[i5] = ((ftg) list.get(i5)).s();
                }
                throw new IndexOutOfBoundsException(('(' + hashCode() + ") updateRangeAt " + i + ", size: " + list.size() + ", names: " + Arrays.toString(strArr2)) + e.getMessage());
            }
        }
        fuz fuzVar = this.N;
        fuzVar.c(fuzVar.e(i, list.size()));
    }

    public final synchronized void U(boolean z, foi foiVar) {
        fsl fslVar = this.as;
        if (fslVar == null) {
            fslVar = new fsl();
            this.as = fslVar;
        }
        fslVar.b = z;
        fslVar.d = foiVar;
        this.ah.addLast(fslVar);
        this.ai.set(true);
        this.as = null;
    }

    public final void V(boolean z, foi foiVar) {
        boolean z2 = fna.a;
        if (ftj.a) {
            hashCode();
        }
        gzj.aS();
        if (this.L) {
            throw new RuntimeException("Trying to do a sync notifyChangeSetComplete when using asynchronous mutations!");
        }
        if (foiVar != null) {
            foiVar.a();
            this.v.addLast(foiVar);
        }
        C();
        if (z) {
            int i = fjs.a;
            F();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    final void W(int i, int i2, aero aeroVar) {
        omj omjVarQ;
        String strG;
        if (this.ad) {
            return;
        }
        boolean z = fna.a;
        int i3 = fjs.a;
        ?? r0 = aeroVar.b;
        int i4 = aeroVar.a;
        List<fqh> list = this.b;
        fst fstVar = new fst(r0, i4, list.size() - 1, this.t);
        if (!list.isEmpty()) {
            E(fstVar);
        }
        fqh fqhVar = (fqh) r0.get(i4);
        int iQ = q(fqhVar);
        int iP = p(fqhVar);
        fhd fhdVar = this.g;
        if (fhdVar.w() != null) {
            omjVarQ = fhdVar.w();
            strG = fhdVar.n();
        } else {
            omjVarQ = fqhVar.d().q();
            strG = fqhVar.d().g();
        }
        fkn fknVarBN = omjVarQ == null ? null : gzj.bN(omjVarQ, strG, omjVarQ.p(fhdVar, 20), fhdVar.e);
        try {
            fkw fkwVar = new fkw();
            fqhVar.i(fhdVar, iQ, iP, fkwVar);
            if (this.m) {
                Map map = this.r;
                fkw fkwVar2 = new fkw();
                int iMax = 0;
                for (fqh fqhVar2 : list) {
                    fqhVar2.i(fhdVar, 0, 0, fkwVar2);
                    iMax = Math.max(iMax, fkwVar2.b);
                    map.put(fqhVar2, Integer.valueOf(fkwVar2.b));
                }
                fkwVar.b = iMax;
            } else if (this.n) {
                fkwVar.b = list.isEmpty() ? 0 : s(fhdVar, (fqh) list.get(0)).b;
            }
            int iMax2 = Math.max(this.e.a(fkwVar.a, fkwVar.b, i, i2), 1);
            this.J = fkwVar;
            this.I = iMax2;
        } finally {
            if (fknVarBN != null) {
                omj.r(fknVarBN);
            }
        }
    }

    @Override // defpackage.fqv
    public final synchronized ComponentTree a(int i) {
        ComponentTree componentTreeB;
        fqh fqhVar = (fqh) this.b.get(i);
        int iQ = q(fqhVar);
        int iP = p(fqhVar);
        if (fqhVar.s(iQ, iP)) {
            componentTreeB = fqhVar.b();
        } else {
            fqhVar.i(this.g, iQ, iP, null);
            componentTreeB = fqhVar.b();
        }
        return componentTreeB;
    }

    @Override // defpackage.fpx
    public final void ag() {
        ArrayList arrayList;
        if (this.Z == null) {
            if (gzj.aT()) {
                K(this.b, this.r);
                return;
            }
            synchronized (this) {
                arrayList = new ArrayList(this.b);
            }
            I(arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ad A[Catch: all -> 0x0189, TryCatch #0 {, blocks: (B:33:0x0065, B:35:0x006b, B:37:0x0073, B:40:0x0079, B:42:0x0083, B:43:0x008f, B:51:0x00ad, B:53:0x00b8, B:54:0x00ba, B:56:0x00c5, B:57:0x00d1, B:59:0x00db, B:61:0x00e1, B:62:0x00e7, B:46:0x0094, B:48:0x009e, B:49:0x00aa, B:63:0x00f1, B:65:0x00fb, B:67:0x0101, B:68:0x010c, B:71:0x0114, B:73:0x0118, B:83:0x013d, B:84:0x0157, B:86:0x015d, B:87:0x0167, B:89:0x016b, B:90:0x016e, B:92:0x0172, B:93:0x0179, B:74:0x0120, B:77:0x0125, B:79:0x012f, B:81:0x0133, B:82:0x013b), top: B:109:0x0065, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b8 A[Catch: all -> 0x0189, TryCatch #0 {, blocks: (B:33:0x0065, B:35:0x006b, B:37:0x0073, B:40:0x0079, B:42:0x0083, B:43:0x008f, B:51:0x00ad, B:53:0x00b8, B:54:0x00ba, B:56:0x00c5, B:57:0x00d1, B:59:0x00db, B:61:0x00e1, B:62:0x00e7, B:46:0x0094, B:48:0x009e, B:49:0x00aa, B:63:0x00f1, B:65:0x00fb, B:67:0x0101, B:68:0x010c, B:71:0x0114, B:73:0x0118, B:83:0x013d, B:84:0x0157, B:86:0x015d, B:87:0x0167, B:89:0x016b, B:90:0x016e, B:92:0x0172, B:93:0x0179, B:74:0x0120, B:77:0x0125, B:79:0x012f, B:81:0x0133, B:82:0x013b), top: B:109:0x0065, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c5 A[Catch: all -> 0x0189, LOOP:0: B:55:0x00c3->B:56:0x00c5, LOOP_END, TryCatch #0 {, blocks: (B:33:0x0065, B:35:0x006b, B:37:0x0073, B:40:0x0079, B:42:0x0083, B:43:0x008f, B:51:0x00ad, B:53:0x00b8, B:54:0x00ba, B:56:0x00c5, B:57:0x00d1, B:59:0x00db, B:61:0x00e1, B:62:0x00e7, B:46:0x0094, B:48:0x009e, B:49:0x00aa, B:63:0x00f1, B:65:0x00fb, B:67:0x0101, B:68:0x010c, B:71:0x0114, B:73:0x0118, B:83:0x013d, B:84:0x0157, B:86:0x015d, B:87:0x0167, B:89:0x016b, B:90:0x016e, B:92:0x0172, B:93:0x0179, B:74:0x0120, B:77:0x0125, B:79:0x012f, B:81:0x0133, B:82:0x013b), top: B:109:0x0065, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e7 A[Catch: all -> 0x0189, TryCatch #0 {, blocks: (B:33:0x0065, B:35:0x006b, B:37:0x0073, B:40:0x0079, B:42:0x0083, B:43:0x008f, B:51:0x00ad, B:53:0x00b8, B:54:0x00ba, B:56:0x00c5, B:57:0x00d1, B:59:0x00db, B:61:0x00e1, B:62:0x00e7, B:46:0x0094, B:48:0x009e, B:49:0x00aa, B:63:0x00f1, B:65:0x00fb, B:67:0x0101, B:68:0x010c, B:71:0x0114, B:73:0x0118, B:83:0x013d, B:84:0x0157, B:86:0x015d, B:87:0x0167, B:89:0x016b, B:90:0x016e, B:92:0x0172, B:93:0x0179, B:74:0x0120, B:77:0x0125, B:79:0x012f, B:81:0x0133, B:82:0x013b), top: B:109:0x0065, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00fb A[Catch: all -> 0x0189, TryCatch #0 {, blocks: (B:33:0x0065, B:35:0x006b, B:37:0x0073, B:40:0x0079, B:42:0x0083, B:43:0x008f, B:51:0x00ad, B:53:0x00b8, B:54:0x00ba, B:56:0x00c5, B:57:0x00d1, B:59:0x00db, B:61:0x00e1, B:62:0x00e7, B:46:0x0094, B:48:0x009e, B:49:0x00aa, B:63:0x00f1, B:65:0x00fb, B:67:0x0101, B:68:0x010c, B:71:0x0114, B:73:0x0118, B:83:0x013d, B:84:0x0157, B:86:0x015d, B:87:0x0167, B:89:0x016b, B:90:0x016e, B:92:0x0172, B:93:0x0179, B:74:0x0120, B:77:0x0125, B:79:0x012f, B:81:0x0133, B:82:0x013b), top: B:109:0x0065, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    /* JADX WARN: Code duplicated, block: B:71:0x0114 A[Catch: all -> 0x0189, TryCatch #0 {, blocks: (B:33:0x0065, B:35:0x006b, B:37:0x0073, B:40:0x0079, B:42:0x0083, B:43:0x008f, B:51:0x00ad, B:53:0x00b8, B:54:0x00ba, B:56:0x00c5, B:57:0x00d1, B:59:0x00db, B:61:0x00e1, B:62:0x00e7, B:46:0x0094, B:48:0x009e, B:49:0x00aa, B:63:0x00f1, B:65:0x00fb, B:67:0x0101, B:68:0x010c, B:71:0x0114, B:73:0x0118, B:83:0x013d, B:84:0x0157, B:86:0x015d, B:87:0x0167, B:89:0x016b, B:90:0x016e, B:92:0x0172, B:93:0x0179, B:74:0x0120, B:77:0x0125, B:79:0x012f, B:81:0x0133, B:82:0x013b), top: B:109:0x0065, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0120 A[Catch: all -> 0x0189, TryCatch #0 {, blocks: (B:33:0x0065, B:35:0x006b, B:37:0x0073, B:40:0x0079, B:42:0x0083, B:43:0x008f, B:51:0x00ad, B:53:0x00b8, B:54:0x00ba, B:56:0x00c5, B:57:0x00d1, B:59:0x00db, B:61:0x00e1, B:62:0x00e7, B:46:0x0094, B:48:0x009e, B:49:0x00aa, B:63:0x00f1, B:65:0x00fb, B:67:0x0101, B:68:0x010c, B:71:0x0114, B:73:0x0118, B:83:0x013d, B:84:0x0157, B:86:0x015d, B:87:0x0167, B:89:0x016b, B:90:0x016e, B:92:0x0172, B:93:0x0179, B:74:0x0120, B:77:0x0125, B:79:0x012f, B:81:0x0133, B:82:0x013b), top: B:109:0x0065, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0124  */
    /* JADX WARN: Code duplicated, block: B:78:0x012d  */
    /* JADX WARN: Code duplicated, block: B:79:0x012f A[Catch: all -> 0x0189, TryCatch #0 {, blocks: (B:33:0x0065, B:35:0x006b, B:37:0x0073, B:40:0x0079, B:42:0x0083, B:43:0x008f, B:51:0x00ad, B:53:0x00b8, B:54:0x00ba, B:56:0x00c5, B:57:0x00d1, B:59:0x00db, B:61:0x00e1, B:62:0x00e7, B:46:0x0094, B:48:0x009e, B:49:0x00aa, B:63:0x00f1, B:65:0x00fb, B:67:0x0101, B:68:0x010c, B:71:0x0114, B:73:0x0118, B:83:0x013d, B:84:0x0157, B:86:0x015d, B:87:0x0167, B:89:0x016b, B:90:0x016e, B:92:0x0172, B:93:0x0179, B:74:0x0120, B:77:0x0125, B:79:0x012f, B:81:0x0133, B:82:0x013b), top: B:109:0x0065, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x013b A[Catch: all -> 0x0189, TryCatch #0 {, blocks: (B:33:0x0065, B:35:0x006b, B:37:0x0073, B:40:0x0079, B:42:0x0083, B:43:0x008f, B:51:0x00ad, B:53:0x00b8, B:54:0x00ba, B:56:0x00c5, B:57:0x00d1, B:59:0x00db, B:61:0x00e1, B:62:0x00e7, B:46:0x0094, B:48:0x009e, B:49:0x00aa, B:63:0x00f1, B:65:0x00fb, B:67:0x0101, B:68:0x010c, B:71:0x0114, B:73:0x0118, B:83:0x013d, B:84:0x0157, B:86:0x015d, B:87:0x0167, B:89:0x016b, B:90:0x016e, B:92:0x0172, B:93:0x0179, B:74:0x0120, B:77:0x0125, B:79:0x012f, B:81:0x0133, B:82:0x013b), top: B:109:0x0065, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x015d A[Catch: all -> 0x0189, LOOP:1: B:84:0x0157->B:86:0x015d, LOOP_END, TryCatch #0 {, blocks: (B:33:0x0065, B:35:0x006b, B:37:0x0073, B:40:0x0079, B:42:0x0083, B:43:0x008f, B:51:0x00ad, B:53:0x00b8, B:54:0x00ba, B:56:0x00c5, B:57:0x00d1, B:59:0x00db, B:61:0x00e1, B:62:0x00e7, B:46:0x0094, B:48:0x009e, B:49:0x00aa, B:63:0x00f1, B:65:0x00fb, B:67:0x0101, B:68:0x010c, B:71:0x0114, B:73:0x0118, B:83:0x013d, B:84:0x0157, B:86:0x015d, B:87:0x0167, B:89:0x016b, B:90:0x016e, B:92:0x0172, B:93:0x0179, B:74:0x0120, B:77:0x0125, B:79:0x012f, B:81:0x0133, B:82:0x013b), top: B:109:0x0065, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x016b A[Catch: all -> 0x0189, TryCatch #0 {, blocks: (B:33:0x0065, B:35:0x006b, B:37:0x0073, B:40:0x0079, B:42:0x0083, B:43:0x008f, B:51:0x00ad, B:53:0x00b8, B:54:0x00ba, B:56:0x00c5, B:57:0x00d1, B:59:0x00db, B:61:0x00e1, B:62:0x00e7, B:46:0x0094, B:48:0x009e, B:49:0x00aa, B:63:0x00f1, B:65:0x00fb, B:67:0x0101, B:68:0x010c, B:71:0x0114, B:73:0x0118, B:83:0x013d, B:84:0x0157, B:86:0x015d, B:87:0x0167, B:89:0x016b, B:90:0x016e, B:92:0x0172, B:93:0x0179, B:74:0x0120, B:77:0x0125, B:79:0x012f, B:81:0x0133, B:82:0x013b), top: B:109:0x0065, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0172 A[Catch: all -> 0x0189, TryCatch #0 {, blocks: (B:33:0x0065, B:35:0x006b, B:37:0x0073, B:40:0x0079, B:42:0x0083, B:43:0x008f, B:51:0x00ad, B:53:0x00b8, B:54:0x00ba, B:56:0x00c5, B:57:0x00d1, B:59:0x00db, B:61:0x00e1, B:62:0x00e7, B:46:0x0094, B:48:0x009e, B:49:0x00aa, B:63:0x00f1, B:65:0x00fb, B:67:0x0101, B:68:0x010c, B:71:0x0114, B:73:0x0118, B:83:0x013d, B:84:0x0157, B:86:0x015d, B:87:0x0167, B:89:0x016b, B:90:0x016e, B:92:0x0172, B:93:0x0179, B:74:0x0120, B:77:0x0125, B:79:0x012f, B:81:0x0133, B:82:0x013b), top: B:109:0x0065, outer: #1 }] */
    @Override // defpackage.fpx
    public final void ah(fkw fkwVar, int i, int i2, fip fipVar) {
        Iterator it;
        fsl fslVar;
        boolean z;
        aero aeroVarAf;
        List list;
        int size;
        int i3;
        int i4 = this.e.i();
        boolean z2 = fipVar != null;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new UnsupportedOperationException("The orientation defined by LayoutInfo should be either OrientationHelper.HORIZONTAL or OrientationHelper.VERTICAL");
            }
            if (View.MeasureSpec.getMode(i2) == 0) {
                throw new IllegalStateException("Height mode has to be EXACTLY OR AT MOST for a vertical scrolling RecyclerView");
            }
            if (!z2 && View.MeasureSpec.getMode(i) == 0) {
                throw new IllegalStateException("Can't use Unspecified width on a vertical scrolling Recycler if dynamic measurement is not allowed");
            }
        } else {
            if (View.MeasureSpec.getMode(i) == 0) {
                throw new IllegalStateException("Width mode has to be EXACTLY OR AT MOST for an horizontal scrolling RecyclerView");
            }
            if (!z2 && View.MeasureSpec.getMode(i2) == 0) {
                throw new IllegalStateException("Can't use Unspecified height on an horizontal scrolling Recycler if dynamic measurement is not allowed");
            }
        }
        boolean zT = T(i, i2, i4, z2);
        if (this.ad && zT) {
            throw new RuntimeException("Cannot use manual estimated viewport count when the RecyclerBinder needs an item to determine its size!");
        }
        this.aj.set(true);
        try {
            synchronized (this) {
                if (this.ao == -1 || this.X.get()) {
                    this.ao = i;
                    this.ap = i2;
                    if (!ac() && (aeroVarAf = af()) != null) {
                        W(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2), aeroVarAf);
                    }
                    fkw fkwVarX = X(i, i2, z2);
                    if (i4 != 1) {
                        if (zT || this.J != null) {
                            z = this.y;
                            if (!z) {
                                fipVar = null;
                            }
                            this.K = fipVar;
                            this.X.set(z);
                        } else {
                            this.K = fipVar;
                            this.X.set(true);
                        }
                    } else if (zT || this.J != null) {
                        this.K = null;
                    } else {
                        this.K = fipVar;
                        this.X.set(true);
                    }
                    int i5 = fkwVarX.a;
                    fkwVar.a = i5;
                    int i6 = fkwVarX.b;
                    fkwVar.b = i6;
                    this.B = new fkw(i5, i6);
                    this.j.set(true);
                    it = this.ah.iterator();
                    while (it.hasNext()) {
                        ab((fsl) it.next());
                    }
                    fslVar = this.as;
                    if (fslVar != null) {
                        ab(fslVar);
                    }
                    if (this.I != -1) {
                        Z(this.D, this.E);
                    }
                } else {
                    fkw fkwVar2 = this.B;
                    if (i4 != 1) {
                        if (fkwVar2 == null || !gzj.aY(this.ap, i2, fkwVar2.b)) {
                            this.j.set(false);
                            boolean z3 = fna.a;
                            if (!this.ad) {
                                this.I = -1;
                            }
                            this.J = null;
                            list = this.b;
                            size = list.size();
                            for (i3 = 0; i3 < size; i3++) {
                                ((fqh) list.get(i3)).j();
                            }
                            if (Looper.myLooper() == Looper.getMainLooper() || ae()) {
                                Handler handler = this.h;
                                Runnable runnable = this.al;
                                handler.removeCallbacks(runnable);
                                handler.post(runnable);
                            } else {
                                this.f.jW();
                            }
                            this.ao = i;
                            this.ap = i2;
                            if (!ac()) {
                                W(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2), aeroVarAf);
                            }
                            fkw fkwVarX2 = X(i, i2, z2);
                            if (i4 != 1) {
                                if (zT) {
                                    z = this.y;
                                    if (!z) {
                                        fipVar = null;
                                    }
                                    this.K = fipVar;
                                    this.X.set(z);
                                } else {
                                    z = this.y;
                                    if (!z) {
                                        fipVar = null;
                                    }
                                    this.K = fipVar;
                                    this.X.set(z);
                                }
                            } else if (zT) {
                                this.K = null;
                            } else {
                                this.K = null;
                            }
                            int i7 = fkwVarX2.a;
                            fkwVar.a = i7;
                            int i8 = fkwVarX2.b;
                            fkwVar.b = i8;
                            this.B = new fkw(i7, i8);
                            this.j.set(true);
                            it = this.ah.iterator();
                            while (it.hasNext()) {
                                ab((fsl) it.next());
                            }
                            fslVar = this.as;
                            if (fslVar != null) {
                                ab(fslVar);
                            }
                            if (this.I != -1) {
                                Z(this.D, this.E);
                            }
                        } else {
                            fkwVar.a = View.MeasureSpec.getSize(i);
                            fkwVar.b = this.B.b;
                        }
                    } else if (fkwVar2 == null || !gzj.aY(this.ao, i, fkwVar2.a)) {
                        this.j.set(false);
                        boolean z4 = fna.a;
                        if (!this.ad) {
                            this.I = -1;
                        }
                        this.J = null;
                        list = this.b;
                        size = list.size();
                        while (i3 < size) {
                            ((fqh) list.get(i3)).j();
                        }
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            Handler handler2 = this.h;
                            Runnable runnable2 = this.al;
                            handler2.removeCallbacks(runnable2);
                            handler2.post(runnable2);
                        } else {
                            Handler handler3 = this.h;
                            Runnable runnable3 = this.al;
                            handler3.removeCallbacks(runnable3);
                            handler3.post(runnable3);
                        }
                        this.ao = i;
                        this.ap = i2;
                        if (!ac()) {
                            W(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2), aeroVarAf);
                        }
                        fkw fkwVarX3 = X(i, i2, z2);
                        if (i4 != 1) {
                            if (zT) {
                                z = this.y;
                                if (!z) {
                                    fipVar = null;
                                }
                                this.K = fipVar;
                                this.X.set(z);
                            } else {
                                z = this.y;
                                if (!z) {
                                    fipVar = null;
                                }
                                this.K = fipVar;
                                this.X.set(z);
                            }
                        } else if (zT) {
                            this.K = null;
                        } else {
                            this.K = null;
                        }
                        int i9 = fkwVarX3.a;
                        fkwVar.a = i9;
                        int i10 = fkwVarX3.b;
                        fkwVar.b = i10;
                        this.B = new fkw(i9, i10);
                        this.j.set(true);
                        it = this.ah.iterator();
                        while (it.hasNext()) {
                            ab((fsl) it.next());
                        }
                        fslVar = this.as;
                        if (fslVar != null) {
                            ab(fslVar);
                        }
                        if (this.I != -1) {
                            Z(this.D, this.E);
                        }
                    } else {
                        fkwVar.a = this.B.a;
                        fkwVar.b = View.MeasureSpec.getSize(i2);
                    }
                }
            }
            this.aj.set(false);
            if (this.L) {
                aa();
            }
        } catch (Throwable th) {
            this.aj.set(false);
            if (this.L) {
                aa();
            }
            throw th;
        }
    }

    @Override // defpackage.fpx
    public final /* bridge */ /* synthetic */ void ai(ViewGroup viewGroup) {
        throw null;
    }

    @Override // defpackage.fpx
    public final synchronized void aj(int i, int i2) {
        boolean zAY;
        if (this.ao != -1) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            if (this.B != null) {
                int i3 = this.e.i();
                int i4 = this.ao;
                if (i4 != -1) {
                    if (i3 == 0) {
                        zAY = gzj.aY(this.ap, iMakeMeasureSpec2, this.B.b);
                    } else if (i3 == 1) {
                        zAY = gzj.aY(i4, iMakeMeasureSpec, this.B.a);
                    }
                    if (zAY) {
                        return;
                    }
                }
            }
        }
        ah(V, View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824), this.K);
    }

    @Override // defpackage.fux
    public final int b() {
        throw null;
    }

    @Override // defpackage.fux
    public final int c() {
        throw null;
    }

    @Override // defpackage.fux
    public final int d() {
        throw null;
    }

    @Override // defpackage.fux
    public final int e() {
        throw null;
    }

    @Override // defpackage.fqv
    public final boolean f(int i) {
        return g(i) && ((fqh) this.b.get(i)).d().k();
    }

    @Override // defpackage.fqv
    public final boolean g(int i) {
        return i >= 0 && i < this.b.size();
    }

    @Override // defpackage.fux
    public final int h() {
        return this.f.a();
    }

    @Override // defpackage.fpx
    public final /* bridge */ /* synthetic */ void i(ViewGroup viewGroup) {
        throw null;
    }

    @Override // defpackage.fpx
    public final boolean j() {
        throw null;
    }

    @Override // defpackage.frh
    public final synchronized ftg n(int i) {
        gzj.aS();
        return ((fqh) this.b.get(i)).d();
    }

    public final int p(fqh fqhVar) {
        if (this.m || this.n) {
            fkw fkwVar = this.J;
            frj frjVar = this.e;
            return fkwVar == null ? frjVar.f(this.ap, fqhVar.d()) : frjVar.f(View.MeasureSpec.makeMeasureSpec(this.J.b, 1073741824), fqhVar.d());
        }
        if (this.y) {
            return 0;
        }
        boolean zAd = ad();
        frj frjVar2 = this.e;
        return zAd ? frjVar2.f(View.MeasureSpec.makeMeasureSpec(this.B.b, 1073741824), fqhVar.d()) : frjVar2.f(this.ap, fqhVar.d());
    }

    public final int q(fqh fqhVar) {
        boolean zAd = ad();
        frj frjVar = this.e;
        return zAd ? frjVar.g(View.MeasureSpec.makeMeasureSpec(this.B.a, 1073741824), fqhVar.d()) : frjVar.g(this.ao, fqhVar.d());
    }

    public final int r() {
        if (this.J == null) {
            return -1;
        }
        int i = this.e.i();
        fkw fkwVar = this.J;
        return i == 0 ? fkwVar.b : fkwVar.a;
    }

    public final fqh t(ftg ftgVar) {
        int i = fqh.f;
        fqf fqfVar = new fqf();
        if (ftgVar == null) {
            ftgVar = fqe.r();
        }
        fjl fjlVar = this.Z;
        boolean z = this.ae;
        boolean z2 = this.ac;
        boolean z3 = this.ab;
        boolean z4 = this.Y;
        boolean z5 = this.p;
        fna fnaVar = this.ag;
        qcb qcbVar = this.aw;
        fqfVar.a = ftgVar;
        fqfVar.j = qcbVar;
        fqfVar.b = fnaVar;
        fqfVar.c = z5;
        fqfVar.g = z4;
        fqfVar.e = z3;
        fqfVar.d = z2;
        fqfVar.f = z;
        fqfVar.h = fjlVar;
        if (fqfVar.a != null) {
            return new fqh(fqfVar);
        }
        throw new IllegalArgumentException("A RenderInfo must be specified to create a ComponentTreeHolder");
    }

    public final synchronized fqh u(int i) {
        gzj.aS();
        return (fqh) this.b.get(i);
    }

    public final fsm v(int i, ftg ftgVar) {
        fqh fqhVarT = t(ftgVar);
        fqhVarT.l(false);
        return new fsm(i, fqhVarT);
    }

    public final void w(fsn fsnVar) {
        fsl fslVar = this.as;
        if (fslVar == null) {
            fslVar = new fsl();
            this.as = fslVar;
        }
        fslVar.a.add(fsnVar);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f6 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:5:0x000f, B:7:0x0017, B:9:0x001f, B:11:0x0027, B:15:0x0033, B:17:0x004c, B:19:0x0052, B:22:0x0059, B:29:0x0081, B:31:0x00c3, B:32:0x00ce, B:25:0x006d, B:28:0x0073, B:30:0x00b2, B:33:0x00cf, B:35:0x00de, B:42:0x00f0, B:44:0x00f6, B:45:0x00fb, B:48:0x0108, B:73:0x0191, B:76:0x01a6, B:80:0x01aa, B:49:0x0109, B:51:0x0112, B:60:0x0127, B:71:0x018d, B:61:0x0131, B:62:0x013b, B:63:0x0143, B:64:0x014d, B:65:0x0157, B:67:0x0161, B:69:0x0165, B:70:0x016a, B:72:0x0190, B:36:0x00df, B:38:0x00e7, B:39:0x00ec, B:46:0x00fc, B:47:0x0107), top: B:90:0x000f, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00fb A[Catch: all -> 0x01b2, TRY_LEAVE, TryCatch #0 {all -> 0x01b2, blocks: (B:5:0x000f, B:7:0x0017, B:9:0x001f, B:11:0x0027, B:15:0x0033, B:17:0x004c, B:19:0x0052, B:22:0x0059, B:29:0x0081, B:31:0x00c3, B:32:0x00ce, B:25:0x006d, B:28:0x0073, B:30:0x00b2, B:33:0x00cf, B:35:0x00de, B:42:0x00f0, B:44:0x00f6, B:45:0x00fb, B:48:0x0108, B:73:0x0191, B:76:0x01a6, B:80:0x01aa, B:49:0x0109, B:51:0x0112, B:60:0x0127, B:71:0x018d, B:61:0x0131, B:62:0x013b, B:63:0x0143, B:64:0x014d, B:65:0x0157, B:67:0x0161, B:69:0x0165, B:70:0x016a, B:72:0x0190, B:36:0x00df, B:38:0x00e7, B:39:0x00ec, B:46:0x00fc, B:47:0x0107), top: B:90:0x000f, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01b5  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        monitor-enter(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0109, code lost:
    
        r0 = r1.a;
        r3 = r0.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0110, code lost:
    
        if (r6 >= r3) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0112, code lost:
    
        r7 = (defpackage.fsn) r0.get(r6);
        r8 = r7.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011a, code lost:
    
        if (r8 == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011c, code lost:
    
        if (r8 == 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011f, code lost:
    
        if (r8 == 2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0122, code lost:
    
        if (r8 == 3) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0125, code lost:
    
        if (r8 == 4) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0127, code lost:
    
        r7 = (defpackage.fsp) r7;
        H(r7.b, r7.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0131, code lost:
    
        r7 = (defpackage.fsp) r7;
        M(r7.a, r7.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013b, code lost:
    
        L(((defpackage.fso) r7).a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0143, code lost:
    
        r7 = (defpackage.fsq) r7;
        R(r7.a, r7.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014d, code lost:
    
        r7 = (defpackage.fsq) r7;
        Q(r7.a, r7.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0157, code lost:
    
        r7 = (defpackage.fsm) r7;
        r8 = r7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015f, code lost:
    
        if (r8.q() != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0163, code lost:
    
        if (defpackage.ftj.a == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0165, code lost:
    
        hashCode();
        r9 = r7.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x016a, code lost:
    
        r11.Q.b(r8.d());
        r9 = r11.b;
        r7 = r7.a;
        r9.add(r7, r8);
        r8.l(true);
        r11.f.h(r7);
        r8 = r11.N;
        r8.c(r8.f(r7, r11.I));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018d, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0190, code lost:
    
        monitor-exit(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0191, code lost:
    
        r1.d.a();
        r11.v.addLast(r1.d);
        C();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [ftg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(int r12) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsy.x(int):void");
    }

    public final void y() {
        if (fna.a || fna.d) {
            long id = Thread.currentThread().getId();
            long andSet = this.s.getAndSet(id);
            if (id == andSet || andSet == -1) {
                return;
            }
            throw new IllegalStateException("Multiple threads applying change sets at once! (" + andSet + " and " + id + ')');
        }
    }

    public final void z() {
        if (gzj.aT()) {
            this.v.clear();
        } else {
            this.h.post(new px(this, 18));
        }
    }

    @Override // defpackage.fpx
    public final /* bridge */ /* synthetic */ void k() {
    }

    @Override // defpackage.fpx
    public final /* bridge */ /* synthetic */ void l() {
    }

    @Override // defpackage.fpx
    public final void m() {
    }
}
