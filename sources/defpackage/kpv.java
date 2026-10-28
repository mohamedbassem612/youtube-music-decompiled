package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kpv implements ServiceConnection {
    final /* synthetic */ kpz a;
    private final int b;
    private final boolean c;

    public kpv(kpz kpzVar, int i, boolean z) {
        this.a = kpzVar;
        this.b = i;
        this.c = z;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        kpz kpzVar = this.a;
        if (iBinder == null) {
            int i2 = this.b;
            if (this.c) {
                kpzVar.D = i2;
                i = 5;
            } else {
                i = 4;
            }
            Handler handler = kpzVar.r;
            handler.sendMessage(handler.obtainMessage(i, i2, 16));
            return;
        }
        synchronized (kpzVar.s) {
            int i3 = this.b;
            if (i3 == kpzVar.C.get()) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                kpzVar.E = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof krg)) ? new krg(iBinder) : (krg) iInterfaceQueryLocalInterface;
                kpzVar.I(0, null, i3);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        kpz kpzVar = this.a;
        synchronized (kpzVar.s) {
            kpzVar.E = null;
        }
        kpz kpzVar2 = this.a;
        int i = this.b;
        Handler handler = kpzVar2.r;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
