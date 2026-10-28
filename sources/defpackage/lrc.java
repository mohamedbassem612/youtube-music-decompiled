package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lrc extends kry {
    public static final Parcelable.Creator CREATOR = new lqu(6);
    public final String a;
    public final String b;
    private final int c;

    public lrc(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.a);
        ksy.B(parcel, 3, this.b);
        int i2 = this.c;
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            i2 = 0;
        }
        ksy.l(parcel, 4, i2);
        ksy.h(parcel, iG);
    }
}
