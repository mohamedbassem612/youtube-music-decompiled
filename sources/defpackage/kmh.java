package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class kmh extends kry {
    public static final Parcelable.Creator CREATOR = new kbc(19);
    public final String a;
    public final IBinder b;
    public final boolean c;
    public final boolean d;
    private krd e;

    public kmh(String str, krd krdVar, boolean z, boolean z2) {
        this.a = str;
        this.e = krdVar;
        this.b = krdVar == null ? null : krdVar;
        this.c = z;
        this.d = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iG = ksy.g(parcel, 20293);
        ksy.B(parcel, 1, str);
        ksy.t(parcel, 2, this.b);
        ksy.i(parcel, 3, this.c);
        ksy.i(parcel, 4, this.d);
        ksy.h(parcel, iG);
    }

    public kmh(String str, IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        this.b = iBinder;
        this.c = z;
        this.d = z2;
    }
}
