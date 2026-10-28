package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class bdh implements Parcelable {
    public final Parcelable d;
    public static final bdh c = new bdf();
    public static final Parcelable.Creator CREATOR = new bdg();

    protected bdh(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.d = parcelable == c ? null : parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.d, i);
    }

    protected bdh(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.d = parcelable == null ? c : parcelable;
    }

    public bdh() {
        this.d = null;
    }
}
