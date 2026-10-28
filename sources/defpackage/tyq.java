package defpackage;

import android.os.SystemClock;
import j$.time.Duration;
import j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tyq implements mbc {
    private final /* synthetic */ int $cid;

    public tyq(int i) {
        this.$cid = i;
    }

    @Override // defpackage.mbc
    public final long b() {
        return this.$cid != 0 ? SystemClock.elapsedRealtime() : SystemClock.elapsedRealtime();
    }

    @Override // defpackage.mbc
    public final long c() {
        return this.$cid != 0 ? mbe.a() : SystemClock.elapsedRealtimeNanos();
    }

    @Override // defpackage.mbc
    public final long d() {
        return this.$cid != 0 ? System.nanoTime() : System.nanoTime();
    }

    @Override // defpackage.mbc
    public final Duration e() {
        return this.$cid != 0 ? Duration.ofMillis(SystemClock.uptimeMillis()) : Duration.ofMillis(SystemClock.uptimeMillis());
    }

    @Override // defpackage.mbc
    public final Instant f() {
        return this.$cid != 0 ? Instant.now() : Instant.now();
    }
}
