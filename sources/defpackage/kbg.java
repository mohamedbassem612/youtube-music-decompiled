package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kbg extends kqs {
    public kbg(Context context, Looper looper, kqd kqdVar, kna knaVar, knb knbVar) {
        super(context, looper, 122, kqdVar, knaVar, knbVar);
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.firstparty.internal.ICastFirstPartyService");
        return iInterfaceQueryLocalInterface instanceof kbh ? (kbh) iInterfaceQueryLocalInterface : new kbh(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.cast.firstparty.internal.ICastFirstPartyService";
    }

    @Override // defpackage.kpz
    protected final String d() {
        return "com.google.android.gms.cast.firstparty.START";
    }

    @Override // defpackage.kpz
    public final boolean f() {
        return true;
    }

    @Override // defpackage.kpz
    public final klq[] g() {
        return kaf.p;
    }
}
