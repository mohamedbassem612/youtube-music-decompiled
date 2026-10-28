package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class kdp extends gdb implements kdq {
    public kdp() {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        kds kdrVar;
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) gdc.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    kdrVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    kdrVar = iInterfaceQueryLocalInterface instanceof kds ? (kds) iInterfaceQueryLocalInterface : new kdr(strongBinder);
                }
                gdc.b(parcel);
                f(bundle, kdrVar);
                parcel2.writeNoException();
                return true;
            case 2:
                Bundle bundle2 = (Bundle) gdc.a(parcel, Bundle.CREATOR);
                int i2 = parcel.readInt();
                gdc.b(parcel);
                d(bundle2, i2);
                parcel2.writeNoException();
                return true;
            case 3:
                Bundle bundle3 = (Bundle) gdc.a(parcel, Bundle.CREATOR);
                gdc.b(parcel);
                h(bundle3);
                parcel2.writeNoException();
                return true;
            case 4:
                Bundle bundle4 = (Bundle) gdc.a(parcel, Bundle.CREATOR);
                int i3 = parcel.readInt();
                gdc.b(parcel);
                boolean zN = n(bundle4, i3);
                parcel2.writeNoException();
                parcel2.writeInt(zN ? 1 : 0);
                return true;
            case 5:
                String string = parcel.readString();
                gdc.b(parcel);
                j(string);
                parcel2.writeNoException();
                return true;
            case 6:
                i();
                parcel2.writeNoException();
                return true;
            case 7:
                boolean zM = m();
                parcel2.writeNoException();
                ClassLoader classLoader = gdc.a;
                parcel2.writeInt(zM ? 1 : 0);
                return true;
            case 8:
                String string2 = parcel.readString();
                gdc.b(parcel);
                Bundle bundleB = b(string2);
                parcel2.writeNoException();
                gdc.d(parcel2, bundleB);
                return true;
            case 9:
                String strC = c();
                parcel2.writeNoException();
                parcel2.writeString(strC);
                return true;
            case 10:
                parcel2.writeNoException();
                parcel2.writeInt(264205000);
                return true;
            case 11:
                g();
                parcel2.writeNoException();
                return true;
            case 12:
                boolean zL = l();
                parcel2.writeNoException();
                ClassLoader classLoader2 = gdc.a;
                parcel2.writeInt(zL ? 1 : 0);
                return true;
            case 13:
                int i4 = parcel.readInt();
                gdc.b(parcel);
                k(i4);
                parcel2.writeNoException();
                return true;
            case 14:
                String string3 = parcel.readString();
                gdc.b(parcel);
                e(string3);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
