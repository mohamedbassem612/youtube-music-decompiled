package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ksm extends kqs {
    private final krx a;

    public ksm(Context context, Looper looper, kqd kqdVar, krx krxVar, kof kofVar, kpb kpbVar) {
        super(context, looper, 270, kqdVar, kofVar, kpbVar);
        this.a = krxVar;
    }

    @Override // defpackage.kpz
    protected final boolean S() {
        return true;
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 203400000;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof kse ? (kse) iInterfaceQueryLocalInterface : new kse(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.kpz
    protected final String d() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.kpz
    public final klq[] g() {
        return kkq.d;
    }

    @Override // defpackage.kpz
    protected final Bundle h() {
        Bundle bundle = new Bundle();
        String str = this.a.b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }
}
