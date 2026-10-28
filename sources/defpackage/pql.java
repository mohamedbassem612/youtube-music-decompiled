package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pql {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public pql(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pql) {
            pql pqlVar = (pql) obj;
            if (this.a == pqlVar.a && this.b == pqlVar.b && this.c == pqlVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((a.aj(this.a) * 31) + a.aj(this.b)) * 31) + a.aj(this.c);
    }

    public final String toString() {
        return "DeliveryAddressCreationConfig(withRegistrationId=" + this.a + ", withFetchOnlyId=" + this.b + ", withAndroidId=" + this.c + ')';
    }

    public pql() {
        this(false, false, false);
    }
}
