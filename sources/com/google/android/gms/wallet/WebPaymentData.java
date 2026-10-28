package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.kry;
import defpackage.ksy;
import defpackage.lqu;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class WebPaymentData extends kry implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new lqu(14);
    String a;
    Bundle b;

    public WebPaymentData(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.a);
        ksy.p(parcel, 3, this.b);
        ksy.h(parcel, iG);
    }

    private WebPaymentData() {
    }
}
