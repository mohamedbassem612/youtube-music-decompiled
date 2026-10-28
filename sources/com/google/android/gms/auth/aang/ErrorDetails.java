package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.jwx;
import defpackage.kry;
import defpackage.ksy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ErrorDetails extends kry implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new jwx(16);
    public final boolean a;
    public final boolean b;

    public ErrorDetails(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.i(parcel, 1, z);
        ksy.i(parcel, 2, this.b);
        ksy.h(parcel, iG);
    }
}
