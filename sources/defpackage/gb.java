package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gb implements ayx {
    final /* synthetic */ gp a;

    public gb(gp gpVar) {
        this.a = gpVar;
    }

    @Override // defpackage.ayx
    public final bbn a(View view, bbn bbnVar) {
        bbb bavVar;
        bbn bbnVarA = bbnVar;
        int iD = bbnVarA.d();
        int iD2 = bbnVarA.d();
        gp gpVar = this.a;
        ActionBarContextView actionBarContextView = gpVar.q;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gpVar.q.getLayoutParams();
            boolean z = false;
            if (gpVar.q.isShown()) {
                if (gpVar.F == null) {
                    gpVar.F = new Rect();
                    gpVar.G = new Rect();
                }
                Rect rect = gpVar.F;
                Rect rect2 = gpVar.G;
                rect.set(bbnVarA.b(), bbnVarA.d(), bbnVarA.c(), bbnVarA.a());
                avw avwVarF = bbnVarA.f(2);
                ViewGroup viewGroup = gpVar.u;
                boolean z2 = true;
                if (Build.VERSION.SDK_INT >= 29) {
                    Insets systemWindowInsets = viewGroup.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
                    rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
                } else {
                    if (!pl.a) {
                        pl.a = true;
                        try {
                            pl.b = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            if (!pl.b.isAccessible()) {
                                pl.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    Method method = pl.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                avw avwVarD = avw.d(Math.max(0, avwVarF.b - rect2.left), Math.max(0, avwVarF.c - rect2.top), Math.max(0, avwVarF.d - rect2.right), Math.max(0, avwVarF.e - rect2.bottom));
                int i = marginLayoutParams.leftMargin;
                int i2 = avwVarD.b;
                if (i == i2 && marginLayoutParams.rightMargin == avwVarD.d) {
                    z2 = false;
                } else {
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = avwVarD.d;
                }
                ActionBarContextView actionBarContextView2 = gpVar.q;
                int i3 = rect.left - i2;
                int i4 = rect.top;
                int i5 = rect.right - avwVarD.d;
                actionBarContextView2.k = i3;
                actionBarContextView2.l = i4;
                actionBarContextView2.m = i5;
                actionBarContextView2.n();
                if (!gpVar.x && rect.top > 0) {
                    iD2 = 0;
                }
                z = z2;
            }
            if (z) {
                gpVar.q.setLayoutParams(marginLayoutParams);
            }
        }
        if (iD != iD2) {
            int iB = bbnVarA.b();
            int iC = bbnVarA.c();
            int iA = bbnVarA.a();
            if (Build.VERSION.SDK_INT >= 36) {
                bavVar = new bba(bbnVarA);
            } else if (Build.VERSION.SDK_INT >= 35) {
                bavVar = new baz(bbnVarA);
            } else if (Build.VERSION.SDK_INT >= 34) {
                bavVar = new bay(bbnVarA);
            } else if (Build.VERSION.SDK_INT >= 31) {
                bavVar = new bax(bbnVarA);
            } else if (Build.VERSION.SDK_INT >= 30) {
                bavVar = new baw(bbnVarA);
            } else {
                bavVar = Build.VERSION.SDK_INT >= 29 ? new bav(bbnVarA) : new bau(bbnVarA);
            }
            bavVar.c(avw.d(iB, iD2, iC, iA));
            bbnVarA = bavVar.a();
        }
        return bac.f(view, bbnVarA);
    }
}
