package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import com.google.android.gms.auth.TokenData;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class qbt implements Runnable {
    public final jya a;
    public final qcb b;
    private final Activity c;
    private final Account d;
    private final String e;
    private final Runnable f;
    private Runnable g;

    public qbt(Activity activity, Account account, String str, qcb qcbVar, Runnable runnable, jya jyaVar) {
        this.c = activity;
        this.d = account;
        this.e = str;
        this.b = qcbVar;
        this.f = runnable;
        this.a = jyaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lpa lpaVarL;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot get auth token on the UI thread");
        }
        CookieManager cookieManager = CookieManager.getInstance();
        String str = null;
        if (cookieManager != null) {
            cookieManager.removeAllCookies(null);
            cookieManager.flush();
        }
        try {
            String strConcat = "weblogin:continue=".concat(String.valueOf(Uri.encode(this.e)));
            jya jyaVar = this.a;
            try {
                lpaVarL = mda.m(((kjc) jyaVar.b.io()).i(jyaVar.a, this.d, strConcat, new Bundle()));
            } catch (IOException | jxr e) {
                lpaVarL = mda.l(e);
            }
            String str2 = ((TokenData) mda.n(lpaVarL)).b;
            if (TextUtils.isEmpty(str2)) {
                Log.w("ParentToolsAuthTask", "Could not retrieve a non-empty authToken");
            }
            this.g = new plj(this, str2, 3);
            str = str2;
        } catch (Throwable th) {
            Log.e("ParentToolsAuthTask", "An error happened when getting authToken.", th);
        }
        if (TextUtils.isEmpty(str)) {
            this.f.run();
            return;
        }
        this.c.runOnUiThread(new plj(this, str, 4));
        Runnable runnable = this.g;
        if (runnable != null) {
            runnable.run();
        }
    }
}
