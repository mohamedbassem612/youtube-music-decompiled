package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elk extends ele {
    private final RectF j;
    private final Paint k;
    private final float[] l;
    private final Path m;
    private final elh n;
    private eix o;
    private eix p;

    public elk(ehm ehmVar, elh elhVar) {
        super(ehmVar, elhVar);
        this.j = new RectF();
        ehy ehyVar = new ehy();
        this.k = ehyVar;
        this.l = new float[8];
        this.m = new Path();
        this.n = elhVar;
        ehyVar.setAlpha(0);
        ehyVar.setStyle(Paint.Style.FILL);
        ehyVar.setColor(elhVar.k);
    }

    @Override // defpackage.ele, defpackage.ejw
    public final void a(Object obj, enp enpVar) {
        super.a(obj, enpVar);
        if (obj == ehr.K) {
            this.o = new ejo(enpVar, null);
        } else if (obj == ehr.a) {
            this.p = new ejo(enpVar, null);
        }
    }

    @Override // defpackage.ele, defpackage.eic
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        elh elhVar = this.n;
        float f = elhVar.i;
        float f2 = elhVar.j;
        RectF rectF2 = this.j;
        rectF2.set(0.0f, 0.0f, f, f2);
        this.a.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // defpackage.ele
    public final void j(Canvas canvas, Matrix matrix, int i) {
        elh elhVar = this.n;
        int i2 = elhVar.k;
        int iAlpha = Color.alpha(i2);
        if (iAlpha != 0) {
            eix eixVar = this.p;
            Integer num = eixVar == null ? null : (Integer) eixVar.e();
            Paint paint = this.k;
            if (num != null) {
                paint.setColor(num.intValue());
            } else {
                paint.setColor(i2);
            }
            eix eixVar2 = this.g.e;
            int iIntValue = eixVar2 == null ? 100 : ((Integer) eixVar2.e()).intValue();
            Paint paint2 = this.k;
            int i3 = (int) ((i / 255.0f) * (((iAlpha / 255.0f) * iIntValue) / 100.0f) * 255.0f);
            paint2.setAlpha(i3);
            eix eixVar3 = this.o;
            if (eixVar3 != null) {
                paint2.setColorFilter((ColorFilter) eixVar3.e());
            }
            if (i3 > 0) {
                float[] fArr = this.l;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                float f = elhVar.i;
                fArr[2] = f;
                fArr[3] = 0.0f;
                fArr[4] = f;
                float f2 = elhVar.j;
                fArr[5] = f2;
                fArr[6] = 0.0f;
                fArr[7] = f2;
                matrix.mapPoints(fArr);
                Path path = this.m;
                path.reset();
                path.moveTo(fArr[0], fArr[1]);
                path.lineTo(fArr[2], fArr[3]);
                path.lineTo(fArr[4], fArr[5]);
                path.lineTo(fArr[6], fArr[7]);
                path.lineTo(fArr[0], fArr[1]);
                path.close();
                canvas.drawPath(path, paint2);
            }
        }
    }
}
