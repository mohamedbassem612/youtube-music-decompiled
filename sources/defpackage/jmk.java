package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jmk extends SwipeRefreshLayout {
    private ImageView k;
    private View l;

    public jmk(Context context) {
        super(context);
        tzk.n(context, R.attr.ytOverlayTextSecondary).ifPresent(new jmj(this, 0));
        j(0);
        q();
    }

    private final void q() {
        ImageView imageView = this.k;
        if (imageView != null) {
            imageView.setElevation(0.0f);
            Drawable drawable = this.k.getDrawable();
            if (drawable instanceof dqg) {
                dqg dqgVar = (dqg) drawable;
                dqgVar.a.c(0.0f, 0.0f);
                dqgVar.invalidateSelf();
                dqgVar.b(false);
                dqgVar.setAlpha(255);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        super.addView(view);
        if (!(view instanceof ImageView)) {
            this.l = view;
        } else {
            this.k = (ImageView) view;
            q();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        p();
        super.dispatchDraw(canvas);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public final void k(boolean z) {
        View view;
        boolean z2 = this.b;
        super.l(z, false);
        if (!z) {
            if (z2) {
                ImageView imageView = this.k;
                if (imageView != null) {
                    imageView.clearAnimation();
                    this.k.setVisibility(8);
                }
                View view2 = this.l;
                if (view2 != null) {
                    view2.setTranslationY(0.0f);
                    return;
                }
                return;
            }
            if (!isAttachedToWindow() && (view = this.l) != null) {
                view.setTranslationY(0.0f);
                return;
            }
        }
        p();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        p();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        boolean zOnStartNestedScroll = super.onStartNestedScroll(view, view2, i);
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).onStartNestedScroll(this, view2, i);
        }
        return zOnStartNestedScroll;
    }

    final void p() {
        q();
        if (this.l != null) {
            ImageView imageView = this.k;
            float fMax = 0.0f;
            if (imageView != null && imageView.getVisibility() == 0) {
                fMax = Math.max(0.0f, this.k.getBottom() * this.k.getScaleY());
            }
            this.l.setTranslationY(fMax);
        }
    }
}
