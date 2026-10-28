package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class adao implements aheh {
    private final /* synthetic */ int $cid;

    public adao(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aheh
    public final void a(Throwable th) {
        int i = this.$cid;
        if (i == 0) {
            ((agrc) ((agrc) ((agrc) adap.a.b()).j(th)).k("com/google/android/libraries/youtube/rendering/elements/YouTubeCacheStrategyDelegate$1", "onFailure", (char) 159, "YouTubeCacheStrategyDelegate.java")).t("Failed to clear DiskCacheServingContext");
        } else if (i != 1) {
            twu.d("WebViewDataStoreManager", 6, "Data store eviction failed.", th);
        } else {
            eov.e("BillingClient", "RuntimeFlags registration failed.");
        }
    }

    @Override // defpackage.aheh
    public final /* synthetic */ void b(Object obj) {
        int i = this.$cid;
        if (i == 0) {
        } else if (i != 1) {
        } else {
            eov.e("BillingClient", "RuntimeFlags registration success.");
        }
    }
}
