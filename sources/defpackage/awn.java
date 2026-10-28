package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class awn implements awp {
    private final IBinder a;

    public awn(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // defpackage.awp
    public final void a(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
            parcelObtain.writeInt(i);
            parcelObtain.writeTypedObject(bundle, 0);
            if (!this.a.transact(1, parcelObtain, null, 1)) {
                throw new RemoteException("Method send is unimplemented.");
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
