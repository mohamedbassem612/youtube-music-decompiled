package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lmg extends kqs {
    public lmg(Context context, Looper looper, kqd kqdVar, kof kofVar, kpb kpbVar) {
        super(context, looper, 285, kqdVar, kofVar, kpbVar);
    }

    @Override // defpackage.kpz
    protected final boolean S() {
        return true;
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 17895000;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.potokens.internal.IPoTokensService");
        return iInterfaceQueryLocalInterface instanceof lmc ? (lmc) iInterfaceQueryLocalInterface : new lmc(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.potokens.internal.IPoTokensService";
    }

    @Override // defpackage.kpz
    protected final String d() {
        return "com.google.android.gms.potokens.service.START";
    }

    @Override // defpackage.kpz
    public final boolean f() {
        return true;
    }

    @Override // defpackage.kpz
    public final klq[] g() {
        return llv.b;
    }
}
