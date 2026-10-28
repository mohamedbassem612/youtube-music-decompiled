package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.util.Pair;
import j$.util.Optional;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class zwk {
    public static final Pattern a = Pattern.compile("^(?:.*\\.)?(google.com|googleapis.com|youtube.com|googleusercontent.com)$", 2);
    public final boolean b;
    private final String c;
    private final Intent d;
    private final Exception e;
    private final tqj f;
    private final awmd g;

    public zwk(String str, Intent intent, Exception exc, boolean z, tqj tqjVar, awmd awmdVar) {
        this.c = str;
        this.d = intent;
        this.e = exc;
        this.b = z;
        this.f = tqjVar;
        this.g = awmdVar;
    }

    private final void g(int i, String str) {
        zvl zvlVar = (zvl) this.g.io();
        zvj zvjVarA = zvk.a();
        zvjVarA.c(ajtv.ERROR_LEVEL_ERROR);
        zvjVarA.i = i;
        zvjVarA.d(str);
        zvlVar.a(zvjVarA.a());
    }

    public final Intent a() {
        if (f()) {
            throw new IllegalStateException("Cannot call getRecoveryIntent() on a successful fetch.");
        }
        if (e()) {
            return this.d;
        }
        throw new IllegalStateException("Cannot call getRecoveryIntent() on an unrecoverable fetch.");
    }

    public final Optional b(String str) {
        Optional optionalOf;
        int i = tqr.a;
        tqj tqjVar = this.f;
        if (!tqjVar.k(1073814460)) {
            if (f()) {
                return Optional.of(Pair.create("Authorization", "Bearer ".concat(String.valueOf(this.c))));
            }
            throw new IllegalStateException("Cannot call getAuthenticationHeaderInfo on an unsuccessful fetch.");
        }
        if (!tqjVar.k(1073814460)) {
            optionalOf = Optional.of(d());
        } else {
            if (!f()) {
                throw new IllegalStateException("Cannot call getValue on an unsuccessful fetch.");
            }
            Uri uri = Uri.parse(str);
            int i2 = tyu.a;
            uri.getClass();
            if ("https".equalsIgnoreCase(uri.getScheme())) {
                String host = uri.getHost();
                if (ahno.aa(host)) {
                    g(222, "No host: ".concat(String.valueOf(str)));
                    optionalOf = Optional.empty();
                } else if (a.matcher(host).find()) {
                    optionalOf = Optional.of(this.c);
                } else {
                    g(221, "Non allowlisted domain: ".concat(String.valueOf(host)));
                    optionalOf = Optional.empty();
                }
            } else {
                optionalOf = Optional.empty();
            }
        }
        return optionalOf.isEmpty() ? Optional.empty() : Optional.of(Pair.create("Authorization", "Bearer ".concat((String) optionalOf.get())));
    }

    public final Exception c() {
        Exception exc = this.e;
        if (exc != null) {
            return exc;
        }
        throw new IllegalStateException("Cannot call getException() on a successful or recoverable fetch.");
    }

    public final String d() {
        if (f()) {
            return this.c;
        }
        throw new IllegalStateException("Cannot call getValue on an unsuccessful fetch.");
    }

    public final boolean e() {
        return this.d != null;
    }

    public final boolean f() {
        return this.c != null;
    }
}
