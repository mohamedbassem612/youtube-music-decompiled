package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lom {
    public static volatile lqd h;
    private static final long i;
    private static volatile ScheduledExecutorService j;
    private static final Object k;
    public final Object a;
    public int b;
    public boolean c;
    public final String d;
    public final Map e;
    public AtomicInteger f;
    afjv g;
    private final PowerManager.WakeLock l;
    private Future m;
    private long n;
    private final Set o;
    private int p;
    private WorkSource q;
    private final ScheduledExecutorService r;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        i = 31622400000L;
        j = null;
        k = new Object();
        h = new lqd(null);
    }

    public lom(Context context) {
        String packageName = context.getPackageName();
        this.a = new Object();
        this.b = 0;
        this.o = new HashSet();
        this.c = true;
        this.e = new HashMap();
        this.f = new AtomicInteger(0);
        kro.m(context, "WakeLock: context must not be null");
        kro.j("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.g = null;
        if ("com.google.android.gms".equals(context.getPackageName())) {
            lqd lqdVar = h;
            this.d = "wake:com.google.firebase.iid.WakeLockHolder";
        } else {
            this.d = "*gcore*:wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        aguu.ak(powerManager);
        this.l = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        if (kta.a(context)) {
            packageName = ksz.a(packageName) ? context.getPackageName() : packageName;
            if (context != null && context.getPackageManager() != null && packageName != null) {
                try {
                    ApplicationInfo applicationInfoF = kte.b(context).f(packageName, 0);
                    if (applicationInfoF == null) {
                        Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                    } else {
                        int i2 = applicationInfoF.uid;
                        workSource = new WorkSource();
                        Method method = kta.b;
                        if (method != null) {
                            try {
                                method.invoke(workSource, Integer.valueOf(i2), packageName);
                            } catch (Exception e) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                            }
                        } else {
                            Method method2 = kta.a;
                            if (method2 != null) {
                                try {
                                    method2.invoke(workSource, Integer.valueOf(i2));
                                } catch (Exception e2) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                                }
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                }
            }
            this.q = workSource;
            if (workSource != null) {
                f(this.l, workSource);
            }
        }
        ScheduledExecutorService scheduledExecutorServiceAm = j;
        if (scheduledExecutorServiceAm == null) {
            synchronized (k) {
                scheduledExecutorServiceAm = j;
                if (scheduledExecutorServiceAm == null) {
                    ksy ksyVar = kyq.a;
                    scheduledExecutorServiceAm = ksy.am();
                    j = scheduledExecutorServiceAm;
                }
            }
        }
        this.r = scheduledExecutorServiceAm;
    }

    private static void f(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    public final void a(long j2) {
        this.f.incrementAndGet();
        lqd lqdVar = h;
        long jMax = Math.max(Math.min(Long.MAX_VALUE, i), 1L);
        if (j2 > 0) {
            jMax = Math.min(j2, jMax);
        }
        synchronized (this.a) {
            if (!c()) {
                lqd lqdVar2 = h;
                lqd lqdVar3 = h;
                this.g = afjv.a;
                this.l.acquire();
                SystemClock.elapsedRealtime();
            }
            this.b++;
            this.p++;
            d();
            Map map = this.e;
            abh abhVar = (abh) map.get(null);
            if (abhVar == null) {
                abhVar = new abh((byte[]) null);
                map.put(null, abhVar);
            }
            lqd lqdVar4 = h;
            abhVar.a++;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = Long.MAX_VALUE - jElapsedRealtime > jMax ? jElapsedRealtime + jMax : Long.MAX_VALUE;
            if (j3 > this.n) {
                this.n = j3;
                Future future = this.m;
                if (future != null) {
                    future.cancel(false);
                }
                this.m = this.r.schedule(new lei(this, 14), jMax, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void b() {
        Set set = this.o;
        if (set.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(set);
        set.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }

    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            z = this.b > 0;
        }
        return z;
    }

    public final void e() {
        synchronized (this.a) {
            if (c()) {
                if (this.c) {
                    int i2 = this.b - 1;
                    this.b = i2;
                    if (i2 > 0) {
                        return;
                    }
                } else {
                    this.b = 0;
                }
                b();
                Map map = this.e;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((abh) it.next()).a = 0;
                }
                map.clear();
                Future future = this.m;
                if (future != null) {
                    future.cancel(false);
                    this.m = null;
                    this.n = 0L;
                }
                lqd lqdVar = h;
                this.p = 0;
                PowerManager.WakeLock wakeLock = this.l;
                try {
                    if (wakeLock.isHeld()) {
                        try {
                            wakeLock.release();
                            if (this.g != null) {
                                this.g = null;
                            }
                        } catch (RuntimeException e) {
                            if (!e.getClass().equals(RuntimeException.class)) {
                                throw e;
                            }
                            lqd lqdVar2 = h;
                            Log.e("WakeLock", String.format("%s failed to release!", this.d), e);
                            if (this.g != null) {
                                this.g = null;
                            }
                        }
                    } else {
                        lqd lqdVar3 = h;
                        lqd.a("%s should be held!", this.d);
                    }
                } catch (Throwable th) {
                    if (this.g != null) {
                        this.g = null;
                    }
                    throw th;
                }
            }
        }
    }

    public final void d() {
    }
}
