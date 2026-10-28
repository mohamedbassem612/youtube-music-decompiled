package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kti implements Parcelable {
    public static final Parcelable.Creator CREATOR = new kpm(13);
    public final ParcelFileDescriptor a;
    public final Parcelable b;

    public kti(ParcelFileDescriptor parcelFileDescriptor, Parcelable parcelable) {
        this.a = parcelFileDescriptor;
        this.b = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        Parcelable parcelable = this.b;
        return (this.a != null ? 1 : 0) | (parcelable != null ? parcelable.describeContents() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
