package defpackage;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class zaa implements Spatializer$OnSpatializerStateChangedListener {
    final zcf a;
    final agfr b;
    final /* synthetic */ zab c;

    public zaa(zab zabVar, zcf zcfVar, agfr agfrVar) {
        this.c = zabVar;
        this.a = zcfVar;
        this.b = agfrVar;
    }

    private final void a(Spatializer spatializer) {
        boolean z = spatializer.isEnabled() && spatializer.isAvailable();
        zcf zcfVar = this.a;
        if (zcfVar.A.G || zcfVar.A.H) {
            zab zabVar = this.c;
            if (z != zabVar.f) {
                zcd zcdVar = zcfVar.C;
                if (zcdVar.b().ordinal() == 0) {
                    zcb zcbVarA = zcdVar.a();
                    zcfVar.n(new zcb(zcbVarA.a, zjb.o(zcfVar.A, zcfVar.y, zcfVar.H, this.b, zcfVar.c().d()), zcbVarA.b));
                }
                ((yyv) zabVar.b).av(false, true, false);
                zcfVar.Z.t(spatializer.isEnabled(), spatializer.isAvailable());
            }
        }
        this.c.f = z;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        a(spatializer);
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        a(spatializer);
    }
}
