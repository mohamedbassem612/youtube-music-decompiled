package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lne extends lnb {
    public lne(Context context, kqd kqdVar, kof kofVar, kpb kpbVar, lob lobVar) {
        super(context, context.getMainLooper(), 33, kqdVar, kofVar, kpbVar, lobVar);
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 12600000;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.global.internal.IGlobalSearchAdminService");
        return iInterfaceQueryLocalInterface instanceof lnf ? (lnf) iInterfaceQueryLocalInterface : new lnf(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.search.global.internal.IGlobalSearchAdminService";
    }

    @Override // defpackage.kpz
    public final boolean f() {
        return true;
    }
}
