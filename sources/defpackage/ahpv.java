package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahpv extends kry {
    public static final Parcelable.Creator CREATOR = new ahpw(0);
    public final String a;
    public final String b;
    public final int c;
    public long d;
    public final Uri e;
    private final Bundle f;

    public ahpv(String str, String str2, int i, long j, Bundle bundle, Uri uri) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.f = bundle;
        this.e = uri;
    }

    public final Bundle a() {
        Bundle bundle = this.f;
        return bundle == null ? new Bundle() : bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, this.a);
        ksy.B(parcel, 2, this.b);
        ksy.l(parcel, 3, this.c);
        ksy.m(parcel, 4, this.d);
        ksy.p(parcel, 5, a());
        ksy.A(parcel, 6, this.e, i);
        ksy.h(parcel, iG);
    }
}
