package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ccy {
    public final long a;
    public final float b;
    public final long c;

    public ccy(ccx ccxVar) {
        this.a = ccxVar.a;
        this.b = ccxVar.b;
        this.c = ccxVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ccy) {
            ccy ccyVar = (ccy) obj;
            if (this.a == ccyVar.a && this.b == ccyVar.b && this.c == ccyVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
