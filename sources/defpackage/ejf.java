package defpackage;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ejf extends enn {
    public Path a;
    private final enn n;

    public ejf(egy egyVar, enn ennVar) {
        super(egyVar, (PointF) ennVar.b, (PointF) ennVar.c, ennVar.d, ennVar.e, ennVar.f, ennVar.g, ennVar.h);
        this.n = ennVar;
        a();
    }

    public final void a() {
        Object obj;
        Object obj2;
        Object obj3 = this.c;
        boolean z = false;
        if (obj3 != null && (obj2 = this.b) != null && ((PointF) obj2).equals(((PointF) obj3).x, ((PointF) this.c).y)) {
            z = true;
        }
        Object obj4 = this.b;
        if (obj4 == null || (obj = this.c) == null || z) {
            return;
        }
        enn ennVar = this.n;
        PointF pointF = (PointF) obj4;
        PointF pointF2 = (PointF) obj;
        PointF pointF3 = ennVar.l;
        PointF pointF4 = ennVar.m;
        ThreadLocal threadLocal = enm.a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            path.cubicTo(pointF.x + pointF3.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        }
        this.a = path;
    }
}
