package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwk implements bvd {
    @Override // defpackage.bvd
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // defpackage.bvd
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.bvd
    public final long c() {
        return System.nanoTime();
    }

    @Override // defpackage.bvd
    public final bvq d(Looper looper, Handler.Callback callback) {
        return new bwl(new Handler(looper, callback));
    }
}
