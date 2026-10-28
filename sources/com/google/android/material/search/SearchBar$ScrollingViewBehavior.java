package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.aeuw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
    private boolean b;

    public SearchBar$ScrollingViewBehavior() {
        this.b = false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.ast
    public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        super.onDependentViewChanged(coordinatorLayout, view, view2);
        if (!this.b && (view2 instanceof AppBarLayout)) {
            this.b = true;
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            appBarLayout.setTouchscreenBlocksFocus(false);
            appBarLayout.setBackgroundColor(0);
            aeuw.a(appBarLayout, 0.0f);
        }
        return false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.aeuu, defpackage.ast
    public final /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.onLayoutChild(coordinatorLayout, view, i);
        return true;
    }

    @Override // defpackage.aeus
    protected final boolean shouldHeaderOverlapScrollingChild() {
        return true;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
    }
}
