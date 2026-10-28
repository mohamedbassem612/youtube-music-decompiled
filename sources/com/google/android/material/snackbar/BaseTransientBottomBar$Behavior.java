package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.afcq;
import defpackage.afcy;
import defpackage.auym;
import defpackage.avgj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior {
    public final auym l = new auym((SwipeDismissBehavior) this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.ast
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        auym auymVar = this.l;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                afcy.a().h((avgj) auymVar.b);
            }
        } else if (coordinatorLayout.l(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            afcy.a().g((avgj) auymVar.b);
        }
        return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public boolean q(View view) {
        return view instanceof afcq;
    }
}
