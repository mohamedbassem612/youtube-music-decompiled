package defpackage;

import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class agrn extends agro {
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private int f = 0;

    public agrn(String str, String str2, int i, String str3) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
    }

    @Override // defpackage.agro
    public final int a() {
        return this.d;
    }

    @Override // defpackage.agro
    public final String b() {
        return this.b.replace('/', '.');
    }

    @Override // defpackage.agro
    public final String c() {
        String str = this.e;
        if (str == null) {
            return null;
        }
        return str.substring(str.lastIndexOf(File.separatorChar) + 1);
    }

    @Override // defpackage.agro
    public final String d() {
        return this.c;
    }

    @Override // defpackage.agro
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof agrn)) {
            return false;
        }
        agrn agrnVar = (agrn) obj;
        if (!this.c.equals(agrnVar.c) || this.d != agrnVar.d) {
            return false;
        }
        String str = this.b;
        String str2 = agrnVar.b;
        if (str != str2) {
            if (str.length() != str2.length()) {
                return false;
            }
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                char cCharAt2 = str2.charAt(i);
                if (cCharAt != cCharAt2 && ((cCharAt & (-2)) != 46 || (cCharAt ^ cCharAt2) != 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((this.c.hashCode() + 4867) * 31) + this.d;
        this.f = iHashCode;
        return iHashCode;
    }
}
