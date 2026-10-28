package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lsl extends lrm {
    final /* synthetic */ lrt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsl(knc kncVar, lrt lrtVar) {
        super(kncVar);
        this.a = lrtVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ kni a(Status status) {
        return new lrv(status, new lru(new byte[0]));
    }

    @Override // defpackage.lrm, defpackage.kny
    protected final /* bridge */ /* synthetic */ void b(kmp kmpVar) {
        lsk lskVar = (lsk) kmpVar;
        lsj lsjVar = new lsj(this);
        int i = lskVar.b;
        String packageName = lskVar.a.getPackageName();
        String str = lskVar.c;
        int i2 = lskVar.d;
        boolean z = lskVar.e;
        String str2 = lskVar.f;
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", z);
        bundle.putString("androidPackageName", packageName);
        boolean zIsEmpty = TextUtils.isEmpty(str);
        lrt lrtVar = this.a;
        if (!zIsEmpty) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", i2);
        bundle.putString("com.google.android.gms.wallet.EXTRA_WALLET_CLIENT_ID", str2);
        try {
            lsh lshVar = (lsh) lskVar.C();
            Parcel parcelC = lshVar.c();
            gdc.c(parcelC, lrtVar);
            gdc.c(parcelC, bundle);
            gdc.e(parcelC, lsjVar);
            lshVar.f(15, parcelC);
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException getting client token", e);
            lsjVar.b(Status.c, new lru(new byte[0]));
        }
    }
}
