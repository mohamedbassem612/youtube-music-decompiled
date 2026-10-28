package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lkh extends kry {
    public static final Parcelable.Creator CREATOR = new kvs(20);
    public final Uri a;

    public lkh(Uri uri) {
        this.a = uri;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 1, this.a, i);
        ksy.h(parcel, iG);
    }
}
