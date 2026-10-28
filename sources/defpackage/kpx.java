package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kpx extends kpp {
    public final IBinder h;
    final /* synthetic */ kpz i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpx(kpz kpzVar, int i, IBinder iBinder, Bundle bundle, int i2) {
        super(kpzVar, i, bundle, i2);
        this.i = kpzVar;
        this.h = iBinder;
    }

    @Override // defpackage.kpp
    protected final void a(klo kloVar) {
        kpz kpzVar = this.i;
        kpr kprVar = kpzVar.w;
        if (kprVar != null) {
            kprVar.c(kloVar);
        }
        kpzVar.q();
    }

    @Override // defpackage.kpp
    protected final boolean b() {
        kqi kqiVar;
        try {
            IBinder iBinder = this.h;
            if (iBinder == null) {
                throw new NullPointerException("null reference");
            }
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            kpz kpzVar = this.i;
            if (!kpzVar.c().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + kpzVar.c() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceB = kpzVar.b(iBinder);
            if (iInterfaceB == null) {
                return false;
            }
            int i = this.c;
            if (!kpzVar.K(2, 4, iInterfaceB, i) && !kpzVar.K(3, 4, iInterfaceB, i)) {
                return false;
            }
            kqk kqkVar = null;
            kpzVar.A = null;
            Bundle bundleJ = kpzVar.j();
            if (kpzVar.O() && (kqiVar = kpzVar.B) != null) {
                kqkVar = kqiVar.e;
            }
            if (kqkVar != null) {
                if (bundleJ == null) {
                    bundleJ = new Bundle();
                }
                bundleJ.putByteArray("com.google.android.gms.common.internal.CONNECTION_THROTTLING_CONFIG", ket.A(kqkVar));
            } else if (bundleJ != null) {
                bundleJ.remove("com.google.android.gms.common.internal.CONNECTION_THROTTLING_CONFIG");
            }
            kpq kpqVar = kpzVar.v;
            if (kpqVar != null) {
                kpqVar.a(bundleJ);
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
