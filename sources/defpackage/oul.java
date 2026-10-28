package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.multiplatform.elements.FlagServices;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnitOwner;
import java.util.List;
import libcore.io.Memory;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oul implements PaintUnit {
    static final Paint a;
    private static Path o;
    private static float[] p;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public float h;
    public boolean i;
    public oun j;
    public int k = -1;
    public PaintUnitOwner l;
    public oum m;
    public Drawable n;
    private agfr q;
    private ovd r;
    private Drawable.Callback s;

    static {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(0);
        paint.setAntiAlias(true);
        a = paint;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void B(mew mewVar) {
        long j;
        long j2 = mewVar.c;
        if ((Memory.peekByte(j2 + 8) & 1) != 0) {
            j = 20;
            this.g = Memory.peekInt(j2 + 28, false);
            if ((Memory.peekByte(j2 + 11) & 32) == 0 || Memory.peekByte(j2 + 20) != 0) {
                this.h = Float.intBitsToFloat(Memory.peekInt(j2 + 44, false));
                this.i = Memory.peekByte(mewVar.c + 19) != 0;
                this.j = null;
            } else {
                this.h = 0.0f;
                this.i = false;
                this.j = oun.g(mewVar);
            }
        } else {
            j = 20;
            this.g = 0;
            this.h = 0.0f;
            this.i = false;
            this.j = null;
        }
        if ((Memory.peekByte(mewVar.c + 8) & 8) != 0) {
            oum oumVar = new oum();
            oumVar.t(this.b, this.c, this.d, this.e);
            oumVar.a(Float.intBitsToFloat(Memory.peekInt(mewVar.c + 40, false)));
            long j3 = mewVar.c;
            if ((Memory.peekByte(11 + j3) & 32) == 0 || Memory.peekByte(j3 + j) != 0) {
                oumVar.a = Float.intBitsToFloat(Memory.peekInt(j3 + 44, false));
                oumVar.b = Memory.peekByte(mewVar.c + 19) != 0;
                oumVar.c = null;
            } else {
                oumVar.a = 0.0f;
                oumVar.b = false;
                oumVar.c = oun.g(mewVar);
            }
            long j4 = mewVar.c;
            if ((Memory.peekByte(j4 + 8) & 2) != 0) {
                oumVar.d = Memory.peekInt(j4 + 32, false);
            }
            this.m = oumVar;
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ List C(mew mewVar) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00da  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:65:0x0125  */
    /* JADX WARN: Code duplicated, block: B:66:0x012d  */
    /* JADX WARN: Code duplicated, block: B:68:0x014d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0171  */
    /* JADX WARN: Code duplicated, block: B:72:0x018a  */
    /* JADX WARN: Code duplicated, block: B:74:0x018e  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:90:0x0213  */
    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void b(Canvas canvas) {
        float[] fArr;
        Canvas canvas2;
        float f;
        Path path;
        oum oumVar;
        Canvas canvas3 = canvas;
        if (Memory.peekByte(FlagServices.b().c + 91) != 0) {
            if (this.b >= this.d || this.c >= this.e) {
                return;
            }
            if ((this.g & (-16777216)) == 0 && this.n == null && ((oumVar = this.m) == null || oumVar.e <= 0.0f || (oumVar.d & (-16777216)) == 0 || oumVar.f >= oumVar.h || oumVar.g >= oumVar.i)) {
                return;
            }
        }
        int i = this.g;
        if ((i & (-16777216)) != 0) {
            Paint paint = a;
            paint.setColor(i);
            oun ounVar = this.j;
            if (ounVar == null) {
                if (this.h > 0.0f) {
                    canvas3 = canvas;
                    canvas3.drawRect(this.b, this.c, this.d, this.e, paint);
                } else if (this.f) {
                    canvas3 = canvas;
                    canvas3.drawRect(this.b, this.c, this.d, this.e, paint);
                } else if (ounVar != null) {
                    fArr = p;
                    if (fArr == null) {
                        fArr = new float[8];
                        p = fArr;
                    }
                    ounVar.d(this.d - this.b, this.e - this.c, fArr);
                    if (fArr != null) {
                        if (Memory.peekByte(FlagServices.b().c + 91) != 0) {
                            f = fArr[0];
                            float f2 = fArr[1];
                            if (fArr[2] != f && fArr[4] == f && fArr[6] == f && fArr[3] == f2 && fArr[5] == f2 && fArr[7] == f2) {
                                canvas3 = canvas;
                                canvas3.drawRoundRect(this.b, this.c, this.d, this.e, f, f2, paint);
                            } else {
                                canvas2 = canvas;
                                path = o;
                                if (path == null) {
                                    o = new Path();
                                } else {
                                    path.reset();
                                }
                                Path path2 = o;
                                path2.addRoundRect(this.b, this.c, this.d, this.e, fArr, Path.Direction.CW);
                                canvas2.drawPath(path2, paint);
                            }
                        } else {
                            canvas2 = canvas;
                            Path path3 = new Path();
                            path3.addRoundRect(this.b, this.c, this.d, this.e, fArr, Path.Direction.CW);
                            canvas2.drawPath(path3, paint);
                        }
                        canvas3 = canvas2;
                    } else {
                        canvas.drawRect(this.b, this.c, this.d, this.e, paint);
                        canvas3 = canvas;
                    }
                } else if (this.i) {
                    float f3 = this.h;
                    int i2 = this.d;
                    int i3 = this.b;
                    float f4 = (i2 - i3) * f3;
                    int i4 = this.e;
                    int i5 = this.c;
                    float f5 = f3 * (i4 - i5);
                    canvas3 = canvas;
                    canvas3.drawRoundRect(i3, i5, i2, i4, f4, f5, paint);
                } else {
                    float f6 = this.b;
                    float f7 = this.c;
                    float f8 = this.d;
                    float f9 = this.e;
                    float f10 = this.h;
                    canvas3 = canvas;
                    canvas3.drawRoundRect(f6, f7, f8, f9, f10, f10, paint);
                }
            } else if (ounVar.f()) {
                if (this.f) {
                    canvas3.drawRect(this.b, this.c, this.d, this.e, paint);
                    canvas3 = canvas;
                } else {
                    Path path4 = o;
                    if (path4 == null) {
                        o = new Path();
                    } else {
                        path4.reset();
                    }
                    Path path5 = o;
                    ounVar.c(new RectF(this.b, this.c, this.d, this.e), path5, Path.Direction.CW);
                    paint.setAntiAlias(true);
                    canvas3.drawPath(path5, paint);
                }
            } else if (ounVar.e()) {
                if (this.f) {
                    canvas3 = canvas;
                    canvas3.drawRect(this.b, this.c, this.d, this.e, paint);
                } else if (ounVar != null) {
                    fArr = p;
                    if (fArr == null) {
                        fArr = new float[8];
                        p = fArr;
                    }
                    ounVar.d(this.d - this.b, this.e - this.c, fArr);
                    if (fArr != null) {
                        if (Memory.peekByte(FlagServices.b().c + 91) != 0) {
                            f = fArr[0];
                            float f11 = fArr[1];
                            if (fArr[2] != f) {
                            }
                            canvas2 = canvas;
                            path = o;
                            if (path == null) {
                                o = new Path();
                            } else {
                                path.reset();
                            }
                            Path path6 = o;
                            path6.addRoundRect(this.b, this.c, this.d, this.e, fArr, Path.Direction.CW);
                            canvas2.drawPath(path6, paint);
                        } else {
                            canvas2 = canvas;
                            Path path7 = new Path();
                            path7.addRoundRect(this.b, this.c, this.d, this.e, fArr, Path.Direction.CW);
                            canvas2.drawPath(path7, paint);
                        }
                        canvas3 = canvas2;
                    } else {
                        canvas.drawRect(this.b, this.c, this.d, this.e, paint);
                        canvas3 = canvas;
                    }
                } else if (this.i) {
                    float f12 = this.b;
                    float f13 = this.c;
                    float f14 = this.d;
                    float f15 = this.e;
                    float f16 = this.h;
                    canvas3 = canvas;
                    canvas3.drawRoundRect(f12, f13, f14, f15, f16, f16, paint);
                } else {
                    float f17 = this.h;
                    int i6 = this.d;
                    int i7 = this.b;
                    float f18 = (i6 - i7) * f17;
                    int i8 = this.e;
                    int i9 = this.c;
                    float f19 = f17 * (i8 - i9);
                    canvas3 = canvas;
                    canvas3.drawRoundRect(i7, i9, i6, i8, f18, f19, paint);
                }
            } else if (this.h > 0.0f) {
                canvas3 = canvas;
                canvas3.drawRect(this.b, this.c, this.d, this.e, paint);
            } else if (this.f) {
                canvas3 = canvas;
                canvas3.drawRect(this.b, this.c, this.d, this.e, paint);
            } else if (ounVar != null) {
                fArr = p;
                if (fArr == null) {
                    fArr = new float[8];
                    p = fArr;
                }
                ounVar.d(this.d - this.b, this.e - this.c, fArr);
                if (fArr != null) {
                    if (Memory.peekByte(FlagServices.b().c + 91) != 0) {
                        f = fArr[0];
                        float f110 = fArr[1];
                        if (fArr[2] != f) {
                        }
                        canvas2 = canvas;
                        path = o;
                        if (path == null) {
                            o = new Path();
                        } else {
                            path.reset();
                        }
                        Path path8 = o;
                        path8.addRoundRect(this.b, this.c, this.d, this.e, fArr, Path.Direction.CW);
                        canvas2.drawPath(path8, paint);
                    } else {
                        canvas2 = canvas;
                        Path path9 = new Path();
                        path9.addRoundRect(this.b, this.c, this.d, this.e, fArr, Path.Direction.CW);
                        canvas2.drawPath(path9, paint);
                    }
                    canvas3 = canvas2;
                } else {
                    canvas.drawRect(this.b, this.c, this.d, this.e, paint);
                    canvas3 = canvas;
                }
            } else if (this.i) {
                float f111 = this.b;
                float f112 = this.c;
                float f113 = this.d;
                float f114 = this.e;
                float f115 = this.h;
                canvas3 = canvas;
                canvas3.drawRoundRect(f111, f112, f113, f114, f115, f115, paint);
            } else {
                float f116 = this.h;
                int i10 = this.d;
                int i11 = this.b;
                float f117 = (i10 - i11) * f116;
                int i12 = this.e;
                int i13 = this.c;
                float f118 = f116 * (i12 - i13);
                canvas3 = canvas;
                canvas3.drawRoundRect(i11, i13, i10, i12, f117, f118, paint);
            }
        }
        if (this.m != null) {
            if (Memory.peekByte(FlagServices.b().c + 91) != 0) {
                oum oumVar2 = this.m;
                if (oumVar2.e > 0.0f && (oumVar2.d & (-16777216)) != 0 && oumVar2.f < oumVar2.h && oumVar2.g < oumVar2.i) {
                    this.m.b(canvas3);
                }
            } else {
                this.m.b(canvas3);
            }
        }
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.draw(canvas3);
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void f(PaintUnitOwner paintUnitOwner) {
        this.l = paintUnitOwner;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ boolean ic() {
        return true;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ atoc m() {
        return null;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ boolean o(float f) {
        return false;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final int p() {
        return this.k;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final Rect q() {
        return new Rect(this.b, this.c, this.d, this.e);
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final PaintUnitOwner r() {
        return this.l;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void t(int i, int i2, int i3, int i4) {
        if (i == this.b && i2 == this.c && i3 == this.d && i4 == this.e) {
            return;
        }
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        oum oumVar = this.m;
        if (oumVar != null) {
            oumVar.t(i, i2, i3, i4);
        }
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3, i4);
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void u(int[] iArr, float f, float f2) {
        if (this.n == null) {
            agfr agfrVar = this.q;
            if (agfrVar == null) {
                return;
            }
            if (agfrVar != null) {
                Drawable drawable = (Drawable) agfrVar.io();
                this.n = drawable;
                this.q = null;
                if (drawable != null) {
                    drawable.setCallback(null);
                    this.n = drawable;
                    ouk oukVar = new ouk(this);
                    this.s = oukVar;
                    drawable.setCallback(oukVar);
                    drawable.setBounds(this.b, this.c, this.d, this.e);
                }
            }
        }
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            drawable2.setState(iArr);
            this.n.setHotspot(f, f2);
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void v(agfr agfrVar, ovd ovdVar) {
        ovd ovdVar2 = this.r;
        if (ovdVar2 == null || !ovdVar2.equals(ovdVar)) {
            this.q = agfrVar;
            this.n = null;
            this.r = ovdVar;
        }
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void w(int i) {
        this.k = i;
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
    public final /* synthetic */ mew z(float f, float f2, int i) {
        return null;
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final /* synthetic */ void A() {
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void e(boolean z) {
    }

    @Override // com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit
    public final void g(int i, int i2, int i3, int i4) {
    }
}
