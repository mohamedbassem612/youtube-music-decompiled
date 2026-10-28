package defpackage;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class lsb extends lrq {
    public lsb(Context context) {
        super(context, "com.google.android.gms.wallet.firstparty.ACTION_FIX_INSTRUMENT", "flow_fix_instrument", true);
    }

    @Override // defpackage.lrq
    protected final void f() {
        Intent intent = this.a;
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_INITIALIZE_TOKEN");
        boolean z = true;
        boolean z2 = byteArrayExtra != null && byteArrayExtra.length > 0;
        boolean z3 = byteArrayExtra2 != null && byteArrayExtra2.length > 0;
        kro.d((z2 && z3) ? false : true, "Only one of encrypted parameters or initialization token should be set");
        if (!z2 && !z3) {
            z = false;
        }
        kro.d(z, "Either encrypted parameters or initialization token should be set");
    }
}
