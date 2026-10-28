package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aexz extends bdh {
    public static final Parcelable.Creator CREATOR = new aewc(2);
    public boolean a;

    public aexz(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt() == 1;
    }

    @Override // defpackage.bdh, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a ? 1 : 0);
    }

    public aexz(Parcelable parcelable) {
        super(parcelable);
    }
}
