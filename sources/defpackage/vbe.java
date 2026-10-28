package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vbe implements vbf {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/creation/effects/selection/innertube/NoOpSelectedXenoAssetEntityKeysHandlerImpl");

    @Override // defpackage.vbf
    public final vbd a() {
        return vbd.d;
    }

    @Override // defpackage.vbf
    public final agke b() {
        ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/creation/effects/selection/innertube/NoOpSelectedXenoAssetEntityKeysHandlerImpl", "getEntityKeys", 22, "NoOpSelectedXenoAssetEntityKeysHandlerImpl.java")).t("getEntityKeys called on NoOp implementation. Surface type is missing in DI. Returning empty list.");
        return agpi.a;
    }

    @Override // defpackage.vbf
    public final void c(agke agkeVar) {
        ((agrc) ((agrc) a.c()).k("com/google/android/libraries/youtube/creation/effects/selection/innertube/NoOpSelectedXenoAssetEntityKeysHandlerImpl", "saveEntityKeys", 15, "NoOpSelectedXenoAssetEntityKeysHandlerImpl.java")).t("saveEntityKeys called on NoOp implementation. Surface type is missing in DI. Keys will not be saved.");
    }
}
