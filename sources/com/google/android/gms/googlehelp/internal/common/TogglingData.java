package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.kry;
import defpackage.ksy;
import defpackage.kvg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class TogglingData extends kry implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new kvg(5);
    String a;
    String b;
    public String c;

    public TogglingData(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.a);
        ksy.B(parcel, 3, this.b);
        ksy.B(parcel, 4, this.c);
        ksy.h(parcel, iG);
    }

    private TogglingData() {
    }
}
