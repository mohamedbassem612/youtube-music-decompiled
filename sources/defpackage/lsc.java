package defpackage;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class lsc extends lrq {
    public lsc(Context context) {
        super(context, "com.google.android.gms.wallet.firstparty.ACTION_ADD_INSTRUMENT", "flow_im", true);
    }

    @Override // defpackage.lrq
    protected final void f() {
        Intent intent = this.a;
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
        boolean z = true;
        boolean z2 = byteArrayExtra != null && byteArrayExtra.length > 0;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        boolean z3 = byteArrayExtra2 != null && byteArrayExtra2.length > 0;
        if (!z2 && !z3) {
            z = false;
        }
        kro.d(z, "Either Instrument Manager params or initialization token is required");
    }
}
