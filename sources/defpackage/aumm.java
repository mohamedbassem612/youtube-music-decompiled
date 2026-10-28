package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aumm extends Drawable {
    public final Paint a;
    public float b;
    public boolean c;
    public float d;
    public ColorStateList e;
    public ImageView.ScaleType f;
    private final RectF g = new RectF();
    private final RectF h = new RectF();
    private final RectF i;
    private final BitmapShader j;
    private final Paint k;
    private final int l;
    private final int m;
    private final RectF n;
    private final Matrix o;

    public aumm(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.i = rectF;
        this.n = new RectF();
        Matrix matrix = new Matrix();
        this.o = matrix;
        this.b = 0.0f;
        this.c = false;
        this.d = 0.0f;
        this.e = ColorStateList.valueOf(0);
        this.f = ImageView.ScaleType.FIT_CENTER;
        int width = bitmap.getWidth();
        this.l = width;
        int height = bitmap.getHeight();
        this.m = height;
        rectF.set(0.0f, 0.0f, width, height);
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        this.j = bitmapShader;
        bitmapShader.setLocalMatrix(matrix);
        Paint paint = new Paint();
        this.k = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        Paint paint2 = new Paint();
        this.a = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.e.getColorForState(getState(), 0));
        paint2.setStrokeWidth(this.d);
    }

    public static Drawable a(Drawable drawable) {
        Bitmap bitmapCreateBitmap;
        if (drawable == null || (drawable instanceof aumm)) {
            return drawable;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                layerDrawable.setDrawable(i, a(layerDrawable.getDrawable(i)));
            }
            return layerDrawable;
        }
        if (drawable instanceof BitmapDrawable) {
            bitmapCreateBitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 1), Math.max(drawable.getIntrinsicHeight(), 1), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
            } catch (Exception e) {
                e.printStackTrace();
                bitmapCreateBitmap = null;
            }
        }
        if (bitmapCreateBitmap != null) {
            return new aumm(bitmapCreateBitmap);
        }
        Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
        return drawable;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b9  */
    public final void b() {
        float fWidth;
        float fHeight;
        float fMin;
        int i = auml.a[this.f.ordinal()];
        if (i == 1) {
            RectF rectF = this.n;
            rectF.set(this.g);
            float f = this.d / 2.0f;
            rectF.inset(f, f);
            Matrix matrix = this.o;
            matrix.reset();
            matrix.setTranslate((int) (((rectF.width() - this.l) * 0.5f) + 0.5f), (int) (((rectF.height() - this.m) * 0.5f) + 0.5f));
        } else if (i == 2) {
            RectF rectF2 = this.n;
            rectF2.set(this.g);
            float f2 = this.d / 2.0f;
            rectF2.inset(f2, f2);
            Matrix matrix2 = this.o;
            matrix2.reset();
            float f3 = this.l;
            float fHeight2 = rectF2.height() * f3;
            float f4 = this.m;
            float fWidth2 = 0.0f;
            if (fHeight2 > rectF2.width() * f4) {
                fWidth = rectF2.height() / f4;
                fWidth2 = (rectF2.width() - (f3 * fWidth)) * 0.5f;
                fHeight = 0.0f;
            } else {
                fWidth = rectF2.width() / f3;
                fHeight = (rectF2.height() - (f4 * fWidth)) * 0.5f;
            }
            matrix2.setScale(fWidth, fWidth);
            float f5 = this.d;
            matrix2.postTranslate(((int) (fWidth2 + 0.5f)) + f5, ((int) (fHeight + 0.5f)) + f5);
        } else if (i == 3) {
            Matrix matrix3 = this.o;
            matrix3.reset();
            int i2 = this.l;
            RectF rectF3 = this.g;
            float f6 = i2;
            if (f6 <= rectF3.width()) {
                if (this.m <= rectF3.height()) {
                    fMin = 1.0f;
                } else {
                    fMin = Math.min(rectF3.width() / f6, rectF3.height() / this.m);
                }
            } else {
                fMin = Math.min(rectF3.width() / f6, rectF3.height() / this.m);
            }
            float fWidth3 = ((rectF3.width() - (f6 * fMin)) * 0.5f) + 0.5f;
            float fHeight3 = ((rectF3.height() - (this.m * fMin)) * 0.5f) + 0.5f;
            matrix3.setScale(fMin, fMin);
            matrix3.postTranslate((int) fWidth3, (int) fHeight3);
            RectF rectF4 = this.n;
            RectF rectF5 = this.i;
            rectF4.set(rectF5);
            matrix3.mapRect(rectF4);
            float f7 = this.d / 2.0f;
            rectF4.inset(f7, f7);
            matrix3.setRectToRect(rectF5, rectF4, Matrix.ScaleToFit.FILL);
        } else if (i == 5) {
            RectF rectF6 = this.n;
            RectF rectF7 = this.i;
            rectF6.set(rectF7);
            Matrix matrix4 = this.o;
            matrix4.setRectToRect(rectF7, this.g, Matrix.ScaleToFit.END);
            matrix4.mapRect(rectF6);
            float f8 = this.d / 2.0f;
            rectF6.inset(f8, f8);
            matrix4.setRectToRect(rectF7, rectF6, Matrix.ScaleToFit.FILL);
        } else if (i != 6) {
            RectF rectF8 = this.n;
            if (i != 7) {
                RectF rectF9 = this.i;
                rectF8.set(rectF9);
                Matrix matrix5 = this.o;
                matrix5.setRectToRect(rectF9, this.g, Matrix.ScaleToFit.CENTER);
                matrix5.mapRect(rectF8);
                float f9 = this.d / 2.0f;
                rectF8.inset(f9, f9);
                matrix5.setRectToRect(rectF9, rectF8, Matrix.ScaleToFit.FILL);
            } else {
                rectF8.set(this.g);
                float f10 = this.d / 2.0f;
                rectF8.inset(f10, f10);
                Matrix matrix6 = this.o;
                matrix6.reset();
                matrix6.setRectToRect(this.i, rectF8, Matrix.ScaleToFit.FILL);
            }
        } else {
            RectF rectF10 = this.n;
            RectF rectF11 = this.i;
            rectF10.set(rectF11);
            Matrix matrix7 = this.o;
            matrix7.setRectToRect(rectF11, this.g, Matrix.ScaleToFit.START);
            matrix7.mapRect(rectF10);
            float f11 = this.d / 2.0f;
            rectF10.inset(f11, f11);
            matrix7.setRectToRect(rectF11, rectF10, Matrix.ScaleToFit.FILL);
        }
        this.h.set(this.n);
        BitmapShader bitmapShader = this.j;
        bitmapShader.setLocalMatrix(this.o);
        this.k.setShader(bitmapShader);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z = this.c;
        float f = this.d;
        if (z) {
            RectF rectF = this.h;
            if (f <= 0.0f) {
                canvas.drawOval(rectF, this.k);
                return;
            } else {
                canvas.drawOval(rectF, this.k);
                canvas.drawOval(this.n, this.a);
                return;
            }
        }
        RectF rectF2 = this.h;
        if (f <= 0.0f) {
            float f2 = this.b;
            canvas.drawRoundRect(rectF2, f2, f2, this.k);
        } else {
            canvas.drawRoundRect(rectF2, Math.max(this.b, 0.0f), Math.max(this.b, 0.0f), this.k);
            RectF rectF3 = this.n;
            float f3 = this.b;
            canvas.drawRoundRect(rectF3, f3, f3, this.a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.e.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.g.set(rect);
        b();
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        int colorForState = this.e.getColorForState(iArr, 0);
        Paint paint = this.a;
        if (paint.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.k.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.k.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.k.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.k.setFilterBitmap(z);
        invalidateSelf();
    }
}
