package defpackage;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aeql {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/systemhealth/feedback/FeedbackDataTracker");
    public final awmd b;
    public final aerv c;
    private final Executor d;
    private final ahex e;

    public aeql(awmd awmdVar, Executor executor, ahex ahexVar, aerv aervVar) {
        this.b = awmdVar;
        this.d = executor;
        this.e = ahexVar;
        this.c = aervVar;
    }

    public final ListenableFuture a() {
        Bundle bundle = new Bundle();
        Iterator it = ((Set) this.b.io()).iterator();
        while (it.hasNext()) {
            try {
                ((wfv) it.next()).c(bundle);
            } catch (RuntimeException e) {
                ((agrc) ((agrc) ((agrc) a.b()).j(e)).k("com/google/android/libraries/youtube/systemhealth/feedback/FeedbackDataTracker", "fillSynchronousFeedbackData", 'd', "FeedbackDataTracker.java")).t("Failed to fill synchronous feedback data.");
            }
        }
        ListenableFuture listenableFutureAp = ahno.ap(new aalq(this, bundle, 16, null), this.e);
        aeqk aeqkVar = new aeqk(bundle, 1);
        Executor executor = this.d;
        return ahno.ar(ahno.am(listenableFutureAp, Exception.class, aeqkVar, executor), new aeqk(this, 0), executor);
    }
}
