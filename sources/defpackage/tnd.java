package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tnd {
    public final String a;
    public final String b;

    public tnd(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            tnd tndVar = (tnd) obj;
            if (TextUtils.equals(this.a, tndVar.a) && TextUtils.equals(this.b, tndVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.a + ",value=" + this.b + ']';
    }
}
