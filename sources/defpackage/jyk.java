package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jyk extends kry {
    public static final Parcelable.Creator CREATOR = new jwx(17);
    public final String a;
    public final List b;
    public final List c;
    public final boolean d;
    public final boolean e;

    public jyk(String str, List list, List list2, boolean z, boolean z2) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = z;
        this.e = z2;
    }

    public static xyg a() {
        xyg xygVar = new xyg();
        xygVar.a = (byte) 3;
        return xygVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, str);
        ksy.D(parcel, 2, this.b);
        ksy.D(parcel, 3, this.c);
        ksy.i(parcel, 4, this.d);
        ksy.i(parcel, 5, this.e);
        ksy.h(parcel, iG);
    }
}
