package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.wallet.firstparty.pm.SecurePaymentsPayload;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class lse extends lrq {
    public lse(Context context) {
        super(context, "com.google.android.gms.wallet.firstparty.ACTION_PURCHASE_MANAGER", "flow_pm", true);
    }

    @Override // defpackage.lrq
    protected final void f() {
        Intent intent = this.a;
        SecurePaymentsPayload securePaymentsPayload = (SecurePaymentsPayload) intent.getParcelableExtra("com.google.android.gms.wallet.firstparty.SECURE_PAYMENTS_PAYLOAD");
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_PARAMS");
        boolean z = byteArrayExtra != null && byteArrayExtra.length > 0;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("com.google.android.gms.wallet.firstparty.EXTRA_UNENCRYPTED_PARAMS");
        boolean z2 = byteArrayExtra2 != null && byteArrayExtra2.length > 0;
        kro.d(securePaymentsPayload != null || z || z2, "One of SecurePaymentsPayload, encrypted parameters, or unencrypted parameters required");
        if (securePaymentsPayload != null) {
            byte[] bArr = securePaymentsPayload.a;
            kro.d((bArr == null || bArr.length == 0) ? false : true, "SecurePaymentsPayload requires an opaque token");
            kro.d((z || z2) ? false : true, "Can't have both SecurePaymentsPayload and either encrypted or unencrypted parameters");
        }
    }
}
