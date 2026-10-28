package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class oxy extends oxw {
    private final float a;
    private final RectF b;
    private final Paint c;
    private Path d;

    public oxy(int i, float f, RectF rectF) {
        this.a = f;
        this.b = rectF;
        Paint paint = new Paint();
        this.c = paint;
        paint.setColor(i);
        paint.setAntiAlias(true);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00cc A[Catch: IndexOutOfBoundsException -> 0x0174, TryCatch #0 {IndexOutOfBoundsException -> 0x0174, blocks: (B:14:0x004a, B:16:0x006f, B:18:0x0075, B:19:0x0078, B:21:0x007c, B:33:0x00ba, B:36:0x00c2, B:40:0x00dc, B:46:0x00ec, B:50:0x00f6, B:52:0x00fc, B:55:0x010c, B:58:0x0127, B:60:0x0147, B:62:0x0150, B:61:0x014c, B:65:0x015a, B:67:0x0163, B:66:0x015f, B:68:0x0169, B:38:0x00cc, B:25:0x008d, B:27:0x00a0, B:29:0x00aa, B:31:0x00b0), top: B:74:0x004a }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    private final Path f(Layout layout) {
        float f;
        char c;
        char c2;
        char c3;
        ?? r12;
        int spanStart;
        oxy oxyVar = this;
        if (layout.getLineCount() != 0) {
            CharSequence text = layout.getText();
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                int lineEnd = layout.getLineEnd(layout.getLineCount() - 1);
                int spanStart2 = spanned.getSpanStart(oxyVar);
                if (spanStart2 != -1 && spanStart2 < lineEnd) {
                    int spanEnd = spanned.getSpanEnd(oxyVar);
                    if (spanEnd != -1) {
                        lineEnd = spanEnd;
                    }
                    int lineForOffset = layout.getLineForOffset(spanStart2);
                    int iMin = Math.min(layout.getLineCount() - 1, layout.getLineForOffset(lineEnd));
                    boolean zIsRtlCharAt = layout.isRtlCharAt(spanStart2);
                    Path path = new Path();
                    int i = lineForOffset;
                    while (i <= iMin) {
                        try {
                            RectF rectFB = rpi.b(layout, i);
                            char c4 = 3;
                            float fI = afxw.I(rectFB.height() / 2.0f, rectFB.width() / 2.0f, oxyVar.a);
                            if (i == lineForOffset) {
                                float primaryHorizontal = layout.getPrimaryHorizontal(spanStart2);
                                if (zIsRtlCharAt) {
                                    rectFB.right = primaryHorizontal;
                                } else {
                                    rectFB.left = primaryHorizontal;
                                }
                            }
                            if (i == iMin) {
                                int length = spanned.length();
                                if (length == 0) {
                                    f = fI;
                                    c = 1;
                                    c2 = 2;
                                } else {
                                    int i2 = length - 1;
                                    c = 1;
                                    oyb[] oybVarArr = (oyb[]) spanned.getSpans(i2, i2, oyb.class);
                                    int length2 = oybVarArr.length;
                                    c2 = 2;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 < length2) {
                                            c3 = c4;
                                            oyb oybVar = oybVarArr[i3];
                                            f = fI;
                                            if (oybVar.a && lineEnd >= (spanStart = spanned.getSpanStart(oybVar))) {
                                                break;
                                            }
                                            i3++;
                                            c4 = c3;
                                            fI = f;
                                        } else {
                                            f = fI;
                                        }
                                    }
                                    if (lineEnd >= layout.getLineEnd(iMin) && spanStart == 0) {
                                        nva.a(zIsRtlCharAt, layout.getPrimaryHorizontal(lineEnd), rectFB);
                                    } else if (spanStart > 0) {
                                        nva.a(zIsRtlCharAt, layout.getPrimaryHorizontal(spanStart), rectFB);
                                    }
                                }
                                c3 = c4;
                                spanStart = 0;
                                if (lineEnd >= layout.getLineEnd(iMin)) {
                                    if (spanStart > 0) {
                                        nva.a(zIsRtlCharAt, layout.getPrimaryHorizontal(spanStart), rectFB);
                                    }
                                } else if (spanStart > 0) {
                                    nva.a(zIsRtlCharAt, layout.getPrimaryHorizontal(spanStart), rectFB);
                                }
                            } else {
                                f = fI;
                                c = 1;
                                c2 = 2;
                                c3 = 3;
                            }
                            RectF rectF = new RectF();
                            RectF rectF2 = oxyVar.b;
                            if (rectF2 == null) {
                                rectF.left = i == lineForOffset ? f : 0.0f;
                                rectF.top = 0.0f;
                                rectF.right = i == iMin ? f : 0.0f;
                                rectF.bottom = 0.0f;
                                if (zIsRtlCharAt) {
                                    float f2 = rectF.left;
                                    rectF.left = rectF.right;
                                    rectF.right = f2;
                                    r12 = c;
                                } else {
                                    r12 = 0;
                                }
                            } else {
                                rectF = rectF2;
                                r12 = zIsRtlCharAt;
                            }
                            rectFB.set(rectFB.left - rectF.left, rectFB.top - rectF.top, rectFB.right + rectF.right, rectFB.bottom + rectF.bottom);
                            if (i == lineForOffset) {
                                if (lineForOffset == iMin) {
                                    float[] fArr = new float[8];
                                    fArr[0] = f;
                                    fArr[c] = f;
                                    fArr[c2] = f;
                                    fArr[c3] = f;
                                    fArr[4] = f;
                                    fArr[5] = f;
                                    fArr[6] = f;
                                    fArr[7] = f;
                                    path.addRoundRect(rectFB, fArr, Path.Direction.CW);
                                } else {
                                    path.addRoundRect(rectFB, r12 != 0 ? rpi.d(f) : rpi.c(f), Path.Direction.CW);
                                }
                            } else if (i == iMin) {
                                path.addRoundRect(rectFB, r12 != 0 ? rpi.c(f) : rpi.d(f), Path.Direction.CW);
                            } else {
                                path.addRect(rectFB, Path.Direction.CW);
                            }
                            i++;
                            oxyVar = this;
                        } catch (IndexOutOfBoundsException unused) {
                        }
                    }
                    return path;
                }
            }
        }
        return null;
    }

    @Override // defpackage.oxw
    public final void b(Canvas canvas) {
        Path path = this.d;
        if (path != null) {
            canvas.drawPath(path, this.c);
        }
    }

    @Override // defpackage.oxw
    public final void c(Layout layout, CharSequence charSequence) {
        this.d = f(layout);
    }

    @Override // defpackage.oxw
    public final void d() {
        this.d = null;
    }
}
