package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jvt extends kuq {
    private static final jvt a = new jvt();

    public static jvw a(Context context, Executor executor, fwz fwzVar) {
        jvw jvwVarD = null;
        if (fwzVar.g && klu.d.m(context, 12800000) == 0) {
            jvwVarD = a.d(context, executor, fwzVar);
        }
        return jvwVarD == null ? new jvv(context, executor, fwzVar) : jvwVarD;
    }

    private final jvw d(Context context, Executor executor, fwz fwzVar) {
        kun kunVar = new kun(context);
        kun kunVar2 = new kun(executor);
        byte[] byteArray = fwzVar.toByteArray();
        try {
            Object objC = c(context);
            Parcel parcelC = ((gda) objC).c();
            gdc.e(parcelC, kunVar);
            gdc.e(parcelC, kunVar2);
            parcelC.writeByteArray(byteArray);
            Parcel parcelD = ((gda) objC).d(3, parcelC);
            IBinder strongBinder = parcelD.readStrongBinder();
            parcelD.recycle();
            if (strongBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            return iInterfaceQueryLocalInterface instanceof jvw ? (jvw) iInterfaceQueryLocalInterface : new jvu(strongBinder);
        } catch (RemoteException | IllegalArgumentException | LinkageError | kup unused) {
            return null;
        }
    }

    @Override // defpackage.kuq
    protected final /* synthetic */ Object b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
        return iInterfaceQueryLocalInterface instanceof jvx ? (jvx) iInterfaceQueryLocalInterface : new jvx(iBinder);
    }
}
