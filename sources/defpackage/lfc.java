package defpackage;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lfc implements Runnable {
    final /* synthetic */ lbg a;
    final /* synthetic */ boolean b;
    final /* synthetic */ lcc c;
    final /* synthetic */ Bundle d;
    final /* synthetic */ lff e;

    public lfc(lff lffVar, lbg lbgVar, boolean z, lcc lccVar, Bundle bundle) {
        this.a = lbgVar;
        this.b = z;
        this.c = lccVar;
        this.d = bundle;
        this.e = lffVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lff lffVar = this.e;
        lco lcoVar = lffVar.b;
        if (lcoVar == null) {
            lffVar.aT().c.a("Failed to send default event parameters to service");
            return;
        }
        if (lffVar.G().F(null, lcl.aO)) {
            lffVar.D(lcoVar, this.b ? null : this.c, this.a);
            return;
        }
        try {
            lcoVar.u(this.d, this.a);
            lffVar.A();
        } catch (RemoteException e) {
            this.e.aT().c.b("Failed to send default event parameters to service", e);
        }
    }
}
