package defpackage;

import android.R;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Magnifier;
import android.widget.PopupWindow;
import com.google.android.libraries.multiplatform.elements.ElementsServices;
import com.google.android.libraries.multiplatform.elements.NodeTreeProcessor;
import com.google.android.libraries.multiplatform.elements.NodeViewInterface;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitLayer;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner;
import j$.util.Objects;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oxe implements oou, oxa, own {
    private final ElementsServices F;
    private final Executor G;
    private boolean N;
    private View.OnKeyListener P;
    private View.OnAttachStateChangeListener Q;
    private boolean S;
    private boolean T;
    private boolean U;
    private ViewTreeObserver.OnScrollChangedListener V;
    public final owm c;
    public final owy d;
    public int e;
    public int f;
    public Path g;
    public Paint h;
    public boolean i;
    public ActionMode k;
    public Object o;
    Drawable q;
    Drawable r;
    View w;
    public View.OnFocusChangeListener x;
    private static final zj X = new zj();
    private static final int[] D = {R.attr.textSelectHandleLeft, R.attr.textSelectHandleRight, R.attr.textColorHighlight, R.attr.colorControlActivated};
    public int A = 1;
    public final Path a = new Path();
    public final RectF b = new RectF();
    private final int[] E = new int[2];
    final ovo C = new ovo((byte[]) null);
    private int H = 436207616;
    private int I = 436207616;
    public final RectF j = new RectF();
    private boolean J = false;
    boolean l = false;
    public int m = -1;
    public int n = -1;
    private boolean K = false;
    private View L = null;
    public int B = 1;
    public float p = -1.0f;
    final Rect s = new Rect();
    final Rect t = new Rect();
    private final int[] M = new int[2];
    public int u = -1;
    int v = -16033840;
    private boolean O = false;
    private boolean R = false;
    final oxd y = new oxd();
    final oxd z = new oxd();
    private final ActionMode.Callback W = new owz(this);

    public oxe(owy owyVar, ElementsServices elementsServices, Executor executor) {
        this.d = owyVar;
        this.F = elementsServices;
        this.G = executor;
        this.c = new owm(owyVar, elementsServices);
    }

    private final void H(int i, boolean z) {
        owy owyVar = this.d;
        Layout layout = owyVar.m;
        if (layout != null) {
            oxd oxdVar = z ? this.y : this.z;
            if (!Objects.equals(oxdVar.a, layout) || oxdVar.b != i) {
                oxdVar.a = layout;
                oxdVar.b = i;
                oxdVar.f = layout.getLineForOffset(i);
                oxdVar.c = layout.getPrimaryHorizontal(i);
                oxdVar.d = layout.getLineBottom(oxdVar.f);
                boolean zIsRtlCharAt = layout.isRtlCharAt(i);
                if (z) {
                    zIsRtlCharAt = !zIsRtlCharAt;
                }
                oxdVar.e = zIsRtlCharAt;
            }
            Drawable drawable = oxdVar.e ? this.q : this.r;
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth <= 0) {
                    intrinsicWidth = 50;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int i2 = intrinsicHeight > 0 ? intrinsicHeight : 50;
                float f = oxdVar.c - ((int) (intrinsicWidth * (true != oxdVar.e ? 0.25f : 0.75f)));
                float f2 = oxdVar.d;
                int i3 = (int) f2;
                float f3 = f2 + i2;
                Rect rect = z ? this.s : this.t;
                int i4 = (int) f;
                int i5 = owyVar.s;
                int i6 = owyVar.t;
                rect.set(i4 + ((int) owyVar.a()) + i5, i3 + ((int) owyVar.d()) + i6, intrinsicWidth + i4 + ((int) owyVar.a()) + i5, ((int) f3) + ((int) owyVar.d()) + i6);
            }
        }
    }

    private final void I() {
        Context contextL;
        if ((this.q == null || this.r == null) && (contextL = l()) != null) {
            TypedArray typedArrayObtainStyledAttributes = contextL.getTheme().obtainStyledAttributes(D);
            this.q = typedArrayObtainStyledAttributes.getDrawable(0);
            this.r = typedArrayObtainStyledAttributes.getDrawable(1);
            this.H = this.I;
            this.v = typedArrayObtainStyledAttributes.getColor(3, -16033840);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    private final void J() {
        Object obj;
        View viewA = a();
        if (viewA != null) {
            zj zjVar = X;
            Object obj2 = zjVar.c;
            if (obj2 != null) {
                owo owoVar = (owo) obj2;
                if (Objects.equals(owoVar.getContext(), viewA.getContext())) {
                    owoVar.a = this;
                } else {
                    obj = zjVar.a;
                    if (obj != null) {
                        try {
                            ((PopupWindow) obj).dismiss();
                        } catch (RuntimeException unused) {
                        }
                    }
                    owo owoVar2 = new owo(viewA.getContext(), this);
                    zjVar.c = owoVar2;
                    zjVar.a = new PopupWindow(owoVar2, -1, -1);
                    ((PopupWindow) zjVar.a).setClippingEnabled(false);
                    ((PopupWindow) zjVar.a).setTouchable(false);
                    ((PopupWindow) zjVar.a).setFocusable(false);
                    ((PopupWindow) zjVar.a).setBackgroundDrawable(null);
                }
            } else {
                obj = zjVar.a;
                if (obj != null) {
                    ((PopupWindow) obj).dismiss();
                }
                owo owoVar3 = new owo(viewA.getContext(), this);
                zjVar.c = owoVar3;
                zjVar.a = new PopupWindow(owoVar3, -1, -1);
                ((PopupWindow) zjVar.a).setClippingEnabled(false);
                ((PopupWindow) zjVar.a).setTouchable(false);
                ((PopupWindow) zjVar.a).setFocusable(false);
                ((PopupWindow) zjVar.a).setBackgroundDrawable(null);
            }
            zjVar.b = this;
            Object obj3 = zjVar.a;
            if (obj3 != null && !((PopupWindow) obj3).isShowing()) {
                try {
                    ((PopupWindow) zjVar.a).showAtLocation(viewA, 0, 0, 0);
                } catch (RuntimeException unused2) {
                }
            }
            if (this.V == null) {
                this.V = new afbx(this, 1);
            }
            ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.V;
            if (!this.K) {
                viewA.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                this.K = true;
                this.L = viewA;
            } else {
                if (Objects.equals(this.L, viewA)) {
                    return;
                }
                View view = this.L;
                if (view != null) {
                    view.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
                }
                viewA.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                this.L = viewA;
            }
        }
    }

    public final void A(boolean z) {
        ViewParent parent;
        View viewA = a();
        if (viewA == null || (parent = viewA.getParent()) == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(z);
    }

    public final void B(View view) {
        if (this.R) {
            View.OnAttachStateChangeListener onAttachStateChangeListener = this.Q;
            if (onAttachStateChangeListener != null) {
                view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            }
            view.setOnFocusChangeListener(this.x);
            view.setOnKeyListener(null);
            view.setFocusable(this.S);
            view.setFocusableInTouchMode(this.T);
            view.setDefaultFocusHighlightEnabled(this.U);
            if (view.isFocused() && !this.S) {
                view.clearFocus();
            }
            this.R = false;
            this.x = null;
        }
    }

    public final void C(int i) {
        this.I = i;
        this.H = i;
    }

    public final void D(int i, int i2) {
        int i3;
        View view;
        rbm rbmVar;
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int i4 = this.A;
        int i5 = i4 - 1;
        View view2 = null;
        if (i4 == 0) {
            throw null;
        }
        if (i5 == 0) {
            i3 = this.I;
        } else if (i5 == 1) {
            i3 = 1149272192;
        } else if (i5 == 2 || i5 == 3) {
            i3 = this.H;
        } else {
            if (i5 != 4) {
                throw new RuntimeException(null, null);
            }
            i3 = 1149272192;
        }
        boolean z = false;
        if (iMin == 0) {
            if (iMax != 0) {
                iMin = 0;
            } else {
                if (this.e == 0 && this.f == 0) {
                    return;
                }
                iMin = 0;
                iMax = 0;
            }
        }
        Paint paint = this.h;
        boolean z2 = paint == null || paint.getColor() != i3;
        boolean z3 = (this.e == iMin && this.f == iMax) ? false : true;
        View viewA = a();
        if (!z2 && !z3) {
            owo owoVarU = u();
            if (!k() || viewA == null) {
                return;
            }
            if (owoVarU == null || !owoVarU.isShown()) {
                I();
                J();
                h();
                return;
            }
            return;
        }
        this.e = iMin;
        this.f = iMax;
        this.O = i > i2;
        ActionMode actionMode = this.k;
        if (z3 && actionMode != null) {
            owy owyVar = this.d;
            CharSequence charSequenceK = owyVar.k();
            if (charSequenceK != null && Math.min(iMin, iMax) == 0 && Math.max(iMin, iMax) == charSequenceK.length()) {
                z = true;
            }
            boolean z4 = this.N;
            this.N = z;
            if (z != z4) {
                Object obj = owyVar.q;
                if (obj instanceof View) {
                    ((View) obj).post(new ooz(this, 16));
                } else {
                    actionMode.invalidate();
                }
            }
            actionMode.invalidateContentRect();
        }
        if (this.e != this.f) {
            agfr agfrVarT = this.F.t();
            if (agfrVarT != null && (rbmVar = (rbm) agfrVarT.io()) != null) {
                rbmVar.e(this);
            }
            Paint paint2 = this.h;
            if (paint2 == null) {
                paint2 = new Paint();
                this.h = paint2;
            }
            paint2.setColor(i3);
            this.i = true;
        } else {
            this.i = true;
            y();
        }
        if (this.A == 4 && iMin != iMax && this.B == 1) {
            CharSequence charSequenceK2 = this.d.k();
            if (charSequenceK2 == null) {
                view = viewA;
            } else if (viewA != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    int i6 = iMax;
                    Context contextL = l();
                    if (contextL == null) {
                        F(viewA);
                        view = viewA;
                    } else {
                        view = viewA;
                        this.G.execute(new oxb(this, contextL, iMin, charSequenceK2, i6, view, 0));
                    }
                } else {
                    view = viewA;
                    F(view);
                }
            }
            if (k() && view2 != null) {
                I();
                J();
                h();
            }
            this.d.s();
        }
        view = viewA;
        this.o = null;
        view2 = view;
        if (k()) {
            I();
            J();
            h();
        }
        this.d.s();
    }

    final void E(View view, float f, int i) {
        owm owmVar;
        owl owlVar;
        View viewA = a();
        int i2 = this.B;
        int i3 = this.e;
        int i4 = this.f;
        int i5 = Build.VERSION.SDK_INT;
        owm owmVar2 = this.c;
        if (i5 < 28) {
            return;
        }
        try {
            if (owmVar2.f == null) {
                Object obj = owmVar2.h.a;
                if (Build.VERSION.SDK_INT >= 28) {
                    try {
                        owlVar = new owl(new Magnifier(view));
                    } catch (IllegalArgumentException unused) {
                        owlVar = null;
                    }
                } else {
                    owlVar = null;
                }
                owmVar2.f = owlVar;
            }
            owmVar = owmVar2;
            try {
                owmVar.b(f, i, i2, i3, i4, viewA);
            } catch (IllegalArgumentException unused2) {
                owmVar.f = null;
            }
        } catch (IllegalArgumentException unused3) {
            owmVar = owmVar2;
        }
    }

    final void F(View view) {
        ActionMode actionMode = this.k;
        if (actionMode != null) {
            actionMode.invalidate();
            return;
        }
        ActionMode.Callback callback = this.W;
        if (callback != null) {
            this.k = view.startActionMode(callback, 1);
        }
    }

    public final boolean G() {
        return (this.e == this.f || Color.alpha(this.H) == 0) ? false : true;
    }

    @Override // defpackage.oou, defpackage.own
    public final View a() {
        View view = this.w;
        if (view != null) {
            return view;
        }
        for (PaintUnitOwner paintUnitOwnerR = this.d.q; paintUnitOwnerR != null; paintUnitOwnerR = ((PaintUnitLayer) paintUnitOwnerR).r()) {
            if (paintUnitOwnerR instanceof View) {
                return (View) paintUnitOwnerR;
            }
            if (!(paintUnitOwnerR instanceof PaintUnitLayer)) {
                break;
            }
        }
        return null;
    }

    @Override // defpackage.oou, defpackage.oxa
    public final void b() {
        rbm rbmVar;
        if (this.J) {
            return;
        }
        this.J = true;
        try {
            agfr agfrVarT = this.F.t();
            if (agfrVarT != null && (rbmVar = (rbm) agfrVarT.io()) != null && Objects.equals(rbmVar.b, this)) {
                rbmVar.e(null);
            }
            y();
            zj zjVar = X;
            if (Objects.equals(zjVar.b, this)) {
                View view = this.L;
                if (view != null && this.V != null && this.K) {
                    view.getViewTreeObserver().removeOnScrollChangedListener(this.V);
                }
                this.K = false;
                this.L = null;
                Object obj = zjVar.a;
                if (obj != null) {
                    try {
                        ((PopupWindow) obj).dismiss();
                    } catch (RuntimeException unused) {
                    }
                }
                zj zjVar2 = X;
                Object obj2 = zjVar2.c;
                if (obj2 != null) {
                    ((owo) obj2).a = null;
                }
                zjVar2.c = null;
                zjVar2.a = null;
                zjVar2.b = null;
            }
            this.A = 1;
            this.m = -1;
            this.n = -1;
            this.c.a();
            View viewA = a();
            if (viewA != null) {
                A(false);
                B(viewA);
            }
            this.w = null;
            if (this.e != 0 || this.f != 0) {
                D(0, 0);
            }
        } finally {
            this.J = false;
        }
    }

    @Override // defpackage.oou
    public final boolean c(MotionEvent motionEvent) {
        owo owoVarU = u();
        boolean zOnTouchEvent = false;
        if (owoVarU != null) {
            int[] iArr = this.E;
            owoVarU.getLocationOnScreen(iArr);
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.offsetLocation(-iArr[0], -iArr[1]);
            try {
                zOnTouchEvent = owoVarU.onTouchEvent(motionEventObtain);
            } finally {
                motionEventObtain.recycle();
            }
        }
        return zOnTouchEvent;
    }

    @Override // defpackage.oou
    public final boolean d() {
        return this.d.j && this.A != 1;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:59:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0027  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oou
    public final boolean e(float f, float f2) {
        View viewA;
        View viewA2;
        NodeTreeProcessor nodeTreeProcessorM;
        owo owoVarU = u();
        if (owoVarU == null) {
            viewA = a();
            Layout layoutG = g();
            if (viewA == null) {
                viewA2 = a();
                if (viewA2 instanceof NodeViewInterface) {
                    return false;
                }
                return false;
            }
            viewA2 = a();
            if (viewA2 instanceof NodeViewInterface) {
                return false;
            }
            return false;
        }
        int[] iArr = this.M;
        owoVarU.getLocationOnScreen(iArr);
        float f3 = f - iArr[0];
        float f4 = f2 - iArr[1];
        if (!owoVarU.b(owoVarU.b, f3, f4) && !owoVarU.b(owoVarU.c, f3, f4)) {
            viewA = a();
            Layout layoutG2 = g();
            if (viewA == null && layoutG2 != null && this.e != this.f) {
                int[] iArr2 = this.M;
                viewA.getLocationOnScreen(iArr2);
                float f5 = f - iArr2[0];
                owy owyVar = this.d;
                float fA = (f5 - owyVar.s) - owyVar.a();
                float fD = ((f2 - iArr2[1]) - owyVar.t) - owyVar.d();
                int iMin = Math.min(this.e, this.f);
                int iMax = Math.max(this.e, this.f);
                int lineForOffset = layoutG2.getLineForOffset(iMin);
                int lineForOffset2 = layoutG2.getLineForOffset(iMax);
                int i = lineForOffset;
                while (i <= lineForOffset2) {
                    float lineTop = layoutG2.getLineTop(i);
                    float lineBottom = layoutG2.getLineBottom(i);
                    if (fD >= lineTop && fD <= lineBottom) {
                        float primaryHorizontal = i == lineForOffset ? layoutG2.getPrimaryHorizontal(iMin) : layoutG2.getLineLeft(i);
                        float primaryHorizontal2 = i == lineForOffset2 ? layoutG2.getPrimaryHorizontal(iMax) : layoutG2.getLineRight(i);
                        if (primaryHorizontal > primaryHorizontal2) {
                            float f6 = primaryHorizontal2;
                            primaryHorizontal2 = primaryHorizontal;
                            primaryHorizontal = f6;
                        }
                        if (fA < primaryHorizontal || fA > primaryHorizontal2) {
                        }
                    }
                    i++;
                }
                viewA2 = a();
                if (viewA2 instanceof NodeViewInterface) {
                    return false;
                }
                return false;
            }
            viewA2 = a();
            if ((viewA2 instanceof NodeViewInterface) || (nodeTreeProcessorM = ((NodeViewInterface) viewA2).m()) == null) {
                return false;
            }
            ViewParent parent = viewA2.getParent();
            while (parent != null && !(parent instanceof ooy)) {
                parent = parent.getParent();
            }
            if (!(parent instanceof ooy)) {
                return false;
            }
            ooy ooyVar = (ooy) parent;
            int[] iArr3 = this.M;
            ooyVar.getLocationOnScreen(iArr3);
            PaintUnit paintUnitIh = ooyVar.ih(nodeTreeProcessorM.d(f - iArr3[0], f2 - iArr3[1]));
            if (!(paintUnitIh instanceof owy) || ((owy) paintUnitIh).j) {
                return false;
            }
            this.l = true;
        }
        return true;
    }

    @Override // defpackage.oou
    public final boolean f() {
        int i = this.A;
        return i == 4 || i == 3;
    }

    @Override // defpackage.own
    public final Layout g() {
        return this.d.m;
    }

    @Override // defpackage.own
    public final void h() {
        owo owoVarU = u();
        View viewA = a();
        if (owoVarU == null || viewA == null) {
            return;
        }
        H(this.e, true);
        H(this.f, false);
        int[] iArr = new int[2];
        viewA.getLocationOnScreen(iArr);
        owy owyVar = this.d;
        int i = owyVar.s;
        int i2 = owyVar.t;
        float fA = iArr[0] + i + owyVar.a();
        oxd oxdVar = this.y;
        float f = fA + oxdVar.c;
        float fD = iArr[1] + i2 + owyVar.d() + oxdVar.d;
        float fA2 = iArr[0] + i + owyVar.a();
        oxd oxdVar2 = this.z;
        float f2 = fA2 + oxdVar2.c;
        float fD2 = iArr[1] + i2 + owyVar.d() + oxdVar2.d;
        boolean z = oxdVar.e;
        boolean z2 = oxdVar2.e;
        boolean z3 = owoVarU.j;
        boolean z4 = owoVarU.k;
        owoVarU.j = z;
        owoVarU.k = z2;
        own ownVar = owoVarU.a;
        if (ownVar == null || ownVar.i()) {
            Rect rect = owoVarU.b;
            if (rect.isEmpty() && owoVarU.c.isEmpty()) {
                return;
            }
            rect.setEmpty();
            owoVarU.c.setEmpty();
            if (Build.VERSION.SDK_INT >= 29) {
                owoVarU.setSystemGestureExclusionRects(agpi.a);
            }
            owoVarU.invalidate();
            return;
        }
        int[] iArr2 = owoVarU.d;
        owoVarU.getLocationOnScreen(iArr2);
        float f3 = iArr2[0];
        float f4 = f - f3;
        float f5 = iArr2[1];
        float f6 = fD - f5;
        float f7 = f2 - f3;
        float f8 = fD2 - f5;
        Rect rect2 = owoVarU.h;
        Rect rect3 = owoVarU.b;
        rect2.set(rect3);
        Rect rect4 = owoVarU.i;
        Rect rect5 = owoVarU.c;
        rect4.set(rect5);
        owo.a(rect3, z ? ((oxe) ownVar).q : ((oxe) ownVar).r, f4, f6, z);
        owo.a(rect5, z2 ? ((oxe) ownVar).q : ((oxe) ownVar).r, f7, f8, z2);
        if (rect3.equals(rect2) && rect5.equals(rect4) && z == z3 && z2 == z4) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = owoVarU.e;
            arrayList.clear();
            if (!rect3.isEmpty()) {
                Rect rect6 = owoVarU.f;
                rect6.set(rect3);
                arrayList.add(rect6);
            }
            if (!rect5.isEmpty()) {
                Rect rect7 = owoVarU.g;
                rect7.set(rect5);
                arrayList.add(rect7);
            }
            owoVarU.setSystemGestureExclusionRects(arrayList);
        }
        owoVarU.invalidate();
    }

    @Override // defpackage.own
    public final boolean i() {
        int i = this.A;
        return i == 5 || i == 2;
    }

    @Override // defpackage.own
    public final boolean j(float f, boolean z) {
        owm owmVar;
        owy owyVar;
        Layout layout;
        int i = this.B;
        int i2 = this.e;
        int i3 = this.f;
        Drawable drawable = this.q;
        if (!z || (layout = (owyVar = (owmVar = this.c).g).m) == null || i == 1 || i == 2) {
            return false;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        int lineForOffset2 = layout.getLineForOffset(i3);
        float fMin = owmVar.b;
        float height = owmVar.c;
        if (owmVar.f != null && Build.VERSION.SDK_INT >= 28) {
            fMin = Math.min(fMin, owmVar.f.a.getWidth() / 2.0f);
            height = owmVar.f.a.getHeight();
        }
        if (lineForOffset2 <= lineForOffset) {
            return false;
        }
        if (layout.getLineBottom(lineForOffset2) - layout.getLineBottom(lineForOffset) <= height + owmVar.e) {
            return Math.abs(f - (layout.getPrimaryHorizontal(i2) + owyVar.a())) <= fMin + (drawable != null ? ((float) drawable.getIntrinsicWidth()) / 2.0f : owmVar.d);
        }
        return false;
    }

    @Override // defpackage.own
    public final boolean k() {
        int i = this.A;
        return i == 4 || i == 3 || i == 5;
    }

    @Override // defpackage.oxa
    public final Context l() {
        return this.F.c();
    }

    @Override // defpackage.oxa
    public final CharSequence m() {
        return this.d.k();
    }

    @Override // defpackage.oxa
    public final void n() {
        int i;
        int i2;
        ClipboardManager clipboardManager;
        CharSequence charSequenceK = this.d.k();
        if (charSequenceK == null || (i = this.e) == (i2 = this.f)) {
            return;
        }
        CharSequence charSequenceSubSequence = charSequenceK.subSequence(Math.min(i, i2), Math.max(this.e, this.f));
        Context contextL = l();
        if (contextL == null || (clipboardManager = (ClipboardManager) contextL.getSystemService("clipboard")) == null) {
            return;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("RenderNext Text Selection", charSequenceSubSequence));
    }

    @Override // defpackage.oxa
    public final void o() {
        CharSequence charSequenceK = this.d.k();
        if (charSequenceK != null) {
            int length = charSequenceK.length();
            this.A = 4;
            D(0, length);
        }
    }

    @Override // defpackage.oxa
    public final void p() {
        int i;
        int i2;
        CharSequence charSequenceK = this.d.k();
        if (charSequenceK == null || (i = this.e) == (i2 = this.f)) {
            return;
        }
        CharSequence charSequenceSubSequence = charSequenceK.subSequence(Math.min(i, i2), Math.max(this.e, this.f));
        Context contextL = l();
        if (contextL != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", charSequenceSubSequence.toString());
            try {
                contextL.startActivity(Intent.createChooser(intent, null));
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    @Override // defpackage.oxa
    public final void q() {
        int i;
        int i2;
        CharSequence charSequenceK = this.d.k();
        if (charSequenceK == null || (i = this.e) == (i2 = this.f)) {
            return;
        }
        CharSequence charSequenceSubSequence = charSequenceK.subSequence(Math.min(i, i2), Math.max(this.e, this.f));
        Context contextL = l();
        if (contextL != null) {
            Intent intent = new Intent("android.intent.action.WEB_SEARCH");
            intent.putExtra("query", charSequenceSubSequence.toString());
            try {
                contextL.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    public final int r(float f, float f2, int i) {
        Layout layoutG = g();
        if (layoutG == null) {
            return -1;
        }
        if (i < 0 || i >= layoutG.getLineCount()) {
            i = layoutG.getLineForVertical((int) f2);
        } else {
            int lineTop = layoutG.getLineTop(i);
            int lineBottom = layoutG.getLineBottom(i);
            float f3 = (lineBottom - lineTop) * 0.35f;
            if (f2 < lineTop - f3 || f2 > lineBottom + f3) {
                i = layoutG.getLineForVertical((int) f2);
            }
        }
        int iMax = Math.max(0, Math.min(i, layoutG.getLineCount() - 1));
        int offsetForHorizontal = layoutG.getOffsetForHorizontal(iMax, Math.max(layoutG.getLineLeft(iMax), Math.min(f, layoutG.getLineRight(iMax))));
        this.u = iMax;
        return offsetForHorizontal;
    }

    public final int s() {
        return this.O ? this.f : this.e;
    }

    public final int t() {
        return this.O ? this.e : this.f;
    }

    final owo u() {
        zj zjVar = X;
        if (Objects.equals(zjVar.b, this)) {
            return (owo) zjVar.c;
        }
        return null;
    }

    final void v() {
        this.c.a();
    }

    public final void w(View view) {
        this.w = view;
        if (!this.R) {
            this.S = view.isFocusable();
            this.T = view.isFocusableInTouchMode();
            this.x = view.getOnFocusChangeListener();
            this.U = view.getDefaultFocusHighlightEnabled();
            this.R = true;
            if (this.Q == null) {
                this.Q = new jh(this, 3);
            }
            view.addOnAttachStateChangeListener(this.Q);
        }
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.setDefaultFocusHighlightEnabled(false);
        view.setOnFocusChangeListener(new gxs(this, 4));
        if (this.P == null) {
            this.P = new grw(this, 2);
        }
        view.setOnKeyListener(this.P);
        view.requestFocus();
    }

    public final void x(int i) {
        CharSequence charSequenceK;
        if (this.m < 0 || (charSequenceK = this.d.k()) == null) {
            return;
        }
        ovo ovoVar = this.C;
        int[] iArrF = ovoVar.f(charSequenceK, this.m);
        int i2 = iArrF[0];
        int i3 = iArrF[1];
        int[] iArrF2 = ovoVar.f(charSequenceK, i);
        int i4 = iArrF2[0];
        int i5 = iArrF2[1];
        if (i < this.m) {
            D(i3, i4);
        } else {
            D(i2, i5);
        }
    }

    public final void y() {
        v();
        ActionMode actionMode = this.k;
        if (actionMode != null) {
            this.k = null;
            actionMode.finish();
        }
    }

    public final void z(int i, boolean z) {
        CharSequence charSequenceK;
        if (!k() || (charSequenceK = this.d.k()) == null) {
            return;
        }
        int length = charSequenceK.length();
        int iS = s();
        int iT = t();
        if (z) {
            ovo ovoVar = this.C;
            if (!TextUtils.isEmpty(charSequenceK)) {
                int length2 = charSequenceK.length();
                BreakIterator breakIteratorE = ovoVar.e(charSequenceK);
                if (i > 0) {
                    iT = breakIteratorE.following(iT);
                    while (iT != -1 && iT < length2) {
                        if (!Character.isLetterOrDigit(charSequenceK.charAt(iT - 1))) {
                            iT = breakIteratorE.following(iT);
                        }
                    }
                    iT = length2;
                } else {
                    iT = breakIteratorE.preceding(iT);
                    while (iT != -1 && iT > 0) {
                        if (!Character.isLetterOrDigit(charSequenceK.charAt(iT))) {
                            iT = breakIteratorE.preceding(iT);
                        }
                    }
                    iT = 0;
                }
            }
        } else {
            iT += i;
        }
        D(iS, Math.max(0, Math.min(iT, length)));
    }
}
