package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lnh extends lnb {
    public lnh(Context context, kqd kqdVar, kof kofVar, kpb kpbVar, lob lobVar) {
        super(context, context.getMainLooper(), 66, kqdVar, kofVar, kpbVar, lobVar);
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 12600000;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.search.ime.internal.IIMEUpdatesService");
        return iInterfaceQueryLocalInterface instanceof lng ? (lng) iInterfaceQueryLocalInterface : new lng(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.search.ime.internal.IIMEUpdatesService";
    }
}
