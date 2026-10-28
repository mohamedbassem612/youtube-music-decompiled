package com.google.android.libraries.youtube.creation.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class LockedBottomSheetBehavior extends BottomSheetBehavior {
    public LockedBottomSheetBehavior() {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, defpackage.ast
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, defpackage.ast
    public final boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, defpackage.ast
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, defpackage.ast
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public LockedBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, defpackage.ast
    public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, defpackage.ast
    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
    }
}
