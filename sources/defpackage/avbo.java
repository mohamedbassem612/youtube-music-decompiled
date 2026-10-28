package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avbo {
    public final avca a;
    public final avcj b;
    public final avbs c;
    public final ScheduledExecutorService d;
    public final Executor e;
    private final auys f;
    private final avbj g;
    private final avbw h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v12, types: [avbj] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [avca, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    public avbo(avbm avbmVar) {
        Object obj = avbmVar.a;
        obj.getClass();
        ((Integer) obj).intValue();
        ?? r0 = avbmVar.b;
        r0.getClass();
        this.a = r0;
        Object obj2 = avbmVar.c;
        obj2.getClass();
        this.b = (avcj) obj2;
        Object obj3 = avbmVar.d;
        obj3.getClass();
        this.c = (avbs) obj3;
        this.d = avbmVar.e;
        this.f = (auys) avbmVar.f;
        this.e = avbmVar.g;
        Object obj4 = avbmVar.h;
        this.g = obj4 == null ? new avbl() : obj4;
        this.h = (avbw) avbmVar.i;
    }

    public final String toString() {
        ageu ageuVarAc = ahno.ac(this);
        ageuVarAc.e("defaultPort", 443);
        ageuVarAc.b("proxyDetector", this.a);
        ageuVarAc.b("syncContext", this.b);
        ageuVarAc.b("serviceConfigParser", this.c);
        ageuVarAc.b("customArgs", null);
        ageuVarAc.b("scheduledExecutorService", this.d);
        ageuVarAc.b("channelLogger", this.f);
        ageuVarAc.b("executor", this.e);
        ageuVarAc.b("overrideAuthority", null);
        ageuVarAc.b("metricRecorder", this.g);
        ageuVarAc.b("nameResolverRegistry", this.h);
        return ageuVarAc.toString();
    }
}
