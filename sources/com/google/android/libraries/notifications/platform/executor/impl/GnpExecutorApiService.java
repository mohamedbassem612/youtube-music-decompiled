package com.google.android.libraries.notifications.platform.executor.impl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import defpackage.agsj;
import defpackage.agsn;
import defpackage.lez;
import defpackage.pnv;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class GnpExecutorApiService extends Service {
    public static final agsn a = agsn.h("GnpSdk");
    public static final Queue b = new ArrayDeque();
    public int c;
    private ExecutorService d;

    public final void a() {
        if (b.isEmpty() && this.c == 0) {
            stopSelf();
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            this.d = pnv.a(this).dF();
        } catch (IllegalStateException e) {
            ((agsj) ((agsj) ((agsj) a.c()).j(e)).k("com/google/android/libraries/notifications/platform/executor/impl/GnpExecutorApiService", "onCreate", 57, "GnpExecutorApiService.java")).t("No Gnp component; GnpExecutorApiService will ignore tasks");
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (this.d == null || intent == null || !"ACTION_NEW_TASK".equals(intent.getAction())) {
            a();
            return 2;
        }
        Queue queue = b;
        if (queue.isEmpty()) {
            return 2;
        }
        PowerManager powerManager = (PowerManager) getSystemService("power");
        this.c++;
        Runnable runnable = (Runnable) queue.remove();
        this.d.execute(new lez((Object) this, (Object) powerManager.newWakeLock(1, runnable.getClass().getSimpleName()), (Object) runnable, 15, (byte[]) null));
        return 2;
    }
}
