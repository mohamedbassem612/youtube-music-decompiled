package defpackage;

import android.os.Bundle;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afhh extends bpi {
    public afhg a;
    public boolean b;
    public final boolean c;

    public afhh(boy boyVar) {
        boyVar.getClass();
        afhg afheVar = afhf.a;
        this.a = afheVar;
        qpj.c();
        Bundle bundle = (Bundle) boyVar.a("tiktok_activity_account_state_saved_instance_state");
        if (bundle != null) {
            this.c = true;
            Bundle bundle2 = bundle.getBundle("state_account_state_bundle");
            if (bundle2 == null) {
                throw new IllegalStateException("Failed to get the CurrentViewModel.State bundle from saved state");
            }
            int i = bundle2.getInt("state_account_state_type", 0);
            if (i != 0) {
                if (i == 1) {
                    afheVar = afhd.a;
                } else if (i == 2) {
                    int i2 = bundle2.getInt("state_account_id", -1);
                    MessageLite messageLiteAA = ahng.aA(bundle2, "state_account_info", afhq.a, ExtensionRegistryLite.getGeneratedRegistry());
                    messageLiteAA.getClass();
                    afheVar = new afhe(i2, (afhq) messageLiteAA);
                } else {
                    if (i != 3) {
                        throw new IllegalStateException(a.bP(i, "unknown type value ", " during unparcelling"));
                    }
                    afheVar = afhc.a;
                }
            }
            this.a = afheVar;
            this.b = bundle.getBoolean("tiktok_accounts_disabled");
        } else {
            this.c = false;
        }
        boyVar.b("tiktok_activity_account_state_saved_instance_state", new cn(this, 5));
    }
}
