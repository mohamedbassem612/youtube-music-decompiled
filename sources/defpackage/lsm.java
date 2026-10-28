package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.LoaderConfig;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lsm extends kry {
    public static final Parcelable.Creator CREATOR = new lry(7);
    public int a;
    public Account b;
    public Bundle c;
    final boolean d;
    public int e;
    public lrx f;
    final int g;
    double h;
    double i;
    final int j;
    final int k;
    LoaderConfig l;

    public lsm(int i, Account account, Bundle bundle, boolean z, int i2, lrx lrxVar, int i3, double d, double d2, int i4, int i5, LoaderConfig loaderConfig) {
        this.a = i;
        this.b = account;
        this.c = bundle;
        this.d = z;
        this.e = i2;
        this.f = lrxVar;
        this.g = i3;
        this.h = d;
        this.i = d2;
        this.j = i4;
        this.k = i5;
        this.l = loaderConfig;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 2, this.a);
        ksy.A(parcel, 3, this.b, i);
        ksy.p(parcel, 4, this.c);
        ksy.i(parcel, 5, this.d);
        ksy.l(parcel, 6, this.e);
        ksy.A(parcel, 7, this.f, i);
        ksy.l(parcel, 8, this.g);
        ksy.j(parcel, 9, this.h);
        ksy.j(parcel, 10, this.i);
        ksy.l(parcel, 11, this.j);
        ksy.l(parcel, 12, this.k);
        ksy.A(parcel, 13, this.l, i);
        ksy.h(parcel, iG);
    }

    public lsm() {
        this.d = false;
        this.a = 1;
        this.e = 1;
        this.g = 0;
        this.j = 0;
        this.k = -1;
    }
}
