package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.kry;
import defpackage.ksy;
import defpackage.kvg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class ND4CSettings extends kry implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new kvg(2);
    boolean a;
    String b;

    public ND4CSettings(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.i(parcel, 2, this.a);
        ksy.B(parcel, 3, this.b);
        ksy.h(parcel, iG);
    }

    public ND4CSettings() {
        this(true, "");
    }
}
