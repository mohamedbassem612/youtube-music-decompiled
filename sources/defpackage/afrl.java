package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class afrl implements afrm {
    private static final agrf a = agrf.h("com/google/apps/tiktok/sync/impl/NoOpSyncManager");

    @Override // defpackage.afrm
    public final ListenableFuture a() {
        ((agrc) ((agrc) a.b()).k("com/google/apps/tiktok/sync/impl/NoOpSyncManager", "poke", 18, "NoOpSyncManager.java")).t("Skipping #poke() because this is not a supported process");
        return aher.a;
    }

    @Override // defpackage.afrm
    public final ListenableFuture b() {
        ((agrc) ((agrc) a.b()).k("com/google/apps/tiktok/sync/impl/NoOpSyncManager", "sync", 24, "NoOpSyncManager.java")).t("Skipping #sync() because this is not a supported process");
        return aher.a;
    }
}
