package defpackage;

import android.os.Build;
import android.util.Log;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class agug extends agtx {
    static final boolean a;
    static final boolean b;
    static final boolean c;
    public static final AtomicReference d;
    private static final AtomicLong e;
    private static final ConcurrentLinkedQueue f;
    private volatile agsw g;

    static {
        a = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        b = "goldfish".equals(Build.HARDWARE) || "ranchu".equals(Build.HARDWARE);
        c = "eng".equals(Build.TYPE) || "userdebug".equals(Build.TYPE);
        d = new AtomicReference();
        e = new AtomicLong();
        f = new ConcurrentLinkedQueue();
    }

    public agug(String str) {
        agsw agswVarA;
        super(str);
        if (a || b) {
            this.g = new agty().a(a());
            return;
        }
        if (c) {
            agui aguiVar = aguk.c;
            String str2 = aguiVar.a;
            int i = aguiVar.f;
            agswVarA = new agui(2, Level.OFF, aguiVar.c, aguiVar.d, aguiVar.e).a(a());
        } else {
            agswVarA = null;
        }
        this.g = agswVarA;
    }

    public static void e() {
        while (true) {
            agug agugVar = (agug) aguf.a.poll();
            if (agugVar == null) {
                f();
                return;
            }
            agugVar.g = ((agtz) d.get()).a(agugVar.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [agsu, java.lang.Object] */
    private static void f() {
        while (true) {
            ahpu ahpuVar = (ahpu) f.poll();
            if (ahpuVar == null) {
                return;
            }
            e.getAndDecrement();
            ?? r1 = ahpuVar.a;
            Object obj = ahpuVar.b;
            if (!r1.J()) {
                if (((agsw) obj).d(r1.q())) {
                }
            }
            ((agsw) obj).c(r1);
        }
    }

    @Override // defpackage.agtx, defpackage.agsw
    public final void b(RuntimeException runtimeException, agsu agsuVar) {
        if (this.g != null) {
            this.g.b(runtimeException, agsuVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }

    @Override // defpackage.agsw
    public final void c(agsu agsuVar) {
        if (this.g != null) {
            this.g.c(agsuVar);
            return;
        }
        if (e.incrementAndGet() > 20) {
            f.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        f.offer(new ahpu(this, agsuVar));
        if (this.g != null) {
            f();
        }
    }

    @Override // defpackage.agsw
    public final boolean d(Level level) {
        return this.g == null || this.g.d(level);
    }
}
