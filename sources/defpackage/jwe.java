package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jwe extends kpz {
    private final int a;

    public jwe(Context context, Looper looper, kpq kpqVar, kpr kprVar, int i) {
        super(context, looper, 116, kpqVar, kprVar);
        this.a = i;
    }

    @Override // defpackage.kpz, defpackage.kmt
    public final int a() {
        return this.a;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof kwp ? (kwp) iInterfaceQueryLocalInterface : new kwp(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // defpackage.kpz
    protected final String d() {
        return "com.google.android.gms.gass.START";
    }

    public final kwp e() {
        return (kwp) super.C();
    }
}
