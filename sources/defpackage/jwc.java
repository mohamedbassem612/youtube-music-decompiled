package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jwc {
    public static volatile jwc a;
    public static final Object b = new Object();
    public final AtomicLong c = new AtomicLong(-1);
    private final krw d;

    public jwc(Context context) {
        this.d = new ksl(context, new krx("ads_identifier:api"));
    }

    public final synchronized void a(int i, long j, long j2, int i2) {
        AtomicLong atomicLong = this.c;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        atomicLong.get();
        if (atomicLong.get() == -1 || jElapsedRealtime - atomicLong.get() > 1800000) {
            this.d.a(new krv(0, Arrays.asList(new krj(35401, i, 0, j, j2, null, null, 0, i2)))).p(new lcw(this, jElapsedRealtime, 1));
        }
    }
}
