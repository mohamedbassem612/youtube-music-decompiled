package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class krr extends kry {
    public static final Parcelable.Creator CREATOR = new kpm(11);
    final int a;
    final IBinder b;
    public final klo c;
    public final boolean d;
    public final boolean e;

    public krr(int i, IBinder iBinder, klo kloVar, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = kloVar;
        this.d = z;
        this.e = z2;
    }

    public final krc a() {
        IBinder iBinder = this.b;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return iInterfaceQueryLocalInterface instanceof krc ? (krc) iInterfaceQueryLocalInterface : new krc(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof krr)) {
                return false;
            }
            krr krrVar = (krr) obj;
            if (!this.c.equals(krrVar.c) || !Objects.equals(a(), krrVar.a())) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iG = ksy.g(parcel, 20293);
        ksy.l(parcel, 1, this.a);
        ksy.t(parcel, 2, this.b);
        ksy.A(parcel, 3, this.c, i);
        ksy.i(parcel, 4, this.d);
        ksy.i(parcel, 5, this.e);
        ksy.h(parcel, iG);
    }
}
