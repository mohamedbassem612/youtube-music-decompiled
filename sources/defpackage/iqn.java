package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iqn {
    public final aunn d;
    public final Executor e;
    public final Set f = ConcurrentHashMap.newKeySet();
    private static final agrf g = agrf.h("com/google/android/apps/youtube/music/settings/store/MusicPlaybackPrefsStore");
    public static final Duration a = Duration.ofSeconds(1);
    public static final Duration b = Duration.ofSeconds(12);
    public static final Duration c = Duration.ofSeconds(6);

    public iqn(aunn aunnVar, Executor executor) {
        this.d = aunnVar;
        this.e = executor;
    }

    public static /* synthetic */ void e(iqn iqnVar, ailu ailuVar) {
        for (ift iftVar : iqnVar.f) {
            boolean z = ailuVar.e;
            int i = ailuVar.f;
            if (!iftVar.h()) {
                iftVar.g(null, false, iftVar.n.a == ibv.LOOP_ONE);
            }
        }
    }

    public final ListenableFuture a() {
        ListenableFuture listenableFutureI = ((ayq) this.d.io()).i();
        hys hysVar = new hys(8);
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), hysVar);
        int i = ahcs.c;
        Executor executor = this.e;
        ahcr ahcrVar = new ahcr(listenableFutureI, afwiVar);
        listenableFutureI.addListener(ahcrVar, MoreExecutors.c(executor, ahcrVar));
        return ahcrVar;
    }

    public final ListenableFuture b() {
        ListenableFuture listenableFutureI = ((ayq) this.d.io()).i();
        hys hysVar = new hys(7);
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), hysVar);
        int i = ahcs.c;
        Executor executor = this.e;
        ahcr ahcrVar = new ahcr(listenableFutureI, afwiVar);
        listenableFutureI.addListener(ahcrVar, MoreExecutors.c(executor, ahcrVar));
        return ahcrVar;
    }
}
