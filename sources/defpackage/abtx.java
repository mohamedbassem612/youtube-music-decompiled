package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class abtx implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aapl(4);
    public final wjf a;
    public final wgi b;
    public final abnl c;
    public final abnl d;
    public final boolean e;
    public final acuh f;

    public abtx(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = (wjf) parcel.readParcelable(classLoader);
        this.b = (wgi) parcel.readParcelable(classLoader);
        this.c = (abnl) parcel.readParcelable(classLoader);
        this.d = (abnl) parcel.readParcelable(classLoader);
        this.e = parcel.readInt() == 1;
        this.f = (acuh) parcel.readParcelable(classLoader);
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
        parcel.writeParcelable(this.d, 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeParcelable(this.f, 0);
    }

    public abtx(wjf wjfVar, wgi wgiVar, abnl abnlVar, abnl abnlVar2, boolean z, acuh acuhVar) {
        this.a = wjfVar;
        this.b = wgiVar;
        this.c = abnlVar;
        this.d = abnlVar2;
        this.e = z;
        this.f = acuhVar;
    }
}
