package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adze implements adzd {
    private final jh A;
    public final CopyOnWriteArraySet a;
    public PopupWindow.OnDismissListener b;
    public PopupWindow c;
    public adzf d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final int[] i;
    public int j;
    public int k;
    public int l;
    public int m;
    public final ci n;
    private final Context o;
    private final adxl p;
    private final adzc q;
    private final View r;
    private View s;
    private View t;
    private View u;
    private final boolean v;
    private final boolean w;
    private final boolean x;
    private final ViewTreeObserver.OnGlobalLayoutListener y;
    private final vxz z;

    public adze(Context context, adxl adxlVar, View view, View view2, View view3, View view4, ci ciVar, vxz vxzVar, adzc adzcVar) {
        context.getClass();
        ciVar.getClass();
        this.o = context;
        this.p = adxlVar;
        this.n = ciVar;
        this.z = vxzVar;
        this.q = adzcVar;
        adzd adzdVarAb = ciVar.ab();
        this.r = adzdVarAb != null ? adzdVarAb.a() : view;
        this.s = view2;
        this.t = view3;
        this.u = view4;
        this.a = new CopyOnWriteArraySet();
        this.v = adzcVar.c == 2;
        this.w = (vxzVar != null && vxzVar.l(SemanticState.Focused, 45748489L, false)) || (vxzVar != null && vxzVar.l(6, 45386416L, false));
        this.x = vxzVar != null && vxzVar.l(SemanticState.Focused, 45748489L, false);
        this.e = Integer.MIN_VALUE;
        this.f = Integer.MIN_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        this.i = new int[2];
        this.j = Integer.MIN_VALUE;
        this.k = Integer.MIN_VALUE;
        this.l = Integer.MIN_VALUE;
        this.m = Integer.MIN_VALUE;
        this.y = new uoy(view, this, 3);
        this.A = new jh(this, 7);
    }

    private final boolean i() {
        return this.t == null && this.s == null && this.u == null;
    }

    @Override // defpackage.adzd
    public final View a() {
        return this.r;
    }

    @Override // defpackage.adzd
    public final void b(adzr adzrVar) {
        this.a.add(adzrVar);
    }

    @Override // defpackage.adzd
    public final void c() {
        h();
        adzf adzfVar = this.d;
        if (adzfVar != null) {
            adzfVar.d();
        }
        PopupWindow popupWindow = this.c;
        if (popupWindow != null) {
            if (true != popupWindow.isShowing()) {
                popupWindow = null;
            }
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        }
    }

    @Override // defpackage.adzd
    public final void d(PopupWindow.OnDismissListener onDismissListener) {
        this.b = onDismissListener;
    }

    @Override // defpackage.adzd
    public final void e() {
        adzf adzfVar;
        View rootView;
        int i;
        Integer numU;
        if (g()) {
            return;
        }
        PopupWindow popupWindow = this.c;
        if (popupWindow == null) {
            Context context = this.o;
            PopupWindow popupWindow2 = new PopupWindow(context);
            boolean z = this.x;
            boolean z2 = this.w;
            View view = this.r;
            boolean z3 = this.v;
            adzc adzcVar = this.q;
            acsc acscVar = new acsc(this, 9);
            adzf adzfVar2 = new adzf(context);
            adzfVar2.b = view;
            adzfVar2.c = aecm.i(view);
            adzfVar2.i = acscVar;
            if (!z) {
                adzfVar2.d = context.getResources().getDimensionPixelSize(R.dimen.contextual_sheet_margin);
            }
            amzi amziVar = adzcVar.b;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.contextual_sheet_padding);
            int i2 = true != z ? dimensionPixelSize : 0;
            int dimensionPixelSize2 = (amziVar == null || (numU = aecm.u(context, amziVar)) == null) ? context.getResources().getDimensionPixelSize(R.dimen.contextual_sheet_min_width) : numU.intValue();
            LinearLayout linearLayout = adzfVar2.a;
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.setPadding(i2, dimensionPixelSize, i2, dimensionPixelSize);
            linearLayout.setMinimumWidth(dimensionPixelSize2 + (i2 << 1));
            linearLayout.setClipToOutline(true);
            linearLayout.setClickable(true);
            if (z3) {
                i = z ? R.drawable.mainstage_contextual_menu_overlay_style_background : R.drawable.contextual_menu_overlay_style_background;
            } else {
                i = z ? R.drawable.mainstage_contextual_menu_background : R.drawable.contextual_menu_background;
            }
            linearLayout.setBackground(dl.d(context, i));
            if (z2) {
                Drawable drawable = context.getDrawable(R.drawable.menu_drop_shadow);
                if (drawable == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Rect rect = new Rect();
                drawable.getPadding(rect);
                adzfVar2.setBackground(drawable);
                adzfVar2.e = rect.left;
                adzfVar2.f = rect.top;
                adzfVar2.g = rect.right;
                adzfVar2.h = rect.bottom;
            }
            adzfVar2.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
            adzfVar2.setClipToPadding(false);
            adzfVar2.setClipChildren(false);
            adzfVar2.setOnClickListener(new yde(this, 19));
            adzfVar2.e(this.t, this.s, this.u, i());
            this.d = adzfVar2;
            adxl adxlVar = this.p;
            if (adxlVar != null) {
                adxlVar.a(linearLayout);
            }
            popupWindow2.setFocusable(true);
            popupWindow2.setClippingEnabled(false);
            popupWindow2.setBackgroundDrawable(new ColorDrawable(0));
            popupWindow2.setElevation(0.0f);
            popupWindow2.setContentView(adzfVar2);
            this.c = popupWindow2;
            popupWindow = popupWindow2;
        }
        if (popupWindow != null) {
            if (this.q.a) {
                popupWindow.setInputMethodMode(2);
            }
            adzf adzfVar3 = this.d;
            if (adzfVar3 != null) {
                adzn adznVarC = adzfVar3.c();
                Size size = adznVarC.b;
                popupWindow.setWidth(size.getWidth());
                popupWindow.setHeight(size.getHeight());
                View view2 = this.r;
                Point point = adznVarC.c;
                popupWindow.showAtLocation(view2, 0, point.x, point.y);
                this.e = point.x;
                this.f = point.y;
                this.g = size.getWidth();
                this.h = size.getHeight();
                int[] iArr = this.i;
                view2.getLocationOnScreen(iArr);
                this.j = iArr[0];
                this.k = iArr[1];
                this.l = view2.getWidth();
                this.m = view2.getHeight();
                view2.getViewTreeObserver().addOnGlobalLayoutListener(this.y);
                view2.addOnAttachStateChangeListener(this.A);
                if (!this.x && g() && (adzfVar = this.d) != null && (rootView = adzfVar.getRootView()) != null) {
                    Object systemService = this.o.getSystemService("window");
                    WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
                    if (windowManager != null) {
                        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
                        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
                        if (layoutParams2 != null) {
                            layoutParams2.flags |= 2;
                            layoutParams2.dimAmount = 0.1f;
                            try {
                                windowManager.updateViewLayout(rootView, layoutParams2);
                            } catch (IllegalArgumentException e) {
                                twu.d("ContextualSheetV2", 6, "Error setting contextual sheet scrim", e);
                            }
                        }
                    }
                }
                PopupWindow popupWindow3 = this.c;
                if (popupWindow3 != null) {
                    PopupWindow popupWindow4 = true == popupWindow3.isShowing() ? popupWindow3 : null;
                    if (popupWindow4 != null) {
                        this.n.ac(this);
                        Iterator it = this.a.iterator();
                        while (it.hasNext()) {
                            ((adzr) it.next()).b();
                        }
                        popupWindow4.setOnDismissListener(new acya(this, 4));
                    }
                }
            }
        }
    }

    @Override // defpackage.adzd
    public final void f(View view, View view2, View view3) {
        adzf adzfVar = this.d;
        if (adzfVar != null) {
            adzfVar.d();
        }
        this.s = view;
        this.t = view2;
        this.u = view3;
        boolean zI = i();
        adzf adzfVar2 = this.d;
        if (adzfVar2 != null) {
            adzfVar2.e(view2, view, view3, zI);
        }
    }

    @Override // defpackage.adzd
    public final boolean g() {
        PopupWindow popupWindow = this.c;
        return popupWindow != null && popupWindow.isShowing();
    }

    public final void h() {
        View view = this.r;
        view.removeOnAttachStateChangeListener(this.A);
        if (view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.y);
        }
    }
}
