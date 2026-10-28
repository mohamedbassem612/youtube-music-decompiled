package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lnj extends lnb {
    public lnj(Context context, kqd kqdVar, kof kofVar, kpb kpbVar, lob lobVar) {
        super(context, context.getMainLooper(), 78, kqdVar, kofVar, kpbVar, lobVar);
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 12600000;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.nativeapi.internal.INativeApiService");
        return iInterfaceQueryLocalInterface instanceof lni ? (lni) iInterfaceQueryLocalInterface : new lni(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.search.nativeapi.internal.INativeApiService";
    }
}
