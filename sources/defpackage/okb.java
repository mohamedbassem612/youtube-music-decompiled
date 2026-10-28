package defpackage;

import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class okb extends aunp {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        throw null;
    }

    public final void onTimeout(int i, int i2) {
        onb.i("%s: onTimeout: %s", "MDD Foreground Download Service", Integer.valueOf(i2));
        super.onTimeout(i, i2);
        stopForeground(true);
        stopSelf(i);
    }
}
