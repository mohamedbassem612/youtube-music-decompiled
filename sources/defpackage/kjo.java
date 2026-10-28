package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kjo extends kqs {
    public kjo(Context context, Looper looper, kqd kqdVar, kna knaVar, knb knbVar) {
        super(context, looper, 40, kqdVar, knaVar, knbVar);
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 11925000;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return iInterfaceQueryLocalInterface instanceof kjr ? (kjr) iInterfaceQueryLocalInterface : new kjr(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    @Override // defpackage.kpz
    protected final String d() {
        return "com.google.android.gms.clearcut.service.START";
    }

    @Override // defpackage.kpz
    public final klq[] g() {
        return new klq[]{kiu.a, kiu.c};
    }
}
