package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xil {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/logging/latency/DefaultLatencyActionSpanController");
    private final mbc b;
    private final ConcurrentMap c = new ConcurrentHashMap();
    private final ConcurrentMap d = new ConcurrentHashMap();

    public xil(mbc mbcVar) {
        this.b = mbcVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x00b1 A[Catch: all -> 0x00d2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0009, B:7:0x0011, B:10:0x00b1), top: B:17:0x0001 }] */
    public final synchronized agev a(String str) {
        agev agevVarI;
        ConcurrentMap concurrentMap = this.c;
        if (concurrentMap.containsKey(str)) {
            ConcurrentMap concurrentMap2 = this.d;
            if (concurrentMap2.containsKey(str)) {
                aihf builder = ((amix) concurrentMap.get(str)).toBuilder();
                mbc mbcVar = this.b;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long jD = (mbcVar.d() - ((Long) concurrentMap2.get(str)).longValue()) / 1000;
                builder.copyOnWrite();
                amix amixVar = (amix) builder.instance;
                amixVar.b |= 8;
                amixVar.e = jD;
                aihf aihfVarCreateBuilder = amji.a.createBuilder();
                long id = Thread.currentThread().getId();
                aihfVarCreateBuilder.copyOnWrite();
                amji amjiVar = (amji) aihfVarCreateBuilder.instance;
                amjiVar.b |= 16;
                amjiVar.e = id;
                int priority = Thread.currentThread().getPriority();
                aihfVarCreateBuilder.copyOnWrite();
                amji amjiVar2 = (amji) aihfVarCreateBuilder.instance;
                amjiVar2.b |= 16384;
                amjiVar2.k = priority;
                boolean zX = a.x();
                aihfVarCreateBuilder.copyOnWrite();
                amji amjiVar3 = (amji) aihfVarCreateBuilder.instance;
                amjiVar3.b |= 8;
                amjiVar3.d = zX;
                builder.copyOnWrite();
                amix amixVar2 = (amix) builder.instance;
                amji amjiVar4 = (amji) aihfVarCreateBuilder.build();
                amjiVar4.getClass();
                amixVar2.g = amjiVar4;
                amixVar2.b |= 32;
                amix amixVar3 = (amix) builder.build();
                concurrentMap.remove(str);
                concurrentMap2.remove(str);
                agevVarI = agev.i(amixVar3);
            } else {
                ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/logging/latency/DefaultLatencyActionSpanController", "endLatencyActionSpan", 58, "DefaultLatencyActionSpanController.java")).w("Calling endLatencyActionSpan() without calling startLatencyActionSpan() using the same spanName: %s", str);
                agevVarI = agdf.a;
            }
        } else {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/logging/latency/DefaultLatencyActionSpanController", "endLatencyActionSpan", 58, "DefaultLatencyActionSpanController.java")).w("Calling endLatencyActionSpan() without calling startLatencyActionSpan() using the same spanName: %s", str);
            agevVarI = agdf.a;
        }
        return agevVarI;
    }

    public final synchronized void b(String str) {
        ConcurrentMap concurrentMap = this.c;
        if (concurrentMap.containsKey(str)) {
            ((agrc) ((agrc) a.b()).k("com/google/android/libraries/youtube/logging/latency/DefaultLatencyActionSpanController", "startLatencyActionSpan", 38, "DefaultLatencyActionSpanController.java")).w("A LatencyActionSpan with the same spanName was already started. Restart a LatencyActionSpan. SpanName: %s", str);
            concurrentMap.remove(str);
            this.d.remove(str);
        }
        aihf aihfVarCreateBuilder = amix.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        amix amixVar = (amix) aihfVarCreateBuilder.instance;
        str.getClass();
        amixVar.b |= 1;
        amixVar.c = str;
        mbc mbcVar = this.b;
        long micros = TimeUnit.MILLISECONDS.toMicros(mbcVar.f().toEpochMilli());
        aihfVarCreateBuilder.copyOnWrite();
        amix amixVar2 = (amix) aihfVarCreateBuilder.instance;
        amixVar2.b |= 16;
        amixVar2.f = micros;
        concurrentMap.put(str, (amix) aihfVarCreateBuilder.build());
        this.d.put(str, Long.valueOf(mbcVar.d()));
    }
}
