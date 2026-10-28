package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.os.ResultReceiver;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class awo extends Binder implements awp {
    final /* synthetic */ ResultReceiver a;

    public awo(ResultReceiver resultReceiver) {
        this.a = resultReceiver;
        attachInterface(this, "android.support.v4.os.IResultReceiver");
    }

    @Override // defpackage.awp
    public final void a(int i, Bundle bundle) {
        this.a.a();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.os.IResultReceiver");
        }
        if (i == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        a(parcel.readInt(), (Bundle) parcel.readTypedObject(Bundle.CREATOR));
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
