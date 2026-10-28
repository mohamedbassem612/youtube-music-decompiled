package com.google.android.gms.wallet.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.kry;
import defpackage.ksy;
import defpackage.lry;
import defpackage.lsm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class BuyFlowConfig extends kry implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new lry(8);
    public String a;
    public lsm b;
    public String c;
    public String d;
    String e;
    String f;
    int g;

    public BuyFlowConfig(String str, lsm lsmVar, String str2, String str3, String str4, String str5, int i) {
        this.a = str;
        this.b = lsmVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.a);
        ksy.A(parcel, 3, this.b, i);
        ksy.B(parcel, 4, this.c);
        ksy.B(parcel, 5, this.d);
        ksy.B(parcel, 6, TextUtils.isEmpty(this.e) ? this.c : this.e);
        ksy.B(parcel, 7, this.f);
        ksy.l(parcel, 8, this.g);
        ksy.h(parcel, iG);
    }
}
