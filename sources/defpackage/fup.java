package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class fup extends Drawable {
    public Paint a;
    public boolean b;
    private final Paint c;
    private float d;

    public fup() {
        new RectF();
        new Path();
        this.b = true;
        this.c = new Paint(5);
        a();
    }

    public final void a() {
        this.a = new Paint(1);
    }

    final void b(int i) {
        Paint paint = this.c;
        if (paint.getColor() != i) {
            paint.setColor(i);
            invalidateSelf();
        }
    }

    final void c(float f) {
        float f2 = (int) (f + 0.5f);
        if (this.d != f2) {
            this.b = true;
            this.d = f2;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float f = bounds.left;
        float f2 = bounds.top;
        float f3 = bounds.right;
        float f4 = bounds.bottom;
        Paint paint = this.c;
        float f5 = this.d;
        canvas.drawRoundRect(f, f2, f3, f4, f5, f5, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }
}
