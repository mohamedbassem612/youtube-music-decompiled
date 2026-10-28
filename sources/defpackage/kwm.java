package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwm extends kry {
    public static final Parcelable.Creator CREATOR = new kwo(1);
    public final int a;
    public final String b;
    public final String c;

    public kwm(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        parcel.writeInt(262145);
        parcel.writeInt(this.a);
        String str = this.b;
        if (str != null) {
            int iG2 = ksy.g(parcel, 2);
            parcel.writeString(str);
            ksy.h(parcel, iG2);
        }
        String str2 = this.c;
        if (str2 != null) {
            int iG3 = ksy.g(parcel, 3);
            parcel.writeString(str2);
            ksy.h(parcel, iG3);
        }
        ksy.h(parcel, iG);
    }
}
