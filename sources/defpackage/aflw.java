package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aflw extends dzv {
    private static final agrf a = agrf.h("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory");
    private final Map b;
    private final afvq c;
    private final Map d;
    private final agev e;

    public aflw(Map map, afvq afvqVar, Map map2, agev agevVar) {
        this.b = map;
        this.c = afvqVar;
        this.d = map2;
        this.e = agevVar;
    }

    @Override // defpackage.dzv
    public final dze a(Context context, String str, WorkerParameters workerParameters) {
        awmd awmdVar;
        String str2;
        try {
            afvn afvnVarC = this.c.c(129, "WorkerFactory.createWorker()");
            try {
                if (str.equals(TikTokListenableWorker.class.getName())) {
                    agkz agkzVarA = afly.a(workerParameters.c);
                    if (agkzVarA.size() != 1) {
                        ((agrc) ((agrc) a.b()).k("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "createWorker", 88, "TikTokWorkerFactory.java")).w("A TikTok worker was created, but it has %s count tags instead of 1, so it was skipped", new qdq(agkzVarA.size()));
                    } else {
                        str2 = (String) aguu.M(agkzVarA);
                        awmdVar = (awmd) this.b.get(str2);
                    }
                    afvnVarC.close();
                    return null;
                }
                awmdVar = (awmd) this.b.get(str);
                if (awmdVar != null) {
                    Set set = workerParameters.c;
                    Pattern pattern = afly.a;
                    set.add("TikTokWorker#".concat(str));
                }
                str2 = str;
                if (awmdVar == null || str2 == null) {
                    if (str.equals(TikTokListenableWorker.class.getName())) {
                        ((agrc) ((agrc) a.b()).k("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "maybeLogMissingWorkerMessage", 160, "TikTokWorkerFactory.java")).w("A worker with the `permanentTag` %s does not exist in this version of the application. This suggests that an app upgrade removed this worker and now work scheduled before the upgrade can't run. If this is surprising, refer to go/tiktok/dev/androidx/work#deprecating, then reach out to #tiktok on YAQS, or g/tiktok-users if the situation is still unclear.", str2);
                    }
                    afvnVarC.close();
                    return null;
                }
                afuy afuyVar = afux.a;
                try {
                    ((ayq) ((hwf) ((agfa) this.e).a).a).S("TikTokListenableWorker", Collections.singleton(str2));
                } catch (RuntimeException e) {
                    ((agrc) ((agrc) ((agrc) a.c()).j(e)).k("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "createWorker", 137, "TikTokWorkerFactory.java")).t("Failed to get SpanExtras for a TikTokWorker");
                }
                TikTokListenableWorker tikTokListenableWorker = new TikTokListenableWorker(context, this.c, this.d, awmdVar, workerParameters, afuyVar);
                afvnVarC.close();
                return tikTokListenableWorker;
            } catch (Throwable th) {
                try {
                    afvnVarC.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (RuntimeException e2) {
            ((agrc) ((agrc) ((agrc) a.c()).j(e2)).k("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "createWorker", (char) 148, "TikTokWorkerFactory.java")).t("TikTokWorkerFactory failed to instantiate a TikTokWorker");
            return null;
        }
        ((agrc) ((agrc) ((agrc) a.c()).j(e2)).k("com/google/apps/tiktok/contrib/work/impl/TikTokWorkerFactory", "createWorker", (char) 148, "TikTokWorkerFactory.java")).t("TikTokWorkerFactory failed to instantiate a TikTokWorker");
        return null;
    }
}
