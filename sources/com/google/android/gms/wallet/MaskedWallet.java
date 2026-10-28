package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.kry;
import defpackage.ksy;
import defpackage.lqu;
import defpackage.lqz;
import defpackage.lrc;
import defpackage.lrd;
import defpackage.lrf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class MaskedWallet extends kry implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new lqu(7);
    String a;
    String b;
    String[] c;
    String d;
    lqz e;
    lqz f;
    lrd[] g;
    lrf[] h;
    UserAddress i;
    UserAddress j;
    lrc[] k;

    public MaskedWallet(String str, String str2, String[] strArr, String str3, lqz lqzVar, lqz lqzVar2, lrd[] lrdVarArr, lrf[] lrfVarArr, UserAddress userAddress, UserAddress userAddress2, lrc[] lrcVarArr) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
        this.d = str3;
        this.e = lqzVar;
        this.f = lqzVar2;
        this.g = lrdVarArr;
        this.h = lrfVarArr;
        this.i = userAddress;
        this.j = userAddress2;
        this.k = lrcVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.a);
        ksy.B(parcel, 3, this.b);
        ksy.C(parcel, 4, this.c);
        ksy.B(parcel, 5, this.d);
        ksy.A(parcel, 6, this.e, i);
        ksy.A(parcel, 7, this.f, i);
        ksy.E(parcel, 8, this.g, i);
        ksy.E(parcel, 9, this.h, i);
        ksy.A(parcel, 10, this.i, i);
        ksy.A(parcel, 11, this.j, i);
        ksy.E(parcel, 12, this.k, i);
        ksy.h(parcel, iG);
    }

    private MaskedWallet() {
    }
}
