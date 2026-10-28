package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class loe extends kry implements kni {
    public static final Parcelable.Creator CREATOR = new lof(0);
    final int a;
    public int b;
    public Intent c;

    public loe(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // defpackage.kni
    public final Status a() {
        return this.b == 0 ? Status.a : Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, this.a);
        ksy.l(parcel, 2, this.b);
        ksy.A(parcel, 3, this.c, i);
        ksy.h(parcel, iG);
    }

    public loe() {
        this(2, 0, null);
    }
}
