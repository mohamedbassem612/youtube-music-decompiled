package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jxm extends kry {
    public static final Parcelable.Creator CREATOR = new jwx(10);
    final int a;
    public int b;

    @Deprecated
    public String c;
    Account d;

    public jxm(int i, int i2, String str, Account account) {
        this.a = i;
        this.b = i2;
        this.c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.d = account;
        } else {
            this.d = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, this.a);
        ksy.l(parcel, 2, this.b);
        ksy.B(parcel, 3, this.c);
        ksy.A(parcel, 4, this.d, i);
        ksy.h(parcel, iG);
    }

    public jxm() {
        this.a = 1;
    }
}
