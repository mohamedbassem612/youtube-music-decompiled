package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import com.facebook.litho.ComponentHost;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoViewTestHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fjw extends ComponentHost implements fvs, fwa {
    private static final String F = "fjw";
    private static final int[] G = new int[2];
    public final Rect A;
    public ComponentTree B;
    public int C;
    public mdu D;
    public fhz E;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private int M;
    private int N;
    private final Rect O;
    private boolean P;
    private final AccessibilityManager Q;
    private final fjt R;
    private AccessibilityManager$AccessibilityServicesStateChangeListener S;
    private boolean T;
    private Map U;
    private String V;
    private String W;
    private ci aa;
    public boolean t;
    public boolean u;
    public boolean v;
    public ComponentTree w;
    public final fkb x;
    public final fhd y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjw(fhd fhdVar) {
        super(fhdVar.a);
        boolean z = fna.a;
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        this.v = false;
        this.A = new Rect();
        this.K = false;
        this.L = false;
        this.M = -1;
        this.N = -1;
        this.O = new Rect();
        this.E = null;
        this.D = null;
        this.R = new fjt(this);
        this.y = fhdVar;
        this.x = new fkb(this);
        AccessibilityManager accessibilityManager = (AccessibilityManager) fhdVar.a.getSystemService("accessibility");
        this.Q = accessibilityManager;
        this.aa = new ci(this);
        if (Build.VERSION.SDK_INT >= 33) {
            this.S = new fjv(this);
        }
        this.P = fgn.c(accessibilityManager);
        fjp.a(this);
    }

    public static void E(WeakReference weakReference) {
        fjw fjwVar = (fjw) weakReference.get();
        if (fjwVar != null) {
            fgn.a();
            boolean zC = fgn.c(fjwVar.Q);
            if (fjwVar.P != zC) {
                fjwVar.P = zC;
                fjwVar.n(zC);
                fjwVar.J = true;
                fjwVar.requestLayout();
            }
        }
    }

    private static int U(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        return mode != 0 ? View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(i) - i2), mode) : i;
    }

    private final void V() {
        this.x.o();
    }

    private final void W() {
        AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener;
        if (this.I) {
            return;
        }
        this.I = true;
        ComponentTree componentTree = this.w;
        if (componentTree != null) {
            componentTree.j();
        }
        n(fgn.b(getContext()));
        AccessibilityManager accessibilityManager = this.Q;
        fjt fjtVar = this.R;
        if (fjtVar != null) {
            accessibilityManager.addAccessibilityStateChangeListener(new bbw(fjtVar));
        }
        ci ciVar = this.aa;
        if (ciVar != null) {
            accessibilityManager.addTouchExplorationStateChangeListener(new bbx(ciVar));
        }
        if (Build.VERSION.SDK_INT >= 33 && (accessibilityManager$AccessibilityServicesStateChangeListener = this.S) != null) {
            accessibilityManager.addAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }
        if (Q() || R() || S()) {
            return;
        }
        boolean z = fna.a;
        A();
    }

    private final void X() {
        AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener;
        if (this.I) {
            this.I = false;
            if (!Q()) {
                boolean z = fna.a;
                ComponentTree componentTree = this.w;
                if (componentTree != null && !componentTree.k) {
                    F(new Rect());
                }
            }
            fkb fkbVar = this.x;
            gzj.aS();
            gzj.aS();
            if (fkbVar.c != null) {
                boolean zA = fvp.a();
                if (zA) {
                    fvp.b();
                    fvp.b();
                }
                int length = fkbVar.c.length;
                for (int i = 0; i < length; i++) {
                    fvi fviVarI = fkbVar.i(i);
                    if (fviVarI != null && fviVarI.c) {
                        fkbVar.w(fviVarI, fja.a(fviVarI).c, fviVarI.a);
                    }
                }
                if (zA) {
                    gzj gzjVar = fvp.b;
                    boolean z2 = fvn.a;
                    fvp.b();
                }
                fkbVar.o();
                if (fkbVar.r != null) {
                    fwg.c(fkbVar.w);
                }
                if (fkbVar.t != null) {
                    fkbVar.x.H();
                }
                if (zA) {
                    gzj gzjVar2 = fvp.b;
                    boolean z3 = fvn.a;
                    gzj gzjVar3 = fvp.b;
                }
            }
            ComponentTree componentTree2 = this.w;
            if (componentTree2 != null) {
                componentTree2.o();
            }
            AccessibilityManager accessibilityManager = this.Q;
            fjt fjtVar = this.R;
            if (fjtVar != null) {
                accessibilityManager.removeAccessibilityStateChangeListener(new bbw(fjtVar));
            }
            ci ciVar = this.aa;
            if (ciVar != null) {
                accessibilityManager.removeTouchExplorationStateChangeListener(new bbx(ciVar));
            }
            if (Build.VERSION.SDK_INT < 33 || (accessibilityManager$AccessibilityServicesStateChangeListener = this.S) == null) {
                return;
            }
            accessibilityManager.removeAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
        }
    }

    private final void Y() throws Throwable {
        if (this.w == null || !(getParent() instanceof View)) {
            return;
        }
        int width = ((View) getParent()).getWidth();
        int height = ((View) getParent()).getHeight();
        int translationX = (int) getTranslationX();
        int translationY = (int) getTranslationY();
        int top = getTop() + translationY;
        int bottom = getBottom() + translationY;
        int left = getLeft() + translationX;
        int right = getRight() + translationX;
        Rect rect = this.A;
        if (left < 0 || top < 0 || right > width || bottom > height || rect.left < 0 || rect.top < 0 || rect.right > width || rect.bottom > height || rect.width() != getWidth() || rect.height() != getHeight()) {
            Rect rect2 = new Rect();
            if (getLocalVisibleRect(rect2)) {
                C(rect2, true);
            }
        }
    }

    private static void Z(ComponentHost componentHost) {
        int childCount = componentHost.getChildCount();
        if (childCount != 0) {
            View[] viewArr = new View[childCount];
            for (int i = 0; i < childCount; i++) {
                viewArr[i] = componentHost.getChildAt(i);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View view = viewArr[i2];
                if (view.getParent() == componentHost) {
                    if (view.isLayoutRequested()) {
                        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
                        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    }
                    if (view instanceof ComponentHost) {
                        Z((ComponentHost) view);
                    }
                }
            }
        }
    }

    private static void aa(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof fjw) {
                if (z) {
                    fjw fjwVar = (fjw) childAt;
                    if (!fjwVar.z) {
                        fjwVar.onAttachedToWindow();
                        fjwVar.z = true;
                        fjwVar.z();
                    }
                } else {
                    fjw fjwVar2 = (fjw) childAt;
                    if (fjwVar2.z) {
                        fjwVar2.z = false;
                        fjwVar2.onDetachedFromWindow();
                        fjwVar2.z();
                    }
                }
            } else if (childAt instanceof ViewGroup) {
                aa((ViewGroup) childAt, z);
            }
        }
    }

    private static final fps ab(fly flyVar) {
        int i;
        Map.Entry[] entryArr;
        if (flyVar != null) {
            fps fpsVar = (fps) flyVar.c(fps.class);
            if (fpsVar != null) {
                return fpsVar;
            }
            Map map = flyVar.a;
            synchronized (map) {
                entryArr = (Map.Entry[]) map.entrySet().toArray(new Map.Entry[0]);
            }
            for (Map.Entry entry : entryArr) {
                Object key = entry.getKey();
                if ((key instanceof Class) && fps.class.isAssignableFrom((Class) key)) {
                    Object value = entry.getValue();
                    if (value == null) {
                        break;
                    }
                    return (fps) value;
                }
            }
        }
        return null;
    }

    private static void ac(String str, agfm agfmVar, fhd fhdVar) {
        boolean z = agfmVar.a;
        int i = agfmVar.b;
        gzj.bs(2, str, fpr.a(fhdVar));
    }

    public final void A() {
        ComponentTree componentTree = this.w;
        if (componentTree == null || componentTree.k) {
            return;
        }
        F(new Rect(0, 0, getWidth(), getHeight()));
    }

    @Override // defpackage.fvo
    public final void B() throws Throwable {
        D();
    }

    @Override // defpackage.fwa
    public final void C(Rect rect, boolean z) throws Throwable {
        ComponentTree componentTree = this.w;
        if (componentTree == null || componentTree.x == null) {
            return;
        }
        boolean zA = fvp.a();
        if (zA) {
            fvp.b();
        }
        ComponentTree componentTree2 = this.w;
        if (componentTree2.k) {
            componentTree2.r(rect, z);
        } else if (z) {
            F(rect);
        }
        if (zA) {
            gzj gzjVar = fvp.b;
            boolean z2 = fvn.a;
        }
    }

    public final void D() throws Throwable {
        ComponentTree componentTree = this.w;
        if (componentTree == null || componentTree.x == null) {
            return;
        }
        gzj gzjVar = fvp.b;
        boolean zAJ = gzj.aJ();
        if (zAJ) {
            fvp.a = true;
            gzj gzjVar2 = fvp.b;
            boolean z = fvn.a;
        }
        ComponentTree componentTree2 = this.w;
        if (componentTree2.k) {
            componentTree2.p();
        } else {
            Rect rect = new Rect();
            if (!getLocalVisibleRect(rect)) {
                rect.setEmpty();
            }
            F(rect);
        }
        if (zAJ) {
            gzj gzjVar3 = fvp.b;
            boolean z2 = fvn.a;
        }
    }

    final void F(Rect rect) {
        ComponentTree componentTree = this.w;
        if (componentTree == null || !componentTree.l) {
            return;
        }
        boolean z = fna.a;
        fjc fjcVar = this.w.x;
        if (fjcVar == null) {
            Log.w(F, "Main Thread Layout state is not found");
            return;
        }
        fjcVar.N = true;
        this.x.s(rect, R());
        this.A.set(rect);
    }

    public final void G() {
        gzj.aS();
        fkb fkbVar = this.x;
        if (fkbVar.c != null) {
            boolean zA = fvp.a();
            if (zA) {
                fvp.b();
            }
            int length = fkbVar.c.length;
            for (int i = 0; i < length; i++) {
                fvi fviVarI = fkbVar.i(i);
                if (fviVarI != null && !fviVarI.c) {
                    fgy fgyVar = fja.a(fviVarI).c;
                    Object obj = fviVarI.a;
                    fkbVar.E(fviVarI, fgyVar, fjr.a(fviVarI), (qx) fviVarI.d.c, obj);
                    if ((obj instanceof View) && !(obj instanceof ComponentHost)) {
                        View view = (View) obj;
                        if (view.isLayoutRequested()) {
                            int left = view.getLeft();
                            int top = view.getTop();
                            int right = view.getRight();
                            int bottom = view.getBottom();
                            gzj.aS();
                            gzj.aE(left, top, right, bottom, view, true);
                        }
                    }
                }
            }
            if (zA) {
                gzj gzjVar = fvp.b;
                boolean z = fvn.a;
            }
        }
    }

    @Deprecated
    public final void H() {
        gzj.aS();
        if (P()) {
            gzj.br(1, "Trying to release a LithoView but a LithoLifecycleProvider was found, ignoring.");
            return;
        }
        fkb fkbVar = this.x;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            agk agkVar = fkbVar.a;
            if (i >= agkVar.c()) {
                break;
            }
            fvi fviVar = (fvi) agkVar.e(agkVar.d(i));
            if (fviVar != null) {
                Object obj = fviVar.a;
                if (obj instanceof fiv) {
                    ((fiv) obj).a(arrayList);
                }
            }
            i++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fjw) it.next()).H();
        }
        ComponentTree componentTree = this.w;
        if (componentTree != null) {
            componentTree.t();
            this.w = null;
            ComponentTree.m(this);
            this.W = "release_CT";
        }
    }

    @Override // defpackage.fwa
    public final void I(int i) {
        this.N = i;
        requestLayout();
    }

    @Override // defpackage.fwa
    public final void J(int i) {
        this.M = i;
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0024  */
    public final void K(ComponentTree componentTree, boolean z) {
        boolean z2;
        fps fpsVarAb;
        Map map;
        gzj.aS();
        if (this.K) {
            throw new RuntimeException("Cannot update ComponentTree while in the middle of measure");
        }
        this.B = null;
        ComponentTree componentTree2 = this.w;
        if (componentTree2 == componentTree) {
            if (this.I) {
                G();
                return;
            }
            return;
        }
        if (componentTree2 == null || componentTree == null) {
            z2 = true;
        } else if (componentTree2.A == componentTree.A) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.L = z2;
        M();
        if (this.w != null) {
            if (componentTree != null) {
                V();
                this.x.n();
            } else if (z) {
                O();
            }
            if (this.U != null) {
                this.V = this.w.g();
            }
            if (componentTree != null && componentTree.getLithoView() != null && (map = this.U) != null && map.containsKey("LithoView:SetAlreadyAttachedComponentTree")) {
                ComponentTree componentTree3 = this.w;
                agfm agfmVar = (agfm) this.U.get("LithoView:SetAlreadyAttachedComponentTree");
                ac(((String) agfmVar.c) + "-LithoView:SetAlreadyAttachedComponentTree, currentView=" + LithoViewTestHelper.a(componentTree3.getLithoView()) + ", newComponent.LV=" + LithoViewTestHelper.a(componentTree.getLithoView()) + ", currentComponent=" + componentTree3.g() + ", newComponent=" + componentTree.g(), agfmVar, this.y);
            }
            if (this.I) {
                this.w.o();
            }
            boolean z3 = fna.H;
            ComponentTree componentTree4 = this.w;
            if (!z3) {
                componentTree4.n();
            } else if (componentTree4.getLithoView() == this) {
                this.w.n();
            }
        }
        this.w = componentTree;
        if (componentTree != null) {
            if (componentTree.z()) {
                throw new IllegalStateException("Setting a released ComponentTree to a LithoView, released component was: ".concat(String.valueOf(componentTree.f())));
            }
            gzj.aS();
            if (componentTree.o != this) {
                fjl fjlVar = componentTree.c;
                if (fjlVar != null) {
                    fjk fjkVarA = fjlVar.a();
                    if (fjkVarA == fjk.HINT_VISIBLE) {
                        N(true);
                    }
                    if (fjkVarA == fjk.HINT_INVISIBLE) {
                        N(false);
                    }
                }
                fjw fjwVar = componentTree.o;
                if (fjwVar != null) {
                    fjwVar.K(null, true);
                } else if (componentTree.m) {
                    componentTree.o();
                }
                fhd fhdVar = componentTree.i;
                Context context = fhdVar.a;
                if (context != fhdVar.b() && hmy.b(getContext()) != hmy.b(context)) {
                    throw new IllegalArgumentException("Base view context differs, view context is: " + String.valueOf(getContext()) + ", ComponentTree context is: " + String.valueOf(context));
                }
                componentTree.o = this;
            }
            if (fna.D) {
                fly flyVar = this.w.w;
                fhd fhdVar2 = this.y;
                fly flyVar2 = fhdVar2.e;
                if (flyVar2 == null) {
                    fhdVar2.e = flyVar;
                } else if (ab(flyVar2) == null && (fpsVarAb = ab(flyVar)) != null) {
                    flyVar2.d(fps.class, fpsVarAb);
                }
            }
            if (this.I) {
                this.w.j();
            } else {
                requestLayout();
            }
        }
        this.W = this.w == null ? "set_CT" : null;
    }

    public final void L(List list) {
        if (list == null) {
            this.U = null;
            return;
        }
        this.U = new HashMap();
        for (int i = 0; i < ((agpi) list).d; i++) {
            agfm agfmVar = (agfm) list.get(i);
            this.U.put(agfmVar.d, agfmVar);
        }
    }

    public final void M() {
        gzj.aS();
        fkb fkbVar = this.x;
        fkbVar.d = true;
        fkbVar.j.setEmpty();
        this.A.setEmpty();
    }

    public final void N(boolean z) {
        gzj.aS();
        if (this.w != null) {
            if (!this.t) {
                if (z) {
                    return;
                } else {
                    z = false;
                }
            }
            this.t = true;
            this.u = true;
            boolean zT = T();
            this.H = z;
            if (!z) {
                V();
                return;
            }
            if (zT) {
                D();
                return;
            }
            Rect rect = this.O;
            if (getLocalVisibleRect(rect)) {
                F(rect);
            }
        }
    }

    @Deprecated
    public final void O() {
        gzj.aS();
        fkb fkbVar = this.x;
        if (fkbVar.c != null) {
            gzj gzjVar = fvp.b;
            boolean zAJ = gzj.aJ();
            if (zAJ) {
                fvp.a = true;
                gzj gzjVar2 = fvp.b;
                boolean z = fvn.a;
            }
            fkbVar.y(0, fkbVar.g);
            fkbVar.j.setEmpty();
            fkbVar.f = true;
            if (fkbVar.r != null) {
                fwf fwfVar = (fwf) fkbVar.w.b;
                fwg.a(fwfVar);
                Rect rect = fwfVar.b;
                rect.setEmpty();
                rect.setEmpty();
                fwfVar.f = null;
            }
            if (fkbVar.t != null) {
                jnm jnmVar = fkbVar.x;
                jnmVar.H();
                flx.i(jnmVar);
                jnmVar.H();
                flx.d(jnmVar);
            }
            fvg fvgVar = fkbVar.s;
            fkbVar.n();
            if (zAJ) {
                gzj gzjVar3 = fvp.b;
                boolean z2 = fvn.a;
            }
        }
        this.M = -1;
        this.N = -1;
        this.A.setEmpty();
    }

    public final synchronized boolean P() {
        ComponentTree componentTree = this.w;
        return componentTree != null && componentTree.A();
    }

    public final boolean Q() {
        ComponentTree componentTree = this.w;
        return componentTree != null && componentTree.k;
    }

    public final boolean R() {
        return this.x.B();
    }

    public final boolean S() {
        gzj.aS();
        return this.x.f;
    }

    public final boolean T() {
        return this.u && this.t && !this.H;
    }

    @Override // com.facebook.litho.ComponentHost
    protected final Map d(int i, int i2) {
        Map mapD = super.d(i, i2);
        ComponentTree componentTree = this.w;
        if (componentTree == null) {
            mapD.put("lithoView", null);
        } else {
            HashMap map = new HashMap();
            mapD.put("lithoView", map);
            if (componentTree.b() == null) {
                map.put("root", null);
            } else {
                map.put("root", componentTree.b().c());
                map.put("tree", fhz.b(componentTree.i));
            }
        }
        return mapD;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z = fna.a;
        try {
            canvas.translate(getPaddingLeft(), getPaddingTop());
            super.draw(canvas);
        } catch (Throwable th) {
            throw new fjn(null, this.w, th);
        }
    }

    public Deque findTestItems(String str) {
        Map map = this.x.b;
        if (map == null) {
            throw new UnsupportedOperationException("Trying to access TestItems while ComponentsConfiguration.isEndToEndTestRun is false.");
        }
        Deque deque = (Deque) map.get(str);
        return deque == null ? new LinkedList() : deque;
    }

    @Override // android.view.View
    public final void offsetLeftAndRight(int i) throws Throwable {
        super.offsetLeftAndRight(i);
        Y();
    }

    @Override // android.view.View
    public final void offsetTopAndBottom(int i) throws Throwable {
        super.offsetTopAndBottom(i);
        Y();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        W();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        X();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        W();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        boolean z;
        fjw fjwVar;
        fjc fjcVar;
        boolean z2 = fna.a;
        fhd fhdVar = this.y;
        omj omjVarW = fhdVar.w();
        fkn fknVarBN = omjVarW != null ? gzj.bN(omjVarW, fhdVar.n(), omjVarW.p(fhdVar, 23), fhdVar.e) : null;
        Resources resources = getResources();
        PackageManager packageManager = getContext().getPackageManager();
        int mode = View.MeasureSpec.getMode(i);
        if (mode != 0) {
            if (fig.a == 0) {
                try {
                    fig.a = true != packageManager.hasSystemFeature("org.chromium.arc.device_management") ? (byte) 1 : (byte) 2;
                } catch (RuntimeException unused) {
                    fig.a = (byte) 1;
                }
            }
            Configuration configuration = resources.getConfiguration();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            float f = displayMetrics.density;
            float f2 = configuration.screenWidthDp;
            int i3 = fig.a == 2 ? (int) ((f2 * f) + 0.5f) : displayMetrics.widthPixels;
            int i4 = (int) ((f2 * f) + 0.5f);
            if (i3 != i4 && i4 == View.MeasureSpec.getSize(i)) {
                i = View.MeasureSpec.makeMeasureSpec(i3, mode);
            }
        }
        int width = this.M;
        if (width != -1) {
            z = true;
        } else if (this.N != -1) {
            width = -1;
            z = true;
        } else {
            z = false;
            width = -1;
        }
        if (width == -1) {
            width = getWidth();
        }
        int height = this.N;
        if (height == -1) {
            height = getHeight();
        }
        this.M = -1;
        this.N = -1;
        if (!z || R()) {
            Object layoutParams = getLayoutParams();
            if (layoutParams instanceof fju) {
                fju fjuVar = (fju) layoutParams;
                int iB = fjuVar.b();
                if (iB != -1) {
                    i = iB;
                }
                int iA = fjuVar.a();
                if (iA != -1) {
                    i2 = iA;
                }
            }
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            ComponentTree componentTree = this.B;
            if (componentTree != null && this.w == null) {
                K(componentTree, true);
                this.B = null;
            }
            if (!this.J && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
                this.T = true;
                setMeasuredDimension(size, size2);
            } else {
                this.K = true;
                ComponentTree componentTree2 = this.w;
                if (componentTree2 != null) {
                    boolean z3 = this.J;
                    this.J = false;
                    int iU = U(i, getPaddingRight() + getPaddingLeft());
                    int iU2 = U(i2, getPaddingTop() + getPaddingBottom());
                    int[] iArr = G;
                    componentTree2.q(iU, iU2, iArr, z3);
                    size = iArr[0];
                    size2 = iArr[1];
                    this.T = false;
                }
                if (size2 == 0) {
                    ComponentTree componentTree3 = this.w;
                    if (componentTree3 == null || (fjcVar = componentTree3.x) == null || fjcVar.n != null) {
                        Map map = this.U;
                        agfm agfmVar = map == null ? null : (agfm) map.get("LithoView:0-height");
                        if (agfmVar != null) {
                            Object layoutParams2 = getLayoutParams();
                            if (!(layoutParams2 instanceof fju) || !((fju) layoutParams2).c()) {
                                StringBuilder sb = new StringBuilder();
                                sb.append((String) agfmVar.c);
                                sb.append("-LithoView:0-height, current=");
                                ComponentTree componentTree4 = this.w;
                                sb.append(componentTree4 == null ? "null_".concat(String.valueOf(this.W)) : componentTree4.g());
                                sb.append(", previous=");
                                sb.append(this.V);
                                sb.append(", view=");
                                sb.append(LithoViewTestHelper.a(this));
                                ac(sb.toString(), agfmVar, this.y);
                            }
                        }
                    }
                    size2 = 0;
                }
                ComponentTree componentTree5 = this.w;
                if (componentTree5 != null && (!this.L || !componentTree5.t)) {
                    ComponentTree componentTree6 = this.w;
                    gzj.aS();
                    fjc fjcVar2 = componentTree6.x;
                    if (fjcVar2 != null && fjcVar2.q != null && (fjwVar = componentTree6.o) != null) {
                        fkb fkbVar = fjwVar.x;
                        if (fkbVar.B()) {
                            gzj.aS();
                            if (fkbVar.t != null) {
                                flx.e(fkbVar.x, fjcVar2);
                            }
                        }
                    }
                    ComponentTree componentTree7 = this.w;
                    int iE = componentTree7.E(width, this.L, componentTree7.F);
                    if (iE != -1) {
                        size = iE;
                    }
                    ComponentTree componentTree8 = this.w;
                    int iE2 = componentTree8.E(height, this.L, componentTree8.G);
                    if (iE2 != -1) {
                        size2 = iE2;
                    }
                }
                setMeasuredDimension(size, size2);
                this.L = false;
                this.K = false;
            }
        } else {
            setMeasuredDimension(width, height);
        }
        if (fknVarBN != null) {
            if (omjVarW == null) {
                throw null;
            }
            omj.r(fknVarBN);
        }
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        X();
    }

    @Override // android.view.View
    public final void setHasTransientState(boolean z) throws Throwable {
        super.setHasTransientState(z);
        int i = this.C;
        if (z) {
            if (i == 0 && this.w != null) {
                C(new Rect(0, 0, getWidth(), getHeight()), false);
            }
            this.C++;
            return;
        }
        int i2 = i - 1;
        this.C = i2;
        if (i2 == 0 && this.w != null) {
            D();
        }
        if (this.C < 0) {
            this.C = 0;
        }
    }

    @Override // android.view.View
    public final void setTranslationX(float f) throws Throwable {
        if (f != getTranslationX()) {
            super.setTranslationX(f);
            Y();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) throws Throwable {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            Y();
        }
    }

    @Override // android.view.View
    public final String toString() {
        return String.valueOf(super.toString()).concat(LithoViewTestHelper.viewToString(this, true));
    }

    @Override // com.facebook.litho.ComponentHost
    protected final boolean v() {
        ComponentTree componentTree = this.w;
        if (componentTree == null || !componentTree.j) {
            return super.v();
        }
        return false;
    }

    @Override // com.facebook.litho.ComponentHost
    public final void w(int i, int i2, int i3, int i4) throws Throwable {
        fkn fknVarBN;
        boolean z = fna.a;
        fhd fhdVar = this.y;
        omj omjVarW = fhdVar.w();
        if (omjVarW != null) {
            fknVarBN = gzj.bN(omjVarW, fhdVar.n(), omjVarW.p(fhdVar, 22), fhdVar.e);
        } else {
            fknVarBN = null;
        }
        ComponentTree componentTree = this.w;
        if (componentTree != null) {
            if (componentTree.z()) {
                throw new IllegalStateException("Trying to layout a LithoView holding onto a released ComponentTree");
            }
            if (this.T || componentTree.x == null) {
                this.w.q(View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i3 - i) - getPaddingRight()) - getPaddingLeft()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, ((i4 - i2) - getPaddingTop()) - getPaddingBottom()), 1073741824), G, false);
                this.L = false;
                this.T = false;
            }
            ComponentTree componentTree2 = this.w;
            gzj.aS();
            boolean zB = componentTree2.B();
            if (zB && !Q()) {
                A();
            }
            if (!zB) {
                D();
                Z(this);
            }
        }
        if (fknVarBN != null) {
            omj.r(fknVarBN);
        }
    }

    public final void z() {
        aa(this, this.z);
    }

    public fjw(Context context) {
        this(new fhd(context, null, null, null));
    }
}
