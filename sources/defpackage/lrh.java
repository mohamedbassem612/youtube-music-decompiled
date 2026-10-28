package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lrh extends kry {
    public static final Parcelable.Creator CREATOR = new lqu(10);
    String a;
    lra b;
    UserAddress c;
    lrj d;
    String e;
    Bundle f;
    String g;
    Bundle h;

    public lrh(String str, lra lraVar, UserAddress userAddress, lrj lrjVar, String str2, Bundle bundle, String str3, Bundle bundle2) {
        this.a = str;
        this.b = lraVar;
        this.c = userAddress;
        this.d = lrjVar;
        this.e = str2;
        this.f = bundle;
        this.g = str3;
        this.h = bundle2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, this.a);
        ksy.A(parcel, 2, this.b, i);
        ksy.A(parcel, 3, this.c, i);
        ksy.A(parcel, 4, this.d, i);
        ksy.B(parcel, 5, this.e);
        ksy.p(parcel, 6, this.f);
        ksy.B(parcel, 7, this.g);
        ksy.p(parcel, 8, this.h);
        ksy.h(parcel, iG);
    }

    private lrh() {
    }
}
