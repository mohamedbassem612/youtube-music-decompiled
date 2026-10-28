package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitLayer;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner;
import com.google.android.libraries.multiplatform.elements.paintunit.ShaderUniformReader;
import j$.util.Objects;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ous implements PaintUnitLayer {
    private static Paint g;
    private Outline A;
    public ouv b;
    public ArrayList c;
    public oux d;
    private PaintUnitOwner j;
    private int k;
    private int l;
    private int m;
    private int n;
    private float o;
    private boolean p;
    private oun q;
    private oul r;
    private oum s;
    private boolean t;
    private RenderNode u;
    private ouy w;
    private boolean x;
    private boolean y;
    private Path z;
    private static final ThreadLocal e = new ouo();
    private static final ThreadLocal f = new oup();
    private static final ThreadLocal h = new ouq();
    private static final ThreadLocal i = new our();
    public int a = -1;
    private boolean v = false;

    private final void F(Canvas canvas, boolean z) {
        int iCeil;
        int iRound;
        RenderNode renderNode;
        oux ouxVar = this.d;
        if (ouxVar != null) {
            int i2 = this.m - this.k;
            int i3 = this.n - this.l;
            if (i2 <= 0 || i3 <= 0) {
                return;
            }
            if (!ic()) {
                ouxVar.h = false;
                return;
            }
            if (this.x) {
                iCeil = 0;
            } else {
                float f2 = ouxVar.c;
                iCeil = (int) Math.ceil(f2 + f2);
            }
            int i4 = iCeil << 1;
            int iMax = Math.max(1, Math.round((i2 + i4) * 0.5f));
            int iMax2 = Math.max(1, Math.round((i3 + i4) * 0.5f));
            int iMax3 = Math.max(1, Math.round(ouxVar.c * 0.5f));
            Bitmap bitmapCreateBitmap = ouxVar.d;
            Canvas canvas2 = ouxVar.e;
            if (bitmapCreateBitmap == null || canvas2 == null || bitmapCreateBitmap.getWidth() != iMax || bitmapCreateBitmap.getHeight() != iMax2) {
                if (bitmapCreateBitmap != null) {
                    bitmapCreateBitmap.recycle();
                }
                bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
                canvas2 = new Canvas(bitmapCreateBitmap);
                ouxVar.d = bitmapCreateBitmap;
                ouxVar.e = canvas2;
                ouxVar.h = true;
            }
            if (ouxVar.h) {
                bitmapCreateBitmap.eraseColor(0);
                int iSave = canvas2.save();
                canvas2.scale(0.5f, 0.5f);
                canvas2.translate(iCeil - this.k, iCeil - this.l);
                h(canvas2);
                D(canvas2);
                n(canvas2);
                canvas2.restoreToCount(iSave);
                nvb.a(bitmapCreateBitmap, iMax3);
                ouxVar.h = false;
            }
            Paint paint = ouxVar.f;
            if (paint == null) {
                paint = new Paint(3);
                ouxVar.f = paint;
            }
            if (z) {
                float alpha = 1.0f;
                if (Build.VERSION.SDK_INT >= 29 && (renderNode = this.u) != null) {
                    alpha = renderNode.getAlpha();
                }
                iRound = Math.round(alpha * 255.0f);
            } else {
                iRound = 255;
            }
            paint.setAlpha(iRound);
            Rect rect = ouxVar.g;
            rect.set(this.k - iCeil, this.l - iCeil, this.m + iCeil, this.n + iCeil);
            if (z && this.x && this.z != null) {
                canvas.save();
                canvas.clipPath(this.z);
            }
            canvas.drawBitmap(bitmapCreateBitmap, (Rect) null, rect, paint);
            if (z && this.x && this.z != null) {
                canvas.restore();
            }
        }
    }

    private final void I() {
        oux ouxVar = this.d;
        if (ouxVar != null) {
            Bitmap bitmap = ouxVar.d;
            if (bitmap != null) {
                bitmap.recycle();
                ouxVar.d = null;
            }
            ouxVar.e = null;
            ouxVar.h = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:43:0x0103  */
    /* JADX WARN: Code duplicated, block: B:46:0x010e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0137  */
    /* JADX WARN: Code duplicated, block: B:49:0x013c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0141 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0143  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    private final void J() {
        boolean z;
        float f2;
        float f3;
        Outline outline;
        oun ounVar;
        Path path;
        int i2;
        Outline outline2;
        oux ouxVar;
        Path path2;
        int i3;
        Outline outline3;
        if (this.x) {
            Path path3 = this.z;
            if (path3 == null) {
                this.z = new Path();
            } else {
                path3.reset();
            }
            oun ounVar2 = this.q;
            boolean z2 = (ounVar2 != null && ounVar2.e()) || this.o > 0.0f;
            boolean z3 = ounVar2 != null && ounVar2.f();
            if (!z3) {
                if (!z2) {
                    this.z.addRect(this.k, this.l, this.m, this.n, Path.Direction.CW);
                } else if (ounVar2 == null || !ounVar2.e()) {
                    boolean z4 = this.p;
                    float f4 = this.o;
                    if (z4) {
                        f2 = (this.m - this.k) * f4;
                        f3 = f4 * (this.n - this.l);
                    } else {
                        f2 = f4;
                        f3 = f2;
                    }
                    this.z.addRoundRect(this.k, this.l, this.m, this.n, f2, f3, Path.Direction.CW);
                } else {
                    float[] fArr = (float[]) f.get();
                    this.q.d(this.m - this.k, this.n - this.l, fArr);
                    Path path4 = this.z;
                    if (fArr != null) {
                        path4.addRoundRect(this.k, this.l, this.m, this.n, fArr, Path.Direction.CW);
                    } else {
                        path4.addRect(this.k, this.l, this.m, this.n, Path.Direction.CW);
                    }
                }
                z = false;
                this.y = z;
                if (Build.VERSION.SDK_INT >= 29) {
                    outline = this.A;
                    if (outline == null) {
                        outline = new Outline();
                        this.A = outline;
                    }
                    if (z3) {
                        path2 = (Path) e.get();
                        path2.reset();
                        this.q.c(new RectF(0.0f, 0.0f, this.m - this.k, this.n - this.l), path2, Path.Direction.CW);
                        i3 = Build.VERSION.SDK_INT;
                        outline3 = this.A;
                        if (i3 >= 30) {
                            outline3.setPath(path2);
                        } else {
                            outline3.setConvexPath(path2);
                        }
                    } else if (z2) {
                        ounVar = this.q;
                        if (ounVar == null && ounVar.e()) {
                            float[] fArr2 = (float[]) f.get();
                            this.q.d(this.m - this.k, this.n - this.l, fArr2);
                            if (fArr2 != null) {
                                Path path5 = new Path();
                                path5.addRoundRect(0.0f, 0.0f, this.m - this.k, this.n - this.l, fArr2, Path.Direction.CW);
                                int i4 = Build.VERSION.SDK_INT;
                                Outline outline4 = this.A;
                                if (i4 >= 30) {
                                    outline4.setPath(path5);
                                } else {
                                    outline4.setConvexPath(path5);
                                }
                            } else {
                                this.A.setRect(0, 0, this.m - this.k, this.n - this.l);
                            }
                        } else if (this.p) {
                            float f5 = this.o;
                            float f6 = f5 * (this.m - this.k);
                            float f7 = f5 * (this.n - this.l);
                            path = new Path();
                            path.addRoundRect(0.0f, 0.0f, this.m - this.k, this.n - this.l, f6, f7, Path.Direction.CW);
                            i2 = Build.VERSION.SDK_INT;
                            outline2 = this.A;
                            if (i2 >= 30) {
                                outline2.setPath(path);
                            } else {
                                outline2.setConvexPath(path);
                            }
                        } else {
                            this.A.setRoundRect(0, 0, this.m - this.k, this.n - this.l, this.o);
                        }
                    } else {
                        outline.setRect(0, 0, this.m - this.k, this.n - this.l);
                    }
                    RenderNode renderNodeC = c();
                    renderNodeC.setOutline(this.A);
                    renderNodeC.setUseCompositingLayer(L(), null);
                    renderNodeC.setClipToOutline(true);
                    ouxVar = this.d;
                    if (ouxVar != null || !ouxVar.a || ouxVar.b || Build.VERSION.SDK_INT < 31) {
                        return;
                    }
                    float f8 = ouxVar.c;
                    renderNodeC.setRenderEffect(RenderEffect.createBlurEffect(f8, f8, Shader.TileMode.DECAL));
                    return;
                }
            }
            Path path6 = (Path) e.get();
            path6.reset();
            this.q.c(new RectF(this.k, this.l, this.m, this.n), path6, Path.Direction.CW);
            this.z.set(path6);
            z = true;
            this.y = z;
            if (Build.VERSION.SDK_INT >= 29) {
                outline = this.A;
                if (outline == null) {
                    outline = new Outline();
                    this.A = outline;
                }
                if (z3) {
                    path2 = (Path) e.get();
                    path2.reset();
                    this.q.c(new RectF(0.0f, 0.0f, this.m - this.k, this.n - this.l), path2, Path.Direction.CW);
                    i3 = Build.VERSION.SDK_INT;
                    outline3 = this.A;
                    if (i3 >= 30) {
                        outline3.setPath(path2);
                    } else {
                        outline3.setConvexPath(path2);
                    }
                } else if (z2) {
                    ounVar = this.q;
                    if (ounVar == null) {
                        if (this.p) {
                            float f9 = this.o;
                            float f10 = f9 * (this.m - this.k);
                            float f11 = f9 * (this.n - this.l);
                            path = new Path();
                            path.addRoundRect(0.0f, 0.0f, this.m - this.k, this.n - this.l, f10, f11, Path.Direction.CW);
                            i2 = Build.VERSION.SDK_INT;
                            outline2 = this.A;
                            if (i2 >= 30) {
                                outline2.setPath(path);
                            } else {
                                outline2.setConvexPath(path);
                            }
                        } else {
                            this.A.setRoundRect(0, 0, this.m - this.k, this.n - this.l, this.o);
                        }
                    } else if (this.p) {
                        float f12 = this.o;
                        float f13 = f12 * (this.m - this.k);
                        float f14 = f12 * (this.n - this.l);
                        path = new Path();
                        path.addRoundRect(0.0f, 0.0f, this.m - this.k, this.n - this.l, f13, f14, Path.Direction.CW);
                        i2 = Build.VERSION.SDK_INT;
                        outline2 = this.A;
                        if (i2 >= 30) {
                            outline2.setPath(path);
                        } else {
                            outline2.setConvexPath(path);
                        }
                    } else {
                        this.A.setRoundRect(0, 0, this.m - this.k, this.n - this.l, this.o);
                    }
                } else {
                    outline.setRect(0, 0, this.m - this.k, this.n - this.l);
                }
                RenderNode renderNodeC2 = c();
                renderNodeC2.setOutline(this.A);
                renderNodeC2.setUseCompositingLayer(L(), null);
                renderNodeC2.setClipToOutline(true);
                ouxVar = this.d;
                if (ouxVar != null) {
                }
            }
        }
    }

    private final void K() {
        RenderNode renderNode;
        ouy ouyVar = this.w;
        if (ouyVar == null || (renderNode = ouyVar.a) == null) {
            return;
        }
        Matrix matrix = (Matrix) h.get();
        RectF rectF = (RectF) i.get();
        this.u.getMatrix(matrix);
        rectF.set(0.0f, 0.0f, this.m - this.k, this.n - this.l);
        matrix.mapRect(rectF);
        rectF.offset(this.k, this.l);
        renderNode.setPosition((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    private final boolean L() {
        RenderNode renderNode;
        return this.y || !((renderNode = this.u) == null || renderNode.getRotationZ() % 90.0f == 0.0f) || Memory.peekByte(FlagServices.b().c + 93) == 0;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c3  */
    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void B(mew mewVar) {
        float fIntBitsToFloat;
        boolean z;
        oun ounVarG;
        oul oulVar;
        oum oumVar;
        ouv ouvVar;
        ouv ouvVar2;
        boolean z2;
        long j;
        long j2;
        float fA;
        boolean zH;
        boolean z3;
        RenderNode renderNode;
        ArrayList arrayList;
        long j3;
        long j4 = mewVar.c;
        long j5 = 11;
        if ((Memory.peekByte(j4 + 11) & 32) == 0 || Memory.peekByte(20 + j4) != 0) {
            fIntBitsToFloat = Float.intBitsToFloat(Memory.peekInt(j4 + 44, false));
            z = Memory.peekByte(mewVar.c + 19) != 0;
            ounVarG = null;
        } else {
            ounVarG = oun.g(mewVar);
            fIntBitsToFloat = 0.0f;
            z = false;
        }
        if (this.o == fIntBitsToFloat && this.p == z) {
            oun ounVar = this.q;
            float[] fArr = oun.a;
            if (!Objects.equals(ounVar, ounVarG) && (ounVar == null || ounVarG == null || !ounVar.equals(ounVarG))) {
                this.o = fIntBitsToFloat;
                this.p = z;
                this.q = ounVarG;
                oulVar = this.r;
                if (oulVar != null) {
                    oulVar.h = fIntBitsToFloat;
                    oulVar.i = z;
                    oulVar.j = this.q;
                }
                oumVar = this.s;
                if (oumVar != null) {
                    oumVar.a = this.o;
                    oumVar.b = this.p;
                    oumVar.c = this.q;
                }
                ouvVar = this.b;
                if (ouvVar != null) {
                    ouvVar.c(this.o);
                    ouvVar2 = this.b;
                    z2 = this.p;
                    if (ouvVar2.b != z2) {
                        ouvVar2.b = z2;
                        ouvVar2.a();
                    }
                    ouv ouvVar3 = this.b;
                    ouvVar3.c = this.q;
                    ouvVar3.a();
                }
                J();
                this.v = true;
            }
        } else {
            this.o = fIntBitsToFloat;
            this.p = z;
            this.q = ounVarG;
            oulVar = this.r;
            if (oulVar != null) {
                oulVar.h = fIntBitsToFloat;
                oulVar.i = z;
                oulVar.j = this.q;
            }
            oumVar = this.s;
            if (oumVar != null) {
                oumVar.a = this.o;
                oumVar.b = this.p;
                oumVar.c = this.q;
            }
            ouvVar = this.b;
            if (ouvVar != null) {
                ouvVar.c(this.o);
                ouvVar2 = this.b;
                z2 = this.p;
                if (ouvVar2.b != z2) {
                    ouvVar2.b = z2;
                    ouvVar2.a();
                }
                ouv ouvVar4 = this.b;
                ouvVar4.c = this.q;
                ouvVar4.a();
            }
            J();
            this.v = true;
        }
        long j6 = 8;
        if ((Memory.peekByte(mewVar.c + 8) & 1) != 0) {
            oul oulVar2 = this.r;
            if (oulVar2 == null) {
                oul oulVar3 = new oul();
                this.r = oulVar3;
                oulVar3.l = this;
                oulVar3.t(this.k, this.l, this.m, this.n);
                oulVar2 = this.r;
                oulVar2.h = this.o;
                oulVar2.i = this.p;
                oulVar2.j = this.q;
            }
            oulVar2.g = Memory.peekInt(mewVar.c + 28, false);
        } else {
            this.r = null;
        }
        long j7 = mewVar.c + 8;
        if ((Memory.peekByte(j7) & 8) == 0 || (Memory.peekByte(j7) & 2) == 0) {
            this.s = null;
        } else {
            oum oumVar2 = this.s;
            if (oumVar2 == null) {
                oum oumVar3 = new oum();
                this.s = oumVar3;
                oumVar3.t(this.k, this.l, this.m, this.n);
                oumVar2 = this.s;
                oumVar2.a = this.o;
                oumVar2.b = this.p;
                oumVar2.c = this.q;
            }
            oumVar2.a(Float.intBitsToFloat(Memory.peekInt(mewVar.c + 40, false)));
            oumVar2.d = Memory.peekInt(mewVar.c + 32, false);
            this.s = oumVar2;
        }
        long j8 = mewVar.c;
        if ((Memory.peekByte(13 + j8) & 4) != 0) {
            long j9 = j8 + 152;
            if (Memory.peekInt(j9, false) > 0) {
                int iPeekInt = Memory.peekInt(j9, false);
                fA = 0.0f;
                int i2 = 0;
                zH = false;
                z3 = false;
                while (true) {
                    j = j5;
                    if (i2 >= iPeekInt) {
                        break;
                    }
                    ShaderUniformReader shaderUniformReader = new ShaderUniformReader(i2);
                    try {
                        if (shaderUniformReader.e()) {
                            j3 = j6;
                            if (shaderUniformReader.b() == 3) {
                                fA = shaderUniformReader.a(0);
                                z3 = false;
                            } else if (shaderUniformReader.b() == 4) {
                                fA = shaderUniformReader.a(0);
                                z3 = true;
                            }
                        } else {
                            j3 = j6;
                            if (shaderUniformReader.b() != 0) {
                                zH = true;
                            }
                        }
                        shaderUniformReader.d();
                        i2++;
                        j5 = j;
                        j6 = j3;
                    } catch (Throwable th) {
                        shaderUniformReader.d();
                        throw th;
                    }
                }
                j2 = j6;
                if (zH) {
                    ouv ouvVar5 = this.b;
                    if (ouvVar5 == null) {
                        ouvVar5 = new ouv();
                        ouvVar5.e(this.t);
                        ouvVar5.t(this.k, this.l, this.m, this.n);
                        ouvVar5.a = this;
                        this.b = ouvVar5;
                    }
                    zH = ouvVar5.h(mewVar);
                }
            } else {
                j = 11;
                j2 = 8;
                fA = 0.0f;
                zH = false;
                z3 = false;
            }
        } else {
            j = 11;
            j2 = 8;
            fA = 0.0f;
            zH = false;
            z3 = false;
        }
        if (!zH) {
            this.b = null;
        }
        oux ouxVar = this.d;
        if (fA > 0.01f) {
            if (ouxVar == null) {
                ouxVar = new oux();
                this.d = ouxVar;
            }
            if (!ouxVar.a || ouxVar.c != fA || ouxVar.b != z3) {
                if (ouxVar.b != z3) {
                    I();
                }
                ouxVar.c = fA;
                ouxVar.b = z3;
                ouxVar.a = true;
                ouxVar.h = true;
                if (Build.VERSION.SDK_INT >= 29) {
                    RenderNode renderNodeC = c();
                    if (!z3 && Build.VERSION.SDK_INT >= 31) {
                        renderNodeC.setRenderEffect(RenderEffect.createBlurEffect(fA, fA, Shader.TileMode.DECAL));
                    } else if (Build.VERSION.SDK_INT >= 31) {
                        renderNodeC.setRenderEffect(null);
                    }
                }
                this.v = true;
            }
        } else {
            if (ouxVar != null && ouxVar.a) {
                ouxVar.a = false;
                ouxVar.b = false;
                ouxVar.c = 0.0f;
                ouxVar.h = true;
                this.v = true;
            }
            if (Build.VERSION.SDK_INT >= 31 && (renderNode = this.u) != null) {
                renderNode.setRenderEffect(null);
            }
            I();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            long j10 = mewVar.c;
            float fIntBitsToFloat2 = (Memory.peekByte(j10 + j2) & 4) != 0 ? Float.intBitsToFloat(Memory.peekInt(j10 + 36, false)) : 1.0f;
            if (Memory.peekByte(mewVar.c + 25) == 0 || (arrayList = this.c) == null || arrayList.size() != 1 || !((PaintUnit) this.c.get(0)).o(fIntBitsToFloat2)) {
                ArrayList arrayList2 = this.c;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    ((PaintUnit) this.c.get(0)).o(1.0f);
                }
            } else {
                fIntBitsToFloat2 = 1.0f;
            }
            long j11 = mewVar.c;
            float fIntBitsToFloat3 = (Memory.peekByte(j11 + j) & 8) != 0 ? Float.intBitsToFloat(Memory.peekInt(j11 + 112, false)) : 1.0f;
            long j12 = mewVar.c;
            float fIntBitsToFloat4 = (Memory.peekByte(j12 + j) & 16) != 0 ? Float.intBitsToFloat(Memory.peekInt(j12 + 116, false)) : 1.0f;
            float fIntBitsToFloat5 = Float.intBitsToFloat(Memory.peekInt(mewVar.c + 48, false));
            float fIntBitsToFloat6 = Float.intBitsToFloat(Memory.peekInt(mewVar.c + 52, false));
            float fIntBitsToFloat7 = Float.intBitsToFloat(Memory.peekInt(mewVar.c + 56, false));
            if (fIntBitsToFloat2 < 1.0f || fIntBitsToFloat3 != 1.0f || fIntBitsToFloat4 != 1.0f || fIntBitsToFloat5 != 0.0f || fIntBitsToFloat6 != 0.0f || fIntBitsToFloat7 != 0.0f) {
                c();
            }
            RenderNode renderNode2 = this.u;
            if (renderNode2 != null) {
                boolean alpha = renderNode2.setAlpha(fIntBitsToFloat2);
                boolean scaleX = this.u.setScaleX(fIntBitsToFloat3);
                boolean scaleY = this.u.setScaleY(fIntBitsToFloat4);
                boolean rotationZ = this.u.setRotationZ(fIntBitsToFloat5);
                boolean translationX = this.u.setTranslationX(fIntBitsToFloat6);
                boolean translationY = this.u.setTranslationY(fIntBitsToFloat7);
                if (rotationZ && this.x) {
                    this.u.setUseCompositingLayer(L(), null);
                }
                if (alpha || scaleX || scaleY || rotationZ || translationX || translationY) {
                    ouy ouyVar = this.w;
                    if (ouyVar != null && ouyVar.a != null) {
                        K();
                    }
                    E();
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            long j13 = mewVar.c;
            if ((Memory.peekByte(9 + j13) & 32) != 0) {
                float fIntBitsToFloat8 = Float.intBitsToFloat(Memory.peekInt(j13 + 80, false));
                float fIntBitsToFloat9 = Float.intBitsToFloat(Memory.peekInt(mewVar.c + 88, false));
                float fIntBitsToFloat10 = Float.intBitsToFloat(Memory.peekInt(mewVar.c + 92, false));
                int iPeekInt2 = Memory.peekInt(mewVar.c + 84, false);
                ouy ouyVar2 = this.w;
                if (ouyVar2 == null) {
                    ouyVar2 = new ouy();
                    this.w = ouyVar2;
                }
                if (!ouyVar2.b || fIntBitsToFloat8 != ouyVar2.c || fIntBitsToFloat9 != ouyVar2.d || fIntBitsToFloat10 != ouyVar2.e || iPeekInt2 != ouyVar2.f) {
                    ouyVar2.c = fIntBitsToFloat8;
                    ouyVar2.d = fIntBitsToFloat9;
                    ouyVar2.e = fIntBitsToFloat10;
                    ouyVar2.f = iPeekInt2;
                    c();
                    d().setRenderEffect(RenderEffect.createOffsetEffect(fIntBitsToFloat9, fIntBitsToFloat10, RenderEffect.createBlurEffect(fIntBitsToFloat8, fIntBitsToFloat8, RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(iPeekInt2, PorterDuff.Mode.SRC_IN)), Shader.TileMode.DECAL)));
                    ouyVar2.b = true;
                    this.v = true;
                }
            } else {
                ouy ouyVar3 = this.w;
                if (ouyVar3 != null && ouyVar3.b) {
                    RenderNode renderNode3 = ouyVar3.a;
                    if (renderNode3 != null) {
                        renderNode3.discardDisplayList();
                    }
                    ouyVar3.a = null;
                    ouyVar3.b = false;
                    this.v = true;
                }
            }
        }
        boolean z4 = Memory.peekByte(mewVar.c + 18) != 0;
        if (this.x != z4) {
            this.x = z4;
            oul oulVar4 = this.r;
            if (oulVar4 != null) {
                oulVar4.f = z4;
            }
            oum oumVar4 = this.s;
            if (oumVar4 != null) {
                oumVar4.j = z4;
            }
            if (z4) {
                J();
            } else {
                this.y = false;
                RenderNode renderNode4 = this.u;
                if (renderNode4 != null) {
                    renderNode4.setClipToOutline(false);
                    this.u.setUseCompositingLayer(false, null);
                    oux ouxVar2 = this.d;
                    if (ouxVar2 != null && ouxVar2.a && !ouxVar2.b && Build.VERSION.SDK_INT >= 31) {
                        RenderNode renderNode5 = this.u;
                        float f2 = ouxVar2.c;
                        renderNode5.setRenderEffect(RenderEffect.createBlurEffect(f2, f2, Shader.TileMode.DECAL));
                    }
                }
            }
            this.v = true;
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ List C(mew mewVar) {
        return null;
    }

    protected final void D(Canvas canvas) {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((PaintUnit) arrayList.get(i2)).b(canvas);
            }
        }
    }

    public final void E() {
        PaintUnitOwner paintUnitOwner = this.j;
        if (paintUnitOwner instanceof ous) {
            ((ous) paintUnitOwner).E();
        } else if (paintUnitOwner != null) {
            paintUnitOwner.G();
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void G() {
        a();
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void H() {
        a();
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitLayer
    public final void a() {
        this.v = true;
        oux ouxVar = this.d;
        if (ouxVar != null) {
            ouxVar.h = true;
        }
        PaintUnitOwner paintUnitOwner = this.j;
        if (paintUnitOwner instanceof PaintUnitLayer) {
            ((PaintUnitLayer) paintUnitOwner).a();
        } else if (paintUnitOwner != null) {
            paintUnitOwner.G();
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0073 A[Catch: all -> 0x0135, TryCatch #0 {all -> 0x0135, blocks: (B:41:0x0066, B:43:0x0073, B:44:0x0077), top: B:118:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0077 A[Catch: all -> 0x0135, TRY_LEAVE, TryCatch #0 {all -> 0x0135, blocks: (B:41:0x0066, B:43:0x0073, B:44:0x0077), top: B:118:0x0066 }] */
    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void b(Canvas canvas) {
        float scaleY;
        boolean z;
        float translationX;
        float translationY;
        RecordingCanvas recordingCanvasBeginRecording;
        RenderNode renderNode;
        oux ouxVar;
        oux ouxVar2 = this.d;
        boolean z2 = ouxVar2 != null && ouxVar2.a && ouxVar2.c > 0.01f && (ouxVar2.b || Build.VERSION.SDK_INT < 31);
        oux ouxVar3 = this.d;
        if (ouxVar3 != null && ouxVar3.a && ouxVar3.c > 0.01f && (this.u == null || !canvas.isHardwareAccelerated())) {
            F(canvas, true);
            this.v = false;
            return;
        }
        float f2 = 0.0f;
        if (this.u == null || !canvas.isHardwareAccelerated()) {
            RenderNode renderNode2 = this.u;
            float scaleX = 1.0f;
            if (renderNode2 != null) {
                scaleX = renderNode2.getScaleX();
                scaleY = this.u.getScaleY();
                float rotationZ = this.u.getRotationZ();
                translationX = this.u.getTranslationX();
                translationY = this.u.getTranslationY();
                z = (scaleX == 1.0f && scaleY == 1.0f && rotationZ == 0.0f && translationX == 0.0f && translationY == 0.0f) ? false : true;
                f2 = rotationZ;
            } else {
                scaleY = 1.0f;
                z = false;
                translationX = 0.0f;
                translationY = 0.0f;
            }
            if (z) {
                Matrix matrix = (Matrix) h.get();
                matrix.reset();
                float f3 = (this.k + this.m) / 2.0f;
                float f4 = (this.l + this.n) / 2.0f;
                matrix.postTranslate(-f3, -f4);
                matrix.postScale(scaleX, scaleY);
                matrix.postRotate(f2);
                matrix.postTranslate(f3 + translationX, f4 + translationY);
                canvas.save();
                canvas.concat(matrix);
            }
            boolean z3 = this.x && this.z != null && L();
            if (this.x && this.z != null) {
                canvas.save();
                canvas.clipPath(this.z);
                if (z3) {
                    canvas.saveLayer(null, null);
                }
            }
            h(canvas);
            D(canvas);
            n(canvas);
            if (this.x && this.z != null) {
                if (z3) {
                    canvas.restore();
                }
                canvas.restore();
            }
            if (z) {
                canvas.restore();
            }
        } else {
            if (!this.u.hasDisplayList() || this.v) {
                recordingCanvasBeginRecording = this.u.beginRecording();
                try {
                    recordingCanvasBeginRecording.translate(-this.k, -this.l);
                    if (z2) {
                        F(recordingCanvasBeginRecording, false);
                    } else {
                        h(recordingCanvasBeginRecording);
                        D(recordingCanvasBeginRecording);
                        n(recordingCanvasBeginRecording);
                    }
                    this.u.endRecording();
                } catch (Throwable th) {
                    this.u.endRecording();
                    throw th;
                }
            } else if (z2 && (ouxVar = this.d) != null && ouxVar.h) {
                z2 = true;
                recordingCanvasBeginRecording = this.u.beginRecording();
                recordingCanvasBeginRecording.translate(-this.k, -this.l);
                if (z2) {
                    F(recordingCanvasBeginRecording, false);
                } else {
                    h(recordingCanvasBeginRecording);
                    D(recordingCanvasBeginRecording);
                    n(recordingCanvasBeginRecording);
                }
                this.u.endRecording();
            }
            ouy ouyVar = this.w;
            if (ouyVar != null && (renderNode = ouyVar.a) != null) {
                if (!renderNode.hasDisplayList() || this.v) {
                    RecordingCanvas recordingCanvasBeginRecording2 = renderNode.beginRecording();
                    try {
                        recordingCanvasBeginRecording2.translate(-renderNode.getLeft(), -renderNode.getTop());
                        if (Memory.peekByte(FlagServices.b().c + 28) != 0) {
                            recordingCanvasBeginRecording2.drawRenderNode(this.u);
                        } else {
                            if (g == null) {
                                Paint paint = new Paint(1);
                                g = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            g.setColor(-16777216);
                            recordingCanvasBeginRecording2.save();
                            recordingCanvasBeginRecording2.translate(this.k, this.l);
                            Matrix matrix2 = (Matrix) h.get();
                            this.u.getMatrix(matrix2);
                            recordingCanvasBeginRecording2.concat(matrix2);
                            float f5 = this.o;
                            int i2 = this.m;
                            if (f5 > 0.0f) {
                                recordingCanvasBeginRecording2.drawRoundRect(0.0f, 0.0f, i2 - this.k, this.n - this.l, f5, f5, g);
                            } else {
                                recordingCanvasBeginRecording2.drawRect(0.0f, 0.0f, i2 - this.k, this.n - this.l, g);
                            }
                            recordingCanvasBeginRecording2.restore();
                        }
                        renderNode.endRecording();
                    } catch (Throwable th2) {
                        renderNode.endRecording();
                        throw th2;
                    }
                }
                canvas.drawRenderNode(renderNode);
            }
            canvas.drawRenderNode(this.u);
        }
        this.v = false;
    }

    public final RenderNode c() {
        if (this.u == null) {
            RenderNode renderNode = new RenderNode("PaintUnitLayer");
            this.u = renderNode;
            renderNode.setClipToBounds(false);
            this.u.setPosition(this.k, this.l, this.m, this.n);
        }
        return this.u;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        I();
    }

    public final RenderNode d() {
        ouy ouyVar = this.w;
        if (ouyVar == null) {
            ouyVar = new ouy();
            this.w = ouyVar;
        }
        RenderNode renderNode = ouyVar.a;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("PaintUnitLayer");
        renderNode2.setClipToBounds(false);
        ouyVar.a = renderNode2;
        K();
        return renderNode2;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void e(boolean z) {
        if (this.t != z) {
            this.t = z;
            ouv ouvVar = this.b;
            if (ouvVar != null) {
                ouvVar.e(z);
            }
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void f(PaintUnitOwner paintUnitOwner) {
        this.j = paintUnitOwner;
    }

    protected final void h(Canvas canvas) {
        oum oumVar;
        oul oulVar = this.r;
        if (oulVar != null && (Memory.peekByte(FlagServices.b().c + 91) == 0 || (oulVar.b < oulVar.d && oulVar.c < oulVar.e && ((oulVar.g & (-16777216)) != 0 || oulVar.n != null || ((oumVar = oulVar.m) != null && oumVar.e > 0.0f && (oumVar.d & (-16777216)) != 0 && oumVar.f < oumVar.h && oumVar.g < oumVar.i))))) {
            oulVar.b(canvas);
        }
        ouv ouvVar = this.b;
        if (ouvVar != null) {
            ouvVar.b(canvas);
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final boolean i() {
        oux ouxVar = this.d;
        return (ouxVar == null || ouxVar.d == null) ? false : true;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final boolean ic() {
        ArrayList arrayList = this.c;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!((PaintUnit) arrayList.get(i2)).ic()) {
                    return false;
                }
            }
        } else if (this.r == null && this.s == null && this.b == null) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final int ig() {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final PaintUnit ih(int i2) {
        PaintUnit paintUnitIh;
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                PaintUnit paintUnit = (PaintUnit) arrayList.get(i3);
                if (paintUnit.p() == i2) {
                    return paintUnit;
                }
                if ((paintUnit instanceof PaintUnitOwner) && (paintUnitIh = ((PaintUnitOwner) paintUnit).ih(i2)) != null) {
                    return paintUnitIh;
                }
            }
        }
        return null;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void ii(PaintUnit paintUnit, int i2) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.c = arrayList;
        }
        arrayList.add(i2, paintUnit);
        paintUnit.f(this);
        a();
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void ij(int i2) {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            ((PaintUnit) arrayList.remove(i2)).f(null);
        }
        a();
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void ik(int i2) {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.remove(i2);
        }
        a();
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void il(Drawable drawable, Runnable runnable, long j) {
        PaintUnitOwner paintUnitOwner = this.j;
        if (paintUnitOwner != null) {
            paintUnitOwner.il(drawable, runnable, j);
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void im(Drawable drawable, Runnable runnable) {
        PaintUnitOwner paintUnitOwner = this.j;
        if (paintUnitOwner != null) {
            paintUnitOwner.im(drawable, runnable);
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final PaintUnit j(int i2) {
        return (PaintUnit) this.c.get(i2);
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void k(Closeable closeable) {
        PaintUnitOwner paintUnitOwner = this.j;
        if (paintUnitOwner != null) {
            paintUnitOwner.k(closeable);
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void l(PaintUnit paintUnit) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.c = arrayList;
        }
        arrayList.add(paintUnit);
        paintUnit.f(this);
        a();
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ atoc m() {
        return null;
    }

    protected final void n(Canvas canvas) {
        oum oumVar = this.s;
        if (oumVar != null) {
            if (Memory.peekByte(FlagServices.b().c + 91) == 0 || (oumVar.e > 0.0f && (oumVar.d & (-16777216)) != 0 && oumVar.f < oumVar.h && oumVar.g < oumVar.i)) {
                oumVar.b(canvas);
            }
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ boolean o(float f2) {
        return false;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final int p() {
        return this.a;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final Rect q() {
        return new Rect(this.k, this.l, this.m, this.n);
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final PaintUnitOwner r() {
        return this.j;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner
    public final void s(boolean z) {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.c = null;
        a();
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void t(int i2, int i3, int i4, int i5) {
        int i6 = this.k;
        if (i2 == i6 && i3 == this.l && i4 == this.m && i5 == this.n) {
            return;
        }
        boolean z = (i4 - i2 == this.m - i6 && i5 - i3 == this.n - this.l) ? false : true;
        this.k = i2;
        this.l = i3;
        this.m = i4;
        this.n = i5;
        RenderNode renderNode = this.u;
        if (renderNode != null) {
            renderNode.setPosition(i2, i3, i4, i5);
            ouy ouyVar = this.w;
            if (ouyVar != null && ouyVar.a != null) {
                K();
            }
        }
        oul oulVar = this.r;
        if (oulVar != null) {
            oulVar.t(i2, i3, i4, i5);
        }
        oum oumVar = this.s;
        if (oumVar != null) {
            oumVar.t(i2, i3, i4, i5);
        }
        ouv ouvVar = this.b;
        if (ouvVar != null) {
            ouvVar.t(i2, i3, i4, i5);
        }
        if (z || this.u == null) {
            J();
            this.v = true;
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void u(int[] iArr, float f2, float f3) {
        oul oulVar = this.r;
        if (oulVar != null) {
            oulVar.u(iArr, f2, f3);
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void v(agfr agfrVar, ovd ovdVar) {
        oul oulVar = this.r;
        if (oulVar == null) {
            oul oulVar2 = new oul();
            this.r = oulVar2;
            oulVar2.l = this;
            oulVar2.t(this.k, this.l, this.m, this.n);
            oulVar = this.r;
            oulVar.h = this.o;
            oulVar.i = this.p;
            oulVar.j = this.q;
        }
        oulVar.v(agfrVar, ovdVar);
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void w(int i2) {
        this.a = i2;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ boolean x(long j, long j2, View view) {
        return false;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ boolean y(MotionEvent motionEvent, View view) {
        return false;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ mew z(float f2, float f3, int i2) {
        return null;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ void A() {
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void g(int i2, int i3, int i4, int i5) {
    }
}
