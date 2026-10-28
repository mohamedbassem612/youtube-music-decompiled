package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class keh extends kry {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final keu c;
    public final boolean d;
    public final boolean e;
    private final kej f;

    static {
        new khn("CastMediaOptions", (String) null);
        CREATOR = new fh(9);
    }

    public keh(String str, String str2, IBinder iBinder, keu keuVar, boolean z, boolean z2) {
        kej keiVar;
        this.a = str;
        this.b = str2;
        if (iBinder == null) {
            keiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            keiVar = iInterfaceQueryLocalInterface instanceof kej ? (kej) iInterfaceQueryLocalInterface : new kei(iBinder);
        }
        this.f = keiVar;
        this.c = keuVar;
        this.d = z;
        this.e = z2;
    }

    public final ket a() {
        kej kejVar = this.f;
        if (kejVar != null) {
            try {
                return (ket) kun.b(kejVar.a());
            } catch (RemoteException unused) {
                khn.e();
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iG = ksy.g(parcel, 20293);
        if (str != null) {
            int iG2 = ksy.g(parcel, 2);
            parcel.writeString(str);
            ksy.h(parcel, iG2);
        }
        String str2 = this.b;
        if (str2 != null) {
            int iG3 = ksy.g(parcel, 3);
            parcel.writeString(str2);
            ksy.h(parcel, iG3);
        }
        kej kejVar = this.f;
        IBinder iBinderAsBinder = kejVar == null ? null : kejVar.asBinder();
        if (iBinderAsBinder != null) {
            int iG4 = ksy.g(parcel, 4);
            parcel.writeStrongBinder(iBinderAsBinder);
            ksy.h(parcel, iG4);
        }
        ksy.A(parcel, 5, this.c, i);
        boolean z = this.d;
        parcel.writeInt(262150);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.e;
        parcel.writeInt(262151);
        parcel.writeInt(z2 ? 1 : 0);
        ksy.h(parcel, iG);
    }
}
