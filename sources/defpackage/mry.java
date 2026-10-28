package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.method.MovementMethod;
import android.view.MotionEvent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mry extends AppCompatTextView {
    public static final mrw a = new mrw();
    public static final mru b = new mru();
    public boolean c;
    public boolean d;
    public boolean e;
    public heg f;

    public mry(Context context) {
        super(context);
        this.c = false;
        this.d = false;
        this.e = false;
    }

    public final Layout a(CharSequence charSequence) {
        return new StaticLayout(charSequence, getPaint(), (getWidth() - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), 0.0f, false);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, int i) {
        addOnLayoutChangeListener(new mrs(this, i, charSequence, charSequence2));
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        MovementMethod movementMethod = getMovementMethod();
        setTextIsSelectable(false);
        setTextIsSelectable(this.e);
        setMovementMethod(movementMethod);
        super.onAttachedToWindow();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        heg hegVar = this.f;
        if (hegVar == null) {
            super.onDraw(canvas);
            return;
        }
        int iSaveLayer = hegVar.w() ? canvas.saveLayer(new RectF(0.0f, 0.0f, getWidth(), getHeight()), null) : 0;
        this.f.u(canvas);
        super.onDraw(canvas);
        this.f.t(canvas);
        if (this.f.w()) {
            canvas.restoreToCount(iSaveLayer);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d = false;
        super.onTouchEvent(motionEvent);
        if (this.d || isTextSelectable()) {
            return true;
        }
        if (this.c) {
            return false;
        }
        return performClick();
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
    }
}
