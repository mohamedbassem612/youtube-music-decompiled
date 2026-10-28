package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaqo {
    static final long a;
    private static final agrf b = agrf.h("com/google/android/libraries/youtube/offline/store/OfflineTransferStorageSpaceObserver");
    private final Context c;
    private final ScheduledExecutorService d;
    private ScheduledFuture e;
    private long f = Long.MAX_VALUE;
    private final abxv g;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        a = 60000L;
    }

    public aaqo(Context context, tbt tbtVar, ScheduledExecutorService scheduledExecutorService, abxv abxvVar) {
        this.c = context;
        this.d = scheduledExecutorService;
        this.g = abxvVar;
        tbtVar.f(this);
    }

    private final synchronized void d(Class cls) {
        this.e = this.d.schedule(new aadw(this, cls, 3, (char[]) null), a, TimeUnit.MILLISECONDS);
    }

    final synchronized void a() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.e = null;
        }
        this.f = Long.MAX_VALUE;
    }

    public final synchronized void b(Class cls) {
        if (this.g.b() < this.f) {
            d(cls);
            return;
        }
        Context context = this.c;
        aauq.a(context, new Intent(context, (Class<?>) cls).setAction("com.google.android.libraries.youtube.offline.transfer.service.ActionWakeup"));
        this.f = Long.MAX_VALUE;
    }

    public final synchronized void c(String str, long j) {
        try {
            Class<?> cls = Class.forName(str);
            ScheduledFuture scheduledFuture = this.e;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                d(cls);
            }
            if (this.f > j) {
                this.f = j;
            }
        } catch (ClassNotFoundException e) {
            ((agrc) ((agrc) ((agrc) b.b()).j(e)).k("com/google/android/libraries/youtube/offline/store/OfflineTransferStorageSpaceObserver", "startWatching", 'Y', "OfflineTransferStorageSpaceObserver.java")).t("Failed to resolve transfer service.");
        }
    }

    @tcc
    protected void handleSdCardMountChangedEvent(tqb tqbVar) {
        a();
    }

    @tcc
    protected void handleSignOutEvent(zwu zwuVar) {
        a();
    }
}
