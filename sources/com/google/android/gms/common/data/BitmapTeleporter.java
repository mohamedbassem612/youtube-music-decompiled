package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.kpm;
import defpackage.kro;
import defpackage.kry;
import defpackage.ksy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class BitmapTeleporter extends kry implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new kpm(0);
    final int a;
    ParcelFileDescriptor b;
    final int c;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.b == null) {
            kro.l(null);
            throw null;
        }
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, this.a);
        ksy.A(parcel, 2, this.b, i | 1);
        ksy.l(parcel, 3, this.c);
        ksy.h(parcel, iG);
        this.b = null;
    }
}
