package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lfn extends kry {
    public static final Parcelable.Creator CREATOR = new kvg(18);
    public final List a;

    public lfn(List list) {
        this.a = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.F(parcel, 1, this.a);
        ksy.h(parcel, iG);
    }
}
