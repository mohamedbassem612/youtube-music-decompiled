package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kes extends kry {
    public static final Parcelable.Creator CREATOR = new kbc(3);
    public final String a;
    public final int b;
    public final String c;

    public kes(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, str);
        ksy.l(parcel, 3, this.b);
        ksy.B(parcel, 4, this.c);
        ksy.h(parcel, iG);
    }
}
