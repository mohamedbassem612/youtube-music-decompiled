package com.google.android.apps.youtube.music.ui.appchrome.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class MusicAppBarBehavior extends AppBarLayout.Behavior {
    private final Field e;
    private OverScroller f;

    public MusicAppBarBehavior() {
        this.e = B(getClass());
    }

    private final Field B(Class cls) {
        try {
            Field declaredField = cls.getDeclaredField("scroller");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException unused) {
            Class superclass = cls.getSuperclass();
            if (superclass != null) {
                return B(superclass);
            }
            return null;
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, defpackage.ast
    public final /* bridge */ /* synthetic */ void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        onNestedPreScroll(coordinatorLayout, (AppBarLayout) view, view2, i, i2, iArr, i3);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    /* JADX INFO: renamed from: q */
    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        Field field;
        super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        try {
            if (this.f == null && (field = this.e) != null) {
                this.f = (OverScroller) field.get(this);
            }
        } catch (IllegalAccessException unused) {
        }
        OverScroller overScroller = this.f;
        if (overScroller != null) {
            overScroller.abortAnimation();
        }
    }

    public MusicAppBarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = B(getClass());
    }
}
