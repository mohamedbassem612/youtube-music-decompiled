package defpackage;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ejh extends eje {
    private final PointF e;

    public ejh(List list) {
        super(list);
        this.e = new PointF();
    }

    @Override // defpackage.eix
    public final /* synthetic */ Object f(enn ennVar, float f) {
        return g(ennVar, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eix
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final PointF g(enn ennVar, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        Object obj2 = ennVar.b;
        if (obj2 == null || (obj = ennVar.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        enp enpVar = this.d;
        if (enpVar != null && (pointF = (PointF) enpVar.b(ennVar.g, ennVar.h.floatValue(), pointF2, pointF3, f, c(), this.c)) != null) {
            return pointF;
        }
        PointF pointF4 = this.e;
        pointF4.set(pointF2.x + (f2 * (pointF3.x - pointF2.x)), pointF2.y + (f3 * (pointF3.y - pointF2.y)));
        return pointF4;
    }
}
