package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ImageSpan;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class mrz extends mrr {
    private final float a;
    private final RectF b;
    private final Paint c;
    private final nuc d;
    private Path e;

    public mrz(int i, float f, RectF rectF, nuc nucVar) {
        this.a = f;
        this.b = rectF;
        Paint paint = new Paint();
        this.c = paint;
        this.d = nucVar;
        paint.setColor(i);
        paint.setAntiAlias(true);
    }

    private final Path g(Layout layout) {
        char c;
        char c2;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int spanStart;
        mrz mrzVar = this;
        Layout layout2 = layout;
        if (layout2.getLineCount() == 0) {
            return null;
        }
        CharSequence text = layout2.getText();
        if (!(text instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) text;
        int lineEnd = layout2.getLineEnd(layout2.getLineCount() - 1);
        int spanStart2 = spanned.getSpanStart(mrzVar);
        if (spanStart2 == -1 || spanStart2 >= lineEnd) {
            return null;
        }
        int spanEnd = spanned.getSpanEnd(mrzVar);
        if (spanEnd == -1) {
            spanEnd = lineEnd;
        }
        int lineForOffset = layout2.getLineForOffset(spanStart2);
        int iMin = Math.min(layout2.getLineCount() - 1, layout2.getLineForOffset(spanEnd));
        boolean zIsRtlCharAt = layout2.isRtlCharAt(spanStart2);
        Path path = new Path();
        int i = lineForOffset;
        while (i <= iMin) {
            char c3 = 3;
            int i2 = 0;
            try {
                RectF rectFB = rpi.b(layout2, i);
                c = 5;
                try {
                    c2 = 4;
                    try {
                        float fI = afxw.I(rectFB.height() / 2.0f, rectFB.width() / 2.0f, mrzVar.a);
                        if (i == lineForOffset) {
                            try {
                                float primaryHorizontal = layout2.getPrimaryHorizontal(spanStart2);
                                if (zIsRtlCharAt) {
                                    rectFB.right = primaryHorizontal;
                                } else {
                                    rectFB.left = primaryHorizontal;
                                }
                            } catch (IndexOutOfBoundsException e) {
                                indexOutOfBoundsException = e;
                                c3 = 3;
                                i2 = 0;
                                nuc nucVar = mrzVar.d;
                                aslh aslhVar = aslh.LOG_TYPE_INTERNAL_DEBUG_WARNING;
                                nsl nslVar = nsl.a;
                                Integer numValueOf = Integer.valueOf(i);
                                Integer numValueOf2 = Integer.valueOf(spanned.length());
                                Integer numValueOf3 = Integer.valueOf(layout.getLineCount());
                                Integer numValueOf4 = Integer.valueOf(spanStart2);
                                Integer numValueOf5 = Integer.valueOf(spanEnd);
                                Integer numValueOf6 = Integer.valueOf(lineForOffset);
                                Integer numValueOf7 = Integer.valueOf(iMin);
                                Boolean boolValueOf = Boolean.valueOf(zIsRtlCharAt);
                                int i3 = i2;
                                Integer numValueOf8 = Integer.valueOf(spanned.getSpans(i3, spanned.length(), Object.class).length);
                                Integer numValueOf9 = Integer.valueOf(((ImageSpan[]) spanned.getSpans(i3, spanned.length(), ImageSpan.class)).length);
                                Integer numValueOf10 = Integer.valueOf(((mrr[]) spanned.getSpans(i3, spanned.length(), mrr.class)).length);
                                Object[] objArr = new Object[11];
                                objArr[i3] = numValueOf;
                                objArr[1] = numValueOf2;
                                objArr[2] = numValueOf3;
                                objArr[c3] = numValueOf4;
                                objArr[c2] = numValueOf5;
                                objArr[c] = numValueOf6;
                                objArr[6] = numValueOf7;
                                objArr[7] = boolValueOf;
                                objArr[8] = numValueOf8;
                                objArr[9] = numValueOf9;
                                objArr[10] = numValueOf10;
                                nucVar.f(aslhVar, nslVar, indexOutOfBoundsException, "IOOBDiagnostics: line:%s tl:%s lc:%s so:%s eo:%s fl:%s ll:%s rtl:%s sp:%s isp:%s esp:%s", objArr);
                            }
                        }
                        if (i != iMin) {
                            c3 = 3;
                            i2 = 0;
                        } else {
                            int length = spanned.length();
                            if (length == 0) {
                                c3 = 3;
                                spanStart = 0;
                                i2 = 0;
                            } else {
                                int i4 = length - 1;
                                c3 = 3;
                                try {
                                    fur[] furVarArr = (fur[]) spanned.getSpans(i4, i4, fur.class);
                                    int length2 = furVarArr.length;
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < length2) {
                                            spanStart = spanned.getSpanStart(furVarArr[i2]);
                                            if (spanEnd >= spanStart) {
                                                break;
                                            }
                                            i2++;
                                        } else {
                                            spanStart = 0;
                                            break;
                                        }
                                    }
                                } catch (IndexOutOfBoundsException e2) {
                                    e = e2;
                                    i2 = 0;
                                    indexOutOfBoundsException = e;
                                    nuc nucVar2 = mrzVar.d;
                                    aslh aslhVar2 = aslh.LOG_TYPE_INTERNAL_DEBUG_WARNING;
                                    nsl nslVar2 = nsl.a;
                                    Integer numValueOf11 = Integer.valueOf(i);
                                    Integer numValueOf12 = Integer.valueOf(spanned.length());
                                    Integer numValueOf13 = Integer.valueOf(layout.getLineCount());
                                    Integer numValueOf14 = Integer.valueOf(spanStart2);
                                    Integer numValueOf15 = Integer.valueOf(spanEnd);
                                    Integer numValueOf16 = Integer.valueOf(lineForOffset);
                                    Integer numValueOf17 = Integer.valueOf(iMin);
                                    Boolean boolValueOf2 = Boolean.valueOf(zIsRtlCharAt);
                                    int i5 = i2;
                                    Integer numValueOf18 = Integer.valueOf(spanned.getSpans(i5, spanned.length(), Object.class).length);
                                    Integer numValueOf19 = Integer.valueOf(((ImageSpan[]) spanned.getSpans(i5, spanned.length(), ImageSpan.class)).length);
                                    Integer numValueOf110 = Integer.valueOf(((mrr[]) spanned.getSpans(i5, spanned.length(), mrr.class)).length);
                                    Object[] objArr2 = new Object[11];
                                    objArr2[i5] = numValueOf11;
                                    objArr2[1] = numValueOf12;
                                    objArr2[2] = numValueOf13;
                                    objArr2[c3] = numValueOf14;
                                    objArr2[c2] = numValueOf15;
                                    objArr2[c] = numValueOf16;
                                    objArr2[6] = numValueOf17;
                                    objArr2[7] = boolValueOf2;
                                    objArr2[8] = numValueOf18;
                                    objArr2[9] = numValueOf19;
                                    objArr2[10] = numValueOf110;
                                    nucVar2.f(aslhVar2, nslVar2, indexOutOfBoundsException, "IOOBDiagnostics: line:%s tl:%s lc:%s so:%s eo:%s fl:%s ll:%s rtl:%s sp:%s isp:%s esp:%s", objArr2);
                                    i++;
                                    mrzVar = this;
                                    layout2 = layout;
                                }
                            }
                            if (spanEnd < layout2.getLineEnd(iMin) && spanStart == 0) {
                                ket.G(zIsRtlCharAt, layout2.getPrimaryHorizontal(spanEnd), rectFB);
                            } else if (spanStart > 0) {
                                ket.G(zIsRtlCharAt, layout2.getPrimaryHorizontal(spanStart), rectFB);
                            }
                        }
                        try {
                            RectF rectF = new RectF();
                            RectF rectF2 = mrzVar.b;
                            if (rectF2 == null) {
                                rectF.left = i == lineForOffset ? fI : 0.0f;
                                rectF.top = 0.0f;
                                rectF.right = i == iMin ? fI : 0.0f;
                                rectF.bottom = 0.0f;
                                if (zIsRtlCharAt) {
                                    float f = rectF.left;
                                    rectF.left = rectF.right;
                                    rectF.right = f;
                                }
                            } else {
                                rectF = rectF2;
                            }
                            rectFB.set(rectFB.left - rectF.left, rectFB.top - rectF.top, rectFB.right + rectF.right, rectFB.bottom + rectF.bottom);
                            if (i == lineForOffset) {
                                if (lineForOffset == iMin) {
                                    float[] fArr = new float[8];
                                    fArr[i2] = fI;
                                    fArr[1] = fI;
                                    fArr[2] = fI;
                                    fArr[c3] = fI;
                                    fArr[4] = fI;
                                    fArr[5] = fI;
                                    fArr[6] = fI;
                                    fArr[7] = fI;
                                    path.addRoundRect(rectFB, fArr, Path.Direction.CW);
                                } else {
                                    path.addRoundRect(rectFB, zIsRtlCharAt ? rpi.d(fI) : rpi.c(fI), Path.Direction.CW);
                                }
                            } else if (i == iMin) {
                                path.addRoundRect(rectFB, zIsRtlCharAt ? rpi.c(fI) : rpi.d(fI), Path.Direction.CW);
                            } else {
                                path.addRect(rectFB, Path.Direction.CW);
                            }
                        } catch (IndexOutOfBoundsException e3) {
                            e = e3;
                            indexOutOfBoundsException = e;
                            nuc nucVar3 = mrzVar.d;
                            aslh aslhVar3 = aslh.LOG_TYPE_INTERNAL_DEBUG_WARNING;
                            nsl nslVar3 = nsl.a;
                            Integer numValueOf111 = Integer.valueOf(i);
                            Integer numValueOf112 = Integer.valueOf(spanned.length());
                            Integer numValueOf113 = Integer.valueOf(layout.getLineCount());
                            Integer numValueOf114 = Integer.valueOf(spanStart2);
                            Integer numValueOf115 = Integer.valueOf(spanEnd);
                            Integer numValueOf116 = Integer.valueOf(lineForOffset);
                            Integer numValueOf117 = Integer.valueOf(iMin);
                            Boolean boolValueOf3 = Boolean.valueOf(zIsRtlCharAt);
                            int i6 = i2;
                            Integer numValueOf118 = Integer.valueOf(spanned.getSpans(i6, spanned.length(), Object.class).length);
                            Integer numValueOf119 = Integer.valueOf(((ImageSpan[]) spanned.getSpans(i6, spanned.length(), ImageSpan.class)).length);
                            Integer numValueOf1110 = Integer.valueOf(((mrr[]) spanned.getSpans(i6, spanned.length(), mrr.class)).length);
                            Object[] objArr3 = new Object[11];
                            objArr3[i6] = numValueOf111;
                            objArr3[1] = numValueOf112;
                            objArr3[2] = numValueOf113;
                            objArr3[c3] = numValueOf114;
                            objArr3[c2] = numValueOf115;
                            objArr3[c] = numValueOf116;
                            objArr3[6] = numValueOf117;
                            objArr3[7] = boolValueOf3;
                            objArr3[8] = numValueOf118;
                            objArr3[9] = numValueOf119;
                            objArr3[10] = numValueOf1110;
                            nucVar3.f(aslhVar3, nslVar3, indexOutOfBoundsException, "IOOBDiagnostics: line:%s tl:%s lc:%s so:%s eo:%s fl:%s ll:%s rtl:%s sp:%s isp:%s esp:%s", objArr3);
                        }
                    } catch (IndexOutOfBoundsException e4) {
                        e = e4;
                        c3 = 3;
                    }
                } catch (IndexOutOfBoundsException e5) {
                    e = e5;
                    c2 = 4;
                    indexOutOfBoundsException = e;
                    nuc nucVar4 = mrzVar.d;
                    aslh aslhVar4 = aslh.LOG_TYPE_INTERNAL_DEBUG_WARNING;
                    nsl nslVar4 = nsl.a;
                    Integer numValueOf1111 = Integer.valueOf(i);
                    Integer numValueOf1112 = Integer.valueOf(spanned.length());
                    Integer numValueOf1113 = Integer.valueOf(layout.getLineCount());
                    Integer numValueOf1114 = Integer.valueOf(spanStart2);
                    Integer numValueOf1115 = Integer.valueOf(spanEnd);
                    Integer numValueOf1116 = Integer.valueOf(lineForOffset);
                    Integer numValueOf1117 = Integer.valueOf(iMin);
                    Boolean boolValueOf4 = Boolean.valueOf(zIsRtlCharAt);
                    int i7 = i2;
                    Integer numValueOf1118 = Integer.valueOf(spanned.getSpans(i7, spanned.length(), Object.class).length);
                    Integer numValueOf1119 = Integer.valueOf(((ImageSpan[]) spanned.getSpans(i7, spanned.length(), ImageSpan.class)).length);
                    Integer numValueOf11110 = Integer.valueOf(((mrr[]) spanned.getSpans(i7, spanned.length(), mrr.class)).length);
                    Object[] objArr4 = new Object[11];
                    objArr4[i7] = numValueOf1111;
                    objArr4[1] = numValueOf1112;
                    objArr4[2] = numValueOf1113;
                    objArr4[c3] = numValueOf1114;
                    objArr4[c2] = numValueOf1115;
                    objArr4[c] = numValueOf1116;
                    objArr4[6] = numValueOf1117;
                    objArr4[7] = boolValueOf4;
                    objArr4[8] = numValueOf1118;
                    objArr4[9] = numValueOf1119;
                    objArr4[10] = numValueOf11110;
                    nucVar4.f(aslhVar4, nslVar4, indexOutOfBoundsException, "IOOBDiagnostics: line:%s tl:%s lc:%s so:%s eo:%s fl:%s ll:%s rtl:%s sp:%s isp:%s esp:%s", objArr4);
                    i++;
                    mrzVar = this;
                    layout2 = layout;
                }
            } catch (IndexOutOfBoundsException e6) {
                e = e6;
                c = 5;
            }
            i++;
            mrzVar = this;
            layout2 = layout;
        }
        return path;
    }

    @Override // defpackage.mrr
    public final void a(Canvas canvas) {
        Path path = this.e;
        if (path != null) {
            canvas.drawPath(path, this.c);
        }
    }

    @Override // defpackage.mrr
    public final void b(Layout layout, CharSequence charSequence) {
        this.e = g(layout);
    }

    @Override // defpackage.mrr
    public final void c() {
        this.e = null;
    }
}
