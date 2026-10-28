package defpackage;

import com.google.android.libraries.elements.interfaces.CachePurgeReason;
import com.google.android.libraries.elements.interfaces.CacheStrategyDelegate;
import com.google.common.util.concurrent.MoreExecutors;
import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class adap extends CacheStrategyDelegate {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/rendering/elements/YouTubeCacheStrategyDelegate");
    private final nuc b;
    private final aunn c;
    private final aunn d;
    private final aunn e;

    public adap(nuc nucVar, aunn aunnVar, aunn aunnVar2, aunn aunnVar3) {
        this.b = nucVar;
        this.c = aunnVar;
        this.d = aunnVar2;
        this.e = aunnVar3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, tqj] */
    /* JADX WARN: Type inference failed for: r5v6, types: [agfr, java.lang.Object] */
    private final void a(boolean z) {
        aczd aczdVar = (aczd) this.e.io();
        if (aczd.f(aczdVar.h)) {
            synchronized (aczdVar.a) {
                if (z) {
                    aczdVar.c = true;
                }
                aczdVar.b = false;
                ((AtomicReference) aczdVar.e).set(new agfu(ahng.n(null)));
                ((aczl) aczdVar.i.io()).d();
            }
        } else {
            ((AtomicReference) aczdVar.d).set(null);
        }
        b();
    }

    private final void b() {
        ahng.x(((tpq) this.c.io()).b(new abzr(19)), afwl.g(new adao(0)), MoreExecutors.directExecutor());
    }

    @Override // com.google.android.libraries.elements.interfaces.CacheStrategyDelegate
    public final Status onCacheFull(long j, long j2) {
        a(true);
        boolean zK = ((vxz) this.d.io()).k(45790234L, false);
        nuc nucVar = this.b;
        if (zK) {
            nucVar.c(aslh.LOG_TYPE_RESOURCE_WARNING, nsl.a, "ELMCache: SRS cache is full.\nCurrent cache size: %s\nCache cap: %s", Long.valueOf(j), Long.valueOf(j2));
        } else {
            nucVar.c(aslh.LOG_TYPE_INTERNAL_DEBUG_WARNING, nsl.a, "ELMCache: SRS cache is full.\nCurrent cache size: %s\nCache cap: %s", Long.valueOf(j), Long.valueOf(j2));
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.CacheStrategyDelegate
    public final Status onCacheInvalid(String str) {
        a(true);
        boolean zK = ((vxz) this.d.io()).k(45790234L, false);
        nuc nucVar = this.b;
        if (zK) {
            nucVar.c(aslh.LOG_TYPE_RESOURCE_WARNING, nsl.a, "ELMCache: SRS cache is invalid. Error details: %s", str);
        } else {
            nucVar.c(aslh.LOG_TYPE_INTERNAL_DEBUG_WARNING, nsl.a, "ELMCache: SRS cache is invalid. Error details: %s", str);
        }
        return Status.OK;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [agfr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, nuc] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, tqj] */
    @Override // com.google.android.libraries.elements.interfaces.CacheStrategyDelegate
    public final Status onCachePurged(CachePurgeReason cachePurgeReason) {
        String str;
        aczd aczdVar = (aczd) this.e.io();
        if (aczd.f(aczdVar.h)) {
            synchronized (aczdVar.a) {
                aczdVar.b = false;
                ((AtomicReference) aczdVar.e).set(new agfu(ahng.n(null)));
                aczl aczlVar = (aczl) aczdVar.i.io();
                cachePurgeReason.getClass();
                boolean andSet = ((AtomicBoolean) aczlVar.g).getAndSet(false);
                aczlVar.d();
                if (andSet) {
                    ?? r0 = aczlVar.b;
                    aihf aihfVarCreateBuilder = asnc.a.createBuilder();
                    aihfVarCreateBuilder.getClass();
                    atqn.f(aslh.LOG_TYPE_INTERNAL_RESOURCE_ERROR, aihfVarCreateBuilder);
                    r0.b(atqn.e(aihfVarCreateBuilder), "ELMCache: DiskCache ServingContext was served before native cache purge: %s", cachePurgeReason.name());
                }
            }
        } else {
            ((AtomicReference) aczdVar.d).set(null);
        }
        b();
        CachePurgeReason cachePurgeReason2 = CachePurgeReason.MISSING_BYTES;
        int iOrdinal = cachePurgeReason.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
            if (iOrdinal != 3) {
                str = iOrdinal != 4 ? "Unknown" : "Cache is invalid.";
            }
            boolean zK = ((vxz) this.d.io()).k(45790234L, false);
            nuc nucVar = this.b;
            if (zK) {
                nucVar.c(aslh.LOG_TYPE_RESOURCE_WARNING, nsl.a, "ELMCache: SRS cache is purged due to error: %s", str);
            } else {
                nucVar.c(aslh.LOG_TYPE_INTERNAL_DEBUG_WARNING, nsl.a, "ELMCache: SRS cache is purged due to error: %s", str);
            }
            return Status.OK;
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.CacheStrategyDelegate
    public final Status onErrorReadingResource(String str) {
        a(false);
        boolean zK = ((vxz) this.d.io()).k(45790234L, false);
        nuc nucVar = this.b;
        if (zK) {
            nucVar.c(aslh.LOG_TYPE_RESOURCE_WARNING, nsl.a, "ELMCache: Error reading resource: %s", str);
        } else {
            nucVar.c(aslh.LOG_TYPE_INTERNAL_DEBUG_WARNING, nsl.a, "ELMCache: Error reading resource: %s", str);
        }
        return Status.OK;
    }
}
