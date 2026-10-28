package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lpt extends kry {
    public static final Parcelable.Creator CREATOR = new lof(9);
    public final int a;
    public final boolean b;
    public final List c;
    public final int d;
    public final String e;
    public final boolean f;

    public lpt(int i, boolean z, List list, int i2, String str, boolean z2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = i;
        this.b = z;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.d = i2;
        this.e = str;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 2, this.a);
        ksy.i(parcel, 3, this.b);
        ksy.D(parcel, 4, this.c);
        ksy.l(parcel, 5, this.d);
        ksy.B(parcel, 6, this.e);
        ksy.i(parcel, 7, this.f);
        ksy.h(parcel, iG);
    }
}
