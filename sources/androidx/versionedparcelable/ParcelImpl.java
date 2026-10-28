package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dtq;
import defpackage.dtr;
import defpackage.vj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new vj(15);
    public final dtr a;

    public ParcelImpl(Parcel parcel) {
        this.a = new dtq(parcel).c();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new dtq(parcel).k(this.a);
    }

    public ParcelImpl(dtr dtrVar) {
        this.a = dtrVar;
    }
}
