package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aeuf extends axx {
    final /* synthetic */ AppBarLayout a;
    final /* synthetic */ CoordinatorLayout b;
    final /* synthetic */ AppBarLayout.BaseBehavior c;

    public aeuf(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
        this.a = appBarLayout;
        this.b = coordinatorLayout;
        this.c = baseBehavior;
    }

    @Override // defpackage.axx
    public final void onInitializeAccessibilityNodeInfo(View view, bbz bbzVar) {
        super.onInitializeAccessibilityNodeInfo(view, bbzVar);
        bbzVar.v(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.a;
        if (appBarLayout.f() != 0) {
            AppBarLayout.BaseBehavior baseBehavior = this.c;
            View viewZ = AppBarLayout.BaseBehavior.z(this.b);
            if (viewZ != null) {
                int childCount = appBarLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    if (((aeuj) appBarLayout.getChildAt(i).getLayoutParams()).a != 0) {
                        if (baseBehavior.t() != (-appBarLayout.f())) {
                            bbzVar.k(bby.e);
                            bbzVar.L(true);
                        }
                        if (baseBehavior.t() != 0) {
                            if (!viewZ.canScrollVertically(-1)) {
                                bbzVar.k(bby.f);
                                bbzVar.L(true);
                                return;
                            } else {
                                if ((-appBarLayout.b()) != 0) {
                                    bbzVar.k(bby.f);
                                    bbzVar.L(true);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.axx
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i == 4096) {
            this.a.k(false);
            return true;
        }
        if (i != 8192) {
            return super.performAccessibilityAction(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.c;
        if (baseBehavior.t() != 0) {
            CoordinatorLayout coordinatorLayout = this.b;
            View viewZ = AppBarLayout.BaseBehavior.z(coordinatorLayout);
            boolean zCanScrollVertically = viewZ.canScrollVertically(-1);
            AppBarLayout appBarLayout = this.a;
            if (!zCanScrollVertically) {
                appBarLayout.k(true);
                return true;
            }
            int i2 = -appBarLayout.b();
            if (i2 != 0) {
                baseBehavior.onNestedPreScroll(coordinatorLayout, appBarLayout, viewZ, 0, i2, new int[]{0, 0}, 1);
                return true;
            }
        }
        return false;
    }
}
