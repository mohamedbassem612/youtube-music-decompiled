package defpackage;

import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class avfv implements avkd {
    private final /* synthetic */ int $cid;

    public avfv(int i) {
        this.$cid = i;
    }

    @Override // defpackage.avkd
    public final long a() {
        if (this.$cid != 0) {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
        Instant instantNow = Instant.now();
        return afxw.W(TimeUnit.SECONDS.toNanos(instantNow.getEpochSecond()), instantNow.getNano());
    }
}
