package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ejg extends eje {
    private final PointF e;
    private final float[] f;
    private final float[] g;
    private final PathMeasure h;
    private ejf i;

    public ejg(List list) {
        super(list);
        this.e = new PointF();
        this.f = new float[2];
        this.g = new float[2];
        this.h = new PathMeasure();
    }

    @Override // defpackage.eix
    public final /* bridge */ /* synthetic */ Object f(enn ennVar, float f) {
        float f2;
        ejf ejfVar = (ejf) ennVar;
        Path path = ejfVar.a;
        if (path == null) {
            return (PointF) ennVar.b;
        }
        enp enpVar = this.d;
        if (enpVar != null) {
            f2 = f;
            PointF pointF = (PointF) enpVar.b(ejfVar.g, ejfVar.h.floatValue(), (PointF) ejfVar.b, (PointF) ejfVar.c, c(), f2, this.c);
            if (pointF != null) {
                return pointF;
            }
        } else {
            f2 = f;
        }
        if (this.i != ejfVar) {
            this.h.setPath(path, false);
            this.i = ejfVar;
        }
        PathMeasure pathMeasure = this.h;
        float length = pathMeasure.getLength();
        float f3 = f2 * length;
        float[] fArr = this.f;
        float[] fArr2 = this.g;
        pathMeasure.getPosTan(f3, fArr, fArr2);
        PointF pointF2 = this.e;
        pointF2.set(fArr[0], fArr[1]);
        if (f3 < 0.0f) {
            pointF2.offset(fArr2[0] * f3, fArr2[1] * f3);
            return pointF2;
        }
        if (f3 <= length) {
            return pointF2;
        }
        float f4 = f3 - length;
        pointF2.offset(fArr2[0] * f4, fArr2[1] * f4);
        return pointF2;
    }
}
