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
final class jee extends Drawable {
    final float a;
    final float b;
    private final Paint c;
    private final Paint d;
    private Path e;
    private Path f;

    public jee(int i, int i2, int i3, int i4) {
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(i);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        paint2.setColor(i4);
        this.a = i2;
        this.b = i3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.f, this.d);
        canvas.drawPath(this.e, this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = new RectF(rect.left, rect.top, rect.right, rect.bottom);
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.left;
        float f4 = rect.bottom;
        float f5 = this.b;
        RectF rectF2 = new RectF(f, f2, f3 + f5, f4);
        float f6 = rect.left;
        float f7 = rect.top;
        float f8 = rect.left;
        float f9 = rect.bottom;
        float f10 = this.a;
        RectF rectF3 = new RectF(f6 + f10, f7, f8 + f5, f9);
        Path path = new Path();
        this.e = path;
        path.addRoundRect(rectF2, f10, f10, Path.Direction.CW);
        Path path2 = new Path();
        path2.addRect(rectF3, Path.Direction.CW);
        this.e.op(path2, Path.Op.UNION);
        Path path3 = new Path();
        this.f = path3;
        path3.addRoundRect(rectF, f10, f10, Path.Direction.CW);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
