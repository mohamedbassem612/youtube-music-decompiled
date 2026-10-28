package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lqp extends kry {
    public static final Parcelable.Creator CREATOR = new lqu(1);
    public String a;
    public String b;
    public int c;

    public lqp(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.a);
        ksy.B(parcel, 3, this.b);
        ksy.l(parcel, 4, this.c);
        ksy.h(parcel, iG);
    }

    public lqp() {
    }
}
