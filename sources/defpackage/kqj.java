package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kqj extends kry {
    public static final Parcelable.Creator CREATOR = new kpm(8);
    public final krt a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public kqj(krt krtVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = krtVar;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        krt krtVar = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 1, krtVar, i);
        ksy.i(parcel, 2, this.b);
        ksy.i(parcel, 3, this.c);
        ksy.u(parcel, 4, this.d);
        ksy.l(parcel, 5, this.e);
        ksy.u(parcel, 6, this.f);
        ksy.h(parcel, iG);
    }
}
