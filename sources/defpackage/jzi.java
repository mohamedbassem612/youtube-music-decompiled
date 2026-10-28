package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jzi extends kry {
    public static final Parcelable.Creator CREATOR = new jys(2);
    final int a;
    public final int b;
    public final PendingIntent c;
    public final int d;
    final Bundle e;
    public final byte[] f;

    public jzi(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.e = bundle;
        this.f = bArr;
        this.c = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, this.b);
        ksy.A(parcel, 2, this.c, i);
        ksy.l(parcel, 3, this.d);
        ksy.p(parcel, 4, this.e);
        ksy.q(parcel, 5, this.f);
        ksy.l(parcel, 1000, this.a);
        ksy.h(parcel, iG);
    }
}
