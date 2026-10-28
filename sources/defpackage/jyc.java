package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jyc extends kry {
    public static final Parcelable.Creator CREATOR = new fh(4);
    public final Account a;
    public final String[] b;
    public final Bundle c;

    public jyc(Account account, String[] strArr, Bundle bundle) {
        this.a = account;
        this.b = strArr;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Account account = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 1, account, i);
        String[] strArr = this.b;
        if (strArr != null) {
            int iG2 = ksy.g(parcel, 2);
            parcel.writeStringArray(strArr);
            ksy.h(parcel, iG2);
        }
        Bundle bundle = this.c;
        if (bundle != null) {
            int iG3 = ksy.g(parcel, 3);
            parcel.writeBundle(bundle);
            ksy.h(parcel, iG3);
        }
        ksy.h(parcel, iG);
    }
}
