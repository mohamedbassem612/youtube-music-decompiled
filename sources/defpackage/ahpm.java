package defpackage;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ahpm implements ahrs {
    private final /* synthetic */ int $cid;

    @Override // defpackage.ahrs
    public final Object a() {
        int i = this.$cid;
        if (i == 0) {
            StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
            builderDetectNetwork.detectResourceMismatches();
            builderDetectNetwork.detectUnbufferedIo();
            return new ahpj(Executors.newFixedThreadPool(4, new ahpg("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.a());
        }
        if (i == 1) {
            return Collections.EMPTY_SET;
        }
        if (i == 2) {
            return new ahpj(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new ahpg("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.a());
        }
        if (i == 3) {
            return new ahpj(Executors.newCachedThreadPool(new ahpg("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.a());
        }
        if (i == 4) {
            return Executors.newSingleThreadScheduledExecutor(new ahpg("Firebase Scheduler", 0, null));
        }
        ahrs ahrsVar = FirebaseMessaging.a;
        return null;
    }
}
