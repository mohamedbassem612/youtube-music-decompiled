package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class otm extends Drawable {
    private final RectF a;
    private boolean b;
    protected final Matrix n = new Matrix();
    protected final Paint o;
    protected final RectF p;
    protected final ImageView.ScaleType q;
    protected final Bitmap r;
    protected final BitmapShader s;
    public boolean t;
    public final oui u;

    public otm(Bitmap bitmap, ImageView.ScaleType scaleType, oui ouiVar) {
        Paint paint = new Paint(3);
        this.o = paint;
        this.p = new RectF();
        RectF rectF = new RectF();
        this.a = rectF;
        this.t = false;
        this.b = false;
        this.r = bitmap;
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        this.s = bitmapShader;
        paint.setShader(bitmapShader);
        rectF.set(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        this.q = scaleType;
        this.u = ouiVar;
    }

    private final boolean a() {
        boolean z = this.t && getLayoutDirection() == 1;
        if (this.b == z) {
            return false;
        }
        this.b = z;
        return true;
    }

    protected final BitmapShader c(Canvas canvas) {
        if (!canvas.isHardwareAccelerated()) {
            Bitmap bitmap = this.r;
            if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                if (bitmapCopy != null) {
                    return new BitmapShader(bitmapCopy, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                }
                this.u.d();
            }
        }
        return this.s;
    }

    protected final void d(Rect rect) {
        float f;
        float f2;
        float f3;
        Bitmap bitmap = this.r;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fWidth = rect.width();
        float fHeight = rect.height();
        Matrix matrix = this.n;
        matrix.reset();
        if (width <= 0.0f || height <= 0.0f || fWidth <= 0.0f || fHeight <= 0.0f) {
            return;
        }
        ImageView.ScaleType scaleType = this.q;
        if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            scaleType = (width > fWidth || height > fHeight) ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.CENTER;
        }
        int i = otl.a[scaleType.ordinal()];
        if (i == 1) {
            float fCenterX = rect.centerX();
            RectF rectF = this.a;
            float fCenterX2 = fCenterX - rectF.centerX();
            float fCenterY = rect.centerY() - rectF.centerY();
            matrix.setTranslate(fCenterX2, fCenterY);
            RectF rectF2 = this.p;
            rectF2.set(rectF);
            rectF2.offset(fCenterX2, fCenterY);
            rectF2.intersect(rect.left, rect.top, rect.right, rect.bottom);
        } else if (i != 2) {
            RectF rectF3 = this.p;
            if (i != 3) {
                rectF3.set(rect);
                matrix.setRectToRect(this.a, rectF3, Matrix.ScaleToFit.FILL);
            } else {
                rectF3.set(rect);
                RectF rectF4 = this.a;
                matrix.setRectToRect(rectF4, rectF3, Matrix.ScaleToFit.CENTER);
                matrix.mapRect(rectF3, rectF4);
            }
        } else {
            if (width * fHeight > fWidth * height) {
                f3 = fHeight / height;
                f = rect.top;
                f2 = rect.left + ((fWidth - (width * f3)) * 0.5f);
            } else {
                float f4 = fWidth / width;
                float f5 = rect.left;
                f = rect.top + ((fHeight - (height * f4)) * 0.5f);
                f2 = f5;
                f3 = f4;
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate(Math.round(f2), Math.round(f));
            this.p.set(rect);
        }
        if (this.b) {
            matrix.preTranslate(width, 0.0f);
            matrix.preScale(-1.0f, 1.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.r;
        if (bitmap == null || bitmap.isRecycled()) {
            this.u.a(aslh.LOG_TYPE_INTERNAL_ERROR, "ElementsDrawable.draw: bitmap is null or recycled. This error is part of b/307824081 and is not actionable for you. Contact @laijess for more details.");
            return;
        }
        BitmapShader bitmapShaderC = c(canvas);
        bitmapShaderC.setLocalMatrix(this.n);
        Paint paint = this.o;
        paint.setShader(bitmapShaderC);
        canvas.drawRect(this.p, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.o.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Paint paint = this.o;
        if (paint.getAlpha() == 255) {
            return -1;
        }
        return paint.getAlpha() == 0 ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.t;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        a();
        d(rect);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        if (!a()) {
            return false;
        }
        d(getBounds());
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.o.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        if (this.t != z) {
            this.t = z;
            if (a()) {
                d(getBounds());
                invalidateSelf();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.o.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
