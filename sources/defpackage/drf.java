package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class drf extends Property {
    public drf(Class cls) {
        super(cls, "topLeft");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        drm drmVar = (drm) obj;
        PointF pointF = (PointF) obj2;
        drmVar.a = Math.round(pointF.x);
        drmVar.b = Math.round(pointF.y);
        int i = drmVar.e + 1;
        drmVar.e = i;
        if (i == drmVar.f) {
            drmVar.a();
        }
    }
}
