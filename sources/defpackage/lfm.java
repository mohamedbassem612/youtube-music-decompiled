package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lfm extends kry {
    public static final Parcelable.Creator CREATOR = new kvg(17);
    public final List a;

    public lfm(List list) {
        this.a = list;
    }

    public static lfm a(lho... lhoVarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(lhoVarArr[0].g));
        return new lfm(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.v(parcel, 1, this.a);
        ksy.h(parcel, iG);
    }
}
