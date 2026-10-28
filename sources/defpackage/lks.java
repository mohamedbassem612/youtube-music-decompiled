package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lks extends kry {
    public static final Parcelable.Creator CREATOR = new kvu(1);
    public final Uri a;
    public final int b;

    public lks(Uri uri, int i) {
        this.a = uri;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 1, this.a, i);
        ksy.l(parcel, 2, this.b);
        ksy.h(parcel, iG);
    }
}
