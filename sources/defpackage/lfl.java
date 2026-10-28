package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lfl extends kry {
    public static final Parcelable.Creator CREATOR = new kvg(16);
    public final long a;
    public byte[] b;
    public final String c;
    public final Bundle d;
    public final int e;
    public final long f;
    public String g;

    public lfl(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.a = j;
        this.b = bArr;
        this.c = str;
        this.d = bundle;
        this.e = i;
        this.f = j2;
        this.g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.m(parcel, 1, this.a);
        ksy.q(parcel, 2, this.b);
        ksy.B(parcel, 3, this.c);
        ksy.p(parcel, 4, this.d);
        ksy.l(parcel, 5, this.e);
        ksy.m(parcel, 6, this.f);
        ksy.B(parcel, 7, this.g);
        ksy.h(parcel, iG);
    }
}
