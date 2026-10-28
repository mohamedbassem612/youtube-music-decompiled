package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class twe {
    public final int a;
    public final long b;

    public twe(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof twe) {
            twe tweVar = (twe) obj;
            if (this.a == tweVar.a && this.b == tweVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((this.a ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "BatteryCurrentSample{batteryCurrentMa=" + this.a + ", elapsedMs=" + this.b + '}';
    }

    public twe() {
        throw null;
    }
}
