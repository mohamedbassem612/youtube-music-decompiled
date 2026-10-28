package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class lrq {
    public final Intent a;
    protected final Bundle b;
    private final boolean c;
    private final qcb d;
    private final qcb e;

    public lrq(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent();
        this.a = intent;
        intent.setPackage("com.google.android.gms");
        intent.setAction(str);
        Bundle bundle = new Bundle();
        this.b = bundle;
        qcb qcbVar = new qcb(new lsm());
        ((lsm) qcbVar.a).c = bundle;
        this.e = qcbVar;
        qcb qcbVar2 = new qcb(new BuyFlowConfig());
        String packageName = context.getPackageName();
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) qcbVar2.a;
        buyFlowConfig.c = packageName;
        buyFlowConfig.d = str2;
        this.d = qcbVar2;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.os.Parcelable, java.lang.Object] */
    public final Intent a() {
        lsm lsmVar = (lsm) this.e.a;
        ?? r1 = this.d.a;
        BuyFlowConfig buyFlowConfig = (BuyFlowConfig) r1;
        buyFlowConfig.b = lsmVar;
        if (buyFlowConfig.a == null) {
            buyFlowConfig.a = UUID.randomUUID().toString();
        }
        Intent intent = this.a;
        intent.putExtra("com.google.android.gms.wallet.buyFlowConfig", (Parcelable) r1);
        if (this.c) {
            Account account = buyFlowConfig.b.b;
            kro.m(account, "Buyer account is required");
            intent.putExtra("com.google.android.gms.wallet.account", account);
        }
        if (intent.getLongExtra("com.google.android.gms.wallet.intentBuildTimeMs", 0L) == 0) {
            intent.putExtra("com.google.android.gms.wallet.intentBuildTimeMs", SystemClock.elapsedRealtime());
        }
        f();
        return intent;
    }

    public final void b(Account account) {
        ((lsm) this.e.a).b = account;
    }

    public final void c(lrx lrxVar) {
        ((lsm) this.e.a).f = lrxVar;
    }

    public final void d(int i) {
        ((lsm) this.e.a).a = i;
    }

    public final void e() {
        ((lsm) this.e.a).e = 1;
    }

    protected void f() {
        throw null;
    }
}
