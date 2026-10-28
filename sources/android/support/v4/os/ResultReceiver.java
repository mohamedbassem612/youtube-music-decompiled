package android.support.v4.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import defpackage.awn;
import defpackage.awo;
import defpackage.awp;
import defpackage.ax;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ax(13);
    awp a;

    public ResultReceiver(Parcel parcel) {
        awp awnVar;
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            awnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            awnVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof awp)) ? new awn(strongBinder) : (awp) iInterfaceQueryLocalInterface;
        }
        this.a = awnVar;
    }

    public final void b(int i, Bundle bundle) {
        awp awpVar = this.a;
        if (awpVar != null) {
            try {
                awpVar.a(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.a == null) {
                this.a = new awo(this);
            }
            parcel.writeStrongBinder(this.a.asBinder());
        }
    }

    public void a() {
    }
}
