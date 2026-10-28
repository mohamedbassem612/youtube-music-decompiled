package defpackage;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.NodeViewInternalInterface;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ouw extends ouj {
    private float B;
    private RectF C;
    private RectF D;
    private RectF E;
    private Paint F;
    private Paint G;
    private boolean H;
    private boolean I;
    private RenderNode J;
    public float a;
    public float b;
    public float c;
    public int d;
    public NodeViewInternalInterface e;
    public PorterDuffColorFilter f;
    private final Paint g;
    private final Paint h;
    private final float[] i;
    private final Matrix j;
    private float k;
    private Bitmap l;
    private Canvas m;
    private Bitmap n;
    private Canvas o;
    private int p;

    public ouw() {
        super(false, false);
        this.i = new float[2];
        this.j = new Matrix();
        this.B = -1.0f;
        this.H = true;
        this.I = false;
        Paint paint = new Paint(3);
        this.g = paint;
        paint.setStyle(Paint.Style.FILL);
        this.h = new Paint(1);
    }

    public final void a() {
        if (this.H) {
            return;
        }
        this.H = true;
        s();
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0228  */
    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void b(Canvas canvas) {
        Matrix matrix;
        RecordingCanvas recordingCanvas;
        Matrix matrix2;
        Matrix matrix3;
        Matrix matrix4;
        if (this.I) {
            return;
        }
        float[] fArr = this.i;
        fArr[0] = this.b;
        fArr[1] = this.c;
        NodeViewInternalInterface nodeViewInternalInterface = this.e;
        if (nodeViewInternalInterface != null && (matrix4 = nodeViewInternalInterface.getMatrix()) != null && !matrix4.isIdentity()) {
            Matrix matrix5 = this.j;
            if (matrix4.invert(matrix5)) {
                matrix5.mapVectors(fArr);
            }
        }
        float f = fArr[0];
        float f2 = fArr[1];
        NodeViewInternalInterface nodeViewInternalInterface2 = this.e;
        if (this.a <= 0.0f) {
            if (Memory.peekByte(FlagServices.b().c + 28) != 0 && nodeViewInternalInterface2 != null) {
                canvas.save();
                canvas.translate(f, f2);
                if (this.F == null) {
                    this.F = new Paint();
                }
                PorterDuffColorFilter porterDuffColorFilter = this.f;
                if (porterDuffColorFilter == null) {
                    porterDuffColorFilter = new PorterDuffColorFilter(this.d, PorterDuff.Mode.SRC_IN);
                    this.f = porterDuffColorFilter;
                }
                this.F.setColorFilter(porterDuffColorFilter);
                canvas.saveLayer(null, this.F);
                this.I = true;
                nodeViewInternalInterface2.X(canvas);
                this.I = false;
                canvas.restore();
                canvas.restore();
                return;
            }
            if (this.G == null) {
                Paint paint = new Paint(1);
                this.G = paint;
                paint.setStyle(Paint.Style.FILL);
            }
            this.G.setColor(this.d);
            if (this.k <= 0.0f) {
                canvas.drawRect(this.s + f, this.t + f2, f + this.u, this.v + f2, this.G);
                return;
            }
            RectF rectF = this.C;
            if (rectF == null) {
                rectF = new RectF();
                this.C = rectF;
            }
            rectF.set(this.s + f, this.t + f2, this.u + f, this.v + f2);
            RectF rectF2 = this.C;
            float f3 = this.k;
            canvas.drawRoundRect(rectF2, f3, f3, this.G);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31 && canvas.isHardwareAccelerated()) {
            RenderNode renderNode = this.J;
            if (renderNode == null) {
                renderNode = new RenderNode("ShadowPaintUnit");
                renderNode.setClipToBounds(false);
                this.J = renderNode;
            }
            int i = this.u - this.s;
            int i2 = this.v - this.t;
            if (i <= 0 || i2 <= 0) {
                return;
            }
            if (this.H) {
                PorterDuffColorFilter porterDuffColorFilter2 = this.f;
                if (porterDuffColorFilter2 == null) {
                    porterDuffColorFilter2 = new PorterDuffColorFilter(this.d, PorterDuff.Mode.SRC_IN);
                    this.f = porterDuffColorFilter2;
                }
                float f4 = this.a;
                renderNode.setRenderEffect(RenderEffect.createBlurEffect(f4, f4, RenderEffect.createColorFilterEffect(porterDuffColorFilter2), Shader.TileMode.DECAL));
                NodeViewInternalInterface nodeViewInternalInterface3 = this.e;
                if (this.E == null) {
                    this.E = new RectF(0.0f, 0.0f, i, i2);
                }
                if (nodeViewInternalInterface3 != null && (matrix3 = nodeViewInternalInterface3.getMatrix()) != null) {
                    matrix3.mapRect(this.E);
                }
                int iFloor = (int) Math.floor(this.E.left);
                int iFloor2 = (int) Math.floor(this.E.top);
                int iCeil = (int) Math.ceil(this.E.right);
                int iCeil2 = (int) Math.ceil(this.E.bottom);
                renderNode.setPosition(iFloor, iFloor2, iCeil, iCeil2);
                RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording(iCeil - iFloor, iCeil2 - iFloor2);
                recordingCanvasBeginRecording.translate(-iFloor, -iFloor2);
                recordingCanvasBeginRecording.save();
                if (nodeViewInternalInterface3 != null && (matrix2 = nodeViewInternalInterface3.getMatrix()) != null) {
                    recordingCanvasBeginRecording.concat(matrix2);
                }
                if (Memory.peekByte(FlagServices.b().c + 28) == 0 || nodeViewInternalInterface3 == null) {
                    float f5 = i2;
                    float f6 = i;
                    if (this.G == null) {
                        Paint paint2 = new Paint(1);
                        this.G = paint2;
                        paint2.setStyle(Paint.Style.FILL);
                    }
                    this.G.setColor(-16777216);
                    float f7 = this.k;
                    Paint paint3 = this.G;
                    if (f7 > 0.0f) {
                        recordingCanvas = recordingCanvasBeginRecording;
                        recordingCanvas.drawRoundRect(0.0f, 0.0f, f6, f5, f7, f7, paint3);
                    } else {
                        recordingCanvas = recordingCanvasBeginRecording;
                        recordingCanvas.drawRect(0.0f, 0.0f, f6, f5, paint3);
                    }
                } else {
                    this.I = true;
                    nodeViewInternalInterface3.X(recordingCanvasBeginRecording);
                    this.I = false;
                    recordingCanvas = recordingCanvasBeginRecording;
                }
                recordingCanvas.restore();
                renderNode.endRecording();
                this.H = false;
            }
            canvas.save();
            NodeViewInternalInterface nodeViewInternalInterface4 = this.e;
            if (nodeViewInternalInterface4 == null || (matrix = nodeViewInternalInterface4.getMatrix()) == null || matrix.isIdentity()) {
                canvas.translate(fArr[0], fArr[1]);
            } else {
                Matrix matrix6 = this.j;
                if (matrix.invert(matrix6)) {
                    canvas.concat(matrix6);
                    canvas.translate(this.b, this.c);
                } else {
                    canvas.translate(fArr[0], fArr[1]);
                }
            }
            canvas.drawRenderNode(renderNode);
            canvas.restore();
            return;
        }
        if (this.H) {
            int i3 = this.u - this.s;
            int i4 = this.v - this.t;
            if (i3 <= 0 || i4 <= 0 || this.a <= 0.0f) {
                Bitmap bitmap = this.l;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.l = null;
                    this.m = null;
                }
            } else {
                int iMax = Math.max(1, Math.round(i3 * 0.5f));
                int iMax2 = Math.max(1, Math.round(i4 * 0.5f));
                float fMax = Math.max(0.1f, this.a * 0.5f * 0.9f);
                int iCeil3 = (int) Math.ceil(fMax + fMax + 2.0f);
                this.p = iCeil3;
                int i5 = iCeil3 << 1;
                int i6 = iMax + i5;
                int i7 = i5 + iMax2;
                Bitmap bitmap2 = this.l;
                if (bitmap2 != null && bitmap2.getWidth() == i6 && this.l.getHeight() == i7) {
                    this.l.eraseColor(0);
                } else {
                    Bitmap bitmap3 = this.l;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i6, i7, Bitmap.Config.ALPHA_8);
                    this.l = bitmapCreateBitmap;
                    Canvas canvas2 = this.m;
                    if (canvas2 == null) {
                        this.m = new Canvas(this.l);
                    } else {
                        canvas2.setBitmap(bitmapCreateBitmap);
                    }
                }
                if (fMax != this.B) {
                    this.h.setMaskFilter(new BlurMaskFilter(fMax, BlurMaskFilter.Blur.NORMAL));
                    this.B = fMax;
                }
                NodeViewInternalInterface nodeViewInternalInterface5 = this.e;
                if (Memory.peekByte(FlagServices.b().c + 28) == 0 || nodeViewInternalInterface5 == null) {
                    Paint paint4 = this.h;
                    paint4.setColor(-16777216);
                    paint4.setStyle(Paint.Style.FILL);
                    float f8 = this.k;
                    float f9 = f8 * 0.5f;
                    Canvas canvas3 = this.m;
                    if (canvas3 != null) {
                        if (f8 > 0.0f) {
                            RectF rectF3 = this.D;
                            if (rectF3 == null) {
                                rectF3 = new RectF();
                                this.D = rectF3;
                            }
                            int i8 = this.p;
                            float f10 = i8;
                            rectF3.set(f10, f10, iMax + i8, i8 + iMax2);
                            canvas3.drawRoundRect(this.D, f9, f9, paint4);
                        } else {
                            int i9 = this.p;
                            float f11 = i9;
                            canvas3.drawRect(f11, f11, iMax + i9, i9 + iMax2, paint4);
                        }
                    }
                } else {
                    Bitmap bitmapCreateBitmap2 = this.n;
                    if (bitmapCreateBitmap2 != null && bitmapCreateBitmap2.getWidth() == iMax && bitmapCreateBitmap2.getHeight() == iMax2) {
                        bitmapCreateBitmap2.eraseColor(0);
                    } else {
                        if (bitmapCreateBitmap2 != null) {
                            bitmapCreateBitmap2.recycle();
                        }
                        bitmapCreateBitmap2 = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ALPHA_8);
                        this.n = bitmapCreateBitmap2;
                        Canvas canvas4 = this.o;
                        if (canvas4 == null) {
                            this.o = new Canvas(bitmapCreateBitmap2);
                        } else {
                            canvas4.setBitmap(bitmapCreateBitmap2);
                        }
                    }
                    Canvas canvas5 = this.o;
                    if (canvas5 != null) {
                        canvas5.save();
                        canvas5.scale(0.5f, 0.5f);
                        this.I = true;
                        try {
                            nodeViewInternalInterface5.X(canvas5);
                            this.I = false;
                            canvas5.restore();
                        } catch (Throwable th) {
                            this.I = false;
                            throw th;
                        }
                    }
                    Canvas canvas6 = this.m;
                    if (canvas6 != null && bitmapCreateBitmap2 != null) {
                        float f12 = this.p;
                        canvas6.drawBitmap(bitmapCreateBitmap2, f12, f12, this.h);
                    }
                }
                this.H = false;
            }
        }
        Bitmap bitmap4 = this.l;
        if (bitmap4 != null) {
            int iAlpha = Color.alpha(this.d);
            Paint paint5 = this.g;
            paint5.setColor((this.d & 16777215) | (iAlpha << 24));
            paint5.setMaskFilter(null);
            float f13 = this.p / 0.5f;
            float f14 = this.s + f;
            float f15 = this.t + f2;
            float width = bitmap4.getWidth() / 0.5f;
            float height = bitmap4.getHeight() / 0.5f;
            RectF rectF4 = this.C;
            if (rectF4 == null) {
                rectF4 = new RectF();
                this.C = rectF4;
            }
            float f16 = f15 - f13;
            float f17 = f14 - f13;
            rectF4.set(f17, f16, width + f17, height + f16);
            canvas.drawBitmap(bitmap4, (Rect) null, this.C, paint5);
        }
    }

    @Override // defpackage.ouj
    protected final void c() {
        RectF rectF = this.E;
        if (rectF != null) {
            rectF.set(0.0f, 0.0f, this.u - this.s, this.v - this.t);
        }
        this.H = true;
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RenderNode renderNode;
        Bitmap bitmap = this.l;
        if (bitmap != null) {
            bitmap.recycle();
            this.l = null;
        }
        this.m = null;
        Bitmap bitmap2 = this.n;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.n = null;
        }
        this.o = null;
        if (Build.VERSION.SDK_INT < 31 || (renderNode = this.J) == null) {
            return;
        }
        renderNode.discardDisplayList();
        this.J = null;
    }

    public final void d(float f) {
        if (this.k != f) {
            this.k = f;
            a();
        }
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void f(PaintUnitOwner paintUnitOwner) {
        super.f(paintUnitOwner);
        if (paintUnitOwner != null) {
            paintUnitOwner.k(this);
        }
    }

    @Override // defpackage.ouj, com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final boolean i() {
        return true;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void g(int i, int i2, int i3, int i4) {
    }
}
