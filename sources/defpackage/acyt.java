package defpackage;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class acyt extends BaseTransientBottomBar$Behavior {
    public aevj b;
    public blf c;
    public View d;
    public int e = 0;
    private bdr m;

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar$Behavior, com.google.android.material.behavior.SwipeDismissBehavior, defpackage.ast
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        bdr bdrVarB = this.m;
        if (bdrVarB == null) {
            bdrVarB = bdr.b(coordinatorLayout, new acys(this));
            this.m = bdrVarB;
        }
        return bdrVarB != null && bdrVarB.j(motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.ast
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.onLayoutChild(coordinatorLayout, view, i);
        int i2 = bac.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        this.e = view.getTop();
        return false;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.ast
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        bdr bdrVar = this.m;
        if (bdrVar != null) {
            bdrVar.e(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return true;
            }
        } else if (view != null && bdrVar != null && bdr.m(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar$Behavior, com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean q(View view) {
        return true;
    }

    public final float r(View view, int i) {
        return 1.0f - ((i - this.e) / view.getHeight());
    }

    public final blf s(final View view, float f) {
        blf blfVar = new blf(new ble());
        blg blgVar = new blg(0.0f);
        blgVar.c(1.0f);
        blgVar.e(1500.0f);
        blfVar.p = blgVar;
        blfVar.h(view.getTop());
        blfVar.g = f;
        blfVar.f(new bla() { // from class: acyr
            @Override // defpackage.bla
            public final void l(float f2) {
                View view2 = view;
                int i = (int) f2;
                int top = i - view2.getTop();
                int i2 = bac.a;
                view2.offsetTopAndBottom(top);
                view2.setAlpha(this.a.r(view2, i));
            }
        });
        return blfVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final void t(aevj aevjVar) {
        this.b = aevjVar;
    }
}
