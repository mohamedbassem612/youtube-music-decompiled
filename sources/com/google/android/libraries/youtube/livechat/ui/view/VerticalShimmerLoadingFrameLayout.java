package com.google.android.libraries.youtube.livechat.ui.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import defpackage.adey;
import defpackage.aedd;
import defpackage.bac;
import defpackage.tuk;
import defpackage.tzk;
import defpackage.xcu;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class VerticalShimmerLoadingFrameLayout extends LoadingFrameLayout {
    private static final long e;
    public View a;
    public View b;
    private final ValueAnimator f;
    private final Context g;
    private final View h;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        e = 1000L;
    }

    public VerticalShimmerLoadingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = context;
        View view = new View(context);
        this.h = view;
        view.setBackgroundColor(tzk.n(context, R.attr.liveChatShimmerLoadingFrameOverlayColor).orElse(0));
        addView(view, -1, -1);
        View view2 = new View(context);
        this.a = view2;
        view2.setBackgroundColor(tzk.n(context, R.attr.liveChatShimmerLoadingFrameBackgroundColor).orElse(0));
        addView(this.a, -1, -1);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{tzk.n(context, R.attr.liveChatShimmerLoadingFrameShimmerStartColor).orElse(0), tzk.n(context, R.attr.liveChatShimmerLoadingFrameShimmerMiddleColor).orElse(0), tzk.n(context, R.attr.liveChatShimmerLoadingFrameShimmerEndColor).orElse(0)});
        View view3 = new View(context);
        this.b = view3;
        view3.setBackground(gradientDrawable);
        addView(this.b, -1, -1);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j = e;
        valueAnimatorOfFloat.setRepeatCount((int) (30000 / j));
        valueAnimatorOfFloat.setInterpolator(aedd.a);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addListener(new xcu(this));
        valueAnimatorOfFloat.addUpdateListener(new adey(this, 1));
        this.f = valueAnimatorOfFloat;
        c();
    }

    private final void h() {
        d(true);
        if (getChildAt(getChildCount() - 1) != this.b) {
            bringChildToFront(this.h);
            bringChildToFront(this.a);
            bringChildToFront(this.b);
        }
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator.isStarted()) {
            return;
        }
        valueAnimator.start();
    }

    private final void i() {
        this.f.end();
    }

    @Override // com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout
    public final void a() {
        if (this.a != null) {
            i();
            super.g(2);
        }
    }

    @Override // com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout
    public final void b(CharSequence charSequence, boolean z) {
        if (this.a != null) {
            i();
            super.b(charSequence, z);
        }
    }

    @Override // com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout
    public final void c() {
        if (this.a != null) {
            int i = bac.a;
            if (isAttachedToWindow()) {
                h();
            }
        }
    }

    public final void d(boolean z) {
        tuk.l(this.h, z);
        tuk.l(this.a, z);
        tuk.l(this.b, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == null || this.d != 1) {
            return;
        }
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a != null) {
            i();
        }
    }

    public VerticalShimmerLoadingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalShimmerLoadingFrameLayout(Context context) {
        this(context, null);
    }
}
