package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zuq {
    public final aigj a;
    public final long b;

    public zuq(aigj aigjVar, long j) {
        this.a = aigjVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zuq) {
            zuq zuqVar = (zuq) obj;
            if (awrc.c(this.a, zuqVar.a) && this.b == zuqVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.ak(this.b);
    }

    public final String toString() {
        return "Event(data=" + this.a + ", internalTimeStampEpoch=" + this.b + ')';
    }
}
