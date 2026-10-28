package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ovh extends View {
    public RippleDrawable a;
    public boolean b;
    public Runnable c;

    public ovh(Context context) {
        super(context);
        this.b = false;
        setImportantForAccessibility(2);
    }

    public final void a() {
        this.c = null;
        RippleDrawable rippleDrawable = this.a;
        if (rippleDrawable != null) {
            rippleDrawable.setCallback(null);
            unscheduleDrawable(this.a);
            this.a = null;
        }
        setBackground(null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (this.b) {
            if (isAttachedToWindow()) {
                super.draw(canvas);
            } else {
                a();
            }
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void requestLayout() {
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
