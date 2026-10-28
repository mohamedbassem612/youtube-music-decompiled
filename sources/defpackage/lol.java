package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lol extends kry {
    public static final Parcelable.Creator CREATOR = new lof(4);
    final int a;
    public final klo b;
    public final krr c;

    public lol(int i, klo kloVar, krr krrVar) {
        this.a = i;
        this.b = kloVar;
        this.c = krrVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, this.a);
        ksy.A(parcel, 2, this.b, i);
        ksy.A(parcel, 3, this.c, i);
        ksy.h(parcel, iG);
    }
}
