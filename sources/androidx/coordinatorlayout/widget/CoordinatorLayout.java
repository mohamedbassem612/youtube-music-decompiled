package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.music.R;
import defpackage.aha;
import defpackage.asr;
import defpackage.ass;
import defpackage.ast;
import defpackage.asu;
import defpackage.asv;
import defpackage.asw;
import defpackage.asx;
import defpackage.asy;
import defpackage.axr;
import defpackage.axt;
import defpackage.ayu;
import defpackage.ayv;
import defpackage.ayw;
import defpackage.ayx;
import defpackage.azs;
import defpackage.bac;
import defpackage.bbn;
import defpackage.bcs;
import defpackage.djl;
import defpackage.fsd;
import defpackage.geq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements ayu, ayv {
    public static final String a;
    public static final Class[] b;
    public static final ThreadLocal c;
    static final Comparator d;
    public static final /* synthetic */ int i = 0;
    private static final axr j;
    public bbn e;
    public boolean f;
    public ViewGroup.OnHierarchyChangeListener g;
    public final djl h;
    private final List k;
    private final List l;
    private Paint m;
    private final int[] n;
    private final int[] o;
    private final int[] p;
    private boolean q;
    private boolean r;
    private int[] s;
    private View t;
    private View u;
    private boolean v;
    private Drawable w;
    private ayx x;
    private final ayw y;
    private fsd z;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        a = r0 != null ? r0.getName() : null;
        d = new asx(0);
        b = new Class[]{Context.class, AttributeSet.class};
        c = new ThreadLocal();
        j = new axt(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, i2);
        this.k = new ArrayList();
        this.h = new djl();
        this.l = new ArrayList();
        this.n = new int[2];
        this.o = new int[2];
        this.p = new int[2];
        this.y = new ayw();
        if (i2 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, asr.a, 0, R.style.Widget_Support_CoordinatorLayout);
            bac.o(this, context, asr.a, attributeSet, typedArrayObtainStyledAttributes, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, asr.a, i2, 0);
            bac.o(this, context, asr.a, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.s = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.s.length;
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArr = this.s;
                iArr[i3] = (int) (iArr[i3] * f);
            }
        }
        this.w = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new geq(this, 1));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private final boolean A(ast astVar, View view, MotionEvent motionEvent, int i2) {
        return i2 != 0 ? astVar.onTouchEvent(this, view, motionEvent) : astVar.onInterceptTouchEvent(this, view, motionEvent);
    }

    private final boolean B(MotionEvent motionEvent, int i2) {
        boolean zBlocksInteractionBelow;
        int actionMasked = motionEvent.getActionMasked();
        List list = this.l;
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator comparator = d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEventD = null;
        boolean zA = false;
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            asv asvVar = (asv) view.getLayoutParams();
            ast astVar = asvVar.a;
            if (!(zA || z) || actionMasked == 0) {
                if (!z && !zA && astVar != null && (zA = A(astVar, view, motionEvent, i2))) {
                    this.t = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i5 = 0; i5 < i4; i5++) {
                            View view2 = (View) list.get(i5);
                            ast astVar2 = ((asv) view2.getLayoutParams()).a;
                            if (astVar2 != null) {
                                if (motionEventD == null) {
                                    motionEventD = D(motionEvent);
                                }
                                A(astVar2, view2, motionEventD, i2);
                            }
                        }
                    }
                }
                ast astVar3 = asvVar.a;
                if (astVar3 == null) {
                    asvVar.m = false;
                }
                boolean z2 = asvVar.m;
                if (z2) {
                    zBlocksInteractionBelow = true;
                } else {
                    zBlocksInteractionBelow = astVar3 != null ? astVar3.blocksInteractionBelow(this, view) : false;
                    asvVar.m = zBlocksInteractionBelow;
                }
                boolean z3 = zBlocksInteractionBelow && !z2;
                if (zBlocksInteractionBelow && !z3) {
                    break;
                }
                z = z3;
            } else if (astVar != null) {
                if (motionEventD == null) {
                    motionEventD = D(motionEvent);
                }
                A(astVar, view, motionEventD, i2);
            }
        }
        list.clear();
        if (motionEventD != null) {
            motionEventD.recycle();
        }
        return zA;
    }

    private static final void C(int i2, Rect rect, Rect rect2, asv asvVar, int i3, int i4) {
        int iWidth;
        int iHeight;
        int i5 = asvVar.c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(r(asvVar.d), i2);
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            iWidth = i8 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            iHeight = i9 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i6 == 1) {
            iWidth -= i3 / 2;
        } else if (i6 != 5) {
            iWidth -= i3;
        }
        if (i7 == 16) {
            iHeight -= i4 / 2;
        } else if (i7 != 80) {
            iHeight -= i4;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i4 + iHeight);
    }

    private static final MotionEvent D(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        return motionEventObtain;
    }

    private static final void E(View view, int i2) {
        asv asvVar = (asv) view.getLayoutParams();
        int i3 = asvVar.i;
        if (i3 != i2) {
            int i4 = bac.a;
            view.offsetLeftAndRight(i2 - i3);
            asvVar.i = i2;
        }
    }

    private static final void F(View view, int i2) {
        asv asvVar = (asv) view.getLayoutParams();
        int i3 = asvVar.j;
        if (i3 != i2) {
            int i4 = bac.a;
            view.offsetTopAndBottom(i2 - i3);
            asvVar.j = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final asv m(View view) {
        asv asvVar = (asv) view.getLayoutParams();
        if (!asvVar.b) {
            if (view instanceof ass) {
                ast astVarA = ((ass) view).a();
                if (astVarA == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                asvVar.b(astVarA);
                asvVar.b = true;
            } else {
                asu asuVar = null;
                for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                    asuVar = (asu) superclass.getAnnotation(asu.class);
                    if (asuVar != null) {
                        break;
                    }
                }
                if (asuVar != null) {
                    try {
                        asvVar.b((ast) asuVar.a().getDeclaredConstructor(null).newInstance(null));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + asuVar.a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                asvVar.b = true;
            }
        }
        return asvVar;
    }

    private final int n() {
        return o() - getHeight();
    }

    private final int o() {
        int height = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            asv asvVar = (asv) childAt.getLayoutParams();
            height += childAt.getHeight() + asvVar.topMargin + asvVar.bottomMargin;
        }
        return height;
    }

    private final int p(int i2) {
        int[] iArr = this.s;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    private final int q() {
        return (int) (getHeight() * 0.2f);
    }

    private static int r(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    private static int s(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private static Rect u() {
        Rect rect = (Rect) j.a();
        return rect == null ? new Rect() : rect;
    }

    private final void v(asv asvVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + asvVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - asvVar.rightMargin));
        int iMax2 = Math.max(getPaddingTop() + asvVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - asvVar.bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    private static void w(Rect rect) {
        rect.setEmpty();
        j.b(rect);
    }

    private final void x() {
        View view = this.t;
        if (view != null) {
            ast astVar = ((asv) view.getLayoutParams()).a;
            if (astVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                astVar.onTouchEvent(this, this.t, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.t = null;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((asv) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.q = false;
    }

    private final void y() {
        int i2 = bac.a;
        if (!getFitsSystemWindows()) {
            azs.c(this, null);
            return;
        }
        if (this.x == null) {
            this.x = new bcs(this, 1, null);
        }
        azs.c(this, this.x);
        setSystemUiVisibility(1280);
    }

    private final boolean z(int i2) {
        View view;
        View focusedChild = this;
        while (true) {
            view = null;
            if (focusedChild != null) {
                if (focusedChild.isFocused()) {
                    view = focusedChild;
                    break;
                }
                focusedChild = focusedChild instanceof ViewGroup ? ((ViewGroup) focusedChild).getFocusedChild() : null;
            } else {
                break;
            }
        }
        t(this, view, 2, 1);
        int[] iArr = this.p;
        d(view, 0, i2, iArr, 1);
        int i3 = iArr[1];
        iArr[0] = 0;
        iArr[1] = 0;
        f(view, 0, i3, 0, i2, 1, iArr);
        h(view, 1);
        return iArr[1] > 0;
    }

    public final List a(View view) {
        aha ahaVar = (aha) this.h.d;
        int i2 = ahaVar.d;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) ahaVar.g(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ahaVar.d(i3));
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    public final void b(View view) {
        ArrayList arrayListF = this.h.f(view);
        if (arrayListF == null || arrayListF.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < arrayListF.size(); i2++) {
            View view2 = (View) arrayListF.get(i2);
            ast astVar = ((asv) view2.getLayoutParams()).a;
            if (astVar != null) {
                astVar.onDependentViewChanged(this, view2, view);
            }
        }
    }

    final void c(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else {
            if (!z) {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
            int i2 = asy.a;
            rect.set(0, 0, view.getWidth(), view.getHeight());
            asy.a(this, view, rect);
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof asv) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.ayu
    public final void d(View view, int i2, int i3, int[] iArr, int i4) {
        ast astVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                asv asvVar = (asv) childAt.getLayoutParams();
                if (asvVar.d(i4) && (astVar = asvVar.a) != null) {
                    int[] iArr2 = this.n;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    astVar.onNestedPreScroll(this, childAt, view, i2, i3, iArr2, i4);
                    iMax = i2 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i3 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            i(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (zDispatchKeyEvent || keyEvent.getAction() != 0) {
            return zDispatchKeyEvent;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return keyEvent.isAltPressed() ? z(-getHeight()) : z(-q());
        }
        if (keyCode == 20) {
            return keyEvent.isAltPressed() ? z(getHeight()) : z(q());
        }
        if (keyCode == 62) {
            return keyEvent.isShiftPressed() ? z(-o()) : z(n());
        }
        if (keyCode == 92) {
            return z(-getHeight());
        }
        if (keyCode == 93) {
            return z(getHeight());
        }
        if (keyCode != 122) {
            return keyCode == 123 ? z(n()) : zDispatchKeyEvent;
        }
        return z(-o());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x008a  */
    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j2) {
        Canvas canvas2;
        asv asvVar = (asv) view.getLayoutParams();
        ast astVar = asvVar.a;
        if (astVar != null) {
            float scrimOpacity = astVar.getScrimOpacity(this, view);
            if (scrimOpacity > 0.0f) {
                Paint paint = this.m;
                if (paint == null) {
                    paint = new Paint();
                    this.m = paint;
                }
                paint.setColor(asvVar.a.getScrimColor(this, view));
                Paint paint2 = this.m;
                int iRound = Math.round(scrimOpacity * 255.0f);
                if (iRound < 0) {
                    iRound = 0;
                } else if (iRound > 255) {
                    iRound = 255;
                }
                paint2.setAlpha(iRound);
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas2 = canvas;
                    canvas2.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                } else {
                    canvas2 = canvas;
                }
                canvas2.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.m);
                canvas2.restoreToCount(iSave);
            } else {
                canvas2 = canvas;
            }
        } else {
            canvas2 = canvas;
        }
        return super.drawChild(canvas2, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.w;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.ayu
    public final void e(View view, int i2, int i3, int i4, int i5, int i6) {
        f(view, i2, i3, i4, i5, 0, this.o);
    }

    @Override // defpackage.ayv
    public final void f(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        ast astVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                asv asvVar = (asv) childAt.getLayoutParams();
                if (asvVar.d(i6) && (astVar = asvVar.a) != null) {
                    int[] iArr2 = this.n;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    astVar.onNestedScroll(this, childAt, view, i2, i3, i4, i5, i6, iArr2);
                    iMax = i4 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i5 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            i(1);
        }
    }

    @Override // defpackage.ayu
    public final void g(View view, View view2, int i2, int i3) {
        CoordinatorLayout coordinatorLayout;
        View view3;
        View view4;
        int i4;
        int i5;
        ast astVar;
        this.y.b(i2, i3);
        this.u = view2;
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = this.getChildAt(i6);
            asv asvVar = (asv) childAt.getLayoutParams();
            if (!asvVar.d(i3) || (astVar = asvVar.a) == null) {
                coordinatorLayout = this;
                view3 = view;
                view4 = view2;
                i4 = i2;
                i5 = i3;
            } else {
                coordinatorLayout = this;
                view3 = view;
                view4 = view2;
                i4 = i2;
                i5 = i3;
                astVar.onNestedScrollAccepted(coordinatorLayout, childAt, view3, view4, i4, i5);
            }
            i6++;
            this = coordinatorLayout;
            view = view3;
            view2 = view4;
            i2 = i4;
            i3 = i5;
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new asv();
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof asv) {
            return new asv((asv) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new asv((ViewGroup.MarginLayoutParams) layoutParams) : new asv(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.y.a();
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // defpackage.ayu
    public final void h(View view, int i2) {
        this.y.c(i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            asv asvVar = (asv) childAt.getLayoutParams();
            if (asvVar.d(i2)) {
                ast astVar = asvVar.a;
                if (astVar != null) {
                    astVar.onStopNestedScroll(this, childAt, view, i2);
                }
                asvVar.c(i2, false);
                asvVar.a();
            }
        }
        this.u = null;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0288  */
    /* JADX WARN: Code duplicated, block: B:31:0x00df  */
    public final void i(int i2) {
        int i3;
        ast astVar;
        boolean zOnDependentViewChanged;
        List list;
        boolean z;
        boolean z2;
        int width;
        int i4;
        int height;
        int i5;
        asv asvVar;
        ast astVar2;
        List list2 = this.k;
        int layoutDirection = getLayoutDirection();
        int size = list2.size();
        Rect rectU = u();
        Rect rectU2 = u();
        Rect rectU3 = u();
        int i6 = 0;
        while (i6 < size) {
            View view = (View) list2.get(i6);
            asv asvVar2 = (asv) view.getLayoutParams();
            if (i2 == 0 && view.getVisibility() == 8) {
                list = list2;
                i3 = i6;
            } else {
                int i7 = 0;
                while (i7 < i6) {
                    if (asvVar2.l == ((View) list2.get(i7))) {
                        asv asvVar3 = (asv) view.getLayoutParams();
                        if (asvVar3.k != null) {
                            asv asvVar4 = asvVar2;
                            Rect rectU4 = u();
                            Rect rectU5 = u();
                            Rect rectU6 = u();
                            View view2 = asvVar3.k;
                            int i8 = asy.a;
                            rectU4.set(0, 0, view2.getWidth(), view2.getHeight());
                            asy.a(this, view2, rectU4);
                            c(view, false, rectU5);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            asvVar = asvVar4;
                            layoutDirection = layoutDirection;
                            C(layoutDirection, rectU4, rectU6, asvVar3, measuredWidth, measuredHeight);
                            boolean z3 = (rectU6.left == rectU5.left && rectU6.top == rectU5.top) ? false : true;
                            v(asvVar3, rectU6, measuredWidth, measuredHeight);
                            int i9 = rectU6.left - rectU5.left;
                            int i10 = rectU6.top - rectU5.top;
                            if (i9 != 0) {
                                int i11 = bac.a;
                                view.offsetLeftAndRight(i9);
                            }
                            if (i10 != 0) {
                                int i12 = bac.a;
                                view.offsetTopAndBottom(i10);
                            }
                            if (z3 && (astVar2 = asvVar3.a) != null) {
                                astVar2.onDependentViewChanged(this, view, asvVar3.k);
                            }
                            rectU4.setEmpty();
                            axr axrVar = j;
                            axrVar.b(rectU4);
                            rectU5.setEmpty();
                            axrVar.b(rectU5);
                            rectU6.setEmpty();
                            axrVar.b(rectU6);
                        } else {
                            asvVar = asvVar2;
                        }
                    } else {
                        asvVar = asvVar2;
                    }
                    i7++;
                    list2 = list2;
                    i6 = i6;
                    asvVar2 = asvVar;
                }
                List list3 = list2;
                asv asvVar5 = asvVar2;
                i3 = i6;
                c(view, true, rectU2);
                if (asvVar5.g != 0 && !rectU2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(asvVar5.g, layoutDirection);
                    int i13 = absoluteGravity & 112;
                    if (i13 == 48) {
                        rectU.top = Math.max(rectU.top, rectU2.bottom);
                    } else if (i13 == 80) {
                        rectU.bottom = Math.max(rectU.bottom, getHeight() - rectU2.top);
                    }
                    int i14 = absoluteGravity & 7;
                    if (i14 == 3) {
                        rectU.left = Math.max(rectU.left, rectU2.right);
                    } else if (i14 == 5) {
                        rectU.right = Math.max(rectU.right, getWidth() - rectU2.left);
                    }
                }
                if (asvVar5.h != 0 && view.getVisibility() == 0 && view.isLaidOut() && view.getWidth() > 0 && view.getHeight() > 0) {
                    asv asvVar6 = (asv) view.getLayoutParams();
                    ast astVar3 = asvVar6.a;
                    Rect rectU7 = u();
                    Rect rectU8 = u();
                    rectU8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (astVar3 == null || !astVar3.getInsetDodgeRect(this, view, rectU7)) {
                        rectU7.set(rectU8);
                    } else if (!rectU8.contains(rectU7)) {
                        throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectU7.toShortString() + " | Bounds:" + rectU8.toShortString());
                    }
                    rectU8.setEmpty();
                    axr axrVar2 = j;
                    axrVar2.b(rectU8);
                    if (rectU7.isEmpty()) {
                        rectU7.setEmpty();
                        axrVar2.b(rectU7);
                    } else {
                        int absoluteGravity2 = Gravity.getAbsoluteGravity(asvVar6.h, layoutDirection);
                        if ((absoluteGravity2 & 48) != 48 || (i5 = (rectU7.top - asvVar6.topMargin) - asvVar6.j) >= rectU.top) {
                            z = false;
                        } else {
                            F(view, rectU.top - i5);
                            z = true;
                        }
                        if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - rectU7.bottom) - asvVar6.bottomMargin) + asvVar6.j) < rectU.bottom) {
                            F(view, height - rectU.bottom);
                        } else if (!z) {
                            F(view, 0);
                        }
                        if ((absoluteGravity2 & 3) != 3 || (i4 = (rectU7.left - asvVar6.leftMargin) - asvVar6.i) >= rectU.left) {
                            z2 = false;
                        } else {
                            E(view, rectU.left - i4);
                            z2 = true;
                        }
                        if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - rectU7.right) - asvVar6.rightMargin) + asvVar6.i) < rectU.right) {
                            E(view, width - rectU.right);
                        } else if (!z2) {
                            E(view, 0);
                        }
                        rectU7.setEmpty();
                        axrVar2.b(rectU7);
                    }
                }
                int i15 = i3 + 1;
                if (i2 != 2) {
                    rectU3.set(((asv) view.getLayoutParams()).p);
                    if (!rectU3.equals(rectU2)) {
                        ((asv) view.getLayoutParams()).p.set(rectU2);
                        while (i15 < size) {
                            List list4 = list3;
                            View view3 = (View) list4.get(i15);
                            asv asvVar7 = (asv) view3.getLayoutParams();
                            astVar = asvVar7.a;
                            if (astVar == null && astVar.layoutDependsOn(this, view3, view)) {
                                if (i2 == 0 && asvVar7.o) {
                                    asvVar7.a();
                                } else {
                                    if (i2 != 2) {
                                        zOnDependentViewChanged = astVar.onDependentViewChanged(this, view3, view);
                                    } else {
                                        astVar.onDependentViewRemoved(this, view3, view);
                                        zOnDependentViewChanged = true;
                                    }
                                    if (i2 == 1) {
                                        asvVar7.o = zOnDependentViewChanged;
                                    }
                                }
                            }
                            i15++;
                            list3 = list4;
                        }
                    }
                } else {
                    while (i15 < size) {
                        List list5 = list3;
                        View view4 = (View) list5.get(i15);
                        asv asvVar8 = (asv) view4.getLayoutParams();
                        astVar = asvVar8.a;
                        if (astVar == null) {
                        }
                        i15++;
                        list3 = list5;
                    }
                }
                list = list3;
            }
            i6 = i3 + 1;
            list2 = list;
        }
        rectU.setEmpty();
        axr axrVar3 = j;
        axrVar3.b(rectU);
        rectU2.setEmpty();
        axrVar3.b(rectU2);
        rectU3.setEmpty();
        axrVar3.b(rectU3);
    }

    public final void j(View view, int i2) {
        asv asvVar = (asv) view.getLayoutParams();
        View view2 = asvVar.k;
        int i3 = 0;
        if (view2 != null) {
            Rect rectU = u();
            Rect rectU2 = u();
            try {
                int i4 = asy.a;
                rectU.set(0, 0, view2.getWidth(), view2.getHeight());
                asy.a(this, view2, rectU);
                asv asvVar2 = (asv) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                C(i2, rectU, rectU2, asvVar2, measuredWidth, measuredHeight);
                v(asvVar2, rectU2, measuredWidth, measuredHeight);
                view.layout(rectU2.left, rectU2.top, rectU2.right, rectU2.bottom);
                return;
            } finally {
                rectU.setEmpty();
                axr axrVar = j;
                axrVar.b(rectU);
                rectU2.setEmpty();
                axrVar.b(rectU2);
            }
        }
        if (asvVar.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        int i5 = asvVar.e;
        if (i5 < 0) {
            asv asvVar3 = (asv) view.getLayoutParams();
            Rect rectU3 = u();
            rectU3.set(getPaddingLeft() + asvVar3.leftMargin, getPaddingTop() + asvVar3.topMargin, (getWidth() - getPaddingRight()) - asvVar3.rightMargin, (getHeight() - getPaddingBottom()) - asvVar3.bottomMargin);
            if (this.e != null) {
                int i6 = bac.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectU3.left += this.e.b();
                    rectU3.top += this.e.d();
                    rectU3.right -= this.e.c();
                    rectU3.bottom -= this.e.a();
                }
            }
            Rect rectU4 = u();
            Gravity.apply(r(asvVar3.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectU3, rectU4, i2);
            view.layout(rectU4.left, rectU4.top, rectU4.right, rectU4.bottom);
            rectU3.setEmpty();
            axr axrVar2 = j;
            axrVar2.b(rectU3);
            rectU4.setEmpty();
            axrVar2.b(rectU4);
            return;
        }
        asv asvVar4 = (asv) view.getLayoutParams();
        int absoluteGravity = Gravity.getAbsoluteGravity(s(asvVar4.c), i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i2 == 1) {
            i5 = width - i5;
        }
        int iP = p(i5) - measuredWidth2;
        if (i7 == 1) {
            iP += measuredWidth2 / 2;
        } else if (i7 == 5) {
            iP += measuredWidth2;
        }
        if (i8 == 16) {
            i3 = measuredHeight2 / 2;
        } else if (i8 == 80) {
            i3 = measuredHeight2;
        }
        int iMax = Math.max(getPaddingLeft() + asvVar4.leftMargin, Math.min(iP, ((width - getPaddingRight()) - measuredWidth2) - asvVar4.rightMargin));
        int iMax2 = Math.max(getPaddingTop() + asvVar4.topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - asvVar4.bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final void k(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    public final boolean l(View view, int i2, int i3) {
        Rect rectU = u();
        int i4 = asy.a;
        rectU.set(0, 0, view.getWidth(), view.getHeight());
        asy.a(this, view, rectU);
        try {
            return rectU.contains(i2, i3);
        } finally {
            w(rectU);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        x();
        if (this.v) {
            if (this.z == null) {
                this.z = new fsd(this, 1);
            }
            getViewTreeObserver().addOnPreDrawListener(this.z);
        }
        if (this.e == null) {
            int i2 = bac.a;
            if (getFitsSystemWindows()) {
                requestApplyInsets();
            }
        }
        this.r = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x();
        if (this.v && this.z != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.z);
        }
        View view = this.u;
        if (view != null) {
            h(view, 0);
        }
        this.r = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f || this.w == null) {
            return;
        }
        bbn bbnVar = this.e;
        int iD = bbnVar != null ? bbnVar.d() : 0;
        if (iD > 0) {
            this.w.setBounds(0, 0, getWidth(), iD);
            this.w.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            x();
            actionMasked = 0;
        }
        boolean zB = B(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.t = null;
            x();
        }
        return zB;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        ast astVar;
        int layoutDirection = getLayoutDirection();
        List list = this.k;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) list.get(i6);
            if (view.getVisibility() != 8 && ((astVar = ((asv) view.getLayoutParams()).a) == null || !astVar.onLayoutChild(this, view, layoutDirection))) {
                j(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Type inference failed for: r11v9, types: [axr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [axr, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:36:0x0095
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // android.view.View
    protected void onMeasure(int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 873
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        CoordinatorLayout coordinatorLayout;
        View view2;
        float f3;
        float f4;
        boolean z2;
        ast astVar;
        int childCount = getChildCount();
        int i2 = 0;
        boolean zOnNestedFling = false;
        while (i2 < childCount) {
            View childAt = this.getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                asv asvVar = (asv) childAt.getLayoutParams();
                if (!asvVar.n || (astVar = asvVar.a) == null) {
                    coordinatorLayout = this;
                    view2 = view;
                    f3 = f;
                    f4 = f2;
                    z2 = z;
                } else {
                    coordinatorLayout = this;
                    view2 = view;
                    f3 = f;
                    f4 = f2;
                    z2 = z;
                    zOnNestedFling |= astVar.onNestedFling(coordinatorLayout, childAt, view2, f3, f4, z2);
                }
            } else {
                coordinatorLayout = this;
                view2 = view;
                f3 = f;
                f4 = f2;
                z2 = z;
            }
            i2++;
            this = coordinatorLayout;
            view = view2;
            f = f3;
            f2 = f4;
            z = z2;
        }
        CoordinatorLayout coordinatorLayout2 = this;
        if (zOnNestedFling) {
            coordinatorLayout2.i(1);
        }
        return zOnNestedFling;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        CoordinatorLayout coordinatorLayout;
        View view2;
        float f3;
        float f4;
        ast astVar;
        int childCount = getChildCount();
        int i2 = 0;
        boolean zOnNestedPreFling = false;
        while (i2 < childCount) {
            View childAt = this.getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                asv asvVar = (asv) childAt.getLayoutParams();
                if (!asvVar.n || (astVar = asvVar.a) == null) {
                    coordinatorLayout = this;
                    view2 = view;
                    f3 = f;
                    f4 = f2;
                } else {
                    coordinatorLayout = this;
                    view2 = view;
                    f3 = f;
                    f4 = f2;
                    zOnNestedPreFling |= astVar.onNestedPreFling(coordinatorLayout, childAt, view2, f3, f4);
                }
            } else {
                coordinatorLayout = this;
                view2 = view;
                f3 = f;
                f4 = f2;
            }
            i2++;
            this = coordinatorLayout;
            view = view2;
            f = f3;
            f2 = f4;
        }
        return zOnNestedPreFling;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        d(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        e(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        g(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof asw)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        asw aswVar = (asw) parcelable;
        super.onRestoreInstanceState(aswVar.d);
        SparseArray sparseArray = aswVar.a;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            ast astVar = m(childAt).a;
            if (id != -1 && astVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                astVar.onRestoreInstanceState(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState;
        asw aswVar = new asw(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            ast astVar = ((asv) childAt.getLayoutParams()).a;
            if (id != -1 && astVar != null && (parcelableOnSaveInstanceState = astVar.onSaveInstanceState(this, childAt)) != null) {
                sparseArray.append(id, parcelableOnSaveInstanceState);
            }
        }
        aswVar.a = sparseArray;
        return aswVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return t(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        h(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zB;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.t;
        boolean z = false;
        if (view != null) {
            ast astVar = ((asv) view.getLayoutParams()).a;
            zB = astVar != null ? astVar.onTouchEvent(this, this.t, motionEvent) : false;
        } else {
            zB = B(motionEvent, 1);
            if (actionMasked != 0 && zB) {
                z = true;
            }
        }
        if (this.t == null || actionMasked == 3) {
            zB |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent motionEventD = D(motionEvent);
            super.onTouchEvent(motionEventD);
            motionEventD.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.t = null;
            x();
        }
        return zB;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        ast astVar = ((asv) view.getLayoutParams()).a;
        if (astVar == null || !astVar.onRequestChildRectangleOnScreen(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.q) {
            return;
        }
        if (this.t == null) {
            int childCount = getChildCount();
            MotionEvent motionEventObtain = null;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                ast astVar = ((asv) childAt.getLayoutParams()).a;
                if (astVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    astVar.onInterceptTouchEvent(this, childAt, motionEventObtain);
                }
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
        }
        x();
        this.q = true;
    }

    @Override // android.view.View
    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        y();
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.g = onHierarchyChangeListener;
    }

    @Override // android.view.View
    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        Drawable drawable = this.w;
        if (drawable != null) {
            boolean z = i2 == 0;
            if (drawable.isVisible() != z) {
                this.w.setVisible(z, false);
            }
        }
    }

    @Override // defpackage.ayu
    public final boolean t(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                asv asvVar = (asv) childAt.getLayoutParams();
                ast astVar = asvVar.a;
                if (astVar != null) {
                    boolean zOnStartNestedScroll = astVar.onStartNestedScroll(this, childAt, view, view2, i2, i3);
                    z |= zOnStartNestedScroll;
                    asvVar.c(i3, zOnStartNestedScroll);
                } else {
                    asvVar.c(i3, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.w;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new asv(getContext(), attributeSet);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }
}
