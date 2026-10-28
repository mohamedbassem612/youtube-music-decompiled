package defpackage;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class lsa extends lrq {
    public lsa(Context context) {
        super(context, "com.google.android.gms.wallet.ACTION_CHECKOUT", "flow_checkout", false);
    }

    @Override // defpackage.lrq
    protected final void f() {
        Intent intent = this.a;
        boolean z = true;
        if (intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS") == null && intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN") == null) {
            z = false;
        }
        kro.d(z, "Either buyflow params or initialization token is required");
    }
}
