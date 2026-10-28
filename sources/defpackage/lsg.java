package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lsg extends kry {
    public static final Parcelable.Creator CREATOR = new lry(6);
    String[] a;
    int[] b;
    RemoteViews c;
    byte[] d;

    public lsg(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.a = strArr;
        this.b = iArr;
        this.c = remoteViews;
        this.d = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.C(parcel, 1, this.a);
        ksy.u(parcel, 2, this.b);
        ksy.A(parcel, 3, this.c, i);
        ksy.q(parcel, 4, this.d);
        ksy.h(parcel, iG);
    }

    private lsg() {
    }
}
