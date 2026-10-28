package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kkl extends kqs {
    public kkl(Context context, Looper looper, kqd kqdVar, kof kofVar, kpb kpbVar) {
        super(context, looper, 414, kqdVar, kofVar, kpbVar);
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 250200000;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.sampler.IClearcutLoggerSamplingService");
        return iInterfaceQueryLocalInterface instanceof kkm ? (kkm) iInterfaceQueryLocalInterface : new kkm(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.clearcut.sampler.IClearcutLoggerSamplingService";
    }

    @Override // defpackage.kpz
    protected final String d() {
        return "com.google.android.gms.clearcut.sampler.service.START";
    }

    @Override // defpackage.kpz
    public final klq[] g() {
        return new klq[]{kiu.b};
    }
}
