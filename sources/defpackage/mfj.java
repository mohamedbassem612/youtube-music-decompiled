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
/* JADX INFO: loaded from: classes.dex */
public class mfj extends Drawable {
    private static final agrf a = agrf.h("com/google/android/libraries/elements/base/ElementsDrawable");
    private final RectF b;
    private boolean c;
    private boolean d;
    protected final Matrix i;
    protected final Paint j;
    protected final RectF k;
    protected final ImageView.ScaleType l;
    public Bitmap m;
    public boolean n;
    public final nuc o;
    public boolean p;

    public mfj(Bitmap bitmap, ImageView.ScaleType scaleType, nuc nucVar, agev agevVar) {
        this.i = new Matrix();
        this.j = new Paint(3);
        this.k = new RectF();
        RectF rectF = new RectF();
        this.b = rectF;
        this.n = false;
        this.c = false;
        this.d = false;
        this.p = false;
        if (agevVar.g() && ((nub) agevVar.c()).c) {
            this.d = true;
            this.m = bitmap;
        } else if (bitmap.isMutable()) {
            this.m = bitmap.copy(bitmap.getConfig(), false);
        } else {
            this.m = bitmap;
        }
        rectF.set(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        this.l = scaleType;
        this.o = nucVar;
    }

    private final boolean a() {
        boolean z = this.n && getLayoutDirection() == 1;
        if (this.c == z) {
            return false;
        }
        this.c = z;
        return true;
    }

    protected void b(Rect rect) {
        float f;
        float f2;
        float f3;
        float width = this.m.getWidth();
        float height = this.m.getHeight();
        float fWidth = rect.width();
        float fHeight = rect.height();
        Matrix matrix = this.i;
        matrix.reset();
        if (width <= 0.0f || height <= 0.0f || fWidth <= 0.0f || fHeight <= 0.0f) {
            return;
        }
        ImageView.ScaleType scaleType = this.l;
        if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            scaleType = (width > fWidth || height > fHeight) ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.CENTER;
        }
        int i = mfi.a[scaleType.ordinal()];
        if (i == 1) {
            float fCenterX = rect.centerX();
            RectF rectF = this.b;
            float fCenterX2 = fCenterX - rectF.centerX();
            float fCenterY = rect.centerY() - rectF.centerY();
            matrix.setTranslate(fCenterX2, fCenterY);
            RectF rectF2 = this.k;
            rectF2.set(rectF);
            rectF2.offset(fCenterX2, fCenterY);
            rectF2.intersect(rect.left, rect.top, rect.right, rect.bottom);
        } else if (i != 2) {
            RectF rectF3 = this.k;
            if (i != 3) {
                rectF3.set(rect);
                matrix.setRectToRect(this.b, rectF3, Matrix.ScaleToFit.FILL);
            } else {
                rectF3.set(rect);
                RectF rectF4 = this.b;
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
            this.k.set(rect);
        }
        if (this.c) {
            matrix.preTranslate(width, 0.0f);
            matrix.preScale(-1.0f, 1.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap;
        if (this.d && ((bitmap = this.m) == null || bitmap.isRecycled())) {
            this.o.c(aslh.LOG_TYPE_INTERNAL_ERROR, nsl.a, "ElementsDrawable.draw: bitmap is null or recycled. This error is part of b/307824081 and is not actionable for you. Contact @laijess for more details.", new Object[0]);
            return;
        }
        if (!canvas.isHardwareAccelerated() && this.m.getConfig() == Bitmap.Config.HARDWARE) {
            Bitmap bitmapCopy = this.m.copy(this.p ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565, false);
            if (bitmapCopy != null) {
                this.m = bitmapCopy;
            } else {
                ((agrc) ((agrc) a.c()).k("com/google/android/libraries/elements/base/ElementsDrawable", "maybeReplaceHardwareBitmap", 139, "ElementsDrawable.java")).t("draw: copy failed");
            }
        }
        BitmapShader bitmapShader = new BitmapShader(this.m, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        bitmapShader.setLocalMatrix(this.i);
        Paint paint = this.j;
        paint.setShader(bitmapShader);
        canvas.drawRect(this.k, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.j.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Paint paint = this.j;
        if (paint.getAlpha() == 255) {
            return -1;
        }
        return paint.getAlpha() == 0 ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        a();
        b(rect);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        if (!a()) {
            return false;
        }
        b(getBounds());
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.j.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        if (this.n != z) {
            this.n = z;
            if (a()) {
                b(getBounds());
                invalidateSelf();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public mfj(Bitmap bitmap, ImageView.ScaleType scaleType, nuc nucVar) {
        this(bitmap, scaleType, nucVar, agdf.a);
    }
}
