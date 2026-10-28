package defpackage;

import android.R;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mqr extends Drawable {
    private static final int[] d = {R.attr.state_pressed};
    private static final int[] e = {R.attr.state_activated};
    public int a;
    public nei b;
    public boolean c;
    private final Paint f;
    private final RectF g;
    private float h;
    private Path i;

    public mqr() {
        Paint paint = new Paint(1);
        this.f = paint;
        this.g = new RectF();
        this.a = 0;
        this.h = 0.0f;
        this.i = null;
        this.c = false;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(0);
    }

    private final boolean c() {
        nei neiVar = this.b;
        if (neiVar == null) {
            return true;
        }
        if (!neiVar.aD() && !this.b.aG() && !this.b.aH() && !this.b.aK() && !this.b.aF() && !this.b.aE() && !this.b.aJ() && !this.b.aI()) {
            return true;
        }
        if (this.b.aA() && this.b.aB() && this.b.ax() && this.b.aw()) {
            return true;
        }
        return this.b.aC() && this.b.az() && this.b.ay() && this.b.av();
    }

    public final void a() {
        Path path;
        if (c()) {
            path = null;
        } else {
            nei neiVar = this.b;
            if (neiVar == null) {
                path = new Path();
            } else {
                float[] fArr = new float[8];
                if (neiVar.aA() || ((!this.c && this.b.aC()) || (this.c && this.b.az()))) {
                    float f = this.h;
                    fArr[0] = f;
                    fArr[1] = f;
                }
                if (this.b.aB() || ((!this.c && this.b.az()) || (this.c && this.b.aC()))) {
                    float f2 = this.h;
                    fArr[2] = f2;
                    fArr[3] = f2;
                }
                if (this.b.ax() || ((!this.c && this.b.av()) || (this.c && this.b.ay()))) {
                    float f3 = this.h;
                    fArr[4] = f3;
                    fArr[5] = f3;
                }
                if (this.b.aw() || ((!this.c && this.b.ay()) || (this.c && this.b.av()))) {
                    float f4 = this.h;
                    fArr[6] = f4;
                    fArr[7] = f4;
                }
                path = new Path();
                path.addRoundRect(this.g, fArr, Path.Direction.CW);
            }
        }
        this.i = path;
    }

    public final void b(float f) {
        if (this.h != f) {
            this.h = f;
            a();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.h <= 0.5f) {
            canvas.drawRect(this.g, this.f);
            return;
        }
        if (c()) {
            RectF rectF = this.g;
            float f = this.h;
            canvas.drawRoundRect(rectF, f, f, this.f);
        } else {
            Path path = this.i;
            path.getClass();
            canvas.drawPath(path, this.f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int alpha = this.f.getAlpha();
        if (alpha == 255) {
            if (this.h < 0.5f) {
                return -1;
            }
        } else if (alpha == 0) {
            return -2;
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.g.set(rect);
        a();
        int i = this.a;
        if (i != 0) {
            this.f.setColor(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        Paint paint = this.f;
        int color = paint.getColor();
        if (StateSet.stateSetMatches(d, iArr)) {
            if (color != 0) {
                paint.setColor(0);
                invalidateSelf();
                return true;
            }
        } else if (!StateSet.stateSetMatches(e, iArr)) {
            int i = this.a;
            if (i == 0) {
                if (color == 0) {
                    return super.onStateChange(iArr);
                }
                paint.setColor(0);
                invalidateSelf();
                return true;
            }
            if (color != i) {
                paint.setColor(i);
                invalidateSelf();
                return true;
            }
        } else if (color != 0) {
            paint.setColor(0);
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
    }
}
