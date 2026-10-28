package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kxw extends kry {
    public static final Parcelable.Creator CREATOR = new kvg(4);
    final int a;
    final String b;
    final Intent c;

    public kxw(int i, String str, Intent intent) {
        this.a = i;
        this.b = str;
        this.c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 2, this.a);
        ksy.B(parcel, 3, this.b);
        ksy.A(parcel, 4, this.c, i);
        ksy.h(parcel, iG);
    }
}
