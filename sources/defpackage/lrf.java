package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lrf extends kry {
    public static final Parcelable.Creator CREATOR = new lqu(8);
    public final int a;
    final String b;
    final CommonWalletObject c;

    public lrf(int i, String str, String str2, CommonWalletObject commonWalletObject) {
        this.a = i;
        this.b = str2;
        if (i >= 3) {
            this.c = commonWalletObject;
            return;
        }
        CommonWalletObject commonWalletObject2 = new CommonWalletObject();
        commonWalletObject2.a = str;
        this.c = commonWalletObject2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, i2);
        ksy.B(parcel, 3, this.b);
        ksy.A(parcel, 4, this.c, i);
        ksy.h(parcel, iG);
    }
}
