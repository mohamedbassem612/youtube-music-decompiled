package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class hbj extends mng {
    mnh a;
    int b;
    ewf c;
    final float d;
    final Path e;
    final Path f;
    final Path g;
    int h;
    private final Context u;
    private final DisplayMetrics v;
    private final Paint w;

    public hbj(Bitmap bitmap, ImageView.ScaleType scaleType, float f, boolean z, Context context, DisplayMetrics displayMetrics, nuc nucVar) {
        super(bitmap, scaleType, 0.0f, 0, f, z, nucVar, agdf.a);
        this.b = 0;
        this.h = 1;
        this.w = new Paint();
        this.e = new Path();
        this.f = new Path();
        this.g = new Path();
        this.u = context;
        this.v = displayMetrics;
        this.d = f;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086 A[LOOP:0: B:29:0x007e->B:31:0x0086, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0093  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7 A[LOOP:1: B:35:0x00a5->B:36:0x00a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x011c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0126  */
    /* JADX WARN: Code duplicated, block: B:69:0x0130  */
    public final void a(anyg anygVar, vxz vxzVar) {
        float[] fArr;
        int[] iArr;
        int size;
        int i;
        asla aslaVar;
        int i2;
        int i3;
        PointF pointF;
        PointF pointF2;
        float fFloatValue;
        PointF pointF3;
        float[] fArr2;
        int i4;
        int i5 = anygVar.c;
        if (i5 == 2) {
            aslb aslbVar = (aslb) anygVar.d;
            DisplayMetrics displayMetrics = this.v;
            nuc nucVar = this.o;
            mnh mnhVar = null;
            if (aslbVar.d.size() == 0) {
                nucVar.c(aslh.LOG_TYPE_MISSING_FIELD, nsl.a, "MusicThumbnailImageProcessorUtil Linear Gradient colors is null and linear gradient cannot be applied", new Object[0]);
            } else if (aslbVar.d.size() < 2) {
                nucVar.c(aslh.LOG_TYPE_INVALID_FIELD, nsl.a, "MusicThumbnailImageProcessorUtil There should be minimum 2 colors to apply linear gradient", new Object[0]);
            } else {
                int i6 = aslbVar.b;
                if (i6 != 4) {
                    if (aslbVar.e.size() > 0) {
                        fArr2 = new float[aslbVar.e.size()];
                        for (i4 = 0; i4 < aslbVar.e.size(); i4++) {
                            fArr2[i4] = aslbVar.e.d(i4);
                        }
                        fArr = fArr2;
                    } else {
                        fArr = null;
                    }
                    iArr = new int[aslbVar.d.size()];
                    size = aslbVar.d.size() - 1;
                    i = 0;
                    while (size >= 0) {
                        iArr[i] = aslbVar.d.d(size);
                        size--;
                        i++;
                    }
                    if (aslbVar.b == 4) {
                        aslaVar = (asla) aslbVar.c;
                    } else {
                        aslaVar = asla.a;
                    }
                    i2 = aslaVar.b;
                    if ((i2 & 1) != 0 || (i2 & 2) == 0) {
                        i3 = 1;
                        pointF = null;
                        pointF2 = null;
                    } else {
                        asob asobVar = aslaVar.c;
                        if (asobVar == null) {
                            asobVar = asob.a;
                        }
                        float f = asobVar.c;
                        asob asobVar2 = aslaVar.c;
                        if (asobVar2 == null) {
                            asobVar2 = asob.a;
                        }
                        float f2 = asobVar2.d;
                        asob asobVar3 = aslaVar.d;
                        float f3 = (asobVar3 == null ? asob.a : asobVar3).c;
                        if (asobVar3 == null) {
                            asobVar3 = asob.a;
                        }
                        float f4 = asobVar3.d;
                        int iAS = a.aS(aslaVar.e);
                        if (iAS == 0 || iAS != 2) {
                            PointF pointF4 = new PointF(f, f2);
                            pointF3 = new PointF(f3, f4);
                            i3 = 1;
                            pointF = pointF4;
                        } else {
                            PointF pointF5 = new PointF(TypedValue.applyDimension(1, f, displayMetrics), TypedValue.applyDimension(1, f2, displayMetrics));
                            pointF3 = new PointF(TypedValue.applyDimension(1, f3, displayMetrics), TypedValue.applyDimension(1, f4, displayMetrics));
                            i3 = 2;
                            pointF = pointF5;
                        }
                        pointF2 = pointF3;
                    }
                    if (aslbVar.b == 3) {
                        fFloatValue = ((Float) aslbVar.c).floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    mnhVar = new mnh(fFloatValue, pointF, pointF2, iArr, fArr, i3, nucVar);
                } else if ((((i6 == 4 ? (asla) aslbVar.c : asla.a).b & 2) == 0 ? 0 : 1) != ((aslbVar.b == 4 ? (asla) aslbVar.c : asla.a).b & 1)) {
                    nucVar.c(aslh.LOG_TYPE_MISSING_FIELD, nsl.a, "MusicThumbnailImageProcessorUtil LinearGradient line should have both start and end values to apply linear gradient", new Object[0]);
                } else {
                    if (aslbVar.e.size() > 0) {
                        fArr2 = new float[aslbVar.e.size()];
                        while (i4 < aslbVar.e.size()) {
                            fArr2[i4] = aslbVar.e.d(i4);
                        }
                        fArr = fArr2;
                    } else {
                        fArr = null;
                    }
                    iArr = new int[aslbVar.d.size()];
                    size = aslbVar.d.size() - 1;
                    i = 0;
                    while (size >= 0) {
                        iArr[i] = aslbVar.d.d(size);
                        size--;
                        i++;
                    }
                    if (aslbVar.b == 4) {
                        aslaVar = (asla) aslbVar.c;
                    } else {
                        aslaVar = asla.a;
                    }
                    i2 = aslaVar.b;
                    if ((i2 & 1) != 0) {
                        i3 = 1;
                        pointF = null;
                        pointF2 = null;
                    } else {
                        i3 = 1;
                        pointF = null;
                        pointF2 = null;
                    }
                    if (aslbVar.b == 3) {
                        fFloatValue = ((Float) aslbVar.c).floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    mnhVar = new mnh(fFloatValue, pointF, pointF2, iArr, fArr, i3, nucVar);
                }
            }
            this.a = mnhVar;
        } else if (i5 == 1) {
            this.b = ((Integer) anygVar.d).intValue();
        }
        int i7 = anygVar.b;
        if ((i7 & 2) != 0) {
            int iAU = a.aU(anygVar.f);
            if (iAU == 0) {
                iAU = 1;
            }
            this.h = iAU;
        }
        if ((i7 & 1) != 0) {
            asky askyVar = anygVar.e;
            if (askyVar == null) {
                askyVar = asky.a;
            }
            float fApplyDimension = TypedValue.applyDimension(1, askyVar.b, this.v);
            Context context = this.u;
            this.c = new npx(context, nsl.b().a(), this.o, 3, fApplyDimension, vxzVar.l(156, 45491721L, false), false).b(context.getApplicationContext(), new ezw(this.m, new ewo()), this.m.getWidth(), this.m.getHeight());
        }
    }

    @Override // defpackage.mng, defpackage.mfj, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.c == null && this.a == null && this.b == 0) {
            return;
        }
        Paint paint = this.w;
        paint.reset();
        float f = this.d;
        if (f > 0.0f) {
            Path path = this.g;
            path.reset();
            Path path2 = this.e;
            path2.reset();
            Path path3 = this.f;
            path3.reset();
            RectF rectF = this.k;
            path2.addRect(rectF, Path.Direction.CW);
            path3.addRoundRect(rectF, f, f, Path.Direction.CW);
            path.op(path2, path3, Path.Op.DIFFERENCE);
            canvas.clipOutPath(path);
        }
        if (this.h == 2) {
            Path path4 = this.g;
            path4.reset();
            RectF rectF2 = this.k;
            float fWidth = rectF2.width() / 2.0f;
            float fHeight = rectF2.height() / 2.0f;
            path4.addCircle(fWidth, fHeight, Math.min(fWidth, fHeight), Path.Direction.CW);
            canvas.clipOutPath(path4);
        }
        ewf ewfVar = this.c;
        if (ewfVar != null) {
            canvas.drawBitmap((Bitmap) ewfVar.c(), (Rect) null, this.k, paint);
        }
        mnh mnhVar = this.a;
        if (mnhVar != null) {
            mnhVar.d(this.k, getLayoutDirection() == 1, this.n);
            LinearGradient linearGradient = this.a.a;
            if (linearGradient != null) {
                paint.setShader(linearGradient);
            }
        } else {
            int i = this.b;
            if (i != 0) {
                paint.setColor(i);
            }
        }
        canvas.drawRect(this.k, paint);
    }
}
