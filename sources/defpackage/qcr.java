package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qcr {
    public final ahey a;
    public final int b;
    public final int c;
    public final boolean d;

    public qcr(ahey aheyVar, int i, int i2, boolean z) {
        this.a = aheyVar;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public static aano a() {
        aano aanoVar = new aano();
        aanoVar.d = 11;
        aanoVar.c = 2;
        aanoVar.a = true;
        aanoVar.b = (byte) 7;
        return aanoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qcr) {
            qcr qcrVar = (qcr) obj;
            ahey aheyVar = this.a;
            if (aheyVar != null ? aheyVar.equals(qcrVar.a) : qcrVar.a == null) {
                if (this.b == qcrVar.b && this.c == qcrVar.c && this.d == qcrVar.d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        ahey aheyVar = this.a;
        int iHashCode = aheyVar == null ? 0 : aheyVar.hashCode();
        int i = this.b;
        return ((((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.c) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        return "PrimesThreadsConfigurations{primesExecutorService=" + String.valueOf(this.a) + ", primesMetricExecutorPriority=" + this.b + ", primesMetricExecutorPoolSize=" + this.c + ", enableDeferredTasks=" + this.d + '}';
    }

    public qcr() {
        throw null;
    }
}
