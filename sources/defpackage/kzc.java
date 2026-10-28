package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kzc extends kry {
    public static final Parcelable.Creator CREATOR = new kvg(11);
    public final int a;
    public final IBinder b;
    public final IBinder c;
    public final PendingIntent d;
    public final String e;

    public kzc(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.a = i;
        this.b = iBinder;
        this.c = iBinder2;
        this.d = pendingIntent;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, i2);
        ksy.t(parcel, 2, this.b);
        ksy.t(parcel, 3, this.c);
        ksy.A(parcel, 4, this.d, i);
        ksy.B(parcel, 6, this.e);
        ksy.h(parcel, iG);
    }
}
