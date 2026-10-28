package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kco extends Service {
    private kcf a;

    static {
        new khn("ReconnectionService", (String) null);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        kcf kcfVar = this.a;
        if (kcfVar == null) {
            return null;
        }
        try {
            return kcfVar.b(intent);
        } catch (RemoteException unused) {
            khn.e();
            return null;
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        kuo kuoVarB;
        kuo kuoVarA;
        kbk kbkVarG = kbk.g(this);
        kcf kcfVarB = null;
        try {
            kuoVarB = kbkVarG.d().b.b();
        } catch (RemoteException unused) {
            khn.e();
            kuoVarB = null;
        }
        kro.f("Must be called from the main thread.");
        try {
            kuoVarA = kbkVarG.e.a.a();
        } catch (RemoteException unused2) {
            khn.e();
            kuoVarA = null;
        }
        int i = kdm.a;
        if (kuoVarB != null && kuoVarA != null) {
            try {
                kcfVarB = kdm.a(getApplicationContext()).b(new kun(this), kuoVarB, kuoVarA);
            } catch (RemoteException | kcl unused3) {
                khn.e();
            }
        }
        this.a = kcfVarB;
        if (kcfVarB != null) {
            try {
                kcfVarB.g();
            } catch (RemoteException unused4) {
                khn.e();
            }
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        kcf kcfVar = this.a;
        if (kcfVar != null) {
            try {
                kcfVar.h();
            } catch (RemoteException unused) {
                khn.e();
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        kcf kcfVar = this.a;
        if (kcfVar == null) {
            return 2;
        }
        try {
            return kcfVar.a(intent, i, i2);
        } catch (RemoteException unused) {
            khn.e();
            return 2;
        }
    }
}
