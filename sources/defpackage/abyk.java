package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abyk implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapl(5);
    public final abnl a;
    public final abnd b;
    public final acis c;
    public final aavf d;
    public final abtx e;

    public abyk(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = (abnl) parcel.readParcelable(classLoader);
        this.b = (abnd) parcel.readParcelable(classLoader);
        this.c = (acis) parcel.readParcelable(classLoader);
        this.e = (abtx) parcel.readParcelable(classLoader);
        this.d = (aavf) parcel.readParcelable(classLoader);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.e, 0);
        parcel.writeParcelable(this.d, 0);
    }

    public abyk(abnl abnlVar, abnd abndVar, abtx abtxVar, acis acisVar, aavf aavfVar) {
        this.a = abnlVar;
        this.b = abndVar;
        this.c = acisVar;
        this.e = abtxVar;
        this.d = aavfVar;
    }
}
