package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class wfu {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/innertube/experiment/ClientSideExperimentController");
    private final awmd b;
    private final Map c;

    public wfu(awmd awmdVar, Map map) {
        this.b = awmdVar;
        this.c = map;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [awmd, java.lang.Object] */
    public final List a() {
        ArrayList arrayList = new ArrayList();
        try {
            ListenableFuture listenableFutureC = ((qrx) ((hed) this.b.io()).c.io()).c();
            wvk wvkVar = new wvk(0);
            Executor executorDirectExecutor = MoreExecutors.directExecutor();
            int i = ahcs.c;
            ahcr ahcrVar = new ahcr(listenableFutureC, wvkVar);
            listenableFutureC.addListener(ahcrVar, MoreExecutors.c(executorDirectExecutor, ahcrVar));
            Map map = (Map) a.i(ahcrVar);
            agqr it = ((agpl) ((agpn) this.c).keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                int iIntValue = map.containsKey(str) ? ((Integer) map.get(str)).intValue() : -1;
                if (iIntValue != 0 && iIntValue != -1) {
                    arrayList.add(Integer.valueOf(iIntValue));
                }
            }
        } catch (ExecutionException e) {
            ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/innertube/experiment/ClientSideExperimentController", "enabledClientSideExperiments", '^', "ClientSideExperimentController.java")).t("Failed to read the client side experiments map from the disk");
        }
        return arrayList;
    }
}
