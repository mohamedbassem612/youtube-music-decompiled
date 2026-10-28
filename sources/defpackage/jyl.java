package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jyl extends kry {
    public static final Parcelable.Creator CREATOR = new jwx(18);
    public final List a;
    public final List b;

    public jyl(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.F(parcel, 1, list);
        ksy.F(parcel, 2, this.b);
        ksy.h(parcel, iG);
    }
}
