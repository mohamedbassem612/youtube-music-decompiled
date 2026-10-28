package com.google.android.libraries.youtube.offline.transfer.service;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.aanl;
import defpackage.aate;
import defpackage.aauk;
import defpackage.agrc;
import defpackage.agrf;
import defpackage.awmd;
import defpackage.ght;
import defpackage.isi;
import defpackage.rnj;
import defpackage.teb;
import defpackage.tym;
import defpackage.vxz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class OfflineKeepAliveService extends Service {
    private static final agrf f = agrf.h("com/google/android/libraries/youtube/offline/transfer/service/OfflineKeepAliveService");
    public awmd a;
    public aauk b;
    public awmd c;
    public vxz d;
    public isi e;

    private final void a() {
        Notification notificationB;
        if (getApplicationInfo().targetSdkVersion < 26 || (notificationB = ((aanl) this.a.io()).b()) == null) {
            return;
        }
        try {
            startForeground(17, notificationB);
            this.e.N(null, 17, notificationB);
        } catch (RuntimeException e) {
            ((agrc) ((agrc) ((agrc) f.b()).j(e)).k("com/google/android/libraries/youtube/offline/transfer/service/OfflineKeepAliveService", "startForegroundIfApplicable", 'z', "OfflineKeepAliveService.java")).t("[Offline] OfflineKeepAliveService: Cannot start foreground notification.");
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        ght ghtVar = (ght) ((aate) aate.class.cast(tym.N(getApplication()))).fB().a;
        this.a = ghtVar.rE;
        this.e = (isi) ghtVar.ru.io();
        this.d = (vxz) ghtVar.cN.io();
        this.b = (aauk) ghtVar.iL.io();
        this.c = ghtVar.so;
        super.onCreate();
        a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        if (this.b.k()) {
            ((rnj) this.c.io()).j(teb.b);
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        a();
        return 1;
    }

    public final void onTimeout(int i, int i2) {
        super.onTimeout(i, i2);
        if (this.d.l(195, 45740256L, false)) {
            ((agrc) ((agrc) f.c()).k("com/google/android/libraries/youtube/offline/transfer/service/OfflineKeepAliveService", "onTimeout", 81, "OfflineKeepAliveService.java")).t("[Offline] OfflineKeepAliveService: Foreground service timed out! Stopping service...");
            stopSelf();
        }
    }
}
