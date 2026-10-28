package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jxa extends kry {
    public static final Parcelable.Creator CREATOR = new jwx(4);
    final String a;
    final jwy[] b;
    final int[] c;

    public jxa(String str, jwy[] jwyVarArr, int[] iArr) {
        this.a = str;
        this.b = jwyVarArr;
        this.c = iArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, this.a);
        ksy.E(parcel, 2, this.b, i);
        ksy.u(parcel, 3, this.c);
        ksy.h(parcel, iG);
    }
}
