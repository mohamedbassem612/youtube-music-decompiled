package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dmc extends Binder implements IInterface {
    final /* synthetic */ MultiInstanceInvalidationService a;

    public dmc(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        int i3 = 0;
        dmb dmbVar = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                dmbVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof dmb)) ? new dmb(strongBinder) : (dmb) iInterfaceQueryLocalInterface;
            }
            String string = parcel.readString();
            dmbVar.getClass();
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
                RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.c;
                synchronized (remoteCallbackList) {
                    int i4 = multiInstanceInvalidationService.a + 1;
                    multiInstanceInvalidationService.a = i4;
                    Integer numValueOf = Integer.valueOf(i4);
                    if (remoteCallbackList.register(dmbVar, numValueOf)) {
                        multiInstanceInvalidationService.b.put(numValueOf, string);
                        i3 = i4;
                    } else {
                        multiInstanceInvalidationService.a--;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        } else {
            if (i != 2) {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                int i5 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                strArrCreateStringArray.getClass();
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.a;
                RemoteCallbackList remoteCallbackList2 = multiInstanceInvalidationService2.c;
                synchronized (remoteCallbackList2) {
                    Map map = multiInstanceInvalidationService2.b;
                    String str = (String) map.get(Integer.valueOf(i5));
                    if (str == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                        return true;
                    }
                    int iBeginBroadcast = remoteCallbackList2.beginBroadcast();
                    while (i3 < iBeginBroadcast) {
                        try {
                            Object broadcastCookie = remoteCallbackList2.getBroadcastCookie(i3);
                            broadcastCookie.getClass();
                            Integer num = (Integer) broadcastCookie;
                            int iIntValue = num.intValue();
                            String str2 = (String) map.get(num);
                            if (i5 != iIntValue && awrc.c(str, str2)) {
                                try {
                                    dmb dmbVar2 = (dmb) remoteCallbackList2.getBroadcastItem(i3);
                                    Parcel parcelObtain = Parcel.obtain();
                                    try {
                                        parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                                        parcelObtain.writeStringArray(strArrCreateStringArray);
                                        dmbVar2.a.transact(1, parcelObtain, null, 1);
                                        parcelObtain.recycle();
                                    } catch (Throwable th) {
                                        parcelObtain.recycle();
                                        throw th;
                                    }
                                } catch (RemoteException e) {
                                    Log.w("ROOM", "Error invoking a remote callback", e);
                                }
                            }
                            i3++;
                        } catch (Throwable th2) {
                            multiInstanceInvalidationService2.c.finishBroadcast();
                            throw th2;
                        }
                    }
                    multiInstanceInvalidationService2.c.finishBroadcast();
                    return true;
                }
            }
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                dmbVar = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof dmb)) ? new dmb(strongBinder2) : (dmb) iInterfaceQueryLocalInterface2;
            }
            int i6 = parcel.readInt();
            dmbVar.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.a;
            RemoteCallbackList remoteCallbackList3 = multiInstanceInvalidationService3.c;
            synchronized (remoteCallbackList3) {
                remoteCallbackList3.unregister(dmbVar);
            }
            parcel2.writeNoException();
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
