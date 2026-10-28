package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lkv extends kqs {
    public lkv(Context context, Looper looper, kqd kqdVar, kna knaVar, knb knbVar) {
        super(context, looper, 160, kqdVar, knaVar, knbVar);
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 12600000;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mobstore.IMobStoreFileService");
        return iInterfaceQueryLocalInterface instanceof lkm ? (lkm) iInterfaceQueryLocalInterface : new lkm(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.mobstore.IMobStoreFileService";
    }

    @Override // defpackage.kpz
    protected final String d() {
        return "com.google.android.mobstore.service.START";
    }

    @Override // defpackage.kpz
    public final boolean f() {
        return true;
    }

    @Override // defpackage.kpz
    public final klq[] g() {
        return kxy.f;
    }
}
