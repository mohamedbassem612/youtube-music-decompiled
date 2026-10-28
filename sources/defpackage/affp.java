package defpackage;

import android.os.Bundle;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class affp extends bpi {
    public affv a;
    public boolean b;
    public boolean c;
    public final affo d;

    public affp(boy boyVar, awmd awmdVar) {
        boyVar.getClass();
        final boolean zBooleanValue = ((Boolean) ((agev) ((aupo) awmdVar).b).e(Boolean.FALSE)).booleanValue();
        affo affoVar = new affo();
        this.d = affoVar;
        Bundle bundle = (Bundle) boyVar.a("tiktok_account_controller_saved_instance_state");
        affoVar.a = bundle;
        if (bundle != null) {
            this.c = true;
            MessageLite messageLiteAC = ahng.aC(bundle, "state_latest_operation", affv.a, ExtensionRegistryLite.getGeneratedRegistry());
            messageLiteAC.getClass();
            b((affv) messageLiteAC);
            this.b = bundle.getBoolean("state_pending_op");
        }
        boyVar.b("tiktok_account_controller_saved_instance_state", new dos() { // from class: affn
            @Override // defpackage.dos
            public final Bundle a() {
                Bundle bundle2 = new Bundle();
                affp affpVar = this.a;
                bundle2.putBoolean("state_pending_op", affpVar.b);
                ahng.aG(bundle2, "state_latest_operation", affpVar.a());
                bundle2.putBoolean("tiktok_accounts_disabled", zBooleanValue);
                return bundle2;
            }
        });
    }

    public final affv a() {
        affv affvVar = this.a;
        if (affvVar != null) {
            return affvVar;
        }
        awrc.b("latestOperation");
        return null;
    }

    public final void b(affv affvVar) {
        affvVar.getClass();
        this.a = affvVar;
    }
}
