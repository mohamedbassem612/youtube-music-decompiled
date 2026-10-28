package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class krq extends kry {
    public static final Parcelable.Creator CREATOR = new kpm(10);
    final int a;
    public final Account b;
    public final int c;
    public final GoogleSignInAccount d;

    public krq(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, this.a);
        ksy.A(parcel, 2, this.b, i);
        ksy.l(parcel, 3, this.c);
        ksy.A(parcel, 4, this.d, i);
        ksy.h(parcel, iG);
    }
}
