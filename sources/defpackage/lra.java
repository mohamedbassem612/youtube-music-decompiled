package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lra extends kry {
    public static final Parcelable.Creator CREATOR = new lqu(4);
    String a;
    String b;
    String c;
    int d;
    UserAddress e;

    public lra(String str, String str2, String str3, int i, UserAddress userAddress) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = userAddress;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, this.a);
        ksy.B(parcel, 2, this.b);
        ksy.B(parcel, 3, this.c);
        ksy.l(parcel, 4, this.d);
        ksy.A(parcel, 5, this.e, i);
        ksy.h(parcel, iG);
    }

    private lra() {
    }
}
