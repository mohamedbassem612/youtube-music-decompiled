package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class npk extends Drawable {
    private final Path i;
    private final Path j;
    private final Path k;
    private final Path l;
    private static final int a = -1460227477;
    private static final Paint e = npl.a(a);
    private static final int b = -1459624551;
    private static final Paint f = npl.a(b);
    private static final int c = -1936472963;
    private static final Paint g = npl.a(c);
    private static final int d = -1469077284;
    private static final Paint h = npl.a(d);

    public npk(RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4) {
        Path path = new Path();
        this.i = path;
        Path path2 = new Path();
        this.j = path2;
        Path path3 = new Path();
        this.k = path3;
        Path path4 = new Path();
        this.l = path4;
        path.addRect(rectF, Path.Direction.CW);
        path.addRect(rectF2, Path.Direction.CCW);
        path2.addRect(rectF2, Path.Direction.CW);
        path2.addRect(rectF3, Path.Direction.CCW);
        path3.addRect(rectF3, Path.Direction.CW);
        path3.addRect(rectF4, Path.Direction.CCW);
        path4.addRect(rectF4, Path.Direction.CW);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.i, e);
        canvas.drawPath(this.j, f);
        canvas.drawPath(this.k, g);
        canvas.drawPath(this.l, h);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
