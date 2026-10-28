package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class aumu implements ServiceConnection {
    private final /* synthetic */ int $cid;
    final /* synthetic */ Object a;

    public aumu(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        aumo aumoVar = null;
        gdo gdoVar = null;
        if (this.$cid != 0) {
            int i = eov.a;
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                gdoVar = iInterfaceQueryLocalInterface instanceof gdo ? (gdo) iInterfaceQueryLocalInterface : new gdo(iBinder);
            }
            eoa eoaVar = (eoa) this.a;
            eoaVar.q = gdoVar;
            eoaVar.p = 2;
            eoaVar.z(26);
            return;
        }
        auna aunaVar = (auna) this.a;
        if (aunaVar.f == null) {
            aunaVar.f = new Messenger(new aumq(aunaVar));
        }
        aumv aumvVar = new aumv(aunaVar, aunaVar.d, aunaVar.j, aunaVar.f);
        aumo[] aumoVarArr = new aumo[1];
        if (iBinder != null) {
            IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.waze.sdk.ISdkService");
            aumoVar = iInterfaceQueryLocalInterface2 instanceof aumo ? (aumo) iInterfaceQueryLocalInterface2 : new aumo(iBinder);
        }
        aumoVarArr[0] = aumoVar;
        aumvVar.execute(aumoVarArr);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (this.$cid == 0) {
            ((auna) this.a).c();
            return;
        }
        eov.e("BillingClientTesting", "Billing Override Service disconnected.");
        eoa eoaVar = (eoa) this.a;
        eoaVar.q = null;
        eoaVar.p = 0;
    }
}
