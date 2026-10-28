package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jyu extends kqs {
    public jyu(Context context, Looper looper, kqd kqdVar, kof kofVar, kpb kpbVar) {
        super(context, looper, 343, kqdVar, kofVar, kpbVar);
    }

    @Override // defpackage.kpz
    protected final boolean S() {
        return true;
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 234200000;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.aang.internal.IGoogleAuthAangService");
        return iInterfaceQueryLocalInterface instanceof jyw ? (jyw) iInterfaceQueryLocalInterface : new jyw(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.auth.aang.internal.IGoogleAuthAangService";
    }

    @Override // defpackage.kpz
    protected final String d() {
        return "com.google.android.gms.auth.aang.events.services.START";
    }

    @Override // defpackage.kpz
    public final boolean f() {
        return true;
    }

    @Override // defpackage.kpz
    public final klq[] g() {
        return new klq[]{new klq("google_auth_api", -1, 1L, false), jxo.c, jxo.d, jxo.a};
    }
}
