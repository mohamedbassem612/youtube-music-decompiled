package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class rly implements zwm {
    private final Context a;
    private final hxh b;
    private final omj c;

    protected rly(omj omjVar, Context context, hxh hxhVar) {
        this.c = omjVar;
        this.a = context;
        this.b = hxhVar;
    }

    public static Bundle c(rlt rltVar) {
        boolean z = rltVar.f;
        if (!z && rltVar.l != 3) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("delegatee_user_id", rltVar.a);
        if (z) {
            bundle.putInt(rmp.DELEGATION_TYPE, 1);
        }
        if (rltVar.h || rltVar.i) {
            bundle.putInt(rmp.DELEGATION_TYPE, 3);
        }
        return bundle;
    }

    private final zwk i(UserRecoverableAuthException userRecoverableAuthException) {
        Intent intent;
        Intent intent2 = userRecoverableAuthException.b;
        if (intent2 == null) {
            int i = userRecoverableAuthException.c;
            if (i == 0) {
                throw null;
            }
            int i2 = i - 1;
            if (i2 == 0) {
                Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
            } else if (i2 == 1) {
                Log.e("Auth", "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.");
            }
            intent = null;
        } else {
            intent = new Intent(intent2);
        }
        intent.getClass();
        omj omjVar = this.c;
        if (omjVar != null) {
            ((tbt) omjVar.a).c(new zwl(intent, userRecoverableAuthException));
        }
        return this.b.c(null, intent, null, false);
    }

    @Override // defpackage.zwm
    public /* bridge */ /* synthetic */ zwk a(zwa zwaVar) {
        throw null;
    }

    @Override // defpackage.zwm
    public /* bridge */ /* synthetic */ void b(zwa zwaVar) {
        throw null;
    }

    public abstract zwk d(rlt rltVar);

    public final synchronized zwk e(Account account, Bundle bundle, boolean z, aerv aervVar, boolean z2, String str) {
        String strF;
        boolean z3 = z2 && aervVar != null;
        boolean z4 = bundle != null;
        try {
            try {
                strF = f(account, bundle);
                if (z3) {
                    ((qtf) aervVar.f.io()).b(1L, Boolean.valueOf(z4), str);
                }
            } catch (UserRecoverableAuthException e) {
                if (z) {
                    zvp.e(zvn.b, zvm.I, "GMScore OAuth Token fetching API Exception", e);
                }
                if (z3) {
                    aervVar.a("USER_RECOVERABLE_ERROR", z4, str);
                }
                return i(e);
            } catch (IOException e2) {
                if (z) {
                    zvp.e(zvn.b, zvm.I, "GMScore OAuth Token fetching API Exception", e2);
                }
                if (z3) {
                    aervVar.a("NETWORK_SERVER_ERROR", z4, str);
                }
                return this.b.c(null, null, e2, true);
            }
        } catch (jyb e3) {
            if (z) {
                zvp.e(zvn.b, zvm.I, "GMScore OAuth Token fetching API Exception", e3);
            }
            klt.a.j(this.a, e3.a);
            if (z3) {
                aervVar.a("AUTH_SERVER_AVAILABILITY_ERROR", z4, str);
            }
            return i(e3);
        } catch (jxr e4) {
            if (z) {
                zvp.e(zvn.b, zvm.I, "GMScore OAuth Token fetching API Exception", e4);
            }
            if (z3) {
                aervVar.a("AUTHORIZATION_ERROR", z4, str);
            }
            return this.b.c(null, null, e4, false);
        }
        return this.b.b(strF);
    }

    public abstract String f(Account account, Bundle bundle);

    public abstract void g(rlt rltVar);

    public abstract void h(Iterable iterable);
}
