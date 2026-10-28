package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kdn extends gda implements kdo {
    public kdn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    @Override // defpackage.kdo
    public final int a() {
        Parcel parcelD = d(8, c());
        int i = parcelD.readInt();
        parcelD.recycle();
        return i;
    }

    @Override // defpackage.kdo
    public final kcf b(kuo kuoVar, kuo kuoVar2, kuo kuoVar3) {
        kcf kceVar;
        Parcel parcelC = c();
        gdc.e(parcelC, kuoVar);
        gdc.e(parcelC, kuoVar2);
        gdc.e(parcelC, kuoVar3);
        Parcel parcelD = d(5, parcelC);
        IBinder strongBinder = parcelD.readStrongBinder();
        if (strongBinder == null) {
            kceVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            kceVar = iInterfaceQueryLocalInterface instanceof kcf ? (kcf) iInterfaceQueryLocalInterface : new kce(strongBinder);
        }
        parcelD.recycle();
        return kceVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kdo
    public final kbz g(kuo kuoVar, kbn kbnVar, kdq kdqVar, Map map) {
        kbz kbzVar;
        Parcel parcelC = c();
        ClassLoader classLoader = gdc.a;
        parcelC.writeStrongBinder(kuoVar);
        gdc.c(parcelC, kbnVar);
        parcelC.writeStrongBinder(kdqVar);
        parcelC.writeMap(map);
        Parcel parcelD = d(1, parcelC);
        IBinder strongBinder = parcelD.readStrongBinder();
        if (strongBinder == null) {
            kbzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            kbzVar = iInterfaceQueryLocalInterface instanceof kbz ? (kbz) iInterfaceQueryLocalInterface : new kbz(strongBinder);
        }
        parcelD.recycle();
        return kbzVar;
    }

    @Override // defpackage.kdo
    public final kcb h(kbn kbnVar, kuo kuoVar, kby kbyVar) {
        kcb kcaVar;
        Parcel parcelC = c();
        gdc.c(parcelC, kbnVar);
        gdc.e(parcelC, kuoVar);
        gdc.e(parcelC, kbyVar);
        Parcel parcelD = d(3, parcelC);
        IBinder strongBinder = parcelD.readStrongBinder();
        if (strongBinder == null) {
            kcaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            kcaVar = iInterfaceQueryLocalInterface instanceof kcb ? (kcb) iInterfaceQueryLocalInterface : new kca(strongBinder);
        }
        parcelD.recycle();
        return kcaVar;
    }

    @Override // defpackage.kdo
    public final kfr i(kuo kuoVar, kfs kfsVar, int i, int i2) {
        kfr kfqVar;
        Parcel parcelC = c();
        gdc.e(parcelC, kuoVar);
        gdc.e(parcelC, kfsVar);
        parcelC.writeInt(i);
        parcelC.writeInt(i2);
        parcelC.writeInt(0);
        parcelC.writeLong(2097152L);
        parcelC.writeInt(5);
        parcelC.writeInt(333);
        parcelC.writeInt(10000);
        Parcel parcelD = d(6, parcelC);
        IBinder strongBinder = parcelD.readStrongBinder();
        if (strongBinder == null) {
            kfqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            kfqVar = iInterfaceQueryLocalInterface instanceof kfr ? (kfr) iInterfaceQueryLocalInterface : new kfq(strongBinder);
        }
        parcelD.recycle();
        return kfqVar;
    }

    @Override // defpackage.kdo
    public final kfr j(kuo kuoVar, kuo kuoVar2, kfs kfsVar, int i, int i2) {
        kfr kfqVar;
        Parcel parcelC = c();
        gdc.e(parcelC, kuoVar);
        gdc.e(parcelC, kuoVar2);
        gdc.e(parcelC, kfsVar);
        parcelC.writeInt(i);
        parcelC.writeInt(i2);
        parcelC.writeInt(0);
        parcelC.writeLong(2097152L);
        parcelC.writeInt(5);
        parcelC.writeInt(333);
        parcelC.writeInt(10000);
        Parcel parcelD = d(7, parcelC);
        IBinder strongBinder = parcelD.readStrongBinder();
        if (strongBinder == null) {
            kfqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            kfqVar = iInterfaceQueryLocalInterface instanceof kfr ? (kfr) iInterfaceQueryLocalInterface : new kfq(strongBinder);
        }
        parcelD.recycle();
        return kfqVar;
    }

    @Override // defpackage.kdo
    public final kch k(String str, String str2, kby kbyVar) {
        kch kcgVar;
        Parcel parcelC = c();
        parcelC.writeString(str);
        parcelC.writeString(str2);
        gdc.e(parcelC, kbyVar);
        Parcel parcelD = d(2, parcelC);
        IBinder strongBinder = parcelD.readStrongBinder();
        if (strongBinder == null) {
            kcgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            kcgVar = iInterfaceQueryLocalInterface instanceof kch ? (kch) iInterfaceQueryLocalInterface : new kcg(strongBinder);
        }
        parcelD.recycle();
        return kcgVar;
    }
}
