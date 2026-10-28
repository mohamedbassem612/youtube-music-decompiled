package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class klj extends kqs {
    public klj(Context context, Looper looper, kqd kqdVar, kof kofVar, kpb kpbVar) {
        super(context, looper, 457, kqdVar, kofVar, kpbVar);
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 261200000;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        return iInterfaceQueryLocalInterface instanceof klk ? (klk) iInterfaceQueryLocalInterface : new klk(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.cloudmessaging.internal.ICloudMessagingService";
    }

    @Override // defpackage.kpz
    protected final String d() {
        return "com.google.android.gms.cloudmessaging.service.START";
    }

    @Override // defpackage.kpz
    public final boolean f() {
        return true;
    }

    @Override // defpackage.kpz
    public final klq[] g() {
        return kkw.c;
    }
}
