package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kqk extends kry {
    public static final Parcelable.Creator CREATOR = new kpm(9);
    public final SparseArray a;

    public kqk(SparseArray sparseArray) {
        this.a = sparseArray != null ? sparseArray.clone() : new SparseArray(0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SparseArray sparseArray = this.a;
        int iG = ksy.g(parcel, 20293);
        SparseArray sparseArrayClone = sparseArray.clone();
        if (sparseArrayClone != null) {
            int iG2 = ksy.g(parcel, 1);
            int size = sparseArrayClone.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseArrayClone.keyAt(i2));
                Parcelable parcelable = (Parcelable) sparseArrayClone.valueAt(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    ksy.n(parcel, parcelable, 0);
                }
            }
            ksy.h(parcel, iG2);
        }
        ksy.h(parcel, iG);
    }
}
