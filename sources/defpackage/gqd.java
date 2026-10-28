package defpackage;

import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gqd implements Runnable {
    private final /* synthetic */ int $cid;

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 7) {
            Duration duration = hia.a;
        } else if (i == 15) {
            throw new RuntimeException("Someone quit the @LightweightExecutor looper");
        }
    }
}
