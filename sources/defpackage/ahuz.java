package defpackage;

import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahuz {
    public static final long a;
    public final URI b;
    public final Executor c;
    public final Executor d;
    public final ScheduledExecutorService e;
    public final agfr f;
    public final long g;
    public final int h;
    public final ahva i;
    private final Context j;
    private final Executor k;
    private final long l;
    private final long m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = 20000L;
    }

    public ahuz(Context context, URI uri, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, agfr agfrVar, long j, int i, long j2, long j3, ahva ahvaVar) {
        this.j = context;
        this.b = uri;
        this.k = executor;
        this.c = executor2;
        this.d = executor3;
        this.e = scheduledExecutorService;
        this.f = agfrVar;
        this.g = j;
        this.h = 4194304;
        this.l = Long.MAX_VALUE;
        this.m = j3;
        this.i = ahvaVar;
    }

    public final boolean equals(Object obj) {
        ScheduledExecutorService scheduledExecutorService;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahuz) {
            ahuz ahuzVar = (ahuz) obj;
            if (this.j.equals(ahuzVar.j) && this.b.equals(ahuzVar.b) && this.k.equals(ahuzVar.k) && this.c.equals(ahuzVar.c) && this.d.equals(ahuzVar.d) && ((scheduledExecutorService = this.e) != null ? scheduledExecutorService.equals(ahuzVar.e) : ahuzVar.e == null) && this.f.equals(ahuzVar.f) && this.g == ahuzVar.g && this.h == ahuzVar.h && this.l == ahuzVar.l && this.m == ahuzVar.m && this.i.equals(ahuzVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.j.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        ScheduledExecutorService scheduledExecutorService = this.e;
        int iHashCode2 = (((iHashCode * 1000003) ^ (scheduledExecutorService == null ? 0 : scheduledExecutorService.hashCode())) * (-721379959)) ^ this.f.hashCode();
        long j = this.g;
        int i = ((((iHashCode2 * 1525764945) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.h) * 1000003;
        long j2 = this.l;
        int i2 = (i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        long j3 = this.m;
        return ((i2 ^ ((int) ((j3 >>> 32) ^ j3))) * (-721379959)) ^ this.i.hashCode();
    }

    public final String toString() {
        ahva ahvaVar = this.i;
        agfr agfrVar = this.f;
        ScheduledExecutorService scheduledExecutorService = this.e;
        Executor executor = this.d;
        Executor executor2 = this.c;
        Executor executor3 = this.k;
        URI uri = this.b;
        return "TransportConfig{applicationContext=" + String.valueOf(this.j) + ", uri=" + String.valueOf(uri) + ", backgroundExecutor=" + String.valueOf(executor3) + ", blockingExecutor=" + String.valueOf(executor2) + ", lightweightExecutor=" + String.valueOf(executor) + ", lightweightScheduledExecutorService=" + String.valueOf(scheduledExecutorService) + ", userAgentOverride=null, recordNetworkMetricsToPrimes=" + String.valueOf(agfrVar) + ", grpcServiceConfig=null, trafficStatsUid=null, trafficStatsTag=null, grpcIdleTimeoutMillis=" + this.g + ", maxMessageSize=" + this.h + ", grpcKeepAliveTimeMillis=" + this.l + ", grpcKeepAliveTimeoutMillis=" + this.m + ", channelCredentials=null, streamzWrapper=" + String.valueOf(ahvaVar) + '}';
    }

    public ahuz() {
        throw null;
    }
}
