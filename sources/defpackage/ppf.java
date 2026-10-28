package defpackage;

import android.accounts.Account;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class ppf {
    public final Account a;
    public final String b;

    public ppf(Account account, String str) {
        str.getClass();
        this.a = account;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ppf) {
            ppf ppfVar = (ppf) obj;
            if (awrc.c(this.a, ppfVar.a) && awrc.c(this.b, ppfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AccountAndScope(account=" + this.a + ", scope=" + this.b + ')';
    }
}
