package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lkt extends kry {
    public static final Parcelable.Creator CREATOR = new kvu(2);
    public final ParcelFileDescriptor a;

    public lkt(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptor = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 1, parcelFileDescriptor, i | 1);
        ksy.h(parcel, iG);
    }
}
