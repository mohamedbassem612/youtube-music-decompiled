package com.google.android.gms.googlehelp.trails;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.kry;
import defpackage.ksy;
import defpackage.kvg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class TrailsInteraction extends kry implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new kvg(6);
    public final String a;
    public final long b;
    public final String c;

    public TrailsInteraction(String str, long j, String str2) {
        this.a = str;
        this.b = j;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, this.a);
        ksy.m(parcel, 2, this.b);
        ksy.B(parcel, 3, this.c);
        ksy.h(parcel, iG);
    }
}
