package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lsv extends kry {
    public static final Parcelable.Creator CREATOR = new lry(16);
    final String a;
    final String b;
    final lst c;

    @Deprecated
    final lsu d;

    @Deprecated
    final lsu e;

    public lsv(String str, String str2, lst lstVar, lsu lsuVar, lsu lsuVar2) {
        this.a = str;
        this.b = str2;
        this.c = lstVar;
        this.d = lsuVar;
        this.e = lsuVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.a);
        ksy.B(parcel, 3, this.b);
        ksy.A(parcel, 4, this.c, i);
        ksy.A(parcel, 5, this.d, i);
        ksy.A(parcel, 6, this.e, i);
        ksy.h(parcel, iG);
    }
}
