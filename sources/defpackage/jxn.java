package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jxn extends kry {
    public static final Parcelable.Creator CREATOR = new jwx(11);
    final int a;
    final List b;

    public jxn(int i, List list) {
        this.a = i;
        kro.l(list);
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, this.a);
        ksy.F(parcel, 2, this.b);
        ksy.h(parcel, iG);
    }
}
