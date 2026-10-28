package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jzf extends kqs {
    private final Bundle a;

    public jzf(Context context, Looper looper, kqd kqdVar, jze jzeVar, kof kofVar, kpb kpbVar) {
        super(context, looper, 16, kqdVar, kofVar, kpbVar);
        this.a = jzeVar == null ? new Bundle() : new Bundle(jzeVar.a);
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof jzh ? (jzh) iInterfaceQueryLocalInterface : new jzh(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // defpackage.kpz
    protected final String d() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // defpackage.kpz
    public final boolean f() {
        return true;
    }

    @Override // defpackage.kpz
    protected final Bundle h() {
        return this.a;
    }

    @Override // defpackage.kpz, defpackage.kmt
    public final boolean i() {
        kqd kqdVar = this.H;
        Account account = kqdVar.a;
        if (!TextUtils.isEmpty(account != null ? account.name : null)) {
            if (((elq) kqdVar.d.get(jzd.a)) != null) {
                throw null;
            }
            if (!kqdVar.b.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
