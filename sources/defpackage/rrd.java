package defpackage;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Bundle;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class rrd implements AccountManagerCallback {
    private final sdo a;

    public rrd(sdo sdoVar) {
        this.a = sdoVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zwb] */
    @Override // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture accountManagerFuture) {
        String string;
        if (accountManagerFuture.isDone()) {
            try {
                Bundle bundle = (Bundle) accountManagerFuture.getResult();
                if (bundle == null || (string = bundle.getString("authAccount")) == null) {
                    return;
                }
                sdo sdoVar = this.a;
                ?? r0 = sdoVar.b;
                rmp.a(r0 == 0 ? zvz.a : r0.e(), (wnw) sdoVar.a, string, new rqi(sdoVar));
            } catch (AuthenticatorException | OperationCanceledException | IOException unused) {
            }
        }
    }
}
