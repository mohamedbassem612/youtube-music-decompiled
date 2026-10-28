package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.apps.youtube.music.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class aezb extends ProgressBar {
    public final aezc a;
    public int b;
    public final int c;
    public final int d;
    public boolean e;
    public final int f;
    public boolean g;
    public final Runnable h;
    public final Runnable i;
    private final boolean j;
    private final dta k;
    private final dta l;

    protected aezb(Context context, AttributeSet attributeSet, int i, int i2) {
        super(afev.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        this.e = false;
        this.f = 4;
        this.h = new aemk(this, 12);
        this.i = new aemk(this, 13);
        this.k = new aeyz(this);
        this.l = new aeza(this);
        Context context2 = getContext();
        this.a = a(context2, attributeSet);
        TypedArray typedArrayA = aeym.a(context2, attributeSet, afai.a, i, i2, new int[0]);
        this.c = typedArrayA.getInt(7, -1);
        this.d = Math.min(typedArrayA.getInt(5, -1), 1000);
        typedArrayA.recycle();
        this.j = true;
    }

    private final aezw h() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() != null) {
                return getIndeterminateDrawable().a;
            }
        } else if (getProgressDrawable() != null) {
            return getProgressDrawable().a;
        }
        return null;
    }

    public abstract aezc a(Context context, AttributeSet attributeSet);

    @Override // android.widget.ProgressBar
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aezq getProgressDrawable() {
        return (aezq) super.getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final aezy getIndeterminateDrawable() {
        return (aezy) super.getIndeterminateDrawable();
    }

    protected final void d(boolean z) {
        if (this.j) {
            ((aezu) getCurrentDrawable()).l(f(), false, z);
        }
    }

    public final void e() {
        if (this.d > 0) {
            SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    final boolean f() {
        if (isAttachedToWindow() && getWindowVisibility() == 0) {
            View view = this;
            while (view.getVisibility() == 0) {
                Object parent = view.getParent();
                if (parent == null) {
                    if (getWindowVisibility() == 0) {
                    }
                } else if (parent instanceof View) {
                    view = (View) parent;
                }
                return true;
            }
        }
        return false;
    }

    public void g(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.b = i;
            this.e = true;
            if (!getIndeterminateDrawable().isVisible() || aext.a(getContext().getContentResolver()) == 0.0f) {
                this.k.b(getIndeterminateDrawable());
            } else {
                getIndeterminateDrawable().b.d();
            }
        }
    }

    @Override // android.widget.ProgressBar
    public final Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().b.c(this.k);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().h(this.l);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().h(this.l);
        }
        if (f()) {
            e();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.i);
        removeCallbacks(this.h);
        ((aezu) getCurrentDrawable()).l(false, false, false);
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().n(this.l);
            getIndeterminateDrawable().b.g();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().n(this.l);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        int iSave = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        h().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final synchronized void onMeasure(int i, int i2) {
        aezw aezwVarH = h();
        if (aezwVarH == null) {
            return;
        }
        setMeasuredDimension(aezwVarH.b() < 0 ? getDefaultSize(getSuggestedMinimumWidth(), i) : aezwVarH.b() + getPaddingLeft() + getPaddingRight(), aezwVarH.a() < 0 ? getDefaultSize(getSuggestedMinimumHeight(), i2) : aezwVarH.a() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        d(i == 0);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        d(false);
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        Drawable currentDrawable = getCurrentDrawable();
        if (currentDrawable != null) {
            ((aezu) currentDrawable).l(false, false, false);
        }
        super.setIndeterminate(z);
        Drawable currentDrawable2 = getCurrentDrawable();
        if (currentDrawable2 != null) {
            ((aezu) currentDrawable2).l(f(), false, false);
        }
        if ((currentDrawable2 instanceof aezy) && f()) {
            ((aezy) currentDrawable2).b.f();
        }
        this.e = false;
    }

    @Override // android.widget.ProgressBar
    public final void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof aezy) {
            ((aezu) drawable).l(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else {
            if (this.g) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            super.setIndeterminateDrawable(drawable);
        }
    }

    @Override // android.widget.ProgressBar
    public final synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        g(i);
    }

    @Override // android.widget.ProgressBar
    public final void setProgressDrawable(Drawable drawable) {
        if (!(drawable instanceof aezq)) {
            if (this.g) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            super.setProgressDrawable(drawable);
        } else {
            aezq aezqVar = (aezq) drawable;
            aezqVar.l(false, false, false);
            super.setProgressDrawable(aezqVar);
            aezqVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }
}
