package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wgb {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/innertube/model/SafetyMode");
    private final hed b;

    public wgb(hed hedVar) {
        this.b = hedVar;
    }

    public final ListenableFuture a() {
        ListenableFuture listenableFutureA = this.b.A();
        qmd qmdVar = new qmd(13);
        Executor executorDirectExecutor = MoreExecutors.directExecutor();
        long j = afwl.a;
        afwi afwiVar = new afwi(afty.c(false), qmdVar);
        int i = ahbz.d;
        ahby ahbyVar = new ahby(listenableFutureA, Exception.class, afwiVar);
        listenableFutureA.addListener(ahbyVar, MoreExecutors.c(executorDirectExecutor, ahbyVar));
        return ahng.o(ahbyVar);
    }

    public final boolean b() {
        try {
            return ((Boolean) a().get(1L, TimeUnit.SECONDS)).booleanValue();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        } catch (ExecutionException e) {
            e = e;
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/innertube/model/SafetyMode", "isEnabled", '6', "SafetyMode.java")).t("Failed to read safemode");
            return false;
        } catch (TimeoutException e2) {
            e = e2;
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/innertube/model/SafetyMode", "isEnabled", '6', "SafetyMode.java")).t("Failed to read safemode");
            return false;
        }
    }
}
