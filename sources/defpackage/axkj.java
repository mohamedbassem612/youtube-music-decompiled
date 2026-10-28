package defpackage;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import internal.J.N;
import java.io.IOException;
import java.util.Locale;
import org.chromium.base.JniAndroid;
import org.chromium.base.ThreadUtils;
import org.chromium.net.HttpNegotiateAuthenticator;
import org.chromium.net.NetError;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class axkj implements AccountManagerCallback {
    private final /* synthetic */ int $cid;
    public final axkk a;
    final /* synthetic */ HttpNegotiateAuthenticator b;

    public axkj(HttpNegotiateAuthenticator httpNegotiateAuthenticator, axkk axkkVar, int i) {
        this.$cid = i;
        this.b = httpNegotiateAuthenticator;
        this.a = axkkVar;
    }

    @Override // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture accountManagerFuture) {
        if (this.$cid == 0) {
            try {
                Bundle bundle = (Bundle) accountManagerFuture.getResult();
                if (!bundle.containsKey("intent")) {
                    this.b.processResult(bundle, this.a);
                    return;
                } else {
                    Context context = JniAndroid.a;
                    context.registerReceiver(new axki(this, context), new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"), null, null, 0);
                    return;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                Log.w("cn_net_auth", "ERR_UNEXPECTED: Error while attempting to obtain a token.", e);
                N.M0s8NeYn(this.a.a, -9, null);
                return;
            }
        }
        try {
            Account[] accountArr = (Account[]) accountManagerFuture.getResult();
            int length = accountArr.length;
            if (length == 0) {
                Log.w("cn_net_auth", "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ");
                N.M0s8NeYn(this.a.a, NetError.ERR_MISSING_AUTH_CREDENTIALS, null);
                return;
            }
            if (length > 1) {
                Log.w("cn_net_auth", String.format(Locale.US, "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", Integer.valueOf(length)));
                N.M0s8NeYn(this.a.a, NetError.ERR_MISSING_AUTH_CREDENTIALS, null);
                return;
            }
            HttpNegotiateAuthenticator httpNegotiateAuthenticator = this.b;
            if (httpNegotiateAuthenticator.lacksPermission(JniAndroid.a, "android.permission.USE_CREDENTIALS", true)) {
                Log.e("cn_net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.");
                N.M0s8NeYn(this.a.a, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
            } else {
                axkk axkkVar = this.a;
                axkkVar.e = accountArr[0];
                axkkVar.b.getAuthToken(axkkVar.e, axkkVar.d, axkkVar.c, true, (AccountManagerCallback<Bundle>) new axkj(httpNegotiateAuthenticator, axkkVar, 0), new Handler(ThreadUtils.b()));
            }
        } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
            Log.w("cn_net_auth", "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e2);
            N.M0s8NeYn(this.a.a, -9, null);
        }
    }
}
