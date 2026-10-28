package defpackage;

import android.accounts.Account;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qpo {
    public static final Account a = new Account("shared", "mobstore");

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    public static Account a(String str) {
        if ("shared".equals(str)) {
            return a;
        }
        int iIndexOf = str.indexOf(58);
        rmp.D((iIndexOf ^ (-1)) >>> 31, "Malformed account", new Object[0]);
        return new Account(str.substring(iIndexOf + 1), str.substring(0, iIndexOf));
    }

    public static String b(Account account) {
        rmp.D(account.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        rmp.D(account.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        rmp.D(account.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (a.equals(account)) {
            return "shared";
        }
        return account.type + ':' + account.name;
    }
}
