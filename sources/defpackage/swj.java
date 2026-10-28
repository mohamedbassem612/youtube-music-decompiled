package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class swj extends ttl {
    public boolean a;
    private final Paint b;
    private final int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public swj(Drawable drawable, int i, int i2) {
        super(drawable == null ? new ColorDrawable(0) : drawable);
        Paint paint = new Paint();
        this.b = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i2);
        paint.setColor(i);
        this.a = true;
        this.c = 80;
    }

    @Override // defpackage.ttl, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.a) {
            canvas.drawLine(this.d, this.e, this.f, this.g, this.b);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float strokeWidth = this.b.getStrokeWidth();
        int i = this.c;
        if (Gravity.isVertical(i)) {
            int iFloor = (int) (i == 80 ? Math.floor(rect.bottom - (strokeWidth / 2.0f)) : Math.floor(rect.top + (strokeWidth / 2.0f)));
            this.d = rect.left;
            this.e = iFloor;
            this.f = rect.right;
            this.g = iFloor;
            return;
        }
        int iFloor2 = (int) (i == 3 ? Math.floor(rect.left + (strokeWidth / 2.0f)) : Math.floor(rect.right - (strokeWidth / 2.0f)));
        this.d = iFloor2;
        this.e = rect.top;
        this.f = iFloor2;
        this.g = rect.bottom;
    }

    @Override // defpackage.ttl, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.b.setAlpha(i);
    }
}
