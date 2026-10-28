package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import app.rive.semantics.SemanticState;
import com.google.android.apps.youtube.music.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adzb implements adzd {
    View b;
    View c;
    public PopupWindow d;
    adyz e;
    public PopupWindow.OnDismissListener f;
    public final ci g;
    private final Context h;
    private final View i;
    private final adza j;
    private final adxl k;
    private final boolean l;
    private View m;
    private final boolean n;
    private final boolean o;
    public final List a = new ArrayList();
    private final Rect p = new Rect();

    public adzb(Context context, adxl adxlVar, View view, View view2, View view3, View view4, ci ciVar, vxz vxzVar, boolean z) {
        context.getClass();
        this.h = context;
        this.k = adxlVar;
        adzd adzdVarAb = ciVar.ab();
        this.i = adzdVarAb != null ? adzdVarAb.a() : view;
        this.b = view2;
        this.c = view3;
        this.m = view4;
        this.g = ciVar;
        this.l = z;
        adza adzaVar = new adza(vxzVar != null && vxzVar.l(93, 45696719L, false), vxzVar != null && vxzVar.l(103, 45716804L, false), vxzVar != null && vxzVar.l(SemanticState.Focused, 45748489L, false));
        this.j = adzaVar;
        this.n = vxzVar != null && (vxzVar.l(6, 45386416L, false) || adzaVar.c);
        this.o = vxzVar != null && vxzVar.l(7, 45386417L, false);
    }

    public static boolean h(Context context, vxz vxzVar, int i) {
        int i2;
        if (vxzVar == null || !vxzVar.l(5, 45386415L, false) || (i2 = i - 1) == 2) {
            return false;
        }
        if (i2 != 3) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int iC = (int) vxzVar.c(0, 45386419L, 0L);
            if (iC == 0) {
                iC = 528;
            }
            if (Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) <= twm.c(displayMetrics, iC)) {
                return false;
            }
        }
        return true;
    }

    private final LinearLayout i() {
        Context context = this.h;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View view = this.c;
        View view2 = this.b;
        View view3 = this.m;
        if (view == null && view2 == null && view3 == null) {
            ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, context.getResources().getDimensionPixelSize(R.dimen.contextual_sheet_spinner_view_height));
            RelativeLayout relativeLayout = new RelativeLayout(context);
            ProgressBar progressBar = new ProgressBar(context);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(13);
            relativeLayout.addView(progressBar, layoutParams2);
            linearLayout.addView(relativeLayout, layoutParams);
        } else {
            if (view != null) {
                linearLayout.addView(view, new LinearLayout.LayoutParams(-1, -2));
            }
            if (view2 != null) {
                linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, -2, 1.0f));
            }
            if (view3 != null) {
                linearLayout.addView(view3, new LinearLayout.LayoutParams(-1, -2));
            }
        }
        return linearLayout;
    }

    @Override // defpackage.adzd
    public final View a() {
        return this.i;
    }

    @Override // defpackage.adzd
    public final void b(adzr adzrVar) {
        this.a.add(adzrVar);
    }

    @Override // defpackage.adzd
    public final void c() {
        PopupWindow popupWindow = this.d;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        popupWindow.dismiss();
    }

    @Override // defpackage.adzd
    public final void d(PopupWindow.OnDismissListener onDismissListener) {
        this.f = onDismissListener;
    }

    @Override // defpackage.adzd
    public final void e() {
        WindowManager windowManager;
        Size size;
        int iJ;
        int dimensionPixelSize;
        boolean z;
        PopupWindow popupWindow = this.d;
        if (popupWindow == null) {
            Context context = this.h;
            PopupWindow popupWindow2 = new PopupWindow(context);
            if (this.o) {
                Drawable drawable = context.getDrawable(R.drawable.menu_drop_shadow);
                drawable.getClass();
                Rect rect = this.p;
                drawable.getPadding(rect);
                adyz adyzVar = new adyz(context);
                this.e = adyzVar;
                View view = this.i;
                LinearLayout linearLayoutI = i();
                adza adzaVar = this.j;
                adyzVar.b = view;
                adyzVar.c = popupWindow2;
                adyzVar.n = adzaVar.a;
                adyzVar.o = adzaVar.b;
                adyzVar.q = rect;
                boolean z2 = adzaVar.c;
                adyzVar.p = z2;
                Context context2 = adyzVar.a;
                adyzVar.l = aecm.j(context2, view);
                adyzVar.m = false;
                if (z2) {
                    dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.mainstage_menu_margin);
                    z = true;
                } else {
                    dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.contextual_sheet_margin);
                    z = false;
                }
                adyzVar.e = dimensionPixelSize;
                adyzVar.f = context2.getResources().getDimensionPixelSize(R.dimen.contextual_sheet_top_margin);
                adyzVar.g = context2.getResources().getDimensionPixelSize(R.dimen.contextual_sheet_between_anchor_margin);
                int dimensionPixelSize2 = context2.getResources().getDimensionPixelSize(R.dimen.contextual_sheet_padding);
                adyzVar.h = dimensionPixelSize2;
                if (true == z) {
                    dimensionPixelSize2 = 0;
                }
                adyzVar.i = dimensionPixelSize2;
                adyzVar.j = context2.getResources().getDimensionPixelSize(R.dimen.contextual_sheet_min_width);
                adyzVar.k = context2.getResources().getDimensionPixelSize(R.dimen.contextual_sheet_max_width);
                adyzVar.a(linearLayoutI);
                if (!z) {
                    popupWindow2.setContentView(adyzVar);
                }
                adxl adxlVar = this.k;
                if (adxlVar != null) {
                    adxlVar.a(this.e);
                }
                if (z2) {
                    popupWindow2.setElevation(0.0f);
                    FrameLayout frameLayout = new FrameLayout(context);
                    frameLayout.setBackground(drawable);
                    frameLayout.setOnClickListener(new yde(this, 18));
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    this.e.setBackground(dl.d(context, R.drawable.mainstage_contextual_menu_background));
                    frameLayout.addView(this.e, layoutParams);
                    popupWindow2.setContentView(frameLayout);
                    popupWindow2.setBackgroundDrawable(new ColorDrawable(0));
                }
            } else {
                popupWindow2.setContentView(i());
                popupWindow2.getContentView().setMinimumWidth(context.getResources().getDimensionPixelSize(R.dimen.contextual_sheet_min_width));
            }
            popupWindow2.setFocusable(true);
            popupWindow2.setClippingEnabled(false);
            if (this.n && !this.j.c) {
                popupWindow2.setElevation(context.getResources().getDimensionPixelSize(R.dimen.contextual_sheet_elevation));
            }
            popupWindow2.setBackgroundDrawable(this.j.c ? new ColorDrawable(0) : dl.d(context, R.drawable.contextual_menu_background));
            this.d = popupWindow2;
            popupWindow = popupWindow2;
        }
        if (popupWindow != null) {
            if (this.l) {
                popupWindow.setInputMethodMode(2);
            }
            adyz adyzVar2 = this.e;
            Point point = new Point(0, 0);
            if (Build.VERSION.SDK_INT >= 29) {
                adza adzaVar2 = this.j;
                boolean z3 = adzaVar2.c;
                Context context3 = this.h;
                int dimensionPixelSize3 = z3 ? context3.getResources().getDimensionPixelSize(R.dimen.mainstage_menu_margin) : context3.getResources().getDimensionPixelSize(R.dimen.contextual_sheet_margin);
                Context context4 = this.h;
                int dimensionPixelSize4 = context4.getResources().getDimensionPixelSize(R.dimen.contextual_sheet_top_margin);
                int dimensionPixelSize5 = context4.getResources().getDimensionPixelSize(R.dimen.contextual_sheet_between_anchor_margin);
                int dimensionPixelSize6 = context4.getResources().getDimensionPixelSize(R.dimen.contextual_sheet_padding);
                int i = true != z3 ? dimensionPixelSize6 : 0;
                boolean z4 = this.o;
                if (z4) {
                    adyz adyzVar3 = this.e;
                    if (adyzVar3 != null) {
                        adyzVar3.measure(0, 0);
                        size = new Size(adyzVar3.getMeasuredWidth() + (i << 1), adyzVar3.getMeasuredHeight() + (dimensionPixelSize6 << 1));
                    } else {
                        size = new Size(0, 0);
                    }
                } else {
                    int dimensionPixelSize7 = context4.getResources().getDimensionPixelSize(R.dimen.contextual_sheet_max_width);
                    PopupWindow popupWindow3 = this.d;
                    if (popupWindow3 == null || popupWindow3.getContentView() == null) {
                        size = new Size(0, 0);
                    } else {
                        popupWindow3.getContentView().measure(View.MeasureSpec.makeMeasureSpec(dimensionPixelSize7, Integer.MIN_VALUE), 0);
                        size = new Size(popupWindow3.getContentView().getMeasuredWidth() + (i << 1), popupWindow3.getContentView().getMeasuredHeight() + (dimensionPixelSize6 << 1));
                    }
                }
                if (!z4 || adyzVar2 == null) {
                    iJ = aecm.j(context4, this.i);
                } else {
                    if (!adyzVar2.m) {
                        adyzVar2.measure(0, 0);
                    }
                    iJ = adyzVar2.l;
                }
                point = aecm.l(context4, this.i, iJ, size.getWidth(), size.getHeight(), dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize5, adzaVar2.a, adzaVar2.b);
                if (z3) {
                    Rect rect2 = this.p;
                    point.offset(-rect2.left, -rect2.top);
                }
            }
            popupWindow.showAtLocation(this.i, 0, point.x, point.y);
            if (!this.j.c && g()) {
                adyz adyzVar4 = this.e;
                PopupWindow popupWindow4 = this.d;
                View rootView = null;
                if (this.o) {
                    if (adyzVar4 != null && adyzVar4.getParent() != null) {
                        rootView = adyzVar4.getRootView();
                    }
                } else if (popupWindow4 != null && popupWindow4.getContentView() != null && popupWindow4.getContentView().getParent() != null) {
                    rootView = popupWindow4.getContentView().getRootView();
                }
                if (rootView != null && (windowManager = (WindowManager) this.h.getSystemService("window")) != null) {
                    WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) rootView.getLayoutParams();
                    layoutParams2.flags |= 2;
                    layoutParams2.dimAmount = 0.1f;
                    windowManager.updateViewLayout(rootView, layoutParams2);
                }
            }
            PopupWindow popupWindow5 = this.d;
            if (popupWindow5 == null || !popupWindow5.isShowing()) {
                return;
            }
            ci ciVar = this.g;
            if (ciVar != null) {
                ciVar.ac(this);
            }
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((adzr) it.next()).b();
            }
            popupWindow5.setOnDismissListener(new acya(this, 3));
        }
    }

    @Override // defpackage.adzd
    public final void f(View view, View view2, View view3) {
        this.b = view;
        this.c = view2;
        this.m = view3;
        boolean z = this.o;
        adyz adyzVar = this.e;
        if (z) {
            if (adyzVar != null) {
                adyzVar.a(i());
                return;
            }
            return;
        }
        PopupWindow popupWindow = this.d;
        if (popupWindow != null) {
            c();
            popupWindow.setContentView(i());
            popupWindow.getContentView().setMinimumWidth(this.h.getResources().getDimensionPixelSize(R.dimen.contextual_sheet_min_width));
            e();
        }
    }

    @Override // defpackage.adzd
    public final boolean g() {
        PopupWindow popupWindow = this.d;
        return popupWindow != null && popupWindow.isShowing();
    }
}
