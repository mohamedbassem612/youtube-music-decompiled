package com.google.android.apps.youtube.music.browse;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class BrowseUnlimitedFragmentScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
    public boolean b;

    public BrowseUnlimitedFragmentScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.ast
    public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return !this.b && super.layoutDependsOn(coordinatorLayout, view, view2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.aeuu, defpackage.ast
    public final /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.onLayoutChild(coordinatorLayout, view, i);
        return true;
    }
}
