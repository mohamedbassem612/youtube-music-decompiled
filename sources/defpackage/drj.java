package defpackage;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class drj extends Property {
    public drj(Class cls) {
        super(cls, "position");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        int iRound = Math.round(pointF.x);
        int iRound2 = Math.round(pointF.y);
        dso.b(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
    }
}
