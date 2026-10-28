package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class avcl {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public avcl(String str, String str2, String str3, String str4, Float f, Float f2, Float f3) {
        this.g = str;
        this.c = str2;
        this.f = str3;
        this.a = str4;
        this.e = f;
        this.d = f2;
        this.b = f3;
    }

    public final avcm a() {
        ahno.P(this.a != null, "Missing required scheme.");
        if (this.f == null) {
            ahno.P(this.g == null, "Cannot set port without host.");
            ahno.P(this.e == null, "Cannot set userInfo without host.");
        }
        return new avcm(this);
    }

    public final void b(String str) {
        if (str != null) {
            str = avcm.b(str.toLowerCase(Locale.ROOT), avcm.e);
        }
        this.f = str;
    }

    public final void c() {
        this.g = null;
    }

    public final void d(String str) {
        String strSubstring;
        int iIndexOf;
        if (str.startsWith("[") && str.endsWith("]") && (iIndexOf = str.indexOf(37)) > 0) {
            avcm.e(str.substring(iIndexOf, str.length() - 1), "scope", avcm.d, null);
        }
        int i = ahbg.a;
        str.getClass();
        int i2 = 4;
        if (str.startsWith("[") && str.endsWith("]")) {
            strSubstring = str.substring(1, str.length() - 1);
            i2 = 16;
        } else {
            strSubstring = str;
        }
        byte[] bArrC = ahbg.c(strSubstring, null);
        if (((bArrC == null || bArrC.length != i2) ? null : ahbg.a(bArrC, null)) == null) {
            avcm.e(str, "host", avcm.e, null);
        }
        this.f = str;
    }

    public final void e(String str) {
        if (!str.isEmpty()) {
            if (avcm.b.get(str.charAt(0))) {
                for (int i = 0; i < str.length(); i++) {
                    if (!avcm.c.get(str.charAt(i))) {
                        throw new IllegalArgumentException(a.bR(i, "Invalid character in scheme at index "));
                    }
                }
                this.a = str;
                return;
            }
        }
        throw new IllegalArgumentException("Scheme must start with an alphabetic char");
    }

    public final void f() {
        this.e = avcm.b(null, avcm.f);
    }

    public final boolean g(String str, String str2, String str3, String str4) {
        Object obj = this.g;
        if (obj != null && !((String) obj).equals(str)) {
            return false;
        }
        Object obj2 = this.c;
        if (obj2 != null && !((String) obj2).equals(str2)) {
            return false;
        }
        Object obj3 = this.f;
        if (obj3 != null && !((String) obj3).equals(str3)) {
            return false;
        }
        Object obj4 = this.a;
        return obj4 == null || ((String) obj4).equals(str4);
    }

    public avcl() {
        this.b = "";
    }

    public avcl(byte[] bArr) {
    }

    public avcl(String str, String str2, String str3, String str4, float f, float f2) {
        this(str, str2, str3, str4, Float.valueOf(f), Float.valueOf(f2), null);
    }
}
