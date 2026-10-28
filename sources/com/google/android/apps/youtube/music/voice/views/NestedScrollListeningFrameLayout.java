package com.google.android.apps.youtube.music.voice.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.awqx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class NestedScrollListeningFrameLayout extends FrameLayout {
    public Runnable a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NestedScrollListeningFrameLayout(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        view.getClass();
        view2.getClass();
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
        return super.onStartNestedScroll(view, view2, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollListeningFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ NestedScrollListeningFrameLayout(Context context, AttributeSet attributeSet, int i, awqx awqxVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
