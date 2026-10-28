package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class caz {
    public final String a;
    public final bse b;
    public final bse c;
    public final int d;
    public final int e;

    public caz(String str, bse bseVar, bse bseVar2, int i, int i2) {
        boolean z;
        if (i != 0) {
            z = false;
            if (i2 == 0) {
                i2 = 0;
                z = true;
            }
        } else {
            z = true;
        }
        ahno.F(z);
        ahno.F(!TextUtils.isEmpty(str));
        this.a = str;
        bseVar.getClass();
        this.b = bseVar;
        bseVar2.getClass();
        this.c = bseVar2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            caz cazVar = (caz) obj;
            if (this.d == cazVar.d && this.e == cazVar.e && this.a.equals(cazVar.a) && this.b.equals(cazVar.b) && this.c.equals(cazVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.d + 527) * 31) + this.e) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
