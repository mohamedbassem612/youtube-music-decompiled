package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class nz extends bdh {
    public static final Parcelable.Creator CREATOR = new ny(0);
    public Parcelable a;

    public nz(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readParcelable(classLoader == null ? np.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.bdh, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.a, 0);
    }

    public nz(Parcelable parcelable) {
        super(parcelable);
    }
}
