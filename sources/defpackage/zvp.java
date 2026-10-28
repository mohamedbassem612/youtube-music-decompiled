package defpackage;

import j$.util.Optional;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.function.Function;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class zvp {
    public static zvr a;
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/net/error/ECatcherLog");
    private static Queue c = new ArrayBlockingQueue(10);

    @Deprecated
    public static void a(zvn zvnVar, zvm zvmVar, String str) {
        b(zvnVar, zvmVar, str, new Exception());
    }

    @Deprecated
    public static void b(zvn zvnVar, zvm zvmVar, String str, Throwable th) {
        i(zvnVar, zvmVar, str, th, Optional.empty());
    }

    @Deprecated
    public static void c(zvn zvnVar, zvm zvmVar, String str, Map map) {
        i(zvnVar, zvmVar, str, new Exception(), Optional.ofNullable(map));
    }

    @Deprecated
    public static void d(zvn zvnVar, zvm zvmVar, String str, Throwable th, Optional optional, Function function) {
        zvr zvrVar = a;
        if (zvrVar != null) {
            zvrVar.i(zvnVar, zvmVar, str, th, (Map) optional.orElse(agpn.b), function);
            return;
        }
        Queue queue = c;
        if (queue == null || queue.offer(new zvo(zvnVar, zvmVar, str, th, optional, function, false))) {
            return;
        }
        ((agrc) ((agrc) ((agrc) b.c()).j(th)).k("com/google/android/libraries/youtube/net/error/ECatcherLog", "log", 358, "ECatcherLog.java")).E("ECatcher log not initialized: level: %s, category: %s, message: %s", zvnVar, zvmVar, str);
    }

    public static void e(zvn zvnVar, zvm zvmVar, String str, Throwable th) {
        zvr zvrVar = a;
        if (zvrVar != null) {
            zvrVar.j(zvnVar, zvmVar, str, th, agdf.a, agpn.b, new yom(19), true);
            return;
        }
        Queue queue = c;
        if (queue == null || queue.offer(new zvo(zvnVar, zvmVar, str, th, Optional.empty(), new yom(16), true))) {
            return;
        }
        ((agrc) ((agrc) ((agrc) b.c()).j(th)).k("com/google/android/libraries/youtube/net/error/ECatcherLog", "logToError204Only", 385, "ECatcherLog.java")).E("ECatcher logToError204Only not initialized: level: %s, category: %s, message: %s:", zvnVar, zvmVar, str);
    }

    @Deprecated
    public static boolean f(zvn zvnVar, zvm zvmVar, String str, Throwable th, double d) {
        if (ThreadLocalRandom.current().nextDouble() >= d) {
            return false;
        }
        b(zvnVar, zvmVar, str, th);
        return true;
    }

    public static synchronized void g(zvr zvrVar) {
        zvrVar.getClass();
        a = zvrVar;
        Queue queue = c;
        if (queue != null) {
            for (zvo zvoVar = (zvo) queue.poll(); zvoVar != null; zvoVar = (zvo) c.poll()) {
                Throwable th = zvoVar.d;
                if (th != null) {
                    if (zvoVar.g) {
                        e(zvoVar.a, zvoVar.b, zvoVar.c, th);
                    }
                    d(zvoVar.a, zvoVar.b, zvoVar.c, th, zvoVar.e, zvoVar.f);
                } else {
                    zvn zvnVar = zvoVar.a;
                    zvm zvmVar = zvoVar.b;
                    String str = zvoVar.c;
                    zvr zvrVar2 = a;
                    if (zvrVar2 == null) {
                        Queue queue2 = c;
                        if (queue2 != null && !queue2.offer(new zvo(zvnVar, zvmVar, str))) {
                            ((agrc) ((agrc) b.c()).k("com/google/android/libraries/youtube/net/error/ECatcherLog", "logCpp", 406, "ECatcherLog.java")).E("ECatcher log not initialized: level: %s, category: %s, message: %s", zvnVar, zvmVar, str);
                        }
                    } else if (zvrVar2.e) {
                        zvrVar2.b.execute(afwl.i(new xhv(zvrVar2, zvnVar, zvmVar, str, 10)));
                    } else {
                        ((agrc) ((agrc) zvr.a.c()).k("com/google/android/libraries/youtube/net/error/HttpPingECatcherLogImpl", "logCpp", 258, "HttpPingECatcherLogImpl.java")).E("ECatcher disabled: level: %s, category: %s, message: %s", zvnVar, zvmVar, str);
                    }
                }
            }
        }
        c = null;
    }

    @Deprecated
    public static void h(zvn zvnVar, zvm zvmVar, String str, double d) {
        if (ThreadLocalRandom.current().nextDouble() < d) {
            a(zvnVar, zvmVar, str);
        }
    }

    private static void i(zvn zvnVar, zvm zvmVar, String str, Throwable th, Optional optional) {
        if (a != null) {
            int i = 9;
            optional.ifPresentOrElse(new hnw(zvnVar, zvmVar, str, th, i), new xhv(zvnVar, zvmVar, str, th, i));
            return;
        }
        Queue queue = c;
        if (queue == null || queue.offer(new zvo(zvnVar, zvmVar, str, th, optional, new yom(15), false))) {
            return;
        }
        ((agrc) ((agrc) ((agrc) b.c()).j(th)).k("com/google/android/libraries/youtube/net/error/ECatcherLog", "log", 313, "ECatcherLog.java")).E("ECatcher log not initialized: level: %s, category: %s, message: %s", zvnVar, zvmVar, str);
    }
}
