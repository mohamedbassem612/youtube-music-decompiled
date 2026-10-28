package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ahpz extends kqs {
    public ahpz(Context context, Looper looper, kqd kqdVar, kna knaVar, knb knbVar) {
        super(context, looper, 131, kqdVar, knaVar, knbVar);
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
        return iInterfaceQueryLocalInterface instanceof ahqd ? (ahqd) iInterfaceQueryLocalInterface : new ahqd(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    }

    @Override // defpackage.kpz
    protected final String d() {
        return "com.google.firebase.dynamiclinks.service.START";
    }

    @Override // defpackage.kpz
    public final boolean f() {
        return true;
    }
}
