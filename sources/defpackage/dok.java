package defpackage;

import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dok {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[PHI: r4
      0x0061: PHI (r4v2 int) = (r4v1 int), (r4v1 int), (r4v1 int), (r4v3 int), (r4v3 int), (r4v3 int) binds: [B:6:0x002a, B:8:0x0032, B:10:0x003a, B:15:0x004d, B:17:0x0055, B:19:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    public dok(String str, String str2, boolean z, int i, String str3, int i2) {
        int i3;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        if (awrc.u(upperCase, "INT", false)) {
            i3 = 3;
        } else {
            int i4 = 2;
            if (awrc.u(upperCase, "CHAR", false) || awrc.u(upperCase, "CLOB", false) || awrc.u(upperCase, "TEXT", false)) {
                i3 = i4;
            } else if (awrc.u(upperCase, "BLOB", false)) {
                i3 = 5;
            } else {
                i4 = 4;
                if (awrc.u(upperCase, "REAL", false) || awrc.u(upperCase, "FLOA", false) || awrc.u(upperCase, "DOUB", false)) {
                    i3 = i4;
                } else {
                    i3 = 1;
                }
            }
        }
        this.g = i3;
    }

    public final boolean a() {
        return this.d > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dok) {
            dok dokVar = (dok) obj;
            if (a() == dokVar.a() && awrc.c(this.a, dokVar.a) && this.c == dokVar.c) {
                String str = this.e;
                String str2 = dokVar.e;
                int i = this.f;
                if ((i != 1 || dokVar.f != 2 || str == null || api.m(str, str2)) && ((i != 2 || dokVar.f != 1 || str2 == null || api.m(str2, str)) && ((i != dokVar.f || (str == null ? str2 == null : api.m(str, str2))) && this.g == dokVar.g))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return awrc.B(awrc.H(sb.toString()));
    }
}
