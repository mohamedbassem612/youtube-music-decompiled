package defpackage;

import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class drg extends Property {
    public drg(Class cls) {
        super(cls, "bottomRight");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        drm drmVar = (drm) obj;
        PointF pointF = (PointF) obj2;
        drmVar.c = Math.round(pointF.x);
        drmVar.d = Math.round(pointF.y);
        int i = drmVar.f + 1;
        drmVar.f = i;
        if (drmVar.e == i) {
            drmVar.a();
        }
    }
}
