package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kqg extends kry {
    public static final Parcelable.Creator CREATOR = new kpm(7);
    private final List a;

    public kqg(List list) {
        this.a = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        List list = this.a;
        if (list == null) {
            list = agpi.a;
        }
        ksy.F(parcel, 1, list);
        ksy.h(parcel, iG);
    }
}
