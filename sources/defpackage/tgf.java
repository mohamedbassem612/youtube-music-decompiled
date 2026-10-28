package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class tgf {
    public final String a;
    public final tfz b;
    public final tgd c;
    public final int d;
    public final Optional e;
    public final int f;

    public tgf(int i, String str, tfz tfzVar, tgd tgdVar, Optional optional) {
        if (i == 0) {
            throw new NullPointerException("Null method");
        }
        this.f = i;
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.a = str;
        if (tfzVar == null) {
            throw new NullPointerException("Null headers");
        }
        this.b = tfzVar;
        this.c = tgdVar;
        this.d = 2;
        if (optional == null) {
            throw new NullPointerException("Null trafficTag");
        }
        this.e = optional;
    }

    public static tge a(String str) {
        tge tgeVar = new tge();
        tgeVar.a = 1;
        tgeVar.b = str;
        return tgeVar;
    }

    public static tge b(String str) {
        tge tgeVar = new tge();
        tgeVar.a = 2;
        tgeVar.b = str;
        tgeVar.d = tgc.a;
        return tgeVar;
    }

    public final boolean equals(Object obj) {
        tgd tgdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tgf) {
            tgf tgfVar = (tgf) obj;
            if (this.f == tgfVar.f && this.a.equals(tgfVar.a) && this.b.equals(tgfVar.b) && ((tgdVar = this.c) != null ? tgdVar.equals(tgfVar.c) : tgfVar.c == null) && this.d == tgfVar.d && this.e.equals(tgfVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.f ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode();
        tgd tgdVar = this.c;
        return (((((iHashCode * 1000003) ^ (tgdVar == null ? 0 : tgdVar.hashCode())) * 1000003) ^ this.d) * 583896283) ^ this.e.hashCode();
    }

    public final String toString() {
        String str;
        int i = this.f;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else if (i != 3) {
            str = i != 4 ? "HEAD" : "DELETE";
        } else {
            str = "PUT";
        }
        tfz tfzVar = this.b;
        tgd tgdVar = this.c;
        Optional optional = this.e;
        return "HttpRequest{method=" + str + ", url=" + this.a + ", headers=" + tfzVar.toString() + ", body=" + String.valueOf(tgdVar) + ", priority=" + this.d + ", readTimeoutMs=null, connectionTimeoutMs=null, trafficTag=" + optional.toString() + '}';
    }

    public tgf() {
        throw null;
    }
}
