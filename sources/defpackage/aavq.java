package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class aavq implements ServiceConnection {
    final /* synthetic */ aavr a;

    public aavq(aavr aavrVar) {
        this.a = aavrVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        aavr aavrVar = this.a;
        if (!aavrVar.i) {
            zvp.a(zvn.a, zvm.k, "onServiceConnected called for player service, but the service shouldn't be started.");
            return;
        }
        if (aavrVar.c.d()) {
            if (!aavrVar.b.h) {
                if (aavrVar.j) {
                    aavrVar.b();
                }
            } else {
                if (aavrVar.d.aa()) {
                    return;
                }
                aavrVar.g();
                ((abrt) aavrVar.h.io()).i(true);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        abmx.b(abmw.BACKGROUND, "%s: onServiceDisconnected(%s)", "BackgroundTransitioner", componentName);
        aavr aavrVar = this.a;
        ((abrt) aavrVar.h.io()).d(true);
        aavrVar.i();
    }
}
