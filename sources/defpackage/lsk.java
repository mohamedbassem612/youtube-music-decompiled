package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class lsk extends kqs {
    public final Context a;
    public final int b;
    public final String c;
    public final int d;
    public final boolean e;
    public final String f;

    public lsk(Context context, Looper looper, kqd kqdVar, kna knaVar, knb knbVar, int i, String str) {
        super(context, looper, 4, kqdVar, knaVar, knbVar);
        this.a = context;
        this.b = i;
        Account account = kqdVar.a;
        this.c = account != null ? account.name : null;
        this.d = 1;
        this.e = true;
        this.f = str;
    }

    @Override // defpackage.kpz
    public final boolean M() {
        return true;
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 12600000;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return iInterfaceQueryLocalInterface instanceof lsh ? (lsh) iInterfaceQueryLocalInterface : new lsh(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // defpackage.kpz
    protected final String d() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    @Override // defpackage.kpz
    public final boolean f() {
        return true;
    }

    @Override // defpackage.kpz
    public final klq[] g() {
        return lrb.j;
    }
}
