package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class clx {
    public final String a;
    public final boolean b;
    public final boolean c;

    public clx(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == clx.class) {
            clx clxVar = (clx) obj;
            if (TextUtils.equals(this.a, clxVar.a) && this.b == clxVar.b && this.c == clxVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 31) * 31) + (true != this.b ? 1237 : 1231)) * 31) + (true == this.c ? 1231 : 1237);
    }
}
