package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class oti extends otm {
    public Paint a;
    public Paint b;
    public int c;
    public int d;
    public int e;
    public int f;
    public RenderNode g;
    public float h;
    public short i;
    public float[] j;
    public Path k;
    public otn l;
    public int m;
    private Rect v;

    public oti(Bitmap bitmap, ImageView.ScaleType scaleType, oui ouiVar) {
        super(bitmap, scaleType, ouiVar);
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = 0;
        this.e = 255;
        this.f = 0;
        this.m = 1;
        this.h = 0.0f;
    }

    private final void e(Canvas canvas, Paint paint) {
        int i = this.m;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            canvas.drawRect(this.p, paint);
            return;
        }
        if (i2 == 1) {
            RectF rectF = this.p;
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() * 0.5f, rectF.height() * 0.5f), paint);
        } else if (i2 != 2) {
            if (i2 == 3) {
                canvas.drawPath(this.k, paint);
            }
        } else {
            RectF rectF2 = this.p;
            float f = this.h;
            canvas.drawRoundRect(rectF2, f, f, paint);
        }
    }

    public final void a() {
        if (this.m == 4) {
            this.k.reset();
            this.k.addRoundRect(this.p, this.j, Path.Direction.CW);
        } else if (this.g != null && Build.VERSION.SDK_INT >= 31) {
            this.k.reset();
            int i = this.m;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                this.k.addRect(this.p, Path.Direction.CW);
            } else if (i2 == 1) {
                RectF rectF = this.p;
                this.k.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() * 0.5f, rectF.height() * 0.5f), Path.Direction.CW);
            } else if (i2 == 2) {
                Path path = this.k;
                RectF rectF2 = this.p;
                float f = this.h;
                path.addRoundRect(rectF2, f, f, Path.Direction.CW);
            }
        }
        otn otnVar = this.l;
        if (otnVar != null) {
            otnVar.a(this.p, getLayoutDirection() == 1, this.t);
        }
    }

    public final void b() {
        float[] fArr;
        int layoutDirection = getLayoutDirection();
        short s = this.i;
        int i = s & 1;
        boolean z = layoutDirection == 1;
        if (i == 1 || (z ? (s & 32) == 32 : (s & 16) == 16)) {
            fArr = this.j;
            float f = this.h;
            fArr[0] = f;
            fArr[1] = f;
        } else {
            fArr = this.j;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
        }
        if ((s & 2) == 2 || (z ? (s & 16) == 16 : (s & 32) == 32)) {
            float f2 = this.h;
            fArr[2] = f2;
            fArr[3] = f2;
        } else {
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
        }
        if ((s & 8) == 8 || (z ? (s & 64) == 64 : (s & 128) == 128)) {
            float f3 = this.h;
            fArr[4] = f3;
            fArr[5] = f3;
        } else {
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
        }
        if ((s & 4) == 4 || (z ? (s & 128) == 128 : (s & 64) == 64)) {
            float f4 = this.h;
            fArr[6] = f4;
            fArr[7] = f4;
        } else {
            fArr[6] = 0.0f;
            fArr[7] = 0.0f;
        }
        a();
    }

    @Override // defpackage.otm, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        BitmapShader bitmapShaderC = c(canvas);
        bitmapShaderC.setLocalMatrix(this.n);
        Paint paint = this.o;
        paint.setShader(bitmapShaderC);
        Paint paint2 = this.a;
        if (paint2 != null && (paint2.getColor() & (-16777216)) != 0) {
            e(canvas, this.a);
        }
        if (this.g == null || Build.VERSION.SDK_INT < 31 || !canvas.isHardwareAccelerated()) {
            e(canvas, paint);
        } else {
            RenderNode renderNode = this.g;
            RectF rectF = this.p;
            renderNode.setPosition((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.g.beginRecording().drawRect(rectF, paint);
            this.g.endRecording();
            canvas.save();
            canvas.clipPath(this.k);
            canvas.drawRenderNode(this.g);
            canvas.restore();
        }
        otn otnVar = this.l;
        if (otnVar != null) {
            paint.setShader(otnVar.a);
            e(canvas, paint);
        }
        Paint paint3 = this.b;
        if (paint3 == null || (paint3.getColor() & (-16777216)) == 0) {
            return;
        }
        e(canvas, this.b);
    }

    @Override // defpackage.otm, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        if (this.f > 0) {
            Rect rect2 = this.v;
            if (rect2 == null) {
                this.v = new Rect(rect);
            } else {
                rect2.set(rect);
            }
            Rect rect3 = this.v;
            int i = this.f;
            rect3.inset(i, i);
            super.onBoundsChange(this.v);
        } else {
            super.onBoundsChange(rect);
        }
        a();
    }

    @Override // defpackage.otm, android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        if (this.m != 4) {
            return super.onLayoutDirectionChanged(i);
        }
        super.onLayoutDirectionChanged(i);
        b();
        return true;
    }

    @Override // defpackage.otm, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.e = i;
        if (this.b != null) {
            this.b.setAlpha((Color.alpha(this.d) * i) / 255);
        }
        if (this.a != null) {
            this.a.setAlpha((Color.alpha(this.c) * i) / 255);
        }
    }
}
