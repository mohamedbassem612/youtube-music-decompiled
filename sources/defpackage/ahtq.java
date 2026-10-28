package defpackage;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ahtq {
    public static final /* synthetic */ int d = 0;
    private static final long e;
    public final ahto b;
    public final jij c;
    private final Context f;
    private final ahtf g;
    private final ScheduledExecutorService h;
    public final Map a = new afv();
    private boolean i = false;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        e = 28800L;
    }

    public ahtq(ahtf ahtfVar, ahto ahtoVar, jij jijVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.g = ahtfVar;
        this.b = ahtoVar;
        this.c = jijVar;
        this.f = context;
        this.h = scheduledExecutorService;
    }

    final lpa a(ahtn ahtnVar) {
        ArrayDeque arrayDeque;
        this.b.c(ahtnVar);
        kjc kjcVar = new kjc((byte[]) null, (byte[]) null, (byte[]) null);
        Map map = this.a;
        synchronized (map) {
            String str = ahtnVar.c;
            if (map.containsKey(str)) {
                arrayDeque = (ArrayDeque) map.get(str);
            } else {
                ArrayDeque arrayDeque2 = new ArrayDeque();
                map.put(str, arrayDeque2);
                arrayDeque = arrayDeque2;
            }
            arrayDeque.add(kjcVar);
        }
        return (lpa) kjcVar.a;
    }

    final void b(Runnable runnable, long j) {
        this.h.schedule(runnable, j, TimeUnit.SECONDS);
    }

    final synchronized void c(boolean z) {
        this.i = z;
    }

    final void d() {
        if (this.b.a() == null || f()) {
            return;
        }
        e(0L);
    }

    final void e(long j) {
        b(new ahts(this, this.f, this.g, Math.min(Math.max(30L, j << 1), e)), j);
        c(true);
    }

    final synchronized boolean f() {
        return this.i;
    }
}
