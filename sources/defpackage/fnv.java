package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fnv extends Drawable implements fnx {
    private static final RectF a = new RectF();
    private static final RectF b = new RectF();
    private static final RectF c = new RectF();
    private final fnu d;
    private Paint e;
    private Path f;
    private Path g;
    private boolean h;

    public fnv(fnu fnuVar) {
        this.d = fnuVar;
    }

    private final Path c() {
        if (this.h) {
            return this.f;
        }
        return null;
    }

    private static void d(Canvas canvas, RectF rectF, Path path, float[] fArr, Paint paint) {
        float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
        if (path == null) {
            float fMin2 = Math.min(fMin, fArr[0]);
            canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        } else {
            if (path.isEmpty()) {
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            canvas.drawPath(path, paint);
        }
    }

    private final void e(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, boolean z) {
        this.e.setStrokeWidth(f);
        this.e.setColor(i);
        RectF rectF = a;
        rectF.set(f2, f3, f4, f5);
        RectF rectF2 = b;
        rectF2.set(getBounds());
        if (z) {
            rectF2.inset(rectF.centerX() - rectF.left, 0.0f);
        } else {
            rectF2.inset(0.0f, rectF.centerY() - rectF.top);
        }
        int iSave = canvas.save();
        canvas.clipRect(rectF);
        d(canvas, rectF2, c(), this.d.j, this.e);
        canvas.restoreToCount(iSave);
    }

    public final void a() {
        fnu fnuVar;
        int length;
        this.e = new Paint();
        this.f = new Path();
        this.g = new Path();
        int i = 0;
        boolean z = false;
        float f = 0.0f;
        while (true) {
            fnuVar = this.d;
            float[] fArr = fnuVar.j;
            length = fArr.length;
            if (i >= length) {
                break;
            }
            float f2 = fArr[i];
            z |= !(f2 <= 0.0f);
            if (i != 0) {
                if (f != f2) {
                    this.h = true;
                    break;
                }
            } else {
                f = f2;
            }
            i++;
        }
        if (this.h && length != 8) {
            float[] fArr2 = new float[8];
            for (int i2 = 0; i2 < 4; i2++) {
                float[] fArr3 = fnuVar.j;
                int i3 = i2 << 1;
                fArr2[i3] = fArr3[i2];
                fArr2[i3 + 1] = fArr3[i2];
            }
            fnuVar.j = fArr2;
        }
        Paint paint = this.e;
        PathEffect pathEffect = fnuVar.i;
        paint.setPathEffect(null);
        Paint paint2 = this.e;
        PathEffect pathEffect2 = fnuVar.i;
        paint2.setAntiAlias(z);
        this.e.setStyle(Paint.Style.STROKE);
    }

    @Override // defpackage.fnx
    public final boolean b(fnx fnxVar) {
        return equals(fnxVar);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        fnv fnvVar;
        Canvas canvas2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.e == null || this.f == null) {
            a();
        }
        fnu fnuVar = this.d;
        int i6 = fnuVar.e;
        int i7 = fnuVar.f;
        boolean z2 = i6 == i7 && i7 == (i5 = fnuVar.g) && i5 == fnuVar.h;
        float f = fnuVar.a;
        float f2 = fnuVar.b;
        if (f == f2) {
            float f3 = fnuVar.c;
            z = f2 == f3 && f3 == fnuVar.d;
        }
        if (!z) {
            Rect bounds = getBounds();
            float f4 = fnuVar.a;
            if (f4 <= 0.0f || (i4 = fnuVar.e) == 0) {
                fnvVar = this;
                canvas2 = canvas;
            } else {
                fnvVar = this;
                canvas2 = canvas;
                fnvVar.e(canvas2, i4, f4, bounds.left, bounds.top, Math.min(bounds.left + fnuVar.a, bounds.right), bounds.bottom, true);
            }
            float f5 = fnuVar.c;
            if (f5 > 0.0f && (i3 = fnuVar.g) != 0) {
                fnvVar.e(canvas2, i3, f5, Math.max(bounds.right - fnuVar.c, bounds.left), bounds.top, bounds.right, bounds.bottom, true);
            }
            float f6 = fnuVar.b;
            if (f6 > 0.0f && (i2 = fnuVar.f) != 0) {
                fnvVar.e(canvas2, i2, f6, bounds.left, bounds.top, bounds.right, Math.min(bounds.top + fnuVar.b, bounds.bottom), false);
            }
            float f7 = fnuVar.d;
            if (f7 <= 0.0f || (i = fnuVar.h) == 0) {
                return;
            }
            fnvVar.e(canvas2, i, f7, bounds.left, Math.max(bounds.bottom - fnuVar.d, bounds.top), bounds.right, bounds.bottom, false);
            return;
        }
        if (f != 0.0f) {
            if (z2) {
                float f8 = f / 2.0f;
                RectF rectF = b;
                rectF.set(getBounds());
                rectF.inset(f8, f8);
                this.e.setStrokeWidth(f);
                this.e.setColor(i6);
                d(canvas, rectF, c(), fnuVar.j, this.e);
                return;
            }
            this.e.setStrokeWidth(f);
            float f9 = fnuVar.a / 2.0f;
            RectF rectF2 = b;
            rectF2.set(getBounds());
            int iSave = canvas.save();
            canvas.translate(rectF2.left, rectF2.top);
            rectF2.offsetTo(0.0f, 0.0f);
            rectF2.inset(f9, f9);
            RectF rectF3 = c;
            rectF3.set(rectF2);
            float fMin = Math.min(rectF2.width(), rectF2.height()) / 3.0f;
            rectF3.inset(fMin, fMin);
            int i8 = fnuVar.e;
            if (i8 != 0) {
                int iSave2 = canvas.save();
                this.e.setColor(i8);
                this.g.reset();
                this.g.moveTo(rectF2.left - f9, rectF2.top - f9);
                this.g.lineTo(rectF3.left, rectF3.top);
                this.g.lineTo(rectF3.left, rectF3.bottom);
                this.g.lineTo(rectF2.left - f9, rectF2.bottom + f9);
                this.g.close();
                canvas.clipPath(this.g);
                d(canvas, rectF2, c(), fnuVar.j, this.e);
                canvas.restoreToCount(iSave2);
            }
            int i9 = fnuVar.f;
            if (i9 != 0) {
                int iSave3 = canvas.save();
                this.e.setColor(i9);
                this.g.reset();
                this.g.moveTo(rectF2.left - f9, rectF2.top - f9);
                this.g.lineTo(rectF3.left, rectF3.top);
                this.g.lineTo(rectF3.right, rectF3.top);
                this.g.lineTo(rectF2.right + f9, rectF2.top - f9);
                this.g.close();
                canvas.clipPath(this.g);
                d(canvas, rectF2, c(), fnuVar.j, this.e);
                canvas.restoreToCount(iSave3);
            }
            int i10 = fnuVar.g;
            if (i10 != 0) {
                int iSave4 = canvas.save();
                this.e.setColor(i10);
                this.g.reset();
                this.g.moveTo(rectF2.right + f9, rectF2.top - f9);
                this.g.lineTo(rectF3.right, rectF3.top);
                this.g.lineTo(rectF3.right, rectF3.bottom);
                this.g.lineTo(rectF2.right + f9, rectF2.bottom + f9);
                this.g.close();
                canvas.clipPath(this.g);
                d(canvas, rectF2, c(), fnuVar.j, this.e);
                canvas.restoreToCount(iSave4);
            }
            int i11 = fnuVar.h;
            if (i11 != 0) {
                int iSave5 = canvas.save();
                this.e.setColor(i11);
                this.g.reset();
                this.g.moveTo(rectF2.left - f9, rectF2.bottom + f9);
                this.g.lineTo(rectF3.left, rectF3.bottom);
                this.g.lineTo(rectF3.right, rectF3.bottom);
                this.g.lineTo(rectF2.right + f9, rectF2.bottom + f9);
                this.g.close();
                canvas.clipPath(this.g);
                d(canvas, rectF2, c(), fnuVar.j, this.e);
                canvas.restoreToCount(iSave5);
            }
            canvas.restoreToCount(iSave);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fnv) {
            return gzj.bH(this.d, ((fnv) obj).d);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Paint paint = this.e;
        if (paint != null) {
            return paint.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.e;
        if (paint != null) {
            paint.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.e;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }
}
