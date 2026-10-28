package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lpz extends kqs {
    private final AtomicReference a;

    public lpz(Context context, Looper looper, kqd kqdVar, kna knaVar, knb knbVar) {
        super(context, looper, 41, kqdVar, knaVar, knbVar);
        this.a = new AtomicReference();
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 12600000;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        return iInterfaceQueryLocalInterface instanceof lpw ? (lpw) iInterfaceQueryLocalInterface : new lpw(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
    }

    @Override // defpackage.kpz
    protected final String d() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override // defpackage.kpz
    public final boolean f() {
        return true;
    }

    @Override // defpackage.kpz
    public final klq[] g() {
        return lpm.g;
    }

    @Override // defpackage.kpz
    public final void l() {
        try {
            lpv lpvVar = (lpv) this.a.getAndSet(null);
            if (lpvVar != null) {
                lpy lpyVar = new lpy();
                lpw lpwVar = (lpw) C();
                Parcel parcelC = lpwVar.c();
                gdc.e(parcelC, lpvVar);
                gdc.e(parcelC, lpyVar);
                lpwVar.e(5, parcelC);
            }
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.l();
    }
}
