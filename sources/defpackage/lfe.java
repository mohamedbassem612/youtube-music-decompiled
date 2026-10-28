package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lfe implements ServiceConnection, kpq, kpr {
    public volatile boolean a;
    public volatile lcv b;
    public final /* synthetic */ lff c;

    protected lfe(lff lffVar) {
        this.c = lffVar;
    }

    @Override // defpackage.kpq
    public final void a(Bundle bundle) {
        this.c.aU().g();
        synchronized (this) {
            try {
                if (this.b == null) {
                    throw new NullPointerException("null reference");
                }
                this.c.aU().j(new ihq(this, (lco) this.b.C(), 15, (char[]) null));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    @Override // defpackage.kpq
    public final void b(int i) {
        lff lffVar = this.c;
        lffVar.aU().g();
        lffVar.aT().j.a("Service connection suspended");
        lffVar.aU().j(new lei(this, 4, null));
    }

    @Override // defpackage.kpr
    public final void c(klo kloVar) {
        lff lffVar = this.c;
        lffVar.aU().g();
        lcz lczVar = lffVar.t.e;
        if (lczVar == null || !lczVar.r()) {
            lczVar = null;
        }
        if (lczVar != null) {
            lczVar.k.b("Service connection failed", kloVar);
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        this.c.aU().j(new lfa(this, kloVar, 5));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.c.aU().g();
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                this.c.aT().c.a("Service connected with null binder");
                return;
            }
            Object lcmVar = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    lcmVar = iInterfaceQueryLocalInterface instanceof lco ? (lco) iInterfaceQueryLocalInterface : new lcm(iBinder);
                    this.c.aT().k.a("Bound to IMeasurementService interface");
                } else {
                    this.c.aT().c.b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.c.aT().c.a("Service connect failed to get IMeasurementService");
            }
            if (lcmVar == null) {
                this.a = false;
                try {
                    ksp kspVarA = ksp.a();
                    lff lffVar = this.c;
                    kspVarA.b(lffVar.aS(), lffVar.a);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.c.aU().j(new lfa(this, lcmVar, 3));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        lff lffVar = this.c;
        lffVar.aU().g();
        lffVar.aT().j.a("Service disconnected");
        lffVar.aU().j(new lfa(this, componentName, 4));
    }
}
