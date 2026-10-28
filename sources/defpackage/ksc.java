package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ksc extends kqs {
    public ksc(Context context, Looper looper, kqd kqdVar, kof kofVar, kpb kpbVar) {
        super(context, looper, 483, kqdVar, kofVar, kpbVar);
    }

    @Override // defpackage.kpz
    protected final boolean S() {
        return true;
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 253600000;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientThrottlingTelemetryService");
        return iInterfaceQueryLocalInterface instanceof ksf ? (ksf) iInterfaceQueryLocalInterface : new ksf(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.common.internal.service.IClientThrottlingTelemetryService";
    }

    @Override // defpackage.kpz
    protected final String d() {
        return "com.google.android.gms.common.telemetry.throttling.service.START";
    }

    @Override // defpackage.kpz
    public final klq[] g() {
        return kkq.d;
    }
}
