package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class abmn implements Runnable {
    private final /* synthetic */ int $cid;

    public /* synthetic */ abmn(int i) {
        this.$cid = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            ((agrc) ((agrc) abmo.a.b()).k("com/google/android/libraries/youtube/player/internal/queue/LegacyQueueController", "fetchAndQueueNextVideo", 195, "LegacyQueueController.java")).t("Prefetch was cancelled");
        } else if (i == 9) {
            adin.b.e();
        }
    }
}
