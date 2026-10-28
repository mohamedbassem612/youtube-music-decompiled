package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class rre {
    public static final Set a;
    public static final Set b;
    public static final String c;
    private static final String h;
    protected final AccountManager d;
    public final Context e;
    public final String f;
    public final omj g;
    private final Object i = new Object();
    private volatile long j = 0;
    private Account[] k = null;
    private Throwable l = null;
    private final tqj m;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("https://www.googleapis.com/auth/youtube");
        hashSet.add("https://www.googleapis.com/auth/youtube.force-ssl");
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        a = setUnmodifiableSet;
        HashSet hashSet2 = new HashSet(setUnmodifiableSet);
        hashSet2.add("https://www.googleapis.com/auth/identity.lateimpersonation");
        b = DesugarCollections.unmodifiableSet(hashSet2);
        int i = lsw.a;
        h = "service_uca";
        c = "service_hgp";
    }

    public rre(AccountManager accountManager, omj omjVar, Set set, Context context, tqj tqjVar) {
        this.d = accountManager;
        this.g = omjVar;
        this.f = "oauth2:".concat(String.valueOf(TextUtils.join(" ", set)));
        this.e = context;
        this.m = tqjVar;
    }

    public static Account a(String str, Account[] accountArr) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (Account account : accountArr) {
            if (TextUtils.equals(account.name, str)) {
                return account;
            }
        }
        return null;
    }

    private static void g(Throwable th) throws kmk, kmj, RemoteException {
        if (th instanceof kmj) {
            throw ((kmj) th);
        }
        if (th instanceof kmk) {
            throw ((kmk) th);
        }
        if (th instanceof RemoteException) {
            throw ((RemoteException) th);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (!(th instanceof Error)) {
            throw new IllegalStateException(th);
        }
        throw ((Error) th);
    }

    public final Account b(String str) {
        return a(str, d());
    }

    public final boolean c() {
        try {
            for (Account account : d()) {
                omj omjVar = this.g;
                if (a(account.name, omjVar.E(new String[]{h})) != null) {
                    return true;
                }
                if (a(account.name, omjVar.E(new String[]{c})) != null) {
                    return true;
                }
            }
            return false;
        } catch (IOException | jxr | Exception unused) {
            return true;
        }
    }

    public final Account[] d() {
        Account[] accountArrD;
        tqj tqjVar = this.m;
        if (tqjVar != null) {
            int i = tqr.a;
            if (tqjVar.k(1073830491)) {
                long j = this.j;
                synchronized (this.i) {
                    if (this.j != j) {
                        Throwable th = this.l;
                        if (th != null) {
                            g(th);
                        }
                        Account[] accountArr = this.k;
                        return accountArr != null ? (Account[]) accountArr.clone() : new Account[0];
                    }
                    Throwable th2 = null;
                    try {
                        accountArrD = this.g.D();
                        this.k = accountArrD;
                        this.l = null;
                        this.j++;
                    } catch (Throwable th3) {
                        this.k = null;
                        this.l = th3;
                        this.j++;
                        accountArrD = null;
                        th2 = th3;
                    }
                    if (th2 != null) {
                        g(th2);
                    }
                    return accountArrD != null ? (Account[]) accountArrD.clone() : new Account[0];
                }
            }
        }
        return this.g.D();
    }

    @Deprecated
    public final Account[] e() {
        try {
            return d();
        } catch (RemoteException | kmj | kmk unused) {
            return new Account[0];
        }
    }

    public final void f(Activity activity, sdo sdoVar) {
        activity.getClass();
        this.d.addAccount("com.google", null, null, null, activity, new rrd(sdoVar), null);
    }
}
