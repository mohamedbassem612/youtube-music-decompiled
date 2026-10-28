package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lku extends kry {
    public static final Parcelable.Creator CREATOR = new kvu(3);
    public final Uri a;
    public final Uri b;

    public lku(Uri uri, Uri uri2) {
        this.a = uri;
        this.b = uri2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 1, this.a, i);
        ksy.A(parcel, 2, this.b, i);
        ksy.h(parcel, iG);
    }
}
