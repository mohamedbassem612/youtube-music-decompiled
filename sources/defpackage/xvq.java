package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xvq implements xtq {
    public final dii a;
    public final boolean b;
    public final String c;
    public final String d;
    private final String e;

    public xvq(dii diiVar, boolean z, String str) {
        this.a = diiVar;
        this.b = z;
        this.c = diiVar.e;
        this.d = str;
        this.e = diiVar.f;
    }

    public static afha o() {
        afha afhaVar = new afha();
        afhaVar.f(true);
        afhaVar.e("");
        return afhaVar;
    }

    public final int a() {
        return this.a.o;
    }

    public final int b(ydu yduVar) {
        return yduVar.a(c());
    }

    public final String c() {
        return xrx.a(this.a);
    }

    public final String d() {
        return ahno.Z(this.e);
    }

    public final String e() {
        return this.a.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xvq) {
            xvq xvqVar = (xvq) obj;
            if (e().equals(xvqVar.e()) && this.c.equals(xvqVar.c) && d().equals(xvqVar.d()) && this.d.equals(xvqVar.d) && this.b == xvqVar.b) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i) {
        this.a.g(i);
    }

    public final boolean g(ydu yduVar) {
        return b(yduVar) > 0;
    }

    public final boolean h() {
        return !TextUtils.isEmpty(this.d);
    }

    public final int hashCode() {
        return Objects.hash(e(), Boolean.valueOf(this.b), Boolean.valueOf(i()), Boolean.valueOf(k()), this.c, Integer.valueOf(a()), d());
    }

    public final boolean i() {
        return xrx.f(this.a);
    }

    public final boolean j() {
        return this.a.j == 2;
    }

    public final boolean k() {
        return this.a.k();
    }

    public final boolean l() {
        return k() || i();
    }

    public final boolean m() {
        return !TextUtils.isEmpty(d()) && d().toLowerCase(Locale.getDefault()).contains("youtube");
    }

    public final boolean n() {
        String str = this.e;
        if (str != null && str.toLowerCase(Locale.ROOT).contains("group")) {
            return true;
        }
        try {
            String string = this.a.toString();
            int iIndexOf = string.indexOf("members");
            if (iIndexOf != -1) {
                String strSubstring = string.substring(iIndexOf);
                if (!TextUtils.isEmpty(strSubstring.substring(strSubstring.indexOf("[") + 1, strSubstring.indexOf("]")))) {
                    return true;
                }
            }
        } catch (StringIndexOutOfBoundsException unused) {
        }
        return false;
    }

    public final String toString() {
        return this.a.toString();
    }
}
