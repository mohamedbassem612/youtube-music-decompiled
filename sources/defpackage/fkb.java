package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import app.rive.semantics.SemanticState;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentTree;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fkb {
    public final agk a;
    public final Map b;
    public long[] c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final fhd h;
    public final fjw i;
    public int l;
    public int m;
    public fjc o;
    public fjc p;
    public final fvi q;
    public final fwg r;
    public final fvg s;
    public final flx t;
    public flx u;
    public final jnm w;
    public final jnm x;
    private final agk y;
    public final agk g = new agk(10);
    public final Rect j = new Rect();
    public final kva v = new kva(null);
    public final fka k = new fka();
    public int n = -1;
    private final Set z = new HashSet();
    private final hed A = new hed((byte[]) null);

    public fkb(fjw fjwVar) {
        flx flxVar;
        boolean z = fna.a;
        this.a = new agk(10);
        this.y = new agk(10);
        this.h = fjwVar.y;
        this.i = fjwVar;
        this.d = true;
        this.b = fna.d ? new HashMap() : null;
        flz flzVar = new flz();
        flzVar.d = fwl.INHERIT;
        fjr fjrVar = new fjr(0L, new fja(new fiw(), null, flzVar, 0, 0, 2), null);
        Rect rect = fjwVar.A;
        fvi fviVar = new fvi(gzj.aW(fjrVar, rect, new qx(rect.width(), rect.height(), (Object) null), null), fjwVar, fjwVar);
        fviVar.e = new fjp(fjwVar);
        this.q = fviVar;
        fvg fvgVar = new fvg(this);
        this.s = fvgVar;
        if (fna.q) {
            fwg fwgVar = fwg.a;
            this.r = fwgVar;
            jnm jnmVarB = fvgVar.b(fwgVar);
            this.w = jnmVarB;
            ((fwf) jnmVarB.b).g = fjwVar;
        } else {
            this.r = null;
            this.w = null;
        }
        if (!fna.r) {
            this.t = null;
            this.x = null;
            return;
        }
        String str = true == fgo.a ? "LithoAnimationDebug" : null;
        if (str != null) {
            if (flx.b == null) {
                flx.b = new flx(str);
            }
            flxVar = flx.b;
        } else {
            flxVar = flx.a;
        }
        this.t = flxVar;
        this.x = fvgVar.b(flxVar);
    }

    public static boolean C(fgy fgyVar, fhd fhdVar, fgy fgyVar2, fhd fhdVar2) {
        gzj gzjVar = fvp.b;
        boolean zAJ = gzj.aJ();
        boolean zAd = true;
        if (zAJ) {
            try {
                try {
                    fvp.a = true;
                    gzj gzjVar2 = fvp.b;
                    boolean z = fvn.a;
                } catch (Exception e) {
                    gzj.bv(fhdVar2, e);
                }
            } finally {
                if (zAJ) {
                    gzj gzjVar3 = fvp.b;
                    boolean z2 = fvn.a;
                }
            }
        }
        zAd = fgyVar.ad(fhdVar, fgyVar, fhdVar2, fgyVar2);
        return zAd;
    }

    private final fhd F(fvq fvqVar) {
        fhd fhdVar = ((fjr) fvqVar.b).c;
        return fhdVar == null ? this.h : fhdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void G(View view, boolean z) throws Throwable {
        gzj.aS();
        if (view instanceof fjw) {
            fjw fjwVar = (fjw) view;
            if (fjwVar.Q()) {
                if (z) {
                    fjwVar.D();
                    return;
                } else {
                    fjwVar.C(new Rect(0, 0, view.getWidth(), view.getHeight()), false);
                    return;
                }
            }
            return;
        }
        if (view instanceof fvo) {
            ((fvo) view).B();
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                G(viewGroup.getChildAt(i), z);
            }
        }
    }

    private final void H(fvi fviVar) {
        fgy fgyVar = fja.a(fviVar).c;
        Object obj = fviVar.a;
        fhd fhdVarF = F(fviVar.d);
        boolean zA = fvp.a();
        fvr fvrVar = fviVar.d.b;
        if (zA) {
            fvrVar.c();
            fvp.b();
        }
        if (fviVar.c) {
            w(fviVar, fgyVar, obj);
        }
        if (zA) {
            gzj gzjVar = fvp.b;
            boolean z = fvn.a;
            fvrVar.c();
            fvp.b();
        }
        if (obj instanceof fiv) {
            ArrayList arrayList = new ArrayList();
            ((fiv) obj).a(arrayList);
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((fjw) arrayList.get(size)).O();
                }
            }
        }
        z(obj, ((fjr) fviVar.d.b).b, fjp.b(fviVar).a);
        Object obj2 = fviVar.d.c;
        fgyVar.aw(fhdVarF, obj);
        if (zA) {
            gzj gzjVar2 = fvp.b;
            boolean z2 = fvn.a;
        }
    }

    private final void I(fvi fviVar, agk agkVar) {
        ComponentTree componentTree = this.i.w;
        (componentTree != null ? Integer.valueOf(componentTree.A) : "null").toString();
        long jNanoTime = System.nanoTime();
        if (fviVar != null) {
            boolean zA = fvp.a();
            fvq fvqVar = fviVar.d;
            fvr fvrVar = fvqVar.b;
            long j = ((fjr) fvrVar).a;
            if (zA) {
                fvrVar.c();
                fvp.b();
            }
            Object obj = fviVar.a;
            boolean z = false;
            if (this.u != null && flx.l(this.s.c, fviVar)) {
                z = true;
            }
            if (fvqVar.a() > 0) {
                fvf fvfVar = (fvf) obj;
                for (int iA = fvqVar.a() - 1; iA >= 0; iA--) {
                    I((fvi) this.a.e(((fjr) ((fvq) fvqVar.h.get(iA)).b).a), agkVar);
                }
                if (!z && fvfVar.a() > 0) {
                    gzj.bs(2, "Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState, component: " + fja.a(fviVar).c.c(), fpr.a(this.h));
                    throw new IllegalStateException("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
                }
            }
            if (j == 0) {
                H(fviVar);
                if (zA) {
                    gzj gzjVar = fvp.b;
                    boolean z2 = fvn.a;
                    return;
                }
                return;
            }
            dl.o(this.a, j);
            fvf fvfVar2 = fviVar.b;
            fgy fgyVar = fja.a(fviVar).c;
            if (fgyVar.Q()) {
                dl.o(this.y, j);
            }
            if (fgyVar instanceof fiw) {
                agkVar.j(agkVar.b((ComponentHost) obj));
            }
            if (z) {
                flw flwVar = (flw) this.s.c.b;
                fjh fjhVar = (fjh) flwVar.b.get(fviVar.d.b);
                fkm fkmVar = (fkm) flwVar.a.get(fjhVar.e);
                if (fkmVar != null && fkmVar.b(fjhVar.c) != null) {
                    ahb ahbVar = ((ComponentHost) fvfVar2).a;
                    int iB = ahbVar.b(ahbVar.a(fviVar));
                    if (obj instanceof Drawable) {
                        ((ComponentHost) fvfVar2).f();
                        gzj.bE(iB, ((ComponentHost) fvfVar2).e, ((ComponentHost) fvfVar2).f);
                    } else if (obj instanceof View) {
                        ((ComponentHost) fvfVar2).h();
                        gzj.bE(iB, ((ComponentHost) fvfVar2).c, ((ComponentHost) fvfVar2).d);
                        ((ComponentHost) fvfVar2).i = true;
                        ((ComponentHost) fvfVar2).j(iB, fviVar);
                    }
                    ((ComponentHost) fvfVar2).g();
                    gzj.bE(iB, ((ComponentHost) fvfVar2).a, ((ComponentHost) fvfVar2).b);
                    ((ComponentHost) fvfVar2).o();
                    ((ComponentHost) fvfVar2).e();
                    ((ComponentHost) fvfVar2).g.add(fviVar);
                }
            } else {
                if (zA) {
                    fviVar.d.b.c();
                    fvp.b();
                }
                int length = this.c.length;
                while (true) {
                    length--;
                    if (length >= 0) {
                        if (this.c[length] == j) {
                            ((ComponentHost) fvfVar2).r(length, fviVar);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (zA) {
                    gzj gzjVar2 = fvp.b;
                    boolean z3 = fvn.a;
                }
                x(fviVar);
            }
            fka fkaVar = this.k;
            if (fkaVar.n) {
                fkaVar.g.add(Double.valueOf((System.nanoTime() - jNanoTime) / 1000000.0d));
                fkaVar.b.add(fgyVar.c());
                fkaVar.k++;
            }
            if (zA) {
                gzj gzjVar3 = fvp.b;
                boolean z4 = fvn.a;
            }
        }
    }

    static fhe c(View view) {
        return view instanceof ComponentHost ? ((ComponentHost) view).k : (fhe) view.getTag(R.id.component_context_click_listener);
    }

    static fhf d(View view) {
        return view instanceof ComponentHost ? ((ComponentHost) view).m : (fhf) view.getTag(R.id.component_focus_change_listener);
    }

    static fhi e(View view) {
        return view instanceof ComponentHost ? ((ComponentHost) view).l : (fhi) view.getTag(R.id.component_hover_enter_listener);
    }

    static fhi f(View view) {
        return view instanceof ComponentHost ? ((ComponentHost) view).l : (fhi) view.getTag(R.id.component_hover_exit_listener);
    }

    public static fhk g(View view) {
        return view instanceof ComponentHost ? ((ComponentHost) view).j : (fhk) view.getTag(R.id.component_long_click_listener);
    }

    public static fhl h(View view) {
        return view instanceof ComponentHost ? ((ComponentHost) view).n : (fhl) view.getTag(R.id.component_touch_listener);
    }

    public static void p(fvi fviVar, boolean z) throws Throwable {
        if (fjr.b(fviVar.d.b)) {
            G((View) fviVar.a, z);
        }
    }

    static void u(View view, fhl fhlVar) {
        if (!(view instanceof ComponentHost)) {
            view.setOnTouchListener(fhlVar);
            view.setTag(R.id.component_touch_listener, fhlVar);
        } else {
            ComponentHost componentHost = (ComponentHost) view;
            componentHost.n = fhlVar;
            componentHost.setOnTouchListener(fhlVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void v(Object obj, fja fjaVar) {
        if (obj instanceof View) {
            View view = (View) obj;
            fkl fklVar = fjaVar.a;
            int i = 2;
            if (fklVar != null) {
                fip fipVar = fklVar.r;
                if (fipVar != null) {
                    view.setOnClickListener(new fhb(fipVar));
                    view.setClickable(true);
                }
                fip fipVar2 = fklVar.t;
                if (fipVar2 != null) {
                    fhk fhkVarG = g(view);
                    if (fhkVarG == null) {
                        fhkVarG = new fhk();
                        if (view instanceof ComponentHost) {
                            ComponentHost componentHost = (ComponentHost) view;
                            componentHost.j = fhkVarG;
                            componentHost.setOnLongClickListener(fhkVarG);
                        } else {
                            view.setOnLongClickListener(fhkVarG);
                            view.setTag(R.id.component_long_click_listener, fhkVarG);
                        }
                    }
                    fhkVarG.a = fipVar2;
                    view.setLongClickable(true);
                }
                fip fipVar3 = fklVar.u;
                if (fipVar3 != null) {
                    fhe fheVarC = c(view);
                    if (fheVarC == null) {
                        fheVarC = new fhe();
                        if (view instanceof ComponentHost) {
                            ComponentHost componentHost2 = (ComponentHost) view;
                            componentHost2.k = fheVarC;
                            componentHost2.setOnContextClickListener(fheVarC);
                        } else {
                            view.setOnContextClickListener(fheVarC);
                            view.setTag(R.id.component_context_click_listener, fheVarC);
                        }
                    }
                    fheVarC.a = fipVar3;
                    view.setContextClickable(true);
                }
                fip fipVar4 = fklVar.v;
                if (fipVar4 != null) {
                    fhi fhiVarE = e(view);
                    if (fhiVarE == null) {
                        fhiVarE = new fhi();
                        if (view instanceof ComponentHost) {
                            ((ComponentHost) view).p(fhiVarE);
                        } else {
                            view.setOnHoverListener(fhiVarE);
                            view.setTag(R.id.component_hover_enter_listener, fhiVarE);
                        }
                    }
                    fhiVarE.a = fipVar4;
                }
                fip fipVar5 = fklVar.w;
                if (fipVar5 != null) {
                    fhi fhiVarF = f(view);
                    if (fhiVarF == null) {
                        fhiVarF = new fhi();
                        if (view instanceof ComponentHost) {
                            ((ComponentHost) view).p(fhiVarF);
                        } else {
                            view.setOnHoverListener(fhiVarF);
                            view.setTag(R.id.component_hover_exit_listener, fhiVarF);
                        }
                    }
                    fhiVarF.b = fipVar5;
                }
                fip fipVar6 = fklVar.s;
                if (fipVar6 != null) {
                    fhf fhfVarD = d(view);
                    if (fhfVarD == null) {
                        fhfVarD = new fhf();
                        if (view instanceof ComponentHost) {
                            ComponentHost componentHost3 = (ComponentHost) view;
                            componentHost3.m = fhfVarD;
                            componentHost3.setOnFocusChangeListener(fhfVarD);
                        } else {
                            view.setOnFocusChangeListener(fhfVarD);
                            view.setTag(R.id.component_focus_change_listener, fhfVarD);
                        }
                    }
                    fhfVarD.a = fipVar6;
                }
                fip fipVar7 = fklVar.x;
                if (fipVar7 != null) {
                    fhl fhlVarH = h(view);
                    if (fhlVarH == null) {
                        fhlVarH = new fhl();
                        u(view, fhlVarH);
                    }
                    fhlVarH.a = fipVar7;
                }
                fip fipVar8 = fklVar.y;
                if (fipVar8 != null) {
                    if (view instanceof fit) {
                        fit fitVar = (fit) view;
                        heg hegVarX = fitVar.x();
                        if (hegVarX == null) {
                            hegVarX = new heg((char[]) null);
                            fitVar.y(hegVarX);
                        }
                        hegVarX.a = fipVar8;
                    } else {
                        fhl fhlVarH2 = h(view);
                        if (fhlVarH2 == null) {
                            fhlVarH2 = new fhl();
                            u(view, fhlVarH2);
                        }
                        fhlVarH2.b = fipVar8;
                    }
                }
                fip fipVar9 = fklVar.z;
                if (fipVar9 != null && (view instanceof ComponentHost)) {
                    ((ComponentHost) view).o = fipVar9;
                }
                boolean z = view instanceof ComponentHost;
                if (z || fklVar.R()) {
                    view.setTag(R.id.component_node_info, fklVar);
                }
                view.setTag(fklVar.c);
                SparseArray sparseArray = fklVar.e;
                if (sparseArray != null) {
                    if (z) {
                        ((ComponentHost) view).h = sparseArray;
                    } else {
                        int size = sparseArray.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            view.setTag(sparseArray.keyAt(i2), sparseArray.valueAt(i2));
                        }
                    }
                }
                int i3 = fklVar.f;
                if (Build.VERSION.SDK_INT >= 28) {
                    view.setOutlineAmbientShadowColor(i3);
                }
                int i4 = fklVar.g;
                if (Build.VERSION.SDK_INT >= 28) {
                    view.setOutlineSpotShadowColor(i4);
                }
                ViewOutlineProvider viewOutlineProvider = fklVar.h;
                if (viewOutlineProvider != null) {
                    view.setOutlineProvider(viewOutlineProvider);
                }
                if (fklVar.i) {
                    view.setClipToOutline(true);
                }
                if (!fklVar.j && (view instanceof ViewGroup)) {
                    ((ViewGroup) view).setClipToPadding(false);
                }
                if (fklVar.J() && (view instanceof ViewGroup)) {
                    ((ViewGroup) view).setClipChildren(fklVar.k);
                }
                CharSequence charSequence = fklVar.a;
                if (!TextUtils.isEmpty(charSequence)) {
                    view.setContentDescription(charSequence);
                }
                int i5 = fklVar.D;
                if (i5 == 1) {
                    view.setFocusable(true);
                } else if (i5 == 2) {
                    view.setFocusable(false);
                }
                int i6 = fklVar.E;
                if (i6 == 1) {
                    view.setClickable(true);
                } else if (i6 == 2) {
                    view.setClickable(false);
                }
                int i7 = fklVar.F;
                if (i7 == 1) {
                    view.setLongClickable(true);
                } else if (i7 == 2) {
                    view.setLongClickable(false);
                }
                int i8 = fklVar.G;
                if (i8 == 1) {
                    view.setEnabled(true);
                } else if (i8 == 2) {
                    view.setEnabled(false);
                }
                int i9 = fklVar.H;
                if (i9 == 1) {
                    view.setSelected(true);
                } else if (i9 == 2) {
                    view.setSelected(false);
                }
                if (fklVar.N()) {
                    view.setScaleX(fklVar.l);
                }
                if (fklVar.O()) {
                    view.setScaleY(fklVar.m);
                }
                if (fklVar.I()) {
                    view.setAlpha(fklVar.n);
                }
                if (fklVar.K()) {
                    view.setRotation(fklVar.o);
                }
                if (fklVar.L()) {
                    view.setRotationX(0.0f);
                }
                if (fklVar.M()) {
                    view.setRotationY(0.0f);
                }
                if (fklVar.P()) {
                    view.setTranslationX(fklVar.p);
                }
                if (fklVar.Q()) {
                    view.setTranslationY(fklVar.q);
                }
                String str = fklVar.d;
                int i10 = bac.a;
                view.setTransitionName(str);
            }
            int i11 = fjaVar.e;
            if (i11 != 0) {
                int i12 = bac.a;
                view.setImportantForAccessibility(i11);
            }
            flz flzVar = fjaVar.b;
            if (flzVar != null) {
                fgy fgyVar = fjaVar.c;
                Map map = fgy.h;
                if (flzVar.e != -1) {
                    view.setLayerType(0, null);
                }
                if (fgyVar instanceof fiw) {
                    return;
                }
                Drawable drawable = flzVar.a;
                if (drawable != null) {
                    view.setBackground(drawable);
                }
                if (flzVar.b()) {
                    Rect rect = flzVar.b;
                    int i13 = rect != null ? rect.left : 0;
                    Rect rect2 = flzVar.b;
                    int i14 = rect2 != null ? rect2.top : 0;
                    Rect rect3 = flzVar.b;
                    int i15 = rect3 != null ? rect3.right : 0;
                    Rect rect4 = flzVar.b;
                    view.setPadding(i13, i14, i15, rect4 != null ? rect4.bottom : 0);
                }
                int iOrdinal = flzVar.d.ordinal();
                if (iOrdinal == 1) {
                    i = 0;
                } else if (iOrdinal == 2) {
                    i = 1;
                }
                view.setLayoutDirection(i);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void z(Object obj, fja fjaVar, int i) {
        heg hegVarX;
        fhl fhlVarH;
        fhf fhfVarD;
        fhi fhiVarF;
        fhi fhiVarE;
        fhe fheVarC;
        fhk fhkVarG;
        Map map = fgy.h;
        if (obj instanceof View) {
            View view = (View) obj;
            fkl fklVar = fjaVar.a;
            int i2 = 1;
            if (fklVar != null) {
                if (fklVar.r != null) {
                    view.setOnClickListener(null);
                    view.setClickable(false);
                }
                if (fklVar.t != null && (fhkVarG = g(view)) != null) {
                    fhkVarG.a = null;
                }
                if (fklVar.u != null && (fheVarC = c(view)) != null) {
                    fheVarC.a = null;
                }
                if (fklVar.v != null && (fhiVarE = e(view)) != null) {
                    fhiVarE.a = null;
                }
                if (fklVar.w != null && (fhiVarF = f(view)) != null) {
                    fhiVarF.b = null;
                }
                if (fklVar.s != null && (fhfVarD = d(view)) != null) {
                    fhfVarD.a = null;
                }
                if (fklVar.x != null && (fhlVarH = h(view)) != null) {
                    fhlVarH.a = null;
                }
                if (fklVar.y != null) {
                    if ((view instanceof fit) && (hegVarX = ((fit) view).x()) != null) {
                        hegVarX.a = null;
                    }
                    fhl fhlVarH2 = h(view);
                    if (fhlVarH2 != null) {
                        fhlVarH2.b = null;
                    }
                }
                if (fklVar.z != null && (view instanceof ComponentHost)) {
                    ((ComponentHost) view).o = null;
                }
                view.setTag(null);
                SparseArray sparseArray = fklVar.e;
                if (view instanceof ComponentHost) {
                    ((ComponentHost) view).h = null;
                } else if (sparseArray != null) {
                    int size = sparseArray.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        view.setTag(sparseArray.keyAt(i3), null);
                    }
                }
                int i4 = fklVar.f;
                if (Build.VERSION.SDK_INT >= 28 && i4 != -16777216) {
                    view.setOutlineAmbientShadowColor(-16777216);
                }
                int i5 = fklVar.g;
                if (Build.VERSION.SDK_INT >= 28 && i5 != -16777216) {
                    view.setOutlineSpotShadowColor(-16777216);
                }
                if (fklVar.h != null) {
                    view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
                }
                if (fklVar.i) {
                    view.setClipToOutline(false);
                }
                if (!fklVar.j && (view instanceof ViewGroup)) {
                    ((ViewGroup) view).setClipToPadding(true);
                }
                if (!fklVar.k && (view instanceof ViewGroup)) {
                    ((ViewGroup) view).setClipChildren(true);
                }
                if (!TextUtils.isEmpty(fklVar.a)) {
                    view.setContentDescription(null);
                }
                if (fklVar.N() && view.getScaleX() != 1.0f) {
                    view.setScaleX(1.0f);
                }
                if (fklVar.O() && view.getScaleY() != 1.0f) {
                    view.setScaleY(1.0f);
                }
                if (fklVar.I() && view.getAlpha() != 1.0f) {
                    view.setAlpha(1.0f);
                }
                if (fklVar.K() && view.getRotation() != 0.0f) {
                    view.setRotation(0.0f);
                }
                if (fklVar.L() && view.getRotationX() != 0.0f) {
                    view.setRotationX(0.0f);
                }
                if (fklVar.M() && view.getRotationY() != 0.0f) {
                    view.setRotationY(0.0f);
                }
                if (fklVar.P() && view.getTranslationX() != 0.0f) {
                    view.setTranslationX(0.0f);
                }
                if (fklVar.Q() && view.getTranslationY() != 0.0f) {
                    view.setTranslationY(0.0f);
                }
            }
            view.setClickable(1 == (i & 1));
            view.setLongClickable((i & 2) == 2);
            view.setContextClickable((i & SemanticState.Focused) == 128);
            view.setFocusable((i & 4) == 4);
            view.setEnabled((i & 8) == 8);
            view.setSelected((i & 16) == 16);
            if (fjaVar.e != 0) {
                int i6 = bac.a;
                view.setImportantForAccessibility(0);
            }
            boolean z = view instanceof ComponentHost;
            if (z || view.getTag(R.id.component_node_info) != null) {
                view.setTag(R.id.component_node_info, null);
                if (!z) {
                    bac.p(view, null);
                }
            }
            flz flzVar = fjaVar.b;
            if (flzVar != null && !(fjaVar.c instanceof fiw)) {
                if (flzVar.b()) {
                    try {
                        view.setPadding(0, 0, 0, 0);
                    } catch (NullPointerException e) {
                        fvc.a().a(2, "From component: ".concat(fjaVar.c.c()), e, null);
                    }
                }
                if (flzVar.a != null) {
                    view.setBackground(null);
                }
                view.setLayoutDirection(2);
            }
            if ((i & 32) == 0) {
                i2 = -1;
            } else if ((i & 64) == 64) {
                i2 = 2;
            }
            if (i2 != -1) {
                view.setLayerType(i2, null);
            }
        }
    }

    public final boolean A(fvq fvqVar) {
        if (this.t == null) {
            return false;
        }
        jnm jnmVar = this.x;
        if (jnmVar != null) {
            return jnmVar.I(((fjr) fvqVar.b).a);
        }
        throw new IllegalStateException("Need a state when using the TransitionsExtension.");
    }

    final boolean B() {
        gzj.aS();
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(fkn fknVar) {
        fka fkaVar = this.k;
        if (!fkaVar.n) {
            fknVar.d();
            return;
        }
        if (fkaVar.j == 0 || fkaVar.a.isEmpty()) {
            fknVar.d();
            return;
        }
        fknVar.a("mounted_count", fkaVar.j);
        fknVar.a("unmounted_count", fkaVar.k);
        fknVar.a("updated_count", fkaVar.l);
        fknVar.a("no_op_count", fkaVar.m);
        omj.r(fknVar);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v1, types: [fiz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.Map] */
    public final void E(fvi fviVar, fgy fgyVar, fhd fhdVar, qx qxVar, Object obj) {
        fhd fhdVarF = F(fviVar.d);
        ?? r11 = qxVar.c;
        if (fhdVarF != null) {
            fhdVarF.b = "bind";
        }
        gzj gzjVar = fvp.b;
        boolean zAJ = gzj.aJ();
        if (zAJ) {
            fgyVar.c();
            fvp.a = true;
            gzj gzjVar2 = fvp.b;
            boolean z = fvn.a;
        }
        try {
            try {
                fgyVar.J(fhdVarF, obj, r11);
                if (fhdVarF != null) {
                    fhdVarF.p();
                }
                if (zAJ) {
                    gzj gzjVar3 = fvp.b;
                    boolean z2 = fvn.a;
                }
            } catch (Exception e) {
                if (fhdVarF == null) {
                    throw e;
                }
                gzj.bv(fhdVarF, e);
                fhdVarF.p();
                if (zAJ) {
                    gzj gzjVar4 = fvp.b;
                    boolean z3 = fvn.a;
                }
            }
            hed hedVar = this.A;
            boolean zC = hed.c(fgyVar, obj);
            int length = fgyVar.aA().length;
            if (zC || length > 0) {
                HashSet hashSet = new HashSet();
                if (zC) {
                    SparseArray sparseArrayI = fgyVar.i();
                    for (int i = 0; i < sparseArrayI.size(); i++) {
                        int iKeyAt = sparseArrayI.keyAt(i);
                        hee heeVar = (hee) sparseArrayI.valueAt(i);
                        hed.g(iKeyAt, heeVar, (View) obj);
                        hedVar.f(heeVar, fgyVar);
                        hashSet.add(heeVar);
                    }
                }
                hee[] heeVarArrAA = fgyVar.aA();
                for (int i2 = 0; i2 < heeVarArrAA.length; i2 = 1) {
                    hee heeVar2 = heeVarArrAA[0];
                    try {
                        fgyVar.ay(obj);
                        hedVar.f(heeVar2, fgyVar);
                        hashSet.add(heeVar2);
                    } catch (Exception e2) {
                        if (fhdVar != null) {
                            gzj.bv(fhdVar, e2);
                        } else {
                            gzj.bx(e2);
                        }
                    }
                }
                hedVar.a.put(fgyVar, hashSet);
                hedVar.b.put(fgyVar, obj);
            }
            fviVar.c = true;
        } catch (Throwable th) {
            if (fhdVarF != null) {
                fhdVarF.p();
            }
            if (zAJ) {
                gzj gzjVar5 = fvp.b;
                boolean z4 = fvn.a;
            }
            throw th;
        }
    }

    public final int a() {
        return this.a.c();
    }

    public final int b() {
        gzj.aS();
        long[] jArr = this.c;
        if (jArr == null) {
            return 0;
        }
        return jArr.length;
    }

    public final fvi i(int i) {
        gzj.aS();
        long[] jArr = this.c;
        if (jArr == null || i >= jArr.length) {
            return null;
        }
        return (fvi) this.a.e(jArr[i]);
    }

    public final fvi j() {
        return (fvi) this.a.e(0L);
    }

    public final String k(fvi fviVar) {
        long jD;
        agk agkVar = this.a;
        int iB = agkVar.b(fviVar);
        int i = -1;
        if (iB >= 0) {
            jD = agkVar.d(iB);
            int i2 = 0;
            while (true) {
                long[] jArr = this.c;
                if (i2 >= jArr.length) {
                    break;
                }
                if (jD == jArr[i2]) {
                    i = i2;
                    break;
                }
                i2++;
            }
        } else {
            jD = -1;
        }
        ComponentTree componentTree = this.i.w;
        String strC = componentTree == null ? "<null_component_tree>" : componentTree.b().c();
        Object obj = fviVar.a;
        String strValueOf = String.valueOf(obj != null ? obj.getClass() : "<null_content>");
        String strC2 = fja.a(fviVar).c.c();
        fvf fvfVar = fviVar.b;
        Object obj2 = fvfVar != null ? fvfVar.getClass() : "<null_host>";
        agk agkVar2 = this.g;
        return "rootComponent=" + strC + ", index=" + i + ", mapIndex=" + iB + ", id=" + jD + ", contentType=" + strValueOf + ", component=" + strC2 + ", host=" + String.valueOf(obj2) + ", isRootHost=" + (agkVar2.e(0L) == fviVar.b);
    }

    public final void l() {
        fjh fjhVarP;
        flq flqVar;
        if (this.t == null || !this.d) {
            return;
        }
        jnm jnmVar = this.x;
        flw flwVar = (flw) jnmVar.b;
        if (flwVar.e != null) {
            fvp.a = true;
            gzj gzjVar = fvp.b;
            boolean z = fvn.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap(flwVar.f.size());
            fkb fkbVar = ((fvg) jnmVar.a).b;
            int iB = fkbVar.b();
            for (int i = 0; i < iB; i++) {
                fvi fviVarI = fkbVar.i(i);
                if (fviVarI != null && (flqVar = (fjhVarP = flwVar.c.p(((fjr) fviVarI.d.b).a)).e) != null) {
                    int i2 = fjhVarP.c;
                    fkm fkmVar = (fkm) linkedHashMap.get(flqVar);
                    if (fkmVar == null) {
                        fkmVar = new fkm();
                        linkedHashMap.put(flqVar, fkmVar);
                    }
                    fkmVar.f(i2, fviVarI.a);
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                flwVar.e.f((flq) entry.getKey(), (fkm) entry.getValue());
            }
            for (Map.Entry entry2 : flwVar.a.entrySet()) {
                fkm fkmVar2 = (fkm) entry2.getValue();
                fkm fkmVar3 = new fkm();
                short s = fkmVar2.b;
                for (int i3 = 0; i3 < s; i3++) {
                    fkmVar3.e(fkmVar2.a(i3), ((fvi) fkmVar2.c(i3)).a);
                }
                flwVar.e.f((flq) entry2.getKey(), fkmVar3);
            }
            gzj gzjVar2 = fvp.b;
        }
        if (flx.c(flwVar, flwVar.c) && flwVar.h != null) {
            flu fluVar = flwVar.e;
            fvp.a = true;
            gzj gzjVar3 = fvp.b;
            boolean z2 = fvn.a;
            Map map = fluVar.c;
            for (fmp fmpVar : map.keySet()) {
                float fFloatValue = ((Float) map.get(fmpVar)).floatValue();
                fkm fkmVar4 = ((flr) fluVar.k.K(fmpVar.a)).b;
                if (fkmVar4 != null) {
                    flu.h(fmpVar.b, fFloatValue, fkmVar4);
                }
            }
            map.clear();
            String str = fluVar.h;
            fmj fmjVar = fluVar.g;
            if (fmjVar != null) {
                fmjVar.b(fluVar.f);
                fluVar.g.h(fluVar.l);
                fluVar.g = null;
            }
            gzj gzjVar4 = fvp.b;
        }
        ((fjc) flwVar.c).b.g.u = false;
        fwb fwbVar = flwVar.c;
        flwVar.i = fwbVar;
        flwVar.g = false;
        flwVar.d = ((fjc) fwbVar).x;
    }

    public final void m() {
        this.p = null;
    }

    public final void n() {
        if (this.t != null) {
            flx.d(this.x);
        }
        this.n = -1;
    }

    final void o() {
        if (this.r != null) {
            fwg.c(this.w);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0082  */
    /* JADX WARN: Code duplicated, block: B:22:0x009f  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:34:0x0129  */
    /* JADX WARN: Code duplicated, block: B:36:0x0132 A[LOOP:0: B:35:0x0130->B:36:0x0132, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x0146  */
    /* JADX WARN: Code duplicated, block: B:41:0x0159  */
    /* JADX WARN: Code duplicated, block: B:50:0x01af A[LOOP:1: B:48:0x01a9->B:50:0x01af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x01db  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [fiz, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void q(int i, fvq fvqVar, fja fjaVar, fjc fjcVar) {
        Object objA;
        Object objY;
        fhd fhdVarF;
        fvi fviVar;
        Object obj;
        fvg fvgVar;
        fka fkaVar;
        fhd fhdVar;
        String string;
        fly flyVar;
        Map mapQ;
        StringBuilder sb;
        List list;
        int size;
        int i2;
        gzj gzjVar = fvp.b;
        boolean zAJ = gzj.aJ();
        if (zAJ) {
            fvr fvrVar = fvqVar.b;
            fvrVar.c();
            fvp.a = true;
            gzj gzjVar2 = fvp.b;
            boolean z = fvn.a;
            fvrVar.c();
            fvp.a = true;
            gzj gzjVar3 = fvp.b;
        }
        long j = ((fjr) fvqVar.a.b).a;
        agk agkVar = this.g;
        long jNanoTime = System.nanoTime();
        ComponentHost componentHost = (ComponentHost) agkVar.e(j);
        if (componentHost == null) {
            int iB = fjcVar.b(j);
            fvq fvqVarG = fjcVar.g(iB);
            q(iB, fvqVarG, ((fjr) fvqVarG.b).b, fjcVar);
            componentHost = (ComponentHost) agkVar.e(j);
        }
        fgy fgyVar = fjaVar.c;
        boolean z2 = fgyVar instanceof fiw;
        fhd fhdVar2 = this.h;
        if (!z2) {
            Context context = fhdVar2.a;
            fvj fvjVarB = fvl.b(context, fgyVar);
            if (fvjVarB == null || (objA = fvjVarB.a(context, fgyVar)) == null) {
                objY = fgyVar.y(context);
            }
            if (zAJ) {
                gzj gzjVar4 = fvp.b;
                boolean z3 = fvn.a;
                fvqVar.b.c();
                fvp.a = true;
                gzj gzjVar5 = fvp.b;
            }
            fhdVarF = F(fvqVar);
            qx qxVar = (qx) fvqVar.c;
            fgyVar.H(fhdVarF, objA, qxVar.c);
            if (z2) {
                t(((fjr) fvqVar.b).a, (ComponentHost) objA);
            }
            fviVar = new fvi(fvqVar, componentHost, objA);
            fviVar.e = new fjp(objA);
            this.a.i(this.c[i], fviVar);
            if (fgyVar.Q()) {
                this.y.i(this.c[i], fviVar);
            }
            fvq fvqVar2 = fviVar.d;
            int i3 = fvqVar2.g;
            obj = fviVar.a;
            v(obj, ((fjr) fvqVar2.b).b);
            Rect rect = fvqVar.d;
            componentHost.l(i, fviVar, rect);
            if (zAJ) {
                gzj gzjVar6 = fvp.b;
                boolean z4 = fvn.a;
                fvqVar.b.c();
                fvp.a = true;
                gzj gzjVar7 = fvp.b;
            }
            E(fviVar, fgyVar, fhdVarF, qxVar, objA);
            if (zAJ) {
                gzj gzjVar8 = fvp.b;
                boolean z5 = fvn.a;
                fvqVar.b.c();
                fvp.a = true;
                gzj gzjVar9 = fvp.b;
            }
            int i4 = rect.left;
            int i5 = rect.top;
            int i6 = rect.right;
            int i7 = rect.bottom;
            gzj.aS();
            gzj.aE(i4, i5, i6, i7, obj, true);
            fvgVar = this.s;
            if (fvgVar != null) {
                list = fvgVar.a;
                size = list.size();
                for (i2 = 0; i2 < size; i2++) {
                    jnm jnmVar = (jnm) list.get(i2);
                    ((fvv) jnmVar.d).k(jnmVar, fvqVar.b, obj);
                }
            }
            if (zAJ) {
                gzj gzjVar10 = fvp.b;
                boolean z6 = fvn.a;
                fvqVar.b.c();
                fvp.a = true;
                gzj gzjVar11 = fvp.b;
            }
            fkaVar = this.k;
            if (fkaVar.n) {
                fkaVar.f.add(Double.valueOf((System.nanoTime() - jNanoTime) / 1000000.0d));
                fkaVar.a.add(fgyVar.c());
                fkaVar.j++;
                fhdVar = ((fjr) fvqVar.b).c;
                List list2 = fkaVar.e;
                omj omjVarW = fhdVarF.w();
                string = null;
                if (fhdVar != null && (flyVar = fhdVar.e) != null && (mapQ = omjVarW.q(flyVar)) != null) {
                    sb = new StringBuilder(mapQ.size() << 4);
                    for (Map.Entry entry : mapQ.entrySet()) {
                        sb.append((String) entry.getKey());
                        sb.append(':');
                        sb.append((String) entry.getValue());
                        sb.append(';');
                    }
                    string = sb.toString();
                }
                list2.add(string);
            }
            if (zAJ) {
                gzj gzjVar12 = fvp.b;
                boolean z7 = fvn.a;
                gzj gzjVar13 = fvp.b;
            }
        }
        Context context2 = fhdVar2.a;
        boolean z8 = fna.a;
        objY = ((fiw) fgyVar).x(context2);
        objA = objY;
        if (zAJ) {
            gzj gzjVar14 = fvp.b;
            boolean z9 = fvn.a;
            fvqVar.b.c();
            fvp.a = true;
            gzj gzjVar15 = fvp.b;
        }
        fhdVarF = F(fvqVar);
        qx qxVar2 = (qx) fvqVar.c;
        fgyVar.H(fhdVarF, objA, qxVar2.c);
        if (z2) {
            t(((fjr) fvqVar.b).a, (ComponentHost) objA);
        }
        fviVar = new fvi(fvqVar, componentHost, objA);
        fviVar.e = new fjp(objA);
        this.a.i(this.c[i], fviVar);
        if (fgyVar.Q()) {
            this.y.i(this.c[i], fviVar);
        }
        fvq fvqVar3 = fviVar.d;
        int i8 = fvqVar3.g;
        obj = fviVar.a;
        v(obj, ((fjr) fvqVar3.b).b);
        Rect rect2 = fvqVar.d;
        componentHost.l(i, fviVar, rect2);
        if (zAJ) {
            gzj gzjVar16 = fvp.b;
            boolean z10 = fvn.a;
            fvqVar.b.c();
            fvp.a = true;
            gzj gzjVar17 = fvp.b;
        }
        E(fviVar, fgyVar, fhdVarF, qxVar2, objA);
        if (zAJ) {
            gzj gzjVar18 = fvp.b;
            boolean z11 = fvn.a;
            fvqVar.b.c();
            fvp.a = true;
            gzj gzjVar19 = fvp.b;
        }
        int i9 = rect2.left;
        int i10 = rect2.top;
        int i11 = rect2.right;
        int i12 = rect2.bottom;
        gzj.aS();
        gzj.aE(i9, i10, i11, i12, obj, true);
        fvgVar = this.s;
        if (fvgVar != null) {
            list = fvgVar.a;
            size = list.size();
            while (i2 < size) {
                jnm jnmVar2 = (jnm) list.get(i2);
                ((fvv) jnmVar2.d).k(jnmVar2, fvqVar.b, obj);
            }
        }
        if (zAJ) {
            gzj gzjVar110 = fvp.b;
            boolean z12 = fvn.a;
            fvqVar.b.c();
            fvp.a = true;
            gzj gzjVar111 = fvp.b;
        }
        fkaVar = this.k;
        if (fkaVar.n) {
            fkaVar.f.add(Double.valueOf((System.nanoTime() - jNanoTime) / 1000000.0d));
            fkaVar.a.add(fgyVar.c());
            fkaVar.j++;
            fhdVar = ((fjr) fvqVar.b).c;
            List list3 = fkaVar.e;
            omj omjVarW2 = fhdVarF.w();
            string = null;
            if (fhdVar != null) {
                sb = new StringBuilder(mapQ.size() << 4);
                while (r1.hasNext()) {
                    sb.append((String) entry.getKey());
                    sb.append(':');
                    sb.append((String) entry.getValue());
                    sb.append(';');
                }
                string = sb.toString();
            }
            list3.add(string);
        }
        if (zAJ) {
            gzj gzjVar112 = fvp.b;
            boolean z13 = fvn.a;
            gzj gzjVar113 = fvp.b;
        }
    }

    public final void r(fjc fjcVar, Rect rect, boolean z) throws Throwable {
        boolean zA = fvp.a();
        if (zA) {
            fvp.b();
        }
        ArrayList arrayList = fjcVar.i;
        ArrayList arrayList2 = fjcVar.j;
        int iA = fjcVar.a();
        if (rect.top >= 0 || this.j.top >= 0) {
            while (this.m < iA && rect.top >= ((fvw) arrayList2.get(this.m)).b.bottom) {
                fvw fvwVar = (fvw) arrayList2.get(this.m);
                fvq fvqVarH = fjcVar.h(fvwVar);
                int iB = fjcVar.b(((fjr) fvqVarH.b).a);
                if (!A(fvqVarH) && !fvwVar.c) {
                    y(iB, this.g);
                }
                this.m++;
            }
            while (this.m > 0 && rect.top <= ((fvw) arrayList2.get(this.m - 1)).b.bottom) {
                int i = this.m - 1;
                this.m = i;
                fvq fvqVarH2 = fjcVar.h((fvw) arrayList2.get(i));
                fja fjaVarB = fja.b(fvqVarH2);
                long j = ((fjr) fvqVarH2.b).a;
                if (i(fjcVar.b(j)) == null) {
                    q(fjcVar.b(j), fvqVarH2, fjaVarB, fjcVar);
                    this.z.add(Long.valueOf(j));
                }
            }
        }
        int height = this.i.getHeight();
        if (rect.bottom < height || this.j.bottom < height) {
            while (this.l < iA && rect.bottom >= ((fvw) arrayList.get(this.l)).b.top) {
                fvq fvqVarH3 = fjcVar.h((fvw) arrayList.get(this.l));
                fja fjaVarB2 = fja.b(fvqVarH3);
                long j2 = ((fjr) fvqVarH3.b).a;
                if (i(fjcVar.b(j2)) == null) {
                    q(fjcVar.b(j2), fvqVarH3, fjaVarB2, fjcVar);
                    this.z.add(Long.valueOf(j2));
                }
                this.l++;
            }
            while (this.l > 0 && rect.bottom < ((fvw) arrayList.get(this.l - 1)).b.top) {
                int i2 = this.l - 1;
                this.l = i2;
                fvw fvwVar2 = (fvw) arrayList.get(i2);
                fvq fvqVarH4 = fjcVar.h(fvwVar2);
                int iB2 = fjcVar.b(((fjr) fvqVarH4.b).a);
                if (!A(fvqVarH4) && !fvwVar2.c) {
                    y(iB2, this.g);
                }
            }
        }
        agk agkVar = this.y;
        int iC = agkVar.c();
        for (int i3 = 0; i3 < iC; i3++) {
            fvi fviVar = (fvi) agkVar.g(i3);
            long jD = agkVar.d(i3);
            if (!this.z.contains(Long.valueOf(jD)) && fjcVar.b(jD) != -1) {
                p(fviVar, z);
            }
        }
        this.z.clear();
        if (zA) {
            gzj gzjVar = fvp.b;
            boolean z2 = fvn.a;
        }
    }

    public final void s(Rect rect, boolean z) {
        if (this.r != null) {
            jnm jnmVar = this.w;
            if (z) {
                gzj gzjVar = fvp.b;
                boolean zAJ = gzj.aJ();
                if (zAJ) {
                    fvp.a = true;
                    gzj gzjVar2 = fvp.b;
                    boolean z2 = fvn.a;
                }
                if (fwg.e(jnmVar)) {
                    fwg.d(jnmVar, ((fwf) jnmVar.b).e, true);
                }
                if (zAJ) {
                    gzj gzjVar3 = fvp.b;
                    boolean z3 = fvn.a;
                    return;
                }
                return;
            }
            boolean zE = fwg.e(jnmVar);
            gzj gzjVar4 = fvp.b;
            boolean zAJ2 = gzj.aJ();
            if (zAJ2) {
                fvp.a = true;
                gzj gzjVar5 = fvp.b;
                boolean z4 = fvn.a;
            }
            if (zE) {
                fwg.d(jnmVar, rect, false);
            }
            if (zAJ2) {
                gzj gzjVar6 = fvp.b;
                boolean z5 = fvn.a;
            }
        }
    }

    public final void t(long j, ComponentHost componentHost) {
        this.g.i(j, componentHost);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public final void w(fvi fviVar, fgy fgyVar, Object obj) {
        if (hed.c(fgyVar, obj) || fgyVar.aA().length != 0) {
            hed hedVar = this.A;
            hedVar.b.remove(fgyVar);
            ?? r1 = hedVar.a;
            Set<hee> set = (Set) r1.get(fgyVar);
            if (set != null) {
                for (hee heeVar : set) {
                    if (heeVar != null) {
                        ?? r4 = hedVar.c;
                        Set set2 = (Set) r4.get(heeVar);
                        if (set2 != null) {
                            set2.remove(fgyVar);
                            if (set2.isEmpty()) {
                                r4.remove(heeVar);
                                heeVar.a.remove(hedVar);
                            }
                        }
                    }
                }
                if (obj instanceof View) {
                    View view = (View) obj;
                    if (view.getAlpha() != 1.0f) {
                        view.setAlpha(1.0f);
                    }
                    if (view.getTranslationX() != 0.0f) {
                        view.setTranslationX(0.0f);
                    }
                    if (view.getTranslationY() != 0.0f) {
                        view.setTranslationY(0.0f);
                    }
                    if (view.getScaleX() != 1.0f) {
                        view.setScaleX(1.0f);
                    }
                    if (view.getScaleY() != 1.0f) {
                        view.setScaleY(1.0f);
                    }
                    if (view.getElevation() != 0.0f) {
                        view.setElevation(0.0f);
                    }
                    if (view.getBackground() != null) {
                        view.setBackground(null);
                    }
                    if (view.getRotation() != 0.0f) {
                        view.setRotation(0.0f);
                    }
                }
                r1.remove(fgyVar);
            }
        }
        fvq fvqVar = fviVar.d;
        fhd fhdVarF = F(fvqVar);
        Object obj2 = fvqVar.c;
        gzj gzjVar = fvp.b;
        if (gzj.aJ()) {
            fgyVar.c();
            fvp.a = true;
            gzj gzjVar2 = fvp.b;
            boolean z = fvn.a;
        }
        try {
            try {
                fgyVar.aq(fhdVarF, obj);
            } catch (Exception e) {
                gzj.bv(fhdVarF, e);
            }
            gzj gzjVar3 = fvp.b;
            boolean z2 = fvn.a;
            fviVar.c = false;
        } catch (Throwable th) {
            gzj gzjVar4 = fvp.b;
            boolean z3 = fvn.a;
            throw th;
        }
    }

    public final void x(fvi fviVar) {
        H(fviVar);
        try {
            fjp fjpVarB = fjp.b(fviVar);
            Context context = this.h.a;
            fgy fgyVar = fja.b(fviVar.d).c;
            if (fjpVarB.b) {
                throw new fjo("Releasing released mount content! component: " + fgyVar.c() + ", previousReleaseCause: " + fjpVarB.c);
            }
            if (fgyVar instanceof fiw) {
                Object obj = fviVar.a;
                boolean z = fna.a;
            } else {
                Object obj2 = fviVar.a;
                fvj fvjVarB = fvl.b(context, fgyVar);
                if (fvjVarB != null) {
                    fvjVarB.b(obj2);
                }
            }
            fjpVarB.b = true;
            fjpVarB.c = "unmountItem";
        } catch (fjo e) {
            throw new RuntimeException(e.getMessage() + ' ' + k(fviVar));
        }
    }

    public final void y(int i, agk agkVar) {
        fvi fviVarI = i(i);
        if (fviVarI != null) {
            I(fviVarI, agkVar);
        }
    }
}
