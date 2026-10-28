package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jyo extends kry {
    public static final Parcelable.Creator CREATOR = new jwx(20);
    public final String a;
    public final jyr b;

    public jyo(String str, jyr jyrVar) {
        this.a = str;
        this.b = jyrVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, str);
        ksy.A(parcel, 2, this.b, i);
        ksy.h(parcel, iG);
    }
}
