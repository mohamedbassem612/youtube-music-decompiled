package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aid extends aip implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aic();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(e());
        aiq aiqVar = this.a;
        if (awrc.c(aiqVar, aii.b)) {
            i2 = 0;
        } else if (awrc.c(aiqVar, aii.c)) {
            i2 = 1;
        } else {
            if (!awrc.c(aiqVar, aii.a)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
