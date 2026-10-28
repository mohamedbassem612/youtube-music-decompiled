package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.youtube.music.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class afcr {
    private final TimeInterpolator B;
    private List D;
    private final AccessibilityManager E;
    public final int d;
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public final TimeInterpolator h;
    public final ViewGroup i;
    public final Context j;
    public final afcq k;
    public final afcs l;
    public int m;
    public afco n;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public BaseTransientBottomBar$Behavior w;
    private static final TimeInterpolator a = aetz.b;
    private static final TimeInterpolator y = aetz.a;
    private static final TimeInterpolator z = aetz.d;
    private static final int[] A = {R.attr.snackbarStyle};
    public static final String c = "afcr";
    static final Handler b = new Handler(Looper.getMainLooper(), new afcj());
    public final boolean o = false;
    private final Runnable C = new aemk(this, 15);
    final avgj x = new avgj(this);

    protected afcr(Context context, ViewGroup viewGroup, View view, afcs afcsVar) {
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (afcsVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.i = viewGroup;
        this.l = afcsVar;
        this.j = context;
        aeym.d(context, aeym.a, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(A);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        afcq afcqVar = (afcq) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.k = afcqVar;
        afcqVar.a = this;
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            float f = afcqVar.d;
            if (f != 1.0f) {
                snackbarContentLayout.b.setTextColor(afba.L(afba.I(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.b.getCurrentTextColor(), f));
            }
            snackbarContentLayout.c = afcqVar.e;
        }
        afcqVar.addView(view);
        afcqVar.setAccessibilityLiveRegion(1);
        afcqVar.setImportantForAccessibility(1);
        afcqVar.setFitsSystemWindows(true);
        afck afckVar = new afck(this);
        int i = bac.a;
        azs.c(afcqVar, afckVar);
        bac.p(afcqVar, new afcl(this));
        this.E = (AccessibilityManager) context.getSystemService("accessibility");
        this.f = afba.r(context, R.attr.motionDurationLong2, 250);
        this.d = afba.r(context, R.attr.motionDurationLong2, 150);
        this.e = afba.r(context, R.attr.motionDurationMedium1, 75);
        this.B = afba.y(context, R.attr.motionEasingEmphasizedInterpolator, y);
        this.h = afba.y(context, R.attr.motionEasingEmphasizedInterpolator, z);
        this.g = afba.y(context, R.attr.motionEasingEmphasizedInterpolator, a);
    }

    public int a() {
        return this.m;
    }

    public final int b() {
        afcq afcqVar = this.k;
        int height = afcqVar.getHeight();
        ViewGroup.LayoutParams layoutParams = afcqVar.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public final ValueAnimator c(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.B);
        valueAnimatorOfFloat.addUpdateListener(new afcg(this, 0));
        return valueAnimatorOfFloat;
    }

    public final View d() {
        afco afcoVar = this.n;
        if (afcoVar == null) {
            return null;
        }
        return (View) afcoVar.a.get();
    }

    public final void e(int i) {
        afcy afcyVarA = afcy.a();
        Object obj = afcyVarA.a;
        avgj avgjVar = this.x;
        synchronized (obj) {
            if (afcyVarA.i(avgjVar)) {
                afcyVarA.d((afcx) afcyVarA.c, i);
            } else if (afcyVarA.j(avgjVar)) {
                afcyVarA.d((afcx) afcyVarA.d, i);
            }
        }
    }

    public final void f(int i) {
        afcy afcyVarA = afcy.a();
        Object obj = afcyVarA.a;
        avgj avgjVar = this.x;
        synchronized (obj) {
            if (afcyVarA.i(avgjVar)) {
                afcyVarA.c = null;
                if (afcyVarA.d != null) {
                    afcyVarA.c();
                }
            }
        }
        List list = this.D;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((aewo) this.D.get(size)).b(this, i);
                }
            }
        }
        afcq afcqVar = this.k;
        ViewParent parent = afcqVar.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(afcqVar);
        }
    }

    final void g() {
        afcy afcyVarA = afcy.a();
        Object obj = afcyVarA.a;
        avgj avgjVar = this.x;
        synchronized (obj) {
            if (afcyVarA.i(avgjVar)) {
                afcyVarA.b((afcx) afcyVarA.c);
            }
        }
        List list = this.D;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((aewo) this.D.get(size)).d(this);
            }
        }
    }

    public final void h() {
        afcy afcyVarA = afcy.a();
        Object obj = afcyVarA.a;
        int iA = a();
        avgj avgjVar = this.x;
        synchronized (obj) {
            if (afcyVarA.i(avgjVar)) {
                Object obj2 = afcyVarA.c;
                ((afcx) obj2).a = iA;
                ((Handler) afcyVarA.b).removeCallbacksAndMessages(obj2);
                afcyVarA.b((afcx) afcyVarA.c);
                return;
            }
            if (afcyVarA.j(avgjVar)) {
                ((afcx) afcyVarA.d).a = iA;
            } else {
                afcyVarA.d = new afcx(iA, avgjVar);
            }
            Object obj3 = afcyVarA.c;
            if (obj3 == null || !afcyVarA.d((afcx) obj3, 4)) {
                afcyVarA.c = null;
                afcyVarA.c();
            }
        }
    }

    public final void i() {
        boolean zL = l();
        afcq afcqVar = this.k;
        if (zL) {
            afcqVar.post(new aemk(this, 17));
            return;
        }
        if (afcqVar.getParent() != null) {
            afcqVar.setVisibility(0);
        }
        g();
    }

    public final void j() {
        afcq afcqVar = this.k;
        ViewGroup.LayoutParams layoutParams = afcqVar.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(c, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (afcqVar.f == null) {
            Log.w(c, "Unable to update margins because original view margins are not set");
            return;
        }
        if (afcqVar.getParent() != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = afcqVar.f.bottom + (d() != null ? this.s : this.p);
            int i2 = afcqVar.f.left + this.q;
            int i3 = afcqVar.f.right + this.r;
            int i4 = afcqVar.f.top;
            if (marginLayoutParams.bottomMargin != i || marginLayoutParams.leftMargin != i2 || marginLayoutParams.rightMargin != i3 || marginLayoutParams.topMargin != i4) {
                marginLayoutParams.bottomMargin = i;
                marginLayoutParams.leftMargin = i2;
                marginLayoutParams.rightMargin = i3;
                marginLayoutParams.topMargin = i4;
                afcqVar.requestLayout();
            } else if (this.u == this.t) {
                return;
            }
            if (Build.VERSION.SDK_INT < 29 || this.t <= 0) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = afcqVar.getLayoutParams();
            if ((layoutParams2 instanceof asv) && (((asv) layoutParams2).a instanceof SwipeDismissBehavior) && d() == null) {
                Runnable runnable = this.C;
                afcqVar.removeCallbacks(runnable);
                afcqVar.post(runnable);
            }
        }
    }

    public final boolean k() {
        boolean zI;
        afcy afcyVarA = afcy.a();
        Object obj = afcyVarA.a;
        avgj avgjVar = this.x;
        synchronized (obj) {
            zI = afcyVarA.i(avgjVar);
        }
        return zI;
    }

    final boolean l() {
        AccessibilityManager accessibilityManager = this.E;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final void m(aewo aewoVar) {
        if (this.D == null) {
            this.D = new ArrayList();
        }
        this.D.add(aewoVar);
    }
}
