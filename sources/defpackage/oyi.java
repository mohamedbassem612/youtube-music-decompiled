package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.NodeViewInternalInterface;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oyi {
    private ouw c;
    private Path f;
    private Paint g;
    private RectF h;
    private Bitmap j;
    private Canvas k;
    private Paint l;
    private boolean d = false;
    private float e = 0.0f;
    public float a = 0.0f;
    private boolean i = false;
    public float b = 1.0f;
    private boolean m = true;
    private boolean n = false;

    private static boolean k(boolean z) {
        if (z) {
            return false;
        }
        return a.aO();
    }

    public final void a(View view) {
        float f = this.a;
        boolean z = this.n;
        this.a = 0.0f;
        this.i = false;
        this.e = 0.0f;
        this.d = false;
        this.n = false;
        if (z && Build.VERSION.SDK_INT >= 31) {
            view.setRenderEffect(null);
        }
        if (f > 0.01f) {
            view.setAlpha(this.b);
        }
        ouw ouwVar = this.c;
        if (ouwVar != null) {
            ouwVar.close();
            this.c = null;
        }
        Bitmap bitmap = this.j;
        if (bitmap != null) {
            bitmap.recycle();
            this.j = null;
            this.k = null;
        }
    }

    public final void b(Canvas canvas, View view, float f, oyh oyhVar) {
        int iCeil;
        if (this.a <= 0.01f || (k(this.i) && canvas.isHardwareAccelerated())) {
            ouw ouwVar = this.c;
            if (ouwVar != null) {
                ouwVar.t(0, 0, view.getWidth(), view.getHeight());
                this.c.b(canvas);
            }
            if (!this.d || this.c == null) {
                oyhVar.a(canvas);
                return;
            }
            Paint paint = this.g;
            if (paint == null) {
                paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                this.g = paint;
            }
            Path path = this.f;
            if (path == null) {
                path = new Path();
                this.f = path;
            }
            RectF rectF = this.h;
            if (rectF == null) {
                rectF = new RectF();
                this.h = rectF;
            }
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            int iSaveLayer = canvas.saveLayer(rectF, null);
            oyhVar.a(canvas);
            path.reset();
            path.setFillType(Path.FillType.INVERSE_WINDING);
            if (f > 0.0f) {
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
            } else {
                path.addRect(rectF, Path.Direction.CW);
            }
            canvas.drawPath(path, paint);
            canvas.restoreToCount(iSaveLayer);
            return;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        if (this.d) {
            iCeil = 0;
        } else {
            float f2 = this.a;
            iCeil = (int) Math.ceil(f2 + f2);
        }
        int i = iCeil << 1;
        int iMax = Math.max(1, Math.round((width + i) * 0.5f));
        int iMax2 = Math.max(1, Math.round((height + i) * 0.5f));
        Bitmap bitmapCreateBitmap = this.j;
        if (this.m || bitmapCreateBitmap == null || bitmapCreateBitmap.getWidth() != iMax || bitmapCreateBitmap.getHeight() != iMax2) {
            int width2 = view.getWidth();
            int height2 = view.getHeight();
            if (width2 <= 0 || height2 <= 0) {
                bitmapCreateBitmap = null;
            } else {
                int iMax3 = Math.max(1, Math.round((width2 + i) * 0.5f));
                int iMax4 = Math.max(1, Math.round((i + height2) * 0.5f));
                bitmapCreateBitmap = this.j;
                if (bitmapCreateBitmap == null || bitmapCreateBitmap.getWidth() != iMax3 || bitmapCreateBitmap.getHeight() != iMax4) {
                    if (bitmapCreateBitmap != null) {
                        bitmapCreateBitmap.recycle();
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(iMax3, iMax4, Bitmap.Config.ARGB_8888);
                    this.j = bitmapCreateBitmap;
                    this.k = new Canvas(bitmapCreateBitmap);
                }
                Canvas canvas2 = this.k;
                if (canvas2 != null) {
                    bitmapCreateBitmap.eraseColor(0);
                    canvas2.save();
                    canvas2.scale(0.5f, 0.5f);
                    float f3 = iCeil;
                    canvas2.translate(f3, f3);
                    if (f > 0.0f) {
                        Path path2 = this.f;
                        if (path2 == null) {
                            path2 = new Path();
                            this.f = path2;
                        }
                        path2.reset();
                        path2.addRoundRect(new RectF(0.0f, 0.0f, width2, height2), f, f, Path.Direction.CW);
                        canvas2.clipPath(path2);
                    }
                    oyhVar.a(canvas2);
                    canvas2.restore();
                }
            }
            if (bitmapCreateBitmap != null) {
                nvb.a(bitmapCreateBitmap, Math.max(1, Math.round(this.a * 0.5f)));
            }
            this.m = false;
        }
        if (bitmapCreateBitmap != null) {
            Paint paint2 = this.l;
            if (paint2 == null) {
                paint2 = new Paint(3);
                this.l = paint2;
            }
            paint2.setAlpha(this.n ? 255 : Math.round(this.b * 255.0f));
            int i2 = -iCeil;
            Rect rect = new Rect(i2, i2, width + iCeil, iCeil + height);
            if (!this.d || f <= 0.0f) {
                canvas.drawBitmap(bitmapCreateBitmap, (Rect) null, rect, paint2);
                return;
            }
            canvas.save();
            Path path3 = this.f;
            if (path3 == null) {
                path3 = new Path();
                this.f = path3;
            }
            path3.reset();
            path3.addRoundRect(new RectF(0.0f, 0.0f, width, height), f, f, Path.Direction.CW);
            canvas.clipPath(path3);
            canvas.drawBitmap(bitmapCreateBitmap, (Rect) null, rect, paint2);
            canvas.restore();
        }
    }

    public final void c(View view, boolean z) {
        this.d = z;
        i(view);
    }

    public final void d() {
        this.m = true;
        ouw ouwVar = this.c;
        if (ouwVar != null) {
            ouwVar.a();
        }
    }

    public final void e(View view) {
        if (this.d && this.c == null && Memory.peekByte(FlagServices.b().c + 93) != 0) {
            i(view);
        }
    }

    public final void f(View view, float f, boolean z) {
        float f2 = this.a;
        if (f2 == f && this.i == z) {
            return;
        }
        this.a = f;
        this.i = z;
        this.m = true;
        if (f > 0.01f) {
            float alpha = f2 <= 0.01f ? view.getAlpha() : this.b;
            if (k(z)) {
                view.setRenderEffect(RenderEffect.createBlurEffect(f, f, Shader.TileMode.DECAL));
                this.n = true;
                view.setAlpha(alpha);
            } else {
                if (this.n && a.aO()) {
                    view.setRenderEffect(null);
                    this.n = false;
                }
                view.setAlpha(1.0f);
            }
            this.b = alpha;
        } else if (f2 > 0.01f) {
            if (this.n && a.aO()) {
                view.setRenderEffect(null);
                this.n = false;
            }
            view.setAlpha(this.b);
        }
        view.invalidate();
    }

    public final void g(View view, float f) {
        boolean z = this.e > 0.0f;
        this.e = f;
        ouw ouwVar = this.c;
        if (ouwVar != null) {
            ouwVar.d(f);
        }
        if (this.d && this.c == null) {
            if (z == (f > 0.0f) || Memory.peekByte(FlagServices.b().c + 93) == 0) {
                return;
            }
            i(view);
        }
    }

    public final void h(View view, NodeViewInternalInterface nodeViewInternalInterface, float f, int i, float f2, float f3, float f4) {
        this.e = f4;
        ouw ouwVar = this.c;
        if (ouwVar == null) {
            ouwVar = new ouw();
            ouwVar.e = nodeViewInternalInterface;
            ouwVar.a();
            this.c = ouwVar;
            i(view);
        }
        if (f < 0.0f) {
            throw new IllegalArgumentException("Shadow size must be non-negative, but was " + f);
        }
        if (ouwVar.a != f) {
            ouwVar.a = f;
            ouwVar.a();
        }
        if (ouwVar.d != i) {
            ouwVar.d = i;
            ouwVar.f = null;
            ouwVar.a();
        }
        if (f2 != ouwVar.b) {
            ouwVar.b = f2;
            ouwVar.a();
        }
        if (f3 != ouwVar.c) {
            ouwVar.c = f3;
            ouwVar.a();
        }
        ouwVar.d(f4);
    }

    public final void i(View view) {
        if (this.d && this.c == null) {
            view.setLayerType((this.e > 0.0f || view.getRotation() % 90.0f != 0.0f || Memory.peekByte(FlagServices.b().c + 93) == 0) ? 2 : 0, null);
            view.setClipToOutline(true);
        } else {
            view.setLayerType(0, null);
            view.setClipToOutline(false);
        }
    }

    public final boolean j() {
        return this.a > 0.01f && !this.n;
    }
}
