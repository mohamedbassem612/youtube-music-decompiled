package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ldm implements ServiceConnection {
    public final String a;
    public final /* synthetic */ elq b;

    public ldm(elq elqVar, String str) {
        this.b = elqVar;
        this.a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ldm ldmVar;
        RuntimeException runtimeException;
        jvi jviVar;
        if (iBinder == null) {
            ((ldr) this.b.a).aT().f.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (iInterfaceQueryLocalInterface instanceof jvi) {
                try {
                    jviVar = (jvi) iInterfaceQueryLocalInterface;
                } catch (RuntimeException e) {
                    runtimeException = e;
                    ldmVar = this;
                }
            } else {
                jviVar = new jvi(iBinder);
            }
            jvi jviVar2 = jviVar;
            elq elqVar = this.b;
            if (jviVar2 == null) {
                ((ldr) elqVar.a).aT().f.a("Install Referrer Service implementation was not found");
                return;
            }
            Object obj = elqVar.a;
            ((ldr) obj).aT().k.a("Install Referrer Service connected");
            ldmVar = this;
            try {
                ((ldr) obj).aU().j(new gwb(ldmVar, jviVar2, this, 15, (char[]) null));
                return;
            } catch (RuntimeException e2) {
                e = e2;
            }
        } catch (RuntimeException e3) {
            e = e3;
            ldmVar = this;
        }
        runtimeException = e;
        ((ldr) ldmVar.b.a).aT().f.b("Exception occurred while calling Install Referrer API", runtimeException);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((ldr) this.b.a).aT().k.a("Install Referrer Service disconnected");
    }
}
