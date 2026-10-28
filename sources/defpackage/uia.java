package defpackage;

import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.widget.EditText;
import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uia {
    public final Paint b;
    public int c;
    public int d;
    public boolean e;
    public final nuo g;
    private final Path h;
    public final avju f = new avju();
    public final StringBuilder a = new StringBuilder();
    private final Path i = new Path();

    public uia() {
        Paint paint = new Paint();
        this.b = paint;
        this.h = new Path();
        this.g = new nuo();
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(1.0f);
    }

    private static float c(EditText editText, int i) {
        return editText.getLayout().getLineBottom(i) + editText.getPaddingTop();
    }

    private static float d(EditText editText, int i) {
        return editText.getLayout().getLineTop(i) + editText.getPaddingTop();
    }

    public final int a() {
        return this.b.getColor();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:53:0x011e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0123  */
    /* JADX WARN: Code duplicated, block: B:61:0x0142  */
    public final void b(Canvas canvas, EditText editText, int i, int i2) {
        boolean z;
        char c;
        char c2;
        char c3;
        Path path;
        float f;
        float f2;
        Optional optional;
        float f3;
        float f4;
        float f5;
        float f6;
        int i3 = i2;
        boolean z2 = this.e;
        Paint paint = this.b;
        if (!z2) {
            paint.setPathEffect(new CornerPathEffect(this.d));
            Path path2 = this.h;
            path2.reset();
            avju avjuVar = this.f;
            Optional optionalD = avjuVar.d(i);
            if (optionalD.isPresent()) {
                path2.moveTo(((uhz) optionalD.get()).b, d(editText, i));
            }
            for (int i4 = i; i4 <= i3; i4++) {
                Optional optionalD2 = avjuVar.d(i4);
                if (optionalD2.isPresent()) {
                    path2.lineTo(((uhz) optionalD2.get()).c, d(editText, i4));
                    path2.lineTo(((uhz) optionalD2.get()).c, c(editText, i4));
                }
            }
            while (i3 >= i) {
                Optional optionalD3 = avjuVar.d(i3);
                if (optionalD3.isPresent()) {
                    path2.lineTo(((uhz) optionalD3.get()).b, c(editText, i3));
                    path2.lineTo(((uhz) optionalD3.get()).b, d(editText, i3));
                }
                i3--;
            }
            path2.close();
            canvas.drawPath(path2, paint);
            return;
        }
        paint.setPathEffect(null);
        float f7 = this.d;
        Path path3 = this.h;
        path3.reset();
        int textAlignment = editText.getTextAlignment();
        char c4 = 4;
        char c5 = 6;
        char c6 = 5;
        char c7 = 1;
        boolean z3 = textAlignment == 5 || !(textAlignment == 6 || textAlignment == 4 || (editText.getGravity() & 7) == 1);
        int textAlignment2 = editText.getTextAlignment();
        if (textAlignment2 == 6) {
            z = true;
        } else {
            if (textAlignment2 != 5 && textAlignment2 != 4) {
                editText.getGravity();
            }
            z = false;
        }
        int i5 = i;
        while (i5 <= i3) {
            char c8 = c4;
            avju avjuVar2 = this.f;
            Optional optionalD4 = avjuVar2.d(i5);
            if (optionalD4.isPresent()) {
                c = c5;
                float f8 = ((uhz) optionalD4.get()).b;
                float fD = d(editText, i5);
                c2 = c6;
                float f9 = ((uhz) optionalD4.get()).c;
                float fC = c(editText, i5);
                float fMin = Math.min(f7, (fC - fD) / 2.0f);
                c3 = c7;
                Path path4 = this.i;
                path4.reset();
                if (fMin > 0.0f) {
                    Optional optionalD5 = i5 > i ? avjuVar2.d(i5 - 1) : Optional.empty();
                    Optional optionalD6 = i5 < i3 ? avjuVar2.d(i5 + 1) : Optional.empty();
                    if (z3 && optionalD5.isPresent()) {
                        f = 0.001f;
                        if (Math.abs(f8 - ((uhz) optionalD5.get()).b) < 0.001f) {
                            f2 = 0.0f;
                        }
                        if (z3 || !optionalD6.isPresent()) {
                            optional = optionalD6;
                        } else {
                            optional = optionalD6;
                            if (Math.abs(f8 - ((uhz) optionalD6.get()).b) < f) {
                                f3 = 0.0f;
                            }
                            if (z || !optionalD5.isPresent()) {
                                f4 = f3;
                            } else {
                                f4 = f3;
                                if (Math.abs(f9 - ((uhz) optionalD5.get()).c) < f) {
                                    f5 = 0.0f;
                                }
                                if (z || !optional.isPresent()) {
                                    f6 = f5;
                                } else {
                                    Object obj = optional.get();
                                    f6 = f5;
                                    if (Math.abs(f9 - ((uhz) obj).c) < f) {
                                        fMin = 0.0f;
                                    }
                                }
                                float[] fArr = new float[8];
                                fArr[0] = f2;
                                fArr[c3] = f2;
                                fArr[2] = f6;
                                fArr[3] = f6;
                                fArr[c8] = fMin;
                                fArr[c2] = fMin;
                                fArr[c] = f4;
                                fArr[7] = f4;
                                path = path4;
                                path.addRoundRect(f8, fD, f9, fC, fArr, Path.Direction.CW);
                            }
                            f5 = fMin;
                            if (z) {
                                f6 = f5;
                            } else {
                                f6 = f5;
                            }
                            float[] fArr2 = new float[8];
                            fArr2[0] = f2;
                            fArr2[c3] = f2;
                            fArr2[2] = f6;
                            fArr2[3] = f6;
                            fArr2[c8] = fMin;
                            fArr2[c2] = fMin;
                            fArr2[c] = f4;
                            fArr2[7] = f4;
                            path = path4;
                            path.addRoundRect(f8, fD, f9, fC, fArr2, Path.Direction.CW);
                        }
                        f3 = fMin;
                        if (z) {
                            f4 = f3;
                            f5 = fMin;
                        } else {
                            f4 = f3;
                            f5 = fMin;
                        }
                        if (z) {
                            f6 = f5;
                        } else {
                            f6 = f5;
                        }
                        float[] fArr3 = new float[8];
                        fArr3[0] = f2;
                        fArr3[c3] = f2;
                        fArr3[2] = f6;
                        fArr3[3] = f6;
                        fArr3[c8] = fMin;
                        fArr3[c2] = fMin;
                        fArr3[c] = f4;
                        fArr3[7] = f4;
                        path = path4;
                        path.addRoundRect(f8, fD, f9, fC, fArr3, Path.Direction.CW);
                    } else {
                        f = 0.001f;
                    }
                    f2 = fMin;
                    if (z3) {
                        optional = optionalD6;
                        f3 = fMin;
                    } else {
                        optional = optionalD6;
                        f3 = fMin;
                    }
                    if (z) {
                        f4 = f3;
                        f5 = fMin;
                    } else {
                        f4 = f3;
                        f5 = fMin;
                    }
                    if (z) {
                        f6 = f5;
                    } else {
                        f6 = f5;
                    }
                    float[] fArr4 = new float[8];
                    fArr4[0] = f2;
                    fArr4[c3] = f2;
                    fArr4[2] = f6;
                    fArr4[3] = f6;
                    fArr4[c8] = fMin;
                    fArr4[c2] = fMin;
                    fArr4[c] = f4;
                    fArr4[7] = f4;
                    path = path4;
                    path.addRoundRect(f8, fD, f9, fC, fArr4, Path.Direction.CW);
                } else {
                    f7 = f7;
                    path = path4;
                    path.addRect(f8, fD, f9, fC, Path.Direction.CW);
                }
                Path path5 = path;
                if (i5 == i) {
                    path3.set(path5);
                } else {
                    path3.op(path5, Path.Op.UNION);
                }
            } else {
                f7 = f7;
                c = c5;
                c2 = c6;
                c3 = c7;
            }
            i5++;
            c4 = c8;
            c7 = c3;
            c6 = c2;
            c5 = c;
            f7 = f7;
        }
        canvas.drawPath(path3, paint);
    }
}
