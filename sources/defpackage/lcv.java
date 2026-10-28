package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lcv extends kpz {
    public lcv(Context context, Looper looper, kpq kpqVar, kpr kprVar) {
        super(context, looper, 93, kpqVar, kprVar);
    }

    @Override // defpackage.kpz, defpackage.kmt
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.kpz
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof lco ? (lco) iInterfaceQueryLocalInterface : new lcm(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // defpackage.kpz
    protected final String d() {
        return "com.google.android.gms.measurement.START";
    }
}
