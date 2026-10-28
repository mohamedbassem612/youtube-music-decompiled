package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class eoe {
    public final Integer a;
    public final Long b;
    public final Boolean c;

    public eoe(zj zjVar) {
        this.a = (Integer) zjVar.b;
        this.b = (Long) zjVar.a;
        this.c = (Boolean) zjVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eoe) {
            eoe eoeVar = (eoe) obj;
            if (Objects.equals(this.a, eoeVar.a) && Objects.equals(this.b, eoeVar.b) && Objects.equals(this.c, eoeVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        return "BillingLoggerParams{billingApiVersion=" + this.a + ", billingClientTransactionId=" + this.b + ", wasServiceAutoReconnected=" + this.c + '}';
    }
}
