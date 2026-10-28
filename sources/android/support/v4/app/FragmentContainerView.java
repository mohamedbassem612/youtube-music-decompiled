package android.support.v4.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import defpackage.a;
import defpackage.afjq;
import defpackage.au;
import defpackage.av;
import defpackage.awqx;
import defpackage.bac;
import defpackage.bbn;
import defpackage.cc;
import defpackage.cj;
import defpackage.dd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public boolean a;
    private final List b;
    private final List c;
    private View.OnApplyWindowInsetsListener d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, dd ddVar) {
        View view;
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        ddVar.getClass();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.a = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, au.b, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        cc ccVarF = ddVar.f(id);
        if (classAttribute != null && ccVarF == null) {
            if (id == -1) {
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + ((Object) classAttribute) + (string != null ? " with tag ".concat(string) : ""));
            }
            cj cjVarJ = ddVar.j();
            context.getClassLoader();
            cc ccVarB = cjVarJ.b(classAttribute);
            ccVarB.getClass();
            ccVarB.mFragmentId = id;
            ccVarB.mContainerId = id;
            ccVarB.mTag = string;
            ccVarB.mFragmentManager = ddVar;
            ccVarB.mHost = ddVar.p;
            ccVarB.onInflate(context, attributeSet, (Bundle) null);
            av avVar = new av(ddVar);
            avVar.r();
            ccVarB.mContainer = this;
            ccVarB.mInDynamicContainer = true;
            avVar.g(getId(), ccVarB, string, 1);
            avVar.f();
        }
        for (afjq afjqVar : ddVar.C.d()) {
            cc ccVar = (cc) afjqVar.d;
            if (ccVar.mContainerId == getId() && (view = ccVar.mView) != null && view.getParent() == null) {
                ccVar.mContainer = this;
                afjqVar.f();
                afjqVar.i();
            }
        }
    }

    private final void a(View view) {
        if (this.c.contains(view)) {
            this.b.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        if (dd.i(view) == null) {
            throw new IllegalStateException(a.bV(view, "Views added to a FragmentContainerView must be associated with a Fragment. View ", " is not associated with a Fragment."));
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        bbn bbnVarO = bbn.o(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.d;
        bbn bbnVarO2 = onApplyWindowInsetsListener != null ? bbn.o(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets), null) : bac.f(this, bbnVarO);
        bbnVarO2.getClass();
        if (!bbnVarO2.w()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                bac.e(getChildAt(i), bbnVarO2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.a) {
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.a) {
            List list = this.b;
            if (!list.isEmpty() && list.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.c.remove(view);
        if (this.b.remove(view)) {
            this.a = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            View childAt = getChildAt(i3);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            View childAt = getChildAt(i3);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.c.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        String str;
        super(context, attributeSet, i);
        context.getClass();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.a = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, au.b, 0, 0);
            typedArrayObtainStyledAttributes.getClass();
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + ((Object) str) + "=\"" + ((Object) classAttribute) + '\"');
        }
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, awqx awqxVar) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        context.getClass();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.a = true;
    }
}
