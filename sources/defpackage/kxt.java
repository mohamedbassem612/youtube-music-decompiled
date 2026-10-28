package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kxt extends kqs {
    public final kxa a;

    public kxt(Context context, Looper looper, kqd kqdVar, kna knaVar, knb knbVar) {
        super(context, looper, 63, kqdVar, knaVar, knbVar);
        this.a = new kxr();
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 11925000;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        return iInterfaceQueryLocalInterface instanceof kxv ? (kxv) iInterfaceQueryLocalInterface : new kxv(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService";
    }

    @Override // defpackage.kpz
    protected final String d() {
        return "com.google.android.gms.googlehelp.service.GoogleHelpService.START";
    }

    @Override // defpackage.kpz
    public final boolean f() {
        return true;
    }
}
