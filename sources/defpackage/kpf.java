package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class kpf extends log implements kna, knb {
    private static final kro h = loc.b;
    public final Context a;
    public final Handler b;
    public final Set c;
    public final kqd d;
    public loj e;
    public kon f;
    public final kro g;

    public kpf(Context context, Handler handler, kqd kqdVar) {
        kro kroVar = h;
        this.a = context;
        this.b = handler;
        this.d = kqdVar;
        this.c = kqdVar.b;
        this.g = kroVar;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0137  */
    @Override // defpackage.kof
    public final void a(Bundle bundle) {
        GoogleSignInAccount googleSignInAccount;
        loj lojVar = this.e;
        try {
            Account account = lojVar.a.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            if ("<<default account>>".equals(account.name)) {
                Context context = lojVar.p;
                jzk.a.lock();
                try {
                    if (jzk.b == null) {
                        jzk.b = new jzk(context.getApplicationContext());
                    }
                    jzk jzkVar = jzk.b;
                    jzk.a.unlock();
                    String strA = jzkVar.a("defaultGoogleSignInAccount");
                    if (TextUtils.isEmpty(strA)) {
                        googleSignInAccount = null;
                    } else {
                        String strA2 = jzkVar.a("googleSignInAccount:" + strA);
                        if (strA2 != null) {
                            try {
                                if (TextUtils.isEmpty(strA2)) {
                                    googleSignInAccount = null;
                                } else {
                                    JSONObject jSONObject = new JSONObject(strA2);
                                    String strOptString = jSONObject.optString("photoUrl");
                                    Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
                                    long j = Long.parseLong(jSONObject.getString("expirationTime"));
                                    HashSet hashSet = new HashSet();
                                    JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
                                    int i = 0;
                                    for (int length = jSONArray.length(); i < length; length = length) {
                                        hashSet.add(new Scope(1, jSONArray.getString(i)));
                                        i++;
                                    }
                                    String strOptString2 = jSONObject.optString("id");
                                    String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
                                    String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
                                    String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
                                    String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
                                    String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
                                    Long lValueOf = Long.valueOf(j);
                                    String string = jSONObject.getString("obfuscatedIdentifier");
                                    lValueOf.getClass();
                                    kro.i(string);
                                    googleSignInAccount = new GoogleSignInAccount(strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
                                    googleSignInAccount.f = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
                                }
                            } catch (JSONException unused) {
                            }
                        } else {
                            googleSignInAccount = null;
                        }
                    }
                } catch (Throwable th) {
                    jzk.a.unlock();
                    throw th;
                }
            } else {
                googleSignInAccount = null;
            }
            Integer num = lojVar.b;
            kro.l(num);
            krq krqVar = new krq(2, account, num.intValue(), googleSignInAccount);
            loh lohVar = (loh) lojVar.C();
            lok lokVar = new lok(1, krqVar);
            Parcel parcelC = lohVar.c();
            gdc.c(parcelC, lokVar);
            gdc.e(parcelC, this);
            lohVar.e(12, parcelC);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                c(new lol(1, new klo(1, 8, null, null, null, null), null));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // defpackage.kof
    public final void b(int i) {
        kon konVar = this.f;
        kol kolVar = (kol) konVar.e.k.get(konVar.b);
        if (kolVar != null) {
            if (kolVar.h) {
                kolVar.l(new klo(1, 17, null, null, null, null));
            } else {
                kolVar.b(i);
            }
        }
    }

    @Override // defpackage.log
    public final void c(lol lolVar) {
        this.b.post(new jmi(this, lolVar, 12));
    }

    @Override // defpackage.kpb
    public final void i(klo kloVar) {
        this.f.b(kloVar);
    }
}
