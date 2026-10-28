package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Parcelable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.libraries.elements.converters.layout.FlowLayoutManager;
import com.google.android.libraries.elements.interfaces.BlockRegistryProvider;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aebp implements advy {
    private static final AtomicInteger i = new AtomicInteger(0);
    private static final AtomicInteger j = new AtomicInteger(0);
    public final aebh a;
    public final fsy b;
    public final admo c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    private final aebl k;
    private final awmd l;
    private final ViewTreeObserver.OnPreDrawListener m;
    private final View.OnLayoutChangeListener n;
    private boolean q;
    private boolean r;
    private ViewTreeObserver.OnDrawListener s;
    private View.OnAttachStateChangeListener t;
    private final aecs u;
    private final nqt v;
    private avmn w;
    private final lqa x;
    private int o = 0;
    private int p = 0;
    public final Map h = new HashMap();

    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, java.util.Map] */
    public aebp(aebh aebhVar, RecyclerView recyclerView, admo admoVar, mlo mloVar, xgn xgnVar, ntx ntxVar, ntu ntuVar, afip afipVar, awmd awmdVar, awmd awmdVar2, aecs aecsVar, adwq adwqVar) {
        mhc mhcVar;
        mhe mheVar;
        int i2;
        recyclerView.getContext();
        ntuVar.f();
        this.a = aebhVar;
        this.c = admoVar;
        this.l = awmdVar2;
        this.u = aecsVar;
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams != null && layoutParams.height != -2 && layoutParams.width != -2) {
            recyclerView.r = true;
        }
        ntuVar.b();
        this.v = ntuVar.b().a();
        recyclerView.ag(0);
        if (aebhVar.w.l(394, 45763000L, false)) {
            this.x = new lqa((byte[]) null, (byte[]) null, (char[]) null);
        } else {
            this.x = null;
        }
        Context context = recyclerView.getContext();
        while (context instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if ((context instanceof Activity) || (context instanceof Application)) {
                break;
            } else {
                context = contextWrapper.getBaseContext();
            }
        }
        fhd fhdVar = new fhd(context, "LithoRVSLCBinder", new omj(ntuVar.c()), null);
        fof fofVar = new fof(fhdVar);
        fss fssVar = new fss();
        aebh aebhVar2 = this.a;
        fssVar.i = aebhVar2.a;
        fssVar.j = aebhVar2.g;
        np npVar = recyclerView.n;
        if (npVar instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) npVar;
            fssVar.b = new fqu(gridLayoutManager, gridLayoutManager.g);
        } else if (npVar instanceof FlowLayoutManager) {
            FlowLayoutManager flowLayoutManager = (FlowLayoutManager) npVar;
            lqa lqaVar = this.x;
            fssVar.b = new mos(flowLayoutManager, lqaVar != null ? DesugarCollections.unmodifiableMap(lqaVar.a) : null);
        } else if (npVar instanceof LinearLayoutManager) {
            fssVar.b = new aebd((LinearLayoutManager) npVar, recyclerView.getLayoutParams());
        }
        fssVar.r = new aebn(this.c, this.l);
        fssVar.f = 200000;
        fssVar.o = !this.a.o;
        fssVar.g = false;
        Context context2 = recyclerView.getContext();
        aebh aebhVar3 = this.a;
        float f = aebhVar3.c;
        float fA = (float) aebhVar3.w.a(1, 45641096L, 0.0d);
        float fA2 = (float) this.a.w.a(2, 45641097L, 0.0d);
        float fA3 = (float) this.a.w.a(3, 45641098L, 0.0d);
        int iC = (int) this.a.w.c(31, 45641998L, 0L);
        int iC2 = (int) this.a.w.c(32, 45641999L, 0L);
        if (fA <= 0.0f || fA2 <= 0.0f || fA3 <= 0.0f || iC <= 0 || iC2 <= 0) {
            fhdVar = fhdVar;
        } else {
            AtomicInteger atomicInteger = i;
            int iA = atomicInteger.get();
            if (iA == 0) {
                iA = fnc.a();
                atomicInteger.set(iA);
            }
            AtomicInteger atomicInteger2 = j;
            int i3 = atomicInteger2.get();
            if (i3 == 0) {
                ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
                if (activityManager == null) {
                    i2 = 0;
                } else {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    i2 = (int) (memoryInfo.totalMem / 1048576);
                }
                atomicInteger2.set(i2);
                i3 = i2;
            } else {
                fhdVar = fhdVar;
            }
            f = (iA <= iC || i3 <= iC2) ? iA > iC ? fA2 : fA : fA3;
        }
        fssVar.a = f;
        Object[] objArr = {new agfm()};
        aguu.j(objArr, 1);
        fssVar.h = new agpi(objArr, 1);
        int i4 = this.a.b;
        if (i4 > 0) {
            fssVar.b(i4);
        }
        fssVar.u = new abgn(this);
        fsy fsyVarA = fssVar.a(fhdVar);
        this.b = fsyVarA;
        boolean z = aebhVar.n;
        boolean z2 = aebhVar.t;
        if (aebhVar.h) {
            mheVar = aebhVar.l ? new mhe(z, z2) : new mhe(recyclerView, false, false, z2);
            mhcVar = null;
        } else {
            mhcVar = aebhVar.i ? new mhc(!aebhVar.m, z, z2) : null;
            mheVar = null;
        }
        nwj nwjVar = (nwj) awmdVar.io();
        recyclerView.aC(new aebe(nwjVar));
        this.s = new aebf(nwjVar, recyclerView);
        ComponentCallbacks2 componentCallbacks2T = a.t(recyclerView);
        if (componentCallbacks2T != null) {
            if (componentCallbacks2T instanceof cf) {
                dd supportFragmentManager = ((cf) componentCallbacks2T).getSupportFragmentManager();
                ((CopyOnWriteArrayList) supportFragmentManager.D.b).add(new ci(new ahsx(nwjVar, recyclerView, supportFragmentManager), (char[]) null));
            } else if (componentCallbacks2T instanceof bog) {
                boc lifecycle = ((bog) componentCallbacks2T).getLifecycle();
                lifecycle.b(new aebg(nwjVar, recyclerView, lifecycle));
            }
        }
        this.v.c(recyclerView);
        this.k = new aebl(fofVar, fsyVarA, admoVar, mloVar, xgnVar, aebhVar.a, aebhVar.j, ntxVar, aebhVar.f, ntuVar, afipVar, aebhVar.d, aebhVar.e, mhcVar, mheVar, nwjVar, aecsVar, adwqVar, this.v, this.x, aebhVar.r, aebhVar.s, aebhVar.u, aebhVar.v);
        this.m = new aebm(this, recyclerView, 0);
        this.n = new hbp(this, 4);
    }

    static BlockRegistryProvider c(adwq adwqVar) {
        agfr agfrVar;
        if (adwqVar == null || (agfrVar = adwqVar.b) == null) {
            return null;
        }
        return new acxj(agfrVar);
    }

    static String d(adwq adwqVar) {
        maw mawVar;
        if (adwqVar == null || (mawVar = adwqVar.a) == null) {
            return null;
        }
        return mawVar.a();
    }

    private final void j() {
        avmn avmnVar = this.w;
        if (avmnVar != null) {
            avmnVar.dispose();
            this.w = null;
        }
        this.e = 0;
    }

    @Override // defpackage.advy
    public final void a(RecyclerView recyclerView) {
        aecs aecsVar;
        j();
        aebh aebhVar = this.a;
        if (aebhVar.q && (aecsVar = this.u) != null) {
            Optional optionalB = aecsVar.b();
            adha adhaVar = new adha(this, 8);
            if (true == optionalB.isPresent()) {
                optionalB = Optional.ofNullable(((avlr) optionalB.get()).af(new acym(adhaVar.a, 7)));
            }
            this.w = (avmn) optionalB.orElse(new avmq(avoi.b));
        }
        aebl aeblVar = this.k;
        if (aeblVar.i) {
            aeblVar.o(0, aeblVar.a.h());
        } else {
            avmm avmmVar = aeblVar.d;
            if (avmmVar != null) {
                avmmVar.dispose();
            }
            aeblVar.d = new avmm();
        }
        if (!this.q) {
            this.c.x(aeblVar);
            this.q = true;
        }
        if (aebhVar.p) {
            g(recyclerView);
            aeblVar.fQ();
        } else {
            aeblVar.fQ();
            g(recyclerView);
        }
        this.t = new jld(this, 3);
        e(recyclerView);
        recyclerView.addOnLayoutChangeListener(this.n);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.advy
    public final void b(RecyclerView recyclerView) {
        lqa lqaVar;
        h(recyclerView);
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.t;
        if (onAttachStateChangeListener != null) {
            recyclerView.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        recyclerView.removeOnLayoutChangeListener(this.n);
        if (this.q) {
            this.c.y(this.k);
            this.q = false;
        }
        i(recyclerView);
        j();
        aebl aeblVar = this.k;
        if (aeblVar.i) {
            aeblVar.o(0, aeblVar.a.h());
        } else {
            avmm avmmVar = aeblVar.d;
            if (avmmVar != null) {
                avmmVar.dispose();
            }
        }
        aeblVar.m();
        if (aeblVar.h && (lqaVar = aeblVar.l) != null) {
            lqaVar.a.clear();
        }
        if (this.a.k) {
            this.h.clear();
        }
        this.p = 0;
        this.o = 0;
    }

    public final void e(RecyclerView recyclerView) {
        if (this.r) {
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.m;
        if (onPreDrawListener != null) {
            recyclerView.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
        }
        if (this.s != null) {
            recyclerView.getViewTreeObserver().addOnDrawListener(this.s);
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.t;
        if (onAttachStateChangeListener != null) {
            recyclerView.addOnAttachStateChangeListener(onAttachStateChangeListener);
        }
        this.r = true;
    }

    public final void f() {
        nye nyeVar;
        avmn avmnVar;
        fsy fsyVar = this.b;
        int iH = fsyVar.h();
        for (int i2 = 0; i2 < iH; i2++) {
            ftg ftgVarN = fsyVar.n(i2);
            if ((ftgVarN instanceof nye) && (avmnVar = (nyeVar = (nye) ftgVarN).c) != null) {
                avmnVar.dispose();
                nyeVar.c = null;
            }
        }
    }

    public final void g(RecyclerView recyclerView) {
        int width = recyclerView.getWidth();
        int height = recyclerView.getHeight();
        if (!this.f && this.o == width && this.p == height) {
            this.b.G(recyclerView);
            return;
        }
        this.o = width;
        this.p = height;
        if (this.g) {
            this.b.P(recyclerView);
        }
        if (this.f) {
            this.b.aj(0, 0);
        }
        fsy fsyVar = this.b;
        fsyVar.aj(width, height);
        fsyVar.G(recyclerView);
        if (this.g || this.f) {
            recyclerView.getClass();
            recyclerView.post(new acqu(recyclerView, 15));
        }
        this.g = false;
        this.f = false;
    }

    public final void h(RecyclerView recyclerView) {
        if (this.s != null) {
            recyclerView.getViewTreeObserver().removeOnDrawListener(this.s);
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.m;
        if (onPreDrawListener != null) {
            recyclerView.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
        this.r = false;
    }

    public final void i(RecyclerView recyclerView) {
        np npVar = recyclerView.n;
        Parcelable parcelableOnSaveInstanceState = npVar != null ? npVar.onSaveInstanceState() : null;
        this.b.P(recyclerView);
        recyclerView.ah(npVar);
        if (npVar != null && parcelableOnSaveInstanceState != null) {
            npVar.onRestoreInstanceState(parcelableOnSaveInstanceState);
        }
        this.k.m();
    }
}
