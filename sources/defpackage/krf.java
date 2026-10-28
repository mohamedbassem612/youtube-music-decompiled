package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class krf extends gdb implements IInterface {
    private kpz a;
    private final int b;

    public krf(kpz kpzVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.a = kpzVar;
        this.b = i;
    }

    @Override // defpackage.gdb
    protected final boolean C(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) gdc.a(parcel, Bundle.CREATOR);
            gdc.b(parcel);
            b(i2, strongBinder, bundle);
        } else if (i == 2) {
            parcel.readInt();
            gdc.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            kqi kqiVar = (kqi) gdc.a(parcel, kqi.CREATOR);
            gdc.b(parcel);
            kpz kpzVar = this.a;
            if (kpzVar == null) {
                throw new NullPointerException("onPostInitCompleteWithConnectionInfo can be called only once per call to getRemoteService");
            }
            if (kqiVar == null) {
                throw new NullPointerException("null reference");
            }
            kpzVar.B = kqiVar;
            if (kpzVar.f()) {
                kqj kqjVar = kqiVar.d;
                krs.a().b(kqjVar == null ? null : kqjVar.a);
            }
            b(i3, strongBinder2, kqiVar.a);
        }
        parcel2.writeNoException();
        return true;
    }

    public final void b(int i, IBinder iBinder, Bundle bundle) {
        kpz kpzVar = this.a;
        if (kpzVar == null) {
            throw new NullPointerException("onPostInitComplete can be called only once per call to getRemoteService");
        }
        kpzVar.m(i, iBinder, bundle, this.b);
        this.a = null;
    }
}
