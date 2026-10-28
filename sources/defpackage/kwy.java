package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwy extends gdb implements kwz {
    public kwy() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (iInterfaceQueryLocalInterface instanceof kuo) {
                    }
                }
                parcel.readString();
                gdc.b(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                gdc.b(parcel);
                break;
            case 5:
                parcel.createByteArray();
                gdc.b(parcel);
                break;
            case 6:
                parcel.readInt();
                gdc.b(parcel);
                break;
            case 7:
                parcel.readInt();
                gdc.b(parcel);
                break;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                    if (iInterfaceQueryLocalInterface2 instanceof kuo) {
                    }
                }
                parcel.readString();
                parcel.readString();
                gdc.b(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.kwz
    public final void a() {
    }

    @Override // defpackage.kwz
    public final void j() {
    }

    @Override // defpackage.kwz
    public final void b(int i) {
    }

    @Override // defpackage.kwz
    public final void g(int i) {
    }

    @Override // defpackage.kwz
    public final void h(byte[] bArr) {
    }

    @Override // defpackage.kwz
    public final void i(kuo kuoVar, String str) {
    }
}
