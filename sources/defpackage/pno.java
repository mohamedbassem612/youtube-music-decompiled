package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pno {
    public static final pno a = a("Content-Encoding");
    public static final pno b;
    public static final pno c;
    public static final pno d;
    public static final pno e;
    public final String f;

    static {
        a("Content-Type");
        b = a("X-DFE-Device-Id");
        c = a("X-DFE-Debug-Overrides");
        d = a("X-Server-Timeout");
        e = a("X-Server-Token");
    }

    public pno(String str) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.f = str;
    }

    public static pno a(String str) {
        ahno.K(agdk.a.l(str), "Only ASCII characters are permitted in header keys: %s", str);
        return new pno(str.toLowerCase(Locale.US));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pno) {
            return this.f.equals(((pno) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "GnpHttpHeaderKey{key=" + this.f + '}';
    }

    public pno() {
        throw null;
    }
}
