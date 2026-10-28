package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class loj extends kqs implements kmt {
    public final kqd a;
    public final Integer b;
    private final boolean c;
    private final Bundle d;

    public loj(Context context, Looper looper, kqd kqdVar, Bundle bundle, kna knaVar, knb knbVar) {
        super(context, looper, 44, kqdVar, knaVar, knbVar);
        this.c = true;
        this.a = kqdVar;
        this.d = bundle;
        this.b = kqdVar.h;
    }

    @Override // defpackage.kqs, defpackage.kpz, defpackage.kmt
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.kpz
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof loh ? (loh) iInterfaceQueryLocalInterface : new loh(iBinder);
    }

    @Override // defpackage.kpz
    protected final String c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.kpz
    protected final String d() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.kpz
    protected final Bundle h() {
        kqd kqdVar = this.a;
        String packageName = this.p.getPackageName();
        String str = kqdVar.e;
        if (!packageName.equals(str)) {
            this.d.putString("com.google.android.gms.signin.internal.realClientPackageName", str);
        }
        return this.d;
    }

    @Override // defpackage.kpz, defpackage.kmt
    public final boolean i() {
        return this.c;
    }
}
