package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class bsg {
    public final String a;
    public final String b;

    static {
        int i = bwp.a;
    }

    public bsg(String str, String str2) {
        this.a = bwp.R(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bsg bsgVar = (bsg) obj;
            if (Objects.equals(this.a, bsgVar.a) && Objects.equals(this.b, bsgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "{ lang=" + this.a + ", '" + this.b + "' }";
    }
}
