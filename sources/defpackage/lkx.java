package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lkx {
    public static volatile lkx a;
    public static final Object b = new Object();
    public final AtomicLong c = new AtomicLong(-1);
    private final krw d;

    public lkx(Context context) {
        this.d = new ksl(context, new krx("module:cronet_dynamite"));
    }

    final synchronized void a(int i, int i2, long j, long j2, int i3) {
        AtomicLong atomicLong = this.c;
        if (atomicLong.get() == -1 || SystemClock.uptimeMillis() - atomicLong.get() > 1800000) {
            this.d.a(new krv(0, Arrays.asList(new krj(i, i2, -1, j, j2, null, null, 368, i3)))).p(new kea(this, 5));
        }
    }
}
