package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kqz implements ServiceConnection, krb {
    private final ServiceConnection a;

    public kqz(ServiceConnection serviceConnection) {
        this.a = serviceConnection;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.onServiceConnected(componentName, iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.onServiceDisconnected(componentName);
    }
}
