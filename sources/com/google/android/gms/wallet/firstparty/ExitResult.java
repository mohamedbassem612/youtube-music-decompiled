package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.kry;
import defpackage.ksy;
import defpackage.lqu;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ExitResult extends kry implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new lqu(16);
    public int a;
    public String b;
    public int c;
    public int d;

    public ExitResult() {
        this.a = 402;
        this.b = "";
        this.c = 0;
        this.d = 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, this.a);
        ksy.B(parcel, 2, this.b);
        ksy.l(parcel, 3, this.c);
        ksy.l(parcel, 4, this.d);
        ksy.h(parcel, iG);
    }

    public ExitResult(int i, String str, int i2, int i3) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
    }
}
