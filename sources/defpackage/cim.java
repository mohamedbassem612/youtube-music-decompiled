package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cim {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public cim(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cim) {
            cim cimVar = (cim) obj;
            if (this.c == cimVar.c && this.d == cimVar.d && Objects.equals(this.a, cimVar.a) && Objects.equals(this.b, cimVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
