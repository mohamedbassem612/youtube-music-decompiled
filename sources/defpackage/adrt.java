package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adrt extends acfz {
    public final aqhs a;

    public adrt(aqhs aqhsVar) {
        this.a = aqhsVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof adrt) && awrc.c(this.a, ((adrt) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        aqhs aqhsVar = this.a;
        if (aqhsVar == null) {
            return 0;
        }
        return aqhsVar.hashCode();
    }

    public final String toString() {
        return "Fetch(triggerConfig=" + this.a + ')';
    }
}
