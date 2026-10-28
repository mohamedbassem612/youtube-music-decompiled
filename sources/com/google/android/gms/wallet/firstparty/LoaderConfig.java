package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.kry;
import defpackage.ksy;
import defpackage.lqu;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class LoaderConfig extends kry implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new lqu(20);
    final String a;
    final String b;
    final long c;

    public LoaderConfig() {
        this.a = null;
        this.b = null;
        this.c = 0L;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, this.a);
        ksy.B(parcel, 2, this.b);
        ksy.m(parcel, 3, this.c);
        ksy.h(parcel, iG);
    }

    public LoaderConfig(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }
}
