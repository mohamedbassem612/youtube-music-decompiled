package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jyr extends kry {
    public static final Parcelable.Creator CREATOR = new jys(0);
    public final Long a;
    public final List b;

    public jyr(Long l, List list) {
        this.a = l;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.z(parcel, 1, l);
        ksy.D(parcel, 2, this.b);
        ksy.h(parcel, iG);
    }
}
