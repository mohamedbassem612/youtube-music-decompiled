package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ta {
    public final String a;
    public final int b;

    public ta(String str, int i) {
        aie.f(str);
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ta)) {
            ta taVar = (ta) obj;
            if (this.b == taVar.b && this.a.equals(taVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }

    public final String toString() {
        int i = this.b;
        String str = this.a;
        if (i == -1) {
            return str;
        }
        return str + '[' + i + ']';
    }
}
