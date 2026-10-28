package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zvx implements Runnable {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/net/identity/GoogleSsoAuthTokenTask");
    public final twi b;
    public boolean c = false;
    private final Activity d;
    private final Account e;
    private final String f;

    public zvx(Activity activity, Account account, String str, twi twiVar) {
        this.d = activity;
        this.e = account;
        this.f = str;
        this.b = twiVar;
    }

    public static avlm a(final Activity activity, final Account account, String str) {
        final AccountManager accountManager = AccountManager.get(activity);
        final String strConcat = "weblogin:continue=".concat(String.valueOf(Uri.encode(str)));
        avye avyeVar = new avye(new avlo() { // from class: zvw
            @Override // defpackage.avlo
            public final void a(avyd avydVar) {
                taq.c();
                Activity activity2 = activity;
                AccountManagerFuture<Bundle> authToken = accountManager.getAuthToken(account, strConcat, (Bundle) null, activity2, (AccountManagerCallback<Bundle>) null, (Handler) null);
                avnr.i(avydVar, new avml(new vtu(authToken, 10)));
                avydVar.c(authToken.getResult());
            }
        });
        avnn avnnVar = atqp.n;
        int i = 4;
        avyh avyhVar = new avyh(avyeVar.j(new xuk(i)).r(new xdx(12)).n(new yqz(i)).i(new hrj(11)).k(new xuk(5)), new mnt(accountManager, account, 16, null));
        avnn avnnVar2 = atqp.n;
        return avyhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = this.d;
        String str = (String) a(activity, this.e, this.f).E();
        if (this.c || TextUtils.isEmpty(str)) {
            return;
        }
        activity.runOnUiThread(new zgc((Object) this, (Object) str, 11));
    }
}
