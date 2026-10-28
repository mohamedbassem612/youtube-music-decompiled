package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ekx {
    public final List a;
    public PointF b;
    public boolean c;

    public ekx(PointF pointF, boolean z, List list) {
        this.b = pointF;
        this.c = z;
        this.a = new ArrayList(list);
    }

    public final void a(float f, float f2) {
        PointF pointF = this.b;
        if (pointF == null) {
            pointF = new PointF();
            this.b = pointF;
        }
        pointF.set(f, f2);
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.a.size() + "closed=" + this.c + '}';
    }

    public ekx() {
        this.a = new ArrayList();
    }
}
