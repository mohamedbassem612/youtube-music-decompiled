package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jyg extends kry {
    public static final Parcelable.Creator CREATOR = new jwx(14);
    public final jyi a;
    public final jyh b;

    public jyg(jyi jyiVar, jyh jyhVar) {
        this.a = jyiVar;
        this.b = jyhVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        jyi jyiVar = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.A(parcel, 1, jyiVar, i);
        ksy.A(parcel, 2, this.b, i);
        ksy.h(parcel, iG);
    }
}
