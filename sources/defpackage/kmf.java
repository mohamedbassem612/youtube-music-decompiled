package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kmf extends kry {
    public static final Parcelable.Creator CREATOR = new kbc(17);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    private final Context g;

    public kmf(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4, boolean z5) {
        kuo kumVar;
        this.a = str;
        this.b = z;
        this.c = z2;
        if (iBinder == null) {
            kumVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            kumVar = iInterfaceQueryLocalInterface instanceof kuo ? (kuo) iInterfaceQueryLocalInterface : new kum(iBinder);
        }
        this.g = (Context) kun.b(kumVar);
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, str);
        ksy.i(parcel, 2, this.b);
        ksy.i(parcel, 3, this.c);
        ksy.t(parcel, 4, new kun(this.g));
        ksy.i(parcel, 5, this.d);
        ksy.i(parcel, 6, this.e);
        ksy.i(parcel, 8, this.f);
        ksy.h(parcel, iG);
    }
}
