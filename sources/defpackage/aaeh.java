package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class aaeh implements aaei {
    private final tws a;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
    }

    public aaeh(tws twsVar) {
        twsVar.getClass();
        this.a = twsVar;
    }

    @Override // defpackage.aaei
    public final int a() {
        return this.a.a("offline_resync_continuation_deferred_service_threshold_seconds", 5);
    }

    @Override // defpackage.aaei
    public final boolean b() {
        tws twsVar = this.a;
        twsVar.d("attempt_offline_resync_on_expired_continuation");
        return lsx.b(twsVar.a, twsVar.b("attempt_offline_resync_on_expired_continuation"), true);
    }
}
