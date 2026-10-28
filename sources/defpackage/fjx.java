package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fjx extends Drawable implements Drawable.Callback, fli {
    private Drawable a;
    private fij b;
    private boolean c;

    private final void f(boolean z, boolean z2) {
        Drawable drawable = this.a;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        try {
            this.a.setVisible(z, z2);
        } catch (NullPointerException unused) {
        }
    }

    public final void a(int i, int i2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public final void b(Drawable drawable, fij fijVar) {
        Drawable drawable2 = this.a;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                f(false, false);
                this.a.setCallback(null);
            }
            this.a = drawable;
            if (drawable != null) {
                f(isVisible(), false);
                this.a.setCallback(this);
            }
            this.b = fijVar;
            this.c = (fijVar != null && fijVar.a) || (this.a instanceof InsetDrawable);
            invalidateSelf();
        }
    }

    public final void c() {
        if (this.a != null) {
            f(false, false);
            this.a.setCallback(null);
        }
        this.a = null;
        this.b = null;
        this.c = false;
    }

    @Override // defpackage.fli
    public final boolean d(MotionEvent motionEvent, View view) {
        Rect bounds = getBounds();
        int x = ((int) motionEvent.getX()) - bounds.left;
        int y = ((int) motionEvent.getY()) - bounds.top;
        Drawable drawable = this.a;
        drawable.getClass();
        drawable.setHotspot(x, y);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.a != null) {
            Rect bounds = getBounds();
            int iSave = canvas.save();
            canvas.translate(bounds.left, bounds.top);
            if (this.c) {
                canvas.clipRect(0, 0, bounds.width(), bounds.height());
            }
            fij fijVar = this.b;
            if (fijVar != null) {
                canvas.concat(fijVar);
            }
            this.a.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // defpackage.fli
    public final boolean e(MotionEvent motionEvent) {
        Drawable drawable = this.a;
        return drawable != null && (drawable instanceof RippleDrawable) && motionEvent.getActionMasked() == 0 && getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return -1;
        }
        return drawable.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return null;
        }
        return drawable.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return -1;
        }
        return drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return -1;
        }
        return drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return -1;
        }
        return drawable.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return -1;
        }
        return drawable.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return -1;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.a;
        return drawable != null && drawable.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return null;
        }
        return drawable.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return null;
        }
        return drawable.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.a;
        return drawable != null && drawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        Drawable drawable = this.a;
        return drawable != null && drawable.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setChangingConfigurations(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        Drawable drawable = this.a;
        return drawable != null && drawable.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        f(z, z2);
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
