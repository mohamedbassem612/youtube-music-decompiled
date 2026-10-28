package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lnx extends lnb {
    public lnx(Context context, kqd kqdVar, kof kofVar, kpb kpbVar, lob lobVar) {
        super(context, context.getMainLooper(), 32, kqdVar, kofVar, kpbVar, lobVar);
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 12600000;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.queries.internal.ISearchQueriesService");
        return iInterfaceQueryLocalInterface instanceof lnu ? (lnu) iInterfaceQueryLocalInterface : new lnu(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.search.queries.internal.ISearchQueriesService";
    }

    @Override // defpackage.kpz
    public final boolean f() {
        return true;
    }

    @Override // defpackage.kpz
    public final klq[] g() {
        return kxy.f;
    }

    public lnx(Context context, Looper looper, kqd kqdVar, kof kofVar, kpb kpbVar, lob lobVar) {
        super(context, looper, 32, kqdVar, kofVar, kpbVar, lobVar);
    }
}
