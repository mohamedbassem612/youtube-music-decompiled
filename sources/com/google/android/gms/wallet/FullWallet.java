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
import defpackage.lrj;
import defpackage.lrk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class FullWallet extends kry implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new lqu(5);
    String a;
    String b;
    lrk c;
    String d;
    lqz e;
    lqz f;
    String[] g;
    UserAddress h;
    UserAddress i;
    lrc[] j;
    lrj k;

    public FullWallet(String str, String str2, lrk lrkVar, String str3, lqz lqzVar, lqz lqzVar2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, lrc[] lrcVarArr, lrj lrjVar) {
        this.a = str;
        this.b = str2;
        this.c = lrkVar;
        this.d = str3;
        this.e = lqzVar;
        this.f = lqzVar2;
        this.g = strArr;
        this.h = userAddress;
        this.i = userAddress2;
        this.j = lrcVarArr;
        this.k = lrjVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 2, this.a);
        ksy.B(parcel, 3, this.b);
        ksy.A(parcel, 4, this.c, i);
        ksy.B(parcel, 5, this.d);
        ksy.A(parcel, 6, this.e, i);
        ksy.A(parcel, 7, this.f, i);
        ksy.C(parcel, 8, this.g);
        ksy.A(parcel, 9, this.h, i);
        ksy.A(parcel, 10, this.i, i);
        ksy.E(parcel, 11, this.j, i);
        ksy.A(parcel, 12, this.k, i);
        ksy.h(parcel, iG);
    }

    private FullWallet() {
    }
}
