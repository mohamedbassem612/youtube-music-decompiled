package defpackage;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kyo {
    public static final ScheduledThreadPoolExecutor a;

    static {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new kyn(new kyp(0), 0));
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        a = scheduledThreadPoolExecutor;
    }
}
