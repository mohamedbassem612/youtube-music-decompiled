package defpackage;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kku implements Parcelable {
    public static final Parcelable.Creator CREATOR = new kbc(15);
    final Messenger a;

    public kku(IBinder iBinder) {
        this.a = new Messenger(iBinder);
    }

    public final IBinder a() {
        return this.a.getBinder();
    }

    public final void b(Message message) throws RemoteException {
        this.a.send(message);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((kku) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.a.getBinder());
    }
}
